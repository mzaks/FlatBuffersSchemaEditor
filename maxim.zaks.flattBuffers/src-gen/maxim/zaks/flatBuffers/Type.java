/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Type#getPrimType <em>Prim Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Type#getVectorType <em>Vector Type</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Type#getDefType <em>Def Type</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
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
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getType_PrimType()
   * @model
   * @generated
   */
  String getPrimType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Type#getPrimType <em>Prim Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prim Type</em>' attribute.
   * @see #getPrimType()
   * @generated
   */
  void setPrimType(String value);

  /**
   * Returns the value of the '<em><b>Vector Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector Type</em>' containment reference.
   * @see #setVectorType(Vector)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getType_VectorType()
   * @model containment="true"
   * @generated
   */
  Vector getVectorType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Type#getVectorType <em>Vector Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector Type</em>' containment reference.
   * @see #getVectorType()
   * @generated
   */
  void setVectorType(Vector value);

  /**
   * Returns the value of the '<em><b>Def Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def Type</em>' reference.
   * @see #setDefType(Definition)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getType_DefType()
   * @model
   * @generated
   */
  Definition getDefType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Type#getDefType <em>Def Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def Type</em>' reference.
   * @see #getDefType()
   * @generated
   */
  void setDefType(Definition value);

} // Type
