/**
 */
package com.mimacom.ddd.sm.sim;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSCondition()
 * @model
 * @generated
 */
public interface SCondition extends SNamedElement
{
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(SExpression)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSCondition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	SExpression getCondition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SCondition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(SExpression value);

} // SCondition
