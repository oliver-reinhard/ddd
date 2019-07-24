/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAssignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DAssignment#getMemberContainer <em>Member Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DAssignment#getAssignToMember <em>Assign To Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DAssignment#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDAssignment()
 * @model
 * @generated
 */
public interface DAssignment extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Member Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Container</em>' containment reference.
	 * @see #setMemberContainer(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDAssignment_MemberContainer()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getMemberContainer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DAssignment#getMemberContainer <em>Member Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Container</em>' containment reference.
	 * @see #getMemberContainer()
	 * @generated
	 */
	void setMemberContainer(DExpression value);

	/**
	 * Returns the value of the '<em><b>Assign To Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign To Member</em>' reference.
	 * @see #setAssignToMember(DNavigableMember)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDAssignment_AssignToMember()
	 * @model
	 * @generated
	 */
	DNavigableMember getAssignToMember();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DAssignment#getAssignToMember <em>Assign To Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign To Member</em>' reference.
	 * @see #getAssignToMember()
	 * @generated
	 */
	void setAssignToMember(DNavigableMember value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDAssignment_Value()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getValue();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DAssignment#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DExpression value);

} // DAssignment
