package maxim.zaks.generator;

import com.google.common.base.Objects;
import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.EnumCase;
import maxim.zaks.flatBuffers.Fields;
import maxim.zaks.flatBuffers.Namespace;
import maxim.zaks.flatBuffers.RootType;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Value;
import maxim.zaks.flatBuffers.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CSharpGenerator {
  private String rootTableName = "";
  
  private String nameSpace;
  
  private String fileIdentifier;
  
  public CharSequence generate(final Schema schema) {
    CharSequence _xblockexpression = null;
    {
      RootType _rootType = schema.getRootType();
      Table _type = _rootType.getType();
      String _name = _type.getName();
      this.rootTableName = _name;
      Namespace _namepsace = schema.getNamepsace();
      String _name_1 = null;
      if (_namepsace!=null) {
        _name_1=_namepsace.getName();
      }
      this.nameSpace = _name_1;
      String _fileIdentifier = schema.getFileIdentifier();
      this.fileIdentifier = _fileIdentifier;
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _notEquals = (!Objects.equal(this.nameSpace, null));
        if (_notEquals) {
          _builder.append("namespace ");
          _builder.append(this.nameSpace, "");
          _builder.append(".Eager {");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("using FlatBuffers;");
      _builder.newLine();
      _builder.newLine();
      {
        EList<Definition> _definitions = schema.getDefinitions();
        for(final Definition definition : _definitions) {
          CharSequence _definitionReader = this.definitionReader(definition);
          _builder.append(_definitionReader, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      {
        boolean _notEquals_1 = (!Objects.equal(this.nameSpace, null));
        if (_notEquals_1) {
          _builder.append("}");
          _builder.newLine();
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
    if (!_matched) {
      if (definition instanceof maxim.zaks.flatBuffers.Enum) {
        if (Objects.equal(definition, ((maxim.zaks.flatBuffers.Enum)definition))) {
          _matched=true;
          _switchResult = this.enumGenerator(((maxim.zaks.flatBuffers.Enum)definition));
        }
      }
    }
    return _switchResult;
  }
  
  public CharSequence tableStructReader(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public sealed class ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append(" : Table {");
    _builder.newLineIfNotEmpty();
    {
      EList<Fields> _fields = table.getFields();
      Iterable<Pair<Integer, Fields>> _indexed = IterableExtensions.<Fields>indexed(_fields);
      final Function1<Pair<Integer, Fields>, CharSequence> _function = (Pair<Integer, Fields> it) -> {
        Fields _value = it.getValue();
        Integer _key = it.getKey();
        return this.tableStructFieldReader(_value, (_key).intValue());
      };
      Iterable<CharSequence> _map = IterableExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexed, _function);
      for(final CharSequence p : _map) {
        _builder.append("\t");
        _builder.append(p, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _makeMethod = this.makeMethod(table);
    _builder.append(_makeMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _buildMethod = this.buildMethod(table);
    _builder.append(_buildMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence tableStructFieldReader(final Fields field, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    Type _type = field.getType();
    CharSequence _generateFieldType = this.generateFieldType(_type);
    _builder.append(_generateFieldType, "");
    _builder.append(" ");
    String _name = field.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String makeMethod(final Table table) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String rootMakeMethod = _builder.toString();
      String _name = table.getName();
      boolean _equals = Objects.equal(_name, this.rootTableName);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("public static ");
        String _name_1 = table.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" Make(byte[] data) {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        String _name_2 = table.getName();
        _builder_1.append(_name_2, "\t");
        _builder_1.append(" obj = new ");
        String _name_3 = table.getName();
        _builder_1.append(_name_3, "\t");
        _builder_1.append("();");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("obj.bb = new ByteBuffer(data);");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("obj.bb_pos = obj.bb.GetInt(obj.bb.Position) + obj.bb.Position; ");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.newLine();
        {
          EList<Fields> _fields = table.getFields();
          Iterable<Pair<Integer, Fields>> _indexed = IterableExtensions.<Fields>indexed(_fields);
          final Function1<Pair<Integer, Fields>, CharSequence> _function = (Pair<Integer, Fields> it) -> {
            Fields _value = it.getValue();
            Integer _key = it.getKey();
            return this.initFields(_value, (_key).intValue());
          };
          Iterable<CharSequence> _map = IterableExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexed, _function);
          for(final CharSequence p : _map) {
            _builder_1.append("\t");
            _builder_1.append(p, "\t");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("\t");
        _builder_1.append("return obj;");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        rootMakeMethod = _builder_1.toString();
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("internal static ");
      String _name_4 = table.getName();
      _builder_2.append(_name_4, "");
      _builder_2.append(" _Make(ByteBuffer _bb, int pos) {");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      String _name_5 = table.getName();
      _builder_2.append(_name_5, "\t");
      _builder_2.append(" obj = new ");
      String _name_6 = table.getName();
      _builder_2.append(_name_6, "\t");
      _builder_2.append("();");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("obj.bb_pos = pos; ");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.append("obj.bb = _bb;");
      _builder_2.newLine();
      _builder_2.append("\t");
      _builder_2.newLine();
      {
        EList<Fields> _fields_1 = table.getFields();
        Iterable<Pair<Integer, Fields>> _indexed_1 = IterableExtensions.<Fields>indexed(_fields_1);
        final Function1<Pair<Integer, Fields>, CharSequence> _function_1 = (Pair<Integer, Fields> it) -> {
          Fields _value = it.getValue();
          Integer _key = it.getKey();
          return this.initFields(_value, (_key).intValue());
        };
        Iterable<CharSequence> _map_1 = IterableExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexed_1, _function_1);
        for(final CharSequence p_1 : _map_1) {
          _builder_2.append("\t");
          _builder_2.append(p_1, "\t");
          _builder_2.newLineIfNotEmpty();
        }
      }
      _builder_2.append("\t");
      _builder_2.append("return obj;");
      _builder_2.newLine();
      _builder_2.append("}");
      _builder_2.newLine();
      _xblockexpression = (rootMakeMethod + _builder_2);
    }
    return _xblockexpression;
  }
  
  public CharSequence initFields(final Fields field, final int index) {
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
        _builder.append("int o");
        _builder.append(index, "");
        _builder.append(" = obj.__offset(4 + 2*");
        _builder.append(index, "");
        _builder.append("); ");
        _builder.newLineIfNotEmpty();
        _builder.append("obj.");
        String _name = field.getName();
        _builder.append(_name, "");
        _builder.append(" =  o");
        _builder.append(index, "");
        _builder.append(" != 0 ? obj.__string(o");
        _builder.append(index, "");
        _builder.append(" + obj.bb_pos) : null;");
        _builder.newLineIfNotEmpty();
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("int o");
        _builder_1.append(index, "");
        _builder_1.append(" = obj.__offset(4 + 2*");
        _builder_1.append(index, "");
        _builder_1.append("); ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("obj.");
        String _name_1 = field.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" =  o");
        _builder_1.append(index, "");
        _builder_1.append(" != 0 ? obj.bb.");
        Type _type_2 = field.getType();
        String _primType_2 = _type_2.getPrimType();
        CharSequence _converPrimitiveTypeGetter = this.converPrimitiveTypeGetter(_primType_2);
        _builder_1.append(_converPrimitiveTypeGetter, "");
        _builder_1.append("(o");
        _builder_1.append(index, "");
        _builder_1.append(" + obj.bb_pos) : (");
        Type _type_3 = field.getType();
        String _primType_3 = _type_3.getPrimType();
        CharSequence _converPrimitiveType = this.converPrimitiveType(_primType_3);
        _builder_1.append(_converPrimitiveType, "");
        _builder_1.append(")");
        Object _defaultValueString = this.defaultValueString(field);
        _builder_1.append(_defaultValueString, "");
        _builder_1.append(";");
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
          final Definition definition = _type_5.getDefType();
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (definition instanceof Table) {
              if (Objects.equal(definition, ((Table)definition))) {
                _matched=true;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("int o");
                _builder_2.append(index, "");
                _builder_2.append(" = obj.__offset(4 + 2*");
                _builder_2.append(index, "");
                _builder_2.append("); ");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("obj.");
                String _name_2 = field.getName();
                _builder_2.append(_name_2, "");
                _builder_2.append(" =  o");
                _builder_2.append(index, "");
                _builder_2.append(" != 0 ? ");
                Type _type_6 = field.getType();
                Definition _defType_1 = _type_6.getDefType();
                String _name_3 = _defType_1.getName();
                _builder_2.append(_name_3, "");
                _builder_2.append("._Make(obj.bb, obj.__indirect(o");
                _builder_2.append(index, "");
                _builder_2.append(" + obj.bb_pos)) : null;");
                _builder_2.newLineIfNotEmpty();
                _switchResult = _builder_2;
              }
            }
          }
          if (!_matched) {
            if (definition instanceof maxim.zaks.flatBuffers.Enum) {
              if (Objects.equal(definition, ((maxim.zaks.flatBuffers.Enum)definition))) {
                _matched=true;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("int o");
                _builder_2.append(index, "");
                _builder_2.append(" = obj.__offset(4 + 2*");
                _builder_2.append(index, "");
                _builder_2.append("); ");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("obj.");
                String _name_2 = field.getName();
                _builder_2.append(_name_2, "");
                _builder_2.append(" =  o");
                _builder_2.append(index, "");
                _builder_2.append(" != 0 ? obj.bb.");
                String _type_6 = ((maxim.zaks.flatBuffers.Enum)definition).getType();
                CharSequence _converPrimitiveTypeGetter_1 = this.converPrimitiveTypeGetter(_type_6);
                _builder_2.append(_converPrimitiveTypeGetter_1, "");
                _builder_2.append("(o");
                _builder_2.append(index, "");
                _builder_2.append(" + obj.bb_pos) : (");
                String _name_3 = ((maxim.zaks.flatBuffers.Enum)definition).getName();
                _builder_2.append(_name_3, "");
                _builder_2.append(")0;");
                _builder_2.newLineIfNotEmpty();
                _switchResult = _builder_2;
              }
            }
          }
          _xblockexpression = _switchResult;
        }
        _xifexpression_2 = _xblockexpression;
      } else {
        Type _type_5 = field.getType();
        Vector _vectorType = _type_5.getVectorType();
        boolean _notEquals_2 = (!Objects.equal(_vectorType, null));
        if (_notEquals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("int o");
          _builder_2.append(index, "");
          _builder_2.append(" =obj. __offset(4 + 2*");
          _builder_2.append(index, "");
          _builder_2.append(");");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("int length");
          _builder_2.append(index, "");
          _builder_2.append(" = o");
          _builder_2.append(index, "");
          _builder_2.append(" != 0 ? obj.__vector_len(o");
          _builder_2.append(index, "");
          _builder_2.append(") : 0;");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("obj.");
          String _name_2 = field.getName();
          _builder_2.append(_name_2, "");
          _builder_2.append(" = new ");
          Type _type_6 = field.getType();
          Vector _vectorType_1 = _type_6.getVectorType();
          CharSequence _generateVectorType = this.generateVectorType(_vectorType_1);
          _builder_2.append(_generateVectorType, "");
          _builder_2.append("[length");
          _builder_2.append(index, "");
          _builder_2.append("];");
          _builder_2.newLineIfNotEmpty();
          final String LengthStatement = _builder_2.toString();
          Type _type_7 = field.getType();
          Vector _vectorType_2 = _type_7.getVectorType();
          Type _type_8 = _vectorType_2.getType();
          String _primType_4 = _type_8.getPrimType();
          boolean _notEquals_3 = (!Objects.equal(_primType_4, null));
          if (_notEquals_3) {
            Type _type_9 = field.getType();
            Vector _vectorType_3 = _type_9.getVectorType();
            Type _type_10 = _vectorType_3.getType();
            String _primType_5 = _type_10.getPrimType();
            boolean _equals_1 = _primType_5.equals("string");
            if (_equals_1) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("for (int j = length");
              _builder_3.append(index, "");
              _builder_3.append("-1; j >=0; j-- ){");
              _builder_3.newLineIfNotEmpty();
              _builder_3.append("\t");
              _builder_3.append("obj.");
              String _name_3 = field.getName();
              _builder_3.append(_name_3, "\t");
              _builder_3.append("[j] = obj.__string(obj.__vector(o");
              _builder_3.append(index, "\t");
              _builder_3.append(") + j * 4);");
              _builder_3.newLineIfNotEmpty();
              _builder_3.append("}");
              _builder_3.newLine();
              return (LengthStatement + _builder_3);
            } else {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.append("for (int j = length");
              _builder_4.append(index, "");
              _builder_4.append("-1; j >=0; j-- ){");
              _builder_4.newLineIfNotEmpty();
              _builder_4.append("\t");
              _builder_4.append("obj.");
              String _name_4 = field.getName();
              _builder_4.append(_name_4, "\t");
              _builder_4.append("[j] = obj.bb.");
              Type _type_11 = field.getType();
              Vector _vectorType_4 = _type_11.getVectorType();
              Type _type_12 = _vectorType_4.getType();
              String _primType_6 = _type_12.getPrimType();
              CharSequence _converPrimitiveTypeGetter_1 = this.converPrimitiveTypeGetter(_primType_6);
              _builder_4.append(_converPrimitiveTypeGetter_1, "\t");
              _builder_4.append("(obj.__vector(o");
              _builder_4.append(index, "\t");
              _builder_4.append(") + j * 4);");
              _builder_4.newLineIfNotEmpty();
              _builder_4.append("}");
              _builder_4.newLine();
              return (LengthStatement + _builder_4);
            }
          } else {
            StringConcatenation _builder_5 = new StringConcatenation();
            _builder_5.append("for (int j = length");
            _builder_5.append(index, "");
            _builder_5.append("-1; j >=0; j-- ){");
            _builder_5.newLineIfNotEmpty();
            _builder_5.append("\t");
            _builder_5.append("obj.");
            String _name_5 = field.getName();
            _builder_5.append(_name_5, "\t");
            _builder_5.append("[j] = ");
            Type _type_13 = field.getType();
            Vector _vectorType_5 = _type_13.getVectorType();
            Type _type_14 = _vectorType_5.getType();
            Definition _defType_1 = _type_14.getDefType();
            String _name_6 = _defType_1.getName();
            _builder_5.append(_name_6, "\t");
            _builder_5.append("._Make(obj.bb, obj.__indirect(obj.__vector(o");
            _builder_5.append(index, "\t");
            _builder_5.append(") + j * 4));");
            _builder_5.newLineIfNotEmpty();
            _builder_5.append("}");
            _builder_5.newLine();
            return (LengthStatement + _builder_5);
          }
        }
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  public String buildMethod(final Table table) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String rootBuild = _builder.toString();
      String _name = table.getName();
      boolean _equals = Objects.equal(_name, this.rootTableName);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("builder.Finish(offset.Value);");
        String finishCall = _builder_1.toString();
        boolean _notEquals = (!Objects.equal(this.fileIdentifier, null));
        if (_notEquals) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("builder.Finish(offset.Value, ");
          _builder_2.append(this.fileIdentifier, "");
          _builder_2.append(");");
          finishCall = _builder_2.toString();
        }
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("public byte[] Build(){");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("FlatBufferBuilder builder = new FlatBufferBuilder(1);");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("var offset = this._Build(builder);");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append(finishCall, "\t");
        _builder_3.newLineIfNotEmpty();
        _builder_3.append("\t");
        _builder_3.append("return builder.SizedByteArray();");
        _builder_3.newLine();
        _builder_3.append("}");
        _builder_3.newLine();
        rootBuild = _builder_3.toString();
      }
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("internal Offset<");
      String _name_1 = table.getName();
      _builder_4.append(_name_1, "");
      _builder_4.append("> _Build(FlatBufferBuilder builder){");
      _builder_4.newLineIfNotEmpty();
      _builder_4.append("\t");
      _builder_4.newLine();
      {
        EList<Fields> _fields = table.getFields();
        Iterable<Pair<Integer, Fields>> _indexed = IterableExtensions.<Fields>indexed(_fields);
        final Function1<Pair<Integer, Fields>, CharSequence> _function = (Pair<Integer, Fields> it) -> {
          Fields _value = it.getValue();
          Integer _key = it.getKey();
          return this.buildChildren(_value, (_key).intValue());
        };
        Iterable<CharSequence> _map = IterableExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexed, _function);
        for(final CharSequence p : _map) {
          _builder_4.append("\t");
          _builder_4.append(p, "\t");
          _builder_4.newLineIfNotEmpty();
        }
      }
      _builder_4.append("\t");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("builder.StartObject(");
      EList<Fields> _fields_1 = table.getFields();
      int _length = ((Object[])Conversions.unwrapArray(_fields_1, Object.class)).length;
      _builder_4.append(_length, "\t");
      _builder_4.append(");");
      _builder_4.newLineIfNotEmpty();
      _builder_4.append("\t");
      _builder_4.newLine();
      {
        EList<Fields> _fields_2 = table.getFields();
        Iterable<Pair<Integer, Fields>> _indexed_1 = IterableExtensions.<Fields>indexed(_fields_2);
        final Function1<Pair<Integer, Fields>, CharSequence> _function_1 = (Pair<Integer, Fields> it) -> {
          Fields _value = it.getValue();
          Integer _key = it.getKey();
          return this.addChildren(_value, (_key).intValue());
        };
        Iterable<CharSequence> _map_1 = IterableExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexed_1, _function_1);
        for(final CharSequence p_1 : _map_1) {
          _builder_4.append("\t");
          _builder_4.append(p_1, "\t");
          _builder_4.newLineIfNotEmpty();
        }
      }
      _builder_4.append("\t");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("int o = builder.EndObject();");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("return new Offset<");
      String _name_2 = table.getName();
      _builder_4.append(_name_2, "\t");
      _builder_4.append(">(o);");
      _builder_4.newLineIfNotEmpty();
      _builder_4.append("}");
      _builder_4.newLine();
      _xblockexpression = (rootBuild + _builder_4);
    }
    return _xblockexpression;
  }
  
  public CharSequence buildChildren(final Fields field, final int index) {
    CharSequence _xifexpression = null;
    boolean _and = false;
    Type _type = field.getType();
    String _primType = _type.getPrimType();
    boolean _notEquals = (!Objects.equal(_primType, null));
    if (!_notEquals) {
      _and = false;
    } else {
      Type _type_1 = field.getType();
      String _primType_1 = _type_1.getPrimType();
      boolean _equals = Objects.equal(_primType_1, "string");
      _and = _equals;
    }
    if (_and) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("StringOffset offset");
      _builder.append(index, "");
      _builder.append(" = this.");
      String _name = field.getName();
      _builder.append(_name, "");
      _builder.append(" == null ? default(StringOffset) : builder.CreateString(this.");
      String _name_1 = field.getName();
      _builder.append(_name_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      Type _type_2 = field.getType();
      Definition _defType = _type_2.getDefType();
      boolean _notEquals_1 = (!Objects.equal(_defType, null));
      if (_notEquals_1) {
        CharSequence _xblockexpression = null;
        {
          Type _type_3 = field.getType();
          Definition _defType_1 = _type_3.getDefType();
          final String typeName = _defType_1.getName();
          Type _type_4 = field.getType();
          final Definition definition = _type_4.getDefType();
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (definition instanceof Table) {
              if (Objects.equal(definition, ((Table)definition))) {
                _matched=true;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("Offset<");
                _builder_1.append(typeName, "");
                _builder_1.append("> offset");
                _builder_1.append(index, "");
                _builder_1.append(" = this.");
                String _name_2 = field.getName();
                _builder_1.append(_name_2, "");
                _builder_1.append(" == null ? default(Offset<");
                _builder_1.append(typeName, "");
                _builder_1.append(">) : this.");
                String _name_3 = field.getName();
                _builder_1.append(_name_3, "");
                _builder_1.append("._Build(builder);");
                _builder_1.newLineIfNotEmpty();
                _switchResult = _builder_1;
              }
            }
          }
          _xblockexpression = _switchResult;
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        CharSequence _xifexpression_2 = null;
        Type _type_3 = field.getType();
        Vector _vectorType = _type_3.getVectorType();
        boolean _notEquals_2 = (!Objects.equal(_vectorType, null));
        if (_notEquals_2) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("VectorOffset offset");
          _builder_1.append(index, "");
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("if(this.");
          String _name_2 = field.getName();
          _builder_1.append(_name_2, "");
          _builder_1.append(" == null) {");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("offset");
          _builder_1.append(index, "\t");
          _builder_1.append(" = default(VectorOffset);");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("} else {");
          _builder_1.newLine();
          _builder_1.append("\t");
          Type _type_4 = field.getType();
          Vector _vectorType_1 = _type_4.getVectorType();
          CharSequence _buildVector = this.buildVector(_vectorType_1, field, index);
          _builder_1.append(_buildVector, "\t");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("}");
          _builder_1.newLine();
          _xifexpression_2 = _builder_1;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence buildVector(final Vector vector, final Fields field, final int index) {
    CharSequence _xifexpression = null;
    Type _type = vector.getType();
    String _primType = _type.getPrimType();
    boolean _notEquals = (!Objects.equal(_primType, null));
    if (_notEquals) {
      CharSequence _xifexpression_1 = null;
      Type _type_1 = vector.getType();
      String _primType_1 = _type_1.getPrimType();
      boolean _notEquals_1 = (!Objects.equal(_primType_1, "string"));
      if (_notEquals_1) {
        CharSequence _xblockexpression = null;
        {
          Type _type_2 = vector.getType();
          String _primType_2 = _type_2.getPrimType();
          final CharSequence length = this.converPrimitiveTypeToLength(_primType_2);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("builder.StartVector(");
          _builder.append(length, "");
          _builder.append(", this.");
          String _name = field.getName();
          _builder.append(_name, "");
          _builder.append(".Length, ");
          _builder.append(length, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("for (int i = this.");
          String _name_1 = field.getName();
          _builder.append(_name_1, "");
          _builder.append(".Length - 1; i >= 0; i--) {");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("builder.");
          Type _type_3 = vector.getType();
          String _primType_3 = _type_3.getPrimType();
          CharSequence _converPrimitiveTypeAdd = this.converPrimitiveTypeAdd(_primType_3);
          _builder.append(_converPrimitiveTypeAdd, "\t");
          _builder.append("(this.");
          String _name_2 = field.getName();
          _builder.append(_name_2, "\t");
          _builder.append("[i]);");
          _builder.newLineIfNotEmpty();
          _builder.append("} ");
          _builder.newLine();
          _builder.append("offset");
          _builder.append(index, "");
          _builder.append(" = builder.EndVector();");
          _builder.newLineIfNotEmpty();
          _xblockexpression = _builder;
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("StringOffset[] data = new StringOffset[this.");
        String _name = field.getName();
        _builder.append(_name, "");
        _builder.append(".Length];");
        _builder.newLineIfNotEmpty();
        _builder.append("for (int i = this.");
        String _name_1 = field.getName();
        _builder.append(_name_1, "");
        _builder.append(".Length - 1; i >= 0; i--) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("data[i] = builder.CreateString(this.");
        String _name_2 = field.getName();
        _builder.append(_name_2, "\t");
        _builder.append("[i]);");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append("builder.StartVector(4, this.");
        String _name_3 = field.getName();
        _builder.append(_name_3, "");
        _builder.append(".Length, 4);");
        _builder.newLineIfNotEmpty();
        _builder.append("for (int i = data.Length - 1; i >= 0; i--) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("builder.AddOffset(data[i].Value);");
        _builder.newLine();
        _builder.append("} ");
        _builder.newLine();
        _builder.append("offset");
        _builder.append(index, "");
        _builder.append(" = builder.EndVector();");
        _builder.newLineIfNotEmpty();
        _xifexpression_1 = _builder;
      }
      _xifexpression = _xifexpression_1;
    } else {
      CharSequence _xifexpression_2 = null;
      Type _type_2 = vector.getType();
      Definition _defType = _type_2.getDefType();
      boolean _notEquals_2 = (!Objects.equal(_defType, null));
      if (_notEquals_2) {
        CharSequence _xblockexpression_1 = null;
        {
          Type _type_3 = vector.getType();
          Definition _defType_1 = _type_3.getDefType();
          final String typeName = _defType_1.getName();
          Type _type_4 = vector.getType();
          final Definition definition = _type_4.getDefType();
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (definition instanceof Table) {
              if (Objects.equal(definition, ((Table)definition))) {
                _matched=true;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("Offset<");
                _builder_1.append(typeName, "");
                _builder_1.append(">[] data = new Offset<");
                _builder_1.append(typeName, "");
                _builder_1.append(">[this.");
                String _name_4 = field.getName();
                _builder_1.append(_name_4, "");
                _builder_1.append(".Length];");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("for (int i = this.");
                String _name_5 = field.getName();
                _builder_1.append(_name_5, "");
                _builder_1.append(".Length - 1; i >= 0; i--) {");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                _builder_1.append("data[i] = this.");
                String _name_6 = field.getName();
                _builder_1.append(_name_6, "\t");
                _builder_1.append("[i]._Build(builder);");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("}");
                _builder_1.newLine();
                _builder_1.append("builder.StartVector(4, this.");
                String _name_7 = field.getName();
                _builder_1.append(_name_7, "");
                _builder_1.append(".Length, 4);");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("for (int i = data.Length - 1; i >= 0; i--) {");
                _builder_1.newLine();
                _builder_1.append("\t");
                _builder_1.append("builder.AddOffset(data[i].Value);");
                _builder_1.newLine();
                _builder_1.append("} ");
                _builder_1.newLine();
                _builder_1.append("offset");
                _builder_1.append(index, "");
                _builder_1.append(" = builder.EndVector();");
                _builder_1.newLineIfNotEmpty();
                _switchResult = _builder_1;
              }
            }
          }
          if (!_matched) {
            if (definition instanceof maxim.zaks.flatBuffers.Enum) {
              if (Objects.equal(definition, ((maxim.zaks.flatBuffers.Enum)definition))) {
                _matched=true;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("builder.StartVector(");
                String _type_5 = ((maxim.zaks.flatBuffers.Enum)definition).getType();
                CharSequence _converPrimitiveTypeToLength = this.converPrimitiveTypeToLength(_type_5);
                _builder_1.append(_converPrimitiveTypeToLength, "");
                _builder_1.append(", this.");
                String _name_4 = field.getName();
                _builder_1.append(_name_4, "");
                _builder_1.append(".Length, ");
                String _type_6 = ((maxim.zaks.flatBuffers.Enum)definition).getType();
                CharSequence _converPrimitiveTypeToLength_1 = this.converPrimitiveTypeToLength(_type_6);
                _builder_1.append(_converPrimitiveTypeToLength_1, "");
                _builder_1.append(");");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("for (int i = this.");
                String _name_5 = field.getName();
                _builder_1.append(_name_5, "");
                _builder_1.append(".Length - 1; i >= 0; i--) {");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("\t");
                _builder_1.append("builder.");
                String _type_7 = ((maxim.zaks.flatBuffers.Enum)definition).getType();
                CharSequence _converPrimitiveTypeAdd = this.converPrimitiveTypeAdd(_type_7);
                _builder_1.append(_converPrimitiveTypeAdd, "\t");
                _builder_1.append("(this.");
                String _name_6 = field.getName();
                _builder_1.append(_name_6, "\t");
                _builder_1.append("[i]);");
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("} ");
                _builder_1.newLine();
                _builder_1.append("offset");
                _builder_1.append(index, "");
                _builder_1.append(" = builder.EndVector();");
                _builder_1.newLineIfNotEmpty();
                _switchResult = _builder_1;
              }
            }
          }
          _xblockexpression_1 = _switchResult;
        }
        _xifexpression_2 = _xblockexpression_1;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  public CharSequence addChildren(final Fields field, final int index) {
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
        _builder.append("builder.AddOffset(");
        _builder.append(index, "");
        _builder.append(", offset");
        _builder.append(index, "");
        _builder.append(".Value, 0);");
        _builder.newLineIfNotEmpty();
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("builder.");
        Type _type_2 = field.getType();
        String _primType_2 = _type_2.getPrimType();
        CharSequence _converPrimitiveTypeAdd = this.converPrimitiveTypeAdd(_primType_2);
        _builder_1.append(_converPrimitiveTypeAdd, "");
        _builder_1.append("(");
        _builder_1.append(index, "");
        _builder_1.append(", this.");
        String _name = field.getName();
        _builder_1.append(_name, "");
        _builder_1.append(", (");
        Type _type_3 = field.getType();
        String _primType_3 = _type_3.getPrimType();
        CharSequence _converPrimitiveType = this.converPrimitiveType(_primType_3);
        _builder_1.append(_converPrimitiveType, "");
        _builder_1.append(")");
        Object _defaultValueString = this.defaultValueString(field);
        _builder_1.append(_defaultValueString, "");
        _builder_1.append(");");
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
          final Definition definition = _type_5.getDefType();
          CharSequence _switchResult = null;
          boolean _matched = false;
          if (!_matched) {
            if (definition instanceof Table) {
              if (Objects.equal(definition, ((Table)definition))) {
                _matched=true;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("builder.AddOffset(");
                _builder_2.append(index, "");
                _builder_2.append(", offset");
                _builder_2.append(index, "");
                _builder_2.append(".Value, 0);");
                _switchResult = _builder_2;
              }
            }
          }
          if (!_matched) {
            if (definition instanceof maxim.zaks.flatBuffers.Enum) {
              if (Objects.equal(definition, ((maxim.zaks.flatBuffers.Enum)definition))) {
                _matched=true;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("builder.");
                String _type_6 = ((maxim.zaks.flatBuffers.Enum)definition).getType();
                CharSequence _converPrimitiveTypeAdd_1 = this.converPrimitiveTypeAdd(_type_6);
                _builder_2.append(_converPrimitiveTypeAdd_1, "");
                _builder_2.append("(");
                _builder_2.append(index, "");
                _builder_2.append(", this.");
                String _name_1 = field.getName();
                _builder_2.append(_name_1, "");
                _builder_2.append(", 0);");
                _switchResult = _builder_2;
              }
            }
          }
          _xblockexpression = _switchResult;
        }
        _xifexpression_2 = _xblockexpression;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("builder.AddOffset(");
        _builder_2.append(index, "");
        _builder_2.append(", offset");
        _builder_2.append(index, "");
        _builder_2.append(".Value, 0);");
        _builder_2.newLineIfNotEmpty();
        _xifexpression_2 = _builder_2;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  public Object defaultValueString(final Fields field) {
    Value _defaultValue = field.getDefaultValue();
    boolean _equals = Objects.equal(_defaultValue, null);
    if (_equals) {
      Type _type = field.getType();
      String _primType = _type.getPrimType();
      boolean _equals_1 = Objects.equal(_primType, "bool");
      if (_equals_1) {
        return "false";
      } else {
        return "0";
      }
    }
    return field.getDefaultValue();
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
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        Vector _vectorType = fieldType.getVectorType();
        boolean _notEquals_2 = (!Objects.equal(_vectorType, null));
        if (_notEquals_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          Vector _vectorType_1 = fieldType.getVectorType();
          CharSequence _generateVectorType = this.generateVectorType(_vectorType_1);
          _builder_2.append(_generateVectorType, "");
          _builder_2.append("[]");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          String _qualifiedType = fieldType.getQualifiedType();
          boolean _notEquals_3 = (!Objects.equal(_qualifiedType, null));
          if (_notEquals_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            String _qualifiedType_1 = fieldType.getQualifiedType();
            _builder_3.append(_qualifiedType_1, "");
            _xifexpression_3 = _builder_3;
          }
          _xifexpression_2 = _xifexpression_3;
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
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence enumGenerator(final maxim.zaks.flatBuffers.Enum e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public enum ");
    String _name = e.getName();
    _builder.append(_name, "");
    {
      String _type = e.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        _builder.append(": ");
        String _type_1 = e.getType();
        CharSequence _converPrimitiveType = this.converPrimitiveType(_type_1);
        _builder.append(_converPrimitiveType, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<EnumCase> _enumCases = e.getEnumCases();
      for(final EnumCase ec : _enumCases) {
        _builder.append("\t");
        String _name_1 = ec.getName();
        _builder.append(_name_1, "\t");
        {
          boolean _isHasValue = ec.isHasValue();
          if (_isHasValue) {
            _builder.append(" = ");
            int _value = ec.getValue();
            _builder.append(_value, "\t");
          }
        }
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("};");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence converPrimitiveType(final String type) {
    CharSequence _switchResult = null;
    switch (type) {
      case "bool":
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("bool");
        _switchResult = _builder;
        break;
      case "byte":
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("byte");
        _switchResult = _builder_1;
        break;
      case "ubyte":
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("ubyte");
        _switchResult = _builder_2;
        break;
      case "short":
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("short");
        _switchResult = _builder_3;
        break;
      case "ushort":
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("ushort");
        _switchResult = _builder_4;
        break;
      case "int":
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("int");
        _switchResult = _builder_5;
        break;
      case "uint":
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("uint");
        _switchResult = _builder_6;
        break;
      case "float":
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("float");
        _switchResult = _builder_7;
        break;
      case "long":
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("long");
        _switchResult = _builder_8;
        break;
      case "ulong":
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("ulong");
        _switchResult = _builder_9;
        break;
      case "double":
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("double");
        _switchResult = _builder_10;
        break;
      case "string":
        StringConcatenation _builder_11 = new StringConcatenation();
        _builder_11.append("string");
        _switchResult = _builder_11;
        break;
    }
    return _switchResult;
  }
  
  public CharSequence converPrimitiveTypeGetter(final String type) {
    CharSequence _switchResult = null;
    switch (type) {
      case "bool":
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("GetBool");
        _switchResult = _builder;
        break;
      case "byte":
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("GetByte");
        _switchResult = _builder_1;
        break;
      case "ubyte":
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("GetUbyte");
        _switchResult = _builder_2;
        break;
      case "short":
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("GetShort");
        _switchResult = _builder_3;
        break;
      case "ushort":
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("GetUshort");
        _switchResult = _builder_4;
        break;
      case "int":
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("GetInt");
        _switchResult = _builder_5;
        break;
      case "uint":
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("GetUint");
        _switchResult = _builder_6;
        break;
      case "float":
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("GetFloat");
        _switchResult = _builder_7;
        break;
      case "long":
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("GetLong");
        _switchResult = _builder_8;
        break;
      case "ulong":
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("GetUlong");
        _switchResult = _builder_9;
        break;
      case "double":
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("GetDouble");
        _switchResult = _builder_10;
        break;
    }
    return _switchResult;
  }
  
  public CharSequence converPrimitiveTypeAdd(final String type) {
    CharSequence _switchResult = null;
    switch (type) {
      case "bool":
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("AddBool");
        _switchResult = _builder;
        break;
      case "byte":
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("AddByte");
        _switchResult = _builder_1;
        break;
      case "ubyte":
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("AddUbyte");
        _switchResult = _builder_2;
        break;
      case "short":
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("AddShort");
        _switchResult = _builder_3;
        break;
      case "ushort":
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("AddUshort");
        _switchResult = _builder_4;
        break;
      case "int":
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("AddInt");
        _switchResult = _builder_5;
        break;
      case "uint":
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("AddUint");
        _switchResult = _builder_6;
        break;
      case "float":
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("AddFloat");
        _switchResult = _builder_7;
        break;
      case "long":
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("AddLong");
        _switchResult = _builder_8;
        break;
      case "ulong":
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("AddUlong");
        _switchResult = _builder_9;
        break;
      case "double":
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("AddDouble");
        _switchResult = _builder_10;
        break;
    }
    return _switchResult;
  }
  
  public CharSequence converPrimitiveTypeToLength(final String type) {
    CharSequence _switchResult = null;
    switch (type) {
      case "bool":
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("1");
        _switchResult = _builder;
        break;
      case "byte":
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("1");
        _switchResult = _builder_1;
        break;
      case "ubyte":
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("1");
        _switchResult = _builder_2;
        break;
      case "short":
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("2");
        _switchResult = _builder_3;
        break;
      case "ushort":
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("2");
        _switchResult = _builder_4;
        break;
      case "int":
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("4");
        _switchResult = _builder_5;
        break;
      case "uint":
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("4");
        _switchResult = _builder_6;
        break;
      case "float":
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("4");
        _switchResult = _builder_7;
        break;
      case "long":
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("8");
        _switchResult = _builder_8;
        break;
      case "ulong":
        StringConcatenation _builder_9 = new StringConcatenation();
        _builder_9.append("8");
        _switchResult = _builder_9;
        break;
      case "double":
        StringConcatenation _builder_10 = new StringConcatenation();
        _builder_10.append("8");
        _switchResult = _builder_10;
        break;
    }
    return _switchResult;
  }
}
