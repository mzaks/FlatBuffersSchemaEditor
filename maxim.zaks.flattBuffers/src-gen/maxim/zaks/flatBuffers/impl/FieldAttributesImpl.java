/**
 */
package maxim.zaks.flatBuffers.impl;

import java.util.Collection;

import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.FieldAttributes;
import maxim.zaks.flatBuffers.FlatBuffersPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link maxim.zaks.flatBuffers.impl.FieldAttributesImpl#getAtributeNames <em>Atribute Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldAttributesImpl extends MinimalEObjectImpl.Container implements FieldAttributes
{
  /**
   * The cached value of the '{@link #getAtributeNames() <em>Atribute Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributeNames()
   * @generated
   * @ordered
   */
  protected EList<AttributeName> atributeNames;

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
  public EList<AttributeName> getAtributeNames()
  {
    if (atributeNames == null)
    {
      atributeNames = new EObjectContainmentEList<AttributeName>(AttributeName.class, this, FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAMES);
    }
    return atributeNames;
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAMES:
        return ((InternalEList<?>)getAtributeNames()).basicRemove(otherEnd, msgs);
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAMES:
        return getAtributeNames();
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAMES:
        getAtributeNames().clear();
        getAtributeNames().addAll((Collection<? extends AttributeName>)newValue);
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAMES:
        getAtributeNames().clear();
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
      case FlatBuffersPackage.FIELD_ATTRIBUTES__ATRIBUTE_NAMES:
        return atributeNames != null && !atributeNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FieldAttributesImpl
