/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Enum#getType <em>Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Enum#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Enum#getEnumCases <em>Enum Cases</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Definition
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getEnum_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Enum#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getEnum_Attributes()
   * @model containment="true"
   * @generated
   */
  Attributes getAttributes();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Enum#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attributes value);

  /**
   * Returns the value of the '<em><b>Enum Cases</b></em>' containment reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.EnumCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Cases</em>' containment reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getEnum_EnumCases()
   * @model containment="true"
   * @generated
   */
  EList<EnumCase> getEnumCases();

} // Enum
