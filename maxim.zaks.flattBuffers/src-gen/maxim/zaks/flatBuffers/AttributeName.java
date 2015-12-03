/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.AttributeName#isDeprectated <em>Deprectated</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.AttributeName#getCustomName <em>Custom Name</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getAttributeName()
 * @model
 * @generated
 */
public interface AttributeName extends EObject
{
  /**
   * Returns the value of the '<em><b>Deprectated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deprectated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprectated</em>' attribute.
   * @see #setDeprectated(boolean)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getAttributeName_Deprectated()
   * @model
   * @generated
   */
  boolean isDeprectated();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.AttributeName#isDeprectated <em>Deprectated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprectated</em>' attribute.
   * @see #isDeprectated()
   * @generated
   */
  void setDeprectated(boolean value);

  /**
   * Returns the value of the '<em><b>Custom Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Name</em>' reference.
   * @see #setCustomName(CustomAttributes)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getAttributeName_CustomName()
   * @model
   * @generated
   */
  CustomAttributes getCustomName();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.AttributeName#getCustomName <em>Custom Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Name</em>' reference.
   * @see #getCustomName()
   * @generated
   */
  void setCustomName(CustomAttributes value);

} // AttributeName
