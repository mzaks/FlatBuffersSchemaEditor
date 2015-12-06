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
   * The feature id for the '<em><b>File extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__FILE_EXTENSION = 3;

  /**
   * The feature id for the '<em><b>Custom Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__CUSTOM_ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__DEFINITIONS = 5;

  /**
   * The feature id for the '<em><b>Root Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__ROOT_TYPE = 6;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = 7;

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
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.DefinitionImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.StructImpl <em>Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.StructImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getStruct()
   * @generated
   */
  int STRUCT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__ATTRIBUTES = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__FIELDS = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.StructFieldsImpl <em>Struct Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.StructFieldsImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getStructFields()
   * @generated
   */
  int STRUCT_FIELDS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELDS__NAME = 0;

  /**
   * The feature id for the '<em><b>Prim Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELDS__PRIM_TYPE = 1;

  /**
   * The feature id for the '<em><b>Def Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELDS__DEF_TYPE = 2;

  /**
   * The number of structural features of the '<em>Struct Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FIELDS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.TableImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getTable()
   * @generated
   */
  int TABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ATTRIBUTES = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__FIELDS = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.FieldsImpl <em>Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.FieldsImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getFields()
   * @generated
   */
  int FIELDS = 8;

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
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
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
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.ValueImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getValue()
   * @generated
   */
  int VALUE = 9;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NUMBER = 0;

  /**
   * The feature id for the '<em><b>Is False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__IS_FALSE = 1;

  /**
   * The feature id for the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__IS_TRUE = 2;

  /**
   * The feature id for the '<em><b>Enum Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__ENUM_CASE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.FieldAttributesImpl <em>Field Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.FieldAttributesImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getFieldAttributes()
   * @generated
   */
  int FIELD_ATTRIBUTES = 10;

  /**
   * The feature id for the '<em><b>Atribute Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ATTRIBUTES__ATRIBUTE_NAMES = 0;

  /**
   * The number of structural features of the '<em>Field Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_ATTRIBUTES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.AttributeNameImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 11;

  /**
   * The feature id for the '<em><b>Deprectated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__DEPRECTATED = 0;

  /**
   * The feature id for the '<em><b>Has Attribute Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID = 1;

  /**
   * The feature id for the '<em><b>Attribute Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__ATTRIBUTE_ID = 2;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__REQUIRED = 3;

  /**
   * The feature id for the '<em><b>Original order</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__ORIGINAL_ORDER = 4;

  /**
   * The feature id for the '<em><b>Has Align Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__HAS_ALIGN_SIZE = 5;

  /**
   * The feature id for the '<em><b>Align Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__ALIGN_SIZE = 6;

  /**
   * The feature id for the '<em><b>Has Hash</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__HAS_HASH = 7;

  /**
   * The feature id for the '<em><b>Hash Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__HASH_KEY = 8;

  /**
   * The feature id for the '<em><b>Bit flags</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__BIT_FLAGS = 9;

  /**
   * The feature id for the '<em><b>Has Nested Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME = 10;

  /**
   * The feature id for the '<em><b>Nested Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__NESTED_TABLE_NAME = 11;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__KEY = 12;

  /**
   * The feature id for the '<em><b>Custom Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__CUSTOM_NAME = 13;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__INT_VALUE = 14;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__STRING_VALUE = 15;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.TypeImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getType()
   * @generated
   */
  int TYPE = 12;

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
   * The feature id for the '<em><b>Def Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DEF_TYPE = 2;

  /**
   * The feature id for the '<em><b>Qualified Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__QUALIFIED_TYPE = 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.VectorImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__TYPE = 0;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.EnumImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__TYPE = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ATTRIBUTES = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Enum Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__ENUM_CASES = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.EnumCaseImpl <em>Enum Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.EnumCaseImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getEnumCase()
   * @generated
   */
  int ENUM_CASE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CASE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link maxim.zaks.flatBuffers.impl.UnionImpl <em>Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see maxim.zaks.flatBuffers.impl.UnionImpl
   * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getUnion()
   * @generated
   */
  int UNION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Union Cases</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION__UNION_CASES = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Union</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;


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
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Schema#getFile_extension <em>File extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File extension</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getFile_extension()
   * @see #getSchema()
   * @generated
   */
  EAttribute getSchema_File_extension();

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
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.Schema#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see maxim.zaks.flatBuffers.Schema#getDefinitions()
   * @see #getSchema()
   * @generated
   */
  EReference getSchema_Definitions();

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
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see maxim.zaks.flatBuffers.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Definition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.Definition#getName()
   * @see #getDefinition()
   * @generated
   */
  EAttribute getDefinition_Name();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Struct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct</em>'.
   * @see maxim.zaks.flatBuffers.Struct
   * @generated
   */
  EClass getStruct();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Struct#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see maxim.zaks.flatBuffers.Struct#getAttributes()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.Struct#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see maxim.zaks.flatBuffers.Struct#getFields()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_Fields();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.StructFields <em>Struct Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Fields</em>'.
   * @see maxim.zaks.flatBuffers.StructFields
   * @generated
   */
  EClass getStructFields();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.StructFields#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.StructFields#getName()
   * @see #getStructFields()
   * @generated
   */
  EAttribute getStructFields_Name();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.StructFields#getPrimType <em>Prim Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prim Type</em>'.
   * @see maxim.zaks.flatBuffers.StructFields#getPrimType()
   * @see #getStructFields()
   * @generated
   */
  EAttribute getStructFields_PrimType();

  /**
   * Returns the meta object for the reference '{@link maxim.zaks.flatBuffers.StructFields#getDefType <em>Def Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def Type</em>'.
   * @see maxim.zaks.flatBuffers.StructFields#getDefType()
   * @see #getStructFields()
   * @generated
   */
  EReference getStructFields_DefType();

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
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Table#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see maxim.zaks.flatBuffers.Table#getAttributes()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Attributes();

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
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Fields#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see maxim.zaks.flatBuffers.Fields#getDefaultValue()
   * @see #getFields()
   * @generated
   */
  EReference getFields_DefaultValue();

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
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see maxim.zaks.flatBuffers.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Value#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see maxim.zaks.flatBuffers.Value#getNumber()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_Number();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Value#isIsFalse <em>Is False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is False</em>'.
   * @see maxim.zaks.flatBuffers.Value#isIsFalse()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_IsFalse();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Value#isIsTrue <em>Is True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is True</em>'.
   * @see maxim.zaks.flatBuffers.Value#isIsTrue()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_IsTrue();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Value#getEnumCase <em>Enum Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum Case</em>'.
   * @see maxim.zaks.flatBuffers.Value#getEnumCase()
   * @see #getValue()
   * @generated
   */
  EAttribute getValue_EnumCase();

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
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.FieldAttributes#getAtributeNames <em>Atribute Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atribute Names</em>'.
   * @see maxim.zaks.flatBuffers.FieldAttributes#getAtributeNames()
   * @see #getFieldAttributes()
   * @generated
   */
  EReference getFieldAttributes_AtributeNames();

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
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isHasAttributeId <em>Has Attribute Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Attribute Id</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isHasAttributeId()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_HasAttributeId();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#getAttributeId <em>Attribute Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Id</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getAttributeId()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_AttributeId();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isRequired()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Required();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isOriginal_order <em>Original order</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Original order</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isOriginal_order()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Original_order();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isHasAlignSize <em>Has Align Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Align Size</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isHasAlignSize()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_HasAlignSize();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#getAlignSize <em>Align Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align Size</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getAlignSize()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_AlignSize();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isHasHash <em>Has Hash</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Hash</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isHasHash()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_HasHash();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#getHashKey <em>Hash Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hash Key</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getHashKey()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_HashKey();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isBit_flags <em>Bit flags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bit flags</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isBit_flags()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Bit_flags();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isHasNestedTableName <em>Has Nested Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Has Nested Table Name</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isHasNestedTableName()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_HasNestedTableName();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#getNestedTableName <em>Nested Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nested Table Name</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getNestedTableName()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_NestedTableName();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#isKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#isKey()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Key();

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
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getIntValue()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_IntValue();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.AttributeName#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see maxim.zaks.flatBuffers.AttributeName#getStringValue()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_StringValue();

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
   * Returns the meta object for the reference '{@link maxim.zaks.flatBuffers.Type#getDefType <em>Def Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Def Type</em>'.
   * @see maxim.zaks.flatBuffers.Type#getDefType()
   * @see #getType()
   * @generated
   */
  EReference getType_DefType();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Type#getQualifiedType <em>Qualified Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Type</em>'.
   * @see maxim.zaks.flatBuffers.Type#getQualifiedType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_QualifiedType();

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
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Vector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see maxim.zaks.flatBuffers.Vector#getType()
   * @see #getVector()
   * @generated
   */
  EReference getVector_Type();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see maxim.zaks.flatBuffers.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.Enum#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see maxim.zaks.flatBuffers.Enum#getType()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Type();

  /**
   * Returns the meta object for the containment reference '{@link maxim.zaks.flatBuffers.Enum#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see maxim.zaks.flatBuffers.Enum#getAttributes()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link maxim.zaks.flatBuffers.Enum#getEnumCases <em>Enum Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Cases</em>'.
   * @see maxim.zaks.flatBuffers.Enum#getEnumCases()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_EnumCases();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.EnumCase <em>Enum Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Case</em>'.
   * @see maxim.zaks.flatBuffers.EnumCase
   * @generated
   */
  EClass getEnumCase();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.EnumCase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see maxim.zaks.flatBuffers.EnumCase#getName()
   * @see #getEnumCase()
   * @generated
   */
  EAttribute getEnumCase_Name();

  /**
   * Returns the meta object for the attribute '{@link maxim.zaks.flatBuffers.EnumCase#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see maxim.zaks.flatBuffers.EnumCase#getValue()
   * @see #getEnumCase()
   * @generated
   */
  EAttribute getEnumCase_Value();

  /**
   * Returns the meta object for class '{@link maxim.zaks.flatBuffers.Union <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union</em>'.
   * @see maxim.zaks.flatBuffers.Union
   * @generated
   */
  EClass getUnion();

  /**
   * Returns the meta object for the reference list '{@link maxim.zaks.flatBuffers.Union#getUnionCases <em>Union Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Union Cases</em>'.
   * @see maxim.zaks.flatBuffers.Union#getUnionCases()
   * @see #getUnion()
   * @generated
   */
  EReference getUnion_UnionCases();

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
     * The meta object literal for the '<em><b>File extension</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEMA__FILE_EXTENSION = eINSTANCE.getSchema_File_extension();

    /**
     * The meta object literal for the '<em><b>Custom Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__CUSTOM_ATTRIBUTES = eINSTANCE.getSchema_CustomAttributes();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEMA__DEFINITIONS = eINSTANCE.getSchema_Definitions();

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
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.DefinitionImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.StructImpl <em>Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.StructImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getStruct()
     * @generated
     */
    EClass STRUCT = eINSTANCE.getStruct();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__ATTRIBUTES = eINSTANCE.getStruct_Attributes();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__FIELDS = eINSTANCE.getStruct_Fields();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.StructFieldsImpl <em>Struct Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.StructFieldsImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getStructFields()
     * @generated
     */
    EClass STRUCT_FIELDS = eINSTANCE.getStructFields();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_FIELDS__NAME = eINSTANCE.getStructFields_Name();

    /**
     * The meta object literal for the '<em><b>Prim Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_FIELDS__PRIM_TYPE = eINSTANCE.getStructFields_PrimType();

    /**
     * The meta object literal for the '<em><b>Def Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_FIELDS__DEF_TYPE = eINSTANCE.getStructFields_DefType();

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
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__ATTRIBUTES = eINSTANCE.getTable_Attributes();

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
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELDS__DEFAULT_VALUE = eINSTANCE.getFields_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELDS__ATTRIBUTES = eINSTANCE.getFields_Attributes();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.ValueImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__NUMBER = eINSTANCE.getValue_Number();

    /**
     * The meta object literal for the '<em><b>Is False</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__IS_FALSE = eINSTANCE.getValue_IsFalse();

    /**
     * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__IS_TRUE = eINSTANCE.getValue_IsTrue();

    /**
     * The meta object literal for the '<em><b>Enum Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__ENUM_CASE = eINSTANCE.getValue_EnumCase();

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
     * The meta object literal for the '<em><b>Atribute Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_ATTRIBUTES__ATRIBUTE_NAMES = eINSTANCE.getFieldAttributes_AtributeNames();

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
     * The meta object literal for the '<em><b>Has Attribute Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID = eINSTANCE.getAttributeName_HasAttributeId();

    /**
     * The meta object literal for the '<em><b>Attribute Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__ATTRIBUTE_ID = eINSTANCE.getAttributeName_AttributeId();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__REQUIRED = eINSTANCE.getAttributeName_Required();

    /**
     * The meta object literal for the '<em><b>Original order</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__ORIGINAL_ORDER = eINSTANCE.getAttributeName_Original_order();

    /**
     * The meta object literal for the '<em><b>Has Align Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__HAS_ALIGN_SIZE = eINSTANCE.getAttributeName_HasAlignSize();

    /**
     * The meta object literal for the '<em><b>Align Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__ALIGN_SIZE = eINSTANCE.getAttributeName_AlignSize();

    /**
     * The meta object literal for the '<em><b>Has Hash</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__HAS_HASH = eINSTANCE.getAttributeName_HasHash();

    /**
     * The meta object literal for the '<em><b>Hash Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__HASH_KEY = eINSTANCE.getAttributeName_HashKey();

    /**
     * The meta object literal for the '<em><b>Bit flags</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__BIT_FLAGS = eINSTANCE.getAttributeName_Bit_flags();

    /**
     * The meta object literal for the '<em><b>Has Nested Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME = eINSTANCE.getAttributeName_HasNestedTableName();

    /**
     * The meta object literal for the '<em><b>Nested Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__NESTED_TABLE_NAME = eINSTANCE.getAttributeName_NestedTableName();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__KEY = eINSTANCE.getAttributeName_Key();

    /**
     * The meta object literal for the '<em><b>Custom Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_NAME__CUSTOM_NAME = eINSTANCE.getAttributeName_CustomName();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__INT_VALUE = eINSTANCE.getAttributeName_IntValue();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__STRING_VALUE = eINSTANCE.getAttributeName_StringValue();

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
     * The meta object literal for the '<em><b>Def Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__DEF_TYPE = eINSTANCE.getType_DefType();

    /**
     * The meta object literal for the '<em><b>Qualified Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__QUALIFIED_TYPE = eINSTANCE.getType_QualifiedType();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__TYPE = eINSTANCE.getVector_Type();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.EnumImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__TYPE = eINSTANCE.getEnum_Type();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__ATTRIBUTES = eINSTANCE.getEnum_Attributes();

    /**
     * The meta object literal for the '<em><b>Enum Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__ENUM_CASES = eINSTANCE.getEnum_EnumCases();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.EnumCaseImpl <em>Enum Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.EnumCaseImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getEnumCase()
     * @generated
     */
    EClass ENUM_CASE = eINSTANCE.getEnumCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_CASE__NAME = eINSTANCE.getEnumCase_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_CASE__VALUE = eINSTANCE.getEnumCase_Value();

    /**
     * The meta object literal for the '{@link maxim.zaks.flatBuffers.impl.UnionImpl <em>Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see maxim.zaks.flatBuffers.impl.UnionImpl
     * @see maxim.zaks.flatBuffers.impl.FlatBuffersPackageImpl#getUnion()
     * @generated
     */
    EClass UNION = eINSTANCE.getUnion();

    /**
     * The meta object literal for the '<em><b>Union Cases</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION__UNION_CASES = eINSTANCE.getUnion_UnionCases();

  }

} //FlatBuffersPackage
