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
import maxim.zaks.generator.EagerSwiftGenerator
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

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
	}
	'''.toString.trim)
  } 
  
  @Test
  def void generateTableWithDeprecatedField() {
    val schema = parser.parse(
    '''
    table T2 {
    	name : string (deprecated);
    }
    ''')
    
    assertEquals(generator.generateMainDataStructureForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public final class T2 {
		public var __name : String? = nil
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
	private func create_U1(reader : FlatBufferReader, propertyIndex : Int, objectOffset : ObjectOffset?) -> U1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
		guard let caseObjectOffset : ObjectOffset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
			return nil
		}
		switch unionCase {
		case 1 : return T1.create(reader, objectOffset: caseObjectOffset)
		case 2 : return T2.create(reader, objectOffset: caseObjectOffset)
		case 3 : return T3.create(reader, objectOffset: caseObjectOffset)
		default : return nil
		}
	}
	private func create_U1_LazyAccess(reader : FlatBufferReader, propertyIndex : Int, objectOffset : ObjectOffset?) -> U1_LazyAccess? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let unionCase : Int8 = reader.get(objectOffset, propertyIndex: propertyIndex, defaultValue: 0)
		guard let caseObjectOffset : ObjectOffset = reader.getOffset(objectOffset, propertyIndex:propertyIndex + 1) else {
			return nil
		}
		switch unionCase {
		case 1 : return T1.LazyAccess(reader: reader, objectOffset: caseObjectOffset)
		case 2 : return T2.LazyAccess(reader: reader, objectOffset: caseObjectOffset)
		case 3 : return T3.LazyAccess(reader: reader, objectOffset: caseObjectOffset)
		default : return nil
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T1()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T1()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T1()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T1? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T1()
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset?) -> T2? {
		guard let objectOffset = objectOffset else {
			return nil
		}
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
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
	public static func FromByteArray(data : UnsafePointer<UInt8>) -> T2 {
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
	public final class LazyAccess{
		private let _reader : FlatBufferReader!
		private let _objectOffset : ObjectOffset!
		public init(data : UnsafePointer<UInt8>){
			_reader = FlatBufferReader(bytes: data)
			_objectOffset = _reader.rootObjectOffset
		}
		private init?(reader : FlatBufferReader, objectOffset : ObjectOffset?){
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
			let vectorOffset : VectorOffset? = self._reader.getOffset(self._objectOffset, propertyIndex: 4)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){
				self._reader.getVectorScalarElement(vectorOffset!, index: $0) as Int32
			}
		}()
		public lazy var strings : LazyVector<String> = {
			let vectorOffset : VectorOffset? = self._reader.getOffset(self._objectOffset, propertyIndex: 5)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){
				self._reader.getString(self._reader.getVectorOffsetElement(vectorOffset!, index: $0))
			}
		}()
		public lazy var objects : LazyVector<T1.LazyAccess> = {
			let vectorOffset : VectorOffset? = self._reader.getOffset(self._objectOffset, propertyIndex: 6)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){
				T1.LazyAccess(reader: self._reader, objectOffset : self._reader.getVectorOffsetElement(vectorOffset!, index: $0))
			}
		}()
		public lazy var e1 : E1? = E1(rawValue: self._reader.get(self._objectOffset, propertyIndex: 7, defaultValue:E1.A.rawValue))
		public lazy var st : ST? = self._reader.hasProperty(self._objectOffset, propertyIndex: 8) ? ST(
			a : self._reader.getStructProperty(self._objectOffset, propertyIndex: 8, structPropertyOffset: 0, defaultValue: 0),
			b : self._reader.getStructProperty(self._objectOffset, propertyIndex: 8, structPropertyOffset: 4, defaultValue: false)
		) : nil
		public lazy var sts : LazyVector<ST> = {
			let vectorOffset : VectorOffset? = self._reader.getOffset(self._objectOffset, propertyIndex: 9)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){
				ST(
					a : self._reader.getVectorStructElement(vectorOffset!, vectorIndex: $0, structSize: 5, structElementIndex: 0),
					b : self._reader.getVectorStructElement(vectorOffset!, vectorIndex: $0, structSize: 5, structElementIndex: 4)
				)
			}
		}()
		public lazy var es : LazyVector<E1> = {
			let vectorOffset : VectorOffset? = self._reader.getOffset(self._objectOffset, propertyIndex: 10)
			let vectorLength = self._reader.getVectorLength(vectorOffset)
			return LazyVector(count: vectorLength){
				E1(rawValue: self._reader.getVectorScalarElement(vectorOffset!, index: $0))
			}
		}()
		public lazy var u : U1_LazyAccess? = create_U1_LazyAccess(self._reader, propertyIndex: 11, objectOffset: self._objectOffset)

		public lazy var createEagerVersion : T2? = T2.create(self._reader, objectOffset: self._objectOffset)
	}
}
	'''.toString.trim)
  }
  
}