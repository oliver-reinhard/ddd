/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxUnaryOperation()
 * @model
 * @generated
 */
public interface DmxUnaryOperation extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxUnaryOperation_Operand()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getOperand();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(DExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxUnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperator
	 * @see #setOperator(DmxUnaryOperator)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxUnaryOperation_Operator()
	 * @model
	 * @generated
	 */
	DmxUnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(DmxUnaryOperator value);

} // DmxUnaryOperation
