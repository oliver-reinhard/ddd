/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.pub.proto.PublicationClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Document#getPublicationClass <em>Publication Class</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument()
 * @model abstract="true"
 * @generated
 */
public interface Document extends ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Publication Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Class</em>' reference.
	 * @see #setPublicationClass(PublicationClass)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocument_PublicationClass()
	 * @model
	 * @generated
	 */
	PublicationClass getPublicationClass();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Document#getPublicationClass <em>Publication Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Class</em>' reference.
	 * @see #getPublicationClass()
	 * @generated
	 */
	void setPublicationClass(PublicationClass value);

} // Document
