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
  
  @Test
  def void structSize() {
    val schema = parser.parse(
    '''
	struct S2 {
		i1 : int;
		b1 : bool;
	})''')
    
    val struct = schema.definitions.get(0) as Struct
    
    assertEquals(8, struct.size)
  }
  
  @Test
  def void structSize2() {
    val schema = parser.parse(
    '''
	struct S1 {
		f1 : float;
		d1 : double;
		f2 : float;
		f3 : float;
		s2 : S2;
	})''')
    
    val struct = schema.definitions.get(0) as Struct
    
    assertEquals(24, struct.size)
  }
  
  @Test
  def void structSize3() {
    val schema = parser.parse(
    '''
	struct S1 {
		f1 : float;
		d1 : double;
		f2 : float;
		f3 : float;
		s2 : S2;
	}
	struct S2 {
		i1 : int;
		b1 : bool;
	})''')
    
    val struct = schema.definitions.get(0) as Struct
    
    assertEquals(32, struct.size)
  }
  
  @Test
  def void structSize4() {
    val schema = parser.parse(
    '''
	struct S1 {
		f1 : float;
		s2 : S2;
		d1 : double;
		f2 : float;
		f3 : float;
	}
	struct S2 {
		i1 : int;
		b1 : bool;
	})''')
    
    val struct = schema.definitions.get(0) as Struct
    
    assertEquals(32, struct.size)
  }
  
  @Test
  def void structFieldIndex() {
    val schema = parser.parse(
    '''
	struct S1 {
		f1 : float;
		s2 : S2;
		d1 : double;
		f2 : float;
		f3 : float;
	}
	struct S2 {
		i1 : int;
		b1 : bool;
	})''')
    
    val struct = schema.definitions.get(0) as Struct
    
    assertEquals(0, struct.indexOf(0)) // f1
    assertEquals(4, struct.indexOf(1)) // i1
    assertEquals(8, struct.indexOf(2)) // b1
    assertEquals(16, struct.indexOf(3)) // d1
    assertEquals(24, struct.indexOf(4)) // f2
    assertEquals(28, struct.indexOf(5)) // f3
  }
 
}