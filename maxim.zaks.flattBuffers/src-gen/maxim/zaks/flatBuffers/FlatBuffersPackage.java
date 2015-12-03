/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maxim.zaks.flatBuffers.FlatBuffersFactory
 * @model kind="package"
 * @generated
 */
public interface FlatBuffersPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "flatBuffers";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.zaks.maxim/FlatBuffers";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "flatBuffers";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FlatBuffersPackage eINSTANCE = maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl.init();

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.SchemaImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Namepsace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAMEPSACE = 1;

  /**
   * The feature id for the '<em><b>File Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__FILE_IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Custom Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__CUSTOM_ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Tables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__TABLES = 4;

  /**
   * The feature id for the '<em><b>Root Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__ROOT_TYPE = 5;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.RootTypeImpl <em>Root Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.RootTypeImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getRootType()
   * @generated
   */
  int ROOT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Root Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.CustomAttributesImpl <em>Custom Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.CustomAttributesImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getCustomAttributes()
   * @generated
   */
  int CUSTOM_ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTES__NAME = 0;

  /**
   * The number of structural features of the '<em>Custom Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.NamespaceImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = 0;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.TableImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getTable()
   * @generated
   */
  int TABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.FieldsImpl <em>Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.FieldsImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getFields()
   * @generated
   */
  int FIELDS = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__TYPE = 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__DEFAULT_VALUE = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS__ATTRIBUTES = 3;

  /**
   * The number of structural features of the '<em>Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELDS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.FieldAttributesImpl <em>Field Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.FieldAttributesImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getFieldAttributes()
   * @generated
   */
  int FIELD_ATTRIBUTES = 6;

  /**
   * The feature id for the '<em><b>Attribute List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ATTRIBUTES__ATTRIBUTE_LIST = 0;

  /**
   * The feature id for the '<em><b>Atribute Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ATTRIBUTES__ATRIBUTE_NAME = 1;

  /**
   * The number of structural features of the '<em>Field Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ATTRIBUTES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.AttributeNameImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 7;

  /**
   * The feature id for the '<em><b>Deprectated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__DEPRECTATED = 0;

  /**
   * The feature id for the '<em><b>Custom Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__CUSTOM_NAME = 1;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.TypeImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getType()
   * @generated
   */
  int TYPE = 8;

  /**
   * The feature id for the '<em><b>Prim Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PRIM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Vector Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VECTOR_TYPE = 1;

  /**
   * The feature id for the '<em><b>Table Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TABLE_TYPE = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.VectorImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 9;

  /**
   * The feature id for the '<em><b>Prim Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__PRIM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Table Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__TABLE_TYPE = 1;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.TableTypeImpl <em>Table Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.TableTypeImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getTableType()
   * @generated
   */
  int TABLE_TYPE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Table Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see maxim.zaks.flatBuffers.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for the attribute list '{@link maxim.zaks.flatBuffers.Schema#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Includes</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getIncludes()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_Includes();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Schema#getNamepsace <em>Namepsace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namepsace</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getNamepsace()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Namepsace();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Schema#getFileIdentifier <em>File Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Identifier</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getFileIdentifier()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_FileIdentifier();

  /**
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.Schema#getCustomAttributes <em>Custom Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Custom Attributes</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getCustomAttributes()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_CustomAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.Schema#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getTables()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Tables();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Schema#getRootType <em>Root Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Type</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getRootType()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_RootType();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.RootType <em>Root Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Type</em>'.
   * @see maxim.zaks.flatBuffers.RootType
   * @generated
   */
  EClass getRootType();

  /**
   * Returns the meta object for the reference '{@link maxim.zaks.flatBuffers.RootType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see maxim.zaks.flatBuffers.RootType#getType()
   * @see #getRootType()
   * @generated
   */
  EReference getRootType_Type();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.CustomAttributes <em>Custom Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Attributes</em>'.
   * @see maxim.zaks.flatBuffers.CustomAttributes
   * @generated
   */
  EClass getCustomAttributes();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.CustomAttributes#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.CustomAttributes#getName()
   * @see #getCustomAttributes()
   * @generated
   */
  EAttribute getCustomAttributes_Name();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see maxim.zaks.flatBuffers.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Namespace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.Namespace#getName()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Name();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see maxim.zaks.flatBuffers.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.Table#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see maxim.zaks.flatBuffers.Table#getFields()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Fields();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Fields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fields</em>'.
   * @see maxim.zaks.flatBuffers.Fields
   * @generated
   */
  EClass getFields();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Fields#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.Fields#getName()
   * @see #getFields()
   * @generated
   */
  EAttribute getFields_Name();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Fields#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see maxim.zaks.flatBuffers.Fields#getType()
   * @see #getFields()
   * @generated
   */
  EReference getFields_Type();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Fields#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see maxim.zaks.flatBuffers.Fields#getDefaultValue()
   * @see #getFields()
   * @generated
   */
  EAttribute getFields_DefaultValue();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Fields#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see maxim.zaks.flatBuffers.Fields#getAttributes()
   * @see #getFields()
   * @generated
   */
  EReference getFields_Attributes();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.FieldAttributes <em>Field Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Attributes</em>'.
   * @see maxim.zaks.flatBuffers.FieldAttributes
   * @generated
   */
  EClass getFieldAttributes();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.FieldAttributes#getAttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute List</em>'.
   * @see maxim.zaks.flatBuffers.FieldAttributes#getAttributeList()
   * @see #getFieldAttributes()
   * @generated
   */
  EAttribute getFieldAttributes_AttributeList();

  /**
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.FieldAttributes#getAtributeName <em>Atribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atribute Name</em>'.
   * @see maxim.zaks.flatBuffers.FieldAttributes#getAtributeName()
   * @see #getFieldAttributes()
   * @generated
   */
  EReference getFieldAttributes_AtributeName();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Name</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName
   * @generated
   */
  EClass getAttributeName();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isDeprectated <em>Deprectated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deprectated</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isDeprectated()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Deprectated();

  /**
   * Returns the meta object for the reference '{@link maxim.zaks.flatBuffers.AttributeName#getCustomName <em>Custom Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Custom Name</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getCustomName()
   * @see #getAttributeName()
   * @generated
   */
  EReference getAttributeName_CustomName();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see maxim.zaks.flatBuffers.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Type#getPrimType <em>Prim Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prim Type</em>'.
   * @see maxim.zaks.flatBuffers.Type#getPrimType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_PrimType();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Type#getVectorType <em>Vector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector Type</em>'.
   * @see maxim.zaks.flatBuffers.Type#getVectorType()
   * @see #getType()
   * @generated
   */
  EReference getType_VectorType();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Type#getTableType <em>Table Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Type</em>'.
   * @see maxim.zaks.flatBuffers.Type#getTableType()
   * @see #getType()
   * @generated
   */
  EReference getType_TableType();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector</em>'.
   * @see maxim.zaks.flatBuffers.Vector
   * @generated
   */
  EClass getVector();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Vector#getPrimType <em>Prim Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prim Type</em>'.
   * @see maxim.zaks.flatBuffers.Vector#getPrimType()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_PrimType();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Vector#getTableType <em>Table Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table Type</em>'.
   * @see maxim.zaks.flatBuffers.Vector#getTableType()
   * @see #getVector()
   * @generated
   */
  EReference getVector_TableType();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.TableType <em>Table Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Type</em>'.
   * @see maxim.zaks.flatBuffers.TableType
   * @generated
   */
  EClass getTableType();

  /**
   * Returns the meta object for the reference '{@link maxim.zaks.flatBuffers.TableType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see maxim.zaks.flatBuffers.TableType#getType()
   * @see #getTableType()
   * @generated
   */
  EReference getTableType_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FlatBuffersFactory getFlatBuffersFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.SchemaImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__INCLUDES = eINSTANCE.getSchema_Includes();

    /**
     * The meta object literal for the '<em><b>Namepsace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__NAMEPSACE = eINSTANCE.getSchema_Namepsace();

    /**
     * The meta object literal for the '<em><b>File Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__FILE_IDENTIFIER = eINSTANCE.getSchema_FileIdentifier();

    /**
     * The meta object literal for the '<em><b>Custom Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__CUSTOM_ATTRIBUTES = eINSTANCE.getSchema_CustomAttributes();

    /**
     * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

    /**
     * The meta object literal for the '<em><b>Root Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__ROOT_TYPE = eINSTANCE.getSchema_RootType();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.RootTypeImpl <em>Root Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.RootTypeImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getRootType()
     * @generated
     */
    EClass ROOT_TYPE = eINSTANCE.getRootType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_TYPE__TYPE = eINSTANCE.getRootType_Type();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.CustomAttributesImpl <em>Custom Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.CustomAttributesImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getCustomAttributes()
     * @generated
     */
    EClass CUSTOM_ATTRIBUTES = eINSTANCE.getCustomAttributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_ATTRIBUTES__NAME = eINSTANCE.getCustomAttributes_Name();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.NamespaceImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NAME = eINSTANCE.getNamespace_Name();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.TableImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__FIELDS = eINSTANCE.getTable_Fields();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.FieldsImpl <em>Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.FieldsImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getFields()
     * @generated
     */
    EClass FIELDS = eINSTANCE.getFields();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELDS__NAME = eINSTANCE.getFields_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELDS__TYPE = eINSTANCE.getFields_Type();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELDS__DEFAULT_VALUE = eINSTANCE.getFields_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELDS__ATTRIBUTES = eINSTANCE.getFields_Attributes();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.FieldAttributesImpl <em>Field Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.FieldAttributesImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getFieldAttributes()
     * @generated
     */
    EClass FIELD_ATTRIBUTES = eINSTANCE.getFieldAttributes();

    /**
     * The meta object literal for the '<em><b>Attribute List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_ATTRIBUTES__ATTRIBUTE_LIST = eINSTANCE.getFieldAttributes_AttributeList();

    /**
     * The meta object literal for the '<em><b>Atribute Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_ATTRIBUTES__ATRIBUTE_NAME = eINSTANCE.getFieldAttributes_AtributeName();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.AttributeNameImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getAttributeName()
     * @generated
     */
    EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

    /**
     * The meta object literal for the '<em><b>Deprectated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__DEPRECTATED = eINSTANCE.getAttributeName_Deprectated();

    /**
     * The meta object literal for the '<em><b>Custom Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_NAME__CUSTOM_NAME = eINSTANCE.getAttributeName_CustomName();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.TypeImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Prim Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__PRIM_TYPE = eINSTANCE.getType_PrimType();

    /**
     * The meta object literal for the '<em><b>Vector Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__VECTOR_TYPE = eINSTANCE.getType_VectorType();

    /**
     * The meta object literal for the '<em><b>Table Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TABLE_TYPE = eINSTANCE.getType_TableType();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.VectorImpl <em>Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.VectorImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getVector()
     * @generated
     */
    EClass VECTOR = eINSTANCE.getVector();

    /**
     * The meta object literal for the '<em><b>Prim Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__PRIM_TYPE = eINSTANCE.getVector_PrimType();

    /**
     * The meta object literal for the '<em><b>Table Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__TABLE_TYPE = eINSTANCE.getVector_TableType();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.TableTypeImpl <em>Table Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.TableTypeImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getTableType()
     * @generated
     */
    EClass TABLE_TYPE = eINSTANCE.getTableType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_TYPE__TYPE = eINSTANCE.getTableType_Type();

  }

} //FlatBuffersPackage
