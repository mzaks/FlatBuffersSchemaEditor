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

@InjectWith(FlatBuffersInjectorProvider)
@RunWith(XtextRunner)
class CSGeneratorTest {
  @Inject
  ParseHelper<Schema> parser
  CSharpGenerator generator = new CSharpGenerator()
 
  @Test
  def void generateSimpleEnum() {
    val model = parser.parse('''
      table T1 {}
      enum MyEnum {
      	A, B, C
      }
      root_type = T1;
    ''')
    assertEquals(generator.generate(model),
    	'''
    	public enum MyEnum {
    		A,
    		B,
    		C,
    	}
    	'''
    )
    
  }
 
}