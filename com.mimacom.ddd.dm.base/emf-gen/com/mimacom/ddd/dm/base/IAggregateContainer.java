/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAggregate Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.IAggregateContainer#getAggregates <em>Aggregates</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getIAggregateContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAggregateContainer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DAggregate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIAggregateContainer_Aggregates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAggregate> getAggregates();

} // IAggregateContainer
