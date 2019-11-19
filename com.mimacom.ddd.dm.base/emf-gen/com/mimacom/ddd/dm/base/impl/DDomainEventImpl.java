/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DNotification;

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
 * An implementation of the model object '<em><b>DDomain Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl#getPreconditionsCNF <em>Preconditions CNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl#getPostconditionsDNF <em>Postconditions DNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainEventImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDomainEventImpl extends DNamedElementImpl implements DDomainEvent
{
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<DContext> context;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected DActor trigger;

	/**
	 * The cached value of the '{@link #getPreconditionsCNF() <em>Preconditions CNF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditionsCNF()
	 * @generated
	 * @ordered
	 */
	protected EList<DNamedPredicate> preconditionsCNF;

	/**
	 * The cached value of the '{@link #getPostconditionsDNF() <em>Postconditions DNF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostconditionsDNF()
	 * @generated
	 * @ordered
	 */
	protected EList<DNamedElement> postconditionsDNF;

	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<DNotification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDomainEventImpl()
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
		return BasePackage.Literals.DDOMAIN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DContext> getContext()
	{
		if (context == null)
		{
			context = new EObjectContainmentEList<DContext>(DContext.class, this, BasePackage.DDOMAIN_EVENT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DActor getTrigger()
	{
		if (trigger != null && trigger.eIsProxy())
		{
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (DActor)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DDOMAIN_EVENT__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DActor basicGetTrigger()
	{
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(DActor newTrigger)
	{
		DActor oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DDOMAIN_EVENT__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNamedPredicate> getPreconditionsCNF()
	{
		if (preconditionsCNF == null)
		{
			preconditionsCNF = new EObjectContainmentEList<DNamedPredicate>(DNamedPredicate.class, this, BasePackage.DDOMAIN_EVENT__PRECONDITIONS_CNF);
		}
		return preconditionsCNF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNamedElement> getPostconditionsDNF()
	{
		if (postconditionsDNF == null)
		{
			postconditionsDNF = new EObjectContainmentEList<DNamedElement>(DNamedElement.class, this, BasePackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF);
		}
		return postconditionsDNF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNotification> getNotifications()
	{
		if (notifications == null)
		{
			notifications = new EObjectContainmentEList<DNotification>(DNotification.class, this, BasePackage.DDOMAIN_EVENT__NOTIFICATIONS);
		}
		return notifications;
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
			case BasePackage.DDOMAIN_EVENT__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				return ((InternalEList<?>)getPreconditionsCNF()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				return ((InternalEList<?>)getPostconditionsDNF()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN_EVENT__NOTIFICATIONS:
				return ((InternalEList<?>)getNotifications()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DDOMAIN_EVENT__CONTEXT:
				return getContext();
			case BasePackage.DDOMAIN_EVENT__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case BasePackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				return getPreconditionsCNF();
			case BasePackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				return getPostconditionsDNF();
			case BasePackage.DDOMAIN_EVENT__NOTIFICATIONS:
				return getNotifications();
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
			case BasePackage.DDOMAIN_EVENT__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends DContext>)newValue);
				return;
			case BasePackage.DDOMAIN_EVENT__TRIGGER:
				setTrigger((DActor)newValue);
				return;
			case BasePackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				getPreconditionsCNF().clear();
				getPreconditionsCNF().addAll((Collection<? extends DNamedPredicate>)newValue);
				return;
			case BasePackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				getPostconditionsDNF().clear();
				getPostconditionsDNF().addAll((Collection<? extends DNamedElement>)newValue);
				return;
			case BasePackage.DDOMAIN_EVENT__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends DNotification>)newValue);
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
			case BasePackage.DDOMAIN_EVENT__CONTEXT:
				getContext().clear();
				return;
			case BasePackage.DDOMAIN_EVENT__TRIGGER:
				setTrigger((DActor)null);
				return;
			case BasePackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				getPreconditionsCNF().clear();
				return;
			case BasePackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				getPostconditionsDNF().clear();
				return;
			case BasePackage.DDOMAIN_EVENT__NOTIFICATIONS:
				getNotifications().clear();
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
			case BasePackage.DDOMAIN_EVENT__CONTEXT:
				return context != null && !context.isEmpty();
			case BasePackage.DDOMAIN_EVENT__TRIGGER:
				return trigger != null;
			case BasePackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				return preconditionsCNF != null && !preconditionsCNF.isEmpty();
			case BasePackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				return postconditionsDNF != null && !postconditionsDNF.isEmpty();
			case BasePackage.DDOMAIN_EVENT__NOTIFICATIONS:
				return notifications != null && !notifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DDomainEventImpl
