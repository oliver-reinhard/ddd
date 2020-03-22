/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getContext <em>Context</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getPreconditionsCNF <em>Preconditions CNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getPostconditionsDNF <em>Postconditions DNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemDomainEvent#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemDomainEvent()
 * @model
 * @generated
 */
public interface DemDomainEvent extends DModel, INavigableMemberContainer, IStaticReferenceTarget, IDiagramRoot
{
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemDomainEvent_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DContext> getContext();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dem.DemActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemDomainEvent_Triggers()
	 * @model required="true"
	 * @generated
	 */
	EList<DemActor> getTriggers();

	/**
	 * Returns the value of the '<em><b>Preconditions CNF</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNamedPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions CNF</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemDomainEvent_PreconditionsCNF()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNamedPredicate> getPreconditionsCNF();

	/**
	 * Returns the value of the '<em><b>Postconditions DNF</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postconditions DNF</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemDomainEvent_PostconditionsDNF()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNamedElement> getPostconditionsDNF();

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dem.DemNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemDomainEvent_Notifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DemNotification> getNotifications();

} // DemDomainEvent
