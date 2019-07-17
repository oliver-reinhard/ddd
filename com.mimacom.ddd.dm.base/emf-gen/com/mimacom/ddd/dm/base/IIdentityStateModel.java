/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IIdentity State Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.IIdentityStateModel#getForType <em>For Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getIIdentityStateModel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IIdentityStateModel extends EObject
{
	/**
	 * Returns the value of the '<em><b>For Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Type</em>' reference.
	 * @see #setForType(DIdentityType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIIdentityStateModel_ForType()
	 * @model
	 * @generated
	 */
	DIdentityType getForType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.IIdentityStateModel#getForType <em>For Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Type</em>' reference.
	 * @see #getForType()
	 * @generated
	 */
	void setForType(DIdentityType value);

} // IIdentityStateModel
