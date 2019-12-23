/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getCallArguments <em>Call Arguments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionCall()
 * @model
 * @generated
 */
public interface DmxFunctionCall extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(DmxFilter)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionCall_Function()
	 * @model
	 * @generated
	 */
	DmxFilter getFunction();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(DmxFilter value);

	/**
	 * Returns the value of the '<em><b>Call Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Arguments</em>' containment reference.
	 * @see #setCallArguments(DmxCallArguments)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionCall_CallArguments()
	 * @model containment="true"
	 * @generated
	 */
	DmxCallArguments getCallArguments();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall#getCallArguments <em>Call Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Arguments</em>' containment reference.
	 * @see #getCallArguments()
	 * @generated
	 */
	void setCallArguments(DmxCallArguments value);

} // DmxFunctionCall
