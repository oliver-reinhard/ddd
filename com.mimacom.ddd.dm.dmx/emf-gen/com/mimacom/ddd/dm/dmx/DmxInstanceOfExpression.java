/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxInstanceOfExpression()
 * @model
 * @generated
 */
public interface DmxInstanceOfExpression extends DExpression
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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxInstanceOfExpression_Expression()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getExpression();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(DExpression value);

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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxInstanceOfExpression_Type()
	 * @model
	 * @generated
	 */
	DType getType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DType value);

} // DmxInstanceOfExpression
