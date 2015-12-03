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
    val table1 = model.tables.get(0)
    assertEquals(table1.name, "MyEntity1")
    val table2 = model.tables.get(1)
    assertEquals(table2.name, "MyEntity2")
  }
 
  @Test
  def void parseTableWithOnefield() {
    val model = parser.parse('''
      table MyEntity {
        n1: int;
      }
    ''')
    val table = model.tables.get(0)
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
    val table = model.tables.get(0)
    
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
    val table = model.tables.get(0)
    
    val types = #["byte", "ubyte", "bool", "short", "ushort", "int", "uint", "float", "long", "ulong", "double", "string"]
    types.forEach[type, index|
    	val field = table.fields.get(index)
    	assertEquals(field.name, "n" + (index+1))
    	assertEquals(field.type.vectorType.primType, type)
    ]
  }
  
  @Test
  def void parseTablePropertyWithTableType() {
  	val model = parser.parse('''
      table MyEntity {
        friend: AnotherEntity
      }
      table AnotherEntity{}
    ''')
    val table = model.tables.get(0)
    val field = table.fields.get(0)
    assertEquals(field.name, "friend")
    assertEquals(field.type.tableType.type.name, "AnotherEntity")
  }
  
  @Test
  def void parseTablePropertyWithVectorOfTableType() {
  	val model = parser.parse('''
      table MyEntity {
        friend: [AnotherEntity]
      }
      table AnotherEntity{}
    ''')
    val table = model.tables.get(0)
    val field = table.fields.get(0)
    assertEquals(field.name, "friend")
    assertEquals(field.type.vectorType.tableType.type.name, "AnotherEntity")
  }
  
  @Test
  def void parseTablePropertyWithDefaultValues() {
  	val model = parser.parse('''
      table MyEntity {
        n1: bool = true
        n2: int = 32
        n3: float = 0.32
      }
    ''')
    
    val table = model.tables.get(0)
    
    val field1 = table.fields.get(0)
    assertEquals(field1.name, "n1")
    assertEquals(field1.type.primType, "bool")
    assertEquals(field1.defaultValue, "true")
    
    val field2 = table.fields.get(1)
    assertEquals(field2.name, "n2")
    assertEquals(field2.type.primType, "int")
    assertEquals(field2.defaultValue, "32")
    
    val field3 = table.fields.get(2)
    assertEquals(field3.name, "n3")
    assertEquals(field3.type.primType, "float")
    assertEquals(field3.defaultValue, "0.32")
  }
}