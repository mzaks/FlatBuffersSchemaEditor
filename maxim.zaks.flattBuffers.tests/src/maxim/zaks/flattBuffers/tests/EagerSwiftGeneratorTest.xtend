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

import Foundation

import FlatBuffersSwift
public final class T1 {
	public init(){}
}
public extension T1 {
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T1
		}
		let _result = T1()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		return _result
	}
}
public extension T1 {
	public static func makeT1(data : Data,  cache : FlatBuffersReaderCache? = FlatBuffersReaderCache()) -> T1? {
		let reader = FlatBuffersMemoryReader(data: data, cache: cache)
		return makeT1(reader: reader)
	}
	public static func makeT1(reader : FlatBuffersReader) -> T1? {
		let objectOffset = reader.rootObjectOffset
		return create(reader, objectOffset : objectOffset)
	}
}

public extension T1 {
	public func encode(withBuilder builder : FlatBuffersBuilder) throws -> Void {
		let offset = try addToByteArray(builder)
		try builder.finish(offset: offset, fileIdentifier: nil)
	}
	public func makeData(withOptions options : FlatBuffersBuilderOptions = FlatBuffersBuilderOptions()) throws -> Data {
		let builder = FlatBuffersBuilder(options: options)
		try encode(withBuilder: builder)
		return builder.makeData
	}
}

