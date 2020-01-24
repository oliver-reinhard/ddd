/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMorph Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SMorphRule#getRetypeTo <em>Retype To</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SMorphRule#getRemultiplyTo <em>Remultiply To</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSMorphRule()
 * @model
 * @generated
 */
public interface SMorphRule extends SStructureChangingRule
{
	/**
	 * Returns the value of the '<em><b>Retype To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retype To</em>' reference.
	 * @see #setRetypeTo(DType)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSMorphRule_RetypeTo()
	 * @model
	 * @generated
	 */
	DType getRetypeTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SMorphRule#getRetypeTo <em>Retype To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retype To</em>' reference.
	 * @see #getRetypeTo()
	 * @generated
	 */
	void setRetypeTo(DType value);

	/**
	 * Returns the value of the '<em><b>Remultiply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remultiply To</em>' containment reference.
	 * @see #setRemultiplyTo(DMultiplicity)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSMorphRule_RemultiplyTo()
	 * @model containment="true"
	 * @generated
	 */
	DMultiplicity getRemultiplyTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SMorphRule#getRemultiplyTo <em>Remultiply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remultiply To</em>' containment reference.
	 * @see #getRemultiplyTo()
	 * @generated
	 */
	void setRemultiplyTo(DMultiplicity value);

} // SMorphRule
