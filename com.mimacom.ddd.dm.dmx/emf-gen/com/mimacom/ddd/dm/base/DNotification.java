/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNotification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DNotification#getNotified <em>Notified</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDNotification()
 * @model
 * @generated
 */
public interface DNotification extends DTypedMember
{
	/**
	 * Returns the value of the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notified</em>' reference.
	 * @see #setNotified(DActor)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDNotification_Notified()
	 * @model required="true"
	 * @generated
	 */
	DActor getNotified();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DNotification#getNotified <em>Notified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notified</em>' reference.
	 * @see #getNotified()
	 * @generated
	 */
	void setNotified(DActor value);

} // DNotification
