/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxConstructorCall()
 * @model
 * @generated
 */
public interface DmxConstructorCall extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' reference.
	 * @see #setConstructor(DComplexType)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxConstructorCall_Constructor()
	 * @model
	 * @generated
	 */
	DComplexType getConstructor();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#getConstructor <em>Constructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' reference.
	 * @see #getConstructor()
	 * @generated
	 */
	void setConstructor(DComplexType value);

	/**
	 * Returns the value of the '<em><b>Explicit Constructor Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Constructor Call</em>' attribute.
	 * @see #setExplicitConstructorCall(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxConstructorCall_ExplicitConstructorCall()
	 * @model
	 * @generated
	 */
	boolean isExplicitConstructorCall();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Constructor Call</em>' attribute.
	 * @see #isExplicitConstructorCall()
	 * @generated
	 */
	void setExplicitConstructorCall(boolean value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxConstructorCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getArguments();

} // DmxConstructorCall