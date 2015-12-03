/**
 */
package maxim.zaks.flatBuffers.impl;

import java.util.Collection;

import maxim.zaks.flatBuffers.CustomAttributes;
import maxim.zaks.flatBuffers.FlatBuffersPackage;
import maxim.zaks.flatBuffers.Namespace;
import maxim.zaks.flatBuffers.RootType;
import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.flatBuffers.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.SchemaImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.SchemaImpl#getNamepsace <em>Namepsace</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.SchemaImpl#getFileIdentifier <em>File Identifier</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.SchemaImpl#getCustomAttributes <em>Custom Attributes</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.SchemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.SchemaImpl#getRootType <em>Root Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<String> includes;

  /**
   * The cached value of the '{@link #getNamepsace() <em>Namepsace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamepsace()
   * @generated
   * @ordered
   */
  protected Namespace namepsace;

  /**
   * The default value of the '{@link #getFileIdentifier() <em>File Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileIdentifier()
   * @generated
   * @ordered
   */
  protected static final String FILE_IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileIdentifier() <em>File Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileIdentifier()
   * @generated
   * @ordered
   */
  protected String fileIdentifier = FILE_IDENTIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustomAttributes() <em>Custom Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomAttributes()
   * @generated
   * @ordered
   */
  protected EList<CustomAttributes> customAttributes;

  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected EList<Table> tables;

  /**
   * The cached value of the '{@link #getRootType() <em>Root Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootType()
   * @generated
   * @ordered
   */
  protected RootType rootType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FlatBuffersPackage.Literals.SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIncludes()
  {
    if (includes == null)
    {
      includes = new EDataTypeEList<String>(String.class, this, FlatBuffersPackage.SCHEMA__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace getNamepsace()
  {
    return namepsace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamepsace(Namespace newNamepsace, NotificationChain msgs)
  {
    Namespace oldNamepsace = namepsace;
    namepsace = newNamepsace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.SCHEMA__NAMEPSACE, oldNamepsace, newNamepsace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamepsace(Namespace newNamepsace)
  {
    if (newNamepsace != namepsace)
    {
      NotificationChain msgs = null;
      if (namepsace != null)
        msgs = ((InternalEObject)namepsace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlatBuffersPackage.SCHEMA__NAMEPSACE, null, msgs);
      if (newNamepsace != null)
        msgs = ((InternalEObject)newNamepsace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlatBuffersPackage.SCHEMA__NAMEPSACE, null, msgs);
      msgs = basicSetNamepsace(newNamepsace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.SCHEMA__NAMEPSACE, newNamepsace, newNamepsace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileIdentifier()
  {
    return fileIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileIdentifier(String newFileIdentifier)
  {
    String oldFileIdentifier = fileIdentifier;
    fileIdentifier = newFileIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.SCHEMA__FILE_IDENTIFIER, oldFileIdentifier, fileIdentifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CustomAttributes> getCustomAttributes()
  {
    if (customAttributes == null)
    {
      customAttributes = new EObjectContainmentEList<CustomAttributes>(CustomAttributes.class, this, FlatBuffersPackage.SCHEMA__CUSTOM_ATTRIBUTES);
    }
    return customAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Table> getTables()
  {
    if (tables == null)
    {
      tables = new EObjectContainmentEList<Table>(Table.class, this, FlatBuffersPackage.SCHEMA__TABLES);
    }
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootType getRootType()
  {
    return rootType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootType(RootType newRootType, NotificationChain msgs)
  {
    RootType oldRootType = rootType;
    rootType = newRootType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.SCHEMA__ROOT_TYPE, oldRootType, newRootType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRootType(RootType newRootType)
  {
    if (newRootType != rootType)
    {
      NotificationChain msgs = null;
      if (rootType != null)
        msgs = ((InternalEObject)rootType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlatBuffersPackage.SCHEMA__ROOT_TYPE, null, msgs);
      if (newRootType != null)
        msgs = ((InternalEObject)newRootType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlatBuffersPackage.SCHEMA__ROOT_TYPE, null, msgs);
      msgs = basicSetRootType(newRootType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.SCHEMA__ROOT_TYPE, newRootType, newRootType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.SCHEMA__NAMEPSACE:
        return basicSetNamepsace(null, msgs);
      case FlatBuffersPackage.SCHEMA__CUSTOM_ATTRIBUTES:
        return ((InternalEList<?>)getCustomAttributes()).basicRemove(otherEnd, msgs);
      case FlatBuffersPackage.SCHEMA__TABLES:
        return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
      case FlatBuffersPackage.SCHEMA__ROOT_TYPE:
        return basicSetRootType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.SCHEMA__INCLUDES:
        return getIncludes();
      case FlatBuffersPackage.SCHEMA__NAMEPSACE:
        return getNamepsace();
      case FlatBuffersPackage.SCHEMA__FILE_IDENTIFIER:
        return getFileIdentifier();
      case FlatBuffersPackage.SCHEMA__CUSTOM_ATTRIBUTES:
        return getCustomAttributes();
      case FlatBuffersPackage.SCHEMA__TABLES:
        return getTables();
      case FlatBuffersPackage.SCHEMA__ROOT_TYPE:
        return getRootType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.SCHEMA__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends String>)newValue);
        return;
      case FlatBuffersPackage.SCHEMA__NAMEPSACE:
        setNamepsace((Namespace)newValue);
        return;
      case FlatBuffersPackage.SCHEMA__FILE_IDENTIFIER:
        setFileIdentifier((String)newValue);
        return;
      case FlatBuffersPackage.SCHEMA__CUSTOM_ATTRIBUTES:
        getCustomAttributes().clear();
        getCustomAttributes().addAll((Collection<? extends CustomAttributes>)newValue);
        return;
      case FlatBuffersPackage.SCHEMA__TABLES:
        getTables().clear();
        getTables().addAll((Collection<? extends Table>)newValue);
        return;
      case FlatBuffersPackage.SCHEMA__ROOT_TYPE:
        setRootType((RootType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.SCHEMA__INCLUDES:
        getIncludes().clear();
        return;
      case FlatBuffersPackage.SCHEMA__NAMEPSACE:
        setNamepsace((Namespace)null);
        return;
      case FlatBuffersPackage.SCHEMA__FILE_IDENTIFIER:
        setFileIdentifier(FILE_IDENTIFIER_EDEFAULT);
        return;
      case FlatBuffersPackage.SCHEMA__CUSTOM_ATTRIBUTES:
        getCustomAttributes().clear();
        return;
      case FlatBuffersPackage.SCHEMA__TABLES:
        getTables().clear();
        return;
      case FlatBuffersPackage.SCHEMA__ROOT_TYPE:
        setRootType((RootType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.SCHEMA__INCLUDES:
        return includes != null && !includes.isEmpty();
      case FlatBuffersPackage.SCHEMA__NAMEPSACE:
        return namepsace != null;
      case FlatBuffersPackage.SCHEMA__FILE_IDENTIFIER:
        return FILE_IDENTIFIER_EDEFAULT == null ? fileIdentifier != null : !FILE_IDENTIFIER_EDEFAULT.equals(fileIdentifier);
      case FlatBuffersPackage.SCHEMA__CUSTOM_ATTRIBUTES:
        return customAttributes != null && !customAttributes.isEmpty();
      case FlatBuffersPackage.SCHEMA__TABLES:
        return tables != null && !tables.isEmpty();
      case FlatBuffersPackage.SCHEMA__ROOT_TYPE:
        return rootType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (includes: ");
    result.append(includes);
    result.append(", fileIdentifier: ");
    result.append(fileIdentifier);
    result.append(')');
    return result.toString();
  }

} //SchemaImpl
