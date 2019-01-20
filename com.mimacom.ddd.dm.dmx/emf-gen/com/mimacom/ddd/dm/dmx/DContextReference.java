/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DContext Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DContextReference#getContextElement <em>Context Element</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference()
 * @model
 * @generated
 */
public interface DContextReference extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Context Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Element</em>' reference.
	 * @see #setContextElement(DNamedElement)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference_ContextElement()
	 * @model
	 * @generated
	 */
	DNamedElement getContextElement();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DContextReference#getContextElement <em>Context Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Element</em>' reference.
	 * @see #getContextElement()
	 * @generated
	 */
	void setContextElement(DNamedElement value);

} // DContextReference
