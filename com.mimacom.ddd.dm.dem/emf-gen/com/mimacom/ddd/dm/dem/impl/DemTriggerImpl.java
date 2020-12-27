/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.base.DNote;

import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemPackage;
import com.mimacom.ddd.dm.dem.DemTrigger;

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
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemTriggerImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemTriggerImpl#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemTriggerImpl extends MinimalEObjectImpl.Container implements DemTrigger
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
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected DemActor actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemTriggerImpl()
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
		return DemPackage.Literals.DEM_TRIGGER;
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
			notes = new EObjectContainmentEList<DNote>(DNote.class, this, DemPackage.DEM_TRIGGER__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemActor getActor()
	{
		if (actor != null && actor.eIsProxy())
		{
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (DemActor)eResolveProxy(oldActor);
			if (actor != oldActor)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemPackage.DEM_TRIGGER__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemActor basicGetActor()
	{
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(DemActor newActor)
	{
		DemActor oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DEM_TRIGGER__ACTOR, oldActor, actor));
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
			case DemPackage.DEM_TRIGGER__NOTES:
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
			case DemPackage.DEM_TRIGGER__NOTES:
				return getNotes();
			case DemPackage.DEM_TRIGGER__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
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
			case DemPackage.DEM_TRIGGER__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends DNote>)newValue);
				return;
			case DemPackage.DEM_TRIGGER__ACTOR:
				setActor((DemActor)newValue);
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
			case DemPackage.DEM_TRIGGER__NOTES:
				getNotes().clear();
				return;
			case DemPackage.DEM_TRIGGER__ACTOR:
				setActor((DemActor)null);
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
			case DemPackage.DEM_TRIGGER__NOTES:
				return notes != null && !notes.isEmpty();
			case DemPackage.DEM_TRIGGER__ACTOR:
				return actor != null;
		}
		return super.eIsSet(featureID);
	}

} //DemTriggerImpl
