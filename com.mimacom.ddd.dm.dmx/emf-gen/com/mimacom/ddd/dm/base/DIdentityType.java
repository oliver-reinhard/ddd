/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIdentity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DIdentityType#isRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDIdentityType()
 * @model abstract="true"
 * @generated
 */
public interface DIdentityType extends DComplexType, IIdentityType
{
	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDIdentityType_Root()
	 * @model
	 * @generated
	 */
	boolean isRoot();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DIdentityType#isRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #isRoot()
	 * @generated
	 */
	void setRoot(boolean value);

} // DIdentityType
