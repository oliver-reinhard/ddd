/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.Model#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.Model#getTypeMappings <em>Type Mappings</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.Model#getExceptionMappings <em>Exception Mappings</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getModel_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.Model#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Type Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.mimacom.ddd.im.generator.generator.TypeMapping}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Mappings</em>' containment reference list.
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getModel_TypeMappings()
   * @model containment="true"
   * @generated
   */
  EList<TypeMapping> getTypeMappings();

  /**
   * Returns the value of the '<em><b>Exception Mappings</b></em>' containment reference list.
   * The list contents are of type {@link com.mimacom.ddd.im.generator.generator.ExceptionMapping}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception Mappings</em>' containment reference list.
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getModel_ExceptionMappings()
   * @model containment="true"
   * @generated
   */
  EList<ExceptionMapping> getExceptionMappings();

} // Model
