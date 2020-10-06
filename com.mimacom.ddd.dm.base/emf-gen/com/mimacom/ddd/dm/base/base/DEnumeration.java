/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEnumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DEnumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDEnumeration()
 * @model
 * @generated
 */
public interface DEnumeration extends DSimpleType, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDEnumeration_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<DLiteral> getLiterals();

} // DEnumeration
