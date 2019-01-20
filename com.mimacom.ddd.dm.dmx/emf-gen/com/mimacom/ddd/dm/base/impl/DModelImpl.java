/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DFunction;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.IValueType;

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
 * An implementation of the model object '<em><b>DModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DModelImpl#getGlobalTypes <em>Global Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DModelImpl#getGlobalFunctions <em>Global Functions</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DModelImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DModelImpl extends MinimalEObjectImpl.Container implements DModel
{
	/**
	 * The cached value of the '{@link #getGlobalTypes() <em>Global Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<IValueType> globalTypes;

	/**
	 * The cached value of the '{@link #getGlobalFunctions() <em>Global Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DFunction> globalFunctions;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DDomain domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DModelImpl()
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
		return BasePackage.Literals.DMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IValueType> getGlobalTypes()
	{
		if (globalTypes == null)
		{
			globalTypes = new EObjectContainmentEList<IValueType>(IValueType.class, this, BasePackage.DMODEL__GLOBAL_TYPES);
		}
		return globalTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DFunction> getGlobalFunctions()
	{
		if (globalFunctions == null)
		{
			globalFunctions = new EObjectContainmentEList<DFunction>(DFunction.class, this, BasePackage.DMODEL__GLOBAL_FUNCTIONS);
		}
		return globalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDomain getDomain()
	{
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(DDomain newDomain, NotificationChain msgs)
	{
		DDomain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DMODEL__DOMAIN, oldDomain, newDomain);
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
	public void setDomain(DDomain newDomain)
	{
		if (newDomain != domain)
		{
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DMODEL__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DMODEL__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DMODEL__DOMAIN, newDomain, newDomain));
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
			case BasePackage.DMODEL__GLOBAL_TYPES:
				return ((InternalEList<?>)getGlobalTypes()).basicRemove(otherEnd, msgs);
			case BasePackage.DMODEL__GLOBAL_FUNCTIONS:
				return ((InternalEList<?>)getGlobalFunctions()).basicRemove(otherEnd, msgs);
			case BasePackage.DMODEL__DOMAIN:
				return basicSetDomain(null, msgs);
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
			case BasePackage.DMODEL__GLOBAL_TYPES:
				return getGlobalTypes();
			case BasePackage.DMODEL__GLOBAL_FUNCTIONS:
				return getGlobalFunctions();
			case BasePackage.DMODEL__DOMAIN:
				return getDomain();
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
			case BasePackage.DMODEL__GLOBAL_TYPES:
				getGlobalTypes().clear();
				getGlobalTypes().addAll((Collection<? extends IValueType>)newValue);
				return;
			case BasePackage.DMODEL__GLOBAL_FUNCTIONS:
				getGlobalFunctions().clear();
				getGlobalFunctions().addAll((Collection<? extends DFunction>)newValue);
				return;
			case BasePackage.DMODEL__DOMAIN:
				setDomain((DDomain)newValue);
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
			case BasePackage.DMODEL__GLOBAL_TYPES:
				getGlobalTypes().clear();
				return;
			case BasePackage.DMODEL__GLOBAL_FUNCTIONS:
				getGlobalFunctions().clear();
				return;
			case BasePackage.DMODEL__DOMAIN:
				setDomain((DDomain)null);
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
			case BasePackage.DMODEL__GLOBAL_TYPES:
				return globalTypes != null && !globalTypes.isEmpty();
			case BasePackage.DMODEL__GLOBAL_FUNCTIONS:
				return globalFunctions != null && !globalFunctions.isEmpty();
			case BasePackage.DMODEL__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //DModelImpl
