/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.ITransposition;
import com.mimacom.ddd.dm.base.base.TImplicitTransposition;
import com.mimacom.ddd.dm.base.base.TTranspositionRule;

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
 * An implementation of the model object '<em><b>TImplicit Transposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.TImplicitTranspositionImpl#getTranspositionRule <em>Transposition Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.TImplicitTranspositionImpl#getImpliedTranspositions <em>Implied Transpositions</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.TImplicitTranspositionImpl#getOriginalDeductionDefinition <em>Original Deduction Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImplicitTranspositionImpl extends MinimalEObjectImpl.Container implements TImplicitTransposition
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
	 * The cached value of the '{@link #getOriginalDeductionDefinition() <em>Original Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalDeductionDefinition()
	 * @generated
	 * @ordered
	 */
	protected ITransposition originalDeductionDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TImplicitTranspositionImpl()
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
		return BasePackage.Literals.TIMPLICIT_TRANSPOSITION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE, oldTranspositionRule, newTranspositionRule);
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
				msgs = ((InternalEObject)transpositionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE, null, msgs);
			if (newTranspositionRule != null)
				msgs = ((InternalEObject)newTranspositionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE, null, msgs);
			msgs = basicSetTranspositionRule(newTranspositionRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE, newTranspositionRule, newTranspositionRule));
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
			impliedTranspositions = new EObjectContainmentEList<TImplicitTransposition>(TImplicitTransposition.class, this, BasePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS);
		}
		return impliedTranspositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ITransposition getOriginalDeductionDefinition()
	{
		if (originalDeductionDefinition != null && originalDeductionDefinition.eIsProxy())
		{
			InternalEObject oldOriginalDeductionDefinition = (InternalEObject)originalDeductionDefinition;
			originalDeductionDefinition = (ITransposition)eResolveProxy(oldOriginalDeductionDefinition);
			if (originalDeductionDefinition != oldOriginalDeductionDefinition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_DEDUCTION_DEFINITION, oldOriginalDeductionDefinition, originalDeductionDefinition));
			}
		}
		return originalDeductionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition basicGetOriginalDeductionDefinition()
	{
		return originalDeductionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalDeductionDefinition(ITransposition newOriginalDeductionDefinition)
	{
		ITransposition oldOriginalDeductionDefinition = originalDeductionDefinition;
		originalDeductionDefinition = newOriginalDeductionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_DEDUCTION_DEFINITION, oldOriginalDeductionDefinition, originalDeductionDefinition));
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
			case BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE:
				return basicSetTranspositionRule(null, msgs);
			case BasePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
			case BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE:
				return getTranspositionRule();
			case BasePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return getImpliedTranspositions();
			case BasePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_DEDUCTION_DEFINITION:
				if (resolve) return getOriginalDeductionDefinition();
				return basicGetOriginalDeductionDefinition();
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
			case BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE:
				setTranspositionRule((TTranspositionRule)newValue);
				return;
			case BasePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				getImpliedTranspositions().clear();
				getImpliedTranspositions().addAll((Collection<? extends TImplicitTransposition>)newValue);
				return;
			case BasePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_DEDUCTION_DEFINITION:
				setOriginalDeductionDefinition((ITransposition)newValue);
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
			case BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE:
				setTranspositionRule((TTranspositionRule)null);
				return;
			case BasePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				getImpliedTranspositions().clear();
				return;
			case BasePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_DEDUCTION_DEFINITION:
				setOriginalDeductionDefinition((ITransposition)null);
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
			case BasePackage.TIMPLICIT_TRANSPOSITION__TRANSPOSITION_RULE:
				return transpositionRule != null;
			case BasePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return impliedTranspositions != null && !impliedTranspositions.isEmpty();
			case BasePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_DEDUCTION_DEFINITION:
				return originalDeductionDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //TImplicitTranspositionImpl
