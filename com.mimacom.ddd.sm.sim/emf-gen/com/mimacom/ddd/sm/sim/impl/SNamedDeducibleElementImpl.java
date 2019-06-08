/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SNamedDeducibleElement;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SNamed Deducible Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SNamedDeducibleElementImpl#isSynthetic <em>Synthetic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SNamedDeducibleElementImpl extends SNamedElementImpl implements SNamedDeducibleElement
{
	/**
	 * The cached value of the '{@link #getDeductionRule() <em>Deduction Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionRule()
	 * @generated
	 * @ordered
	 */
	protected SDeductionRule deductionRule;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final SElementNature NATURE_EDEFAULT = SElementNature.GENUINE;

	/**
	 * The default value of the '{@link #isSynthetic() <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynthetic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNTHETIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynthetic() <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynthetic()
	 * @generated
	 * @ordered
	 */
	protected boolean synthetic = SYNTHETIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SNamedDeducibleElementImpl()
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
		return SimPackage.Literals.SNAMED_DEDUCIBLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDeductionRule getDeductionRule()
	{
		return deductionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeductionRule(SDeductionRule newDeductionRule, NotificationChain msgs)
	{
		SDeductionRule oldDeductionRule = deductionRule;
		deductionRule = newDeductionRule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE, oldDeductionRule, newDeductionRule);
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
	public void setDeductionRule(SDeductionRule newDeductionRule)
	{
		if (newDeductionRule != deductionRule)
		{
			NotificationChain msgs = null;
			if (deductionRule != null)
				msgs = ((InternalEObject)deductionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE, null, msgs);
			if (newDeductionRule != null)
				msgs = ((InternalEObject)newDeductionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE, null, msgs);
			msgs = basicSetDeductionRule(newDeductionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE, newDeductionRule, newDeductionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SElementNature getNature()
	{
		// TODO: implement this method to return the 'Nature' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(SElementNature newNature)
	{
		// TODO: implement this method to set the 'Nature' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSynthetic()
	{
		return synthetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSynthetic(boolean newSynthetic)
	{
		boolean oldSynthetic = synthetic;
		synthetic = newSynthetic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC, oldSynthetic, synthetic));
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
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE:
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
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE:
				return getDeductionRule();
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__NATURE:
				return getNature();
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC:
				return isSynthetic();
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
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE:
				setDeductionRule((SDeductionRule)newValue);
				return;
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__NATURE:
				setNature((SElementNature)newValue);
				return;
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC:
				setSynthetic((Boolean)newValue);
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
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE:
				setDeductionRule((SDeductionRule)null);
				return;
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
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
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE:
				return deductionRule != null;
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__NATURE:
				return getNature() != NATURE_EDEFAULT;
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
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
		if (baseClass == SDeducibleElement.class)
		{
			switch (derivedFeatureID)
			{
				case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE: return SimPackage.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE;
				case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__NATURE: return SimPackage.SDEDUCIBLE_ELEMENT__NATURE;
				case SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC: return SimPackage.SDEDUCIBLE_ELEMENT__SYNTHETIC;
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
		if (baseClass == SDeducibleElement.class)
		{
			switch (baseFeatureID)
			{
				case SimPackage.SDEDUCIBLE_ELEMENT__DEDUCTION_RULE: return SimPackage.SNAMED_DEDUCIBLE_ELEMENT__DEDUCTION_RULE;
				case SimPackage.SDEDUCIBLE_ELEMENT__NATURE: return SimPackage.SNAMED_DEDUCIBLE_ELEMENT__NATURE;
				case SimPackage.SDEDUCIBLE_ELEMENT__SYNTHETIC: return SimPackage.SNAMED_DEDUCIBLE_ELEMENT__SYNTHETIC;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (synthetic: ");
		result.append(synthetic);
		result.append(')');
		return result.toString();
	}

} //SNamedDeducibleElementImpl
