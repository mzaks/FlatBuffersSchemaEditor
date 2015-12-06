/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.FlatBuffersPackage;
import maxim.zaks.flatBuffers.Value;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.ValueImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.ValueImpl#isIsFalse <em>Is False</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.ValueImpl#isIsTrue <em>Is True</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.ValueImpl#getEnumCase <em>Enum Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value
{
  /**
   * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected static final String NUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected String number = NUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #isIsFalse() <em>Is False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFalse()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FALSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFalse() <em>Is False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFalse()
   * @generated
   * @ordered
   */
  protected boolean isFalse = IS_FALSE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsTrue() <em>Is True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTrue()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TRUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTrue() <em>Is True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTrue()
   * @generated
   * @ordered
   */
  protected boolean isTrue = IS_TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #getEnumCase() <em>Enum Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumCase()
   * @generated
   * @ordered
   */
  protected static final String ENUM_CASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumCase() <em>Enum Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumCase()
   * @generated
   * @ordered
   */
  protected String enumCase = ENUM_CASE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueImpl()
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
    return FlatBuffersPackage.Literals.VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(String newNumber)
  {
    String oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.VALUE__NUMBER, oldNumber, number));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFalse()
  {
    return isFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFalse(boolean newIsFalse)
  {
    boolean oldIsFalse = isFalse;
    isFalse = newIsFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.VALUE__IS_FALSE, oldIsFalse, isFalse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTrue()
  {
    return isTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTrue(boolean newIsTrue)
  {
    boolean oldIsTrue = isTrue;
    isTrue = newIsTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.VALUE__IS_TRUE, oldIsTrue, isTrue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnumCase()
  {
    return enumCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumCase(String newEnumCase)
  {
    String oldEnumCase = enumCase;
    enumCase = newEnumCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.VALUE__ENUM_CASE, oldEnumCase, enumCase));
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
      case FlatBuffersPackage.VALUE__NUMBER:
        return getNumber();
      case FlatBuffersPackage.VALUE__IS_FALSE:
        return isIsFalse();
      case FlatBuffersPackage.VALUE__IS_TRUE:
        return isIsTrue();
      case FlatBuffersPackage.VALUE__ENUM_CASE:
        return getEnumCase();
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
      case FlatBuffersPackage.VALUE__NUMBER:
        setNumber((String)newValue);
        return;
      case FlatBuffersPackage.VALUE__IS_FALSE:
        setIsFalse((Boolean)newValue);
        return;
      case FlatBuffersPackage.VALUE__IS_TRUE:
        setIsTrue((Boolean)newValue);
        return;
      case FlatBuffersPackage.VALUE__ENUM_CASE:
        setEnumCase((String)newValue);
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
      case FlatBuffersPackage.VALUE__NUMBER:
        setNumber(NUMBER_EDEFAULT);
        return;
      case FlatBuffersPackage.VALUE__IS_FALSE:
        setIsFalse(IS_FALSE_EDEFAULT);
        return;
      case FlatBuffersPackage.VALUE__IS_TRUE:
        setIsTrue(IS_TRUE_EDEFAULT);
        return;
      case FlatBuffersPackage.VALUE__ENUM_CASE:
        setEnumCase(ENUM_CASE_EDEFAULT);
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
      case FlatBuffersPackage.VALUE__NUMBER:
        return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
      case FlatBuffersPackage.VALUE__IS_FALSE:
        return isFalse != IS_FALSE_EDEFAULT;
      case FlatBuffersPackage.VALUE__IS_TRUE:
        return isTrue != IS_TRUE_EDEFAULT;
      case FlatBuffersPackage.VALUE__ENUM_CASE:
        return ENUM_CASE_EDEFAULT == null ? enumCase != null : !ENUM_CASE_EDEFAULT.equals(enumCase);
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
    result.append(" (number: ");
    result.append(number);
    result.append(", isFalse: ");
    result.append(isFalse);
    result.append(", isTrue: ");
    result.append(isTrue);
    result.append(", enumCase: ");
    result.append(enumCase);
    result.append(')');
    return result.toString();
  }

} //ValueImpl
