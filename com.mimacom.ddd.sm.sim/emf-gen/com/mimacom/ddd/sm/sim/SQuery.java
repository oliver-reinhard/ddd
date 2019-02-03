/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQuery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SQuery#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSQuery()
 * @model
 * @generated
 */
public interface SQuery extends SFeature
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.sim.SQueryParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSQuery_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQueryParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' containment reference.
	 * @see #setReturns(SExpression)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSQuery_Returns()
	 * @model containment="true"
	 * @generated
	 */
	SExpression getReturns();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SQuery#getReturns <em>Returns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' containment reference.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(SExpression value);

} // SQuery