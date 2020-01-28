/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DInformationModel;

import com.mimacom.ddd.dm.base.impl.DDeductionRuleImplCustom;

import com.mimacom.ddd.sm.sim.SGrabModelRule;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGrab Model Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SGrabModelRuleImpl#getDModel <em>DModel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrabModelRuleImpl extends DDeductionRuleImplCustom implements SGrabModelRule
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrabModelRuleImpl()
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
		return SimPackage.Literals.SGRAB_MODEL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DInformationModel getDModel()
	{
		// TODO: implement this method to return the 'DModel' reference
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
			case SimPackage.SGRAB_MODEL_RULE__DMODEL:
				return getDModel();
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
			case SimPackage.SGRAB_MODEL_RULE__DMODEL:
				return getDModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //SGrabModelRuleImpl
