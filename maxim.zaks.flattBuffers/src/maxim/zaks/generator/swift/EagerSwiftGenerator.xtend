package maxim.zaks.generator.swift

import maxim.zaks.flatBuffers.Schema
import maxim.zaks.flatBuffers.Table
import maxim.zaks.flatBuffers.Type
import maxim.zaks.flatBuffers.Enum
import maxim.zaks.flatBuffers.Struct
import maxim.zaks.flatBuffers.Union
import maxim.zaks.generator.ModelExtensions;
import java.util.ArrayList
import maxim.zaks.flatBuffers.Definition
import maxim.zaks.flatBuffers.StructField
import maxim.zaks.flatBuffers.Field

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
		«schema.generatePerformLateBindings»
«««		«FOR namespacePart : namespaceParts»
«««		}
«««		«ENDFOR»
		«IF inclusionRule == InfrastructureInclusionRule.Include»
		// MARK: Generic Type Definitions
		«SwiftLibraryGenericTypes.definitions»
		// MARK: Reader
		«SwiftLibraryReader.definitions»
		// MARK: Builder
		«SwiftLibraryBuilder.definitions»
		«ENDIF»
		'''
	}
	
	def generatePerformLateBindings(Schema schema)'''
		private func performLateBindings(builder : FlatBufferBuilder) {
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
				case let object as «definition.name»: try! builder.replaceOffset(object.addToByteArray(builder), atCursor: binding.cursor)
				'''
//			Union case definition: 
//				'''
//				performLateBindings_«definition.name»(builder)
//				'''
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
			Struct case definition: definition.generateMainStructForStruct
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
		«table.generateLazyAccessExtension(table.name == rootTableName)»
		«table.generateAddToByteArrayExtension»
	'''
		
	def generateAllForUnion(Union union)'''
		«union.generateProtocolAndTableExtensionsForUnion»
		«union.generateCreaterFunctionForUnion»
	'''
	
	def generateMainDataStructureForTable(Table table) '''
		public final class «table.name» {
			public static var maxInstanceCacheSize : UInt = 0
			public static var instancePool : [«table.name»] = []
			«FOR field : table.fields»
			«IF field.type.isString»
			public var «field.fieldName» : String? {
				get {
					if let s = «field.fieldName»_s {
						return s
					}
					if let s = «field.fieldName»_ss {
						«field.fieldName»_s = s.stringValue
					}
					if let s = «field.fieldName»_b {
						«field.fieldName»_s = String.init(bytesNoCopy: UnsafeMutablePointer<UInt8>(s.baseAddress), length: s.count, encoding: NSUTF8StringEncoding, freeWhenDone: false)
					}
					return «field.fieldName»_s
				}
				set {
					«field.fieldName»_s = newValue
					«field.fieldName»_ss = nil
					«field.fieldName»_b = nil
				}
			}
			public func «field.fieldName»StaticString(newValue : StaticString) {
				«field.fieldName»_ss = newValue
				«field.fieldName»_s = nil
				«field.fieldName»_b = nil
			}
			private var «field.fieldName»_b : UnsafeBufferPointer<UInt8>? = nil
			public var «field.fieldName»Buffer : UnsafeBufferPointer<UInt8>? {return «field.fieldName»_b}
			private var «field.fieldName»_s : String? = nil
			private var «field.fieldName»_ss : StaticString? = nil
			
			«ELSE»
			public var «field.fieldName» : «field.getType.asSwiftFieldType(true)» = «field.defaultValueStringWithVector»
			«ENDIF»
			«ENDFOR»
			public init(){}
			«IF !table.fields.filter[!it.isDeprecated].empty»
			public init(«FOR field : table.fields.filter[!it.isDeprecated] SEPARATOR ', '»«field.fieldName»: «field.getType.asSwiftFieldType(true)»«ENDFOR»){
				«FOR field : table.fields.filter[!it.isDeprecated]»
				«IF field.type.isString»
				self.«field.fieldName»_s = «field.fieldName»
				«ELSE»
				self.«field.fieldName» = «field.fieldName»
				«ENDIF»
				«ENDFOR»
			}
			«IF !table.fields.filter[it.type.isString].empty»
			public init(«FOR field : table.fields.filter[!it.isDeprecated] SEPARATOR ', '»«field.fieldName»: «IF field.type.isString»StaticString?«ELSE»«field.getType.asSwiftFieldType(true)»«ENDIF»«ENDFOR»){
				«FOR field : table.fields.filter[!it.isDeprecated]»
				«IF field.type.isString»
				self.«field.fieldName»_ss = «field.fieldName»
				«ELSE»
				self.«field.fieldName» = «field.fieldName»
				«ENDIF»
				«ENDFOR»
			}
			«ENDIF»
			«ENDIF»
		}
		
		extension «table.name» : PoolableInstances {
			public func reset() { 
				«FOR field : table.fields.filter[!it.isDeprecated]»
				«IF field.type.isTableVector»
				while («field.fieldName».count > 0) {
					var x = «field.fieldName».removeLast()!
					«field.type.vectorType.type.asSwiftFieldType».reuseInstance(&x)
				}
				«ELSEIF field.type.isTable»
				if «field.fieldName» != nil {
					var x = «field.fieldName»!
					«field.fieldName» = nil
					«field.type.asSwiftFieldType».reuseInstance(&x)
				}
				«ELSE»
				«field.fieldName» = «field.defaultValueStringWithVector»
				«ENDIF»
				«ENDFOR»
			}
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
			swiftType = '''[«type.vectorType.type.asSwiftFieldType(true)»]'''
		}
		swiftType
	}
	
	def generateMainStructForStruct(Struct struct) '''
		public struct «struct.name» : Scalar {
			«FOR field : struct.fields»
			public let «field.name» : «field.swiftTypeForStructField»
			«ENDFOR»
		}
		public func ==(v1:«struct.name», v2:«struct.name») -> Bool {
			return «FOR field : struct.fields SEPARATOR " && "» v1.«field.name»==v2.«field.name»«ENDFOR»
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
	
	def generateMainEnumForEnum(Enum e) '''
		public enum «e.name»«IF e.type != null» : «e.type.convertPrimitiveTypeToSwiftTypes»«ENDIF» {
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
			public static func fromByteArray(data : UnsafeBufferPointer<UInt8>, config : BinaryReadConfig = BinaryReadConfig()) -> «table.name» {
				let reader = FlatBufferReader.create(data, config: config)
				let objectOffset = reader.rootObjectOffset
				let result = create(reader, objectOffset : objectOffset)!
				FlatBufferReader.reuse(reader)
				return result
			}
			public static func fromRawMemory(data : UnsafeMutablePointer<UInt8>, count : Int, config : BinaryReadConfig = BinaryReadConfig()) -> «table.name» {
				let reader = FlatBufferReader.create(data, count: count, config: config)
				let objectOffset = reader.rootObjectOffset
				let result = create(reader, objectOffset : objectOffset)!
				FlatBufferReader.reuse(reader)
				return result
			}
			public static func fromFlatBufferReader(flatBufferReader : FlatBufferReader) -> «table.name» {
				return create(flatBufferReader, objectOffset : flatBufferReader.rootObjectOffset)!
			}
		}
	'''
	
	def generateCreateExtension(Table table) '''
		public extension «table.name» {
			private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> «table.name»? {
				guard let objectOffset = objectOffset else {
					return nil
				}
				if reader.config.uniqueTables {
					if let o = reader.objectPool[objectOffset]{
						return o as? «table.name»
					}
				}
				let _result = «table.name».createInstance()
				if reader.config.uniqueTables {
					reader.objectPool[objectOffset] = _result
				}
				«FOR indexedField : table.indexedFields»
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
				_result.«indexedField.value.fieldName»_b = reader.getStringBuffer(reader.getOffset(objectOffset, propertyIndex: «indexedField.key»))
			'''
		} else if(indexedField.value.getType.vectorType != null && !indexedField.value.getType.isUnionVector) {
			'''
				let offset_«indexedField.value.fieldName» : Offset? = reader.getOffset(objectOffset, propertyIndex: «indexedField.key»)
				let length_«indexedField.value.fieldName» = reader.getVectorLength(offset_«indexedField.value.fieldName»)
				if(length_«indexedField.value.fieldName» > 0){
					var index = 0
					_result.«indexedField.value.fieldName».reserveCapacity(length_«indexedField.value.fieldName»)
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
				_result.«indexedField.value.fieldName» = reader.get(objectOffset, propertyIndex: «indexedField.key»)
			'''
		} else {
			'''/* unsupported case */'''
		}
	}
	
	def generateLazyAccessExtension(Table table, boolean isRoot) '''
		public extension «table.name» {
			public final class LazyAccess : Hashable {
				private let _reader : FlatBufferReader!
				private let _objectOffset : Offset!
				«IF isRoot»
				public init(data : UnsafeBufferPointer<UInt8>, config : BinaryReadConfig = BinaryReadConfig()){
					_reader = FlatBufferReader.create(data, config: config)
					_objectOffset = _reader.rootObjectOffset
				}
				deinit{
					FlatBufferReader.reuse(_reader)
				}
				public var data : [UInt8] {
					return _reader.data
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

				«FOR indexedField : table.indexedFields»
				«indexedField.value.lazyFieldAccessor(indexedField.key)»
				«ENDFOR»

				public var createEagerVersion : «table.name»? { return «table.name».create(_reader, objectOffset: _objectOffset) }
				
				public var hashValue: Int { return Int(_objectOffset) }
			}
		}
		
		public func ==(t1 : «table.name».LazyAccess, t2 : «table.name».LazyAccess) -> Bool {
			return t1._objectOffset == t2._objectOffset && t1._reader === t2._reader
		}
		
	'''
	
	def lazyFieldAccessor(Field field, Integer index){
		if(field.getType.isScalar){
			'''
			public var «field.fieldName» : «field.getType.asSwiftFieldType» { 
				get { return _reader.get(_objectOffset, propertyIndex: «index», defaultValue:«field.defaultValueString»)}
				set { try!_reader.set(_objectOffset, propertyIndex: «index», value: newValue)}
			}'''
		} else if(field.getType.isString){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType(true)» = self._reader.getString(self._reader.getOffset(self._objectOffset, propertyIndex: «index»))'''
		} else if(field.getType.isTable){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType».LazyAccess? = «field.getType.defType.name».LazyAccess(reader: self._reader, objectOffset : self._reader.getOffset(self._objectOffset, propertyIndex: «index»))'''
		} else if(field.getType.isEnum){
			'''
			public var «field.fieldName» : «field.getType.asSwiftFieldType(true)» { 
				get { return «field.getType.defType.name»(rawValue: _reader.get(self._objectOffset, propertyIndex: «index», defaultValue:«field.defaultValueString».rawValue))}
				set { 
					if let value = newValue{
						try!_reader.set(_objectOffset, propertyIndex: «index», value: value.rawValue)
					}
				}
			}'''
		} else if(field.getType.isUnion){
			'''public lazy var «field.fieldName» : «field.getType.asSwiftFieldType»_LazyAccess? = create_«field.getType.defType.name»_LazyAccess(self._reader, propertyIndex: «index», objectOffset: self._objectOffset)'''
		} else if(field.getType.isStruct){
			val struct = field.getType.defType as Struct
			'''
			public var «field.fieldName» : «struct.name»? { 
				get { return self._reader.get(_objectOffset, propertyIndex: «index»)}
				set {
					if let value = newValue{
						try!_reader.set(_objectOffset, propertyIndex: «index», value: value)
					}
				}
			}
			'''
		} else if(field.getType.isStringVector || field.getType.isTableVector){
			'''
				public lazy var «field.fieldName» «field.getType.vectorType.type.lazyVectorTypeString» = { [self]
					let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: «index»)
					let vectorLength = self._reader.getVectorLength(vectorOffset)
					let reader = self._reader
					return LazyVector(count: vectorLength){ [reader] in
						«field.getType.vectorType.type.lazyVectorGeneratorImplementation»
					}
				}()'''
		} else if(field.getType.isStructVector || field.getType.isScalarVector || field.getType.isEnumVector){
			'''
				public lazy var «field.fieldName» «field.getType.vectorType.type.lazyVectorTypeString» = { [self]
					let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: «index»)
					let vectorLength = self._reader.getVectorLength(vectorOffset)
					let reader = self._reader
					return LazyVector(count: vectorLength, { [reader] in
						«field.getType.vectorType.type.lazyVectorGeneratorImplementation»
					}) { [reader] in
						«field.getType.vectorType.type.lazyVectorReplacerImplementation»
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
			'''reader.getVectorScalarElement(vectorOffset!, index: $0) as «type.asSwiftFieldType»'''
		} else if(type.isEnum){
			'''«type.asSwiftFieldType»(rawValue: reader.getVectorScalarElement(vectorOffset!, index: $0))'''
		} else if(type.isString){
			'''reader.getString(reader.getVectorOffsetElement(vectorOffset!, index: $0))'''
		} else if(type.isStruct){
			val struct = type.defType as Struct
			'''reader.getVectorScalarElement(vectorOffset!, index: $0) as «struct.name»'''
		} else if(type.isTable){
			'''«type.defType.name».LazyAccess(reader: reader, objectOffset : reader.getVectorOffsetElement(vectorOffset!, index: $0))'''
		} else '''/* unsupported case */'''
	}
	
	def lazyVectorReplacerImplementation(Type type){
		if(type.isScalar || type.isStruct){
			'''reader.setVectorScalarElement(vectorOffset!, index: $0, value: $1)'''
		} else if(type.isEnum){
			'''reader.setVectorScalarElement(vectorOffset!, index: $0, value: $1.rawValue)'''
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
			public func toByteArray (config : BinaryBuildConfig = BinaryBuildConfig()) -> [UInt8] {
				let builder = FlatBufferBuilder.create(config)
				let offset = addToByteArray(builder)
				performLateBindings(builder)
				try! builder.finish(offset, fileIdentifier: «IF fileIdentifier == null»nil«ELSE»"«fileIdentifier»"«ENDIF»)
				let result = builder.data
				FlatBufferBuilder.reuse(builder)
				return result
			}
		}
		
		public extension «table.name» {
			public func toFlatBufferBuilder (builder : FlatBufferBuilder) -> Void {
				let offset = addToByteArray(builder)
				performLateBindings(builder)
				try! builder.finish(offset, fileIdentifier: «IF fileIdentifier == null»nil«ELSE»"«fileIdentifier»"«ENDIF»)
			}
		}
		
	'''
	
	def generateAddToByteArrayExtension(Table table) '''
		public extension «table.name» {
			private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
				if builder.config.uniqueTables {
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
				try! builder.openObject(«table.numberOfFields»)
				«FOR indexedField : table.indexedFields.reverse»
				«indexedField.value.addPropertyOrOffsetToObject(indexedField.key)»
				«ENDFOR»
				let myOffset =  try! builder.closeObject()
				if builder.config.uniqueTables {
					builder.cache[ObjectIdentifier(self)] = myOffset
				}
				«IF table.isRecursive»
				builder.inProgress.remove(ObjectIdentifier(self))
				«ENDIF»
				return myOffset
			}
		}
	'''
	
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
			// let offset«index» = try! builder.createString(«field.fieldName»)
			var offset«index» : Offset
			if let s = «field.fieldName»_b {
				offset«index» = try! builder.createString(s)
			} else if let s = «field.fieldName»_ss {
				offset«index» = try! builder.createStaticString(s)
			} else {
				offset«index» = try! builder.createString(«field.fieldName»)
			}
			'''
		} else if(field.getType.isTable){
			'''
			let offset«index» = «field.fieldName»?.addToByteArray(builder) ?? 0
			'''
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
		} else if(field.type.isStringVector || field.getType.isTableVector){
			'''
			var offset«index» = Offset(0)
			if «field.fieldName».count > 0{
				var offsets = [Offset?](count: «field.fieldName».count, repeatedValue: nil)
				var index = «field.fieldName».count - 1
				«IF field.type.isTableVector && field.type.vectorType.type.defType.isRecursive»
				var deferedBindingObjects : [Int : «field.type.vectorType.type.defType.name»] = [:]
				«ENDIF»
				while(index >= 0){
					«field.vectorOffsetPutStatementInDirect»
					«IF field.type.isTableVector && field.type.vectorType.type.defType.isRecursive»
					if offsets[index] == 0 {
						deferedBindingObjects[index] = «field.fieldName»[index]!
					}
					«ENDIF»
					index -= 1
				}
				try! builder.startVector(«field.fieldName».count)
				index = «field.fieldName».count - 1
				«IF field.getType.isTableVector && field.type.vectorType.type.defType.isRecursive»
				var deferedBindingCursors : [Int : Int] = [:]
				«ENDIF»
				while(index >= 0){
					«IF field.getType.isTableVector && field.type.vectorType.type.defType.isRecursive»let cursor = «ENDIF»try! builder.putOffset(offsets[index])
					«IF field.getType.isTableVector && field.type.vectorType.type.defType.isRecursive»
					if offsets[index] == 0 {
						deferedBindingCursors[index] = cursor
					}
					«ENDIF»
					index -= 1
				}
				«IF field.type.isTableVector && field.type.vectorType.type.defType.isRecursive»
				for key in deferedBindingObjects.keys {
					builder.deferedBindings.append((object: deferedBindingObjects[key]!, cursor: deferedBindingCursors[key]!))
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
			'''builder.put(«field.fieldName»[index]!.rawValue)'''
		} else if(field.getType.isScalarVector){
			'''builder.put(«field.fieldName»[index])'''
		} else if(field.getType.isStructVector){
			'''
			builder.put(«field.fieldName»[index]!)
			'''
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
		} else if(field.getType.isTable) {
			'''
			if «field.fieldName» != nil {
				«IF field.type.defType.isRecursive»
				let cursor«index» = try! builder.addPropertyOffsetToOpenObject(«index», offset: offset«index»)
				if offset«index» == 0 {
					builder.deferedBindings.append((object: «field.fieldName»!, cursor: cursor«index»))
				}
				«ELSE»
				try! builder.addPropertyOffsetToOpenObject(«index», offset: offset«index»)
				«ENDIF»
			}
			'''
		} else if(field.getType.isString) {
			'''try! builder.addPropertyOffsetToOpenObject(«index», offset: offset«index»)'''
		} else if(field.getType.vectorType != null) {
			'''
			if «field.fieldName».count > 0 {
				try! builder.addPropertyOffsetToOpenObject(«index», offset: offset«index»)
			}
			'''
		} else if(field.getType.isScalar) {
			'''try! builder.addPropertyToOpenObject(«index», value : «field.fieldName», defaultValue : «field.defaultValueString»)'''
		} else if(field.getType.isEnum) {
			'''try! builder.addPropertyToOpenObject(«index», value : «field.fieldName»!.rawValue, defaultValue : 0)'''
		} else if(field.getType.isUnion) {
			'''
			if «field.fieldName» != nil {
				«IF field.type.defType.isRecursive»
				let cursor«index» = try! builder.addPropertyOffsetToOpenObject(«index+1», offset: offset«index»)
				if offset«index» == 0 {
					builder.deferedBindings.append((object: «field.fieldName»!, cursor: cursor«index»))
				}
				«ELSE»
				try! builder.addPropertyOffsetToOpenObject(«index+1», offset: offset«index»)
				«ENDIF»
				try! builder.addPropertyToOpenObject(«index», value : unionCase_«field.getType.defType.name»(«field.fieldName»), defaultValue : 0)
			}'''
		} else if(field.getType.isStruct) {
			'''
			if let «field.fieldName» = «field.fieldName» {
				builder.put(«field.fieldName»)
				try! builder.addCurrentOffsetAsPropertyToOpenObject(«index»)
			}'''
		} else {
			'''/* unsupported case */'''
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
			'''
			reader.getVectorScalarElement(offset_«field.fieldName»!, index: index) as «field.getType.vectorType.type.defType.name»
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
	
}