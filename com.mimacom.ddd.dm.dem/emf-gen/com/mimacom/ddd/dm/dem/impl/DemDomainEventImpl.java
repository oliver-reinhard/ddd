/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DContext;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.base.INoteContainer;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;

import com.mimacom.ddd.dm.base.base.impl.DModelImpl;

import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.DemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getContext <em>Context</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getPreconditionsCNF <em>Preconditions CNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getPostconditionsDNF <em>Postconditions DNF</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemDomainEventImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemDomainEventImpl extends DModelImpl implements DemDomainEvent
{
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<DContext> context;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<DemActor> triggers;

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
	protected EList<DemNotification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemDomainEventImpl()
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
		return DemPackage.Literals.DEM_DOMAIN_EVENT;
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
			notes = new EObjectContainmentEList<DNote>(DNote.class, this, DemPackage.DEM_DOMAIN_EVENT__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<DContext> getContext()
	{
		if (context == null)
		{
			context = new EObjectContainmentEList<DContext>(DContext.class, this, DemPackage.DEM_DOMAIN_EVENT__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DemActor> getTriggers()
	{
		if (triggers == null)
		{
			triggers = new EObjectResolvingEList<DemActor>(DemActor.class, this, DemPackage.DEM_DOMAIN_EVENT__TRIGGERS);
		}
		return triggers;
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
			preconditionsCNF = new EObjectContainmentEList<DNamedPredicate>(DNamedPredicate.class, this, DemPackage.DEM_DOMAIN_EVENT__PRECONDITIONS_CNF);
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
			postconditionsDNF = new EObjectContainmentEList<DNamedElement>(DNamedElement.class, this, DemPackage.DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF);
		}
		return postconditionsDNF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DemNotification> getNotifications()
	{
		if (notifications == null)
		{
			notifications = new EObjectContainmentEList<DemNotification>(DemNotification.class, this, DemPackage.DEM_DOMAIN_EVENT__NOTIFICATIONS);
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
			case DemPackage.DEM_DOMAIN_EVENT__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case DemPackage.DEM_DOMAIN_EVENT__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case DemPackage.DEM_DOMAIN_EVENT__PRECONDITIONS_CNF:
				return ((InternalEList<?>)getPreconditionsCNF()).basicRemove(otherEnd, msgs);
			case DemPackage.DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF:
				return ((InternalEList<?>)getPostconditionsDNF()).basicRemove(otherEnd, msgs);
			case DemPackage.DEM_DOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DEM_DOMAIN_EVENT__NOTES:
				return getNotes();
			case DemPackage.DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case DemPackage.DEM_DOMAIN_EVENT__CONTEXT:
				return getContext();
			case DemPackage.DEM_DOMAIN_EVENT__TRIGGERS:
				return getTriggers();
			case DemPackage.DEM_DOMAIN_EVENT__PRECONDITIONS_CNF:
				return getPreconditionsCNF();
			case DemPackage.DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF:
				return getPostconditionsDNF();
			case DemPackage.DEM_DOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DEM_DOMAIN_EVENT__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends DNote>)newValue);
				return;
			case DemPackage.DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case DemPackage.DEM_DOMAIN_EVENT__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends DContext>)newValue);
				return;
			case DemPackage.DEM_DOMAIN_EVENT__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends DemActor>)newValue);
				return;
			case DemPackage.DEM_DOMAIN_EVENT__PRECONDITIONS_CNF:
				getPreconditionsCNF().clear();
				getPreconditionsCNF().addAll((Collection<? extends DNamedPredicate>)newValue);
				return;
			case DemPackage.DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF:
				getPostconditionsDNF().clear();
				getPostconditionsDNF().addAll((Collection<? extends DNamedElement>)newValue);
				return;
			case DemPackage.DEM_DOMAIN_EVENT__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends DemNotification>)newValue);
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
			case DemPackage.DEM_DOMAIN_EVENT__NOTES:
				getNotes().clear();
				return;
			case DemPackage.DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case DemPackage.DEM_DOMAIN_EVENT__CONTEXT:
				getContext().clear();
				return;
			case DemPackage.DEM_DOMAIN_EVENT__TRIGGERS:
				getTriggers().clear();
				return;
			case DemPackage.DEM_DOMAIN_EVENT__PRECONDITIONS_CNF:
				getPreconditionsCNF().clear();
				return;
			case DemPackage.DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF:
				getPostconditionsDNF().clear();
				return;
			case DemPackage.DEM_DOMAIN_EVENT__NOTIFICATIONS:
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
			case DemPackage.DEM_DOMAIN_EVENT__NOTES:
				return notes != null && !notes.isEmpty();
			case DemPackage.DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case DemPackage.DEM_DOMAIN_EVENT__CONTEXT:
				return context != null && !context.isEmpty();
			case DemPackage.DEM_DOMAIN_EVENT__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
			case DemPackage.DEM_DOMAIN_EVENT__PRECONDITIONS_CNF:
				return preconditionsCNF != null && !preconditionsCNF.isEmpty();
			case DemPackage.DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF:
				return postconditionsDNF != null && !postconditionsDNF.isEmpty();
			case DemPackage.DEM_DOMAIN_EVENT__NOTIFICATIONS:
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
		if (baseClass == INoteContainer.class)
		{
			switch (derivedFeatureID)
			{
				case DemPackage.DEM_DOMAIN_EVENT__NOTES: return BasePackage.INOTE_CONTAINER__NOTES;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (derivedFeatureID)
			{
				case DemPackage.DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS: return BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;
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
		if (baseClass == INoteContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INOTE_CONTAINER__NOTES: return DemPackage.DEM_DOMAIN_EVENT__NOTES;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS: return DemPackage.DEM_DOMAIN_EVENT__NAVIGABLE_MEMBERS;
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

} //DemDomainEventImpl
