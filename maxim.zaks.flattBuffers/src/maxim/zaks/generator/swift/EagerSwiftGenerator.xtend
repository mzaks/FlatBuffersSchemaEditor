package maxim.zaks.generator.swift

import maxim.zaks.flatBuffers.Definition
import maxim.zaks.flatBuffers.Enum
import maxim.zaks.flatBuffers.Field
import maxim.zaks.flatBuffers.Schema
import maxim.zaks.flatBuffers.Struct
import maxim.zaks.flatBuffers.StructField
import maxim.zaks.flatBuffers.Table
import maxim.zaks.flatBuffers.Type
import maxim.zaks.flatBuffers.Union
import maxim.zaks.generator.ModelExtensions

public class EagerSwiftGenerator {
	public enum InfrastructureInclusionRule {
		Include, Import, Exclude
	}
	String rootTableName
	public String fileIdentifier
	extension ModelExtensions = new ModelExtensions()
	
	def generate(Schema schema, InfrastructureInclusionRule inclusionRule){
		rootTableName = schema.rootType.type.name
		fileIdentifier = schema.fileIdentifier?.identifier
		val isRecurisve = schema.rootType.type.isRecursive
		var String[] namespaceParts = #[]
		if(schema.namepsace != null){
			namespaceParts = schema.namepsace?.name.split("\\.")
		}
		val unions = schema.definitions.filter[it instanceof Union]
		'''
		
		// generated with FlatBuffersSchemaEditor https://github.com/mzaks/FlatBuffersSchemaEditor
		
		import Foundation
		
		«IF inclusionRule == InfrastructureInclusionRule.Import»import FlatBuffersSwift«ENDIF»
«««		«FOR namespacePart : namespaceParts»
«««		enum «namespacePart» {
«««		«ENDFOR»
		«FOR definition : schema.definitions»
		«definition.generateMainDefinition»
		«ENDFOR»
		«FOR union : unions»
		«(union as Union).generateAllForUnion»
		«ENDFOR»
		«IF isRecurisve»
		«schema.generatePerformLateBindings»
		«ENDIF»
«««		«FOR namespacePart : namespaceParts»
«««		}
«««		«ENDFOR»
		«IF inclusionRule == InfrastructureInclusionRule.Include»
		// MARK: Reader
		«SwiftLibraryReader.definitions»
		// MARK: Builder
		«SwiftLibraryBuilder.definitions»
		«ENDIF»
		'''
	}
	
	def generatePerformLateBindings(Schema schema)'''
		private func performLateBindings(_ builder : FlatBuffersBuilder) throws {
			for binding in builder.deferedBindings {
				switch binding.object {
				«FOR definition : schema.definitions»
				«definition.generateLateBinding»
				«ENDFOR»
				default: continue
				}
			}
		}
	'''
	
	def generateLateBinding(Definition definition){
		switch definition {
			Table case definition: 
				'''
				case let object as «definition.name»: try builder.update(offset: object.addToByteArray(builder), atCursor: binding.cursor)
				'''
			default : ''''''
		}
	}
	
	def generateClearCaches(Definition definition){
		switch definition {
			Table case definition: 
				'''
				«definition.name».clearCaches()
				'''
			default : ''''''
		}
	}
	
