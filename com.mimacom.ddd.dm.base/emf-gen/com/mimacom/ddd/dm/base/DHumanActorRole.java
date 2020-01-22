/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DHuman Actor Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DHumanActorRole#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDHumanActorRole()
 * @model
 * @generated
 */
public interface DHumanActorRole extends DActor
{
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(DEntityType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDHumanActorRole_Role()
	 * @model
	 * @generated
	 */
	DEntityType getRole();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DHumanActorRole#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(DEntityType value);

} // DHumanActorRole
