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
  def void generateEmptyRootTable() {
    val model = parser.parse('''
      table T1 {}
      root_type = T1;
    ''')
    assertEquals(generator.generate(model).toString.trim,
'''
using FlatBuffers;

public sealed class T1 : Table {
	
	public static T1 Make(byte[] data) {
		T1 obj = new T1();
		obj.bb = new ByteBuffer(data);
		obj.bb_pos = obj.bb.GetInt(obj.bb.Position) + obj.bb.Position; 
		
		return obj;
	}
	internal static T1 _Make(ByteBuffer _bb, int pos) {
		T1 obj = new T1();
		
		obj.bb_pos = pos; 
		obj.bb = _bb;
		
		return obj;
	}
	
	public byte[] Build(){
		FlatBufferBuilder builder = new FlatBufferBuilder(1);
		var offset = this._Build(builder);
		builder.Finish(offset.Value);
		return builder.SizedByteArray();
	}
	internal Offset<T1> _Build(FlatBufferBuilder builder){
		
		
		builder.StartObject(0);
		
		
		int o = builder.EndObject();
		return new Offset<T1>(o);
	}
}
'''.toString.trim)
  }
 
}