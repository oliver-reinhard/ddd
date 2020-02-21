/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator.impl;

import com.mimacom.ddd.im.generator.generator.ExceptionMapping;
import com.mimacom.ddd.im.generator.generator.GeneratorPackage;
import com.mimacom.ddd.im.generator.generator.Model;
import com.mimacom.ddd.im.generator.generator.TypeMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ModelImpl#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ModelImpl#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.impl.ModelImpl#getExceptionMappings <em>Exception Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getImportSection() <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportSection()
   * @generated
   * @ordered
   */
  protected XImportSection importSection;

  /**
   * The cached value of the '{@link #getTypeMappings() <em>Type Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeMappings()
   * @generated
   * @ordered
   */
  protected EList<TypeMapping> typeMappings;

  /**
   * The cached value of the '{@link #getExceptionMappings() <em>Exception Mappings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceptionMappings()
   * @generated
   * @ordered
   */
  protected EList<ExceptionMapping> exceptionMappings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return GeneratorPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XImportSection getImportSection()
  {
    return importSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportSection(XImportSection newImportSection, NotificationChain msgs)
  {
    XImportSection oldImportSection = importSection;
    importSection = newImportSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.MODEL__IMPORT_SECTION, oldImportSection, newImportSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImportSection(XImportSection newImportSection)
  {
    if (newImportSection != importSection)
    {
      NotificationChain msgs = null;
      if (importSection != null)
        msgs = ((InternalEObject)importSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.MODEL__IMPORT_SECTION, null, msgs);
      if (newImportSection != null)
        msgs = ((InternalEObject)newImportSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.MODEL__IMPORT_SECTION, null, msgs);
      msgs = basicSetImportSection(newImportSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MODEL__IMPORT_SECTION, newImportSection, newImportSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TypeMapping> getTypeMappings()
  {
    if (typeMappings == null)
    {
      typeMappings = new EObjectContainmentEList<TypeMapping>(TypeMapping.class, this, GeneratorPackage.MODEL__TYPE_MAPPINGS);
    }
    return typeMappings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExceptionMapping> getExceptionMappings()
  {
    if (exceptionMappings == null)
    {
      exceptionMappings = new EObjectContainmentEList<ExceptionMapping>(ExceptionMapping.class, this, GeneratorPackage.MODEL__EXCEPTION_MAPPINGS);
    }
    return exceptionMappings;
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
      case GeneratorPackage.MODEL__IMPORT_SECTION:
        return basicSetImportSection(null, msgs);
      case GeneratorPackage.MODEL__TYPE_MAPPINGS:
        return ((InternalEList<?>)getTypeMappings()).basicRemove(otherEnd, msgs);
      case GeneratorPackage.MODEL__EXCEPTION_MAPPINGS:
        return ((InternalEList<?>)getExceptionMappings()).basicRemove(otherEnd, msgs);
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
      case GeneratorPackage.MODEL__IMPORT_SECTION:
        return getImportSection();
      case GeneratorPackage.MODEL__TYPE_MAPPINGS:
        return getTypeMappings();
      case GeneratorPackage.MODEL__EXCEPTION_MAPPINGS:
        return getExceptionMappings();
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
      case GeneratorPackage.MODEL__IMPORT_SECTION:
        setImportSection((XImportSection)newValue);
        return;
      case GeneratorPackage.MODEL__TYPE_MAPPINGS:
        getTypeMappings().clear();
        getTypeMappings().addAll((Collection<? extends TypeMapping>)newValue);
        return;
      case GeneratorPackage.MODEL__EXCEPTION_MAPPINGS:
        getExceptionMappings().clear();
        getExceptionMappings().addAll((Collection<? extends ExceptionMapping>)newValue);
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
      case GeneratorPackage.MODEL__IMPORT_SECTION:
        setImportSection((XImportSection)null);
        return;
      case GeneratorPackage.MODEL__TYPE_MAPPINGS:
        getTypeMappings().clear();
        return;
      case GeneratorPackage.MODEL__EXCEPTION_MAPPINGS:
        getExceptionMappings().clear();
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
      case GeneratorPackage.MODEL__IMPORT_SECTION:
        return importSection != null;
      case GeneratorPackage.MODEL__TYPE_MAPPINGS:
        return typeMappings != null && !typeMappings.isEmpty();
      case GeneratorPackage.MODEL__EXCEPTION_MAPPINGS:
        return exceptionMappings != null && !exceptionMappings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