public struct T1_Direct<T : FlatBuffersReader> : Hashable, FlatBuffersDirectAccess {
	fileprivate let reader : T
	fileprivate let myOffset : Offset
	public init?<R : FlatBuffersReader>(reader: R, myOffset: Offset?) {
		guard let myOffset = myOffset, let reader = reader as? T else {
			return nil
		}
		self.reader = reader
		self.myOffset = myOffset
	}
	public init?(_ reader: T) {
		self.reader = reader
		guard let offest = reader.rootObjectOffset else {
			return nil
		}
		self.myOffset = offest
	}
	public var hashValue: Int { return Int(myOffset) }
}
public func ==<T>(t1 : T1_Direct<T>, t2 : T1_Direct<T>) -> Bool {
	return t1.reader.isEqual(other: t2.reader) && t1.myOffset == t2.myOffset
}
public extension T1 {
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		try builder.startObject(withPropertyCount: 0)
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
		return myOffset
	}
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
    enum A : byte { a }
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
	public var t : [String] = []
	public var t2 : [Bool] = []
	public var t3 : [E?] = []
	public var t4 : [T2] = []
	public var t5 : [[T2]] = []
	public var t6 : [[Int8]] = []
	public var t7 : [S1] = []
	public init(){}
	public init(t: [String], t2: [Bool], t3: [E?], t4: [T2], t5: [[T2]], t6: [[Int8]], t7: [S1]){
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
    	i : int;
    	b : bool;
    }
    ''')
    
    assertEquals(generator.generateMainStructForStruct(schema.definitions.get(0) as Struct).toString.trim,
	'''
	public struct S1 : Scalar {
		public let i : Int32
		public let b : Bool
	}
	
	'''.toString.trim)
  }
  
  @Test
  def void generateStructEquality() {
    val schema = parser.parse(
    '''
    struct S1 {
    	i : int;
    	b : bool;
    }
    ''')
    
    assertEquals(generator.generateStructEquality(schema.definitions.get(0) as Struct).toString.trim,
	'''
	public func ==(v1:S1, v2:S1) -> Bool {
		return  v1.i==v2.i &&  v1.b==v2.b
	}
	'''.toString.trim)
  }
  
  @Test
  def void generateStructWithRefToAnotherStruct() {
    val schema = parser.parse(
    '''
    struct S1 {
    	i : int;
    	b : bool;
    }
    struct S2 {
    	s1 : S1;
    	f  : float;
    }
    ''')
    
    assertEquals(generator.generateMainStructForStruct(schema.definitions.get(1) as Struct).toString.trim,
	'''
	public struct S2 : Scalar {
		public let s1 : S1
		public let f : Float32
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
  def void generateStructWithEnum() {
    val schema = parser.parse(
    '''
    struct S1 {
    	e : E;
    }
    enum E : byte { a }
    ''')
    
    assertEquals(generator.generateMainStructForStruct(schema.definitions.get(0) as Struct).toString.trim,
	'''
	public struct S1 : Scalar {
		public let e : E
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
public protocol U1_Direct{}
extension T1 : U1 {}
extension T1_Direct : U1_Direct {}
extension T2 : U1 {}
extension T2_Direct : U1_Direct {}
extension T3 : U1 {}
extension T3_Direct : U1_Direct {}
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
	fileprivate func create_U1(_ reader : FlatBuffersReader, propertyIndex : Int, objectOffset : Offset?) -> U1? {
	guard let objectOffset = objectOffset else {
		return nil
	}
	let unionCase : Int8 = reader.get(objectOffset: objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
	guard let caseObjectOffset : Offset = reader.offset(objectOffset: objectOffset, propertyIndex:propertyIndex + 1) else {
		return nil
	}
	switch unionCase {
	case 1 : return T1.create(reader, objectOffset: caseObjectOffset)
	case 2 : return T2.create(reader, objectOffset: caseObjectOffset)
	case 3 : return T3.create(reader, objectOffset: caseObjectOffset)
	default : return nil
	}
}

fileprivate func create_U1_Direct<T : FlatBuffersReader>(_ reader : T, propertyIndex : Int, objectOffset : Offset?) -> U1_Direct? {
	guard let objectOffset = objectOffset else {
		return nil
	}
	let unionCase : Int8 = reader.get(objectOffset: objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
	guard let caseObjectOffset : Offset = reader.offset(objectOffset: objectOffset, propertyIndex:propertyIndex + 1) else {
		return nil
	}
	switch unionCase {
	case 1 : return T1_Direct<T>(reader: reader, myOffset: caseObjectOffset)
	case 2 : return T2_Direct<T>(reader: reader, myOffset: caseObjectOffset)
	case 3 : return T3_Direct<T>(reader: reader, myOffset: caseObjectOffset)
	default : return nil
	}
}
private func unionCase_U1(_ union : U1?) -> Int8 {
	switch union {
	case is T1 : return 1
	case is T2 : return 2
	case is T3 : return 3
	default : return 0
	}
}
fileprivate func addToByteArray_U1(_ builder : FlatBuffersBuilder, union : U1?) throws -> Offset {
	switch union {
	case let u as T1 : return try u.addToByteArray(builder)
	case let u as T2 : return try u.addToByteArray(builder)
	case let u as T3 : return try u.addToByteArray(builder)
	default : return 0
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T1
		}
		let _result = T1()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		_result.a = reader.get(objectOffset: objectOffset, propertyIndex: 0, defaultValue: false)
		_result.b = reader.get(objectOffset: objectOffset, propertyIndex: 1, defaultValue: 0)
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T1
		}
		let _result = T1()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		_result.a = reader.get(objectOffset: objectOffset, propertyIndex: 0, defaultValue: true)
		_result.b = reader.get(objectOffset: objectOffset, propertyIndex: 1, defaultValue: 3)
		_result.c = reader.get(objectOffset: objectOffset, propertyIndex: 2, defaultValue: 0.5)
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
    enum E1 : byte {A, B, C}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		_result.e1 = E1(rawValue: reader.get(objectOffset: objectOffset, propertyIndex: 0, defaultValue: E1.A.rawValue))
		_result.e2 = E1(rawValue: reader.get(objectOffset: objectOffset, propertyIndex: 1, defaultValue: E1.C.rawValue))
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		_result.s1 = reader.stringBuffer(stringOffset: reader.offset(objectOffset: objectOffset, propertyIndex: 0))?§
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		let offset_v1 : Offset? = reader.offset(objectOffset: objectOffset, propertyIndex: 0)
		let length_v1 = reader.vectorElementCount(vectorOffset: offset_v1)
		if(length_v1 > 0){
			var index = 0
			_result.v1.reserveCapacity(length_v1)
			while index < length_v1 {
				if let element : Int32 = reader.vectorElementScalar(vectorOffset: offset_v1, index: index) {
					_result.v1.append(element)
				}
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
    enum E : byte {A,B}
    ''')
    
    assertEquals(generator.generateCreateExtension(schema.definitions.get(0) as Table).toString.trim,
	'''
public extension T2 {
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		let offset_v1 : Offset? = reader.offset(objectOffset: objectOffset, propertyIndex: 0)
		let length_v1 = reader.vectorElementCount(vectorOffset: offset_v1)
		if(length_v1 > 0){
			var index = 0
			_result.v1.reserveCapacity(length_v1)
			while index < length_v1 {
				if let raw : Int8 = reader.vectorElementScalar(vectorOffset: offset_v1, index: index){
					let element : E? = E(rawValue: raw)
					_result.v1.append(element)
				} else {
					_result.v1.append(nil)
				}
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		let offset_v1 : Offset? = reader.offset(objectOffset: objectOffset, propertyIndex: 0)
		let length_v1 = reader.vectorElementCount(vectorOffset: offset_v1)
		if(length_v1 > 0){
			var index = 0
			_result.v1.reserveCapacity(length_v1)
			while index < length_v1 {
				if let element = reader.stringBuffer(stringOffset: reader.vectorElementOffset(vectorOffset: offset_v1, index: index))?§ {
					_result.v1.append(element)
				}
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		_result.t1 = T1.create(reader, objectOffset: reader.offset(objectOffset: objectOffset, propertyIndex: 0))
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T1
		}
		let _result = T1()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T1
		}
		let _result = T1()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		_result.s1 = reader.get(objectOffset: objectOffset, propertyIndex: 0)
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		let offset_v1 : Offset? = reader.offset(objectOffset: objectOffset, propertyIndex: 0)
		let length_v1 = reader.vectorElementCount(vectorOffset: offset_v1)
		if(length_v1 > 0){
			var index = 0
			_result.v1.reserveCapacity(length_v1)
			while index < length_v1 {
				if let element = T1.create(reader, objectOffset: reader.vectorElementOffset(vectorOffset: offset_v1, index: index)) {
					_result.v1.append(element)
				}
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
	fileprivate static func create(_ reader : FlatBuffersReader, objectOffset : Offset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		if  let cache = reader.cache,
			let o = cache.objectPool[objectOffset] {
			return o as? T2
		}
		let _result = T2()
		if let cache = reader.cache {
			cache.objectPool[objectOffset] = _result
		}
		let offset_v1 : Offset? = reader.offset(objectOffset: objectOffset, propertyIndex: 0)
		let length_v1 = reader.vectorElementCount(vectorOffset: offset_v1)
		if(length_v1 > 0){
			var index = 0
			_result.v1.reserveCapacity(length_v1)
			while index < length_v1 {
				if let element : S1 = reader.vectorElementScalar(vectorOffset: offset_v1, index: index) {
					_result.v1.append(element)
				}
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
	public static func makeT2(data : Data,  cache : FlatBuffersReaderCache? = FlatBuffersReaderCache()) -> T2? {
		let reader = FlatBuffersMemoryReader(data: data, cache: cache)
		return makeT2(reader: reader)
	}
	public static func makeT2(reader : FlatBuffersReader) -> T2? {
		let objectOffset = reader.rootObjectOffset
		return create(reader, objectOffset : objectOffset)
	}
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
	public func encode(withBuilder builder : FlatBuffersBuilder) throws -> Void {
		let offset = try addToByteArray(builder)
		try builder.finish(offset: offset, fileIdentifier: nil)
	}
	public func makeData(withOptions options : FlatBuffersBuilderOptions = FlatBuffersBuilderOptions()) throws -> Data {
		let builder = FlatBuffersBuilder(options: options)
		try encode(withBuilder: builder)
		return builder.makeData
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
	public func encode(withBuilder builder : FlatBuffersBuilder) throws -> Void {
		let offset = try addToByteArray(builder)
		try builder.finish(offset: offset, fileIdentifier: "abcd")
	}
	public func makeData(withOptions options : FlatBuffersBuilderOptions = FlatBuffersBuilderOptions()) throws -> Data {
		let builder = FlatBuffersBuilder(options: options)
		try encode(withBuilder: builder)
		return builder.makeData
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
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		try builder.startObject(withPropertyCount: 4)
		try builder.insert(value : e1?.rawValue ?? 0, defaultValue : 0, toStartedObjectAt: 3)
		try builder.insert(value : a3, defaultValue : 5, toStartedObjectAt: 2)
		try builder.insert(value : a2, defaultValue : 0, toStartedObjectAt: 1)
		try builder.insert(value : a1, defaultValue : false, toStartedObjectAt: 0)
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
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
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		let offset1 = try t1?.addToByteArray(builder) ?? 0
		let offset0 = try builder.insert(value: s)
		try builder.startObject(withPropertyCount: 2)
		if t1 != nil {
			try builder.insert(offset: offset1, toStartedObjectAt: 1)
		}
		try builder.insert(offset: offset0, toStartedObjectAt: 0)
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
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
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		var offset3 = Offset(0)
		if ss.count > 0{
			var offsets = [Offset?](repeating: nil, count: ss.count)
			var index = ss.count - 1
			while(index >= 0){
				offsets[index] = try builder.insert(value: ss[index])
				index -= 1
			}
			try builder.startVector(count: ss.count, elementSize: MemoryLayout<Offset>.stride)
			index = ss.count - 1
			while(index >= 0){
				try builder.insert(offset: offsets[index])
				index -= 1
			}
			offset3 = builder.endVector()
		}
		var offset2 = Offset(0)
		if es.count > 0 {
			try builder.startVector(count: es.count, elementSize: MemoryLayout<E1>.stride)
			var index = es.count - 1
			while(index >= 0){
				if let value = es[index]?.rawValue {
					builder.insert(value: value)
				}
				index -= 1
			}
			offset2 = builder.endVector()
		}
		var offset1 = Offset(0)
		if ts.count > 0{
			var offsets = [Offset?](repeating: nil, count: ts.count)
			var index = ts.count - 1
			while(index >= 0){
				offsets[index] = try ts[index].addToByteArray(builder)
				index -= 1
			}
			try builder.startVector(count: ts.count, elementSize: MemoryLayout<Offset>.stride)
			index = ts.count - 1
			while(index >= 0){
				try builder.insert(offset: offsets[index])
				index -= 1
			}
			offset1 = builder.endVector()
		}
		var offset0 = Offset(0)
		if ns.count > 0 {
			try builder.startVector(count: ns.count, elementSize: MemoryLayout<Int32>.stride)
			var index = ns.count - 1
			while(index >= 0){
				builder.insert(value: ns[index])
				index -= 1
			}
			offset0 = builder.endVector()
		}
		try builder.startObject(withPropertyCount: 4)
		if ss.count > 0 {
			try builder.insert(offset: offset3, toStartedObjectAt: 3)
		}
		if es.count > 0 {
			try builder.insert(offset: offset2, toStartedObjectAt: 2)
		}
		if ts.count > 0 {
			try builder.insert(offset: offset1, toStartedObjectAt: 1)
		}
		if ns.count > 0 {
			try builder.insert(offset: offset0, toStartedObjectAt: 0)
		}
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
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
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		let offset0 = try addToByteArray_U1(builder, union: u)
		try builder.startObject(withPropertyCount: 2)
		if let object = u {
			try builder.insert(offset: offset0, toStartedObjectAt: 1)
			try builder.insert(value : unionCase_U1(object), defaultValue : 0, toStartedObjectAt: 0)
		}
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
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
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		try builder.startObject(withPropertyCount: 1)
		if let u = u {
			builder.insert(value: u)
			try builder.insertCurrentOffsetAsProperty(toStartedObjectAt: 0)
		}
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
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
	fileprivate func addToByteArray(_ builder : FlatBuffersBuilder) throws -> Offset {
		if builder.options.uniqueTables {
			if let myOffset = builder.cache[ObjectIdentifier(self)] {
				return myOffset
			}
		}
		var offset0 = Offset(0)
		if ss.count > 0 {
			try builder.startVector(count: ss.count, elementSize: MemoryLayout<S1>.stride)
			var index = ss.count - 1
			while(index >= 0){
				builder.insert(value: ss[index])
				index -= 1
			}
			offset0 = builder.endVector()
		}
		try builder.startObject(withPropertyCount: 1)
		if ss.count > 0 {
			try builder.insert(offset: offset0, toStartedObjectAt: 0)
		}
		let myOffset =  try builder.endObject()
		if builder.options.uniqueTables {
			builder.cache[ObjectIdentifier(self)] = myOffset
		}
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
private func performLateBindings(_ builder : FlatBuffersBuilder) throws {
	for binding in builder.deferedBindings {
		switch binding.object {
		case let object as T2: try builder.update(offset: object.addToByteArray(builder), atCursor: binding.cursor)
		case let object as T1: try builder.update(offset: object.addToByteArray(builder), atCursor: binding.cursor)
		case let object as T3: try builder.update(offset: object.addToByteArray(builder), atCursor: binding.cursor)
		default: continue
		}
	}
}
'''.toString.trim)
  }
}