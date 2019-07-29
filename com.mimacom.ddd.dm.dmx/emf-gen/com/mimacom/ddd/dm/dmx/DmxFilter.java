/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DNavigableMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#isSystemTypeMany <em>System Type Many</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter()
 * @model abstract="true"
 * @generated
 */
public interface DmxFilter extends DNavigableMember
{
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setSystemType(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_SystemType()
	 * @model
	 * @generated
	 */
	DmxBaseType getSystemType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(DmxBaseType value);

	/**
	 * Returns the value of the '<em><b>System Type Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type Many</em>' attribute.
	 * @see #setSystemTypeMany(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_SystemTypeMany()
	 * @model
	 * @generated
	 */
	boolean isSystemTypeMany();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilter#isSystemTypeMany <em>System Type Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type Many</em>' attribute.
	 * @see #isSystemTypeMany()
	 * @generated
	 */
	void setSystemTypeMany(boolean value);

} // DmxFilter
