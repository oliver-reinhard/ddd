/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNavigableMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getPrecedingNavigationSegment <em>Preceding Navigation Segment</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getCallArguments <em>Call Arguments</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxMemberNavigation()
 * @model
 * @generated
 */
public interface DmxMemberNavigation extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(DNavigableMember)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxMemberNavigation_Member()
	 * @model
	 * @generated
	 */
	DNavigableMember getMember();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(DNavigableMember value);

	/**
	 * Returns the value of the '<em><b>Preceding Navigation Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preceding Navigation Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preceding Navigation Segment</em>' containment reference.
	 * @see #setPrecedingNavigationSegment(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxMemberNavigation_PrecedingNavigationSegment()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getPrecedingNavigationSegment();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getPrecedingNavigationSegment <em>Preceding Navigation Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding Navigation Segment</em>' containment reference.
	 * @see #getPrecedingNavigationSegment()
	 * @generated
	 */
	void setPrecedingNavigationSegment(DExpression value);

	/**
	 * Returns the value of the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Operation Call</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Operation Call</em>' attribute.
	 * @see #setExplicitOperationCall(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxMemberNavigation_ExplicitOperationCall()
	 * @model
	 * @generated
	 */
	boolean isExplicitOperationCall();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isExplicitOperationCall <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Operation Call</em>' attribute.
	 * @see #isExplicitOperationCall()
	 * @generated
	 */
	void setExplicitOperationCall(boolean value);

	/**
	 * Returns the value of the '<em><b>Call Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Arguments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Arguments</em>' containment reference.
	 * @see #setCallArguments(DmxCallArguments)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxMemberNavigation_CallArguments()
	 * @model containment="true"
	 * @generated
	 */
	DmxCallArguments getCallArguments();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#getCallArguments <em>Call Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Arguments</em>' containment reference.
	 * @see #getCallArguments()
	 * @generated
	 */
	void setCallArguments(DmxCallArguments value);

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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxMemberNavigation_Before()
	 * @model
	 * @generated
	 */
	boolean isBefore();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation#isBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #isBefore()
	 * @generated
	 */
	void setBefore(boolean value);

} // DmxMemberNavigation
