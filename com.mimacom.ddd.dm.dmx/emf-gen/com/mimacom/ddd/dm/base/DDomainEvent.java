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
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getBefore <em>Before</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getAfter <em>After</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDomainEvent#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent()
 * @model
 * @generated
 */
public interface DDomainEvent extends DNamedElement, ITypedMemberContainer, IPrimaryNavigationTarget
{
	/**
	 * Returns the value of the '<em><b>Before</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_Before()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCondition> getBefore();

	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_After()
	 * @model containment="true"
	 * @generated
	 */
	EList<DCondition> getAfter();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * Returns the value of the '<em><b>Notifications</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNotification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_Notifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNotification> getNotifications();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDomainEvent_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DContext> getContext();

} // DDomainEvent
