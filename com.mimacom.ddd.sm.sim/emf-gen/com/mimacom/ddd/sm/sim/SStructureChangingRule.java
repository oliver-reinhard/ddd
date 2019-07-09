/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SStructure Changing Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSStructureChangingRule()
 * @model abstract="true"
 * @generated
 */
public interface SStructureChangingRule extends SGrabRule
{
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.STristate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @see #setAbstract(STristate)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSStructureChangingRule_Abstract()
	 * @model
	 * @generated
	 */
	STristate getAbstract();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(STristate value);

	/**
	 * Returns the value of the '<em><b>Root Entity</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.sm.sim.STristate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Entity</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @see #setRootEntity(STristate)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSStructureChangingRule_RootEntity()
	 * @model
	 * @generated
	 */
	STristate getRootEntity();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getRootEntity <em>Root Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Entity</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.STristate
	 * @see #getRootEntity()
	 * @generated
	 */
	void setRootEntity(STristate value);

	/**
	 * Returns the value of the '<em><b>Extend From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend From</em>' reference.
	 * @see #setExtendFrom(DType)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSStructureChangingRule_ExtendFrom()
	 * @model
	 * @generated
	 */
	DType getExtendFrom();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule#getExtendFrom <em>Extend From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend From</em>' reference.
	 * @see #getExtendFrom()
	 * @generated
	 */
	void setExtendFrom(DType value);

} // SStructureChangingRule
