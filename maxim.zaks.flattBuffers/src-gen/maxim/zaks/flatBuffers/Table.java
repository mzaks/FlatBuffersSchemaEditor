/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Table#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Table#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends Definition
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(Attributes)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getTable_Attributes()
   * @model containment="true"
   * @generated
   */
  Attributes getAttributes();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Table#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attributes value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getTable_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Table
