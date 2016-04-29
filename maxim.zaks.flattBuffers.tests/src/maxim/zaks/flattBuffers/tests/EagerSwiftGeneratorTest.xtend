package maxim.zaks.flattBuffers.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.Before
import static org.junit.Assert.*
import maxim.zaks.FlatBuffersInjectorProvider
import maxim.zaks.flatBuffers.*
import maxim.zaks.generator.swift.EagerSwiftGenerator
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import maxim.zaks.generator.swift.EagerSwiftGenerator.InfrastructureInclusionRule

@InjectWith(FlatBuffersInjectorProvider)
@RunWith(XtextRunner)
class EagerSwiftGeneratorTest {
  @Inject
  ParseHelper<Schema> parser
  @Inject extension ValidationTestHelper
  EagerSwiftGenerator generator
  
  @Before
  def void Setup(){
  	generator = new EagerSwiftGenerator()
  }
 
  @Test
  def void generateEmptyTable() {
    val schema = parser.parse(
    '''
    table T1 {}
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T1 {
		public init(){}
	}
	'''.toString.trim)
  }
 
 @Test
  def void generateEverthingWithNamespace() {
    val schema = parser.parse(
    '''
    namespace Foo.Bar;
    table T1 {}
    root_type T1;
    ''')
    
    assertEquals(generator.generate(schema, InfrastructureInclusionRule.Import).toString.trim,
	'''
// generated with FlatBuffersSchemaEditor https://github.com/mzaks/FlatBuffersSchemaEditor

import FlatBuffersSwift
public final class T1 {
	public init(){}
}
public extension T1 {
	private static var objectPool : [Offset : T1] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T1.objectPool[objectOffset]{
			return o
		}
		let _result = T1()
		T1.objectPool[objectOffset] = _result
		return _result
	}
}
public extension T1 {
	public static func fromByteArray(data : UnsafePointer<UInt8>) -> T1 {
		let reader = FlatBufferReader(bytes: data)
		let objectOffset = reader.rootObjectOffset
		return create(reader, objectOffset : objectOffset)!
	}
}
public extension T1 {
	public var toByteArray : [UInt8] {
		let builder = FlatBufferBuilder()
		let offset = addToByteArray(builder)
		performLateBindings(builder)
		performClearCaches()
		return try! builder.finish(offset, fileIdentifier: nil)
	}
}
public extension T1 {
	public final class LazyAccess : Hashable {
		private let _reader : FlatBufferReader!
		private let _objectOffset : Offset!
		public init(data : UnsafePointer<UInt8>){
			_reader = FlatBufferReader(bytes: data)
			_objectOffset = _reader.rootObjectOffset
		}
		private init?(reader : FlatBufferReader, objectOffset : Offset?){
			guard let objectOffset = objectOffset else {
				_reader = nil
				_objectOffset = nil
				return nil
			}
			_reader = reader
			_objectOffset = objectOffset
		}


		public lazy var createEagerVersion : T1? = T1.create(self._reader, objectOffset: self._objectOffset)
		
		public var hashValue: Int { return Int(_objectOffset) }
	}
}

public func ==(t1 : T1.LazyAccess, t2 : T1.LazyAccess) -> Bool {
	return t1._objectOffset == t2._objectOffset
}

public extension T1 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T1, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T1.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T1.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T1.inProgress.insert(ObjectIdentifier(self))
		try! builder.openObject(0)
		let myOffset =  try! builder.closeObject()
		T1.cache[ObjectIdentifier(self)] = myOffset
		T1.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}
private func performLateBindings(builder : FlatBufferBuilder) {
	for binding in T1.deferedBindings {
		try! builder.replaceOffset(binding.object.addToByteArray(builder), atCursor: binding.cursor)
	}
}
private func performClearCaches() {
	T1.clearCaches()
}
	'''.toString.trim)
  }
 
