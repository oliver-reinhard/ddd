/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxBooleanLiteral#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxBooleanLiteral()
 * @model
 * @generated
 */
public interface DmxBooleanLiteral extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxBooleanLiteral_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxBooleanLiteral#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // DmxBooleanLiteral
