/**
 */
package com.mimacom.ddd.dm.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPrimitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DPrimitive#getRedefines <em>Redefines</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DPrimitive#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DPrimitive#isArchetype <em>Archetype</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDPrimitive()
 * @model
 * @generated
 */
public interface DPrimitive extends DSimpleType
{
	/**
	 * Returns the value of the '<em><b>Redefines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefines</em>' reference.
	 * @see #setRedefines(DPrimitive)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDPrimitive_Redefines()
	 * @model
	 * @generated
	 */
	DPrimitive getRedefines();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DPrimitive#getRedefines <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefines</em>' reference.
	 * @see #getRedefines()
	 * @generated
	 */
	void setRedefines(DPrimitive value);

	/**
	 * Returns the value of the '<em><b>System Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.base.DSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DSystemType
	 * @see #setSystemType(DSystemType)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDPrimitive_SystemType()
	 * @model
	 * @generated
	 */
	DSystemType getSystemType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DPrimitive#getSystemType <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.DSystemType
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(DSystemType value);

	/**
	 * Returns the value of the '<em><b>Archetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archetype</em>' attribute.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDPrimitive_Archetype()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isArchetype();

} // DPrimitive
