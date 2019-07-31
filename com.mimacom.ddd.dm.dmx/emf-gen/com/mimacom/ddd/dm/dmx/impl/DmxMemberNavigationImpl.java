/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl#getPrecedingNavigationSegment <em>Preceding Navigation Segment</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxMemberNavigationImpl#isBefore <em>Before</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxMemberNavigationImpl extends DExpressionImpl implements DmxMemberNavigation
{
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected DNavigableMember member;

	/**
	 * The cached value of the '{@link #getPrecedingNavigationSegment() <em>Preceding Navigation Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedingNavigationSegment()
	 * @generated
	 * @ordered
	 */
	protected DExpression precedingNavigationSegment;

	/**
	 * The default value of the '{@link #isExplicitOperationCall() <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOperationCall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_OPERATION_CALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitOperationCall() <em>Explicit Operation Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOperationCall()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitOperationCall = EXPLICIT_OPERATION_CALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMemberCallArguments() <em>Member Call Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberCallArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<DExpression> memberCallArguments;

	/**
	 * The default value of the '{@link #isBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEFORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBefore()
	 * @generated
	 * @ordered
	 */
	protected boolean before = BEFORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxMemberNavigationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DmxPackage.Literals.DMX_MEMBER_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNavigableMember getMember()
	{
		if (member != null && member.eIsProxy())
		{
			InternalEObject oldMember = (InternalEObject)member;
			member = (DNavigableMember)eResolveProxy(oldMember);
			if (member != oldMember)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNavigableMember basicGetMember()
	{
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMember(DNavigableMember newMember)
	{
		DNavigableMember oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getPrecedingNavigationSegment()
	{
		return precedingNavigationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedingNavigationSegment(DExpression newPrecedingNavigationSegment, NotificationChain msgs)
	{
		DExpression oldPrecedingNavigationSegment = precedingNavigationSegment;
		precedingNavigationSegment = newPrecedingNavigationSegment;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT, oldPrecedingNavigationSegment, newPrecedingNavigationSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecedingNavigationSegment(DExpression newPrecedingNavigationSegment)
	{
		if (newPrecedingNavigationSegment != precedingNavigationSegment)
		{
			NotificationChain msgs = null;
			if (precedingNavigationSegment != null)
				msgs = ((InternalEObject)precedingNavigationSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT, null, msgs);
			if (newPrecedingNavigationSegment != null)
				msgs = ((InternalEObject)newPrecedingNavigationSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT, null, msgs);
			msgs = basicSetPrecedingNavigationSegment(newPrecedingNavigationSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT, newPrecedingNavigationSegment, newPrecedingNavigationSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExplicitOperationCall()
	{
		return explicitOperationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplicitOperationCall(boolean newExplicitOperationCall)
	{
		boolean oldExplicitOperationCall = explicitOperationCall;
		explicitOperationCall = newExplicitOperationCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL, oldExplicitOperationCall, explicitOperationCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DExpression> getMemberCallArguments()
	{
		if (memberCallArguments == null)
		{
			memberCallArguments = new EObjectContainmentEList<DExpression>(DExpression.class, this, DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS);
		}
		return memberCallArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBefore()
	{
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBefore(boolean newBefore)
	{
		boolean oldBefore = before;
		before = newBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_MEMBER_NAVIGATION__BEFORE, oldBefore, before));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT:
				return basicSetPrecedingNavigationSegment(null, msgs);
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS:
				return ((InternalEList<?>)getMemberCallArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT:
				return getPrecedingNavigationSegment();
			case DmxPackage.DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL:
				return isExplicitOperationCall();
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS:
				return getMemberCallArguments();
			case DmxPackage.DMX_MEMBER_NAVIGATION__BEFORE:
				return isBefore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER:
				setMember((DNavigableMember)newValue);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT:
				setPrecedingNavigationSegment((DExpression)newValue);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall((Boolean)newValue);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				getMemberCallArguments().addAll((Collection<? extends DExpression>)newValue);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__BEFORE:
				setBefore((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER:
				setMember((DNavigableMember)null);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT:
				setPrecedingNavigationSegment((DExpression)null);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall(EXPLICIT_OPERATION_CALL_EDEFAULT);
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				return;
			case DmxPackage.DMX_MEMBER_NAVIGATION__BEFORE:
				setBefore(BEFORE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER:
				return member != null;
			case DmxPackage.DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT:
				return precedingNavigationSegment != null;
			case DmxPackage.DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL:
				return explicitOperationCall != EXPLICIT_OPERATION_CALL_EDEFAULT;
			case DmxPackage.DMX_MEMBER_NAVIGATION__MEMBER_CALL_ARGUMENTS:
				return memberCallArguments != null && !memberCallArguments.isEmpty();
			case DmxPackage.DMX_MEMBER_NAVIGATION__BEFORE:
				return before != BEFORE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (explicitOperationCall: ");
		result.append(explicitOperationCall);
		result.append(", before: ");
		result.append(before);
		result.append(')');
		return result.toString();
	}

} //DmxMemberNavigationImpl
