/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DPrimitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxArchetype#getSystemType <em>System Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxArchetype()
 * @model
 * @generated
 */
public interface DmxArchetype extends DPrimitive
{
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setSystemType(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxArchetype_SystemType()
	 * @model
	 * @generated
	 */
	DmxBaseType getSystemType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxArchetype#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(DmxBaseType value);

} // DmxArchetype
