/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DNamedElement;

import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SFuse Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SFuseRuleImpl#getOtherSources <em>Other Sources</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SFuseRuleImpl#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SFuseRuleImpl extends SGrabRuleImpl implements SFuseRule
{
	/**
	 * The cached value of the '{@link #getOtherSources() <em>Other Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSources()
	 * @generated
	 * @ordered
	 */
	protected EList<DNamedElement> otherSources;

	/**
	 * The cached value of the '{@link #getExtendFrom() <em>Extend From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendFrom()
	 * @generated
	 * @ordered
	 */
	protected SType extendFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SFuseRuleImpl()
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
		return SimPackage.Literals.SFUSE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNamedElement> getOtherSources()
	{
		if (otherSources == null)
		{
			otherSources = new EObjectResolvingEList<DNamedElement>(DNamedElement.class, this, SimPackage.SFUSE_RULE__OTHER_SOURCES);
		}
		return otherSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SType getExtendFrom()
	{
		if (extendFrom != null && extendFrom.eIsProxy())
		{
			InternalEObject oldExtendFrom = (InternalEObject)extendFrom;
			extendFrom = (SType)eResolveProxy(oldExtendFrom);
			if (extendFrom != oldExtendFrom)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SFUSE_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
			}
		}
		return extendFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SType basicGetExtendFrom()
	{
		return extendFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendFrom(SType newExtendFrom)
	{
		SType oldExtendFrom = extendFrom;
		extendFrom = newExtendFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SFUSE_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
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
			case SimPackage.SFUSE_RULE__OTHER_SOURCES:
				return getOtherSources();
			case SimPackage.SFUSE_RULE__EXTEND_FROM:
				if (resolve) return getExtendFrom();
				return basicGetExtendFrom();
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
			case SimPackage.SFUSE_RULE__OTHER_SOURCES:
				getOtherSources().clear();
				getOtherSources().addAll((Collection<? extends DNamedElement>)newValue);
				return;
			case SimPackage.SFUSE_RULE__EXTEND_FROM:
				setExtendFrom((SType)newValue);
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
			case SimPackage.SFUSE_RULE__OTHER_SOURCES:
				getOtherSources().clear();
				return;
			case SimPackage.SFUSE_RULE__EXTEND_FROM:
				setExtendFrom((SType)null);
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
			case SimPackage.SFUSE_RULE__OTHER_SOURCES:
				return otherSources != null && !otherSources.isEmpty();
			case SimPackage.SFUSE_RULE__EXTEND_FROM:
				return extendFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //SFuseRuleImpl
