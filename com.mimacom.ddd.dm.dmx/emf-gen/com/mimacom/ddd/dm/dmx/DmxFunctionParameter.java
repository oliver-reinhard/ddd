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
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#isBaseTypeCollection <em>Base Type Collection</em>}</li>
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
	 * Returns the value of the '<em><b>Base Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.dmx.DmxBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseType
	 * @see #setBaseType(DmxBaseType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionParameter_BaseType()
	 * @model
	 * @generated
	 */
	DmxBaseType getBaseType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#getBaseType <em>Base Type</em>}' attribute.
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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxFunctionParameter_BaseTypeCollection()
	 * @model
	 * @generated
	 */
	boolean isBaseTypeCollection();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxFunctionParameter#isBaseTypeCollection <em>Base Type Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type Collection</em>' attribute.
	 * @see #isBaseTypeCollection()
	 * @generated
	 */
	void setBaseTypeCollection(boolean value);

} // DmxFunctionParameter
