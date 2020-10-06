/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxComplexObject#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxComplexObject#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxComplexObject()
 * @model
 * @generated
 */
public interface DmxComplexObject extends INavigableMemberContainer, DExpression
{
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DComplexType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxComplexObject_Type()
	 * @model
	 * @generated
	 */
	DComplexType getType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxComplexObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DComplexType value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dmx.DmxField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxComplexObject_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmxField> getFields();

} // DmxComplexObject
