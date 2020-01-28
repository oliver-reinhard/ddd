/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.IDeductionDefinition;

import com.mimacom.ddd.sm.sim.SImplicitElementDeduction;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SImplicit Element Deduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SImplicitElementDeductionImpl#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SImplicitElementDeductionImpl#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SImplicitElementDeductionImpl extends MinimalEObjectImpl.Container implements SImplicitElementDeduction
{
	/**
	 * The cached value of the '{@link #getDeductionRule() <em>Deduction Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionRule()
	 * @generated
	 * @ordered
	 */
	protected DDeductionRule deductionRule;

	/**
	 * The cached value of the '{@link #getOriginalDeductionDefinition() <em>Original Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalDeductionDefinition()
	 * @generated
	 * @ordered
	 */
	protected IDeductionDefinition originalDeductionDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SImplicitElementDeductionImpl()
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
		return SimPackage.Literals.SIMPLICIT_ELEMENT_DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDeductionRule getDeductionRule()
	{
		return deductionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeductionRule(DDeductionRule newDeductionRule, NotificationChain msgs)
	{
		DDeductionRule oldDeductionRule = deductionRule;
		deductionRule = newDeductionRule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE, oldDeductionRule, newDeductionRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeductionRule(DDeductionRule newDeductionRule)
	{
		if (newDeductionRule != deductionRule)
		{
			NotificationChain msgs = null;
			if (deductionRule != null)
				msgs = ((InternalEObject)deductionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE, null, msgs);
			if (newDeductionRule != null)
				msgs = ((InternalEObject)newDeductionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE, null, msgs);
			msgs = basicSetDeductionRule(newDeductionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE, newDeductionRule, newDeductionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDeductionDefinition getOriginalDeductionDefinition()
	{
		if (originalDeductionDefinition != null && originalDeductionDefinition.eIsProxy())
		{
			InternalEObject oldOriginalDeductionDefinition = (InternalEObject)originalDeductionDefinition;
			originalDeductionDefinition = (IDeductionDefinition)eResolveProxy(oldOriginalDeductionDefinition);
			if (originalDeductionDefinition != oldOriginalDeductionDefinition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION, oldOriginalDeductionDefinition, originalDeductionDefinition));
			}
		}
		return originalDeductionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDeductionDefinition basicGetOriginalDeductionDefinition()
	{
		return originalDeductionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalDeductionDefinition(IDeductionDefinition newOriginalDeductionDefinition)
	{
		IDeductionDefinition oldOriginalDeductionDefinition = originalDeductionDefinition;
		originalDeductionDefinition = newOriginalDeductionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION, oldOriginalDeductionDefinition, originalDeductionDefinition));
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
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE:
				return basicSetDeductionRule(null, msgs);
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
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE:
				return getDeductionRule();
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION:
				if (resolve) return getOriginalDeductionDefinition();
				return basicGetOriginalDeductionDefinition();
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
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE:
				setDeductionRule((DDeductionRule)newValue);
				return;
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION:
				setOriginalDeductionDefinition((IDeductionDefinition)newValue);
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
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE:
				setDeductionRule((DDeductionRule)null);
				return;
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION:
				setOriginalDeductionDefinition((IDeductionDefinition)null);
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
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__DEDUCTION_RULE:
				return deductionRule != null;
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION:
				return originalDeductionDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //SImplicitElementDeductionImpl
