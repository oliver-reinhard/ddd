/**
 */
package com.mimacom.ddd.pub.proto;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowParts <em>Allow Parts</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowAppendix <em>Allow Appendix</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoPublicationBody()
 * @model
 * @generated
 */
public interface ProtoPublicationBody extends ProtoDocumentSegment {
	/**
	 * Returns the value of the '<em><b>Allow Parts</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Parts</em>' attribute.
	 * @see #setAllowParts(boolean)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoPublicationBody_AllowParts()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAllowParts();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowParts <em>Allow Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Parts</em>' attribute.
	 * @see #isAllowParts()
	 * @generated
	 */
	void setAllowParts(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Appendix</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Appendix</em>' attribute.
	 * @see #setAllowAppendix(boolean)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoPublicationBody_AllowAppendix()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAllowAppendix();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoPublicationBody#isAllowAppendix <em>Allow Appendix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Appendix</em>' attribute.
	 * @see #isAllowAppendix()
	 * @generated
	 */
	void setAllowAppendix(boolean value);

} // ProtoPublicationBody
