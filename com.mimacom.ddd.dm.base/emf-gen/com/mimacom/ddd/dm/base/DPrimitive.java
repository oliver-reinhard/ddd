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
	 * <p>
	 * If the meaning of the '<em>Redefines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // DPrimitive
