package maxim.zaks.generator

import maxim.zaks.flatBuffers.Schema
import maxim.zaks.flatBuffers.Table
import maxim.zaks.flatBuffers.Type
import maxim.zaks.flatBuffers.Enum
import maxim.zaks.flatBuffers.Struct
import maxim.zaks.flatBuffers.StructFields
import maxim.zaks.flatBuffers.Union
import org.eclipse.emf.common.util.EList
import maxim.zaks.flatBuffers.Fields
import java.util.ArrayList
import maxim.zaks.flatBuffers.Definition

class EagerSwiftGenerator {
	
	String rootTableName
	
	def generate(Schema schema){
		rootTableName = schema.rootType.type.name
		val unions = schema.definitions.filter[it instanceof Union]
		'''
		
		// generated with FlatBuffersSchemaEditor https://github.com/mzaks/FlatBuffersSchemaEditor
		
		«FOR definition : schema.definitions»
		«definition.generateMainDefinition»
		«ENDFOR»
		«FOR union : unions»
		«(union as Union).generateAllForUnion»
		«ENDFOR»
		'''
	}
	
	def generateMainDefinition(Definition definition){
		switch definition {
			Table case definition: definition.generateAllForTable
			Enum case definition: definition.generateMainEnumForEnum
			Struct case definition: definition.generateMainStructForStruct
			// TableName.LazyAccess class is only accesable by code which comes after it. Seems like a Bug in Swift Compiler
			// This is why we ignore Union case here and has a seconf for loop in generate method
			Union case definition: ''''''
			default : '''/* unexpected definition */'''
		}
	}
	
	def generateAllForTable(Table table)'''
		«table.generateMainDataStructureForTable»
		«table.generateCreateExtension»
		«IF table.name == rootTableName»
		«table.generateFromByteArrayExtension»
		«ENDIF»
		«table.generateLazyAccessExtension(table.name == rootTableName)»
	'''
		
	def generateAllForUnion(Union union)'''
		«union.generateProtocolAndTableExtensionsForUnion»
		«union.generateCreaterFunctionForUnion»
	'''
	
	def generateMainDataStructureForTable(Table table) '''
		public final class «table.name» {
			«FOR field : table.fields»
			public var «field.fieldName» : «field.type.asSwiftFieldType(true)» = «field.defaultValueStringWithVector»
			«ENDFOR»
		}
	'''
	
	def asSwiftFieldType(Type type){
		type.asSwiftFieldType(false)
	}
	
	def String asSwiftFieldType(Type type, boolean withOptional){
		var swiftType = '''Any /* unexpected field type */'''
		if(type.primType != null){
			swiftType = type.primType.converPrimitiveTypeToSwiftTypes
			if(swiftType == "String" && withOptional){
				swiftType += "?"
			}
		} else if(type.defType != null){
			swiftType = type.defType.name
			if(withOptional){
				swiftType += "?"
			}
		} else if (type.qualifiedType != null){
			swiftType = '''Any? /* defined as qulified type which is not supported in Swift*/'''
		} else if (type.vectorType != null) {
			swiftType = '''[«type.vectorType.type.asSwiftFieldType(true)»]'''
		}
		swiftType
	}
	
	def generateMainStructForStruct(Struct struct) '''
		public struct «struct.name» {
			«FOR field : struct.fields»
			public var «field.name» : «field.swiftTypeForStructField»
			«ENDFOR»
		}
	'''
	
	def getSwiftTypeForStructField(StructFields fields){
		if(fields.primType != null && fields.primType != "string"){
			return fields.primType.converPrimitiveTypeToSwiftTypes
		}
		"Any /* unsupported struct field type */"
	}
	
	def generateMainEnumForEnum(Enum e) '''
		public enum «e.name»«IF e.type != null» : «e.type.converPrimitiveTypeToSwiftTypes»«ENDIF» {
			case «FOR eCase : e.enumCases SEPARATOR ', '»«eCase.name»«IF eCase.hasValue» = «eCase.value»«ENDIF»«ENDFOR»
		}
	'''
	
	def generateProtocolAndTableExtensionsForUnion(Union union) '''
		public protocol «union.name»{}
		public protocol «union.name»_LazyAccess{}
		«FOR table : union.unionCases»
		extension «table.name» : «union.name» {}
		extension «table.name».LazyAccess : «union.name»_LazyAccess {}
		«ENDFOR»
	'''
	
