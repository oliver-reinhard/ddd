/**
 */
package com.mimacom.ddd.pub.proto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDocumentSegment()
 * @model abstract="true"
 * @generated
 */
public interface ProtoDocumentSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDocumentSegment_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDocumentSegment_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDocumentSegment_Optional()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.proto.PublicationClass#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(PublicationClass)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDocumentSegment_Parent()
	 * @see com.mimacom.ddd.pub.proto.PublicationClass#getSegments
	 * @model opposite="segments" transient="false"
	 * @generated
	 */
	PublicationClass getParent();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoDocumentSegment#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(PublicationClass value);

} // ProtoDocumentSegment
