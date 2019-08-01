/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNavigableMember;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl#getPrecedingNavigationSegment <em>Preceding Navigation Segment</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl#getAssignToMember <em>Assign To Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxAssignmentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxAssignmentImpl extends DExpressionImpl implements DmxAssignment
{
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
	protected DmxAssignmentImpl()
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
		return DmxPackage.Literals.DMX_ASSIGNMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT, oldPrecedingNavigationSegment, newPrecedingNavigationSegment);
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
				msgs = ((InternalEObject)precedingNavigationSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT, null, msgs);
			if (newPrecedingNavigationSegment != null)
				msgs = ((InternalEObject)newPrecedingNavigationSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT, null, msgs);
			msgs = basicSetPrecedingNavigationSegment(newPrecedingNavigationSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT, newPrecedingNavigationSegment, newPrecedingNavigationSegment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER, oldAssignToMember, assignToMember));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER, oldAssignToMember, assignToMember));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ASSIGNMENT__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_ASSIGNMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_ASSIGNMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ASSIGNMENT__VALUE, newValue, newValue));
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
			case DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT:
				return basicSetPrecedingNavigationSegment(null, msgs);
			case DmxPackage.DMX_ASSIGNMENT__VALUE:
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
			case DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT:
				return getPrecedingNavigationSegment();
			case DmxPackage.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER:
				if (resolve) return getAssignToMember();
				return basicGetAssignToMember();
			case DmxPackage.DMX_ASSIGNMENT__VALUE:
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
			case DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT:
				setPrecedingNavigationSegment((DExpression)newValue);
				return;
			case DmxPackage.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER:
				setAssignToMember((DNavigableMember)newValue);
				return;
			case DmxPackage.DMX_ASSIGNMENT__VALUE:
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
			case DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT:
				setPrecedingNavigationSegment((DExpression)null);
				return;
			case DmxPackage.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER:
				setAssignToMember((DNavigableMember)null);
				return;
			case DmxPackage.DMX_ASSIGNMENT__VALUE:
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
			case DmxPackage.DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT:
				return precedingNavigationSegment != null;
			case DmxPackage.DMX_ASSIGNMENT__ASSIGN_TO_MEMBER:
				return assignToMember != null;
			case DmxPackage.DMX_ASSIGNMENT__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxAssignmentImpl
