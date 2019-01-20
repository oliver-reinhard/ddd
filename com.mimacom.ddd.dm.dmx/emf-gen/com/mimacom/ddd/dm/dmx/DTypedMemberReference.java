/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DTypedMember;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTyped Member Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#getMemberContainer <em>Member Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDTypedMemberReference()
 * @model
 * @generated
 */
public interface DTypedMemberReference extends DExpression
{
	/**
	 * Returns the value of the '<em><b>Member Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Container</em>' containment reference.
	 * @see #setMemberContainer(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDTypedMemberReference_MemberContainer()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getMemberContainer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#getMemberContainer <em>Member Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Container</em>' containment reference.
	 * @see #getMemberContainer()
	 * @generated
	 */
	void setMemberContainer(DExpression value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(DTypedMember)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDTypedMemberReference_Member()
	 * @model
	 * @generated
	 */
	DTypedMember getMember();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(DTypedMember value);

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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDTypedMemberReference_ExplicitOperationCall()
	 * @model
	 * @generated
	 */
	boolean isExplicitOperationCall();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference#isExplicitOperationCall <em>Explicit Operation Call</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Member Call Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Call Arguments</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDTypedMemberReference_MemberCallArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getMemberCallArguments();

} // DTypedMemberReference
