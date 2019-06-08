/**
 */
package com.mimacom.ddd.sm.sim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSynthetic Deduction Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SSyntheticDeductionRule#getElementWithRule <em>Element With Rule</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSSyntheticDeductionRule()
 * @model
 * @generated
 */
public interface SSyntheticDeductionRule extends SDeductionRule
{
	/**
	 * Returns the value of the '<em><b>Element With Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element With Rule</em>' reference.
	 * @see #setElementWithRule(SDeducibleElement)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSSyntheticDeductionRule_ElementWithRule()
	 * @model transient="true"
	 * @generated
	 */
	SDeducibleElement getElementWithRule();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SSyntheticDeductionRule#getElementWithRule <em>Element With Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element With Rule</em>' reference.
	 * @see #getElementWithRule()
	 * @generated
	 */
	void setElementWithRule(SDeducibleElement value);

} // SSyntheticDeductionRule
