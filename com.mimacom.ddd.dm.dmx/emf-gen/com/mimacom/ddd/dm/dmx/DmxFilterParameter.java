/**
 */
package com.mimacom.ddd.dm.dmx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter#getTypeDesc <em>Type Desc</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterParameter()
 * @model
 * @generated
 */
public interface DmxFilterParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Desc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Desc</em>' containment reference.
	 * @see #setTypeDesc(DmxFilterTypeDescriptor)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFilterParameter_TypeDesc()
	 * @model containment="true"
	 * @generated
	 */
	DmxFilterTypeDescriptor getTypeDesc();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter#getTypeDesc <em>Type Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Desc</em>' containment reference.
	 * @see #getTypeDesc()
	 * @generated
	 */
	void setTypeDesc(DmxFilterTypeDescriptor value);

} // DmxFilterParameter
