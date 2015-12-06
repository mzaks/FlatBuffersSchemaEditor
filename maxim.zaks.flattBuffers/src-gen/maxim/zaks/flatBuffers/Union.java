/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Union#getUnionCases <em>Union Cases</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends Definition
{
  /**
   * Returns the value of the '<em><b>Union Cases</b></em>' reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.Table}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Union Cases</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Union Cases</em>' reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getUnion_UnionCases()
   * @model
   * @generated
   */
  EList<Table> getUnionCases();

} // Union
