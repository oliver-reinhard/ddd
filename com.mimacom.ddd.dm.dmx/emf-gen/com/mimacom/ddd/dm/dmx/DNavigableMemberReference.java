/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNavigable Member Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberContainerReference <em>Member Container Reference</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDNavigableMemberReference()
 * @model
 * @generated
 */
public interface DNavigableMemberReference extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Member Container Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Container Reference</em>' containment reference.
	 * @see #setMemberContainerReference(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDNavigableMemberReference_MemberContainerReference()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getMemberContainerReference();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberContainerReference <em>Member Container Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Container Reference</em>' containment reference.
	 * @see #getMemberContainerReference()
	 * @generated
	 */
	void setMemberContainerReference(DExpression value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(DNavigableMember)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDNavigableMemberReference_Member()
	 * @model
	 * @generated
	 */
	DNavigableMember getMember();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(DNavigableMember value);

	/**
	 * Returns the value of the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Operation Call</em>' attribute.
	 * @see #setExplicitOperationCall(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDNavigableMemberReference_ExplicitOperationCall()
	 * @model
	 * @generated
	 */
	boolean isExplicitOperationCall();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isExplicitOperationCall <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Operation Call</em>' attribute.
	 * @see #isExplicitOperationCall()
	 * @generated
	 */
	void setExplicitOperationCall(boolean value);

	/**
	 * Returns the value of the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Call Arguments</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDNavigableMemberReference_MemberCallArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getMemberCallArguments();

	/**
	 * Returns the value of the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' attribute.
	 * @see #setBefore(boolean)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDNavigableMemberReference_Before()
	 * @model
	 * @generated
	 */
	boolean isBefore();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #isBefore()
	 * @generated
	 */
	void setBefore(boolean value);

} // DNavigableMemberReference
