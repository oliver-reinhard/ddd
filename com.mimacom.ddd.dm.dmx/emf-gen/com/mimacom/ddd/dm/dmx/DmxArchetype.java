/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DPrimitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxArchetype#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxArchetype()
 * @model
 * @generated
 */
public interface DmxArchetype extends DPrimitive
{
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setBaseType(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxArchetype_BaseType()
	 * @model
	 * @generated
	 */
	DmxBaseType getBaseType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxArchetype#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(DmxBaseType value);

} // DmxArchetype
