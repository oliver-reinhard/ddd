/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DFunction#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DFunction#isSystemTypeMany <em>System Type Many</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunction()
 * @model
 * @generated
 */
public interface DFunction extends DNavigableMember
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DFunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFunctionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DSystemType
	 * @see #setSystemType(DSystemType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunction_SystemType()
	 * @model
	 * @generated
	 */
	DSystemType getSystemType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DFunction#getSystemType <em>System Type</em>}' attribute.
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
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunction_SystemTypeMany()
	 * @model
	 * @generated
	 */
	boolean isSystemTypeMany();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DFunction#isSystemTypeMany <em>System Type Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type Many</em>' attribute.
	 * @see #isSystemTypeMany()
	 * @generated
	 */
	void setSystemTypeMany(boolean value);

} // DFunction
