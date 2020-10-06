/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImplicit Transposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.TImplicitTransposition#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getTImplicitTransposition()
 * @model
 * @generated
 */
public interface TImplicitTransposition extends ITransposition
{
	/**
	 * Returns the value of the '<em><b>Original Deduction Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Deduction Definition</em>' reference.
	 * @see #setOriginalDeductionDefinition(ITransposition)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getTImplicitTransposition_OriginalDeductionDefinition()
	 * @model transient="true"
	 * @generated
	 */
	ITransposition getOriginalDeductionDefinition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.TImplicitTransposition#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Deduction Definition</em>' reference.
	 * @see #getOriginalDeductionDefinition()
	 * @generated
	 */
	void setOriginalDeductionDefinition(ITransposition value);

} // TImplicitTransposition
