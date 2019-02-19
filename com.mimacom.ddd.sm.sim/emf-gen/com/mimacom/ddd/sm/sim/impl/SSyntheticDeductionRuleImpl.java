/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SSynthetic Deduction Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SSyntheticDeductionRuleImpl#getElementWithExplicitRule <em>Element With Explicit Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSyntheticDeductionRuleImpl extends SDeductionRuleImplCustom implements SSyntheticDeductionRule
{
	/**
	 * The cached value of the '{@link #getElementWithExplicitRule() <em>Element With Explicit Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementWithExplicitRule()
	 * @generated
	 * @ordered
	 */
	protected EObject elementWithExplicitRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SSyntheticDeductionRuleImpl()
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
		return SimPackage.Literals.SSYNTHETIC_DEDUCTION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getElementWithExplicitRule()
	{
		if (elementWithExplicitRule != null && elementWithExplicitRule.eIsProxy())
		{
			InternalEObject oldElementWithExplicitRule = (InternalEObject)elementWithExplicitRule;
			elementWithExplicitRule = eResolveProxy(oldElementWithExplicitRule);
			if (elementWithExplicitRule != oldElementWithExplicitRule)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_EXPLICIT_RULE, oldElementWithExplicitRule, elementWithExplicitRule));
			}
		}
		return elementWithExplicitRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetElementWithExplicitRule()
	{
		return elementWithExplicitRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementWithExplicitRule(EObject newElementWithExplicitRule)
	{
		EObject oldElementWithExplicitRule = elementWithExplicitRule;
		elementWithExplicitRule = newElementWithExplicitRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_EXPLICIT_RULE, oldElementWithExplicitRule, elementWithExplicitRule));
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_EXPLICIT_RULE:
				if (resolve) return getElementWithExplicitRule();
				return basicGetElementWithExplicitRule();
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_EXPLICIT_RULE:
				setElementWithExplicitRule((EObject)newValue);
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_EXPLICIT_RULE:
				setElementWithExplicitRule((EObject)null);
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_EXPLICIT_RULE:
				return elementWithExplicitRule != null;
		}
		return super.eIsSet(featureID);
	}

} //SSyntheticDeductionRuleImpl
