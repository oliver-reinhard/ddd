/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms;

import com.mimacom.ddd.dm.base.DNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SFuse Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sms.SFuseRule#getSource2 <em>Source2</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sms.SFuseRule#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSFuseRule()
 * @model
 * @generated
 */
public interface SFuseRule extends SGrabRule
{
	/**
	 * Returns the value of the '<em><b>Source2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source2</em>' reference.
	 * @see #setSource2(DNamedElement)
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSFuseRule_Source2()
	 * @model
	 * @generated
	 */
	DNamedElement getSource2();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sms.SFuseRule#getSource2 <em>Source2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source2</em>' reference.
	 * @see #getSource2()
	 * @generated
	 */
	void setSource2(DNamedElement value);

	/**
	 * Returns the value of the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend From</em>' reference.
	 * @see #setExtendFrom(SType)
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSFuseRule_ExtendFrom()
	 * @model
	 * @generated
	 */
	SType getExtendFrom();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sms.SFuseRule#getExtendFrom <em>Extend From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend From</em>' reference.
	 * @see #getExtendFrom()
	 * @generated
	 */
	void setExtendFrom(SType value);

} // SFuseRule
