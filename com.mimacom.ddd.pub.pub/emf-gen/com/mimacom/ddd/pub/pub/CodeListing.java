/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeListing#getFormat <em>Format</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeListing#getCodeLines <em>Code Lines</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeListing()
 * @model
 * @generated
 */
public interface CodeListing extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.CodeLanguage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.CodeLanguage
	 * @see #setFormat(CodeLanguage)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeListing_Format()
	 * @model unique="false"
	 * @generated
	 */
	CodeLanguage getFormat();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.CodeListing#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.CodeLanguage
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(CodeLanguage value);

	/**
	 * Returns the value of the '<em><b>Code Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Lines</em>' attribute list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeListing_CodeLines()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCodeLines();

} // CodeListing
