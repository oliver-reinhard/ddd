/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNavigableMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxField#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxField()
 * @model
 * @generated
 */
public interface DmxField extends DNavigableMember
{
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(DFeature)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxField_Feature()
	 * @model
	 * @generated
	 */
	DFeature getFeature();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxField#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(DFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxField_Value()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getValue();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxField#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DExpression value);

} // DmxField
