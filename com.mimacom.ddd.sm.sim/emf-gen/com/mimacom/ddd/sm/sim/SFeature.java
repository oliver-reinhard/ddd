/**
 */
package com.mimacom.ddd.sm.sim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SFeature#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SFeature#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSFeature()
 * @model
 * @generated
 */
public interface SFeature extends SNamedDeducibleElement
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SType)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSFeature_Type()
	 * @model
	 * @generated
	 */
	SType getType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SFeature#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(SMultiplicity)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSFeature_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	SMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SFeature#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(SMultiplicity value);

} // SFeature
