/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator.impl;

import com.mimacom.ddd.im.generator.generator.ExceptionMapping;
import com.mimacom.ddd.im.generator.generator.GeneratorPackage;

import com.mimacom.ddd.sm.asm.SException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionMappingImpl extends MinimalEObjectImpl.Container implements ExceptionMapping
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected SException name;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected JvmType extends_;

  /**
   * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected static final String MESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected String message = MESSAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected String package_ = PACKAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExceptionMappingImpl()
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
    return GeneratorPackage.Literals.EXCEPTION_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SException getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (SException)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.EXCEPTION_MAPPING__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SException basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(SException newName)
  {
    SException oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXCEPTION_MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JvmType getExtends()
  {
    if (extends_ != null && extends_.eIsProxy())
    {
      InternalEObject oldExtends = (InternalEObject)extends_;
      extends_ = (JvmType)eResolveProxy(oldExtends);
      if (extends_ != oldExtends)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.EXCEPTION_MAPPING__EXTENDS, oldExtends, extends_));
      }
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtends(JvmType newExtends)
  {
    JvmType oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXCEPTION_MAPPING__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMessage(String newMessage)
  {
    String oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXCEPTION_MAPPING__MESSAGE, oldMessage, message));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPackage(String newPackage)
  {
    String oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXCEPTION_MAPPING__PACKAGE, oldPackage, package_));
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
      case GeneratorPackage.EXCEPTION_MAPPING__NAME:
        if (resolve) return getName();
        return basicGetName();
      case GeneratorPackage.EXCEPTION_MAPPING__EXTENDS:
        if (resolve) return getExtends();
        return basicGetExtends();
      case GeneratorPackage.EXCEPTION_MAPPING__MESSAGE:
        return getMessage();
      case GeneratorPackage.EXCEPTION_MAPPING__PACKAGE:
        return getPackage();
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
      case GeneratorPackage.EXCEPTION_MAPPING__NAME:
        setName((SException)newValue);
        return;
      case GeneratorPackage.EXCEPTION_MAPPING__EXTENDS:
        setExtends((JvmType)newValue);
        return;
      case GeneratorPackage.EXCEPTION_MAPPING__MESSAGE:
        setMessage((String)newValue);
        return;
      case GeneratorPackage.EXCEPTION_MAPPING__PACKAGE:
        setPackage((String)newValue);
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
      case GeneratorPackage.EXCEPTION_MAPPING__NAME:
        setName((SException)null);
        return;
      case GeneratorPackage.EXCEPTION_MAPPING__EXTENDS:
        setExtends((JvmType)null);
        return;
      case GeneratorPackage.EXCEPTION_MAPPING__MESSAGE:
        setMessage(MESSAGE_EDEFAULT);
        return;
      case GeneratorPackage.EXCEPTION_MAPPING__PACKAGE:
        setPackage(PACKAGE_EDEFAULT);
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
      case GeneratorPackage.EXCEPTION_MAPPING__NAME:
        return name != null;
      case GeneratorPackage.EXCEPTION_MAPPING__EXTENDS:
        return extends_ != null;
      case GeneratorPackage.EXCEPTION_MAPPING__MESSAGE:
        return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
      case GeneratorPackage.EXCEPTION_MAPPING__PACKAGE:
        return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (message: ");
    result.append(message);
    result.append(", package: ");
    result.append(package_);
    result.append(')');
    return result.toString();
  }

} //ExceptionMappingImpl