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
 *   <li>{@link com.mimacom.ddd.dm.base.DFunction#getParameterNames <em>Parameter Names</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunction()
 * @model
 * @generated
 */
public interface DFunction extends DTypedMember
{
	/**
	 * Returns the value of the '<em><b>Parameter Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Names</em>' attribute list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDFunction_ParameterNames()
	 * @model
	 * @generated
	 */
	EList<String> getParameterNames();

} // DFunction
