/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;

import com.mimacom.ddd.dm.dem.DActor;
import com.mimacom.ddd.dm.dem.DDomainEvent;
import com.mimacom.ddd.dm.dem.DNotification;
import com.mimacom.ddd.dm.dem.DemPackage;

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
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl#getPreconditionsCNF <em>Preconditions CNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl#getPostconditionsDNF <em>Postconditions DNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DDomainEventImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDomainEventImpl extends DemModelImpl implements DDomainEvent
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
		return DemPackage.Literals.DDOMAIN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNavigableMember> getNavigableMembers()
	{
		// TODO: implement this method to return the 'Navigable Members' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DContext> getContext()
	{
		if (context == null)
		{
			context = new EObjectContainmentEList<DContext>(DContext.class, this, DemPackage.DDOMAIN_EVENT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DActor getTrigger()
	{
		if (trigger != null && trigger.eIsProxy())
		{
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (DActor)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemPackage.DDOMAIN_EVENT__TRIGGER, oldTrigger, trigger));
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
	@Override
	public void setTrigger(DActor newTrigger)
	{
		DActor oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DDOMAIN_EVENT__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNamedPredicate> getPreconditionsCNF()
	{
		if (preconditionsCNF == null)
		{
			preconditionsCNF = new EObjectContainmentEList<DNamedPredicate>(DNamedPredicate.class, this, DemPackage.DDOMAIN_EVENT__PRECONDITIONS_CNF);
		}
		return preconditionsCNF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNamedElement> getPostconditionsDNF()
	{
		if (postconditionsDNF == null)
		{
			postconditionsDNF = new EObjectContainmentEList<DNamedElement>(DNamedElement.class, this, DemPackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF);
		}
		return postconditionsDNF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNotification> getNotifications()
	{
		if (notifications == null)
		{
			notifications = new EObjectContainmentEList<DNotification>(DNotification.class, this, DemPackage.DDOMAIN_EVENT__NOTIFICATIONS);
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
			case DemPackage.DDOMAIN_EVENT__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case DemPackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				return ((InternalEList<?>)getPreconditionsCNF()).basicRemove(otherEnd, msgs);
			case DemPackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				return ((InternalEList<?>)getPostconditionsDNF()).basicRemove(otherEnd, msgs);
			case DemPackage.DDOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DDOMAIN_EVENT__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case DemPackage.DDOMAIN_EVENT__CONTEXT:
				return getContext();
			case DemPackage.DDOMAIN_EVENT__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case DemPackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				return getPreconditionsCNF();
			case DemPackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				return getPostconditionsDNF();
			case DemPackage.DDOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DDOMAIN_EVENT__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case DemPackage.DDOMAIN_EVENT__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends DContext>)newValue);
				return;
			case DemPackage.DDOMAIN_EVENT__TRIGGER:
				setTrigger((DActor)newValue);
				return;
			case DemPackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				getPreconditionsCNF().clear();
				getPreconditionsCNF().addAll((Collection<? extends DNamedPredicate>)newValue);
				return;
			case DemPackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				getPostconditionsDNF().clear();
				getPostconditionsDNF().addAll((Collection<? extends DNamedElement>)newValue);
				return;
			case DemPackage.DDOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DDOMAIN_EVENT__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case DemPackage.DDOMAIN_EVENT__CONTEXT:
				getContext().clear();
				return;
			case DemPackage.DDOMAIN_EVENT__TRIGGER:
				setTrigger((DActor)null);
				return;
			case DemPackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				getPreconditionsCNF().clear();
				return;
			case DemPackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				getPostconditionsDNF().clear();
				return;
			case DemPackage.DDOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DDOMAIN_EVENT__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case DemPackage.DDOMAIN_EVENT__CONTEXT:
				return context != null && !context.isEmpty();
			case DemPackage.DDOMAIN_EVENT__TRIGGER:
				return trigger != null;
			case DemPackage.DDOMAIN_EVENT__PRECONDITIONS_CNF:
				return preconditionsCNF != null && !preconditionsCNF.isEmpty();
			case DemPackage.DDOMAIN_EVENT__POSTCONDITIONS_DNF:
				return postconditionsDNF != null && !postconditionsDNF.isEmpty();
			case DemPackage.DDOMAIN_EVENT__NOTIFICATIONS:
				return notifications != null && !notifications.isEmpty();
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
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (derivedFeatureID)
			{
				case DemPackage.DDOMAIN_EVENT__NAVIGABLE_MEMBERS: return BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == IStaticReferenceTarget.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == IDiagramRoot.class)
		{
			switch (derivedFeatureID)
			{
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
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS: return DemPackage.DDOMAIN_EVENT__NAVIGABLE_MEMBERS;
				default: return -1;
			}
		}
		if (baseClass == IStaticReferenceTarget.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == IDiagramRoot.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DDomainEventImpl
