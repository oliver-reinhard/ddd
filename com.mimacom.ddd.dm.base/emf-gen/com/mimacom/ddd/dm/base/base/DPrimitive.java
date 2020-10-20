/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPrimitive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DPrimitive#getRedefines <em>Redefines</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDPrimitive()
 * @model abstract="true"
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
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDPrimitive_Redefines()
	 * @model
	 * @generated
	 */
	DPrimitive getRedefines();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DPrimitive#getRedefines <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redefines</em>' reference.
	 * @see #getRedefines()
	 * @generated
	 */
	void setRedefines(DPrimitive value);

} // DPrimitive
