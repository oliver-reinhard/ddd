/**
 */
package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.DAggregate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGrab Aggregate Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTGrabAggregateRule()
 * @model
 * @generated
 */
public interface TGrabAggregateRule extends TRenameRule
{
	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference.
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTGrabAggregateRule_Aggregate()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	DAggregate getAggregate();

} // TGrabAggregateRule
