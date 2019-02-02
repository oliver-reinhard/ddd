/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DAttribute#isDetail <em>Detail</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DAttribute#isKey <em>Key</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDAttribute()
 * @model
 * @generated
 */
public interface DAttribute extends DFeature
{
	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see #setDetail(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAttribute_Detail()
	 * @model
	 * @generated
	 */
	boolean isDetail();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DAttribute#isDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see #isDetail()
	 * @generated
	 */
	void setDetail(boolean value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAttribute_Key()
	 * @model
	 * @generated
	 */
	boolean isKey();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DAttribute#isKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isKey()
	 * @generated
	 */
	void setKey(boolean value);

} // DAttribute
