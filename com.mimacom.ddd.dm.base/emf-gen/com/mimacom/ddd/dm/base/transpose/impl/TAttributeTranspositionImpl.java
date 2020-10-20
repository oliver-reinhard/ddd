/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.impl.DAttributeImpl;

import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TImplicitTransposition;
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

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
 * An implementation of the model object '<em><b>TAttribute Transposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TAttributeTranspositionImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TAttributeTranspositionImpl#getImpliedTranspositions <em>Implied Transpositions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAttributeTranspositionImpl extends DAttributeImpl implements TAttributeTransposition
{
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected TTranspositionRule rule;

	/**
	 * The cached value of the '{@link #getImpliedTranspositions() <em>Implied Transpositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpliedTranspositions()
	 * @generated
	 * @ordered
	 */
	protected EList<TImplicitTransposition> impliedTranspositions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAttributeTranspositionImpl()
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
		return TransposePackage.Literals.TATTRIBUTE_TRANSPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTranspositionRule getRule()
	{
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(TTranspositionRule newRule, NotificationChain msgs)
	{
		TTranspositionRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE, oldRule, newRule);
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
	public void setRule(TTranspositionRule newRule)
	{
		if (newRule != rule)
		{
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TImplicitTransposition> getImpliedTranspositions()
	{
		if (impliedTranspositions == null)
		{
			impliedTranspositions = new EObjectContainmentEList<TImplicitTransposition>(TImplicitTransposition.class, this, TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS);
		}
		return impliedTranspositions;
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
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE:
				return basicSetRule(null, msgs);
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return ((InternalEList<?>)getImpliedTranspositions()).basicRemove(otherEnd, msgs);
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
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE:
				return getRule();
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return getImpliedTranspositions();
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
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE:
				setRule((TTranspositionRule)newValue);
				return;
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				getImpliedTranspositions().clear();
				getImpliedTranspositions().addAll((Collection<? extends TImplicitTransposition>)newValue);
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
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE:
				setRule((TTranspositionRule)null);
				return;
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				getImpliedTranspositions().clear();
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
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE:
				return rule != null;
			case TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return impliedTranspositions != null && !impliedTranspositions.isEmpty();
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
		if (baseClass == ITransposition.class)
		{
			switch (derivedFeatureID)
			{
				case TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE: return TransposePackage.ITRANSPOSITION__RULE;
				case TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS: return TransposePackage.ITRANSPOSITION__IMPLIED_TRANSPOSITIONS;
				default: return -1;
			}
		}
		if (baseClass == TFeatureTransposition.class)
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
		if (baseClass == ITransposition.class)
		{
			switch (baseFeatureID)
			{
				case TransposePackage.ITRANSPOSITION__RULE: return TransposePackage.TATTRIBUTE_TRANSPOSITION__RULE;
				case TransposePackage.ITRANSPOSITION__IMPLIED_TRANSPOSITIONS: return TransposePackage.TATTRIBUTE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS;
				default: return -1;
			}
		}
		if (baseClass == TFeatureTransposition.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TAttributeTranspositionImpl
