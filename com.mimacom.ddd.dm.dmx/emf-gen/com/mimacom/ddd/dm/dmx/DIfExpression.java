/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIf Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DIfExpression#getIf <em>If</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DIfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DIfExpression#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDIfExpression()
 * @model
 * @generated
 */
public interface DIfExpression extends DExpression
{
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDIfExpression_If()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getIf();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(DExpression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDIfExpression_Then()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getThen();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(DExpression value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDIfExpression_Else()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getElse();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(DExpression value);

} // DIfExpression
