/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DReturn Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DReturnExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDReturnExpression()
 * @model
 * @generated
 */
public interface DReturnExpression extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDReturnExpression_Expression()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getExpression();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DReturnExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(DExpression value);

} // DReturnExpression
