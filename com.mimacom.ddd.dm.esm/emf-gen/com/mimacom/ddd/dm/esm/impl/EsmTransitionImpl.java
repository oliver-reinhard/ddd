/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DState;
import com.mimacom.ddd.dm.base.base.DStateEvent;
import com.mimacom.ddd.dm.base.base.INoteContainer;

import com.mimacom.ddd.dm.esm.EsmLayoutDirection;
import com.mimacom.ddd.dm.esm.EsmPackage;
import com.mimacom.ddd.dm.esm.EsmTransition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmTransitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsmTransitionImpl extends MinimalEObjectImpl.Container implements EsmTransition
{
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EsmLayoutDirection DIRECTION_EDEFAULT = EsmLayoutDirection.DEFAULT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EsmLayoutDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<DNote> notes;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DState from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DState to;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected DStateEvent event;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected DExpression guard;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DRichText description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsmTransitionImpl()
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
		return EsmPackage.Literals.ESM_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsmLayoutDirection getDirection()
	{
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(EsmLayoutDirection newDirection)
	{
		EsmLayoutDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNote> getNotes()
	{
		if (notes == null)
		{
			notes = new EObjectContainmentEList<DNote>(DNote.class, this, EsmPackage.ESM_TRANSITION__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState getFrom()
	{
		if (from != null && from.eIsProxy())
		{
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DState)eResolveProxy(oldFrom);
			if (from != oldFrom)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsmPackage.ESM_TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState basicGetFrom()
	{
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DState newFrom)
	{
		DState oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState getTo()
	{
		if (to != null && to.eIsProxy())
		{
			InternalEObject oldTo = (InternalEObject)to;
			to = (DState)eResolveProxy(oldTo);
			if (to != oldTo)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsmPackage.ESM_TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DState basicGetTo()
	{
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(DState newTo)
	{
		DState oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateEvent getEvent()
	{
		if (event != null && event.eIsProxy())
		{
			InternalEObject oldEvent = (InternalEObject)event;
			event = (DStateEvent)eResolveProxy(oldEvent);
			if (event != oldEvent)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsmPackage.ESM_TRANSITION__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateEvent basicGetEvent()
	{
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(DStateEvent newEvent)
	{
		DStateEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DExpression getGuard()
	{
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(DExpression newGuard, NotificationChain msgs)
	{
		DExpression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(DExpression newGuard)
	{
		if (newGuard != guard)
		{
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsmPackage.ESM_TRANSITION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsmPackage.ESM_TRANSITION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRichText getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DRichText newDescription, NotificationChain msgs)
	{
		DRichText oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DRichText newDescription)
	{
		if (newDescription != description)
		{
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsmPackage.ESM_TRANSITION__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsmPackage.ESM_TRANSITION__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_TRANSITION__DESCRIPTION, newDescription, newDescription));
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
			case EsmPackage.ESM_TRANSITION__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case EsmPackage.ESM_TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case EsmPackage.ESM_TRANSITION__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case EsmPackage.ESM_TRANSITION__DIRECTION:
				return getDirection();
			case EsmPackage.ESM_TRANSITION__NOTES:
				return getNotes();
			case EsmPackage.ESM_TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case EsmPackage.ESM_TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case EsmPackage.ESM_TRANSITION__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case EsmPackage.ESM_TRANSITION__GUARD:
				return getGuard();
			case EsmPackage.ESM_TRANSITION__DESCRIPTION:
				return getDescription();
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
			case EsmPackage.ESM_TRANSITION__DIRECTION:
				setDirection((EsmLayoutDirection)newValue);
				return;
			case EsmPackage.ESM_TRANSITION__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends DNote>)newValue);
				return;
			case EsmPackage.ESM_TRANSITION__FROM:
				setFrom((DState)newValue);
				return;
			case EsmPackage.ESM_TRANSITION__TO:
				setTo((DState)newValue);
				return;
			case EsmPackage.ESM_TRANSITION__EVENT:
				setEvent((DStateEvent)newValue);
				return;
			case EsmPackage.ESM_TRANSITION__GUARD:
				setGuard((DExpression)newValue);
				return;
			case EsmPackage.ESM_TRANSITION__DESCRIPTION:
				setDescription((DRichText)newValue);
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
			case EsmPackage.ESM_TRANSITION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case EsmPackage.ESM_TRANSITION__NOTES:
				getNotes().clear();
				return;
			case EsmPackage.ESM_TRANSITION__FROM:
				setFrom((DState)null);
				return;
			case EsmPackage.ESM_TRANSITION__TO:
				setTo((DState)null);
				return;
			case EsmPackage.ESM_TRANSITION__EVENT:
				setEvent((DStateEvent)null);
				return;
			case EsmPackage.ESM_TRANSITION__GUARD:
				setGuard((DExpression)null);
				return;
			case EsmPackage.ESM_TRANSITION__DESCRIPTION:
				setDescription((DRichText)null);
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
			case EsmPackage.ESM_TRANSITION__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case EsmPackage.ESM_TRANSITION__NOTES:
				return notes != null && !notes.isEmpty();
			case EsmPackage.ESM_TRANSITION__FROM:
				return from != null;
			case EsmPackage.ESM_TRANSITION__TO:
				return to != null;
			case EsmPackage.ESM_TRANSITION__EVENT:
				return event != null;
			case EsmPackage.ESM_TRANSITION__GUARD:
				return guard != null;
			case EsmPackage.ESM_TRANSITION__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == INoteContainer.class)
		{
			switch (derivedFeatureID)
			{
				case EsmPackage.ESM_TRANSITION__NOTES: return BasePackage.INOTE_CONTAINER__NOTES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == INoteContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INOTE_CONTAINER__NOTES: return EsmPackage.ESM_TRANSITION__NOTES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //EsmTransitionImpl
