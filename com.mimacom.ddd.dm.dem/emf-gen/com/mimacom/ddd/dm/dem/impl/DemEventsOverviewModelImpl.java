/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DNote;
import com.mimacom.ddd.dm.base.base.INoteContainer;

import com.mimacom.ddd.dm.base.base.impl.DModelImpl;

import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel;
import com.mimacom.ddd.dm.dem.DemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Events Overview Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl#isAll <em>All</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemEventsOverviewModelImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemEventsOverviewModelImpl extends DModelImpl implements DemEventsOverviewModel
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
	 * The default value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAll() <em>All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAll()
	 * @generated
	 * @ordered
	 */
	protected boolean all = ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<DemDomainEvent> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<DemDomainEvent> exclude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemEventsOverviewModelImpl()
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
		return DemPackage.Literals.DEM_EVENTS_OVERVIEW_MODEL;
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
			notes = new EObjectContainmentEList<DNote>(DNote.class, this, DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAll()
	{
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAll(boolean newAll)
	{
		boolean oldAll = all;
		all = newAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DEM_EVENTS_OVERVIEW_MODEL__ALL, oldAll, all));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DemDomainEvent> getInclude()
	{
		if (include == null)
		{
			include = new EObjectResolvingEList<DemDomainEvent>(DemDomainEvent.class, this, DemPackage.DEM_EVENTS_OVERVIEW_MODEL__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DemDomainEvent> getExclude()
	{
		if (exclude == null)
		{
			exclude = new EObjectResolvingEList<DemDomainEvent>(DemDomainEvent.class, this, DemPackage.DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE);
		}
		return exclude;
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
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES:
				return getNotes();
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__ALL:
				return isAll();
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__INCLUDE:
				return getInclude();
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE:
				return getExclude();
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
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends DNote>)newValue);
				return;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__ALL:
				setAll((Boolean)newValue);
				return;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends DemDomainEvent>)newValue);
				return;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends DemDomainEvent>)newValue);
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
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES:
				getNotes().clear();
				return;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__ALL:
				setAll(ALL_EDEFAULT);
				return;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__INCLUDE:
				getInclude().clear();
				return;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE:
				getExclude().clear();
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
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES:
				return notes != null && !notes.isEmpty();
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__ALL:
				return all != ALL_EDEFAULT;
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__INCLUDE:
				return include != null && !include.isEmpty();
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
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
				case DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES: return BasePackage.INOTE_CONTAINER__NOTES;
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
				case BasePackage.INOTE_CONTAINER__NOTES: return DemPackage.DEM_EVENTS_OVERVIEW_MODEL__NOTES;
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
		result.append(" (all: ");
		result.append(all);
		result.append(')');
		return result.toString();
	}

} //DemEventsOverviewModelImpl
