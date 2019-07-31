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
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilter#isBaseTypeCollection <em>Base Type Collection</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter()
 * @model abstract="true"
 * @generated
 */
public interface DmxFilter extends DNavigableMember
{
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setBaseType(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_BaseType()
	 * @model
	 * @generated
	 */
	DmxBaseType getBaseType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilter#getBaseType <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(DmxBaseType value);

	/**
	 * Returns the value of the '<em><b>Base Type Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type Collection</em>' attribute.
	 * @see #setBaseTypeCollection(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilter_BaseTypeCollection()
	 * @model
	 * @generated
	 */
	boolean isBaseTypeCollection();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilter#isBaseTypeCollection <em>Base Type Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type Collection</em>' attribute.
	 * @see #isBaseTypeCollection()
	 * @generated
	 */
	void setBaseTypeCollection(boolean value);

} // DmxFilter
