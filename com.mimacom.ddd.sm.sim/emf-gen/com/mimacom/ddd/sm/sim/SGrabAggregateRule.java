/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DDeductionRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGrab Aggregate Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.SGrabAggregateRule#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSGrabAggregateRule()
 * @model
 * @generated
 */
public interface SGrabAggregateRule extends DDeductionRule
{
	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference.
	 * @see com.mimacom.ddd.sm.sim.SimPackage#getSGrabAggregateRule_Aggregate()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DAggregate getAggregate();

} // SGrabAggregateRule
