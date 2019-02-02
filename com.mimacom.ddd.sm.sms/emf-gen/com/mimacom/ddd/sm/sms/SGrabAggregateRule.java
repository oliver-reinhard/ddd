/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms;

import com.mimacom.ddd.dm.base.DAggregate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGrab Aggregate Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sms.SGrabAggregateRule#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSGrabAggregateRule()
 * @model
 * @generated
 */
public interface SGrabAggregateRule extends SDeductionRule
{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DAggregate)
	 * @see com.mimacom.ddd.sm.sms.SmsPackage#getSGrabAggregateRule_Source()
	 * @model
	 * @generated
	 */
	DAggregate getSource();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sms.SGrabAggregateRule#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DAggregate value);

} // SGrabAggregateRule
