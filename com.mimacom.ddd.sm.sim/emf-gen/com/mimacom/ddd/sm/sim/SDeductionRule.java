/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DNamedElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SDeduction Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SDeductionRule#getSource <em>Source</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SDeductionRule#getNamedSource <em>Named Source</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeductionRule()
 * @model abstract="true"
 * @generated
 */
public interface SDeductionRule extends EObject
{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeductionRule_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SDeductionRule#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Source</em>' reference.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSDeductionRule_NamedSource()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	DNamedElement getNamedSource();

} // SDeductionRule
