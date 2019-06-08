/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SEnumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSEnumeration()
 * @model
 * @generated
 */
public interface SEnumeration extends SSimpleType
{
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSEnumeration_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<SLiteral> getLiterals();

} // SEnumeration
