/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.FlatBuffersPackage;
import maxim.zaks.flatBuffers.Type;
import maxim.zaks.flatBuffers.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.TypeImpl#getPrimType <em>Prim Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.TypeImpl#getVectorType <em>Vector Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.TypeImpl#getDefType <em>Def Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.TypeImpl#getQualifiedType <em>Qualified Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
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
   * The cached value of the '{@link #getVectorType() <em>Vector Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVectorType()
   * @generated
   * @ordered
   */
  protected Vector vectorType;

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
   * The default value of the '{@link #getQualifiedType() <em>Qualified Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedType()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifiedType() <em>Qualified Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedType()
   * @generated
   * @ordered
   */
  protected String qualifiedType = QUALIFIED_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return FlatBuffersPackage.Literals.TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.TYPE__PRIM_TYPE, oldPrimType, primType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector getVectorType()
  {
    return vectorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVectorType(Vector newVectorType, NotificationChain msgs)
  {
    Vector oldVectorType = vectorType;
    vectorType = newVectorType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.TYPE__VECTOR_TYPE, oldVectorType, newVectorType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVectorType(Vector newVectorType)
  {
    if (newVectorType != vectorType)
    {
      NotificationChain msgs = null;
      if (vectorType != null)
        msgs = ((InternalEObject)vectorType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlatBuffersPackage.TYPE__VECTOR_TYPE, null, msgs);
      if (newVectorType != null)
        msgs = ((InternalEObject)newVectorType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlatBuffersPackage.TYPE__VECTOR_TYPE, null, msgs);
      msgs = basicSetVectorType(newVectorType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.TYPE__VECTOR_TYPE, newVectorType, newVectorType));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlatBuffersPackage.TYPE__DEF_TYPE, oldDefType, defType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.TYPE__DEF_TYPE, oldDefType, defType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedType()
  {
    return qualifiedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedType(String newQualifiedType)
  {
    String oldQualifiedType = qualifiedType;
    qualifiedType = newQualifiedType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.TYPE__QUALIFIED_TYPE, oldQualifiedType, qualifiedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.TYPE__VECTOR_TYPE:
        return basicSetVectorType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FlatBuffersPackage.TYPE__PRIM_TYPE:
        return getPrimType();
      case FlatBuffersPackage.TYPE__VECTOR_TYPE:
        return getVectorType();
      case FlatBuffersPackage.TYPE__DEF_TYPE:
        if (resolve) return getDefType();
        return basicGetDefType();
      case FlatBuffersPackage.TYPE__QUALIFIED_TYPE:
        return getQualifiedType();
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
      case FlatBuffersPackage.TYPE__PRIM_TYPE:
        setPrimType((String)newValue);
        return;
      case FlatBuffersPackage.TYPE__VECTOR_TYPE:
        setVectorType((Vector)newValue);
        return;
      case FlatBuffersPackage.TYPE__DEF_TYPE:
        setDefType((Definition)newValue);
        return;
      case FlatBuffersPackage.TYPE__QUALIFIED_TYPE:
        setQualifiedType((String)newValue);
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
      case FlatBuffersPackage.TYPE__PRIM_TYPE:
        setPrimType(PRIM_TYPE_EDEFAULT);
        return;
      case FlatBuffersPackage.TYPE__VECTOR_TYPE:
        setVectorType((Vector)null);
        return;
      case FlatBuffersPackage.TYPE__DEF_TYPE:
        setDefType((Definition)null);
        return;
      case FlatBuffersPackage.TYPE__QUALIFIED_TYPE:
        setQualifiedType(QUALIFIED_TYPE_EDEFAULT);
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
      case FlatBuffersPackage.TYPE__PRIM_TYPE:
        return PRIM_TYPE_EDEFAULT == null ? primType != null : !PRIM_TYPE_EDEFAULT.equals(primType);
      case FlatBuffersPackage.TYPE__VECTOR_TYPE:
        return vectorType != null;
      case FlatBuffersPackage.TYPE__DEF_TYPE:
        return defType != null;
      case FlatBuffersPackage.TYPE__QUALIFIED_TYPE:
        return QUALIFIED_TYPE_EDEFAULT == null ? qualifiedType != null : !QUALIFIED_TYPE_EDEFAULT.equals(qualifiedType);
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
    result.append(" (primType: ");
    result.append(primType);
    result.append(", qualifiedType: ");
    result.append(qualifiedType);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
