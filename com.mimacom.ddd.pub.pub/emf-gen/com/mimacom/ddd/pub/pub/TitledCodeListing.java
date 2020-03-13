/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Code Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledCodeListing#isNumbered <em>Numbered</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledCodeListing#getCodeLines <em>Code Lines</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledCodeListing#getInclude <em>Include</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledCodeListing()
 * @model
 * @generated
 */
public interface TitledCodeListing extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>Numbered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbered</em>' attribute.
	 * @see #setNumbered(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledCodeListing_Numbered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNumbered();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledCodeListing#isNumbered <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbered</em>' attribute.
	 * @see #isNumbered()
	 * @generated
	 */
	void setNumbered(boolean value);

	/**
	 * Returns the value of the '<em><b>Code Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Lines</em>' attribute list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledCodeListing_CodeLines()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCodeLines();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference.
	 * @see #setInclude(EObject)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledCodeListing_Include()
	 * @model
	 * @generated
	 */
	EObject getInclude();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledCodeListing#getInclude <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(EObject value);

} // TitledCodeListing