  @Test
  def void generateTableWithAllPremitiveFields() {
    val schema = parser.parse(
    '''
    table T2 {
    	name : string;
    	age : int;
    	a1: bool;
    	a2: byte;
    	a3: ubyte;
    	a4: short;
    	a5: ushort;
    	a6: uint;
    	a7: float;
    	a8: long;
    	a9: ulong;
    	a10: double;
    }
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T2 {
		public var name : String? = nil
		public var age : Int32 = 0
		public var a1 : Bool = false
		public var a2 : Int8 = 0
		public var a3 : UInt8 = 0
		public var a4 : Int16 = 0
		public var a5 : UInt16 = 0
		public var a6 : UInt32 = 0
		public var a7 : Float32 = 0
		public var a8 : Int64 = 0
		public var a9 : UInt64 = 0
		public var a10 : Float64 = 0
		public init(){}
		public init(name: String?, age: Int32, a1: Bool, a2: Int8, a3: UInt8, a4: Int16, a5: UInt16, a6: UInt32, a7: Float32, a8: Int64, a9: UInt64, a10: Float64){
			self.name = name
			self.age = age
			self.a1 = a1
			self.a2 = a2
			self.a3 = a3
			self.a4 = a4
			self.a5 = a5
			self.a6 = a6
			self.a7 = a7
			self.a8 = a8
			self.a9 = a9
			self.a10 = a10
		}
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateTableWithPremitiveFieldsAndDefailts() {
    val schema = parser.parse(
    '''
    table T2 {
    	name : string;
    	age : int;
    	a1: bool = true;
    	a2: byte;
    	a3: ubyte;
    	a4: short;
    	a5: ushort = 10;
    	a6: uint;
    	a7: float = 0.5;
    	a8: long;
    	a9: ulong;
    	a10: double;
    }
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T2 {
		public var name : String? = nil
		public var age : Int32 = 0
		public var a1 : Bool = true
		public var a2 : Int8 = 0
		public var a3 : UInt8 = 0
		public var a4 : Int16 = 0
		public var a5 : UInt16 = 10
		public var a6 : UInt32 = 0
		public var a7 : Float32 = 0.5
		public var a8 : Int64 = 0
		public var a9 : UInt64 = 0
		public var a10 : Float64 = 0
		public init(){}
		public init(name: String?, age: Int32, a1: Bool, a2: Int8, a3: UInt8, a4: Int16, a5: UInt16, a6: UInt32, a7: Float32, a8: Int64, a9: UInt64, a10: Float64){
			self.name = name
			self.age = age
			self.a1 = a1
			self.a2 = a2
			self.a3 = a3
			self.a4 = a4
			self.a5 = a5
			self.a6 = a6
			self.a7 = a7
			self.a8 = a8
			self.a9 = a9
			self.a10 = a10
		}
	}
	'''.toString.trim)
  } 
  
  @Test
  def void generateTableWithDeprecatedField() {
    val schema = parser.parse(
    '''
    table T2 {
    	name : string (deprecated);
    	age : int;
    }
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T2 {
		public var __name : String? = nil
		public var age : Int32 = 0
		public init(){}
		public init(age: Int32){
			self.age = age
		}
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateTableWithReferenceToAnotherDefinition() {
    val schema = parser.parse(
    '''
    table T1 {
    	friend : T2;
    	myEnum : A;
    	myUnion : C;
    	myStruct : Foo;
    }
    table T2 {}
    enum A {a}
    union C {}
    struct Foo{}
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T1 {
		public var friend : T2? = nil
		public var myEnum : A? = A.a
		public var myUnion : C? = nil
		public var myStruct : Foo? = nil
		public init(){}
		public init(friend: T2?, myEnum: A?, myUnion: C?, myStruct: Foo?){
			self.friend = friend
			self.myEnum = myEnum
			self.myUnion = myUnion
			self.myStruct = myStruct
		}
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateTableWithQualifiedTypeProperty() {
    val schema = parser.parse(
    '''
    table T1 {
    	t : A.B.C;
    }
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T1 {
		public var t : Any? /* defined as qulified type which is not supported in Swift*/ = nil
		public init(){}
		public init(t: Any? /* defined as qulified type which is not supported in Swift*/){
			self.t = t
		}
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateTableWithVectorProperties() {
    val schema = parser.parse(
    '''
    table T1 {
    	t : [string];
    	t2 : [bool];
    	t3 : [E];
    	t4 : [T2];
    	t5 : [[T2]];
    	t6 : [[byte]];
    	t7 : [S1];
    }
    table T2 {}
    enum E {}
    struct S1 {a : Int}
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T1 {
		public var t : [String?] = []
		public var t2 : [Bool] = []
		public var t3 : [E?] = []
		public var t4 : [T2?] = []
		public var t5 : [[T2?]] = []
		public var t6 : [[Int8]] = []
		public var t7 : [S1?] = []
		public init(){}
		public init(t: [String?], t2: [Bool], t3: [E?], t4: [T2?], t5: [[T2?]], t6: [[Int8]], t7: [S1?]){
			self.t = t
			self.t2 = t2
			self.t3 = t3
			self.t4 = t4
			self.t5 = t5
			self.t6 = t6
			self.t7 = t7
		}
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateStruct() {
    val schema = parser.parse(
    '''
    struct S1 {
    	name : string;
    	age : int;
    }
    ''')
    
    assertEquals(generator.generateMainStructForStruct(schema.definitions.get(0) as Struct).toString.trim,
	'''
	public struct S1 {
		public var name : Any /* unsupported struct field type */
		public var age : Int32
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateEnum() {
    val schema = parser.parse(
    '''
    enum E1 {
    	A,
    	B = 3,
    	C
    }
    ''')
    
    assertEquals(generator.generateMainEnumForEnum(schema.definitions.get(0) as Enum).toString.trim,
	'''
	public enum E1 {
		case A, B = 3, C
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateTypedEnum() {
    val schema = parser.parse(
    '''
    enum E1 : byte {
    	A,
    	B = 3,
    	C
    }
    ''')
    
    assertEquals(generator.generateMainEnumForEnum(schema.definitions.get(0) as Enum).toString.trim,
	'''
	public enum E1 : Int8 {
		case A, B = 3, C
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateUnion() {
    val schema = parser.parse(
    '''
    union U1 {T1, T2, T3}
    table T1 {}
    table T2 {}
    table T3 {}
    ''')
    
    assertEquals(generator.generateProtocolAndTableExtensionsForUnion(schema.definitions.get(0) as Union).toString.trim,
	'''
	public protocol U1{}
	public protocol U1_LazyAccess{}
	extension T1 : U1 {}
	extension T1.LazyAccess : U1_LazyAccess {}
	extension T2 : U1 {}
	extension T2.LazyAccess : U1_LazyAccess {}
	extension T3 : U1 {}
	extension T3.LazyAccess : U1_LazyAccess {}
	private var U1_DeferedBindings : [(object:U1, cursor:Int)] = []
	'''.toString.trim)
  }
  
  @Test
  def void generateUnionCreateFunction() {
    val schema = parser.parse(
    '''
    union U1 {T1, T2, T3}
    table T1 {}
    table T2 {}
    table T3 {}
    ''')
    
    assertEquals(generator.generateCreaterFunctionForUnion(schema.definitions.get(0) as Union).toString.trim,
	'''
	private func create_U1(reader : FlatBufferReader, propertyIndex : Int, objectOffset : Offset?) -> U1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
		guard let caseObjectOffset : Offset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
			return nil
		}
		switch unionCase {
		case 1 : return T1.create(reader, objectOffset: caseObjectOffset)
		case 2 : return T2.create(reader, objectOffset: caseObjectOffset)
		case 3 : return T3.create(reader, objectOffset: caseObjectOffset)
		default : return nil
		}
	}
	private func create_U1_LazyAccess(reader : FlatBufferReader, propertyIndex : Int, objectOffset : Offset?) -> U1_LazyAccess? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
		guard let caseObjectOffset : Offset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
			return nil
		}
		switch unionCase {
		case 1 : return T1.LazyAccess(reader: reader, objectOffset: caseObjectOffset)
		case 2 : return T2.LazyAccess(reader: reader, objectOffset: caseObjectOffset)
		case 3 : return T3.LazyAccess(reader: reader, objectOffset: caseObjectOffset)
		default : return nil
		}
	}
	private func unionCase_U1(union : U1?) -> Int8 {
		switch union {
		case is T1 : return 1
		case is T2 : return 2
		case is T3 : return 3
		default : return 0
		}
	}
	private func addToByteArray_U1(builder : FlatBufferBuilder, union : U1?) -> Offset {
		switch union {
		case let u as T1 : return u.addToByteArray(builder)
		case let u as T2 : return u.addToByteArray(builder)
		case let u as T3 : return u.addToByteArray(builder)
		default : return 0
		}
	}
	private func performLateBindings_U1(builder : FlatBufferBuilder) {
		for binding in U1_DeferedBindings {
			switch binding.object {
			case let u as T1 : try! builder.replaceOffset(u.addToByteArray(builder), atCursor: binding.cursor)
			case let u as T2 : try! builder.replaceOffset(u.addToByteArray(builder), atCursor: binding.cursor)
			case let u as T3 : try! builder.replaceOffset(u.addToByteArray(builder), atCursor: binding.cursor)
			default : continue
			}
		}
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithPrimitives() {
    val schema = parser.parse(
    '''
    table T1 {
    	a : bool;
    	b : byte;
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T1 {
	private static var objectPool : [Offset : T1] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T1.objectPool[objectOffset]{
			return o
		}
		let _result = T1()
		T1.objectPool[objectOffset] = _result
		_result.a = reader.get(objectOffset, propertyIndex: 0, defaultValue: false)
		_result.b = reader.get(objectOffset, propertyIndex: 1, defaultValue: 0)
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithPrimitivesAndDefaultValues() {
    val schema = parser.parse(
    '''
    table T1 {
    	a : bool = true;
    	b : byte = 3;
    	c : float = 0.5;
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T1 {
	private static var objectPool : [Offset : T1] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T1.objectPool[objectOffset]{
			return o
		}
		let _result = T1()
		T1.objectPool[objectOffset] = _result
		_result.a = reader.get(objectOffset, propertyIndex: 0, defaultValue: true)
		_result.b = reader.get(objectOffset, propertyIndex: 1, defaultValue: 3)
		_result.c = reader.get(objectOffset, propertyIndex: 2, defaultValue: 0.5)
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithEnumsAndDefaultValues() {
    val schema = parser.parse(
    '''
    table T2 {
    	e1 : E1;
    	e2 : E1 = C;
    }
    enum E1 {A, B, C}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		_result.e1 = E1(rawValue: reader.get(objectOffset, propertyIndex: 0, defaultValue: E1.A.rawValue))
		_result.e2 = E1(rawValue: reader.get(objectOffset, propertyIndex: 1, defaultValue: E1.C.rawValue))
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithStringValue() {
    val schema = parser.parse(
    '''
    table T2 {
    	s1 : string;
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		_result.s1 = reader.getString(reader.getOffset(objectOffset, propertyIndex: 0))
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithScalarVector() {
    val schema = parser.parse(
    '''
    table T2 {
    	v1 : [int];
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		let offset_v1 : Offset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		if(length_v1 > 0){
			var index = 0
			while index < length_v1 {
				_result.v1.append(reader.getVectorScalarElement(offset_v1!, index: index))
				index += 1
			}
		}
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithEnumVector() {
    val schema = parser.parse(
    '''
    table T2 {
    	v1 : [E];
    }
    enum E {A,B}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		let offset_v1 : Offset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		if(length_v1 > 0){
			var index = 0
			while index < length_v1 {
				_result.v1.append(E(rawValue: reader.getVectorScalarElement(offset_v1!, index: index)))
				index += 1
			}
		}
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithStringVector() {
    val schema = parser.parse(
    '''
    table T2 {
    	v1 : [string];
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		let offset_v1 : Offset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		if(length_v1 > 0){
			var index = 0
			while index < length_v1 {
				_result.v1.append(reader.getString(reader.getVectorOffsetElement(offset_v1!, index: index)))
				index += 1
			}
		}
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithReferneceToAnotherTable() {
    val schema = parser.parse(
    '''
    table T2 {
    	t1 : T1;
    }
    table T1 {}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		_result.t1 = T1.create(reader, objectOffset: reader.getOffset(objectOffset, propertyIndex: 0))
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithReferneceToUnion() {
    val schema = parser.parse(
    '''
    table T1 {
    	u1 : U1;
    }
    union U1 {T2, T3}
    table T2 {}
    table T3 {}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T1 {
	private static var objectPool : [Offset : T1] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T1.objectPool[objectOffset]{
			return o
		}
		let _result = T1()
		T1.objectPool[objectOffset] = _result
		_result.u1 = create_U1(reader, propertyIndex: 0, objectOffset: objectOffset)
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithReferneceToStruct() {
    val schema = parser.parse(
    '''
    table T1 {
    	s1 : S1;
    }
    struct S1 {
    	a : bool;
    	b : int;
    	c : float;
    	d : bool;
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T1 {
	private static var objectPool : [Offset : T1] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T1.objectPool[objectOffset]{
			return o
		}
		let _result = T1()
		T1.objectPool[objectOffset] = _result
		_result.s1 = S1(
			a : reader.getStructProperty(objectOffset, propertyIndex: 0, structPropertyOffset: 0, defaultValue: false),
			b : reader.getStructProperty(objectOffset, propertyIndex: 0, structPropertyOffset: 1, defaultValue: 0),
			c : reader.getStructProperty(objectOffset, propertyIndex: 0, structPropertyOffset: 5, defaultValue: 0),
			d : reader.getStructProperty(objectOffset, propertyIndex: 0, structPropertyOffset: 9, defaultValue: false)
		)
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithTableVector() {
    val schema = parser.parse(
    '''
    table T2 {
    	v1 : [T1];
    }
    table T1{}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		let offset_v1 : Offset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		if(length_v1 > 0){
			var index = 0
			while index < length_v1 {
				_result.v1.append(T1.create(reader, objectOffset: reader.getVectorOffsetElement(offset_v1!, index: index)))
				index += 1
			}
		}
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateCreateExtensionForTableWithStructVector() {
    val schema = parser.parse(
    '''
    table T2 {
    	v1 : [S1];
    }
    struct S1{
    	i : int;
    	b : bool;
    }
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var objectPool : [Offset : T2] = [:]
	private static func create(reader : FlatBufferReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if let o = T2.objectPool[objectOffset]{
			return o
		}
		let _result = T2()
		T2.objectPool[objectOffset] = _result
		let offset_v1 : Offset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		if(length_v1 > 0){
			var index = 0
			while index < length_v1 {
				_result.v1.append(S1(
					i : reader.getVectorStructElement(offset_v1!, vectorIndex: index, structSize: 5, structElementIndex: 0),
					b : reader.getVectorStructElement(offset_v1!, vectorIndex: index, structSize: 5, structElementIndex: 4)
				))
				index += 1
			}
		}
		return _result
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateFromByteArrayExtension() {
    val schema = parser.parse(
    '''
    table T2 {
    	a1 : bool;
    }
    ''')
    
    assertEquals(generator.generateFromByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	public static func fromByteArray(data : UnsafePointer<UInt8>) -> T2 {
		let reader = FlatBufferReader(bytes: data)
		let objectOffset = reader.rootObjectOffset
		return create(reader, objectOffset : objectOffset)!
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateLazyAccessForTable() {
    val schema = parser.parse(
    '''
    table T2 {
    	b1 : bool;
    	s1 : string;
    	b2 : bool = true;
    	t1 : T1;
    	numbers : [int];
    	strings : [string];
    	objects : [T1];
    	e1 : E1;
    	st : ST;
    	sts : [ST];
    	es : [E1];
    	u : U1;
    }
    table T1{}
    enum E1 {A, B}
    struct ST {
    	a : int;
    	b : bool;
    }
    union U1 {}
    ''')
    
    assertEquals(generator.generateLazyAccessExtension(schema.definitions.get(0) as Table, true).toString.trim,
	'''
public extension T2 {
	public final class LazyAccess : Hashable {
		private let _reader : FlatBufferReader!
		private let _objectOffset : Offset!
		public init(data : UnsafePointer<UInt8>){
			_reader = FlatBufferReader(bytes: data)
			_objectOffset = _reader.rootObjectOffset
		}
		private init?(reader : FlatBufferReader, objectOffset : Offset?){
			guard let objectOffset = objectOffset else {
				_reader = nil
				_objectOffset = nil
				return nil
			}
			_reader = reader
			_objectOffset = objectOffset
		}

		public lazy var b1 : Bool = self._reader.get(self._objectOffset, propertyIndex: 0, defaultValue:false)
		public lazy var s1 : String? = self._reader.getString(self._reader.getOffset(self._objectOffset, propertyIndex: 1))
		public lazy var b2 : Bool = self._reader.get(self._objectOffset, propertyIndex: 2, defaultValue:true)
		public lazy var t1 : T1.LazyAccess? = T1.LazyAccess(reader: self._reader, objectOffset : self._reader.getOffset(self._objectOffset, propertyIndex: 3))
		public lazy var numbers : LazyVector<Int32> = {
			let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: 4)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){ [unowned self] in
				self._reader.getVectorScalarElement(vectorOffset!, index: $0) as Int32
			}
		}()
		public lazy var strings : LazyVector<String> = {
			let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: 5)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){ [unowned self] in
				self._reader.getString(self._reader.getVectorOffsetElement(vectorOffset!, index: $0))
			}
		}()
		public lazy var objects : LazyVector<T1.LazyAccess> = {
			let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: 6)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){ [unowned self] in
				T1.LazyAccess(reader: self._reader, objectOffset : self._reader.getVectorOffsetElement(vectorOffset!, index: $0))
			}
		}()
		public lazy var e1 : E1? = E1(rawValue: self._reader.get(self._objectOffset, propertyIndex: 7, defaultValue:E1.A.rawValue))
		public lazy var st : ST? = self._reader.hasProperty(self._objectOffset, propertyIndex: 8) ? ST(
			a : self._reader.getStructProperty(self._objectOffset, propertyIndex: 8, structPropertyOffset: 0, defaultValue: 0),
			b : self._reader.getStructProperty(self._objectOffset, propertyIndex: 8, structPropertyOffset: 4, defaultValue: false)
		) : nil
		public lazy var sts : LazyVector<ST> = {
			let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: 9)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){ [unowned self] in
				ST(
					a : self._reader.getVectorStructElement(vectorOffset!, vectorIndex: $0, structSize: 5, structElementIndex: 0),
					b : self._reader.getVectorStructElement(vectorOffset!, vectorIndex: $0, structSize: 5, structElementIndex: 4)
				)
			}
		}()
		public lazy var es : LazyVector<E1> = {
			let vectorOffset : Offset? = self._reader.getOffset(self._objectOffset, propertyIndex: 10)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){ [unowned self] in
				E1(rawValue: self._reader.getVectorScalarElement(vectorOffset!, index: $0))
			}
		}()
		public lazy var u : U1_LazyAccess? = create_U1_LazyAccess(self._reader, propertyIndex: 11, objectOffset: self._objectOffset)

		public lazy var createEagerVersion : T2? = T2.create(self._reader, objectOffset: self._objectOffset)
		
		public var hashValue: Int { return Int(_objectOffset) }
	}
}

public func ==(t1 : T2.LazyAccess, t2 : T2.LazyAccess) -> Bool {
	return t1._objectOffset == t2._objectOffset
}
	'''.toString.trim)
  }
  
  @Test
  def void generateToByteArrayExtension() {
    val schema = parser.parse(
    '''
    table T2 {
    	a1 : bool;
    }
    ''')
    
    assertEquals(generator.generateToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	public var toByteArray : [UInt8] {
		let builder = FlatBufferBuilder()
		let offset = addToByteArray(builder)
		performLateBindings(builder)
		performClearCaches()
		return try! builder.finish(offset, fileIdentifier: nil)
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateToByteArrayExtensionWithFileIdentifier() {
    val schema = parser.parse(
    '''
    file_identifier "abcd";
    table T2 {
    	a1 : bool;
    }
    ''')
	generator.fileIdentifier = schema.fileIdentifier.identifier
    assertEquals(generator.generateToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	public var toByteArray : [UInt8] {
		let builder = FlatBufferBuilder()
		let offset = addToByteArray(builder)
		performLateBindings(builder)
		performClearCaches()
		return try! builder.finish(offset, fileIdentifier: "abcd")
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateAddToByteArrayExtensionForTableWithScalarsAndEnum() {
    val schema = parser.parse(
    '''
    table T2 {
    	a1 : bool;
    	a2 : int;
    	a3 : byte = 5;
    	e1 : E1;
    }
    enum E1 {A, B}
    ''')
    
    assertEquals(generator.generateAddToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T2, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T2.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T2.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T2.inProgress.insert(ObjectIdentifier(self))
		try! builder.openObject(4)
		try! builder.addPropertyToOpenObject(3, value : e1!.rawValue, defaultValue : 0)
		try! builder.addPropertyToOpenObject(2, value : a3, defaultValue : 5)
		try! builder.addPropertyToOpenObject(1, value : a2, defaultValue : 0)
		try! builder.addPropertyToOpenObject(0, value : a1, defaultValue : false)
		let myOffset =  try! builder.closeObject()
		T2.cache[ObjectIdentifier(self)] = myOffset
		T2.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}
'''.toString.trim)
  }
  
  @Test
  def void generateAddToByteArrayExtensionForTableWithStringAndTableReference() {
    val schema = parser.parse(
    '''
    table T2 {
    	s : string;
    	t1 : T1;
    }
    table T1 {}
    ''')
    
    assertEquals(generator.generateAddToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T2, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T2.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T2.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T2.inProgress.insert(ObjectIdentifier(self))
		let offset1 = t1?.addToByteArray(builder) ?? 0
		let offset0 = try! builder.createString(s)
		try! builder.openObject(2)
		if t1 != nil {
			let cursor1 = try! builder.addPropertyOffsetToOpenObject(1, offset: offset1)
			if offset1 == 0 {
				T1.deferedBindings.append((object: t1!, cursor: cursor1))
			}
		}
		try! builder.addPropertyOffsetToOpenObject(0, offset: offset0)
		let myOffset =  try! builder.closeObject()
		T2.cache[ObjectIdentifier(self)] = myOffset
		T2.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}
'''.toString.trim)
  }
  
  @Test
  def void generateAddToByteArrayExtensionForTableWithVectorOfStringsIntsEnumsAndTables() {
    val schema = parser.parse(
    '''
    table T2 {
    	ns : [int];
    	ts : [T1];
    	es : [E1];
    	ss : [string];
    }
    table T1 {}
    enum E1 {}
    ''')
    
    assertEquals(generator.generateAddToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T2, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T2.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T2.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T2.inProgress.insert(ObjectIdentifier(self))
		var offset3 = Offset(0)
		if ss.count > 0{
			var offsets = [Offset?](count: ss.count, repeatedValue: nil)
			var index = ss.count - 1
			while(index >= 0){
				offsets[index] = try!builder.createString(ss[index])
				index -= 1
			}
			try! builder.startVector(ss.count)
			index = ss.count - 1
			while(index >= 0){
				try! builder.putOffset(offsets[index])
				index -= 1
			}
			offset3 = builder.endVector()
		}
		var offset2 = Offset(0)
		if es.count > 0{
			try! builder.startVector(es.count)
			var index = es.count - 1
			while(index >= 0){
				builder.put(es[index]!.rawValue)
				index -= 1
			}
			offset2 = builder.endVector()
		}
		var offset1 = Offset(0)
		if ts.count > 0{
			var offsets = [Offset?](count: ts.count, repeatedValue: nil)
			var index = ts.count - 1
			var deferedBindingObjects : [Int : T1] = [:]
			while(index >= 0){
				offsets[index] = ts[index]?.addToByteArray(builder)
				if offsets[index] == 0 {
					deferedBindingObjects[index] = ts[index]!
				}
				index -= 1
			}
			try! builder.startVector(ts.count)
			index = ts.count - 1
			var deferedBindingCursors : [Int : Int] = [:]
			while(index >= 0){
				let cursor = try! builder.putOffset(offsets[index])
				if offsets[index] == 0 {
					deferedBindingCursors[index] = cursor
				}
				index -= 1
			}
			for key in deferedBindingObjects.keys {
				T1.deferedBindings.append((object: deferedBindingObjects[key]!, cursor: deferedBindingCursors[key]!))
			}
			offset1 = builder.endVector()
		}
		var offset0 = Offset(0)
		if ns.count > 0{
			try! builder.startVector(ns.count)
			var index = ns.count - 1
			while(index >= 0){
				builder.put(ns[index])
				index -= 1
			}
			offset0 = builder.endVector()
		}
		try! builder.openObject(4)
		if ss.count > 0 {
			try! builder.addPropertyOffsetToOpenObject(3, offset: offset3)
		}
		if es.count > 0 {
			try! builder.addPropertyOffsetToOpenObject(2, offset: offset2)
		}
		if ts.count > 0 {
			try! builder.addPropertyOffsetToOpenObject(1, offset: offset1)
		}
		if ns.count > 0 {
			try! builder.addPropertyOffsetToOpenObject(0, offset: offset0)
		}
		let myOffset =  try! builder.closeObject()
		T2.cache[ObjectIdentifier(self)] = myOffset
		T2.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}
	'''.toString.trim)
  }
  
  @Test
  def void generateAddToByteArrayExtensionForTableWithUnion() {
    val schema = parser.parse(
    '''
    table T2 {
    	u : U1;
    }
    table T1 {}
    table T3 {}
    union U1 {T1, T3}
    ''')
    
    assertEquals(generator.generateAddToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T2, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T2.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T2.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T2.inProgress.insert(ObjectIdentifier(self))
		let offset0 = addToByteArray_U1(builder, union: u)
		try! builder.openObject(2)
		if u != nil {
			let cursor0 = try! builder.addPropertyOffsetToOpenObject(1, offset: offset0)
			if offset0 == 0 {
				U1_DeferedBindings.append((object: u!, cursor: cursor0))
			}
			try! builder.addPropertyToOpenObject(0, value : unionCase_U1(u), defaultValue : 0)
		}
		let myOffset =  try! builder.closeObject()
		T2.cache[ObjectIdentifier(self)] = myOffset
		T2.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}
'''.toString.trim)
  }
  
  @Test
  def void generateAddToByteArrayExtensionForTableWithStruct() {
    val schema = parser.parse(
    '''
    table T2 {
    	u : S1;
    }
    struct S1 {
    	a : int;
    	b : float;
    }
    ''')
    
    assertEquals(generator.generateAddToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T2, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T2.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T2.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T2.inProgress.insert(ObjectIdentifier(self))
		try! builder.openObject(1)
		if let u = u {
			builder.put(u.b)
			builder.put(u.a)
			try! builder.addCurrentOffsetAsPropertyToOpenObject(0)
		}
		let myOffset =  try! builder.closeObject()
		T2.cache[ObjectIdentifier(self)] = myOffset
		T2.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}'''.toString.trim)
  }
  
  @Test
  def void generateAddToByteArrayExtensionForTableWithStructVector() {
    val schema = parser.parse(
    '''
    table T2 {
    	ss : [S1];
    }
    struct S1 {
    	a : int;
    	b : bool;
    }
    ''')
    
    assertEquals(generator.generateAddToByteArrayExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	private static var cache : [ObjectIdentifier : Offset] = [:]
	private static var inProgress : Set<ObjectIdentifier> = []
	private static var deferedBindings : [(object:T2, cursor:Int)] = []
	static func clearCaches(){
		cache.removeAll()
		inProgress.removeAll()
		deferedBindings.removeAll()
	}
	private func addToByteArray(builder : FlatBufferBuilder) -> Offset {
		if let myOffset = T2.cache[ObjectIdentifier(self)] {
			return myOffset
		}
		if T2.inProgress.contains(ObjectIdentifier(self)){
			return 0
		}
		T2.inProgress.insert(ObjectIdentifier(self))
		var offset0 = Offset(0)
		if ss.count > 0{
			try! builder.startVector(ss.count)
			var index = ss.count - 1
			while(index >= 0){
				builder.put(ss[index]?.b ?? false)
				builder.put(ss[index]?.a ?? 0)
				index -= 1
			}
			offset0 = builder.endVector()
		}
		try! builder.openObject(1)
		if ss.count > 0 {
			try! builder.addPropertyOffsetToOpenObject(0, offset: offset0)
		}
		let myOffset =  try! builder.closeObject()
		T2.cache[ObjectIdentifier(self)] = myOffset
		T2.inProgress.remove(ObjectIdentifier(self))
		return myOffset
	}
}
'''.toString.trim)
  }
  
  @Test
  def void generatePerformLateBindings() {
    val schema = parser.parse(
    '''
    table T2 {
    	u : U1;
    }
    table T1 {}
    table T3 {}
    union U1 {T1, T3}
    ''')
    
    assertEquals(generator.generatePerformLateBindings(schema).toString.trim,
	'''
private func performLateBindings(builder : FlatBufferBuilder) {
	for binding in T2.deferedBindings {
		try! builder.replaceOffset(binding.object.addToByteArray(builder), atCursor: binding.cursor)
	}
	for binding in T1.deferedBindings {
		try! builder.replaceOffset(binding.object.addToByteArray(builder), atCursor: binding.cursor)
	}
	for binding in T3.deferedBindings {
		try! builder.replaceOffset(binding.object.addToByteArray(builder), atCursor: binding.cursor)
	}
	performLateBindings_U1(builder)
}
'''.toString.trim)
  }
}