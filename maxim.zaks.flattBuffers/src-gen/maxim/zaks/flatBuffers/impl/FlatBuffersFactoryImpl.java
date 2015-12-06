/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.CustomAttributes;
import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.EnumCase;
import maxim.zaks.flatBuffers.FieldAttributes;
import maxim.zaks.flatBuffers.Fields;
import maxim.zaks.flatBuffers.FlatBuffersFactory;
import maxim.zaks.flatBuffers.FlatBuffersPackage;
import maxim.zaks.flatBuffers.Namespace;
import maxim.zaks.flatBuffers.RootType;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Struct;
import maxim.zaks.flatBuffers.StructFields;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Union;
import maxim.zaks.flatBuffers.Value;
import maxim.zaks.flatBuffers.Vector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlatBuffersFactoryImpl extends EFactoryImpl implements FlatBuffersFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FlatBuffersFactory init()
  {
    try
    {
      FlatBuffersFactory theFlatBuffersFactory = (FlatBuffersFactory)EPackage.Registry.INSTANCE.getEFactory(FlatBuffersPackage.eNS_URI);
      if (theFlatBuffersFactory != null)
      {
        return theFlatBuffersFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FlatBuffersFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlatBuffersFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FlatBuffersPackage.SCHEMA: return createSchema();
      case FlatBuffersPackage.ROOT_TYPE: return createRootType();
      case FlatBuffersPackage.CUSTOM_ATTRIBUTES: return createCustomAttributes();
      case FlatBuffersPackage.NAMESPACE: return createNamespace();
      case FlatBuffersPackage.DEFINITION: return createDefinition();
      case FlatBuffersPackage.STRUCT: return createStruct();
      case FlatBuffersPackage.STRUCT_FIELDS: return createStructFields();
      case FlatBuffersPackage.TABLE: return createTable();
      case FlatBuffersPackage.FIELDS: return createFields();
      case FlatBuffersPackage.VALUE: return createValue();
      case FlatBuffersPackage.FIELD_ATTRIBUTES: return createFieldAttributes();
      case FlatBuffersPackage.ATTRIBUTE_NAME: return createAttributeName();
      case FlatBuffersPackage.TYPE: return createType();
      case FlatBuffersPackage.VECTOR: return createVector();
      case FlatBuffersPackage.ENUM: return createEnum();
      case FlatBuffersPackage.ENUM_CASE: return createEnumCase();
      case FlatBuffersPackage.UNION: return createUnion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schema createSchema()
  {
    SchemaImpl schema = new SchemaImpl();
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootType createRootType()
  {
    RootTypeImpl rootType = new RootTypeImpl();
    return rootType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributes createCustomAttributes()
  {
    CustomAttributesImpl customAttributes = new CustomAttributesImpl();
    return customAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct createStruct()
  {
    StructImpl struct = new StructImpl();
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructFields createStructFields()
  {
    StructFieldsImpl structFields = new StructFieldsImpl();
    return structFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fields createFields()
  {
    FieldsImpl fields = new FieldsImpl();
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldAttributes createFieldAttributes()
  {
    FieldAttributesImpl fieldAttributes = new FieldAttributesImpl();
    return fieldAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName createAttributeName()
  {
    AttributeNameImpl attributeName = new AttributeNameImpl();
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public maxim.zaks.flatBuffers.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumCase createEnumCase()
  {
    EnumCaseImpl enumCase = new EnumCaseImpl();
    return enumCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Union createUnion()
  {
    UnionImpl union = new UnionImpl();
    return union;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlatBuffersPackage getFlatBuffersPackage()
  {
    return (FlatBuffersPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FlatBuffersPackage getPackage()
  {
    return FlatBuffersPackage.eINSTANCE;
  }

} //FlatBuffersFactoryImpl
