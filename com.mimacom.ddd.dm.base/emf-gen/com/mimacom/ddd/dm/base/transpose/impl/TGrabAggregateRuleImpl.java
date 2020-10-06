/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.DAggregate;

import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGrab Aggregate Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TGrabAggregateRuleImpl#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGrabAggregateRuleImpl extends TRenameRuleImpl implements TGrabAggregateRule
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGrabAggregateRuleImpl()
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
		return TransposePackage.Literals.TGRAB_AGGREGATE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAggregate getAggregate()
	{
		// TODO: implement this method to return the 'Aggregate' reference
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
			case TransposePackage.TGRAB_AGGREGATE_RULE__AGGREGATE:
				return getAggregate();
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
			case TransposePackage.TGRAB_AGGREGATE_RULE__AGGREGATE:
				return getAggregate() != null;
		}
		return super.eIsSet(featureID);
	}

} //TGrabAggregateRuleImpl
