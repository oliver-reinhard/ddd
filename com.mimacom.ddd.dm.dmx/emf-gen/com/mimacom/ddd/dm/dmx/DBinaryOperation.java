/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBinary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDBinaryOperation()
 * @model
 * @generated
 */
public interface DBinaryOperation extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' containment reference.
	 * @see #setLeftOperand(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDBinaryOperation_LeftOperand()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getLeftOperand();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getLeftOperand <em>Left Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' containment reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(DExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DBinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
	 * @see #setOperator(DBinaryOperator)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDBinaryOperation_Operator()
	 * @model
	 * @generated
	 */
	DBinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(DBinaryOperator value);

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' containment reference.
	 * @see #setRightOperand(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDBinaryOperation_RightOperand()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getRightOperand();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getRightOperand <em>Right Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' containment reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(DExpression value);

} // DBinaryOperation
