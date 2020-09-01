/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDeduction Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.IDeductionDefinition#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.IDeductionDefinition#getImpliedDeductions <em>Implied Deductions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeductionDefinition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDeductionDefinition extends EObject
{
	/**
	 * Returns the value of the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Rule</em>' containment reference.
	 * @see #setDeductionRule(DDeductionRule)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeductionDefinition_DeductionRule()
	 * @model containment="true"
	 * @generated
	 */
	DDeductionRule getDeductionRule();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.IDeductionDefinition#getDeductionRule <em>Deduction Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Rule</em>' containment reference.
	 * @see #getDeductionRule()
	 * @generated
	 */
	void setDeductionRule(DDeductionRule value);

	/**
	 * Returns the value of the '<em><b>Implied Deductions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DImplicitDeduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied Deductions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeductionDefinition_ImpliedDeductions()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<DImplicitDeduction> getImpliedDeductions();

} // IDeductionDefinition
