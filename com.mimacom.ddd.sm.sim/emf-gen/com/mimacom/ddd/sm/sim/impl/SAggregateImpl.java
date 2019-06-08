/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEntityType;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl#getDeductionRule <em>Deduction Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SAggregateImpl#getDerivedName <em>Derived Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SAggregateImpl extends MinimalEObjectImpl.Container implements SAggregate
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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SType> types;

	/**
	 * The default value of the '{@link #getDerivedName() <em>Derived Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedName()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SAggregateImpl()
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
		return SimPackage.Literals.SAGGREGATE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SAGGREGATE__DEDUCTION_RULE, oldDeductionRule, newDeductionRule);
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
				msgs = ((InternalEObject)deductionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SAGGREGATE__DEDUCTION_RULE, null, msgs);
			if (newDeductionRule != null)
				msgs = ((InternalEObject)newDeductionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SAGGREGATE__DEDUCTION_RULE, null, msgs);
			msgs = basicSetDeductionRule(newDeductionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SAGGREGATE__DEDUCTION_RULE, newDeductionRule, newDeductionRule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SAGGREGATE__SYNTHETIC, oldSynthetic, synthetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SType> getTypes()
	{
		if (types == null)
		{
			types = new EObjectContainmentEList<SType>(SType.class, this, SimPackage.SAGGREGATE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SEntityType> getRoots()
	{
		// TODO: implement this method to return the 'Roots' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDerivedName()
	{
		// TODO: implement this method to return the 'Derived Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SimPackage.SAGGREGATE__DEDUCTION_RULE:
				return basicSetDeductionRule(null, msgs);
			case SimPackage.SAGGREGATE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case SimPackage.SAGGREGATE__DEDUCTION_RULE:
				return getDeductionRule();
			case SimPackage.SAGGREGATE__NATURE:
				return getNature();
			case SimPackage.SAGGREGATE__SYNTHETIC:
				return isSynthetic();
			case SimPackage.SAGGREGATE__TYPES:
				return getTypes();
			case SimPackage.SAGGREGATE__ROOTS:
				return getRoots();
			case SimPackage.SAGGREGATE__DERIVED_NAME:
				return getDerivedName();
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
			case SimPackage.SAGGREGATE__DEDUCTION_RULE:
				setDeductionRule((SDeductionRule)newValue);
				return;
			case SimPackage.SAGGREGATE__NATURE:
				setNature((SElementNature)newValue);
				return;
			case SimPackage.SAGGREGATE__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case SimPackage.SAGGREGATE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends SType>)newValue);
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
			case SimPackage.SAGGREGATE__DEDUCTION_RULE:
				setDeductionRule((SDeductionRule)null);
				return;
			case SimPackage.SAGGREGATE__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case SimPackage.SAGGREGATE__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case SimPackage.SAGGREGATE__TYPES:
				getTypes().clear();
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
			case SimPackage.SAGGREGATE__DEDUCTION_RULE:
				return deductionRule != null;
			case SimPackage.SAGGREGATE__NATURE:
				return getNature() != NATURE_EDEFAULT;
			case SimPackage.SAGGREGATE__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
			case SimPackage.SAGGREGATE__TYPES:
				return types != null && !types.isEmpty();
			case SimPackage.SAGGREGATE__ROOTS:
				return !getRoots().isEmpty();
			case SimPackage.SAGGREGATE__DERIVED_NAME:
				return DERIVED_NAME_EDEFAULT == null ? getDerivedName() != null : !DERIVED_NAME_EDEFAULT.equals(getDerivedName());
		}
		return super.eIsSet(featureID);
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

} //SAggregateImpl
