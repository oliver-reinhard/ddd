/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.IDeducibleElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDeduction Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDeductionRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDeductionRuleImpl#getNamedSource <em>Named Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DDeductionRuleImpl extends MinimalEObjectImpl.Container implements DDeductionRule
{
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IDeducibleElement source;

	/**
	 * The cached value of the '{@link #getNamedSource() <em>Named Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedSource()
	 * @generated
	 * @ordered
	 */
	protected DNamedElement namedSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDeductionRuleImpl()
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
		return BasePackage.Literals.DDEDUCTION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDeducibleElement getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (IDeducibleElement)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DDEDUCTION_RULE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDeducibleElement basicGetSource()
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(IDeducibleElement newSource)
	{
		IDeducibleElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DDEDUCTION_RULE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamedElement getNamedSource()
	{
		return namedSource;
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
			case BasePackage.DDEDUCTION_RULE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case BasePackage.DDEDUCTION_RULE__NAMED_SOURCE:
				return getNamedSource();
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
			case BasePackage.DDEDUCTION_RULE__SOURCE:
				setSource((IDeducibleElement)newValue);
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
			case BasePackage.DDEDUCTION_RULE__SOURCE:
				setSource((IDeducibleElement)null);
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
			case BasePackage.DDEDUCTION_RULE__SOURCE:
				return source != null;
			case BasePackage.DDEDUCTION_RULE__NAMED_SOURCE:
				return namedSource != null;
		}
		return super.eIsSet(featureID);
	}

} //DDeductionRuleImpl
