/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeInclude#getInclude <em>Include</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeInclude#getRootElement <em>Root Element</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeInclude()
 * @model
 * @generated
 */
public interface CodeInclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference.
	 * @see #setInclude(CodeProvider)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeInclude_Include()
	 * @model
	 * @generated
	 */
	CodeProvider getInclude();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.CodeInclude#getInclude <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(CodeProvider value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' attribute.
	 * @see #setRootElement(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeInclude_RootElement()
	 * @model unique="false"
	 * @generated
	 */
	String getRootElement();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.CodeInclude#getRootElement <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' attribute.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(String value);

} // CodeInclude
