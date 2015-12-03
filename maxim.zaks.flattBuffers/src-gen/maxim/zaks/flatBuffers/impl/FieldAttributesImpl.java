/**
 */
package maxim.zaks.flatBuffers.impl;

import java.util.Collection;

import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.FieldAttributes;
import maxim.zaks.flatBuffers.FlatBuffersPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.FieldAttributesImpl#getAttributeList <em>Attribute List</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.FieldAttributesImpl#getAtributeName <em>Atribute Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldAttributesImpl extends MinimalEObjectImpl.Container implements FieldAttributes
{
  /**
   * The default value of the '{@link #getAttributeList() <em>Attribute List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeList()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_LIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeList() <em>Attribute List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeList()
   * @generated
   * @ordered
   */
  protected String attributeList = ATTRIBUTE_LIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtributeName() <em>Atribute Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributeName()
   * @generated
   * @ordered
   */
  protected EList<AttributeName> atributeName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldAttributesImpl()
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
    return FlatBuffersPackage.Literals.FIELD_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeList()
  {
    return attributeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeList(String newAttributeList)
  {
    String oldAttributeList = attributeList;
    attributeList = newAttributeList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.FIELD_ATTRIBUTES__ATTRIBUTE_LIST, oldAttributeList, attributeList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeName> getAtributeName()
  {
    if (atributeName == null)
    {
      atributeName = new EObjectContainmentEList<AttributeName>(AttributeName.class, this, FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAME);
    }
    return atributeName;
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAME:
        return ((InternalEList<?>)getAtributeName()).basicRemove(otherEnd, msgs);
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATTRIBUTE_LIST:
        return getAttributeList();
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAME:
        return getAtributeName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATTRIBUTE_LIST:
        setAttributeList((String)newValue);
        return;
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAME:
        getAtributeName().clear();
        getAtributeName().addAll((Collection<? extends AttributeName>)newValue);
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATTRIBUTE_LIST:
        setAttributeList(ATTRIBUTE_LIST_EDEFAULT);
        return;
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAME:
        getAtributeName().clear();
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATTRIBUTE_LIST:
        return ATTRIBUTE_LIST_EDEFAULT == null ? attributeList != null : !ATTRIBUTE_LIST_EDEFAULT.equals(attributeList);
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAME:
        return atributeName != null && !atributeName.isEmpty();
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
    result.append(" (attributeList: ");
    result.append(attributeList);
    result.append(')');
    return result.toString();
  }

} //FieldAttributesImpl
