/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFunction Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DFunctionParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DFunctionParameter#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DFunctionParameter#isSystemTypeMany <em>System Type Many</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunctionParameter()
 * @model
 * @generated
 */
public interface DFunctionParameter extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunctionParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DFunctionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DSystemType
	 * @see #setSystemType(DSystemType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunctionParameter_SystemType()
	 * @model
	 * @generated
	 */
	DSystemType getSystemType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DFunctionParameter#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DSystemType
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(DSystemType value);

	/**
	 * Returns the value of the '<em><b>System Type Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type Many</em>' attribute.
	 * @see #setSystemTypeMany(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunctionParameter_SystemTypeMany()
	 * @model
	 * @generated
	 */
	boolean isSystemTypeMany();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DFunctionParameter#isSystemTypeMany <em>System Type Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type Many</em>' attribute.
	 * @see #isSystemTypeMany()
	 * @generated
	 */
	void setSystemTypeMany(boolean value);

} // DFunctionParameter
