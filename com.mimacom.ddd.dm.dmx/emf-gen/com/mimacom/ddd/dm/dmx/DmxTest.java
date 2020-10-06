/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxTest#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxTest#getContext <em>Context</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxTest#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxTest()
 * @model
 * @generated
 */
public interface DmxTest extends INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxTest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxTest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dmx.DmxTestContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxTest_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmxTestContext> getContext();

	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxTest_Expr()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getExpr();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxTest#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(DExpression value);

} // DmxTest
