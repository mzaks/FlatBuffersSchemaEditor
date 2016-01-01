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

class EagerSwiftGenerator {
	
	String rootTableName
	
	def generate(Schema schema){
		rootTableName = schema.rootType.type.name
		'''
		'''
	}
	
	def generateMainStructForTable(Table table) '''
		public struct «table.name» {
			«FOR field : table.fields»
			public var «field.name» : «field.type.asSwiftFieldType(true)»
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
			if(!(type.defType instanceof Enum) && withOptional){
				swiftType += "?"
			}
		} else if (type.qualifiedType != null){
			swiftType = '''Any? /* defined as qulified type which is not supported in Swift*/'''
		} else if (type.vectorType != null) {
			swiftType = '''[«type.vectorType.type.asSwiftFieldType»]'''
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
		if(fields.primType != null){
			return fields.primType.converPrimitiveTypeToSwiftTypes
		} else if(fields.defType != null) {
			return fields.defType.name
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
		«FOR table : union.unionCases»
		public extension «table.name» : «union.name» {}
		«ENDFOR»
	'''
	
	def generateFromByteArrayExtension(Table table) '''
		public extension «table.name» {
			public static func FromByteArray(data : [UInt8]) -> «table.name» {
				let reader = FlatBufferReader(buffer: data)
				let objectOffset = reader.rootObjectOffset
				«FOR indexedField : table.fields.indexedFields»
				«indexedField.readDataIntoLocalVariables»
				«ENDFOR»
				return «table.name»(
					«FOR indexedField : table.fields.indexedFields SEPARATOR ','»
					«indexedField.value.name»: _«indexedField.value.name»
					«ENDFOR»
				)
			}
		}
	'''
	
	def generateCreateExtension(Table table) '''
		public extension «table.name» {
			private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> «table.name» {
				let _result = «table.name»()
				«FOR indexedField : table.fields.indexedFields»
				«indexedField.readDataIntoLocalVariables»
				«ENDFOR»
				return _result
			}
		}
	'''
	
	def readDataIntoLocalVariables(Pair<Integer, Fields> indexedField){
		if(indexedField.value.type.isScalar || indexedField.value.type.isEnum){
			'''
				_result.«indexedField.value.name» = reader.get(objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString»)
			'''
		} else if(indexedField.value.type.isString){
			'''
				_result.«indexedField.value.name» = reader.getString(reader.getOffset(objectOffset, propertyIndex: «indexedField.key»))
			'''
		} else if(indexedField.value.type.isScalarVector || indexedField.value.type.isEnumVector) {
			'''
				let offset_«indexedField.value.name» : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: «indexedField.key»)
				let length_«indexedField.value.name» = reader.getVectorLength(offset_«indexedField.value.name»)
				_result.«indexedField.value.name» = «indexedField.value.type.asSwiftFieldType»(count: length_«indexedField.value.name», repeatedValue: «indexedField.value.type.vectorType.type.defaultValueString»)
				if(length_«indexedField.value.name» > 0){
					for index in 0 ..< length_«indexedField.value.name»{
						_«indexedField.value.name»[index] = reader.getVectorScalarElement(offset_«indexedField.value.name»!, index: index)
					}
				}
			'''
		} else if(indexedField.value.type.isStringVector) {
			'''
				let offset_«indexedField.value.name» : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: «indexedField.key»)
				let length_«indexedField.value.name» = reader.getVectorLength(offset_«indexedField.value.name»)
				_result.«indexedField.value.name» = «indexedField.value.type.asSwiftFieldType»()
				if(length_«indexedField.value.name» > 0){
					for index in 0 ..< length_«indexedField.value.name»{
						_«indexedField.value.name»[index] = reader.getString(reader.getVectorOffsetElement(offset_«indexedField.value.name»!, index: index))!
					}
				}
			'''
		} else if(indexedField.value.type.isTable) {
			'''
				let offset_«indexedField.value.name» : ObjectOffset? = reader.getOffset(objectOffset, propertyIndex: «indexedField.key»)
				_result.«indexedField.value.name» = offset_«indexedField.value.name» != nil ? «indexedField.value.type.asSwiftFieldType».create(reader, objectOffset: offset_«indexedField.value.name»!) : nil
			'''
		} else {
			'''/* unsupported case */'''
		}
	} 
	
	def indexedFields(EList<Fields> fields) {
		var result = new ArrayList<Pair<Integer, Fields>>();
		var index = 0
		for (Fields f : fields){
			if(f.type.isUnion) {
				result.add(new Pair<Integer, Fields>(index, f))
				index += 2
			} else {
				result.add(new Pair<Integer, Fields>(index, f))
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