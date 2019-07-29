/**
 */
package com.mimacom.ddd.dm.dmx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#isSystemTypeMany <em>System Type Many</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionParameter()
 * @model
 * @generated
 */
public interface DmxFunctionParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setSystemType(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionParameter_SystemType()
	 * @model
	 * @generated
	 */
	DmxBaseType getSystemType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getSystemType <em>System Type</em>}' attribute.
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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionParameter_SystemTypeMany()
	 * @model
	 * @generated
	 */
	boolean isSystemTypeMany();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#isSystemTypeMany <em>System Type Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type Many</em>' attribute.
	 * @see #isSystemTypeMany()
	 * @generated
	 */
	void setSystemTypeMany(boolean value);

} // DmxFunctionParameter
