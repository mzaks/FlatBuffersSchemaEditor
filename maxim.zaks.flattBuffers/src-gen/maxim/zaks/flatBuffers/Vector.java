/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Vector#getPrimType <em>Prim Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Vector#getTableType <em>Table Type</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends EObject
{
  /**
   * Returns the value of the '<em><b>Prim Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prim Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prim Type</em>' attribute.
   * @see #setPrimType(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getVector_PrimType()
   * @model
   * @generated
   */
  String getPrimType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Vector#getPrimType <em>Prim Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prim Type</em>' attribute.
   * @see #getPrimType()
   * @generated
   */
  void setPrimType(String value);

  /**
   * Returns the value of the '<em><b>Table Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Type</em>' containment reference.
   * @see #setTableType(TableType)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getVector_TableType()
   * @model containment="true"
   * @generated
   */
  TableType getTableType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Vector#getTableType <em>Table Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Type</em>' containment reference.
   * @see #getTableType()
   * @generated
   */
  void setTableType(TableType value);

} // Vector
