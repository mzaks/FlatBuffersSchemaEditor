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
import maxim.zaks.generator.CSharpGenerator
import maxim.zaks.generator.ModelExtensions

@InjectWith(FlatBuffersInjectorProvider)
@RunWith(XtextRunner)
class CSGeneratorTest {
  @Inject
  ParseHelper<Schema> parser
  CSharpGenerator generator = new CSharpGenerator()
  
  extension ModelExtensions = new ModelExtensions()
 
  @Test
  def void generateEmptyTable() {
    val schema = parser.parse('''
      table T1 {}
    ''')
    assertEquals(generator.generateDefinition(schema.definitions.get(0)).toString.trim,
'''
public sealed class T1 : Table {
	
	internal static T1 FromByteBuffer(ByteBuffer _bb, int pos) {
		T1 obj = new T1();
		
		obj.bb_pos = pos; 
		obj.bb = _bb;
		
		return obj;
	}
	
	internal int AddToByteBuffer(FlatBufferBuilder builder){
		
		
		builder.StartObject(0);
		
		
		return builder.EndObject();
	}
}
'''.toString.trim)
  }
  
    @Test
  def void generateTableWithInt() {
    val schema = parser.parse('''
      table T1 {
      	a : int;
      }
    ''')
    assertEquals(generator.generateDefinition(schema.definitions.get(0)).toString.trim,
'''
public sealed class T1 : Table {
	public int a;
	
	internal static T1 FromByteBuffer(ByteBuffer _bb, int pos) {
		T1 obj = new T1();
		
		obj.bb_pos = pos; 
		obj.bb = _bb;
		
		int o0 = obj.__offset(4 + 2*0); 
		obj.a =  o0 != 0 ? obj.bb.GetInt(o0 + obj.bb_pos) : (int)0;
		return obj;
	}
	
	internal int AddToByteBuffer(FlatBufferBuilder builder){
		
		
		builder.StartObject(1);
		
		builder.AddInt(0, this.a, (int)0);
		
		return builder.EndObject();
	}
}
'''.toString.trim)
  }
  
  @Test
  def void findNoRecursion() {
    val schema = parser.parse(
    '''
    table T2 {
    	u : U1;
    }
    table T1 {}
    table T3 {}
    union U1 {T1, T3}
    ''')
    
    val tables = schema.definitions.filter[it instanceof Table]
    for (Definition d : tables){
    	val t = d as Table
    	assertFalse(t.isRecursive)
    }
  }
  
  @Test
  def void findRecursion() {
    val schema = parser.parse(
    '''
    table T2 {
    	t : T2;
    }
    ''')
    
    val tables = schema.definitions.filter[it instanceof Table]
    for (Definition d : tables){
    	val t = d as Table
    	assertTrue(t.isRecursive)
    }
  }
  
  @Test
  def void findRecursion2() {
    val schema = parser.parse(
    '''
    table T1 {
    	t : T2;
    }
    table T2 {
    	t : T1;
    }
    ''')
    
    val tables = schema.definitions.filter[it instanceof Table]
    for (Definition d : tables){
    	val t = d as Table
    	assertTrue(t.isRecursive)
    }
  }
  
  @Test
  def void findRecursion3() {
    val schema = parser.parse(
    '''
    table T2 {
    	u : U1;
    }
    table T1 {t:T3;}
    table T3 {t:T2;}
    table T4 {t:T3;}
    union U1 {T1, T3}
    ''')
    
    val tables = schema.definitions.filter[it instanceof Table]
    for (Definition d : tables){
    	val t = d as Table
    	assertTrue(t.isRecursive)
    }
  }
  
  @Test
  def void findRecursion4() {
    val schema = parser.parse(
    '''
    table T1 {
    	i : int;
    	t : [T2];
    }
    table T2 {
    	f : float;
    	t : T1;
    }
    ''')
    
    val tables = schema.definitions.filter[it instanceof Table]
    for (Definition d : tables){
    	val t = d as Table
    	assertTrue(t.isRecursive)
    }
  }
 
}