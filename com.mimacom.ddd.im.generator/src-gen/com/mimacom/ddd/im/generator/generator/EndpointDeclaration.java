/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator;

import com.mimacom.ddd.sm.asm.AsmServiceOperation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getVerb <em>Verb</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getEndpointDeclaration()
 * @model
 * @generated
 */
public interface EndpointDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Verb</b></em>' attribute.
   * The literals are from the enumeration {@link com.mimacom.ddd.im.generator.generator.HttpVerb}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verb</em>' attribute.
   * @see com.mimacom.ddd.im.generator.generator.HttpVerb
   * @see #setVerb(HttpVerb)
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getEndpointDeclaration_Verb()
   * @model
   * @generated
   */
  HttpVerb getVerb();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getVerb <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verb</em>' attribute.
   * @see com.mimacom.ddd.im.generator.generator.HttpVerb
   * @see #getVerb()
   * @generated
   */
  void setVerb(HttpVerb value);

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
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getEndpointDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getName <em>Name</em>}' attribute.
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
   * @see #setType(AsmServiceOperation)
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getEndpointDeclaration_Type()
   * @model
   * @generated
   */
  AsmServiceOperation getType();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(AsmServiceOperation value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Path)
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#getEndpointDeclaration_Path()
   * @model containment="true"
   * @generated
   */
  Path getPath();

  /**
   * Sets the value of the '{@link com.mimacom.ddd.im.generator.generator.EndpointDeclaration#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Path value);

} // EndpointDeclaration
