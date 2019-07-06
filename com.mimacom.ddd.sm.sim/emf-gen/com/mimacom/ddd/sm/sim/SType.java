/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSType()
 * @model
 * @generated
 */
public interface SType extends SNamedDeducibleElement
{
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSType_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<SCondition> getConstraints();

} // SType
