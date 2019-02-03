/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SNamed Element Deduction Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SNamedElementDeductionRule#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSNamedElementDeductionRule()
 * @model abstract="true"
 * @generated
 */
public interface SNamedElementDeductionRule extends SDeductionRule
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
	 * @see #setSource(DNamedElement)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSNamedElementDeductionRule_Source()
	 * @model
	 * @generated
	 */
	DNamedElement getSource();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SNamedElementDeductionRule#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DNamedElement value);

} // SNamedElementDeductionRule