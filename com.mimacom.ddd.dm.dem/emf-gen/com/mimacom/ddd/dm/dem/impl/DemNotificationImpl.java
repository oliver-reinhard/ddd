/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;

import com.mimacom.ddd.dm.base.base.impl.DNavigableMemberImplCustom;

import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemMessage;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.DemPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemNotificationImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemNotificationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemNotificationImpl#getNotified <em>Notified</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemNotificationImpl extends DNavigableMemberImplCustom implements DemNotification
{
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected DemMessage message;

	/**
	 * The cached value of the '{@link #getNotified() <em>Notified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotified()
	 * @generated
	 * @ordered
	 */
	protected DemActor notified;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemNotificationImpl()
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
		return DemPackage.Literals.DEM_NOTIFICATION;
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
	public DemMessage getMessage()
	{
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(DemMessage newMessage, NotificationChain msgs)
	{
		DemMessage oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemPackage.DEM_NOTIFICATION__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(DemMessage newMessage)
	{
		if (newMessage != message)
		{
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemPackage.DEM_NOTIFICATION__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemPackage.DEM_NOTIFICATION__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DEM_NOTIFICATION__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemActor getNotified()
	{
		if (notified != null && notified.eIsProxy())
		{
			InternalEObject oldNotified = (InternalEObject)notified;
			notified = (DemActor)eResolveProxy(oldNotified);
			if (notified != oldNotified)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemPackage.DEM_NOTIFICATION__NOTIFIED, oldNotified, notified));
			}
		}
		return notified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemActor basicGetNotified()
	{
		return notified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotified(DemActor newNotified)
	{
		DemActor oldNotified = notified;
		notified = newNotified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DEM_NOTIFICATION__NOTIFIED, oldNotified, notified));
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
			case DemPackage.DEM_NOTIFICATION__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case DemPackage.DEM_NOTIFICATION__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case DemPackage.DEM_NOTIFICATION__MESSAGE:
				return getMessage();
			case DemPackage.DEM_NOTIFICATION__NOTIFIED:
				if (resolve) return getNotified();
				return basicGetNotified();
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
			case DemPackage.DEM_NOTIFICATION__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case DemPackage.DEM_NOTIFICATION__MESSAGE:
				setMessage((DemMessage)newValue);
				return;
			case DemPackage.DEM_NOTIFICATION__NOTIFIED:
				setNotified((DemActor)newValue);
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
			case DemPackage.DEM_NOTIFICATION__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case DemPackage.DEM_NOTIFICATION__MESSAGE:
				setMessage((DemMessage)null);
				return;
			case DemPackage.DEM_NOTIFICATION__NOTIFIED:
				setNotified((DemActor)null);
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
			case DemPackage.DEM_NOTIFICATION__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case DemPackage.DEM_NOTIFICATION__MESSAGE:
				return message != null;
			case DemPackage.DEM_NOTIFICATION__NOTIFIED:
				return notified != null;
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
				case DemPackage.DEM_NOTIFICATION__NAVIGABLE_MEMBERS: return BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;
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
				case BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS: return DemPackage.DEM_NOTIFICATION__NAVIGABLE_MEMBERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DemNotificationImpl
