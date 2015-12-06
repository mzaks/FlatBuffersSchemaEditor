/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Value#getNumber <em>Number</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Value#isIsFalse <em>Is False</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Value#isIsTrue <em>Is True</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Value#getEnumCase <em>Enum Case</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getValue_Number()
   * @model
   * @generated
   */
  String getNumber();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Value#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(String value);

  /**
   * Returns the value of the '<em><b>Is False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is False</em>' attribute.
   * @see #setIsFalse(boolean)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getValue_IsFalse()
   * @model
   * @generated
   */
  boolean isIsFalse();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Value#isIsFalse <em>Is False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is False</em>' attribute.
   * @see #isIsFalse()
   * @generated
   */
  void setIsFalse(boolean value);

  /**
   * Returns the value of the '<em><b>Is True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is True</em>' attribute.
   * @see #setIsTrue(boolean)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getValue_IsTrue()
   * @model
   * @generated
   */
  boolean isIsTrue();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Value#isIsTrue <em>Is True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is True</em>' attribute.
   * @see #isIsTrue()
   * @generated
   */
  void setIsTrue(boolean value);

  /**
   * Returns the value of the '<em><b>Enum Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Case</em>' attribute.
   * @see #setEnumCase(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getValue_EnumCase()
   * @model
   * @generated
   */
  String getEnumCase();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Value#getEnumCase <em>Enum Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Case</em>' attribute.
   * @see #getEnumCase()
   * @generated
   */
  void setEnumCase(String value);

} // Value
