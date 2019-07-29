/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPredicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DPredicate#getVar <em>Var</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DPredicate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDPredicate()
 * @model
 * @generated
 */
public interface DPredicate extends DExpression, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(DContext)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDPredicate_Var()
	 * @model containment="true"
	 * @generated
	 */
	DContext getVar();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DPredicate#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(DContext value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDPredicate_Value()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getValue();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DPredicate#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DExpression value);

} // DPredicate