	def generateCreaterFunctionForUnion(Union union) '''
		private func create_«union.name»(reader : FlatBufferReader, propertyIndex : Int, objectOffset : ObjectOffset?) -> «union.name»? {
			guard let objectOffset = objectOffset else {
				return nil
			}
			let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
			guard let caseObjectOffset : ObjectOffset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
				return nil
			}
			switch unionCase {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case «indexedUnionCase.key + 1» : return «indexedUnionCase.value.name».create(reader, objectOffset: caseObjectOffset)
			«ENDFOR»
			default : return nil
			}
		}
		private func create_«union.name»_LazyAccess(reader : FlatBufferReader, propertyIndex : Int, objectOffset : ObjectOffset?) -> «union.name»_LazyAccess? {
			guard let objectOffset = objectOffset else {
				return nil
			}
			let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
			guard let caseObjectOffset : ObjectOffset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
				return nil
			}
			switch unionCase {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case «indexedUnionCase.key + 1» : return «indexedUnionCase.value.name».LazyAccess(reader: reader, objectOffset: caseObjectOffset)
			«ENDFOR»
			default : return nil
			}
		}
	'''
	
	def generateFromByteArrayExtension(Table table) '''
		public extension «table.name» {
			public static func FromByteArray(data : UnsafePointer<UInt8>) -> «table.name» {
				let reader = FlatBufferReader(bytes: data)
				let objectOffset = reader.rootObjectOffset
				return create(reader, objectOffset : objectOffset)!
			}
		}
	'''
	
	def generateCreateExtension(Table table) '''
		public extension «table.name» {
			private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> «table.name»? {
				guard let objectOffset = objectOffset else {
					return nil
				}
				let _result = «table.name»()
				«FOR indexedField : table.fields.indexedFields»
				«indexedField.readDataIntoLocalVariables»
				«ENDFOR»
				return _result
			}
		}
	'''
	
