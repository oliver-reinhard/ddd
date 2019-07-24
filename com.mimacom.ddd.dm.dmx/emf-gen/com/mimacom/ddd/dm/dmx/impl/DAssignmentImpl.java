/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DAssignment;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAssignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl#getMemberContainer <em>Member Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl#getAssignToMember <em>Assign To Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAssignmentImpl extends DExpressionImpl implements DAssignment
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
	 * The cached value of the '{@link #getAssignToMember() <em>Assign To Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignToMember()
	 * @generated
	 * @ordered
	 */
	protected DNavigableMember assignToMember;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DExpression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAssignmentImpl()
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
		return DmxPackage.Literals.DASSIGNMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DASSIGNMENT__MEMBER_CONTAINER, oldMemberContainer, newMemberContainer);
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
				msgs = ((InternalEObject)memberContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DASSIGNMENT__MEMBER_CONTAINER, null, msgs);
			if (newMemberContainer != null)
				msgs = ((InternalEObject)newMemberContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DASSIGNMENT__MEMBER_CONTAINER, null, msgs);
			msgs = basicSetMemberContainer(newMemberContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DASSIGNMENT__MEMBER_CONTAINER, newMemberContainer, newMemberContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNavigableMember getAssignToMember()
	{
		if (assignToMember != null && assignToMember.eIsProxy())
		{
			InternalEObject oldAssignToMember = (InternalEObject)assignToMember;
			assignToMember = (DNavigableMember)eResolveProxy(oldAssignToMember);
			if (assignToMember != oldAssignToMember)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DASSIGNMENT__ASSIGN_TO_MEMBER, oldAssignToMember, assignToMember));
			}
		}
		return assignToMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNavigableMember basicGetAssignToMember()
	{
		return assignToMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignToMember(DNavigableMember newAssignToMember)
	{
		DNavigableMember oldAssignToMember = assignToMember;
		assignToMember = newAssignToMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DASSIGNMENT__ASSIGN_TO_MEMBER, oldAssignToMember, assignToMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(DExpression newValue, NotificationChain msgs)
	{
		DExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DASSIGNMENT__VALUE, oldValue, newValue);
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
	public void setValue(DExpression newValue)
	{
		if (newValue != value)
		{
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DASSIGNMENT__VALUE, newValue, newValue));
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
			case DmxPackage.DASSIGNMENT__MEMBER_CONTAINER:
				return basicSetMemberContainer(null, msgs);
			case DmxPackage.DASSIGNMENT__VALUE:
				return basicSetValue(null, msgs);
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
			case DmxPackage.DASSIGNMENT__MEMBER_CONTAINER:
				return getMemberContainer();
			case DmxPackage.DASSIGNMENT__ASSIGN_TO_MEMBER:
				if (resolve) return getAssignToMember();
				return basicGetAssignToMember();
			case DmxPackage.DASSIGNMENT__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DmxPackage.DASSIGNMENT__MEMBER_CONTAINER:
				setMemberContainer((DExpression)newValue);
				return;
			case DmxPackage.DASSIGNMENT__ASSIGN_TO_MEMBER:
				setAssignToMember((DNavigableMember)newValue);
				return;
			case DmxPackage.DASSIGNMENT__VALUE:
				setValue((DExpression)newValue);
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
			case DmxPackage.DASSIGNMENT__MEMBER_CONTAINER:
				setMemberContainer((DExpression)null);
				return;
			case DmxPackage.DASSIGNMENT__ASSIGN_TO_MEMBER:
				setAssignToMember((DNavigableMember)null);
				return;
			case DmxPackage.DASSIGNMENT__VALUE:
				setValue((DExpression)null);
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
			case DmxPackage.DASSIGNMENT__MEMBER_CONTAINER:
				return memberContainer != null;
			case DmxPackage.DASSIGNMENT__ASSIGN_TO_MEMBER:
				return assignToMember != null;
			case DmxPackage.DASSIGNMENT__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //DAssignmentImpl
