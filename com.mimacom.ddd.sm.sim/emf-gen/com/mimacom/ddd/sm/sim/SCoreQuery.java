/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCore Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SCoreQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.SCoreQuery#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSCoreQuery()
 * @model
 * @generated
 */
public interface SCoreQuery extends DNavigableMember, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DQueryParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSCoreQuery_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DQueryParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' containment reference.
	 * @see #setReturns(DExpression)
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSCoreQuery_Returns()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getReturns();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sim.SCoreQuery#getReturns <em>Returns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' containment reference.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(DExpression value);

} // SCoreQuery
