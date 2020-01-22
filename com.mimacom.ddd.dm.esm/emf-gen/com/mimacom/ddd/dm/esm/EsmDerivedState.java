/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.esm.EsmDerivedState#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.esm.EsmPackage#getEsmDerivedState()
 * @model
 * @generated
 */
public interface EsmDerivedState extends EsmState
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(DExpression)
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#getEsmDerivedState_Expression()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getExpression();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.esm.EsmDerivedState#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(DExpression value);

} // EsmDerivedState
