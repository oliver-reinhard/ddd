/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDeducible Member Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getSynthetic <em>Synthetic</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSDeducibleMemberElement()
 * @model
 * @generated
 */
public interface SDeducibleMemberElement extends SNamedElement
{
	/**
	 * Returns the value of the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deduction Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Rule</em>' containment reference.
	 * @see #setDeductionRule(SMemberDeductionRule)
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSDeducibleMemberElement_DeductionRule()
	 * @model containment="true"
	 * @generated
	 */
	SMemberDeductionRule getDeductionRule();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getDeductionRule <em>Deduction Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Rule</em>' containment reference.
	 * @see #getDeductionRule()
	 * @generated
	 */
	void setDeductionRule(SMemberDeductionRule value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sms.SElementNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.sm.sms.SElementNature
	 * @see #setNature(SElementNature)
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSDeducibleMemberElement_Nature()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	SElementNature getNature();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.sm.sms.SElementNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(SElementNature value);

	/**
	 * Returns the value of the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic</em>' attribute.
	 * @see #isSetSynthetic()
	 * @see #unsetSynthetic()
	 * @see #setSynthetic(Boolean)
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSDeducibleMemberElement_Synthetic()
	 * @model unsettable="true"
	 * @generated
	 */
	Boolean getSynthetic();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic</em>' attribute.
	 * @see #isSetSynthetic()
	 * @see #unsetSynthetic()
	 * @see #getSynthetic()
	 * @generated
	 */
	void setSynthetic(Boolean value);

	/**
	 * Unsets the value of the '{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSynthetic()
	 * @see #getSynthetic()
	 * @see #setSynthetic(Boolean)
	 * @generated
	 */
	void unsetSynthetic();

	/**
	 * Returns whether the value of the '{@link com.mimacom.ddd.sm.sms.SDeducibleMemberElement#getSynthetic <em>Synthetic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Synthetic</em>' attribute is set.
	 * @see #unsetSynthetic()
	 * @see #getSynthetic()
	 * @see #setSynthetic(Boolean)
	 * @generated
	 */
	boolean isSetSynthetic();

} // SDeducibleMemberElement