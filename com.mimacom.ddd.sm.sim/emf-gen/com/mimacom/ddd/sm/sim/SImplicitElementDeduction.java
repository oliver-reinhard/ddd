/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.IDeductionDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SImplicit Element Deduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SImplicitElementDeduction#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSImplicitElementDeduction()
 * @model
 * @generated
 */
public interface SImplicitElementDeduction extends IDeductionDefinition
{
	/**
	 * Returns the value of the '<em><b>Original Deduction Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Deduction Definition</em>' reference.
	 * @see #setOriginalDeductionDefinition(IDeductionDefinition)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSImplicitElementDeduction_OriginalDeductionDefinition()
	 * @model transient="true"
	 * @generated
	 */
	IDeductionDefinition getOriginalDeductionDefinition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SImplicitElementDeduction#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Deduction Definition</em>' reference.
	 * @see #getOriginalDeductionDefinition()
	 * @generated
	 */
	void setOriginalDeductionDefinition(IDeductionDefinition value);

} // SImplicitElementDeduction
