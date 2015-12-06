/**
 */
package maxim.zaks.flatBuffers.impl;

import java.util.Collection;

import maxim.zaks.flatBuffers.FlatBuffersPackage;
import maxim.zaks.flatBuffers.Table;
import maxim.zaks.flatBuffers.Union;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.UnionImpl#getUnionCases <em>Union Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnionImpl extends DefinitionImpl implements Union
{
  /**
   * The cached value of the '{@link #getUnionCases() <em>Union Cases</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnionCases()
   * @generated
   * @ordered
   */
  protected EList<Table> unionCases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnionImpl()
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
    return FlatBuffersPackage.Literals.UNION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Table> getUnionCases()
  {
    if (unionCases == null)
    {
      unionCases = new EObjectResolvingEList<Table>(Table.class, this, FlatBuffersPackage.UNION__UNION_CASES);
    }
    return unionCases;
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
      case FlatBuffersPackage.UNION__UNION_CASES:
        return getUnionCases();
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
      case FlatBuffersPackage.UNION__UNION_CASES:
        getUnionCases().clear();
        getUnionCases().addAll((Collection<? extends Table>)newValue);
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
      case FlatBuffersPackage.UNION__UNION_CASES:
        getUnionCases().clear();
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
      case FlatBuffersPackage.UNION__UNION_CASES:
        return unionCases != null && !unionCases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UnionImpl
