/**
 */
package com.mimacom.ddd.pub.proto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getSegments <em>Segments</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.PublicationClass#getDivisions <em>Divisions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass()
 * @model
 * @generated
 */
public interface PublicationClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.proto.PublicationNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.PublicationNature
	 * @see #setNature(PublicationNature)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Nature()
	 * @model unique="false"
	 * @generated
	 */
	PublicationNature getNature();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.PublicationClass#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.PublicationNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(PublicationNature value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Segments()
	 * @see com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ProtoDocumentSegment> getSegments();

	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.proto.ProtoDivision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getPublicationClass_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtoDivision> getDivisions();

} // PublicationClass
