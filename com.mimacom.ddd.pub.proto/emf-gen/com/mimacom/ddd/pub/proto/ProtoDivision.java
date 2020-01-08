/**
 */
package com.mimacom.ddd.pub.proto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoDivision#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.ProtoDivision#getNumberingStyle <em>Numbering Style</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDivision()
 * @model abstract="true"
 * @generated
 */
public interface ProtoDivision extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDivision_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Numbering Style</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbering Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
	 * @see #setNumberingStyle(ProtoSequenceNumberStyle)
	 * @see com.mimacom.ddd.pub.proto.ProtoPackage#getProtoDivision_NumberingStyle()
	 * @model unique="false"
	 * @generated
	 */
	ProtoSequenceNumberStyle getNumberingStyle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.proto.ProtoDivision#getNumberingStyle <em>Numbering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbering Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
	 * @see #getNumberingStyle()
	 * @generated
	 */
	void setNumberingStyle(ProtoSequenceNumberStyle value);

} // ProtoDivision
