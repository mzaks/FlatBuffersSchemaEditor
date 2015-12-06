/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.FlatBuffersPackage;
import maxim.zaks.flatBuffers.StructFields;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Fields</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.StructFieldsImpl#getName <em>Name</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.StructFieldsImpl#getPrimType <em>Prim Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.StructFieldsImpl#getDefType <em>Def Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructFieldsImpl extends MinimalEObjectImpl.Container implements StructFields
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPrimType() <em>Prim Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimType()
   * @generated
   * @ordered
   */
  protected static final String PRIM_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimType() <em>Prim Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimType()
   * @generated
   * @ordered
   */
  protected String primType = PRIM_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefType() <em>Def Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefType()
   * @generated
   * @ordered
   */
  protected Definition defType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructFieldsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FlatBuffersPackage.Literals.STRUCT_FIELDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.STRUCT_FIELDS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimType()
  {
    return primType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimType(String newPrimType)
  {
    String oldPrimType = primType;
    primType = newPrimType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.STRUCT_FIELDS__PRIM_TYPE, oldPrimType, primType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition getDefType()
  {
    if (defType != null && defType.eIsProxy())
    {
      InternalEObject oldDefType = (InternalEObject)defType;
      defType = (Definition)eResolveProxy(oldDefType);
      if (defType != oldDefType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlatBuffersPackage.STRUCT_FIELDS__DEF_TYPE, oldDefType, defType));
      }
    }
    return defType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition basicGetDefType()
  {
    return defType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefType(Definition newDefType)
  {
    Definition oldDefType = defType;
    defType = newDefType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.STRUCT_FIELDS__DEF_TYPE, oldDefType, defType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.STRUCT_FIELDS__NAME:
        return getName();
      case FlatBuffersPackage.STRUCT_FIELDS__PRIM_TYPE:
        return getPrimType();
      case FlatBuffersPackage.STRUCT_FIELDS__DEF_TYPE:
        if (resolve) return getDefType();
        return basicGetDefType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.STRUCT_FIELDS__NAME:
        setName((String)newValue);
        return;
      case FlatBuffersPackage.STRUCT_FIELDS__PRIM_TYPE:
        setPrimType((String)newValue);
        return;
      case FlatBuffersPackage.STRUCT_FIELDS__DEF_TYPE:
        setDefType((Definition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.STRUCT_FIELDS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FlatBuffersPackage.STRUCT_FIELDS__PRIM_TYPE:
        setPrimType(PRIM_TYPE_EDEFAULT);
        return;
      case FlatBuffersPackage.STRUCT_FIELDS__DEF_TYPE:
        setDefType((Definition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.STRUCT_FIELDS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FlatBuffersPackage.STRUCT_FIELDS__PRIM_TYPE:
        return PRIM_TYPE_EDEFAULT == null ? primType != null : !PRIM_TYPE_EDEFAULT.equals(primType);
      case FlatBuffersPackage.STRUCT_FIELDS__DEF_TYPE:
        return defType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", primType: ");
    result.append(primType);
    result.append(')');
    return result.toString();
  }

} //StructFieldsImpl
