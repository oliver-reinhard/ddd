/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DNamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SFuse Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SFuseRule#getOtherSources <em>Other Sources</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SFuseRule#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSFuseRule()
 * @model
 * @generated
 */
public interface SFuseRule extends SGrabRule
{
	/**
	 * Returns the value of the '<em><b>Other Sources</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Sources</em>' reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSFuseRule_OtherSources()
	 * @model
	 * @generated
	 */
	EList<DNamedElement> getOtherSources();

	/**
	 * Returns the value of the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend From</em>' reference.
	 * @see #setExtendFrom(SType)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSFuseRule_ExtendFrom()
	 * @model
	 * @generated
	 */
	SType getExtendFrom();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SFuseRule#getExtendFrom <em>Extend From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend From</em>' reference.
	 * @see #getExtendFrom()
	 * @generated
	 */
	void setExtendFrom(SType value);

} // SFuseRule
