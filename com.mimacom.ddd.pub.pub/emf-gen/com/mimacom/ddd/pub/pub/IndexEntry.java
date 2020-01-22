/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.IndexEntry#getText <em>Text</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.IndexEntry#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getIndexEntry()
 * @model
 * @generated
 */
public interface IndexEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getIndexEntry_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.IndexEntry#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getIndexEntry_References()
	 * @model
	 * @generated
	 */
	EList<Division> getReferences();

} // IndexEntry
