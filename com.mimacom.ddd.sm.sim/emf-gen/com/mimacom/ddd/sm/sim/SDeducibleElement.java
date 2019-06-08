/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDeducible Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SDeducibleElement#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SDeducibleElement#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SDeducibleElement#isSynthetic <em>Synthetic</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeducibleElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SDeducibleElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Deduction Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Rule</em>' containment reference.
	 * @see #setDeductionRule(SDeductionRule)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeducibleElement_DeductionRule()
	 * @model containment="true"
	 * @generated
	 */
	SDeductionRule getDeductionRule();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SDeducibleElement#getDeductionRule <em>Deduction Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Rule</em>' containment reference.
	 * @see #getDeductionRule()
	 * @generated
	 */
	void setDeductionRule(SDeductionRule value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.SElementNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SElementNature
	 * @see #setNature(SElementNature)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeducibleElement_Nature()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	SElementNature getNature();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SDeducibleElement#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SElementNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(SElementNature value);

	/**
	 * Returns the value of the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic</em>' attribute.
	 * @see #setSynthetic(boolean)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeducibleElement_Synthetic()
	 * @model transient="true"
	 * @generated
	 */
	boolean isSynthetic();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SDeducibleElement#isSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic</em>' attribute.
	 * @see #isSynthetic()
	 * @generated
	 */
	void setSynthetic(boolean value);

} // SDeducibleElement
