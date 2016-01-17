package maxim.zaks.generator;

import com.google.common.base.Objects;
import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.Field;
import maxim.zaks.flatBuffers.RootType;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class SwiftGenerator {
  private String rootTableName;
  
  public CharSequence generate(final Schema schema) {
    CharSequence _xblockexpression = null;
    {
      RootType _rootType = schema.getRootType();
      Table _type = _rootType.getType();
      String _name = _type.getName();
      this.rootTableName = _name;
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Definition> _definitions = schema.getDefinitions();
        for(final Definition definitions : _definitions) {
          CharSequence _definitionReader = this.definitionReader(definitions);
          _builder.append(_definitionReader, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence definitionReader(final Definition definition) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (definition instanceof Table) {
        if (Objects.equal(definition, ((Table)definition))) {
          _matched=true;
          _switchResult = this.tableStructReader(((Table)definition));
        }
      }
    }
    return _switchResult;
  }
  
  public CharSequence tableStructReader(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public struct ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append("TableReader {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private let _reader : FlatBufferReader");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private let _myOffset : ObjectOffset");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _constructorVisibility = this.constructorVisibility(table);
    _builder.append(_constructorVisibility, "\t");
    _builder.append(" init(reader : FlatBufferReader, offset: ObjectOffset? = nil) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("_reader = reader");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("_myOffset = offset ?? reader.rootObjectOffset");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<Field> _fields = table.getFields();
      Iterable<Pair<Integer, Field>> _indexed = IterableExtensions.<Field>indexed(_fields);
      final Function1<Pair<Integer, Field>, CharSequence> _function = (Pair<Integer, Field> it) -> {
        Field _value = it.getValue();
        Integer _key = it.getKey();
        return this.tableStructFieldReader(_value, (_key).intValue());
      };
      Iterable<CharSequence> _map = IterableExtensions.<Pair<Integer, Field>, CharSequence>map(_indexed, _function);
      for(final CharSequence p : _map) {
        _builder.append("\t");
        _builder.append(p, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence constructorVisibility(final Table table) {
    CharSequence _xifexpression = null;
    String _name = table.getName();
    boolean _equals = Objects.equal(_name, this.rootTableName);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("private");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence tableStructFieldReader(final Field field, final int index) {
    CharSequence _xifexpression = null;
    Type _type = field.getType();
    String _primType = _type.getPrimType();
    boolean _notEquals = (!Objects.equal(_primType, null));
    if (_notEquals) {
      CharSequence _xifexpression_1 = null;
      Type _type_1 = field.getType();
      String _primType_1 = _type_1.getPrimType();
      boolean _equals = Objects.equal(_primType_1, "string");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("lazy public var ");
        String _name = field.getName();
        _builder.append(_name, "");
        _builder.append(" : ");
        Type _type_2 = field.getType();
        CharSequence _generateFieldType = this.generateFieldType(_type_2);
        _builder.append(_generateFieldType, "");
        _builder.append("? = self._reader.getString(self._reader.getOffset(self._myOffset, propertyIndex: ");
        _builder.append(index, "");
        _builder.append("))");
        _builder.newLineIfNotEmpty();
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("lazy public var ");
        String _name_1 = field.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" : ");
        Type _type_3 = field.getType();
        CharSequence _generateFieldType_1 = this.generateFieldType(_type_3);
        _builder_1.append(_generateFieldType_1, "");
        _builder_1.append(" = self._reader.get(self._myOffset, propertyIndex: ");
        _builder_1.append(index, "");
        _builder_1.append(", defaultValue: 0)");
        _builder_1.newLineIfNotEmpty();
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      CharSequence _xifexpression_2 = null;
      Type _type_4 = field.getType();
      Definition _defType = _type_4.getDefType();
      boolean _notEquals_1 = (!Objects.equal(_defType, null));
      if (_notEquals_1) {
        CharSequence _xblockexpression = null;
        {
          Type _type_5 = field.getType();
          final CharSequence typeName = this.generateFieldType(_type_5);
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("lazy public var ");
          String _name_2 = field.getName();
          _builder_2.append(_name_2, "");
          _builder_2.append(" : ");
          _builder_2.append(typeName, "");
          _builder_2.append("? = {");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("if let myOffset : ObjectOffset = _reader.getOffset(_myOffset, propertyIndex: ");
          _builder_2.append(index, "\t");
          _builder_2.append("){");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t\t");
          _builder_2.append("return ");
          _builder_2.append(typeName, "\t\t");
          _builder_2.append("(reader: _reader, offset: myOffset)");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("}");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("return nil");
          _builder_2.newLine();
          _builder_2.append("}()");
          _builder_2.newLine();
          _xblockexpression = _builder_2;
        }
        _xifexpression_2 = _xblockexpression;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  public CharSequence generateFieldType(final Type fieldType) {
    CharSequence _xifexpression = null;
    String _primType = fieldType.getPrimType();
    boolean _notEquals = (!Objects.equal(_primType, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      String _primType_1 = fieldType.getPrimType();
      CharSequence _converPrimitiveType = this.converPrimitiveType(_primType_1);
      _builder.append(_converPrimitiveType, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      Definition _defType = fieldType.getDefType();
      boolean _notEquals_1 = (!Objects.equal(_defType, null));
      if (_notEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        Definition _defType_1 = fieldType.getDefType();
        String _name = _defType_1.getName();
        _builder_1.append(_name, "");
        _builder_1.append("TableReader");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        Vector _vectorType = fieldType.getVectorType();
        boolean _notEquals_2 = (!Objects.equal(_vectorType, null));
        if (_notEquals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("[");
          Vector _vectorType_1 = fieldType.getVectorType();
          CharSequence _generateVectorType = this.generateVectorType(_vectorType_1);
          _builder_2.append(_generateVectorType, "");
          _builder_2.append("]");
          _xifexpression_2 = _builder_2;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence generateVectorType(final Vector vectorType) {
    CharSequence _xifexpression = null;
    Type _type = vectorType.getType();
    String _primType = _type.getPrimType();
    boolean _notEquals = (!Objects.equal(_primType, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      Type _type_1 = vectorType.getType();
      String _primType_1 = _type_1.getPrimType();
      CharSequence _converPrimitiveType = this.converPrimitiveType(_primType_1);
      _builder.append(_converPrimitiveType, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      Type _type_2 = vectorType.getType();
      Definition _defType = _type_2.getDefType();
      boolean _notEquals_1 = (!Objects.equal(_defType, null));
      if (_notEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        Type _type_3 = vectorType.getType();
        Definition _defType_1 = _type_3.getDefType();
        String _name = _defType_1.getName();
        _builder_1.append(_name, "");
        _builder_1.append("TableReader");
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence converPrimitiveType(final String type) {
    CharSequence _switchResult = null;
    switch (type) {
      case "bool":
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Bool");
        _switchResult = _builder;
        break;
      case "byte":
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Int8");
        _switchResult = _builder_1;
        break;
      case "ubyte":
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("UInt8");
        _switchResult = _builder_2;
        break;
      case "short":
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("Int16");
        _switchResult = _builder_3;
        break;
      case "ushort":
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("UInt16");
        _switchResult = _builder_4;
        break;
      case "int":
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("Int32");
        _switchResult = _builder_5;
        break;
      case "uint":
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("UInt32");
        _switchResult = _builder_6;
        break;
      case "float":
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("Float32");
        _switchResult = _builder_7;
        break;
      case "long":
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("Int64");
        _switchResult = _builder_8;
        break;
      case "ulong":
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("UInt64");
        _switchResult = _builder_9;
        break;
      case "double":
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("Float64");
        _switchResult = _builder_10;
        break;
      case "string":
        StringConcatenation _builder_11 = new StringConcatenation();
        _builder_11.append("String");
        _switchResult = _builder_11;
        break;
    }
    return _switchResult;
  }
}
