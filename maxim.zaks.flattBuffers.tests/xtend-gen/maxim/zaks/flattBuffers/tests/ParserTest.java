package maxim.zaks.flattBuffers.tests;

import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import maxim.zaks.FlatBuffersInjectorProvider;
import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.CustomAttributes;
import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.EnumCase;
import maxim.zaks.flatBuffers.FieldAttributes;
import maxim.zaks.flatBuffers.Fields;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Struct;
import maxim.zaks.flatBuffers.StructFields;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Union;
import maxim.zaks.flatBuffers.Value;
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
      EList<Definition> _definitions = model.getDefinitions();
      final Definition table1 = _definitions.get(0);
      String _name = table1.getName();
      Assert.assertEquals(_name, "MyEntity1");
      EList<Definition> _definitions_1 = model.getDefinitions();
      final Definition table2 = _definitions_1.get(1);
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
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
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
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
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
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
      final List<String> types = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("byte", "ubyte", "bool", "short", "ushort", "int", "uint", "float", "long", "ulong", "double", "string"));
      final Procedure2<String, Integer> _function = (String type, Integer index) -> {
        EList<Fields> _fields = table.getFields();
        final Fields field = _fields.get((index).intValue());
        String _name = field.getName();
        Assert.assertEquals(_name, ("n" + Integer.valueOf(((index).intValue() + 1))));
        Type _type = field.getType();
        Vector _vectorType = _type.getVectorType();
        Type _type_1 = _vectorType.getType();
        String _primType = _type_1.getPrimType();
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
      _builder.append("friend: AnotherEntity;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("table AnotherEntity{}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
      EList<Fields> _fields = table.getFields();
      final Fields field = _fields.get(0);
      String _name = field.getName();
      Assert.assertEquals(_name, "friend");
      Type _type = field.getType();
      Definition _defType = _type.getDefType();
      String _name_1 = _defType.getName();
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
      _builder.append("friend: [AnotherEntity];");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("table AnotherEntity{}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
      EList<Fields> _fields = table.getFields();
      final Fields field = _fields.get(0);
      String _name = field.getName();
      Assert.assertEquals(_name, "friend");
      Type _type = field.getType();
      Vector _vectorType = _type.getVectorType();
      Type _type_1 = _vectorType.getType();
      Definition _defType = _type_1.getDefType();
      String _name_1 = _defType.getName();
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
      _builder.append("n1: bool = true;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n2: int = 32;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n3: float = 0.32;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("n4: float = -0.25f;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
      EList<Fields> _fields = table.getFields();
      final Fields field1 = _fields.get(0);
      String _name = field1.getName();
      Assert.assertEquals(_name, "n1");
      Type _type = field1.getType();
      String _primType = _type.getPrimType();
      Assert.assertEquals(_primType, "bool");
      Value _defaultValue = field1.getDefaultValue();
      boolean _isIsTrue = _defaultValue.isIsTrue();
      Assert.assertEquals(Boolean.valueOf(_isIsTrue), Boolean.valueOf(true));
      EList<Fields> _fields_1 = table.getFields();
      final Fields field2 = _fields_1.get(1);
      String _name_1 = field2.getName();
      Assert.assertEquals(_name_1, "n2");
      Type _type_1 = field2.getType();
      String _primType_1 = _type_1.getPrimType();
      Assert.assertEquals(_primType_1, "int");
      Value _defaultValue_1 = field2.getDefaultValue();
      String _number = _defaultValue_1.getNumber();
      Assert.assertEquals(_number, "32");
      EList<Fields> _fields_2 = table.getFields();
      final Fields field3 = _fields_2.get(2);
      String _name_2 = field3.getName();
      Assert.assertEquals(_name_2, "n3");
      Type _type_2 = field3.getType();
      String _primType_2 = _type_2.getPrimType();
      Assert.assertEquals(_primType_2, "float");
      Value _defaultValue_2 = field3.getDefaultValue();
      String _number_1 = _defaultValue_2.getNumber();
      Assert.assertEquals(_number_1, "0.32");
      EList<Fields> _fields_3 = table.getFields();
      final Fields field4 = _fields_3.get(3);
      String _name_3 = field4.getName();
      Assert.assertEquals(_name_3, "n4");
      Type _type_3 = field4.getType();
      String _primType_3 = _type_3.getPrimType();
      Assert.assertEquals(_primType_3, "float");
      Value _defaultValue_3 = field4.getDefaultValue();
      String _number_2 = _defaultValue_3.getNumber();
      Assert.assertEquals(_number_2, "-0.25f");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseTablePropertyWithAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("attribute \"prio\";");
      _builder.newLine();
      _builder.append("table MyEntity {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("n1: bool (deprecated);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("n2: int (key, required, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("original_order, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("force_align:8, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("id:5, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("bit_flags, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("prio, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("prio:7, ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("prio:\"important\", ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.append("nested_flatbuffer: \"MyEntity\");");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("n3: float;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Table table = ((Table) _get);
      EList<Fields> _fields = table.getFields();
      final Fields field1 = _fields.get(0);
      String _name = field1.getName();
      Assert.assertEquals(_name, "n1");
      FieldAttributes _attributes = field1.getAttributes();
      EList<AttributeName> _atributeNames = _attributes.getAtributeNames();
      AttributeName _get_1 = _atributeNames.get(0);
      boolean _isDeprectated = _get_1.isDeprectated();
      Assert.assertEquals(Boolean.valueOf(_isDeprectated), Boolean.valueOf(true));
      EList<Fields> _fields_1 = table.getFields();
      final Fields field2 = _fields_1.get(1);
      String _name_1 = field2.getName();
      Assert.assertEquals(_name_1, "n2");
      FieldAttributes _attributes_1 = field2.getAttributes();
      EList<AttributeName> _atributeNames_1 = _attributes_1.getAtributeNames();
      AttributeName _get_2 = _atributeNames_1.get(0);
      boolean _isKey = _get_2.isKey();
      Assert.assertEquals(Boolean.valueOf(_isKey), Boolean.valueOf(true));
      FieldAttributes _attributes_2 = field2.getAttributes();
      EList<AttributeName> _atributeNames_2 = _attributes_2.getAtributeNames();
      AttributeName _get_3 = _atributeNames_2.get(1);
      boolean _isRequired = _get_3.isRequired();
      Assert.assertEquals(Boolean.valueOf(_isRequired), Boolean.valueOf(true));
      FieldAttributes _attributes_3 = field2.getAttributes();
      EList<AttributeName> _atributeNames_3 = _attributes_3.getAtributeNames();
      AttributeName _get_4 = _atributeNames_3.get(2);
      boolean _isOriginal_order = _get_4.isOriginal_order();
      Assert.assertEquals(Boolean.valueOf(_isOriginal_order), Boolean.valueOf(true));
      FieldAttributes _attributes_4 = field2.getAttributes();
      EList<AttributeName> _atributeNames_4 = _attributes_4.getAtributeNames();
      AttributeName _get_5 = _atributeNames_4.get(3);
      boolean _isHasAlignSize = _get_5.isHasAlignSize();
      Assert.assertEquals(Boolean.valueOf(_isHasAlignSize), Boolean.valueOf(true));
      FieldAttributes _attributes_5 = field2.getAttributes();
      EList<AttributeName> _atributeNames_5 = _attributes_5.getAtributeNames();
      AttributeName _get_6 = _atributeNames_5.get(3);
      int _alignSize = _get_6.getAlignSize();
      Assert.assertEquals(_alignSize, 8);
      FieldAttributes _attributes_6 = field2.getAttributes();
      EList<AttributeName> _atributeNames_6 = _attributes_6.getAtributeNames();
      AttributeName _get_7 = _atributeNames_6.get(4);
      boolean _isHasAttributeId = _get_7.isHasAttributeId();
      Assert.assertEquals(Boolean.valueOf(_isHasAttributeId), Boolean.valueOf(true));
      FieldAttributes _attributes_7 = field2.getAttributes();
      EList<AttributeName> _atributeNames_7 = _attributes_7.getAtributeNames();
      AttributeName _get_8 = _atributeNames_7.get(4);
      int _attributeId = _get_8.getAttributeId();
      Assert.assertEquals(_attributeId, 5);
      FieldAttributes _attributes_8 = field2.getAttributes();
      EList<AttributeName> _atributeNames_8 = _attributes_8.getAtributeNames();
      AttributeName _get_9 = _atributeNames_8.get(5);
      boolean _isBit_flags = _get_9.isBit_flags();
      Assert.assertEquals(Boolean.valueOf(_isBit_flags), Boolean.valueOf(true));
      FieldAttributes _attributes_9 = field2.getAttributes();
      EList<AttributeName> _atributeNames_9 = _attributes_9.getAtributeNames();
      AttributeName _get_10 = _atributeNames_9.get(6);
      CustomAttributes _customName = _get_10.getCustomName();
      String _name_2 = _customName.getName();
      Assert.assertEquals(_name_2, "prio");
      FieldAttributes _attributes_10 = field2.getAttributes();
      EList<AttributeName> _atributeNames_10 = _attributes_10.getAtributeNames();
      AttributeName _get_11 = _atributeNames_10.get(7);
      int _intValue = _get_11.getIntValue();
      Assert.assertEquals(_intValue, 7);
      FieldAttributes _attributes_11 = field2.getAttributes();
      EList<AttributeName> _atributeNames_11 = _attributes_11.getAtributeNames();
      AttributeName _get_12 = _atributeNames_11.get(8);
      String _stringValue = _get_12.getStringValue();
      Assert.assertEquals(_stringValue, "important");
      FieldAttributes _attributes_12 = field2.getAttributes();
      EList<AttributeName> _atributeNames_12 = _attributes_12.getAtributeNames();
      AttributeName _get_13 = _atributeNames_12.get(9);
      String _nestedTableName = _get_13.getNestedTableName();
      Assert.assertEquals(_nestedTableName, "MyEntity");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseEnum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enum Foo : byte {A = 12, B, C}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final maxim.zaks.flatBuffers.Enum e = ((maxim.zaks.flatBuffers.Enum) _get);
      String _name = e.getName();
      Assert.assertEquals(_name, "Foo");
      String _type = e.getType();
      Assert.assertEquals(_type, "byte");
      EList<EnumCase> _enumCases = e.getEnumCases();
      EnumCase _get_1 = _enumCases.get(0);
      String _name_1 = _get_1.getName();
      Assert.assertEquals(_name_1, "A");
      EList<EnumCase> _enumCases_1 = e.getEnumCases();
      EnumCase _get_2 = _enumCases_1.get(0);
      int _value = _get_2.getValue();
      Assert.assertEquals(_value, 12);
      EList<EnumCase> _enumCases_2 = e.getEnumCases();
      EnumCase _get_3 = _enumCases_2.get(1);
      String _name_2 = _get_3.getName();
      Assert.assertEquals(_name_2, "B");
      EList<EnumCase> _enumCases_3 = e.getEnumCases();
      EnumCase _get_4 = _enumCases_3.get(2);
      String _name_3 = _get_4.getName();
      Assert.assertEquals(_name_3, "C");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseEnumWithoutType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enum Foo {A = 12, B, C}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final maxim.zaks.flatBuffers.Enum e = ((maxim.zaks.flatBuffers.Enum) _get);
      String _name = e.getName();
      Assert.assertEquals(_name, "Foo");
      String _type = e.getType();
      Assert.assertEquals(_type, null);
      EList<EnumCase> _enumCases = e.getEnumCases();
      EnumCase _get_1 = _enumCases.get(0);
      String _name_1 = _get_1.getName();
      Assert.assertEquals(_name_1, "A");
      EList<EnumCase> _enumCases_1 = e.getEnumCases();
      EnumCase _get_2 = _enumCases_1.get(0);
      int _value = _get_2.getValue();
      Assert.assertEquals(_value, 12);
      EList<EnumCase> _enumCases_2 = e.getEnumCases();
      EnumCase _get_3 = _enumCases_2.get(1);
      String _name_2 = _get_3.getName();
      Assert.assertEquals(_name_2, "B");
      EList<EnumCase> _enumCases_3 = e.getEnumCases();
      EnumCase _get_4 = _enumCases_3.get(2);
      String _name_3 = _get_4.getName();
      Assert.assertEquals(_name_3, "C");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseStruct() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("struct Vec3 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("x:float;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("y:float;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("z:float;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(0);
      final Struct struct = ((Struct) _get);
      String _name = struct.getName();
      Assert.assertEquals(_name, "Vec3");
      EList<StructFields> _fields = struct.getFields();
      StructFields _get_1 = _fields.get(0);
      String _name_1 = _get_1.getName();
      Assert.assertEquals(_name_1, "x");
      EList<StructFields> _fields_1 = struct.getFields();
      StructFields _get_2 = _fields_1.get(1);
      String _name_2 = _get_2.getName();
      Assert.assertEquals(_name_2, "y");
      EList<StructFields> _fields_2 = struct.getFields();
      StructFields _get_3 = _fields_2.get(2);
      String _name_3 = _get_3.getName();
      Assert.assertEquals(_name_3, "z");
      EList<StructFields> _fields_3 = struct.getFields();
      StructFields _get_4 = _fields_3.get(0);
      String _primType = _get_4.getPrimType();
      Assert.assertEquals(_primType, "float");
      EList<StructFields> _fields_4 = struct.getFields();
      StructFields _get_5 = _fields_4.get(1);
      String _primType_1 = _get_5.getPrimType();
      Assert.assertEquals(_primType_1, "float");
      EList<StructFields> _fields_5 = struct.getFields();
      StructFields _get_6 = _fields_5.get(2);
      String _primType_2 = _get_6.getPrimType();
      Assert.assertEquals(_primType_2, "float");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseUnion() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("table A {  }");
      _builder.newLine();
      _builder.append("table B {  }");
      _builder.newLine();
      _builder.append("union Any {A, B}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(2);
      final Union e = ((Union) _get);
      String _name = e.getName();
      Assert.assertEquals(_name, "Any");
      EList<Table> _unionCases = e.getUnionCases();
      Table _get_1 = _unionCases.get(0);
      String _name_1 = _get_1.getName();
      Assert.assertEquals(_name_1, "A");
      EList<Table> _unionCases_1 = e.getUnionCases();
      Table _get_2 = _unionCases_1.get(1);
      String _name_2 = _get_2.getName();
      Assert.assertEquals(_name_2, "B");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseDefaultValueAsEnum() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enum Foo : byte {A = 12, B, C}");
      _builder.newLine();
      _builder.append("table T1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("foo: Foo = A;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Schema model = this.parser.parse(_builder);
      EList<Definition> _definitions = model.getDefinitions();
      Definition _get = _definitions.get(1);
      final Table e = ((Table) _get);
      String _name = e.getName();
      Assert.assertEquals(_name, "T1");
      EList<Fields> _fields = e.getFields();
      final Fields f = _fields.get(0);
      String _name_1 = f.getName();
      Assert.assertEquals(_name_1, "foo");
      Type _type = f.getType();
      Definition _defType = _type.getDefType();
      String _name_2 = _defType.getName();
      Assert.assertEquals(_name_2, "Foo");
      Value _defaultValue = f.getDefaultValue();
      String _enumCase = _defaultValue.getEnumCase();
      Assert.assertEquals(_enumCase, "A");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
