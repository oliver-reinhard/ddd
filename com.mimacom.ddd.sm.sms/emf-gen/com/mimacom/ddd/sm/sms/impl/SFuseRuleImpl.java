/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms.impl;

import com.mimacom.ddd.dm.base.DNamedElement;

import com.mimacom.ddd.sm.sms.SFuseRule;
import com.mimacom.ddd.sm.sms.SType;
import com.mimacom.ddd.sm.sms.SmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SFuse Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sms.impl.SFuseRuleImpl#getSource2 <em>Source2</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sms.impl.SFuseRuleImpl#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SFuseRuleImpl extends SGrabRuleImpl implements SFuseRule
{
	/**
	 * The cached value of the '{@link #getSource2() <em>Source2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource2()
	 * @generated
	 * @ordered
	 */
	protected DNamedElement source2;

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
		return SmsPackage.Literals.SFUSE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamedElement getSource2()
	{
		if (source2 != null && source2.eIsProxy())
		{
			InternalEObject oldSource2 = (InternalEObject)source2;
			source2 = (DNamedElement)eResolveProxy(oldSource2);
			if (source2 != oldSource2)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmsPackage.SFUSE_RULE__SOURCE2, oldSource2, source2));
			}
		}
		return source2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNamedElement basicGetSource2()
	{
		return source2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource2(DNamedElement newSource2)
	{
		DNamedElement oldSource2 = source2;
		source2 = newSource2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmsPackage.SFUSE_RULE__SOURCE2, oldSource2, source2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmsPackage.SFUSE_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmsPackage.SFUSE_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
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
			case SmsPackage.SFUSE_RULE__SOURCE2:
				if (resolve) return getSource2();
				return basicGetSource2();
			case SmsPackage.SFUSE_RULE__EXTEND_FROM:
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
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SmsPackage.SFUSE_RULE__SOURCE2:
				setSource2((DNamedElement)newValue);
				return;
			case SmsPackage.SFUSE_RULE__EXTEND_FROM:
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
			case SmsPackage.SFUSE_RULE__SOURCE2:
				setSource2((DNamedElement)null);
				return;
			case SmsPackage.SFUSE_RULE__EXTEND_FROM:
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
			case SmsPackage.SFUSE_RULE__SOURCE2:
				return source2 != null;
			case SmsPackage.SFUSE_RULE__EXTEND_FROM:
				return extendFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //SFuseRuleImpl
