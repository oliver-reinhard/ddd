/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim;


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
public interface SMorphRule extends SGrabRule
{
	/**
	 * Returns the value of the '<em><b>Retype To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retype To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retype To</em>' reference.
	 * @see #setRetypeTo(SType)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSMorphRule_RetypeTo()
	 * @model
	 * @generated
	 */
	SType getRetypeTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SMorphRule#getRetypeTo <em>Retype To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retype To</em>' reference.
	 * @see #getRetypeTo()
	 * @generated
	 */
	void setRetypeTo(SType value);

	/**
	 * Returns the value of the '<em><b>Remultiply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remultiply To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remultiply To</em>' containment reference.
	 * @see #setRemultiplyTo(SMultiplicity)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSMorphRule_RemultiplyTo()
	 * @model containment="true"
	 * @generated
	 */
	SMultiplicity getRemultiplyTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SMorphRule#getRemultiplyTo <em>Remultiply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remultiply To</em>' containment reference.
	 * @see #getRemultiplyTo()
	 * @generated
	 */
	void setRemultiplyTo(SMultiplicity value);

} // SMorphRule