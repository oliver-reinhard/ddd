/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliography Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getAuthors <em>Authors</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getDate <em>Date</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry()
 * @model
 * @generated
 */
public interface BibliographyEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' attribute.
	 * @see #setAuthors(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry_Authors()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthors();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getAuthors <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' attribute.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' attribute.
	 * @see #setPublisher(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry_Publisher()
	 * @model unique="false"
	 * @generated
	 */
	String getPublisher();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getPublisher <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' attribute.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry_Date()
	 * @model unique="false"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getBibliographyEntry_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.BibliographyEntry#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // BibliographyEntry
