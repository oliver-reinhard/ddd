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
 *   <li>{@link com.mimacom.ddd.dm.base.DNotification#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DNotification#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDNotification()
 * @model
 * @generated
 */
public interface DNotification extends DNamedElement
{
	/**
	 * Returns the value of the '<em><b>Notified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notified</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDNotification_Type()
	 * @model
	 * @generated
	 */
	DType getType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DNotification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DType value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(DMultiplicity)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDNotification_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	DMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DNotification#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(DMultiplicity value);

} // DNotification
