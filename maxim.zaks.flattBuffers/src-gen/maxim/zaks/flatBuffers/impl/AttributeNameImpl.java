/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.CustomAttributes;
import maxim.zaks.flatBuffers.FlatBuffersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isDeprectated <em>Deprectated</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getCustomName <em>Custom Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeNameImpl extends MinimalEObjectImpl.Container implements AttributeName
{
  /**
   * The default value of the '{@link #isDeprectated() <em>Deprectated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprectated()
   * @generated
   * @ordered
   */
  protected static final boolean DEPRECTATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeprectated() <em>Deprectated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprectated()
   * @generated
   * @ordered
   */
  protected boolean deprectated = DEPRECTATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustomName() <em>Custom Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomName()
   * @generated
   * @ordered
   */
  protected CustomAttributes customName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeNameImpl()
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
    return FlatBuffersPackage.Literals.ATTRIBUTE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeprectated()
  {
    return deprectated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeprectated(boolean newDeprectated)
  {
    boolean oldDeprectated = deprectated;
    deprectated = newDeprectated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED, oldDeprectated, deprectated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributes getCustomName()
  {
    if (customName != null && customName.eIsProxy())
    {
      InternalEObject oldCustomName = (InternalEObject)customName;
      customName = (CustomAttributes)eResolveProxy(oldCustomName);
      if (customName != oldCustomName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME, oldCustomName, customName));
      }
    }
    return customName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributes basicGetCustomName()
  {
    return customName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomName(CustomAttributes newCustomName)
  {
    CustomAttributes oldCustomName = customName;
    customName = newCustomName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME, oldCustomName, customName));
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        return isDeprectated();
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        if (resolve) return getCustomName();
        return basicGetCustomName();
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        setDeprectated((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        setCustomName((CustomAttributes)newValue);
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        setDeprectated(DEPRECTATED_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        setCustomName((CustomAttributes)null);
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        return deprectated != DEPRECTATED_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        return customName != null;
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
    result.append(" (deprectated: ");
    result.append(deprectated);
    result.append(')');
    return result.toString();
  }

} //AttributeNameImpl
