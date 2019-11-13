/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxContextReference#getTarget <em>Target</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxContextReference#isAll <em>All</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxContextReference#isBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxContextReference()
 * @model
 * @generated
 */
public interface DmxContextReference extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DNamedElement)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxContextReference_Target()
	 * @model
	 * @generated
	 */
	DNamedElement getTarget();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxContextReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DNamedElement value);

	/**
	 * Returns the value of the '<em><b>All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All</em>' attribute.
	 * @see #setAll(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxContextReference_All()
	 * @model
	 * @generated
	 */
	boolean isAll();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxContextReference#isAll <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All</em>' attribute.
	 * @see #isAll()
	 * @generated
	 */
	void setAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' attribute.
	 * @see #setBefore(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxContextReference_Before()
	 * @model
	 * @generated
	 */
	boolean isBefore();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxContextReference#isBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #isBefore()
	 * @generated
	 */
	void setBefore(boolean value);

} // DmxContextReference
