/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDomain Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getContext <em>Context</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getPreconditionsCNF <em>Preconditions CNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getPostconditionsDNF <em>Postconditions DNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent()
 * @model
 * @generated
 */
public interface DDomainEvent extends DNamedElement, INavigableMemberContainer, IStaticReferenceTarget
{
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DContext> getContext();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(DActor)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_Trigger()
	 * @model required="true"
	 * @generated
	 */
	DActor getTrigger();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DDomainEvent#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(DActor value);

	/**
	 * Returns the value of the '<em><b>Preconditions CNF</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNamedPredicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions CNF</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_PreconditionsCNF()
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
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_PostconditionsDNF()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNamedElement> getPostconditionsDNF();

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNotification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_Notifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNotification> getNotifications();

} // DDomainEvent
