/**
 */
package com.mimacom.ddd.sm.sim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPrimitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SPrimitive#getRedefines <em>Redefines</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SPrimitive#isArchetype <em>Archetype</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSPrimitive()
 * @model
 * @generated
 */
public interface SPrimitive extends SSimpleType
{
	/**
	 * Returns the value of the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefines</em>' reference.
	 * @see #setRedefines(SPrimitive)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSPrimitive_Redefines()
	 * @model
	 * @generated
	 */
	SPrimitive getRedefines();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SPrimitive#getRedefines <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefines</em>' reference.
	 * @see #getRedefines()
	 * @generated
	 */
	void setRedefines(SPrimitive value);

	/**
	 * Returns the value of the '<em><b>Archetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archetype</em>' attribute.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSPrimitive_Archetype()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isArchetype();

} // SPrimitive
