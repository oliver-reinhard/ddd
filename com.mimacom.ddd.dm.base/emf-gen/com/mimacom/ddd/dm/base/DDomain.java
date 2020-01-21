/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDomain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getEvents <em>Events</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain()
 * @model
 * @generated
 */
public interface DDomain extends DNamespace, IAggregateContainer, ITypeContainer, IStaticReferenceTarget, IDeducibleElement
{
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DDomainEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<DDomainEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DActor> getActors();

} // DDomain
