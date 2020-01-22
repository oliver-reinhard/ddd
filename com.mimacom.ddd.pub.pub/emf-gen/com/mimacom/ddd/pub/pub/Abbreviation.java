/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Abbreviation#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Abbreviation#getLongForm <em>Long Form</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbbreviation()
 * @model
 * @generated
 */
public interface Abbreviation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbbreviation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Abbreviation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Long Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Form</em>' attribute.
	 * @see #setLongForm(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbbreviation_LongForm()
	 * @model unique="false"
	 * @generated
	 */
	String getLongForm();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Abbreviation#getLongForm <em>Long Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Form</em>' attribute.
	 * @see #getLongForm()
	 * @generated
	 */
	void setLongForm(String value);

} // Abbreviation
