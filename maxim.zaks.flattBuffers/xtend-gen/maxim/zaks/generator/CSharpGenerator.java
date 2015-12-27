package maxim.zaks.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.EnumCase;
import maxim.zaks.flatBuffers.FieldAttributes;
import maxim.zaks.flatBuffers.Fields;
import maxim.zaks.flatBuffers.FileIdentifier;
import maxim.zaks.flatBuffers.Namespace;
import maxim.zaks.flatBuffers.RootType;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Union;
import maxim.zaks.flatBuffers.Value;
import maxim.zaks.flatBuffers.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CSharpGenerator {
  private String rootTableName = "";
  
  private String nameSpace;
  
  private String fileIdentifier;
  
  private HashMap<String, List<String>> tableToUnion = new HashMap<String, List<String>>();
  
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
      this.fillTableToUnionMap(schema);
      FileIdentifier _fileIdentifier = schema.getFileIdentifier();
      String _identifier = null;
      if (_fileIdentifier!=null) {
        _identifier=_fileIdentifier.getIdentifier();
      }
      this.fileIdentifier = _identifier;
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
          CharSequence _generateDefinition = this.generateDefinition(definition);
          _builder.append(_generateDefinition, "");
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
  
  public void fillTableToUnionMap(final Schema schema) {
    this.tableToUnion.clear();
    EList<Definition> _definitions = schema.getDefinitions();
    for (final Definition definition : _definitions) {
      boolean _matched = false;
      if (!_matched) {
        if (definition instanceof Union) {
          if (Objects.equal(definition, ((Union)definition))) {
            _matched=true;
            EList<Table> _unionCases = ((Union)definition).getUnionCases();
            final Function1<Table, String> _function = (Table it) -> {
              return it.getName();
            };
            List<String> typeNames = ListExtensions.<Table, String>map(_unionCases, _function);
            for (final String tableType : typeNames) {
              {
                List<String> unionNames = this.tableToUnion.get(tableType);
                boolean _equals = Objects.equal(unionNames, null);
                if (_equals) {
                  ArrayList<String> _arrayList = new ArrayList<String>();
                  unionNames = _arrayList;
                  this.tableToUnion.put(tableType, unionNames);
                }
                String _name = ((Union)definition).getName();
                unionNames.add(_name);
              }
            }
          }
        }
      }
    }
  }
  
  public CharSequence generateDefinition(final Definition definition) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (definition instanceof Table) {
        if (Objects.equal(definition, ((Table)definition))) {
          _matched=true;
          _switchResult = this.generateTable(((Table)definition));
        }
      }
    }
    if (!_matched) {
      if (definition instanceof maxim.zaks.flatBuffers.Enum) {
        if (Objects.equal(definition, ((maxim.zaks.flatBuffers.Enum)definition))) {
          _matched=true;
          _switchResult = this.generateEnum(((maxim.zaks.flatBuffers.Enum)definition));
        }
      }
    }
    if (!_matched) {
      if (definition instanceof Union) {
        if (Objects.equal(definition, ((Union)definition))) {
          _matched=true;
          _switchResult = this.generateUnion(((Union)definition));
        }
      }
    }
    return _switchResult;
  }
  
  public CharSequence generateTable(final Table table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public sealed class ");
    String _name = table.getName();
    _builder.append(_name, "");
    _builder.append(" : Table");
    CharSequence _implmentsUnion = this.implmentsUnion(table);
    _builder.append(_implmentsUnion, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Fields> _fields = table.getFields();
      ArrayList<Pair<Integer, Fields>> _indexedFields = this.indexedFields(_fields);
      final Function1<Pair<Integer, Fields>, CharSequence> _function = (Pair<Integer, Fields> it) -> {
        Fields _value = it.getValue();
        Integer _key = it.getKey();
        return this.fieldAsProperty(_value, (_key).intValue());
      };
      List<CharSequence> _map = ListExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexedFields, _function);
      for(final CharSequence p : _map) {
        _builder.append("\t");
        _builder.append(p, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateMethodsFromByteArrayAndBuffer = this.generateMethodsFromByteArrayAndBuffer(table);
    _builder.append(_generateMethodsFromByteArrayAndBuffer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateMethodToByteArrayAndAddToByteBuffer = this.generateMethodToByteArrayAndAddToByteBuffer(table);
    _builder.append(_generateMethodToByteArrayAndAddToByteBuffer, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence implmentsUnion(final Table table) {
    CharSequence _xblockexpression = null;
    {
      String _name = table.getName();
      boolean _containsKey = this.tableToUnion.containsKey(_name);
      boolean _not = (!_containsKey);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        return _builder.toString();
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        String _name_1 = table.getName();
        List<String> _get = this.tableToUnion.get(_name_1);
        boolean _hasElements = false;
        for(final String unionType : _get) {
          if (!_hasElements) {
            _hasElements = true;
            _builder_1.append(", ", "");
          } else {
            _builder_1.appendImmediate(", ", "");
          }
          _builder_1.append(unionType, "");
        }
      }
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  public CharSequence fieldAsProperty(final Fields field, final int index) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isDeprecated = this.isDeprecated(field);
      if (_isDeprecated) {
        _builder.append("[System.Obsolete]");
      }
    }
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
  
  public boolean isDeprecated(final Fields field) {
    boolean _xblockexpression = false;
    {
      FieldAttributes _attributes = field.getAttributes();
      boolean _equals = Objects.equal(_attributes, null);
      if (_equals) {
        return false;
      }
      FieldAttributes _attributes_1 = field.getAttributes();
      EList<AttributeName> _atributeNames = _attributes_1.getAtributeNames();
      final Function1<AttributeName, Boolean> _function = (AttributeName it) -> {
        return Boolean.valueOf(it.isDeprectated());
      };
      AttributeName _findFirst = IterableExtensions.<AttributeName>findFirst(_atributeNames, _function);
      _xblockexpression = (!Objects.equal(_findFirst, null));
    }
    return _xblockexpression;
  }
  
  public String generateMethodsFromByteArrayAndBuffer(final Table table) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String fromByteArrayMethod = _builder.toString();
      String _name = table.getName();
      boolean _equals = Objects.equal(_name, this.rootTableName);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("public static ");
        String _name_1 = table.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" FromByteArray(byte[] data) {");
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
          ArrayList<Pair<Integer, Fields>> _indexedFields = this.indexedFields(_fields);
          final Function1<Pair<Integer, Fields>, CharSequence> _function = (Pair<Integer, Fields> it) -> {
            Fields _value = it.getValue();
            Integer _key = it.getKey();
            return this.initFields(_value, (_key).intValue());
          };
          List<CharSequence> _map = ListExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexedFields, _function);
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
        fromByteArrayMethod = _builder_1.toString();
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("internal static ");
      String _name_4 = table.getName();
      _builder_2.append(_name_4, "");
      _builder_2.append(" FromByteBuffer(ByteBuffer _bb, int pos) {");
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
        ArrayList<Pair<Integer, Fields>> _indexedFields_1 = this.indexedFields(_fields_1);
        final Function1<Pair<Integer, Fields>, CharSequence> _function_1 = (Pair<Integer, Fields> it) -> {
          Fields _value = it.getValue();
          Integer _key = it.getKey();
          return this.initFields(_value, (_key).intValue());
        };
        List<CharSequence> _map_1 = ListExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexedFields_1, _function_1);
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
      _xblockexpression = (fromByteArrayMethod + _builder_2);
    }
    return _xblockexpression;
  }
  
  public ArrayList<Pair<Integer, Fields>> indexedFields(final EList<Fields> fields) {
    ArrayList<Pair<Integer, Fields>> _xblockexpression = null;
    {
      ArrayList<Pair<Integer, Fields>> result = new ArrayList<Pair<Integer, Fields>>();
      int index = 0;
      for (final Fields f : fields) {
        Type _type = f.getType();
        boolean _isUnion = this.isUnion(_type);
        if (_isUnion) {
          Pair<Integer, Fields> _pair = new Pair<Integer, Fields>(Integer.valueOf(index), f);
          result.add(_pair);
          int _index = index;
          index = (_index + 2);
        } else {
          Pair<Integer, Fields> _pair_1 = new Pair<Integer, Fields>(Integer.valueOf(index), f);
          result.add(_pair_1);
          int _index_1 = index;
          index = (_index_1 + 1);
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public boolean isUnion(final Type t) {
    final Definition type = t.getDefType();
    Definition _defType = t.getDefType();
    boolean _notEquals = (!Objects.equal(_defType, null));
    if (_notEquals) {
      boolean _matched = false;
      if (!_matched) {
        if (type instanceof Union) {
          if (Objects.equal(type, ((Union)type))) {
            _matched=true;
            return true;
          }
        }
      }
    }
    return false;
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
        String _defaultValueString = this.defaultValueString(field);
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
                _builder_2.append(".FromByteBuffer(obj.bb, obj.__indirect(o");
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
                _builder_2.append(" != 0 ? (");
                String _name_3 = ((maxim.zaks.flatBuffers.Enum)definition).getName();
                _builder_2.append(_name_3, "");
                _builder_2.append(")obj.bb.");
                CharSequence _converPrimitiveTypeGetter_1 = this.converPrimitiveTypeGetter(((maxim.zaks.flatBuffers.Enum)definition));
                _builder_2.append(_converPrimitiveTypeGetter_1, "");
                _builder_2.append("(o");
                _builder_2.append(index, "");
                _builder_2.append(" + obj.bb_pos) : (");
                String _name_4 = ((maxim.zaks.flatBuffers.Enum)definition).getName();
                _builder_2.append(_name_4, "");
                _builder_2.append(")0;");
                _builder_2.newLineIfNotEmpty();
                _switchResult = _builder_2;
              }
            }
          }
          if (!_matched) {
            if (definition instanceof Union) {
              if (Objects.equal(definition, ((Union)definition))) {
                _matched=true;
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("byte ");
                String _name_2 = field.getName();
                _builder_2.append(_name_2, "");
                _builder_2.append("UnionCase = obj.bb.Get(obj.__offset(4 + 2*");
                _builder_2.append(index, "");
                _builder_2.append("));");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("int o");
                _builder_2.append(index, "");
                _builder_2.append(" = obj.__offset(4 + 2*");
                _builder_2.append((index + 1), "");
                _builder_2.append(");");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("obj.");
                String _name_3 = field.getName();
                _builder_2.append(_name_3, "");
                _builder_2.append(" =  o");
                _builder_2.append(index, "");
                _builder_2.append(" != 0 ? ");
                CharSequence _unionHelperName = this.unionHelperName(((Union)definition));
                _builder_2.append(_unionHelperName, "");
                _builder_2.append(".FromByteBuffer(");
                String _name_4 = field.getName();
                _builder_2.append(_name_4, "");
                _builder_2.append("UnionCase, obj.bb, obj.__indirect(o");
                _builder_2.append(index, "");
                _builder_2.append(" + obj.bb_pos)) : null;");
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
          _builder_2.append(" = obj.__offset(4 + 2*");
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
            _builder_5.append(".FromByteBuffer(obj.bb, obj.__indirect(obj.__vector(o");
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
  
  public String generateMethodToByteArrayAndAddToByteBuffer(final Table table) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String rootBuild = _builder.toString();
      String _name = table.getName();
      boolean _equals = Objects.equal(_name, this.rootTableName);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("builder.Finish(offset);");
        String finishCall = _builder_1.toString();
        boolean _notEquals = (!Objects.equal(this.fileIdentifier, null));
        if (_notEquals) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("builder.Finish(offset, \"");
          _builder_2.append(this.fileIdentifier, "");
          _builder_2.append("\");");
          finishCall = _builder_2.toString();
        }
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("public byte[] ToByteArray(){");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("FlatBufferBuilder builder = new FlatBufferBuilder(1);");
        _builder_3.newLine();
        _builder_3.append("\t");
        _builder_3.append("var offset = this.AddToByteBuffer(builder);");
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
      _builder_4.append("internal int AddToByteBuffer(FlatBufferBuilder builder){");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.newLine();
      {
        EList<Fields> _fields = table.getFields();
        ArrayList<Pair<Integer, Fields>> _indexedFields = this.indexedFields(_fields);
        final Function1<Pair<Integer, Fields>, CharSequence> _function = (Pair<Integer, Fields> it) -> {
          Fields _value = it.getValue();
          Integer _key = it.getKey();
          return this.buildChildrenOffsets(_value, (_key).intValue());
        };
        List<CharSequence> _map = ListExtensions.<Pair<Integer, Fields>, CharSequence>map(_indexedFields, _function);
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
      int _numberOfFields = this.numberOfFields(table);
      _builder_4.append(_numberOfFields, "\t");
      _builder_4.append(");");
      _builder_4.newLineIfNotEmpty();
      _builder_4.append("\t");
      _builder_4.newLine();
      {
        EList<Fields> _fields_1 = table.getFields();
        ArrayList<Pair<Integer, Fields>> _indexedFields_1 = this.indexedFields(_fields_1);
        List<Pair<Integer, Fields>> _reverse = ListExtensions.<Pair<Integer, Fields>>reverse(_indexedFields_1);
        final Function1<Pair<Integer, Fields>, CharSequence> _function_1 = (Pair<Integer, Fields> it) -> {
          Fields _value = it.getValue();
          Integer _key = it.getKey();
          return this.addVTableToByteBuffer(_value, (_key).intValue());
        };
        List<CharSequence> _map_1 = ListExtensions.<Pair<Integer, Fields>, CharSequence>map(_reverse, _function_1);
        for(final CharSequence p_1 : _map_1) {
          _builder_4.append("\t");
          _builder_4.append(p_1, "\t");
          _builder_4.newLineIfNotEmpty();
        }
      }
      _builder_4.append("\t");
      _builder_4.newLine();
      _builder_4.append("\t");
      _builder_4.append("return builder.EndObject();");
      _builder_4.newLine();
      _builder_4.append("}");
      _builder_4.newLine();
      _xblockexpression = (rootBuild + _builder_4);
    }
    return _xblockexpression;
  }
  
  public int numberOfFields(final Table t) {
    int _xblockexpression = (int) 0;
    {
      EList<Fields> _fields = t.getFields();
      boolean _isEmpty = _fields.isEmpty();
      if (_isEmpty) {
        return 0;
      }
      EList<Fields> _fields_1 = t.getFields();
      ArrayList<Pair<Integer, Fields>> _indexedFields = this.indexedFields(_fields_1);
      final Pair<Integer, Fields> lastField = IterableExtensions.<Pair<Integer, Fields>>last(_indexedFields);
      int _xifexpression = (int) 0;
      Fields _value = lastField.getValue();
      Type _type = _value.getType();
      boolean _isUnion = this.isUnion(_type);
      if (_isUnion) {
        Integer _key = lastField.getKey();
        _xifexpression = ((_key).intValue() + 2);
      } else {
        Integer _key_1 = lastField.getKey();
        _xifexpression = ((_key_1).intValue() + 1);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public CharSequence buildChildrenOffsets(final Fields field, final int index) {
    CharSequence _xblockexpression = null;
    {
      boolean _isDeprecated = this.isDeprecated(field);
      if (_isDeprecated) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// ");
        String _name = field.getName();
        _builder.append(_name, "");
        _builder.append(" is deprecated");
        return _builder.toString();
      }
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
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("StringOffset offset");
        _builder_1.append(index, "");
        _builder_1.append(" = this.");
        String _name_1 = field.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(" == null ? default(StringOffset) : builder.CreateString(this.");
        String _name_2 = field.getName();
        _builder_1.append(_name_2, "");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        _xifexpression = _builder_1;
      } else {
        CharSequence _xifexpression_1 = null;
        Type _type_2 = field.getType();
        Definition _defType = _type_2.getDefType();
        boolean _notEquals_1 = (!Objects.equal(_defType, null));
        if (_notEquals_1) {
          CharSequence _xblockexpression_1 = null;
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
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append("int offset");
                  _builder_2.append(index, "");
                  _builder_2.append(" = this.");
                  String _name_3 = field.getName();
                  _builder_2.append(_name_3, "");
                  _builder_2.append(" == null ? 0 : this.");
                  String _name_4 = field.getName();
                  _builder_2.append(_name_4, "");
                  _builder_2.append(".AddToByteBuffer(builder);");
                  _builder_2.newLineIfNotEmpty();
                  _switchResult = _builder_2;
                }
              }
            }
            if (!_matched) {
              if (definition instanceof Union) {
                if (Objects.equal(definition, ((Union)definition))) {
                  _matched=true;
                  StringConcatenation _builder_2 = new StringConcatenation();
                  _builder_2.append("int offset");
                  _builder_2.append(index, "");
                  _builder_2.append(" = this.");
                  String _name_3 = field.getName();
                  _builder_2.append(_name_3, "");
                  _builder_2.append(" == null ? 0 : ");
                  CharSequence _unionHelperName = this.unionHelperName(((Union)definition));
                  _builder_2.append(_unionHelperName, "");
                  _builder_2.append(".AddToByteBuffer(this.");
                  String _name_4 = field.getName();
                  _builder_2.append(_name_4, "");
                  _builder_2.append(", builder);");
                  _builder_2.newLineIfNotEmpty();
                  _switchResult = _builder_2;
                }
              }
            }
            _xblockexpression_1 = _switchResult;
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          CharSequence _xifexpression_2 = null;
          Type _type_3 = field.getType();
          Vector _vectorType = _type_3.getVectorType();
          boolean _notEquals_2 = (!Objects.equal(_vectorType, null));
          if (_notEquals_2) {
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("VectorOffset offset");
            _builder_2.append(index, "");
            _builder_2.append(";");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("if(this.");
            String _name_3 = field.getName();
            _builder_2.append(_name_3, "");
            _builder_2.append(" == null) {");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("\t");
            _builder_2.append("offset");
            _builder_2.append(index, "\t");
            _builder_2.append(" = default(VectorOffset);");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("} else {");
            _builder_2.newLine();
            _builder_2.append("\t");
            Type _type_4 = field.getType();
            Vector _vectorType_1 = _type_4.getVectorType();
            CharSequence _buildVector = this.buildVector(_vectorType_1, field, index);
            _builder_2.append(_buildVector, "\t");
            _builder_2.newLineIfNotEmpty();
            _builder_2.append("}");
            _builder_2.newLine();
            _xifexpression_2 = _builder_2;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
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
                _builder_1.append("int[] data = new int[this.");
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
                _builder_1.append("[i].AddToByteBuffer(builder);");
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
                _builder_1.append("builder.AddOffset(data[i]);");
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
                CharSequence _converPrimitiveTypeToLength = this.converPrimitiveTypeToLength(((maxim.zaks.flatBuffers.Enum)definition));
                _builder_1.append(_converPrimitiveTypeToLength, "");
                _builder_1.append(", this.");
                String _name_4 = field.getName();
                _builder_1.append(_name_4, "");
                _builder_1.append(".Length, ");
                CharSequence _converPrimitiveTypeToLength_1 = this.converPrimitiveTypeToLength(((maxim.zaks.flatBuffers.Enum)definition));
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
                CharSequence _converPrimitiveTypeAdd = this.converPrimitiveTypeAdd(((maxim.zaks.flatBuffers.Enum)definition));
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
  
  public CharSequence addVTableToByteBuffer(final Fields field, final int index) {
    CharSequence _xblockexpression = null;
    {
      boolean _isDeprecated = this.isDeprecated(field);
      if (_isDeprecated) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// ");
        String _name = field.getName();
        _builder.append(_name, "");
        _builder.append(" is deprecated");
        return _builder.toString();
      }
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
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("builder.AddOffset(");
          _builder_1.append(index, "");
          _builder_1.append(", offset");
          _builder_1.append(index, "");
          _builder_1.append(".Value, 0);");
          _builder_1.newLineIfNotEmpty();
          _xifexpression_1 = _builder_1;
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("builder.");
          Type _type_2 = field.getType();
          String _primType_2 = _type_2.getPrimType();
          CharSequence _converPrimitiveTypeAdd = this.converPrimitiveTypeAdd(_primType_2);
          _builder_2.append(_converPrimitiveTypeAdd, "");
          _builder_2.append("(");
          _builder_2.append(index, "");
          _builder_2.append(", this.");
          String _name_1 = field.getName();
          _builder_2.append(_name_1, "");
          _builder_2.append(", (");
          Type _type_3 = field.getType();
          String _primType_3 = _type_3.getPrimType();
          CharSequence _converPrimitiveType = this.converPrimitiveType(_primType_3);
          _builder_2.append(_converPrimitiveType, "");
          _builder_2.append(")");
          String _defaultValueString = this.defaultValueString(field);
          _builder_2.append(_defaultValueString, "");
          _builder_2.append(");");
          _builder_2.newLineIfNotEmpty();
          _xifexpression_1 = _builder_2;
        }
        _xifexpression = _xifexpression_1;
      } else {
        CharSequence _xifexpression_2 = null;
        Type _type_4 = field.getType();
        Definition _defType = _type_4.getDefType();
        boolean _notEquals_1 = (!Objects.equal(_defType, null));
        if (_notEquals_1) {
          CharSequence _xblockexpression_1 = null;
          {
            Type _type_5 = field.getType();
            final Definition definition = _type_5.getDefType();
            CharSequence _switchResult = null;
            boolean _matched = false;
            if (!_matched) {
              if (definition instanceof Table) {
                if (Objects.equal(definition, ((Table)definition))) {
                  _matched=true;
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("builder.AddOffset(");
                  _builder_3.append(index, "");
                  _builder_3.append(", offset");
                  _builder_3.append(index, "");
                  _builder_3.append(", 0);");
                  _switchResult = _builder_3;
                }
              }
            }
            if (!_matched) {
              if (definition instanceof maxim.zaks.flatBuffers.Enum) {
                if (Objects.equal(definition, ((maxim.zaks.flatBuffers.Enum)definition))) {
                  _matched=true;
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("builder.");
                  CharSequence _converPrimitiveTypeAdd_1 = this.converPrimitiveTypeAdd(((maxim.zaks.flatBuffers.Enum)definition));
                  _builder_3.append(_converPrimitiveTypeAdd_1, "");
                  _builder_3.append("(");
                  _builder_3.append(index, "");
                  _builder_3.append(", (");
                  CharSequence _converPrimitiveType_1 = this.converPrimitiveType(((maxim.zaks.flatBuffers.Enum)definition));
                  _builder_3.append(_converPrimitiveType_1, "");
                  _builder_3.append(")this.");
                  String _name_2 = field.getName();
                  _builder_3.append(_name_2, "");
                  _builder_3.append(", 0);");
                  _switchResult = _builder_3;
                }
              }
            }
            if (!_matched) {
              if (definition instanceof Union) {
                if (Objects.equal(definition, ((Union)definition))) {
                  _matched=true;
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("builder.AddOffset(");
                  _builder_3.append((index + 1), "");
                  _builder_3.append(", offset");
                  _builder_3.append(index, "");
                  _builder_3.append(", 0);");
                  _builder_3.newLineIfNotEmpty();
                  _builder_3.append("builder.AddByte(");
                  _builder_3.append(index, "");
                  _builder_3.append(", ");
                  CharSequence _unionHelperName = this.unionHelperName(((Union)definition));
                  _builder_3.append(_unionHelperName, "");
                  _builder_3.append(".GetCase(this.");
                  String _name_2 = field.getName();
                  _builder_3.append(_name_2, "");
                  _builder_3.append("), 0);");
                  _builder_3.newLineIfNotEmpty();
                  _switchResult = _builder_3;
                }
              }
            }
            _xblockexpression_1 = _switchResult;
          }
          _xifexpression_2 = _xblockexpression_1;
        } else {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("builder.AddOffset(");
          _builder_3.append(index, "");
          _builder_3.append(", offset");
          _builder_3.append(index, "");
          _builder_3.append(".Value, 0);");
          _builder_3.newLineIfNotEmpty();
          _xifexpression_2 = _builder_3;
        }
        _xifexpression = _xifexpression_2;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String defaultValueString(final Fields field) {
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
    Value _defaultValue_1 = field.getDefaultValue();
    boolean _isIsFalse = _defaultValue_1.isIsFalse();
    if (_isIsFalse) {
      return "false";
    } else {
      Value _defaultValue_2 = field.getDefaultValue();
      boolean _isIsTrue = _defaultValue_2.isIsTrue();
      if (_isIsTrue) {
        return "true";
      } else {
        Value _defaultValue_3 = field.getDefaultValue();
        String _enumCase = _defaultValue_3.getEnumCase();
        boolean _notEquals = (!Objects.equal(_enumCase, null));
        if (_notEquals) {
          Type _type_1 = field.getType();
          Definition _defType = _type_1.getDefType();
          String _name = _defType.getName();
          String _plus = (_name + ".");
          Value _defaultValue_4 = field.getDefaultValue();
          String _enumCase_1 = _defaultValue_4.getEnumCase();
          return (_plus + _enumCase_1);
        }
      }
    }
    Value _defaultValue_5 = field.getDefaultValue();
    return _defaultValue_5.getNumber();
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
  
  public CharSequence generateEnum(final maxim.zaks.flatBuffers.Enum e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public enum ");
    String _name = e.getName();
    _builder.append(_name, "");
    {
      String _type = e.getType();
      boolean _notEquals = (!Objects.equal(_type, null));
      if (_notEquals) {
        _builder.append(": ");
        CharSequence _converPrimitiveType = this.converPrimitiveType(e);
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateUnion(final Union union) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface ");
    String _name = union.getName();
    _builder.append(_name, "");
    _builder.append(" {}");
    _builder.newLineIfNotEmpty();
    CharSequence _generateUnionHelper = this.generateUnionHelper(union);
    _builder.append(_generateUnionHelper, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateUnionHelper(final Union union) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("internal static class ");
    CharSequence _unionHelperName = this.unionHelperName(union);
    _builder.append(_unionHelperName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("internal static ");
    String _name = union.getName();
    _builder.append(_name, "\t");
    _builder.append(" FromByteBuffer(byte unionCase, ByteBuffer _bb, int pos){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("switch (unionCase) {");
    _builder.newLine();
    {
      EList<Table> _unionCases = union.getUnionCases();
      Iterable<Pair<Integer, Table>> _indexed = IterableExtensions.<Table>indexed(_unionCases);
      for(final Pair<Integer, Table> indexedUnionCase : _indexed) {
        _builder.append("\t\t");
        _builder.append("case ");
        Integer _key = indexedUnionCase.getKey();
        int _plus = ((_key).intValue() + 1);
        _builder.append(_plus, "\t\t");
        _builder.append(": return ");
        Table _value = indexedUnionCase.getValue();
        String _name_1 = _value.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append(".FromByteBuffer(_bb, pos);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("internal static byte GetCase(");
    String _name_2 = union.getName();
    _builder.append(_name_2, "\t");
    _builder.append(" o){");
    _builder.newLineIfNotEmpty();
    {
      EList<Table> _unionCases_1 = union.getUnionCases();
      Iterable<Pair<Integer, Table>> _indexed_1 = IterableExtensions.<Table>indexed(_unionCases_1);
      for(final Pair<Integer, Table> indexedUnionCase_1 : _indexed_1) {
        _builder.append("\t\t");
        _builder.append("if(o is ");
        Table _value_1 = indexedUnionCase_1.getValue();
        String _name_3 = _value_1.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(") return ");
        Integer _key_1 = indexedUnionCase_1.getKey();
        int _plus_1 = ((_key_1).intValue() + 1);
        _builder.append(_plus_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("internal static int AddToByteBuffer(");
    String _name_4 = union.getName();
    _builder.append(_name_4, "\t");
    _builder.append(" o, FlatBufferBuilder builder){");
    _builder.newLineIfNotEmpty();
    {
      EList<Table> _unionCases_2 = union.getUnionCases();
      Iterable<Pair<Integer, Table>> _indexed_2 = IterableExtensions.<Table>indexed(_unionCases_2);
      for(final Pair<Integer, Table> indexedUnionCase_2 : _indexed_2) {
        _builder.append("\t\t");
        _builder.append("if(o is ");
        Table _value_2 = indexedUnionCase_2.getValue();
        String _name_5 = _value_2.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(") return (o as ");
        Table _value_3 = indexedUnionCase_2.getValue();
        String _name_6 = _value_3.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append(").AddToByteBuffer(builder);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence unionHelperName(final Union union) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = union.getName();
    _builder.append(_name, "");
    _builder.append("UnionHelper");
    return _builder;
  }
  
  public CharSequence converPrimitiveType(final maxim.zaks.flatBuffers.Enum definition) {
    CharSequence _xblockexpression = null;
    {
      String _type = definition.getType();
      boolean _equals = Objects.equal(_type, null);
      if (_equals) {
        return this.converPrimitiveType("int");
      }
      String _type_1 = definition.getType();
      _xblockexpression = this.converPrimitiveType(_type_1);
    }
    return _xblockexpression;
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
  
  public CharSequence converPrimitiveTypeGetter(final maxim.zaks.flatBuffers.Enum definition) {
    CharSequence _xblockexpression = null;
    {
      String _type = definition.getType();
      boolean _equals = Objects.equal(_type, null);
      if (_equals) {
        return this.converPrimitiveTypeGetter("int");
      }
      String _type_1 = definition.getType();
      _xblockexpression = this.converPrimitiveTypeGetter(_type_1);
    }
    return _xblockexpression;
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
  
  public CharSequence converPrimitiveTypeAdd(final maxim.zaks.flatBuffers.Enum definition) {
    CharSequence _xblockexpression = null;
    {
      String _type = definition.getType();
      boolean _equals = Objects.equal(_type, null);
      if (_equals) {
        return this.converPrimitiveTypeAdd("int");
      }
      String _type_1 = definition.getType();
      _xblockexpression = this.converPrimitiveTypeAdd(_type_1);
    }
    return _xblockexpression;
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
  
  public CharSequence converPrimitiveTypeToLength(final maxim.zaks.flatBuffers.Enum definition) {
    CharSequence _xblockexpression = null;
    {
      String _type = definition.getType();
      boolean _equals = Objects.equal(_type, null);
      if (_equals) {
        return this.converPrimitiveTypeToLength("int");
      }
      String _type_1 = definition.getType();
      _xblockexpression = this.converPrimitiveTypeToLength(_type_1);
    }
    return _xblockexpression;
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
