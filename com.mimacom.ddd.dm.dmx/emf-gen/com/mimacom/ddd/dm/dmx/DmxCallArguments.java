/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxCallArguments#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxCallArguments()
 * @model
 * @generated
 */
public interface DmxCallArguments extends EObject
{
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxCallArguments_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getArguments();

} // DmxCallArguments
