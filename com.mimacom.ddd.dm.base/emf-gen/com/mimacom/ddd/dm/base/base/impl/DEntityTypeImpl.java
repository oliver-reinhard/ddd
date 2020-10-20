/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DEntityNature;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DState;
import com.mimacom.ddd.dm.base.base.DStateEvent;

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
 * An implementation of the model object '<em><b>DEntity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DEntityTypeImpl extends DComplexTypeImplCustom implements DEntityType
{
	/**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean root = ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final DEntityNature NATURE_EDEFAULT = DEntityNature.CONTROLLED_ENTITY;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected DEntityNature nature = NATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<DState> states;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DStateEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEntityTypeImpl()
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
		return BasePackage.Literals.DENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRoot()
	{
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(boolean newRoot)
	{
		boolean oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DENTITY_TYPE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DEntityNature getNature()
	{
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(DEntityNature newNature)
	{
		DEntityNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DENTITY_TYPE__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DState> getStates()
	{
		if (states == null)
		{
			states = new EObjectContainmentEList<DState>(DState.class, this, BasePackage.DENTITY_TYPE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DStateEvent> getEvents()
	{
		if (events == null)
		{
			events = new EObjectContainmentEList<DStateEvent>(DStateEvent.class, this, BasePackage.DENTITY_TYPE__EVENTS);
		}
		return events;
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
			case BasePackage.DENTITY_TYPE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case BasePackage.DENTITY_TYPE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DENTITY_TYPE__ROOT:
				return isRoot();
			case BasePackage.DENTITY_TYPE__NATURE:
				return getNature();
			case BasePackage.DENTITY_TYPE__STATES:
				return getStates();
			case BasePackage.DENTITY_TYPE__EVENTS:
				return getEvents();
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
			case BasePackage.DENTITY_TYPE__ROOT:
				setRoot((Boolean)newValue);
				return;
			case BasePackage.DENTITY_TYPE__NATURE:
				setNature((DEntityNature)newValue);
				return;
			case BasePackage.DENTITY_TYPE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends DState>)newValue);
				return;
			case BasePackage.DENTITY_TYPE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DStateEvent>)newValue);
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
			case BasePackage.DENTITY_TYPE__ROOT:
				setRoot(ROOT_EDEFAULT);
				return;
			case BasePackage.DENTITY_TYPE__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case BasePackage.DENTITY_TYPE__STATES:
				getStates().clear();
				return;
			case BasePackage.DENTITY_TYPE__EVENTS:
				getEvents().clear();
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
			case BasePackage.DENTITY_TYPE__ROOT:
				return root != ROOT_EDEFAULT;
			case BasePackage.DENTITY_TYPE__NATURE:
				return nature != NATURE_EDEFAULT;
			case BasePackage.DENTITY_TYPE__STATES:
				return states != null && !states.isEmpty();
			case BasePackage.DENTITY_TYPE__EVENTS:
				return events != null && !events.isEmpty();
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
		result.append(" (root: ");
		result.append(root);
		result.append(", nature: ");
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //DEntityTypeImpl
