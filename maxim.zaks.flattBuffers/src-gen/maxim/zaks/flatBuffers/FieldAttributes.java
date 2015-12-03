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
 *   <li>{@link maxim.zaks.flatBuffers.FieldAttributes#getAttributeList <em>Attribute List</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.FieldAttributes#getAtributeName <em>Atribute Name</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getFieldAttributes()
 * @model
 * @generated
 */
public interface FieldAttributes extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute List</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute List</em>' attribute.
   * @see #setAttributeList(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getFieldAttributes_AttributeList()
   * @model
   * @generated
   */
  String getAttributeList();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.FieldAttributes#getAttributeList <em>Attribute List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute List</em>' attribute.
   * @see #getAttributeList()
   * @generated
   */
  void setAttributeList(String value);

  /**
   * Returns the value of the '<em><b>Atribute Name</b></em>' containment reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.AttributeName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atribute Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atribute Name</em>' containment reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getFieldAttributes_AtributeName()
   * @model containment="true"
   * @generated
   */
  EList<AttributeName> getAtributeName();

} // FieldAttributes
