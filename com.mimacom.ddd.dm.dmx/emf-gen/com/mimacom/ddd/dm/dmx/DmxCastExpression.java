/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxCastExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxCastExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxCastExpression()
 * @model
 * @generated
 */
public interface DmxCastExpression extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxCastExpression_Target()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getTarget();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxCastExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DExpression value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxCastExpression_Type()
	 * @model
	 * @generated
	 */
	DType getType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxCastExpression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DType value);

} // DmxCastExpression
