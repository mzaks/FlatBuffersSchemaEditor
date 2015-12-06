package maxim.zaks.flattBuffers.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import static org.junit.Assert.*
import maxim.zaks.FlatBuffersInjectorProvider
import maxim.zaks.flatBuffers.*

@InjectWith(FlatBuffersInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
  @Inject
  ParseHelper<Schema> parser
 
  @Test
  def void parseTables() {
    val model = parser.parse('''
      table MyEntity1 {
      }
      table MyEntity2 {
      }
    ''')
    val table1 = model.definitions.get(0)
    assertEquals(table1.name, "MyEntity1")
    val table2 = model.definitions.get(1)
    assertEquals(table2.name, "MyEntity2")
  }
 
  @Test
  def void parseTableWithOnefield() {
    val model = parser.parse('''
      table MyEntity {
        n1: int;
      }
    ''')
    val table = model.definitions.get(0) as Table
    assertEquals(table.name, "MyEntity")
    val field = table.fields.get(0)
    assertEquals(field.name, "n1")
    assertEquals(field.type.primType, "int")
  }
  
  @Test
  def void parseTablePropertiesWithDifferentScalarTypes() {
  	val model = parser.parse('''
      table MyEntity {
        n1: byte; 
        n2: ubyte;
        n3: bool;
        n4: short;
        n5: ushort;
        n6: int;
        n7: uint;
        n8: float;
        n9: long;
        n10: ulong;
        n11: double;
        n12: string;
      }
    ''')
    val table = model.definitions.get(0) as Table
    
    val types = #["byte", "ubyte", "bool", "short", "ushort", "int", "uint", "float", "long", "ulong", "double", "string"]
    types.forEach[type, index|
    	val field = table.fields.get(index)
    	assertEquals(field.name, "n" + (index+1))
    	assertEquals(field.type.primType, type)
    ]
  }
  
  @Test
  def void parseTablePropertiesWithDifferentArrayScalarTypes() {
  	val model = parser.parse('''
      table MyEntity {
        n1: [byte]; 
        n2: [ubyte];
        n3: [bool];
        n4: [short];
        n5: [ushort];
        n6: [int];
        n7: [uint];
        n8: [float];
        n9: [long];
        n10: [ulong];
        n11: [double];
        n12: [string];
      }
    ''')
    val table = model.definitions.get(0) as Table
    
    val types = #["byte", "ubyte", "bool", "short", "ushort", "int", "uint", "float", "long", "ulong", "double", "string"]
    types.forEach[type, index|
    	val field = table.fields.get(index)
    	assertEquals(field.name, "n" + (index+1))
    	assertEquals(field.type.vectorType.type.primType, type)
    ]
  }
  
  @Test
  def void parseTablePropertyWithTableType() {
  	val model = parser.parse('''
      table MyEntity {
        friend: AnotherEntity;
      }
      table AnotherEntity{}
    ''')
    val table = model.definitions.get(0) as Table
    val field = table.fields.get(0)
    assertEquals(field.name, "friend")
    assertEquals(field.type.defType.name, "AnotherEntity")
  }
  
  @Test
  def void parseTablePropertyWithVectorOfTableType() {
  	val model = parser.parse('''
      table MyEntity {
        friend: [AnotherEntity];
      }
      table AnotherEntity{}
    ''')
    val table = model.definitions.get(0) as Table
    val field = table.fields.get(0)
    assertEquals(field.name, "friend")
    assertEquals(field.type.vectorType.type.defType.name, "AnotherEntity")
  }
  
  @Test
  def void parseTablePropertyWithDefaultValues() {
  	val model = parser.parse('''
      table MyEntity {
        n1: bool = true;
        n2: int = 32;
        n3: float = 0.32;
        n4: float = -0.25f;
      }
    ''')
    
    val table = model.definitions.get(0) as Table
    
    val field1 = table.fields.get(0)
    assertEquals(field1.name, "n1")
    assertEquals(field1.type.primType, "bool")
    assertEquals(field1.defaultValue.isIsTrue, true)
    
    val field2 = table.fields.get(1)
    assertEquals(field2.name, "n2")
    assertEquals(field2.type.primType, "int")
    assertEquals(field2.defaultValue.number, "32")
    
    val field3 = table.fields.get(2)
    assertEquals(field3.name, "n3")
    assertEquals(field3.type.primType, "float")
    assertEquals(field3.defaultValue.number, "0.32")
    
    val field4 = table.fields.get(3)
    assertEquals(field4.name, "n4")
    assertEquals(field4.type.primType, "float")
    assertEquals(field4.defaultValue.number, "-0.25f")
  }
  
  @Test
  def void parseTablePropertyWithAttributes() {
  	val model = parser.parse('''
  	  attribute "prio";
  	  table MyEntity {
  	  	n1: bool (deprecated);
  	  	n2: int (key, required, 
  	  			 original_order, 
  	  			 force_align:8, 
  	  			 id:5, 
  	  			 bit_flags, 
  	  			 prio, 
  	  			 prio:7, 
  	  			 prio:"important", 
  	  			 nested_flatbuffer: "MyEntity");
  	  	n3: float;
  	  }
    ''')
    
    val table = model.definitions.get(0) as Table
    
    val field1 = table.fields.get(0)
    assertEquals(field1.name, "n1")
    assertEquals(field1.attributes.atributeNames.get(0).deprectated, true)
    
    val field2 = table.fields.get(1)
    assertEquals(field2.name, "n2")
    assertEquals(field2.attributes.atributeNames.get(0).key, true)
    assertEquals(field2.attributes.atributeNames.get(1).required, true)
    assertEquals(field2.attributes.atributeNames.get(2).original_order, true)
    assertEquals(field2.attributes.atributeNames.get(3).hasAlignSize, true)
    assertEquals(field2.attributes.atributeNames.get(3).alignSize, 8)
    assertEquals(field2.attributes.atributeNames.get(4).hasAttributeId, true)
    assertEquals(field2.attributes.atributeNames.get(4).attributeId, 5)
    assertEquals(field2.attributes.atributeNames.get(5).bit_flags, true)
    assertEquals(field2.attributes.atributeNames.get(6).customName.name, "prio")
    assertEquals(field2.attributes.atributeNames.get(7).intValue, 7)
    assertEquals(field2.attributes.atributeNames.get(8).stringValue, "important")
    assertEquals(field2.attributes.atributeNames.get(9).nestedTableName, "MyEntity")
  }
  
  @Test
  def void parseEnum() {
  	val model = parser.parse('''
      enum Foo : byte {A = 12, B, C}
    ''')
    val e = model.definitions.get(0) as Enum
    assertEquals(e.name, "Foo")
    assertEquals(e.type, "byte")
    assertEquals(e.enumCases.get(0).name, "A")
    assertEquals(e.enumCases.get(0).value, 12)
    assertEquals(e.enumCases.get(1).name, "B")
    assertEquals(e.enumCases.get(2).name, "C")
  }
  
  @Test
  def void parseEnumWithoutType() {
  	val model = parser.parse('''
      enum Foo {A = 12, B, C}
    ''')
    val e = model.definitions.get(0) as Enum
    assertEquals(e.name, "Foo")
    assertEquals(e.type, null)
    assertEquals(e.enumCases.get(0).name, "A")
    assertEquals(e.enumCases.get(0).value, 12)
    assertEquals(e.enumCases.get(1).name, "B")
    assertEquals(e.enumCases.get(2).name, "C")
  }
  
  @Test
  def void parseStruct() {
  	val model = parser.parse('''
	  struct Vec3 {
	  	x:float;
	  	y:float;
	  	z:float;
	  }
    ''')
    val struct = model.definitions.get(0) as Struct
    assertEquals(struct.name, "Vec3")
    assertEquals(struct.fields.get(0).name, "x")
    assertEquals(struct.fields.get(1).name, "y")
    assertEquals(struct.fields.get(2).name, "z")
    assertEquals(struct.fields.get(0).primType, "float")
    assertEquals(struct.fields.get(1).primType, "float")
    assertEquals(struct.fields.get(2).primType, "float")
    
  }
  
  @Test
  def void parseUnion() {
  	val model = parser.parse('''
  	  table A {  }
  	  table B {  }
  	  union Any {A, B}
    ''')
    val e = model.definitions.get(2) as Union
    assertEquals(e.name, "Any")
    assertEquals(e.unionCases.get(0).name, "A")
    assertEquals(e.unionCases.get(1).name, "B")
    
  }
  
  @Test
  def void parseDefaultValueAsEnum() {
  	val model = parser.parse('''
      enum Foo : byte {A = 12, B, C}
      table T1 {
      	foo: Foo = A;
      }
    ''')
    val e = model.definitions.get(1) as Table
    assertEquals(e.name, "T1")
    val f = e.fields.get(0)
    assertEquals(f.name, "foo")
    assertEquals(f.type.defType.name, "Foo")
    assertEquals(f.defaultValue.enumCase, "A")
  }
}