	def generateMainDefinition(Definition definition){
		switch definition {
			Table case definition: definition.generateAllForTable
			Enum case definition: definition.generateMainEnumForEnum
			Struct case definition: definition.generateAllForStruct
			// TableName.LazyAccess class is only accesable by code which comes after it. Seems like a Bug in Swift Compiler
			// This is why we ignore Union case here and has a second for loop in main generate method
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
«««		«table.generateLazyAccessExtension(table.name == rootTableName)»
		«table.generateDirectDataStructureForTable»
		«table.generateAddToByteArrayExtension»
«««		«table.generateJSONSupport»
	'''
		
	def generateAllForUnion(Union union)'''
		«union.generateProtocolAndTableExtensionsForUnion»
«««		«union.generateJSONSuportExtensionForUnion»
		«union.generateCreaterFunctionForUnion»
	'''
	
	def generateMainDataStructureForTable(Table table) '''
		public final class «table.name» {
			«FOR field : table.fields»
			public var «field.fieldName» : «field.getType.asSwiftFieldType(!field.isRequired)»«IF !field.isRequired» = «field.defaultValueStringWithVector»«ENDIF»
			«ENDFOR»
			public init(«FOR field : table.fields.filter[it.isRequired] SEPARATOR ', '»«field.fieldName»: «field.getType.asSwiftFieldType(false)»«ENDFOR»){
				«FOR field : table.fields.filter[it.isRequired]»
				self.«field.fieldName» = «field.fieldName»
				«ENDFOR»
			}
			«IF !table.fields.filter[!it.isDeprecated].empty»
			public init(«FOR field : table.fields.filter[!it.isDeprecated] SEPARATOR ', '»«field.fieldName»: «field.getType.asSwiftFieldType(!field.isRequired)»«ENDFOR»){
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
			swiftType = type.primType.convertPrimitiveTypeToSwiftTypes
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
			if (type.isEnumVector){
				swiftType = '''[«type.vectorType.type.asSwiftFieldType(true)»]'''
			} else {
				swiftType = '''[«type.vectorType.type.asSwiftFieldType(false)»]'''
			}
			
		}
		swiftType
	}
	
	def generateAllForStruct(Struct struct) '''
		«struct.generateMainStructForStruct»
		«struct.generateStructEquality»
«««		«struct.generateJSONStructSupport»
	'''
	
	def generateMainStructForStruct(Struct struct) '''
		public struct «struct.name» : Scalar {
			«FOR field : struct.fields»
			public let «field.name» : «field.swiftTypeForStructField»
			«ENDFOR»
		}
	'''
	
	def generateStructEquality(Struct struct) '''
		public func ==(v1:«struct.name», v2:«struct.name») -> Bool {
			return «FOR field : struct.fields SEPARATOR " && "» v1.«field.name»==v2.«field.name»«ENDFOR»
		}
	'''
	
	def generateJSONStructSupport(Struct struct) '''
		extension «struct.name» {
			public func toJSON() -> String{
				«FOR field : struct.fields»
				«IF field.primType != null»
				let «field.name»Property = "\"«field.name»\":\(«field.name»)"
				«ELSE»
				let «field.name»Property = "\"«field.name»\":\(«field.name».toJSON())"
				«ENDIF»
				«ENDFOR»
				return "{«FOR field : struct.fields SEPARATOR ","»\(«field.name»Property)«ENDFOR»}"
			}
			
			public static func fromJSON(dict : NSDictionary) -> «struct.name» {
				return «struct.name»(
				«FOR field : struct.fields SEPARATOR ","»
				«field.name»: «IF field.primType != null»(dict["«field.name»"] as! NSNumber).«field.primType.generateNSNumberExpression»«ELSE»«field.defType.name».fromJSON(dict["«field.name»"] as! NSDictionary)«ENDIF»
				«ENDFOR»
				)
			}
		}
	'''
	
	def getSwiftTypeForStructField(StructField fields){
		if(fields.getPrimType != null && fields.getPrimType != "string"){
			return fields.getPrimType.convertPrimitiveTypeToSwiftTypes
		}
		if(fields.defType != null){
			return fields.defType.name
		}
		"Any /* unsupported struct field type */"
	}
	
	def generateAllForEnum(Enum e) '''
		«e.generateMainEnumForEnum»
		«e.generateEnumJSONSupport»
	'''
	
	def generateMainEnumForEnum(Enum e) '''
		public enum «e.name»«IF e.type != null» : «e.type.convertPrimitiveTypeToSwiftTypes»«ENDIF» {
			case «FOR eCase : e.enumCases SEPARATOR ', '»«eCase.name»«IF eCase.hasValue» = «eCase.value»«ENDIF»«ENDFOR»
		}
	'''
	
	def generateEnumJSONSupport(Enum e) '''
		extension «e.name» {
			func toJSON() -> String {
				switch self {
				«FOR eCase : e.enumCases»
				case «eCase.name»:
					return "\"«eCase.name»\""
				«ENDFOR»
				}
			}
			static func fromJSON(value : String) -> «e.name»? {
				switch value {
				«FOR eCase : e.enumCases»
					case "«eCase.name»":
						return «eCase.name»
					«ENDFOR»
				default:
					return nil
				}
			}
		}
		
	'''
	
	def generateProtocolAndTableExtensionsForUnion(Union union) '''
		public protocol «union.name»{}
«««		public protocol «union.name»_LazyAccess{}
		public protocol «union.name»_Direct{}
		«FOR table : union.unionCases»
		extension «table.name» : «union.name» {}
«««		extension «table.name».LazyAccess : «union.name»_LazyAccess {}
		extension «table.name»_Direct : «union.name»_Direct {}
		«ENDFOR»
	'''
	
	def generateJSONSuportExtensionForUnion(Union union) '''
		extension «union.name»{
			static func fromJSON(dict : NSDictionary) -> Self
			func toJSON() -> String
			func jsonTypeName() -> String
		}
	'''
	
	def generateCreaterFunctionForUnion(Union union) '''
		fileprivate func create_«union.name»(_ reader : FlatBuffersReader, propertyIndex : Int, objectOffset : Offset?) -> «union.name»? {
			guard let objectOffset = objectOffset else {
				return nil
			}
			let unionCase : Int8 = reader.get(objectOffset: objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
			guard let caseObjectOffset : Offset = reader.offset(objectOffset: objectOffset, propertyIndex:propertyIndex + 1) else {
				return nil
			}
			switch unionCase {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case «indexedUnionCase.key + 1» : return «indexedUnionCase.value.name».create(reader, objectOffset: caseObjectOffset)
			«ENDFOR»
			default : return nil
			}
		}
«««		private func fromJSON_«union.name»(dict : NSDictionary, typeName : String) -> «union.name»? {
«««			switch typeName {
«««			«FOR unionCase : union.unionCases»
«««			case "«unionCase.name»" : return «unionCase.name».fromJSON(dict)
«««			«ENDFOR»
«««			default : return nil
«««			}
«««		}
		
		fileprivate func create_«union.name»_Direct<T : FlatBuffersReader>(_ reader : T, propertyIndex : Int, objectOffset : Offset?) -> «union.name»_Direct? {
			guard let objectOffset = objectOffset else {
				return nil
			}
			let unionCase : Int8 = reader.get(objectOffset: objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
			guard let caseObjectOffset : Offset = reader.offset(objectOffset: objectOffset, propertyIndex:propertyIndex + 1) else {
				return nil
			}
			switch unionCase {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case «indexedUnionCase.key + 1» : return «indexedUnionCase.value.name»_Direct<T>(reader: reader, myOffset: caseObjectOffset)
			«ENDFOR»
			default : return nil
			}
		}
		private func unionCase_«union.name»(_ union : «union.name»?) -> Int8 {
			switch union {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case is «indexedUnionCase.value.name» : return «indexedUnionCase.key + 1»
			«ENDFOR»
			default : return 0
			}
		}
		fileprivate func addToByteArray_«union.name»(_ builder : FlatBuffersBuilder, union : «union.name»?) throws -> Offset {
			switch union {
			«FOR indexedUnionCase : union.unionCases.indexed»
			case let u as «indexedUnionCase.value.name» : return try u.addToByteArray(builder)
			«ENDFOR»
			default : return 0
			}
		}
	'''
	
	def generateFromByteArrayExtension(Table table) '''
		public extension «table.name» {
			public static func make«table.name.toFirstUpper»(data : Data,  cache : FlatBuffersReaderCache? = FlatBuffersReaderCache()) -> «table.name»? {
				let reader = FlatBuffersMemoryReader(data: data, cache: cache)
				return make«table.name.toFirstUpper»(reader: reader)
			}
			public static func make«table.name.toFirstUpper»(reader : FlatBuffersReader) -> «table.name»? {
				let objectOffset = reader.rootObjectOffset
				return create(reader, objectOffset : objectOffset)
			}
		}
	'''
	
	def generateCreateExtension(Table table) '''
		public extension «table.name» {
			fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> «table.name»? {
				guard let objectOffset = objectOffset else {
					return nil
				}
				if  let cache = reader.cache,
					let o = cache.objectPool[objectOffset] {
					return o as? «table.name»
				}
				«FOR indexedField : table.indexedFields»
				«indexedField.readDataIntoLocalVariables»
				«ENDFOR»
				let _result = «table.name»(«FOR indexedField : table.indexedFields SEPARATOR ","»«indexedField.value.fieldName»: «indexedField.value.fieldName»«ENDFOR»)
				if let cache = reader.cache {
					cache.objectPool[objectOffset] = _result
				}
				return _result
			}
		}
	'''
	
	def readDataIntoLocalVariables(Pair<Integer, Field> indexedField){
		val field = indexedField.value
		val type = field.getType
		if(type.isScalar){
			'''
				let «field.fieldName»: «type.asSwiftFieldType(!field.isRequired)» = reader.get(objectOffset: objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString»)
			'''
		} else if(indexedField.value.getType.isEnum){
			'''
				let «indexedField.value.fieldName» = «indexedField.value.getType.defType.name»(rawValue: reader.get(objectOffset: objectOffset, propertyIndex: «indexedField.key», defaultValue: «indexedField.value.defaultValueString».rawValue))«IF field.isRequired»!«ENDIF»
			'''
		} else if(indexedField.value.getType.isString){
			//TODO: string cache
			'''
				let «indexedField.value.fieldName» = (reader.stringBuffer(stringOffset: reader.offset(objectOffset: objectOffset, propertyIndex: «indexedField.key»))?§)«IF indexedField.value.isRequired»!«ENDIF»
			'''
		} else if(indexedField.value.getType.vectorType != null && !indexedField.value.getType.isUnionVector) {
			'''
				let offset_«indexedField.value.fieldName» : Offset? = reader.offset(objectOffset: objectOffset, propertyIndex: «indexedField.key»)
				let length_«indexedField.value.fieldName» = reader.vectorElementCount(vectorOffset: offset_«indexedField.value.fieldName»)
				var «indexedField.value.fieldName»: [«indexedField.value.getType.vectorType.type.asSwiftFieldType(false)»] = []
				if(length_«indexedField.value.fieldName» > 0){
					var index = 0
					«indexedField.value.fieldName».reserveCapacity(length_«indexedField.value.fieldName»)
					while index < length_«indexedField.value.fieldName» {
						«indexedField.value.accessVectorItem»
						index += 1
					}
				}
			'''
		} else if(indexedField.value.getType.isTable) {
			'''
				let «indexedField.value.fieldName» = «indexedField.value.getType.asSwiftFieldType».create(reader, objectOffset: reader.offset(objectOffset: objectOffset, propertyIndex: «indexedField.key»))«IF field.isRequired»!«ENDIF»
			'''
		} else if(indexedField.value.getType.isUnion) {
			'''
				let «indexedField.value.fieldName» = create_«indexedField.value.getType.defType.name»(reader, propertyIndex: «indexedField.key», objectOffset: objectOffset)«IF field.isRequired»!«ENDIF»
			'''
		} else if(indexedField.value.getType.isStruct) {
			'''
				let «indexedField.value.fieldName» = reader.get(objectOffset: objectOffset, propertyIndex: «indexedField.key»)«IF field.isRequired»!«ENDIF»
			'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def generateToByteArrayExtension(Table table) '''
		
		public extension «table.name» {
			public func encode(withBuilder builder : FlatBuffersBuilder) throws -> Void {
				let offset = try addToByteArray(builder)
				«IF table.isRecursive»
				try performLateBindings(builder)
				«ENDIF»
				try builder.finish(offset: offset, fileIdentifier: «IF fileIdentifier == null»nil«ELSE»"«fileIdentifier»"«ENDIF»)
			}
			public func makeData(withOptions options : FlatBuffersBuilderOptions = FlatBuffersBuilderOptions()) throws -> Data {
				let builder = FlatBuffersBuilder(options: options)
				try encode(withBuilder: builder)
				return builder.makeData
			}
		}
		
	'''
	
	def generateAddToByteArrayExtension(Table table) '''
		public extension «table.name» {
			fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
				if builder.options.uniqueTables {
					if let myOffset = builder.cache[ObjectIdentifier(self)] {
						return myOffset
					}
				}
				«IF table.isRecursive»
				if builder.inProgress.contains(ObjectIdentifier(self)){
					return 0
				}
				builder.inProgress.insert(ObjectIdentifier(self))
				«ENDIF»
				«FOR indexedField : table.indexedFields.reverse»
				«indexedField.value.createOffsetForField(indexedField.key)»
				«ENDFOR»
				try builder.startObject(withPropertyCount: «table.numberOfFields»)
				«FOR indexedField : table.indexedFields.reverse»
				«indexedField.value.addPropertyOrOffsetToObject(indexedField.key)»
				«ENDFOR»
				let myOffset =  try builder.endObject()
				if builder.options.uniqueTables {
					builder.cache[ObjectIdentifier(self)] = myOffset
				}
				«IF table.isRecursive»
				builder.inProgress.remove(ObjectIdentifier(self))
				«ENDIF»
				return myOffset
			}
		}
	'''
	
	def generateJSONSupport(Table t) '''
	extension «t.name» {
		public func toJSON() -> String{
			var properties : [String] = []
			«FOR field : t.fields»
			«field.generateJSONPropertyStatement»
			«ENDFOR»
			
			return "{\(properties.joinWithSeparator(","))}"
		}

		public static func fromJSON(dict : NSDictionary) -> «t.name» {
			let result = «t.name»()
			«FOR field : t.fields»
			«field.generateJsonToTableProperty»
			«ENDFOR»
			return result
		}
		
		public func jsonTypeName() -> String {
			return "\"«t.name»\""
		}
	}
	'''
	
	def generateJsonToTableProperty(Field field){
		val fieldName = if(field.deprecated)  '''__«field.name»''' else field.name
		if (field.type.scalar){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSNumber {
				result.«fieldName» = «field.generateNSNumberExpression»
			}
			'''
		}
		if (field.type.string){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSString {
				result.«fieldName» = «field.name» as String
			}
			'''
		}
		if (field.type.enum){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSString {
				result.«fieldName» = «field.type.asSwiftFieldType».fromJSON(«field.name» as String)
			}
			'''
		}
		if (field.type.table || field.type.struct){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSDictionary {
				result.«fieldName» = «field.type.asSwiftFieldType».fromJSON(«field.name»)
			}
			'''
		}
		if (field.type.union){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSDictionary, let «field.name»_type = dict["«field.name»_type"] as? NSString {
				result.«fieldName» = fromJSON_«field.type.asSwiftFieldType»(«field.name», typeName: «field.name»_type as String)
			}
			'''
		}
		if (field.type.tableVector || field.type.structVector){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSArray {
				result.«fieldName» = ContiguousArray(«field.name».map({
					if let entry = $0 as? NSDictionary {
						return «field.type.vectorType.type.asSwiftFieldType».fromJSON(entry)
					}
					return nil
				}))
			}
			'''
		}
		if (field.type.enumVector){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSArray {
				result.«fieldName» = ContiguousArray(«field.name».map({
					if let entry = $0 as? NSString {
						return «field.type.vectorType.type.asSwiftFieldType».fromJSON(entry as String)
					}
					return nil
				}))
			}
			'''
		}
		if (field.type.scalarVector){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSArray {
				result.«fieldName» = ContiguousArray(«field.name».map({
					if let entry = $0 as? NSNumber {
						return «field.type.vectorType.type.generateNSNumberExpression("entry")»
					}
					return 0
				}))
			}
			'''
		}
		if (field.type.stringVector){
			return '''
			if let «field.name» = dict["«field.name»"] as? NSArray {
				result.«fieldName» = ContiguousArray(«field.name».map({
					if let entry = $0 as? NSString {
						return entry as String
					}
					return nil
				}))
			}
			'''
		}
		
		return '''// UNEXPECTED «fieldName»'''
	}
	
	def generateNSNumberExpression(Field field){
		field.type.generateNSNumberExpression(field.name)
	}
	
	def generateNSNumberExpression(Type type, String name){
		if (!type.isScalar){
			return ''''''
		}
		return '''«name».«type.primType.generateNSNumberExpression»'''
	}
	
	def generateNSNumberExpression(String primType){
		switch primType {
			case 'bool' : '''boolValue'''
			case 'byte' : '''charValue'''
			case 'ubyte' : '''unsignedCharValue'''
			case 'short' : '''shortValue'''
			case 'ushort' : '''unsignedShortValue'''
			case 'int' : '''intValue'''
			case 'uint' : '''unsignedIntValue'''
			case 'float' : '''floatValue'''
			case 'long' : '''longLongValue'''
			case 'ulong' : '''unsignedLongLongValue'''
			case 'double' : '''doubleValue'''
			default : ''''''
		}
	}
	
	def generateJSONPropertyStatement(Field field){
		if (field.isDeprecated){
			return ''''''
		}
		if (field.type.scalar){
			return '''
			properties.append("\"«field.name»\":\(«field.name»)")
			'''
		}
		if (field.type.string){
			return '''
			if let «field.name» = «field.name»{
				properties.append("\"«field.name»\":\"\(«field.name»)\"")
			}
			'''
		}
		if (field.type.table || field.type.struct || field.type.enum){
			return '''
			if let «field.name» = «field.name»{
				properties.append("\"«field.name»\":\(«field.name».toJSON())")
			}
			'''
		}
		if (field.type.union){
			return '''
			if let «field.name» = «field.name»{
				properties.append("\"«field.name»\":\(«field.name».toJSON()),\"«field.name»_type\":\(«field.name».jsonTypeName())")
			}
			'''
		}
		if (field.type.scalarVector){
			return '''
			properties.append("\"«field.name»\":[\(«field.name».map({String($0)}).joinWithSeparator(","))]")
			'''
				
		}
		if (field.type.stringVector){
			return '''
			let «field.name»_List = «field.name».map({$0 == nil ? "null" : "\"\($0!)\""}).joinWithSeparator(",")
			properties.append("\"«field.name»\":[\(«field.name»_List)]")
			'''
		}
		if (field.type.tableVector || field.type.structVector || field.type.enumVector){
			return '''
			properties.append("\"«field.name»\":[\(«field.name».map({$0 == nil ? "null" : $0!.toJSON()}).joinWithSeparator(","))]")
			'''
		}
		return '''// UNEXPECTED «field.name»'''
	}
	
	def numberOfFields(Table t) {
		if(t.fields.isEmpty) return 0
		
		val lastField = t.indexedFields.last
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
			'''
			let offset«index» = try builder.insert(value: «field.fieldName»)
			'''
		} else if(field.getType.isTable){
			if(field.isRequired) {
				'''
				let offset«index» = try «field.fieldName».addToByteArray(builder)
				'''
			} else {
				'''
				let offset«index» = try «field.fieldName»?.addToByteArray(builder) ?? 0
				'''	
			}
		} else if(field.getType.isUnion){
			'''let offset«index» = try addToByteArray_«field.getType.defType.name»(builder, union: «field.fieldName»)'''
		} else if(field.getType.isScalarVector || field.getType.isEnumVector || field.getType.isStructVector){
			'''
			var offset«index» = Offset(0)
			if «field.fieldName».count > 0 {
				try builder.startVector(count: «field.fieldName».count, elementSize: MemoryLayout<«field.type.vectorType.type.asSwiftFieldType»>.stride)
				var index = «field.fieldName».count - 1
				while(index >= 0){
					«field.vectorOffsetPutStatementDirect»
					index -= 1
				}
				offset«index» = builder.endVector()
			}'''
		} else if(field.type.isStringVector || field.getType.isTableVector){
			'''
			var offset«index» = Offset(0)
			if «field.fieldName».count > 0{
				var offsets = [Offset?](repeating: nil, count: «field.fieldName».count)
				var index = «field.fieldName».count - 1
				«IF field.type.isTableVector && field.type.vectorType.type.defType.isRecursive»
				var deferedBindingObjects : [Int : «field.type.vectorType.type.defType.name»] = [:]
				«ENDIF»
				while(index >= 0){
					«field.vectorOffsetPutStatementInDirect»
					«IF field.type.isTableVector && field.type.vectorType.type.defType.isRecursive»
					if offsets[index] == 0 {
						deferedBindingObjects[index] = «field.fieldName»[index]
					}
					«ENDIF»
					index -= 1
				}
				try builder.startVector(count: «field.fieldName».count, elementSize: MemoryLayout<Offset>.stride)
				index = «field.fieldName».count - 1
				«IF field.getType.isTableVector && field.type.vectorType.type.defType.isRecursive»
				var deferedBindingCursors : [Int : Int] = [:]
				«ENDIF»
				while(index >= 0){
					«IF field.getType.isTableVector && field.type.vectorType.type.defType.isRecursive»let cursor = «ENDIF»try builder.insert(offset: offsets[index])
					«IF field.getType.isTableVector && field.type.vectorType.type.defType.isRecursive»
					if offsets[index] == 0 {
						deferedBindingCursors[index] = cursor
					}
					«ENDIF»
					index -= 1
				}
				«IF field.type.isTableVector && field.type.vectorType.type.defType.isRecursive»
				for key in deferedBindingObjects.keys {
					if let object = deferedBindingObjects[key],
					   let cursor = deferedBindingCursors[key] {
						builder.deferedBindings.append((object: object, cursor: cursor))
					}
				}
				«ENDIF»
				offset«index» = builder.endVector()
			}'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def vectorOffsetPutStatementDirect(Field field){
		if(field.getType.isEnumVector){
			'''
			if let value = «field.fieldName»[index]?.rawValue {
				builder.insert(value: value)
			}
			'''
		} else if(field.getType.isScalarVector || field.getType.isStructVector){
			'''
			builder.insert(value: «field.fieldName»[index])'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def vectorOffsetPutStatementInDirect(Field field){
		if(field.getType.isStringVector){
			'''offsets[index] = try builder.insert(value: «field.fieldName»[index])'''
		} else if(field.getType.isTableVector){
			'''offsets[index] = try «field.fieldName»[index].addToByteArray(builder)'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def addPropertyOrOffsetToObject(Field field, Integer index){
		if(field.isDeprecated){
			'''// «field.fieldName» is deprecated'''
		} else if(field.getType.isTable) {
			'''
			«IF !field.isRequired»if «field.fieldName» != nil {«ENDIF»
				«IF field.type.defType.isRecursive»
				let cursor«index» = try builder.insert(offset: offset«index», toStartedObjectAt: «index»)
				if offset«index» == 0 {
					if let object = «field.fieldName» {
						builder.deferedBindings.append((object: object, cursor: cursor«index»))
					}
				}
				«ELSE»
				try builder.insert(offset: offset«index», toStartedObjectAt: «index»)
				«ENDIF»
			«IF !field.isRequired»}«ENDIF»
			'''
		} else if(field.getType.isString) {
			'''try builder.insert(offset: offset«index», toStartedObjectAt: «index»)'''
		} else if(field.getType.vectorType != null) {
			'''
			if «field.fieldName».count > 0 {
				try builder.insert(offset: offset«index», toStartedObjectAt: «index»)
			}
			'''
		} else if(field.getType.isScalar) {
			'''try builder.insert(value : «field.fieldName», defaultValue : «field.defaultValueString», toStartedObjectAt: «index»)'''
		} else if(field.getType.isEnum) {
			'''try builder.insert(value : «field.fieldName»«IF field.isRequired».rawValue«ELSE»?.rawValue ?? 0«ENDIF», defaultValue : 0, toStartedObjectAt: «index»)'''
		} else if(field.getType.isUnion) {
			'''
			if let object = «field.fieldName» {
				«IF field.type.defType.isRecursive»
				let cursor«index» = try builder.insert(offset: offset«index», toStartedObjectAt: «index+1»)
				if offset«index» == 0 {
					builder.deferedBindings.append((object: object, cursor: cursor«index»))
				}
				«ELSE»
				try builder.insert(offset: offset«index», toStartedObjectAt: «index+1»)
				«ENDIF»
				try builder.insert(value : unionCase_«field.getType.defType.name»(object), defaultValue : 0, toStartedObjectAt: «index»)
			}'''
		} else if(field.getType.isStruct) {
			'''
			if let «field.fieldName» = «field.fieldName» {
				builder.insert(value: «field.fieldName»)
				try builder.insertCurrentOffsetAsProperty(toStartedObjectAt: «index»)
			}'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def accessVectorItem(Field field){
		if(field.getType.isScalarVector || field.getType.isStructVector) {
			'''
			if let element : «field.getType.vectorType.type.asSwiftFieldType(false)» = reader.vectorElementScalar(vectorOffset: offset_«field.fieldName», index: index) {
				«field.fieldName».append(element)
			}
			'''
		} else if(field.getType.isEnumVector) {
			'''
			if let raw : «(field.getType.vectorType.type.defType as Enum).type.convertPrimitiveTypeToSwiftTypes» = reader.vectorElementScalar(vectorOffset: offset_«field.fieldName», index: index){
				let element : «field.getType.vectorType.type.asSwiftFieldType(true)» = «field.getType.vectorType.type.asSwiftFieldType(false)»(rawValue: raw)
				«field.fieldName».append(element)
			} else {
				«field.fieldName».append(nil)
			}
			'''
		} else if(field.getType.isStringVector) {
			'''
			if let element = reader.stringBuffer(stringOffset: reader.vectorElementOffset(vectorOffset: offset_«field.fieldName», index: index))?§ {
				«field.fieldName».append(element)
			}
			'''
		} else if(field.getType.isTableVector) {
			'''
			if let element = «field.getType.vectorType.type.defType.name».create(reader, objectOffset: reader.vectorElementOffset(vectorOffset: offset_«field.fieldName», index: index)) {
				«field.fieldName».append(element)
			}
			'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def fieldName(Field field){
		if(field.isDeprecated){
			'''__«field.getName»'''
		} else {
			'''«field.getName»'''
		}
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
	
	def convertPrimitiveTypeToSwiftTypes(String type) {
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
	
	
	
	
	
	
	
	
	
	
	def generateDirectDataStructureForTable(Table table) '''
		public struct «table.name»_Direct<T : FlatBuffersReader> : Hashable, FlatBuffersDirectAccess {
			fileprivate let reader : T
			fileprivate let myOffset : Offset
			public init?<R : FlatBuffersReader>(reader: R, myOffset: Offset?) {
				guard let myOffset = myOffset, let reader = reader as? T else {
					return nil
				}
				self.reader = reader
				self.myOffset = myOffset
			}
			«IF table.name == rootTableName»
			public init?(_ reader: T) {
				self.reader = reader
				guard let offest = reader.rootObjectOffset else {
					return nil
				}
				self.myOffset = offest
			}
			«ENDIF»
			«FOR field : table.indexedFields»
			«field.generatedDirectComputedProperties»
			«ENDFOR»
			public var hashValue: Int { return Int(myOffset) }
		}
		public func ==<T>(t1 : «table.name»_Direct<T>, t2 : «table.name»_Direct<T>) -> Bool {
			return t1.reader.isEqual(other: t2.reader) && t1.myOffset == t2.myOffset
		}
	'''
	
	def generatedDirectComputedProperties(Pair<Integer, Field> indexedField){
		val field = indexedField.value
		val index = indexedField.key
		var isOptional = !field.isRequired
		if(field.getType.isScalar){
			'''
				public var «field.fieldName» : «field.type.asSwiftFieldTypeDirect(isOptional)» { 
					get { return reader.get(objectOffset: myOffset, propertyIndex: «index», defaultValue: «field.defaultValueString») }
				}
			'''
		} else if(field.getType.isEnum){
			'''
				public var «field.fieldName» : «field.type.asSwiftFieldTypeDirect(isOptional)» { 
					get { return «field.getType.defType.name»(rawValue: reader.get(objectOffset: myOffset, propertyIndex: «index», defaultValue: «field.defaultValueString».rawValue))«IF field.isRequired»!«ENDIF» }
				}
			'''
		} else if(field.getType.isString){
			var forceUnwrap = ''
			if (!isOptional) forceUnwrap = '!'
			'''
				public var «field.fieldName» : «field.type.asSwiftFieldTypeDirect(isOptional)» { get {
					return reader.stringBuffer(stringOffset: reader.offset(objectOffset: myOffset, propertyIndex:«index»))«forceUnwrap»
				} }
			'''
		} else if(field.type.isStringVector){
			'''
				public var «field.name» : FlatBuffersStringVector<T> {
					let offsetList = reader.offset(objectOffset: myOffset, propertyIndex: «index»)
					return FlatBuffersStringVector(reader: self.reader, myOffset: offsetList)
				}
			'''
		} else if(field.type.isTableVector){
			'''
				public var «field.name» : FlatBuffersTableVector<«field.type.vectorType.type.asSwiftFieldTypeDirect(false)», T> {
					let offsetList = reader.offset(objectOffset: myOffset, propertyIndex: «index»)
					return FlatBuffersTableVector(reader: self.reader, myOffset: offsetList)
				}
			'''
		} else if(field.type.isScalarVector || field.type.isStructVector){
			'''
				public var «field.name» : FlatBuffersScalarVector<«field.type.vectorType.type.asSwiftFieldTypeDirect(false)», T> {
					let offsetList = reader.offset(objectOffset: myOffset, propertyIndex: «index»)
					return FlatBuffersScalarVector(reader: self.reader, myOffset: offsetList)
				}
			'''
		} else if(field.getType.isEnumVector) {
			'''
				public var «field.name»Count : Int {
					return reader.vectorElementCount(vectorOffset: reader.offset(objectOffset: myOffset, propertyIndex: «index»))
				}
				public func «field.name»Element(atIndex index : Int) -> «field.type.vectorType.type.asSwiftFieldTypeDirect(isOptional)» {
					let offsetList = reader.offset(objectOffset: myOffset, propertyIndex: «index»)
					«field.accessVectorItemDirect»
				}
			'''
		} else if(field.getType.isTable) {
			'''
				public var «field.fieldName» : «field.type.asSwiftFieldTypeDirect(isOptional)» { get {
					«IF isOptional»guard «ENDIF»let offset = reader.offset(objectOffset: myOffset, propertyIndex: «index»)«IF isOptional» else { return nil }«ENDIF»
					return «field.type.defType.name»_Direct(reader: reader, myOffset: offset)«IF !isOptional»!«ENDIF»
				} }
			'''
		} else if(field.getType.isUnion) {
			'''
				public var «field.fieldName» : «field.type.asSwiftFieldTypeDirect(isOptional)» { get { 
					return create_«field.type.defType.name»_Direct(reader, propertyIndex: «index», objectOffset: self.myOffset)
				} }
			'''
		} else if(field.getType.isStruct) {
			'''
				public var «field.fieldName» : «field.type.asSwiftFieldTypeDirect(isOptional)» { 
					get { return reader.get(objectOffset: myOffset, propertyIndex: «index»)}
				}
			'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def accessVectorItemDirect(Field field){
		if(field.getType.isScalarVector) {
			'''return reader.vectorElementScalar(vectorOffset: offsetList, index: index)'''
		} else if(field.getType.isEnumVector) {
			'''
			guard let rawValue : «(field.getType.vectorType.type.defType as Enum).type.convertPrimitiveTypeToSwiftTypes» = reader.vectorElementScalar(vectorOffset: offsetList, index: index) else {
				return nil
			}
			return «field.getType.vectorType.type.defType.name»(rawValue: rawValue)
			'''
		} else if(field.getType.isStringVector) {
			'''
			if let ofs = reader.vectorElementOffset(vectorOffset: offsetList, index: index) {
				return reader.stringBuffer(stringOffset: ofs)
			}
			return nil
			'''
		} else if(field.getType.isTableVector) {
			'''
			if let ofs = reader.vectorElementOffset(vectorOffset: offsetList, index: index) {
				return «field.type.vectorType.type.asSwiftFieldTypeDirect(false)»(reader: reader, myOffset: ofs)
			}
			return nil
			'''
		} else if(field.getType.isStructVector) {
			'''
			let result : «field.getType.vectorType.type.defType.name»? = reader.vectorElementScalar(vectorOffset: offsetList, index: index)
			return result
			'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def String asSwiftFieldTypeDirect(Type type, boolean withOptional){
		var swiftType = type.asSwiftFieldType(withOptional)
		if(type.isTable){
			swiftType = type.defType.name + "_Direct<T>"
			if(withOptional){
				swiftType += "?"
			}
		} else if (type.isString) {
			swiftType = '''UnsafeBufferPointer<UInt8>'''
			if(withOptional){
				swiftType += "?"
			}
		} else if (type.isUnion) {
			swiftType = type.defType.name + "_Direct"
			if(withOptional){
				swiftType += "?"
			}
		}
		
		swiftType
	}
	
}