	def readDataIntoLocalVariables(Pair<Integer, Fields> indexedField){
		if(indexedField.value.type.isScalar){
			'''
				_result.«indexedField.value.fieldName» = reader.get(objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString»)
			'''
		} else if(indexedField.value.type.isEnum){
			'''
				_result.«indexedField.value.fieldName» = «indexedField.value.type.defType.name»(rawValue: reader.get(objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString».rawValue))
			'''
		} else if(indexedField.value.type.isString){
			'''
				_result.«indexedField.value.fieldName» = reader.getString(reader.getOffset(objectOffset, propertyIndex: «indexedField.key»))
			'''
		} else if(indexedField.value.type.vectorType != null && !indexedField.value.type.isUnionVector) {
			'''
				let offset_«indexedField.value.fieldName» : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: «indexedField.key»)
				let length_«indexedField.value.fieldName» = reader.getVectorLength(offset_«indexedField.value.fieldName»)
				if(length_«indexedField.value.fieldName» > 0){
					var index = 0
					while index < length_«indexedField.value.fieldName» {
						_result.«indexedField.value.fieldName».append(«indexedField.value.accessVectorItem»)
						index += 1
					}
				}
			'''
		} else if(indexedField.value.type.isTable) {
			'''
				_result.«indexedField.value.fieldName» = «indexedField.value.type.asSwiftFieldType».create(reader, objectOffset: reader.getOffset(objectOffset, propertyIndex: «indexedField.key»))
			'''
		} else if(indexedField.value.type.isUnion) {
			'''
				_result.«indexedField.value.fieldName» = create_«indexedField.value.type.defType.name»(reader, propertyIndex: «indexedField.key», objectOffset: objectOffset)
			'''
		} else if(indexedField.value.type.isStruct) {
			'''
				_result.«indexedField.value.fieldName» = «indexedField.value.type.defType.name»(
					«FOR expression : (indexedField.value.type.defType as Struct).structPropertyInitExpressions(indexedField.key) SEPARATOR ','»
					«expression»
					«ENDFOR»
				)
			'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def generateLazyAccessExtension(Table table, boolean isRoot) '''
		public extension «table.name» {
			public final class LazyAccess{
				private let _reader : FlatBufferReader!
				private let _objectOffset : ObjectOffset!
				«IF isRoot»
				public init(data : UnsafePointer<UInt8>){
					_reader = FlatBufferReader(bytes: data)
					_objectOffset = _reader.rootObjectOffset
				}
				«ENDIF»
				private init?(reader : FlatBufferReader, objectOffset : ObjectOffset?){
					guard let objectOffset = objectOffset else {
						_reader = nil
						_objectOffset = nil
						return nil
					}
					_reader = reader
					_objectOffset = objectOffset
				}

				«FOR indexedField : table.fields.indexedFields»
				«indexedField.value.lazyFieldAccessor(indexedField.key)»
				«ENDFOR»

				public lazy var createEagerVersion : «table.name»? = «table.name».create(self._reader, objectOffset: self._objectOffset)
			}
		}
	'''
	
	def lazyFieldAccessor(Fields field, Integer index){
		if(field.type.isScalar){
			'''public lazy var «field.fieldName» : «field.type.asSwiftFieldType» = self._reader.get(self._objectOffset, propertyIndex: «index», defaultValue:«field.defaultValueString»)'''
		} else if(field.type.isString){
			'''public lazy var «field.fieldName» : «field.type.asSwiftFieldType(true)» = self._reader.getString(self._reader.getOffset(self._objectOffset, propertyIndex: «index»))'''
		} else if(field.type.isTable){
			'''public lazy var «field.fieldName» : «field.type.asSwiftFieldType».LazyAccess? = «field.type.defType.name».LazyAccess(reader: self._reader, objectOffset : self._reader.getOffset(self._objectOffset, propertyIndex: «index»))'''
		} else if(field.type.isEnum){
			'''public lazy var «field.fieldName» : «field.type.asSwiftFieldType(true)» = «field.type.defType.name»(rawValue: self._reader.get(self._objectOffset, propertyIndex: «index», defaultValue:«field.defaultValueString».rawValue))'''
		} else if(field.type.isUnion){
			'''public lazy var «field.fieldName» : «field.type.asSwiftFieldType»_LazyAccess? = create_«field.type.defType.name»_LazyAccess(self._reader, propertyIndex: «index», objectOffset: self._objectOffset)'''
		} else if(field.type.isStruct){
			val struct = field.type.defType as Struct
			'''
			public lazy var «field.fieldName» : «struct.name»? = self._reader.hasProperty(self._objectOffset, propertyIndex: «index») ? «struct.name»(
				«FOR strucField : struct.fields SEPARATOR ','»
				«strucField.name» : self._reader.getStructProperty(self._objectOffset, propertyIndex: «index», structPropertyOffset: «struct.indexOf(strucField)», defaultValue: «strucField.defaultValueString»)
				«ENDFOR»
			) : nil'''
		} else if(field.type.vectorType != null){
			'''
				public lazy var «field.fieldName» «field.type.vectorType.type.lazyVectorTypeString» = {
					let vectorOffset : VectorOffset? = self._reader.getOffset(self._objectOffset, propertyIndex: «index»)
					let vectorLength = self._reader.getVectorLength(vectorOffset)
					return LazyVector(count: vectorLength){
						«field.type.vectorType.type.lazyVectorGeneratorImplementation»
					}
				}()'''
		} else {
			'''/* unsupported case */'''
		}
		
	}
	
	def lazyVectorTypeString(Type type){
		if(type.isScalar || type.isStruct || type.isString || type.isEnum){
			''': LazyVector<«type.asSwiftFieldType»>'''
		} else if(type.isTable){
			''': LazyVector<«type.defType.name».LazyAccess>'''
		} else '''/* unsupported case */'''
	}
	
	def lazyVectorGeneratorImplementation(Type type){
		if(type.isScalar){
			'''self._reader.getVectorScalarElement(vectorOffset!, index: $0) as «type.asSwiftFieldType»'''
		} else if(type.isEnum){
			'''«type.asSwiftFieldType»(rawValue: self._reader.getVectorScalarElement(vectorOffset!, index: $0))'''
		} else if(type.isString){
			'''self._reader.getString(self._reader.getVectorOffsetElement(vectorOffset!, index: $0))'''
		} else if(type.isStruct){
			val struct = type.defType as Struct
			'''
			«struct.name»(
				«FOR strucField : struct.fields SEPARATOR ','»
				«strucField.name» : self._reader.getVectorStructElement(vectorOffset!, vectorIndex: $0, structSize: «struct.size», structElementIndex: «struct.indexOf(strucField)»)
				«ENDFOR»
			)'''
		} else if(type.isTable){
			'''«type.defType.name».LazyAccess(reader: self._reader, objectOffset : self._reader.getVectorOffsetElement(vectorOffset!, index: $0))'''
		} else '''/* unsupported case */'''
	}
	
	def structPropertyInitExpressions(Struct struct, Integer propertyIndex){
		var expressions = new ArrayList<String>()
		var structPropertyOffset = 0
		for(StructFields field : struct.fields){
			if(field.primType != null){
				expressions.add('''«field.name» : reader.getStructProperty(objectOffset, propertyIndex: «propertyIndex», structPropertyOffset: «structPropertyOffset», defaultValue: «field.defaultValueString»)''')
				structPropertyOffset += field.primType.lengthOfPrimType
			} else {
				expressions.add('''«field.name» : /* unsupported case */''')
			}
			
		}
		expressions
	}
	
	def lengthOfPrimType(String type) {
		switch type {
			case 'bool' : 1
			case 'byte' : 1
			case 'ubyte' : 1
			case 'short' : 2
			case 'ushort' : 2
			case 'int' : 4
			case 'uint' : 4
			case 'float' : 4
			case 'long' : 8
			case 'ulong' : 8
			case 'double' : 8
			default : 0
		}
	}
	
	def accessVectorItem(Fields field){
		if(field.type.isScalarVector) {
			'''reader.getVectorScalarElement(offset_«field.fieldName»!, index: index)'''
		} else if(field.type.isEnumVector) {
			'''«field.type.vectorType.type.defType.name»(rawValue: reader.getVectorScalarElement(offset_«field.fieldName»!, index: index))'''
		} else if(field.type.isStringVector) {
			'''reader.getString(reader.getVectorOffsetElement(offset_«field.fieldName»!, index: index))'''
		} else if(field.type.isTableVector) {
			'''«field.type.vectorType.type.defType.name».create(reader, objectOffset: reader.getVectorOffsetElement(offset_«field.fieldName»!, index: index))'''
		} else if(field.type.isStructVector) {
			val struct = (field.type.vectorType.type.defType as Struct)
			'''
			«field.type.vectorType.type.defType.name»(
				«FOR strucField : struct.fields SEPARATOR ','»
				«strucField.name» : reader.getVectorStructElement(offset_«field.fieldName»!, vectorIndex: index, structSize: «struct.size», structElementIndex: «struct.indexOf(strucField)»)
				«ENDFOR»
			)'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def getSize(Struct struct){
		var size = 0
		for(StructFields field : struct.fields){
			if(field.primType != null){
				size += field.primType.lengthOfPrimType
			}
		}
		size
	}
	
	def indexOf(Struct struct, StructFields destinationField){
		var size = 0
		for(StructFields field : struct.fields){
			if(field == destinationField){
				return size
			}
			if(field.primType != null){
				size += field.primType.lengthOfPrimType
			}
		}
		size
	}
	
	def indexedFields(EList<Fields> fields) {
		var result = new ArrayList<Pair<Integer, Fields>>();
		var index = 0
		for (Fields f : fields){
			result.add(new Pair<Integer, Fields>(index, f))
			if(f.type.isUnion) {
				index += 2
			} else {
				index += 1
			}
		}
		result
	}
	
	def isUnion(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Union case type: return true
			}
		}
		return false
	}
	
	def isEnum(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Enum case type: return true
			}
		}
		return false
	}
	
	def isTable(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Table case type: return true
			}
		}
		return false
	}
	
	def isStruct(Type t){
		val type = t.defType 
		if(t.defType != null){
			switch type {
				Struct case type: return true
			}
		}
		return false
	}
	
	def isScalar(Type t){ 
		t.primType != null && t.primType != "string"
	}
	
	def isString(Type t){ 
		t.primType != null && t.primType == "string"
	}
	
	def isScalarVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isScalar
	}
	
	def isEnumVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isEnum
	}
	
	def isStringVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isString
	}
	
	def isTableVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isTable
	}
	
	def isStructVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isStruct
	}
	
	def isUnionVector(Type t){ 
		t.vectorType != null && t.vectorType.type.isUnion
	}
	
	def fieldName(Fields field){
		if(field.isDeprecated){
			'''__«field.name»'''
		} else {
			'''«field.name»'''
		}
	}
	
	def isDeprecated(Fields field){
		if(field.attributes == null) return false
		field.attributes.atributeNames.findFirst[it.deprectated] != null
	}
	
	def defaultValueStringWithVector(Fields field){
		if(field.type.vectorType != null){
			"[]"
		} else {
			field.defaultValueString
		}
	}
	
	def defaultValueString(Fields field){
		if(field.defaultValue == null){
			return field.type.defaultValueString
		}
		if(field.defaultValue.isFalse){
			return "false"
		} else if(field.defaultValue.isTrue){
			return "true"
		} else if(field.defaultValue.enumCase != null){
			return field.type.defType.name + "." + field.defaultValue.enumCase; 
		}
		
		return field.defaultValue.number
	}
	
	def defaultValueString(StructFields field){
		if(field.primType == "bool"){
			return "false"
		}
		return "0"
	}
	
	def defaultValueString(Type type){
		if(type.isEnum){
				return type.defType.name + "." + (type.defType as Enum).enumCases.get(0).name
		} 
		if(type.isScalar){
			if(type.primType == "bool"){
				return "false"
			} else {
				return "0"
			}
		}
		return "nil"
	}
	
	def converPrimitiveTypeToSwiftTypes(String type) {
		switch type {
			case 'bool' : "Bool"
			case 'byte' : "Int8"
			case 'ubyte' : "UInt8"
			case 'short' : "Int16"
			case 'ushort' : "UInt16"
			case 'int' : "Int32"
			case 'uint' : "UInt32"
			case 'float' : "Float32"
			case 'long' : "Int64"
			case 'ulong' : "UInt64"
			case 'double' : "Float64"
			case 'string' : "String"
			default : "Any /* unsupported primitive field type */"
		}
	}
	
}