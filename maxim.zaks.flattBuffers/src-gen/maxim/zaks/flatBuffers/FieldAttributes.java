/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.FieldAttributes#getAtributeNames <em>Atribute Names</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getFieldAttributes()
 * @model
 * @generated
 */
public interface FieldAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Atribute Names</b></em>' containment reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.AttributeName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atribute Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribute Names</em>' containment reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getFieldAttributes_AtributeNames()
   * @model containment="true"
   * @generated
   */
  EList<AttributeName> getAtributeNames();

} // FieldAttributes
