/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SSyntheticDeductionRuleImpl#getElementWithRule <em>Element With Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SSyntheticDeductionRuleImpl extends SDeductionRuleImplCustom implements SSyntheticDeductionRule
{
	/**
	 * The cached value of the '{@link #getElementWithRule() <em>Element With Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementWithRule()
	 * @generated
	 * @ordered
	 */
	protected SDeducibleElement elementWithRule;

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
	public SDeducibleElement getElementWithRule()
	{
		if (elementWithRule != null && elementWithRule.eIsProxy())
		{
			InternalEObject oldElementWithRule = (InternalEObject)elementWithRule;
			elementWithRule = (SDeducibleElement)eResolveProxy(oldElementWithRule);
			if (elementWithRule != oldElementWithRule)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE, oldElementWithRule, elementWithRule));
			}
		}
		return elementWithRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDeducibleElement basicGetElementWithRule()
	{
		return elementWithRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementWithRule(SDeducibleElement newElementWithRule)
	{
		SDeducibleElement oldElementWithRule = elementWithRule;
		elementWithRule = newElementWithRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE, oldElementWithRule, elementWithRule));
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE:
				if (resolve) return getElementWithRule();
				return basicGetElementWithRule();
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE:
				setElementWithRule((SDeducibleElement)newValue);
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE:
				setElementWithRule((SDeducibleElement)null);
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
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE:
				return elementWithRule != null;
		}
		return super.eIsSet(featureID);
	}

} //SSyntheticDeductionRuleImpl
