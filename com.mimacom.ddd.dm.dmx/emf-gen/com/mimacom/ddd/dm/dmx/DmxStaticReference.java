/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getTarget <em>Target</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#isPlural <em>Plural</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxStaticReference()
 * @model
 * @generated
 */
public interface DmxStaticReference extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IStaticReferenceTarget)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxStaticReference_Target()
	 * @model
	 * @generated
	 */
	IStaticReferenceTarget getTarget();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IStaticReferenceTarget value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(DNavigableMember)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxStaticReference_Member()
	 * @model
	 * @generated
	 */
	DNavigableMember getMember();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getMember <em>Member</em>}' reference.
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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxStaticReference_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxStaticReference_Plural()
	 * @model
	 * @generated
	 */
	boolean isPlural();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference#isPlural <em>Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plural</em>' attribute.
	 * @see #isPlural()
	 * @generated
	 */
	void setPlural(boolean value);

} // DmxStaticReference
