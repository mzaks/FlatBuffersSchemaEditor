/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.StructField#getName <em>Name</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.StructField#getPrimType <em>Prim Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.StructField#getDefType <em>Def Type</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getStructField()
 * @model
 * @generated
 */
public interface StructField extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getStructField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.StructField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getStructField_PrimType()
   * @model
   * @generated
   */
  String getPrimType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.StructField#getPrimType <em>Prim Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prim Type</em>' attribute.
   * @see #getPrimType()
   * @generated
   */
  void setPrimType(String value);

  /**
   * Returns the value of the '<em><b>Def Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Type</em>' reference.
   * @see #setDefType(Struct)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getStructField_DefType()
   * @model
   * @generated
   */
  Struct getDefType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.StructField#getDefType <em>Def Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def Type</em>' reference.
   * @see #getDefType()
   * @generated
   */
  void setDefType(Struct value);

} // StructField
