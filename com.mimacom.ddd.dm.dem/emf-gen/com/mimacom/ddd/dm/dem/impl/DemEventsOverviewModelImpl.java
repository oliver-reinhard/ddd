/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.impl.DModelImpl;

import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel;
import com.mimacom.ddd.dm.dem.DemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Events Overview Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
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
	@Override
	public boolean isAll()
	{
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (all: ");
		result.append(all);
		result.append(')');
		return result.toString();
	}

} //DemEventsOverviewModelImpl
