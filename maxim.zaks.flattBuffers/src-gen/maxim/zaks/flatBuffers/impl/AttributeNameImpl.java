/**
 */
package maxim.zaks.flatBuffers.impl;

import maxim.zaks.flatBuffers.AttributeName;
import maxim.zaks.flatBuffers.CustomAttributes;
import maxim.zaks.flatBuffers.FlatBuffersPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isDeprectated <em>Deprectated</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isHasAttributeId <em>Has Attribute Id</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getAttributeId <em>Attribute Id</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isOriginal_order <em>Original order</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isHasAlignSize <em>Has Align Size</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getAlignSize <em>Align Size</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isHasHash <em>Has Hash</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getHashKey <em>Hash Key</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isBit_flags <em>Bit flags</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isHasNestedTableName <em>Has Nested Table Name</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getNestedTableName <em>Nested Table Name</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#isKey <em>Key</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getCustomName <em>Custom Name</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link maxim.zaks.flatBuffers.impl.AttributeNameImpl#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeNameImpl extends MinimalEObjectImpl.Container implements AttributeName
{
  /**
   * The default value of the '{@link #isDeprectated() <em>Deprectated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprectated()
   * @generated
   * @ordered
   */
  protected static final boolean DEPRECTATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeprectated() <em>Deprectated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeprectated()
   * @generated
   * @ordered
   */
  protected boolean deprectated = DEPRECTATED_EDEFAULT;

  /**
   * The default value of the '{@link #isHasAttributeId() <em>Has Attribute Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAttributeId()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_ATTRIBUTE_ID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasAttributeId() <em>Has Attribute Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAttributeId()
   * @generated
   * @ordered
   */
  protected boolean hasAttributeId = HAS_ATTRIBUTE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getAttributeId() <em>Attribute Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeId()
   * @generated
   * @ordered
   */
  protected static final int ATTRIBUTE_ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAttributeId() <em>Attribute Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeId()
   * @generated
   * @ordered
   */
  protected int attributeId = ATTRIBUTE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected static final boolean REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRequired()
   * @generated
   * @ordered
   */
  protected boolean required = REQUIRED_EDEFAULT;

  /**
   * The default value of the '{@link #isOriginal_order() <em>Original order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOriginal_order()
   * @generated
   * @ordered
   */
  protected static final boolean ORIGINAL_ORDER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOriginal_order() <em>Original order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOriginal_order()
   * @generated
   * @ordered
   */
  protected boolean original_order = ORIGINAL_ORDER_EDEFAULT;

  /**
   * The default value of the '{@link #isHasAlignSize() <em>Has Align Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAlignSize()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_ALIGN_SIZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasAlignSize() <em>Has Align Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasAlignSize()
   * @generated
   * @ordered
   */
  protected boolean hasAlignSize = HAS_ALIGN_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getAlignSize() <em>Align Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignSize()
   * @generated
   * @ordered
   */
  protected static final int ALIGN_SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAlignSize() <em>Align Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignSize()
   * @generated
   * @ordered
   */
  protected int alignSize = ALIGN_SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isHasHash() <em>Has Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasHash()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_HASH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasHash() <em>Has Hash</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasHash()
   * @generated
   * @ordered
   */
  protected boolean hasHash = HAS_HASH_EDEFAULT;

  /**
   * The default value of the '{@link #getHashKey() <em>Hash Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHashKey()
   * @generated
   * @ordered
   */
  protected static final String HASH_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHashKey() <em>Hash Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHashKey()
   * @generated
   * @ordered
   */
  protected String hashKey = HASH_KEY_EDEFAULT;

  /**
   * The default value of the '{@link #isBit_flags() <em>Bit flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBit_flags()
   * @generated
   * @ordered
   */
  protected static final boolean BIT_FLAGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBit_flags() <em>Bit flags</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBit_flags()
   * @generated
   * @ordered
   */
  protected boolean bit_flags = BIT_FLAGS_EDEFAULT;

  /**
   * The default value of the '{@link #isHasNestedTableName() <em>Has Nested Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasNestedTableName()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_NESTED_TABLE_NAME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasNestedTableName() <em>Has Nested Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasNestedTableName()
   * @generated
   * @ordered
   */
  protected boolean hasNestedTableName = HAS_NESTED_TABLE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNestedTableName() <em>Nested Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedTableName()
   * @generated
   * @ordered
   */
  protected static final String NESTED_TABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNestedTableName() <em>Nested Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedTableName()
   * @generated
   * @ordered
   */
  protected String nestedTableName = NESTED_TABLE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKey()
   * @generated
   * @ordered
   */
  protected static final boolean KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isKey()
   * @generated
   * @ordered
   */
  protected boolean key = KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustomName() <em>Custom Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomName()
   * @generated
   * @ordered
   */
  protected CustomAttributes customName;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeNameImpl()
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
    return FlatBuffersPackage.Literals.ATTRIBUTE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeprectated()
  {
    return deprectated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeprectated(boolean newDeprectated)
  {
    boolean oldDeprectated = deprectated;
    deprectated = newDeprectated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED, oldDeprectated, deprectated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasAttributeId()
  {
    return hasAttributeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAttributeId(boolean newHasAttributeId)
  {
    boolean oldHasAttributeId = hasAttributeId;
    hasAttributeId = newHasAttributeId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID, oldHasAttributeId, hasAttributeId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAttributeId()
  {
    return attributeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeId(int newAttributeId)
  {
    int oldAttributeId = attributeId;
    attributeId = newAttributeId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__ATTRIBUTE_ID, oldAttributeId, attributeId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(boolean newRequired)
  {
    boolean oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__REQUIRED, oldRequired, required));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOriginal_order()
  {
    return original_order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOriginal_order(boolean newOriginal_order)
  {
    boolean oldOriginal_order = original_order;
    original_order = newOriginal_order;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__ORIGINAL_ORDER, oldOriginal_order, original_order));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasAlignSize()
  {
    return hasAlignSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasAlignSize(boolean newHasAlignSize)
  {
    boolean oldHasAlignSize = hasAlignSize;
    hasAlignSize = newHasAlignSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ALIGN_SIZE, oldHasAlignSize, hasAlignSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAlignSize()
  {
    return alignSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignSize(int newAlignSize)
  {
    int oldAlignSize = alignSize;
    alignSize = newAlignSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__ALIGN_SIZE, oldAlignSize, alignSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasHash()
  {
    return hasHash;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasHash(boolean newHasHash)
  {
    boolean oldHasHash = hasHash;
    hasHash = newHasHash;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__HAS_HASH, oldHasHash, hasHash));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHashKey()
  {
    return hashKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHashKey(String newHashKey)
  {
    String oldHashKey = hashKey;
    hashKey = newHashKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__HASH_KEY, oldHashKey, hashKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBit_flags()
  {
    return bit_flags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBit_flags(boolean newBit_flags)
  {
    boolean oldBit_flags = bit_flags;
    bit_flags = newBit_flags;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__BIT_FLAGS, oldBit_flags, bit_flags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHasNestedTableName()
  {
    return hasNestedTableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHasNestedTableName(boolean newHasNestedTableName)
  {
    boolean oldHasNestedTableName = hasNestedTableName;
    hasNestedTableName = newHasNestedTableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME, oldHasNestedTableName, hasNestedTableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNestedTableName()
  {
    return nestedTableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNestedTableName(String newNestedTableName)
  {
    String oldNestedTableName = nestedTableName;
    nestedTableName = newNestedTableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__NESTED_TABLE_NAME, oldNestedTableName, nestedTableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(boolean newKey)
  {
    boolean oldKey = key;
    key = newKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__KEY, oldKey, key));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributes getCustomName()
  {
    if (customName != null && customName.eIsProxy())
    {
      InternalEObject oldCustomName = (InternalEObject)customName;
      customName = (CustomAttributes)eResolveProxy(oldCustomName);
      if (customName != oldCustomName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME, oldCustomName, customName));
      }
    }
    return customName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomAttributes basicGetCustomName()
  {
    return customName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomName(CustomAttributes newCustomName)
  {
    CustomAttributes oldCustomName = customName;
    customName = newCustomName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME, oldCustomName, customName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FlatBuffersPackage.ATTRIBUTE_NAME__STRING_VALUE, oldStringValue, stringValue));
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        return isDeprectated();
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID:
        return isHasAttributeId();
      case FlatBuffersPackage.ATTRIBUTE_NAME__ATTRIBUTE_ID:
        return getAttributeId();
      case FlatBuffersPackage.ATTRIBUTE_NAME__REQUIRED:
        return isRequired();
      case FlatBuffersPackage.ATTRIBUTE_NAME__ORIGINAL_ORDER:
        return isOriginal_order();
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ALIGN_SIZE:
        return isHasAlignSize();
      case FlatBuffersPackage.ATTRIBUTE_NAME__ALIGN_SIZE:
        return getAlignSize();
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_HASH:
        return isHasHash();
      case FlatBuffersPackage.ATTRIBUTE_NAME__HASH_KEY:
        return getHashKey();
      case FlatBuffersPackage.ATTRIBUTE_NAME__BIT_FLAGS:
        return isBit_flags();
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME:
        return isHasNestedTableName();
      case FlatBuffersPackage.ATTRIBUTE_NAME__NESTED_TABLE_NAME:
        return getNestedTableName();
      case FlatBuffersPackage.ATTRIBUTE_NAME__KEY:
        return isKey();
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        if (resolve) return getCustomName();
        return basicGetCustomName();
      case FlatBuffersPackage.ATTRIBUTE_NAME__INT_VALUE:
        return getIntValue();
      case FlatBuffersPackage.ATTRIBUTE_NAME__STRING_VALUE:
        return getStringValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        setDeprectated((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID:
        setHasAttributeId((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ATTRIBUTE_ID:
        setAttributeId((Integer)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__REQUIRED:
        setRequired((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ORIGINAL_ORDER:
        setOriginal_order((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ALIGN_SIZE:
        setHasAlignSize((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ALIGN_SIZE:
        setAlignSize((Integer)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_HASH:
        setHasHash((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HASH_KEY:
        setHashKey((String)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__BIT_FLAGS:
        setBit_flags((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME:
        setHasNestedTableName((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__NESTED_TABLE_NAME:
        setNestedTableName((String)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__KEY:
        setKey((Boolean)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        setCustomName((CustomAttributes)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__STRING_VALUE:
        setStringValue((String)newValue);
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        setDeprectated(DEPRECTATED_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID:
        setHasAttributeId(HAS_ATTRIBUTE_ID_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ATTRIBUTE_ID:
        setAttributeId(ATTRIBUTE_ID_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__REQUIRED:
        setRequired(REQUIRED_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ORIGINAL_ORDER:
        setOriginal_order(ORIGINAL_ORDER_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ALIGN_SIZE:
        setHasAlignSize(HAS_ALIGN_SIZE_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ALIGN_SIZE:
        setAlignSize(ALIGN_SIZE_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_HASH:
        setHasHash(HAS_HASH_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HASH_KEY:
        setHashKey(HASH_KEY_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__BIT_FLAGS:
        setBit_flags(BIT_FLAGS_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME:
        setHasNestedTableName(HAS_NESTED_TABLE_NAME_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__NESTED_TABLE_NAME:
        setNestedTableName(NESTED_TABLE_NAME_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        setCustomName((CustomAttributes)null);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case FlatBuffersPackage.ATTRIBUTE_NAME__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
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
      case FlatBuffersPackage.ATTRIBUTE_NAME__DEPRECTATED:
        return deprectated != DEPRECTATED_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ATTRIBUTE_ID:
        return hasAttributeId != HAS_ATTRIBUTE_ID_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ATTRIBUTE_ID:
        return attributeId != ATTRIBUTE_ID_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__REQUIRED:
        return required != REQUIRED_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ORIGINAL_ORDER:
        return original_order != ORIGINAL_ORDER_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_ALIGN_SIZE:
        return hasAlignSize != HAS_ALIGN_SIZE_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__ALIGN_SIZE:
        return alignSize != ALIGN_SIZE_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_HASH:
        return hasHash != HAS_HASH_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HASH_KEY:
        return HASH_KEY_EDEFAULT == null ? hashKey != null : !HASH_KEY_EDEFAULT.equals(hashKey);
      case FlatBuffersPackage.ATTRIBUTE_NAME__BIT_FLAGS:
        return bit_flags != BIT_FLAGS_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__HAS_NESTED_TABLE_NAME:
        return hasNestedTableName != HAS_NESTED_TABLE_NAME_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__NESTED_TABLE_NAME:
        return NESTED_TABLE_NAME_EDEFAULT == null ? nestedTableName != null : !NESTED_TABLE_NAME_EDEFAULT.equals(nestedTableName);
      case FlatBuffersPackage.ATTRIBUTE_NAME__KEY:
        return key != KEY_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__CUSTOM_NAME:
        return customName != null;
      case FlatBuffersPackage.ATTRIBUTE_NAME__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case FlatBuffersPackage.ATTRIBUTE_NAME__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
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
    result.append(" (deprectated: ");
    result.append(deprectated);
    result.append(", hasAttributeId: ");
    result.append(hasAttributeId);
    result.append(", attributeId: ");
    result.append(attributeId);
    result.append(", required: ");
    result.append(required);
    result.append(", original_order: ");
    result.append(original_order);
    result.append(", hasAlignSize: ");
    result.append(hasAlignSize);
    result.append(", alignSize: ");
    result.append(alignSize);
    result.append(", hasHash: ");
    result.append(hasHash);
    result.append(", hashKey: ");
    result.append(hashKey);
    result.append(", bit_flags: ");
    result.append(bit_flags);
    result.append(", hasNestedTableName: ");
    result.append(hasNestedTableName);
    result.append(", nestedTableName: ");
    result.append(nestedTableName);
    result.append(", key: ");
    result.append(key);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", stringValue: ");
    result.append(stringValue);
    result.append(')');
    return result.toString();
  }

} //AttributeNameImpl
