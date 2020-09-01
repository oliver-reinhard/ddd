/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DImplicit Deduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DImplicitDeduction#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDImplicitDeduction()
 * @model
 * @generated
 */
public interface DImplicitDeduction extends IDeductionDefinition
{
	/**
	 * Returns the value of the '<em><b>Original Deduction Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Deduction Definition</em>' reference.
	 * @see #setOriginalDeductionDefinition(IDeductionDefinition)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDImplicitDeduction_OriginalDeductionDefinition()
	 * @model transient="true"
	 * @generated
	 */
	IDeductionDefinition getOriginalDeductionDefinition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DImplicitDeduction#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Deduction Definition</em>' reference.
	 * @see #getOriginalDeductionDefinition()
	 * @generated
	 */
	void setOriginalDeductionDefinition(IDeductionDefinition value);

} // DImplicitDeduction
