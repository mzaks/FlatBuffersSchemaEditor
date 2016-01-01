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

@InjectWith(FlatBuffersInjectorProvider)
@RunWith(XtextRunner)
class EagerSwiftGeneratorTest {
  @Inject
  ParseHelper<Schema> parser
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
    
    assertEquals(generator.generateMainStructForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public struct T1 {
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
    
    assertEquals(generator.generateMainStructForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public struct T2 {
		public var name : String?
		public var age : Int32
		public var a1 : Bool
		public var a2 : Int8
		public var a3 : UInt8
		public var a4 : Int16
		public var a5 : UInt16
		public var a6 : UInt32
		public var a7 : Float32
		public var a8 : Int64
		public var a9 : UInt64
		public var a10 : Float64
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
    enum A {}
    union C {}
    struct Foo{}
    ''')
    
    assertEquals(generator.generateMainStructForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public struct T1 {
		public var friend : T2?
		public var myEnum : A
		public var myUnion : C?
		public var myStruct : Foo?
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
    
    assertEquals(generator.generateMainStructForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public struct T1 {
		public var t : Any? /* defined as qulified type which is not supported in Swift*/
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
    }
    table T2 {}
    enum E {}
    ''')
    
    assertEquals(generator.generateMainStructForTable(schema.definitions.get(0) as Table).toString.trim,
	'''
	public struct T1 {
		public var t : [String]
		public var t2 : [Bool]
		public var t3 : [E]
		public var t4 : [T2]
		public var t5 : [[T2]]
		public var t6 : [[Int8]]
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
	public extension T1 : U1 {}
	public extension T2 : U1 {}
	public extension T3 : U1 {}
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T1 {
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T1 {
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T2 {
		let _result = T2()
		_result.e1 = reader.get(objectOffset, propertyIndex: 0, defaultValue: E1.A)
		_result.e2 = reader.get(objectOffset, propertyIndex: 1, defaultValue: E1.C)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T2 {
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T2 {
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		_result.v1 = [Int32](count: length_v1, repeatedValue: 0)
		if(length_v1 > 0){
			for index in 0 ..< length_v1{
				_v1[index] = reader.getVectorScalarElement(offset_v1!, index: index)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T2 {
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		_result.v1 = [E](count: length_v1, repeatedValue: E.A)
		if(length_v1 > 0){
			for index in 0 ..< length_v1{
				_v1[index] = reader.getVectorScalarElement(offset_v1!, index: index)
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T2 {
		let _result = T2()
		let offset_v1 : VectorOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
		let length_v1 = reader.getVectorLength(offset_v1)
		_result.v1 = [String]()
		if(length_v1 > 0){
			for index in 0 ..< length_v1{
				_v1[index] = reader.getString(reader.getVectorOffsetElement(offset_v1!, index: index))!
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
	private static func create(reader : FlatBufferReader, objectOffset : ObjectOffset) -> T2 {
		let _result = T2()
		let offset_t1 : ObjectOffset? = reader.getOffset(objectOffset, propertyIndex: 0)
		_result.t1 = offset_t1 != nil ? T1.create(reader, objectOffset: offset_t1!) : nil
		return _result
	}
}
	'''.toString.trim)
  }
  
}