/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DImplicitDeduction;
import com.mimacom.ddd.dm.base.IDeductionDefinition;

import com.mimacom.ddd.dm.base.impl.DDetailTypeImpl;

import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SDetailTypeDeduction;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.SimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDetail Type Deduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SDetailTypeDeductionImpl#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SDetailTypeDeductionImpl#getImpliedDeductions <em>Implied Deductions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDetailTypeDeductionImpl extends DDetailTypeImpl implements SDetailTypeDeduction
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
	 * The cached value of the '{@link #getImpliedDeductions() <em>Implied Deductions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpliedDeductions()
	 * @generated
	 * @ordered
	 */
	protected EList<DImplicitDeduction> impliedDeductions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDetailTypeDeductionImpl()
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
		return SimPackage.Literals.SDETAIL_TYPE_DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE, oldDeductionRule, newDeductionRule);
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
	public void setDeductionRule(DDeductionRule newDeductionRule)
	{
		if (newDeductionRule != deductionRule)
		{
			NotificationChain msgs = null;
			if (deductionRule != null)
				msgs = ((InternalEObject)deductionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE, null, msgs);
			if (newDeductionRule != null)
				msgs = ((InternalEObject)newDeductionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE, null, msgs);
			msgs = basicSetDeductionRule(newDeductionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE, newDeductionRule, newDeductionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DImplicitDeduction> getImpliedDeductions()
	{
		if (impliedDeductions == null)
		{
			impliedDeductions = new EObjectContainmentEList<DImplicitDeduction>(DImplicitDeduction.class, this, SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS);
		}
		return impliedDeductions;
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
			case SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE:
				return basicSetDeductionRule(null, msgs);
			case SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS:
				return ((InternalEList<?>)getImpliedDeductions()).basicRemove(otherEnd, msgs);
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
			case SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE:
				return getDeductionRule();
			case SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS:
				return getImpliedDeductions();
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
			case SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE:
				setDeductionRule((DDeductionRule)newValue);
				return;
			case SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS:
				getImpliedDeductions().clear();
				getImpliedDeductions().addAll((Collection<? extends DImplicitDeduction>)newValue);
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
			case SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE:
				setDeductionRule((DDeductionRule)null);
				return;
			case SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS:
				getImpliedDeductions().clear();
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
			case SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE:
				return deductionRule != null;
			case SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS:
				return impliedDeductions != null && !impliedDeductions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == IDeductionDefinition.class)
		{
			switch (derivedFeatureID)
			{
				case SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE: return BasePackage.IDEDUCTION_DEFINITION__DEDUCTION_RULE;
				case SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS: return BasePackage.IDEDUCTION_DEFINITION__IMPLIED_DEDUCTIONS;
				default: return -1;
			}
		}
		if (baseClass == STypeDeduction.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == SComplexTypeDeduction.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == IDeductionDefinition.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.IDEDUCTION_DEFINITION__DEDUCTION_RULE: return SimPackage.SDETAIL_TYPE_DEDUCTION__DEDUCTION_RULE;
				case BasePackage.IDEDUCTION_DEFINITION__IMPLIED_DEDUCTIONS: return SimPackage.SDETAIL_TYPE_DEDUCTION__IMPLIED_DEDUCTIONS;
				default: return -1;
			}
		}
		if (baseClass == STypeDeduction.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == SComplexTypeDeduction.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SDetailTypeDeductionImpl
