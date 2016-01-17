package maxim.zaks.generator

import maxim.zaks.flatBuffers.Schema
import maxim.zaks.flatBuffers.Table
import maxim.zaks.flatBuffers.Type
import maxim.zaks.flatBuffers.Enum
import maxim.zaks.flatBuffers.Struct
import maxim.zaks.flatBuffers.Union
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import maxim.zaks.flatBuffers.Definition
import maxim.zaks.flatBuffers.StructField
import maxim.zaks.flatBuffers.Field

class EagerSwiftGenerator {
	
	String rootTableName
	public String fileIdentifier
	
	def generate(Schema schema){
		rootTableName = schema.rootType.type.name
		fileIdentifier = schema.fileIdentifier?.identifier
		val unions = schema.definitions.filter[it instanceof Union]
		'''
		
		// generated with FlatBuffersSchemaEditor https://github.com/mzaks/FlatBuffersSchemaEditor
		
		import FlatBuffersSwift
		
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
			// This is why we ignore Union case here and has a second for loop in generate method
			Union case definition: ''''''
			default : '''/* unexpected definition */'''
		}
	}
	
	def generateAllForTable(Table table)'''
		«table.generateMainDataStructureForTable»
		«table.generateCreateExtension»
		«IF table.name == rootTableName»
		«table.generateFromByteArrayExtension»
		«table.generateToByteArrayExtension»
		«ENDIF»
		«table.generateLazyAccessExtension(table.name == rootTableName)»
		«table.generateAddToByteArrayExtension»
	'''
		
	def generateAllForUnion(Union union)'''
		«union.generateProtocolAndTableExtensionsForUnion»
		«union.generateCreaterFunctionForUnion»
	'''
	
	def generateMainDataStructureForTable(Table table) '''
		public final class «table.name» {
			«FOR field : table.fields»
			public var «field.fieldName» : «field.getType.asSwiftFieldType(true)» = «field.defaultValueStringWithVector»
			«ENDFOR»
			public init(){}
			«IF !table.fields.filter[!it.isDeprecated].empty»
			public init(«FOR field : table.fields.filter[!it.isDeprecated] SEPARATOR ', '»«field.fieldName»: «field.getType.asSwiftFieldType(true)»«ENDFOR»){
				«FOR field : table.fields.filter[!it.isDeprecated]»
				self.«field.fieldName» = «field.fieldName»
				«ENDFOR»
			}
			«ENDIF»
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
			public var «field.getName» : «field.swiftTypeForStructField»
			«ENDFOR»
		}
	'''
	
	def getSwiftTypeForStructField(StructField fields){
		if(fields.getPrimType != null && fields.getPrimType != "string"){
			return fields.getPrimType.converPrimitiveTypeToSwiftTypes
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
		private func create_«union.name»(reader : FlatBufferReader, propertyIndex : Int, objectOffset : Offset?) -> «union.name»? {
			guard let objectOffset = objectOffset else {
				return nil
			}
			let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
			guard let caseObjectOffset : Offset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
				return nil
			}
			switch unionCase {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case «indexedUnionCase.key + 1» : return «indexedUnionCase.value.name».create(reader, objectOffset: caseObjectOffset)
			«ENDFOR»
			default : return nil
			}
		}
		private func create_«union.name»_LazyAccess(reader : FlatBufferReader, propertyIndex : Int, objectOffset : Offset?) -> «union.name»_LazyAccess? {
			guard let objectOffset = objectOffset else {
				return nil
			}
			let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
			guard let caseObjectOffset : Offset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
				return nil
			}
			switch unionCase {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case «indexedUnionCase.key + 1» : return «indexedUnionCase.value.name».LazyAccess(reader: reader, objectOffset: caseObjectOffset)
			«ENDFOR»
			default : return nil
			}
		}
		private func unionCase_«union.name»(union : «union.name»?) -> Int8 {
			switch union {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case is «indexedUnionCase.value.name» : return «indexedUnionCase.key + 1»
			«ENDFOR»
			default : return 0
			}
		}
		private func addToByteArray_«union.name»(builder : FlatBufferBuilder, union : «union.name»?) -> Offset {
			switch union {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case let u as «indexedUnionCase.value.name» : return u.addToByteArray(builder)
			«ENDFOR»
			default : return 0
			}
		}
	'''
	
	def generateFromByteArrayExtension(Table table) '''
		public extension «table.name» {
			public static func fromByteArray(data : UnsafePointer<UInt8>) -> «table.name» {
				let reader = FlatBufferReader(bytes: data)
				let objectOffset = reader.rootObjectOffset
				return create(reader, objectOffset : objectOffset)!
			}
		}
	'''
	
	def generateCreateExtension(Table table) '''
		public extension «table.name» {
			private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> «table.name»? {
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
	
	def readDataIntoLocalVariables(Pair<Integer, Field> indexedField){
		if(indexedField.value.getType.isScalar){
			'''
				_result.«indexedField.value.fieldName» = reader.get(objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString»)
			'''
		} else if(indexedField.value.getType.isEnum){
			'''
				_result.«indexedField.value.fieldName» = «indexedField.value.getType.defType.name»(rawValue: reader.get(objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString».rawValue))
			'''
		} else if(indexedField.value.getType.isString){
			'''
				_result.«indexedField.value.fieldName» = reader.getString(reader.getOffset(objectOffset, propertyIndex: «indexedField.key»))
			'''
		} else if(indexedField.value.getType.vectorType != null && !indexedField.value.getType.isUnionVector) {
			'''
				let offset_«indexedField.value.fieldName» : Offset? = reader.getOffset(objectOffset, propertyIndex: «indexedField.key»)
				let length_«indexedField.value.fieldName» = reader.getVectorLength(offset_«indexedField.value.fieldName»)
				if(length_«indexedField.value.fieldName» > 0){
					var index = 0
					while index < length_«indexedField.value.fieldName» {
						_result.«indexedField.value.fieldName».append(«indexedField.value.accessVectorItem»)
						index += 1
					}
				}
			'''
		} else if(indexedField.value.getType.isTable) {
			'''
				_result.«indexedField.value.fieldName» = «indexedField.value.getType.asSwiftFieldType».create(reader, objectOffset: reader.getOffset(objectOffset, propertyIndex: «indexedField.key»))
			'''
		} else if(indexedField.value.getType.isUnion) {
			'''
				_result.«indexedField.value.fieldName» = create_«indexedField.value.getType.defType.name»(reader, propertyIndex: «indexedField.key», objectOffset: objectOffset)
			'''
		} else if(indexedField.value.getType.isStruct) {
			'''
				_result.«indexedField.value.fieldName» = «indexedField.value.getType.defType.name»(
					«FOR expression : (indexedField.value.getType.defType as Struct).structPropertyInitExpressions(indexedField.key) SEPARATOR ','»
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
				private let _objectOffset : Offset!
				«IF isRoot»
				public init(data : UnsafePointer<UInt8>){
					_reader = FlatBufferReader(bytes: data)
					_objectOffset = _reader.rootObjectOffset
				}
				«ENDIF»
				private init?(reader : FlatBufferReader, objectOffset : Offset?){
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
	
	def lazyFieldAccessor(Field field, Integer index){
		if(field.getType.isScalar){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType» = self._reader.get(self._objectOffset, propertyIndex: «index», defaultValue:«field.defaultValueString»)'''
		} else if(field.getType.isString){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType(true)» = self._reader.getString(self._reader.getOffset(self._objectOffset, propertyIndex: «index»))'''
		} else if(field.getType.isTable){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType».LazyAccess? = «field.getType.defType.name».LazyAccess(reader: self._reader, objectOffset : self._reader.getOffset(self._objectOffset, propertyIndex: «index»))'''
		} else if(field.getType.isEnum){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType(true)» = «field.getType.defType.name»(rawValue: self._reader.get(self._objectOffset, propertyIndex: «index», defaultValue:«field.defaultValueString».rawValue))'''
		} else if(field.getType.isUnion){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType»_LazyAccess? = create_«field.getType.defType.name»_LazyAccess(self._reader, propertyIndex: «index», objectOffset: self._objectOffset)'''
		} else if(field.getType.isStruct){
			val struct = field.getType.defType as Struct
			'''
			public lazy var «field.fieldName» : «struct.name»? = self._reader.hasProperty(self._objectOffset, propertyIndex: «index») ? «struct.name»(
				«FOR strucField : struct.fields SEPARATOR ','»
				«strucField.getName» : self._reader.getStructProperty(self._objectOffset, propertyIndex: «index», structPropertyOffset: «struct.indexOf(strucField)», defaultValue: «strucField.defaultValueString»)
				«ENDFOR»
			) : nil'''
		} else if(field.getType.vectorType != null){
			'''
				public lazy var «field.fieldName» «field.getType.vectorType.type.lazyVectorTypeString» = {
					let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: «index»)
					let vectorLength = self._reader.getVectorLength(vectorOffset)
					return LazyVector(count: vectorLength){
						«field.getType.vectorType.type.lazyVectorGeneratorImplementation»
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
				«strucField.getName» : self._reader.getVectorStructElement(vectorOffset!, vectorIndex: $0, structSize: «struct.size», structElementIndex: «struct.indexOf(strucField)»)
				«ENDFOR»
			)'''
		} else if(type.isTable){
			'''«type.defType.name».LazyAccess(reader: self._reader, objectOffset : self._reader.getVectorOffsetElement(vectorOffset!, index: $0))'''
		} else '''/* unsupported case */'''
	}
	
	def structPropertyInitExpressions(Struct struct, Integer propertyIndex){
		var expressions = new ArrayList<String>()
		var structPropertyOffset = 0
		for(StructField field : struct.fields){
			if(field.getPrimType != null){
				expressions.add('''«field.getName» : reader.getStructProperty(objectOffset, propertyIndex: «propertyIndex», structPropertyOffset: «structPropertyOffset», defaultValue: «field.defaultValueString»)''')
				structPropertyOffset += field.getPrimType.lengthOfPrimType
			} else {
				expressions.add('''«field.getName» : /* unsupported case */''')
			}
			
		}
		expressions
	}
	
	def generateToByteArrayExtension(Table table) '''
		public extension «table.name» {
			public var toByteArray : [UInt8] {
				let builder = FlatBufferBuilder()
				return try! builder.finish(addToByteArray(builder), fileIdentifier: «IF fileIdentifier == null»nil«ELSE»"«fileIdentifier»"«ENDIF»)
			}
		}
	'''
	
	def generateAddToByteArrayExtension(Table table) '''
		public extension «table.name» {
			private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
				«FOR indexedField : table.fields.indexedFields.reverse»
				«indexedField.value.createOffsetForField(indexedField.key)»
				«ENDFOR»
				try! builder.openObject(«table.numberOfFields»)
				«FOR indexedField : table.fields.indexedFields.reverse»
				«indexedField.value.addPropertyOrOffsetToObject(indexedField.key)»
				«ENDFOR»
				return try! builder.closeObject()
			}
		}
	'''
	
	def numberOfFields(Table t) {
		if(t.fields.isEmpty) return 0
		
		val lastField = t.fields.indexedFields.last
		if(lastField.value.getType.isUnion){
			lastField.key + 2
		} else {
			lastField.key + 1
		}
	}
	
	def createOffsetForField(Field field, Integer index){
		if(field.getType.isScalar || field.getType.isEnum || field.getType.isStruct){
			''''''
		} else if(field.isDeprecated){
			'''// «field.fieldName» is deprecated'''
		} else if(field.getType.isString){
			'''let offset«index» = try! builder.createString(«field.fieldName»)'''
		} else if(field.getType.isTable){
			'''let offset«index» = «field.fieldName»?.addToByteArray(builder) ?? 0'''
		} else if(field.getType.isUnion){
			'''let offset«index» = addToByteArray_«field.getType.defType.name»(builder, union: «field.fieldName»)'''
		} else if(field.getType.isScalarVector || field.getType.isEnumVector || field.getType.isStructVector){
			'''
			var offset«index» = Offset(0)
			if «field.fieldName».count > 0{
				try! builder.startVector(«field.fieldName».count)
				var index = «field.fieldName».count - 1
				while(index >= 0){
					«field.vectorOffsetPutStatementDirect»
					index -= 1
				}
				offset«index» = builder.endVector()
			}'''
		} else if(field.getType.isStringVector || field.getType.isTableVector){
			'''
			var offset«index» = Offset(0)
			if «field.fieldName».count > 0{
				var offsets = [Offset?](count: «field.fieldName».count, repeatedValue: nil)
				var index = «field.fieldName».count - 1
				while(index >= 0){
					«field.vectorOffsetPutStatementInDirect»
					index -= 1
				}
				try! builder.startVector(«field.fieldName».count)
				index = «field.fieldName».count - 1
				while(index >= 0){
					try! builder.putOffset(offsets[index])
					index -= 1
				}
				offset«index» = builder.endVector()
			}'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def vectorOffsetPutStatementDirect(Field field){
		if(field.getType.isEnumVector){
			'''builder.put(«field.fieldName»[index]!.rawValue)'''
		} else if(field.getType.isScalarVector){
			'''builder.put(«field.fieldName»[index])'''
		} else if(field.getType.isStructVector){
			'''
			«FOR structField : (field.getType.vectorType.type.defType as Struct).fields.reverseView»
			builder.put(«field.fieldName»[index]?.«structField.getName» ?? «structField.defaultValueString»)
			«ENDFOR»'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def vectorOffsetPutStatementInDirect(Field field){
		if(field.getType.isStringVector){
			'''offsets[index] = try!builder.createString(«field.fieldName»[index])'''
		} else if(field.getType.isTableVector){
			'''offsets[index] = «field.fieldName»[index]?.addToByteArray(builder)'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def addPropertyOrOffsetToObject(Field field, Integer index){
		if(field.isDeprecated){
			'''// «field.fieldName» is deprecated'''
		} else if(field.getType.isString || field.getType.isTable || field.getType.vectorType != null) {
			'''try! builder.addPropertyOffsetToOpenObject(«index», offset: offset«index»)'''
		} else if(field.getType.isScalar) {
			'''try! builder.addPropertyToOpenObject(«index», value : «field.fieldName», defaultValue : «field.defaultValueString»)'''
		} else if(field.getType.isEnum) {
			'''try! builder.addPropertyToOpenObject(«index», value : «field.fieldName»!.rawValue, defaultValue : 0)'''
		} else if(field.getType.isUnion) {
			'''
			try! builder.addPropertyOffsetToOpenObject(«index+1», offset: offset«index»)
			try! builder.addPropertyToOpenObject(«index», value : unionCase_«field.getType.defType.name»(«field.fieldName»), defaultValue : 0)'''
		} else if(field.getType.isStruct) {
			'''
			if let «field.fieldName» = «field.fieldName» {
				«FOR structField : (field.getType.defType as Struct).fields.reverseView»
				builder.put(«field.fieldName».«structField.getName»)
				«ENDFOR»
				try! builder.addCurrentOffsetAsPropertyToOpenObject(«index»)
			}'''
		} else {
			'''/* unsupported case */'''
		}
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
	
	def accessVectorItem(Field field){
		if(field.getType.isScalarVector) {
			'''reader.getVectorScalarElement(offset_«field.fieldName»!, index: index)'''
		} else if(field.getType.isEnumVector) {
			'''«field.getType.vectorType.type.defType.name»(rawValue: reader.getVectorScalarElement(offset_«field.fieldName»!, index: index))'''
		} else if(field.getType.isStringVector) {
			'''reader.getString(reader.getVectorOffsetElement(offset_«field.fieldName»!, index: index))'''
		} else if(field.getType.isTableVector) {
			'''«field.getType.vectorType.type.defType.name».create(reader, objectOffset: reader.getVectorOffsetElement(offset_«field.fieldName»!, index: index))'''
		} else if(field.getType.isStructVector) {
			val struct = (field.getType.vectorType.type.defType as Struct)
			'''
			«field.getType.vectorType.type.defType.name»(
				«FOR strucField : struct.fields SEPARATOR ','»
				«strucField.getName» : reader.getVectorStructElement(offset_«field.fieldName»!, vectorIndex: index, structSize: «struct.size», structElementIndex: «struct.indexOf(strucField)»)
				«ENDFOR»
			)'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def getSize(Struct struct){
		var size = 0
		for(StructField field : struct.fields){
			if(field.getPrimType != null){
				size += field.getPrimType.lengthOfPrimType
			}
		}
		size
	}
	
	def indexOf(Struct struct, StructField destinationField){
		var size = 0
		for(StructField field : struct.fields){
			if(field == destinationField){
				return size
			}
			if(field.getPrimType != null){
				size += field.getPrimType.lengthOfPrimType
			}
		}
		size
	}
	
	def indexedFields(EList<Field> fields) {
		var result = new ArrayList<Pair<Integer, Field>>();
		var index = 0
		for (Field f : fields){
			result.add(new Pair<Integer, Field>(index, f))
			if(f.getType.isUnion) {
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
	
	def fieldName(Field field){
		if(field.isDeprecated){
			'''__«field.getName»'''
		} else {
			'''«field.getName»'''
		}
	}
	
	def isDeprecated(Field field){
		if(field.getAttributes == null) return false
		field.getAttributes.atributeNames.findFirst[it.deprectated] != null
	}
	
	def defaultValueStringWithVector(Field field){
		if(field.getType.vectorType != null){
			"[]"
		} else {
			field.defaultValueString
		}
	}
	
	def defaultValueString(Field field){
		if(field.getDefaultValue == null){
			return field.getType.defaultValueString
		}
		if(field.getDefaultValue.isFalse){
			return "false"
		} else if(field.getDefaultValue.isTrue){
			return "true"
		} else if(field.getDefaultValue.enumCase != null){
			return field.getType.defType.name + "." + field.getDefaultValue.enumCase; 
		}
		
		return field.getDefaultValue.number
	}
	
	def defaultValueString(StructField field){
		if(field.getPrimType == "bool"){
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