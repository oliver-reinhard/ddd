/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.ITransposition;
import com.mimacom.ddd.dm.base.base.TImplicitTransposition;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;

import com.mimacom.ddd.dm.base.base.impl.DAggregateImplCustom;

import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
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
 * An implementation of the model object '<em><b>TAggregate Transposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TAggregateTranspositionImpl#getTranspositionRule <em>Transposition Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TAggregateTranspositionImpl#getImpliedTranspositions <em>Implied Transpositions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAggregateTranspositionImpl extends DAggregateImplCustom implements TAggregateTransposition
{
	/**
	 * The cached value of the '{@link #getTranspositionRule() <em>Transposition Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranspositionRule()
	 * @generated
	 * @ordered
	 */
	protected TTranspositionRule transpositionRule;

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
	protected TAggregateTranspositionImpl()
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
		return TransposePackage.Literals.TAGGREGATE_TRANSPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTranspositionRule getTranspositionRule()
	{
		return transpositionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranspositionRule(TTranspositionRule newTranspositionRule, NotificationChain msgs)
	{
		TTranspositionRule oldTranspositionRule = transpositionRule;
		transpositionRule = newTranspositionRule;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE, oldTranspositionRule, newTranspositionRule);
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
	public void setTranspositionRule(TTranspositionRule newTranspositionRule)
	{
		if (newTranspositionRule != transpositionRule)
		{
			NotificationChain msgs = null;
			if (transpositionRule != null)
				msgs = ((InternalEObject)transpositionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE, null, msgs);
			if (newTranspositionRule != null)
				msgs = ((InternalEObject)newTranspositionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE, null, msgs);
			msgs = basicSetTranspositionRule(newTranspositionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE, newTranspositionRule, newTranspositionRule));
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
			impliedTranspositions = new EObjectContainmentEList<TImplicitTransposition>(TImplicitTransposition.class, this, TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS);
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
			case TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE:
				return basicSetTranspositionRule(null, msgs);
			case TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
			case TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE:
				return getTranspositionRule();
			case TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
			case TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE:
				setTranspositionRule((TTranspositionRule)newValue);
				return;
			case TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
			case TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE:
				setTranspositionRule((TTranspositionRule)null);
				return;
			case TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
			case TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE:
				return transpositionRule != null;
			case TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
				case TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE: return BasePackage.ITRANSPOSITION__TRANSPOSITION_RULE;
				case TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS: return BasePackage.ITRANSPOSITION__IMPLIED_TRANSPOSITIONS;
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
				case BasePackage.ITRANSPOSITION__TRANSPOSITION_RULE: return TransposePackage.TAGGREGATE_TRANSPOSITION__TRANSPOSITION_RULE;
				case BasePackage.ITRANSPOSITION__IMPLIED_TRANSPOSITIONS: return TransposePackage.TAGGREGATE_TRANSPOSITION__IMPLIED_TRANSPOSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TAggregateTranspositionImpl
