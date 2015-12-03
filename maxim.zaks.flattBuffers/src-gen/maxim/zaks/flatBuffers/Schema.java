/**
 */
package maxim.zaks.flatBuffers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.Schema#getIncludes <em>Includes</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Schema#getNamepsace <em>Namepsace</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Schema#getFileIdentifier <em>File Identifier</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Schema#getCustomAttributes <em>Custom Attributes</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Schema#getTables <em>Tables</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.Schema#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' attribute list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema_Includes()
   * @model unique="false"
   * @generated
   */
  EList<String> getIncludes();

  /**
   * Returns the value of the '<em><b>Namepsace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namepsace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namepsace</em>' containment reference.
   * @see #setNamepsace(Namespace)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema_Namepsace()
   * @model containment="true"
   * @generated
   */
  Namespace getNamepsace();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Schema#getNamepsace <em>Namepsace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namepsace</em>' containment reference.
   * @see #getNamepsace()
   * @generated
   */
  void setNamepsace(Namespace value);

  /**
   * Returns the value of the '<em><b>File Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Identifier</em>' attribute.
   * @see #setFileIdentifier(String)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema_FileIdentifier()
   * @model
   * @generated
   */
  String getFileIdentifier();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Schema#getFileIdentifier <em>File Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Identifier</em>' attribute.
   * @see #getFileIdentifier()
   * @generated
   */
  void setFileIdentifier(String value);

  /**
   * Returns the value of the '<em><b>Custom Attributes</b></em>' containment reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.CustomAttributes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Attributes</em>' containment reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema_CustomAttributes()
   * @model containment="true"
   * @generated
   */
  EList<CustomAttributes> getCustomAttributes();

  /**
   * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
   * The list contents are of type {@link maxim.zaks.flatBuffers.Table}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tables</em>' containment reference list.
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema_Tables()
   * @model containment="true"
   * @generated
   */
  EList<Table> getTables();

  /**
   * Returns the value of the '<em><b>Root Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Type</em>' containment reference.
   * @see #setRootType(RootType)
   * @see maxim.zaks.flatBuffers.FlatBuffersPackage#getSchema_RootType()
   * @model containment="true"
   * @generated
   */
  RootType getRootType();

  /**
   * Sets the value of the '{@link maxim.zaks.flatBuffers.Schema#getRootType <em>Root Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Type</em>' containment reference.
   * @see #getRootType()
   * @generated
   */
  void setRootType(RootType value);

} // Schema
