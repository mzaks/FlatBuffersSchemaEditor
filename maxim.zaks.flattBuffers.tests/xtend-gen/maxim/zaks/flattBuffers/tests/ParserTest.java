package maxim.zaks.flattBuffers.tests;

import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import maxim.zaks.FlatBuffersInjectorProvider;
import maxim.zaks.flatBuffers.Fields;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.TableType;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(FlatBuffersInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Schema> parser;
  
  @Test
  public void parseTables() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity1 {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("table MyEntity2 {");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table1 = _tables.get(0);
      String _name = table1.getName();
      Assert.assertEquals(_name, "MyEntity1");
      EList<Table> _tables_1 = model.getTables();
      final Table table2 = _tables_1.get(1);
      String _name_1 = table2.getName();
      Assert.assertEquals(_name_1, "MyEntity2");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTableWithOnefield() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n1: int;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table = _tables.get(0);
      String _name = table.getName();
      Assert.assertEquals(_name, "MyEntity");
      EList<Fields> _fields = table.getFields();
      final Fields field = _fields.get(0);
      String _name_1 = field.getName();
      Assert.assertEquals(_name_1, "n1");
      Type _type = field.getType();
      String _primType = _type.getPrimType();
      Assert.assertEquals(_primType, "int");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTablePropertiesWithDifferentScalarTypes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n1: byte; ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n2: ubyte;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n3: bool;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n4: short;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n5: ushort;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n6: int;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n7: uint;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n8: float;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n9: long;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n10: ulong;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n11: double;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n12: string;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table = _tables.get(0);
      final List<String> types = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("byte", "ubyte", "bool", "short", "ushort", "int", "uint", "float", "long", "ulong", "double", "string"));
      final Procedure2<String, Integer> _function = (String type, Integer index) -> {
        EList<Fields> _fields = table.getFields();
        final Fields field = _fields.get((index).intValue());
        String _name = field.getName();
        Assert.assertEquals(_name, ("n" + Integer.valueOf(((index).intValue() + 1))));
        Type _type = field.getType();
        String _primType = _type.getPrimType();
        Assert.assertEquals(_primType, type);
      };
      IterableExtensions.<String>forEach(types, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTablePropertiesWithDifferentArrayScalarTypes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n1: [byte]; ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n2: [ubyte];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n3: [bool];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n4: [short];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n5: [ushort];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n6: [int];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n7: [uint];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n8: [float];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n9: [long];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n10: [ulong];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n11: [double];");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n12: [string];");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table = _tables.get(0);
      final List<String> types = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("byte", "ubyte", "bool", "short", "ushort", "int", "uint", "float", "long", "ulong", "double", "string"));
      final Procedure2<String, Integer> _function = (String type, Integer index) -> {
        EList<Fields> _fields = table.getFields();
        final Fields field = _fields.get((index).intValue());
        String _name = field.getName();
        Assert.assertEquals(_name, ("n" + Integer.valueOf(((index).intValue() + 1))));
        Type _type = field.getType();
        Vector _vectorType = _type.getVectorType();
        String _primType = _vectorType.getPrimType();
        Assert.assertEquals(_primType, type);
      };
      IterableExtensions.<String>forEach(types, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTablePropertyWithTableType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("friend: AnotherEntity");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("table AnotherEntity{}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table = _tables.get(0);
      EList<Fields> _fields = table.getFields();
      final Fields field = _fields.get(0);
      String _name = field.getName();
      Assert.assertEquals(_name, "friend");
      Type _type = field.getType();
      TableType _tableType = _type.getTableType();
      Table _type_1 = _tableType.getType();
      String _name_1 = _type_1.getName();
      Assert.assertEquals(_name_1, "AnotherEntity");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTablePropertyWithVectorOfTableType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("friend: [AnotherEntity]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("table AnotherEntity{}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table = _tables.get(0);
      EList<Fields> _fields = table.getFields();
      final Fields field = _fields.get(0);
      String _name = field.getName();
      Assert.assertEquals(_name, "friend");
      Type _type = field.getType();
      Vector _vectorType = _type.getVectorType();
      TableType _tableType = _vectorType.getTableType();
      Table _type_1 = _tableType.getType();
      String _name_1 = _type_1.getName();
      Assert.assertEquals(_name_1, "AnotherEntity");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTablePropertyWithDefaultValues() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n1: bool = true");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n2: int = 32");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n3: float = 0.32");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Table> _tables = model.getTables();
      final Table table = _tables.get(0);
      EList<Fields> _fields = table.getFields();
      final Fields field1 = _fields.get(0);
      String _name = field1.getName();
      Assert.assertEquals(_name, "n1");
      Type _type = field1.getType();
      String _primType = _type.getPrimType();
      Assert.assertEquals(_primType, "bool");
      String _defaultValue = field1.getDefaultValue();
      Assert.assertEquals(_defaultValue, "true");
      EList<Fields> _fields_1 = table.getFields();
      final Fields field2 = _fields_1.get(1);
      String _name_1 = field2.getName();
      Assert.assertEquals(_name_1, "n2");
      Type _type_1 = field2.getType();
      String _primType_1 = _type_1.getPrimType();
      Assert.assertEquals(_primType_1, "int");
      String _defaultValue_1 = field2.getDefaultValue();
      Assert.assertEquals(_defaultValue_1, "32");
      EList<Fields> _fields_2 = table.getFields();
      final Fields field3 = _fields_2.get(2);
      String _name_2 = field3.getName();
      Assert.assertEquals(_name_2, "n3");
      Type _type_2 = field3.getType();
      String _primType_2 = _type_2.getPrimType();
      Assert.assertEquals(_primType_2, "float");
      String _defaultValue_2 = field3.getDefaultValue();
      Assert.assertEquals(_defaultValue_2, "0.32");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
