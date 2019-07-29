/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFunction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunctionCallArguments <em>Function Call Arguments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDFunctionCall()
 * @model
 * @generated
 */
public interface DFunctionCall extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(DmxFunction)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDFunctionCall_Function()
	 * @model
	 * @generated
	 */
	DmxFunction getFunction();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(DmxFunction value);

	/**
	 * Returns the value of the '<em><b>Function Call Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Call Arguments</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDFunctionCall_FunctionCallArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getFunctionCallArguments();

} // DFunctionCall
