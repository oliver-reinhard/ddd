/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEntity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DEntityType#isRoot <em>Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DEntityType#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DEntityType#getStates <em>States</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DEntityType#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityType()
 * @model
 * @generated
 */
public interface DEntityType extends DComplexType, IIdentityType
{
	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityType_Root()
	 * @model
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DEntityType#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DEntityNature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DEntityNature
	 * @see #setNature(DEntityNature)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityType_Nature()
	 * @model
	 * @generated
	 */
	DEntityNature getNature();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DEntityType#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DEntityNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(DEntityNature value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityType_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<DState> getStates();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DStateEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityType_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<DStateEvent> getEvents();

} // DEntityType
