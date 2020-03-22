/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemNotification#getMessage <em>Message</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemNotification#getNotified <em>Notified</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemNotification()
 * @model
 * @generated
 */
public interface DemNotification extends DNavigableMember, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(DemMessage)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemNotification_Message()
	 * @model containment="true"
	 * @generated
	 */
	DemMessage getMessage();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemNotification#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(DemMessage value);

	/**
	 * Returns the value of the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notified</em>' reference.
	 * @see #setNotified(DemActor)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemNotification_Notified()
	 * @model required="true"
	 * @generated
	 */
	DemActor getNotified();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemNotification#getNotified <em>Notified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notified</em>' reference.
	 * @see #getNotified()
	 * @generated
	 */
	void setNotified(DemActor value);

} // DemNotification
