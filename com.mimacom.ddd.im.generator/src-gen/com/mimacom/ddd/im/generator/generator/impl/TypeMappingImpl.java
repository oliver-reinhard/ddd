/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator.impl;

import com.mimacom.ddd.dm.base.DType;

import com.mimacom.ddd.im.generator.generator.GeneratorPackage;
import com.mimacom.ddd.im.generator.generator.TypeMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.TypeMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.TypeMappingImpl#getJavaType <em>Java Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMappingImpl extends MinimalEObjectImpl.Container implements TypeMapping
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected DType name;

  /**
   * The cached value of the '{@link #getJavaType() <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaType()
   * @generated
   * @ordered
   */
  protected JvmType javaType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeMappingImpl()
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
    return GeneratorPackage.Literals.TYPE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DType getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (DType)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.TYPE_MAPPING__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DType basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(DType newName)
  {
    DType oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TYPE_MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getJavaType()
  {
    if (javaType != null && javaType.eIsProxy())
    {
      InternalEObject oldJavaType = (InternalEObject)javaType;
      javaType = (JvmType)eResolveProxy(oldJavaType);
      if (javaType != oldJavaType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.TYPE_MAPPING__JAVA_TYPE, oldJavaType, javaType));
      }
    }
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetJavaType()
  {
    return javaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaType(JvmType newJavaType)
  {
    JvmType oldJavaType = javaType;
    javaType = newJavaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.TYPE_MAPPING__JAVA_TYPE, oldJavaType, javaType));
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
      case GeneratorPackage.TYPE_MAPPING__NAME:
        if (resolve) return getName();
        return basicGetName();
      case GeneratorPackage.TYPE_MAPPING__JAVA_TYPE:
        if (resolve) return getJavaType();
        return basicGetJavaType();
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
      case GeneratorPackage.TYPE_MAPPING__NAME:
        setName((DType)newValue);
        return;
      case GeneratorPackage.TYPE_MAPPING__JAVA_TYPE:
        setJavaType((JvmType)newValue);
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
      case GeneratorPackage.TYPE_MAPPING__NAME:
        setName((DType)null);
        return;
      case GeneratorPackage.TYPE_MAPPING__JAVA_TYPE:
        setJavaType((JvmType)null);
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
      case GeneratorPackage.TYPE_MAPPING__NAME:
        return name != null;
      case GeneratorPackage.TYPE_MAPPING__JAVA_TYPE:
        return javaType != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeMappingImpl
