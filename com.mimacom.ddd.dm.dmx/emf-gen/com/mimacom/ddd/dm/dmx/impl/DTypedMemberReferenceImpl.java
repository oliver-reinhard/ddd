/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DTypedMember;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DTypedMemberReference;
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
 * An implementation of the model object '<em><b>DTyped Member Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DTypedMemberReferenceImpl#getMemberContainer <em>Member Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DTypedMemberReferenceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DTypedMemberReferenceImpl#isExplicitOperationCall <em>Explicit Operation Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DTypedMemberReferenceImpl#getMemberCallArguments <em>Member Call Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTypedMemberReferenceImpl extends DExpressionImpl implements DTypedMemberReference
{
	/**
	 * The cached value of the '{@link #getMemberContainer() <em>Member Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberContainer()
	 * @generated
	 * @ordered
	 */
	protected DExpression memberContainer;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected DTypedMember member;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTypedMemberReferenceImpl()
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
		return DmxPackage.Literals.DTYPED_MEMBER_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getMemberContainer()
	{
		return memberContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemberContainer(DExpression newMemberContainer, NotificationChain msgs)
	{
		DExpression oldMemberContainer = memberContainer;
		memberContainer = newMemberContainer;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER, oldMemberContainer, newMemberContainer);
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
	public void setMemberContainer(DExpression newMemberContainer)
	{
		if (newMemberContainer != memberContainer)
		{
			NotificationChain msgs = null;
			if (memberContainer != null)
				msgs = ((InternalEObject)memberContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER, null, msgs);
			if (newMemberContainer != null)
				msgs = ((InternalEObject)newMemberContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER, null, msgs);
			msgs = basicSetMemberContainer(newMemberContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER, newMemberContainer, newMemberContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTypedMember getMember()
	{
		if (member != null && member.eIsProxy())
		{
			InternalEObject oldMember = (InternalEObject)member;
			member = (DTypedMember)eResolveProxy(oldMember);
			if (member != oldMember)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTypedMember basicGetMember()
	{
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMember(DTypedMember newMember)
	{
		DTypedMember oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER, oldMember, member));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DTYPED_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL, oldExplicitOperationCall, explicitOperationCall));
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
			memberCallArguments = new EObjectContainmentEList<DExpression>(DExpression.class, this, DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS);
		}
		return memberCallArguments;
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
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER:
				return basicSetMemberContainer(null, msgs);
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS:
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
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER:
				return getMemberContainer();
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case DmxPackage.DTYPED_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL:
				return isExplicitOperationCall();
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS:
				return getMemberCallArguments();
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
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER:
				setMemberContainer((DExpression)newValue);
				return;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER:
				setMember((DTypedMember)newValue);
				return;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall((Boolean)newValue);
				return;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
				getMemberCallArguments().addAll((Collection<? extends DExpression>)newValue);
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
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER:
				setMemberContainer((DExpression)null);
				return;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER:
				setMember((DTypedMember)null);
				return;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL:
				setExplicitOperationCall(EXPLICIT_OPERATION_CALL_EDEFAULT);
				return;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS:
				getMemberCallArguments().clear();
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
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CONTAINER:
				return memberContainer != null;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER:
				return member != null;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL:
				return explicitOperationCall != EXPLICIT_OPERATION_CALL_EDEFAULT;
			case DmxPackage.DTYPED_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS:
				return memberCallArguments != null && !memberCallArguments.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DTypedMemberReferenceImpl
