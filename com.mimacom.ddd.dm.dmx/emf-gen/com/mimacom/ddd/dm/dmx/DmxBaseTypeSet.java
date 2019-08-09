/**
 */
package com.mimacom.ddd.dm.dmx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Type Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxBaseTypeSet()
 * @model
 * @generated
 */
public interface DmxBaseTypeSet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxBaseTypeSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' attribute list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' attribute list.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxBaseTypeSet_Members()
	 * @model
	 * @generated
	 */
	EList<DmxBaseType> getMembers();

} // DmxBaseTypeSet
