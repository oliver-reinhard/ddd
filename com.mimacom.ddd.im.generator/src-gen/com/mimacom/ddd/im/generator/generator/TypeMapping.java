/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator;

import com.mimacom.ddd.dm.base.base.DType;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getJavaType <em>Java Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getTypeMapping()
 * @model
 * @generated
 */
public interface TypeMapping extends EObject
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
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getTypeMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DType)
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getTypeMapping_Type()
   * @model
   * @generated
   */
  DType getType();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DType value);

  /**
   * Returns the value of the '<em><b>Java Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Type</em>' reference.
   * @see #setJavaType(JvmType)
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getTypeMapping_JavaType()
   * @model
   * @generated
   */
  JvmType getJavaType();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getJavaType <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Type</em>' reference.
   * @see #getJavaType()
   * @generated
   */
  void setJavaType(JvmType value);

} // TypeMapping
