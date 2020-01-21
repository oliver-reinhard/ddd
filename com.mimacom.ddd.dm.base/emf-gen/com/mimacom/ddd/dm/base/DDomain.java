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
<<<<<<< Upstream, based on 31adbbe530a348e8e7950d43c70d55be3ba288b1
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DImport> getImports();

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
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Aggregates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAggregate> getAggregates();

	/**
=======
>>>>>>> 0d09db5 SIM: update to enhanced BASE model and semantics
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DDomainEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<DActor> getActors();

} // DDomain
