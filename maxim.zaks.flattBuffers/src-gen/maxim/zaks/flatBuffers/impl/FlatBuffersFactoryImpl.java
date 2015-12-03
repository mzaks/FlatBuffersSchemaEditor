/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.*;

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
      case FlatBuffersPackage.TABLE: return createTable();
      case FlatBuffersPackage.FIELDS: return createFields();
      case FlatBuffersPackage.FIELD_ATTRIBUTES: return createFieldAttributes();
      case FlatBuffersPackage.ATTRIBUTE_NAME: return createAttributeName();
      case FlatBuffersPackage.TYPE: return createType();
      case FlatBuffersPackage.VECTOR: return createVector();
      case FlatBuffersPackage.TABLE_TYPE: return createTableType();
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
  public TableType createTableType()
  {
    TableTypeImpl tableType = new TableTypeImpl();
    return tableType;
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
