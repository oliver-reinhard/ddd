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
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getApplications <em>Applications</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getEvents <em>Events</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomain#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain()
 * @model
 * @generated
 */
public interface DDomain extends DNamedElement, INamespace, IPrimaryNavigationTarget
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DImport> getImports();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DType> getTypes();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFunction> getFunctions();

	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DAggregate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Aggregates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAggregate> getAggregates();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExistingApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomain_Applications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExistingApplication> getApplications();

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
