/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxForLoopExpression()
 * @model
 * @generated
 */
public interface DmxForLoopExpression extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Declared Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared Param</em>' attribute.
	 * @see #setDeclaredParam(String)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxForLoopExpression_DeclaredParam()
	 * @model
	 * @generated
	 */
	String getDeclaredParam();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getDeclaredParam <em>Declared Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared Param</em>' attribute.
	 * @see #getDeclaredParam()
	 * @generated
	 */
	void setDeclaredParam(String value);

	/**
	 * Returns the value of the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Expression</em>' containment reference.
	 * @see #setForExpression(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxForLoopExpression_ForExpression()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getForExpression();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getForExpression <em>For Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Expression</em>' containment reference.
	 * @see #getForExpression()
	 * @generated
	 */
	void setForExpression(DExpression value);

	/**
	 * Returns the value of the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Each Expression</em>' containment reference.
	 * @see #setEachExpression(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxForLoopExpression_EachExpression()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getEachExpression();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxForLoopExpression#getEachExpression <em>Each Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Each Expression</em>' containment reference.
	 * @see #getEachExpression()
	 * @generated
	 */
	void setEachExpression(DExpression value);

} // DmxForLoopExpression
