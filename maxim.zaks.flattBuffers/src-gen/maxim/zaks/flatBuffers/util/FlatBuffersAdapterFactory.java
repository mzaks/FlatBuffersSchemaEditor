/**
 */
package maxim.zaks.flatBuffers.util;

import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.CustomAttributes;
import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.EnumCase;
import maxim.zaks.flatBuffers.FieldAttributes;
import maxim.zaks.flatBuffers.Fields;
import maxim.zaks.flatBuffers.FileIdentifier;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage
 * @generated
 */
public class FlatBuffersAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FlatBuffersPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlatBuffersAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FlatBuffersPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlatBuffersSwitch<Adapter> modelSwitch =
    new FlatBuffersSwitch<Adapter>()
    {
      @Override
      public Adapter caseSchema(Schema object)
      {
        return createSchemaAdapter();
      }
      @Override
      public Adapter caseRootType(RootType object)
      {
        return createRootTypeAdapter();
      }
      @Override
      public Adapter caseCustomAttributes(CustomAttributes object)
      {
        return createCustomAttributesAdapter();
      }
      @Override
      public Adapter caseFileIdentifier(FileIdentifier object)
      {
        return createFileIdentifierAdapter();
      }
      @Override
      public Adapter caseNamespace(Namespace object)
      {
        return createNamespaceAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseStruct(Struct object)
      {
        return createStructAdapter();
      }
      @Override
      public Adapter caseStructFields(StructFields object)
      {
        return createStructFieldsAdapter();
      }
      @Override
      public Adapter caseTable(Table object)
      {
        return createTableAdapter();
      }
      @Override
      public Adapter caseFields(Fields object)
      {
        return createFieldsAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseFieldAttributes(FieldAttributes object)
      {
        return createFieldAttributesAdapter();
      }
      @Override
      public Adapter caseAttributeName(AttributeName object)
      {
        return createAttributeNameAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseVector(Vector object)
      {
        return createVectorAdapter();
      }
      @Override
      public Adapter caseEnum(maxim.zaks.flatBuffers.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseEnumCase(EnumCase object)
      {
        return createEnumCaseAdapter();
      }
      @Override
      public Adapter caseUnion(Union object)
      {
        return createUnionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Schema
   * @generated
   */
  public Adapter createSchemaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.RootType <em>Root Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.RootType
   * @generated
   */
  public Adapter createRootTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.CustomAttributes <em>Custom Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.CustomAttributes
   * @generated
   */
  public Adapter createCustomAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.FileIdentifier <em>File Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.FileIdentifier
   * @generated
   */
  public Adapter createFileIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Namespace
   * @generated
   */
  public Adapter createNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Struct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Struct
   * @generated
   */
  public Adapter createStructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.StructFields <em>Struct Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.StructFields
   * @generated
   */
  public Adapter createStructFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Table
   * @generated
   */
  public Adapter createTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Fields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Fields
   * @generated
   */
  public Adapter createFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.FieldAttributes <em>Field Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.FieldAttributes
   * @generated
   */
  public Adapter createFieldAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.AttributeName
   * @generated
   */
  public Adapter createAttributeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Vector
   * @generated
   */
  public Adapter createVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.EnumCase <em>Enum Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.EnumCase
   * @generated
   */
  public Adapter createEnumCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link maxim.zaks.flatBuffers.Union <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see maxim.zaks.flatBuffers.Union
   * @generated
   */
  public Adapter createUnionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FlatBuffersAdapterFactory
