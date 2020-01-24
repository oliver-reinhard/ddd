/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DDomain;

import com.mimacom.ddd.dm.base.impl.DDeductionRuleImplCustom;

import com.mimacom.ddd.sm.sim.SGrabDomainRule;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGrab Domain Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SGrabDomainRuleImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrabDomainRuleImpl extends DDeductionRuleImplCustom implements SGrabDomainRule
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrabDomainRuleImpl()
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
		return SimPackage.Literals.SGRAB_DOMAIN_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDomain getDomain()
	{
		// TODO: implement this method to return the 'Domain' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SimPackage.SGRAB_DOMAIN_RULE__DOMAIN:
				return getDomain();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case SimPackage.SGRAB_DOMAIN_RULE__DOMAIN:
				return getDomain() != null;
		}
		return super.eIsSet(featureID);
	}

} //SGrabDomainRuleImpl
