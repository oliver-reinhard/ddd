/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DContext Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DContextReference#getTarget <em>Target</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DContextReference#isBefore <em>Before</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DContextReference#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DContextReference#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DContextReference#isPlural <em>Plural</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference()
 * @model
 * @generated
 */
public interface DContextReference extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DNamedElement)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference_Target()
	 * @model
	 * @generated
	 */
	DNamedElement getTarget();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DContextReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DNamedElement value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' attribute.
	 * @see #setBefore(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference_Before()
	 * @model
	 * @generated
	 */
	boolean isBefore();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DContextReference#isBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #isBefore()
	 * @generated
	 */
	void setBefore(boolean value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(DNavigableMember)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference_Member()
	 * @model
	 * @generated
	 */
	DNavigableMember getMember();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DContextReference#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(DNavigableMember value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DContextReference#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Plural</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plural</em>' attribute.
	 * @see #setPlural(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDContextReference_Plural()
	 * @model
	 * @generated
	 */
	boolean isPlural();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DContextReference#isPlural <em>Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plural</em>' attribute.
	 * @see #isPlural()
	 * @generated
	 */
	void setPlural(boolean value);

} // DContextReference
