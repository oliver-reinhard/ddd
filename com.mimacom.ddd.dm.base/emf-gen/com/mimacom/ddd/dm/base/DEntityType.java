/**
 */
package com.mimacom.ddd.dm.base;


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
 *   <li>{@link com.mimacom.ddd.dm.base.DEntityType#getOrigin <em>Origin</em>}</li>
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
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DEntityOrigin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DEntityOrigin
	 * @see #setOrigin(DEntityOrigin)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDEntityType_Origin()
	 * @model
	 * @generated
	 */
	DEntityOrigin getOrigin();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DEntityType#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DEntityOrigin
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(DEntityOrigin value);

} // DEntityType
