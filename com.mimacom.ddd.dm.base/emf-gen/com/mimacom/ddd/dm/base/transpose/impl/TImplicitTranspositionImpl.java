/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
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
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TImplicitTranspositionImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TImplicitTranspositionImpl#getImpliedTranspositions <em>Implied Transpositions</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TImplicitTranspositionImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TImplicitTranspositionImpl#getOriginalTransposition <em>Original Transposition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImplicitTranspositionImpl extends MinimalEObjectImpl.Container implements TImplicitTransposition
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
	 * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected ITransposition recipe;

	/**
	 * The cached value of the '{@link #getOriginalTransposition() <em>Original Transposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTransposition()
	 * @generated
	 * @ordered
	 */
	protected ITransposition originalTransposition;

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
		return TransposePackage.Literals.TIMPLICIT_TRANSPOSITION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransposePackage.TIMPLICIT_TRANSPOSITION__RULE, oldRule, newRule);
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
				msgs = ((InternalEObject)rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TIMPLICIT_TRANSPOSITION__RULE, null, msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TIMPLICIT_TRANSPOSITION__RULE, null, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TIMPLICIT_TRANSPOSITION__RULE, newRule, newRule));
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
			impliedTranspositions = new EObjectContainmentEList<TImplicitTransposition>(TImplicitTransposition.class, this, TransposePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS);
		}
		return impliedTranspositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ITransposition getRecipe()
	{
		if (recipe != null && recipe.eIsProxy())
		{
			InternalEObject oldRecipe = (InternalEObject)recipe;
			recipe = (ITransposition)eResolveProxy(oldRecipe);
			if (recipe != oldRecipe)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE, oldRecipe, recipe));
			}
		}
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition basicGetRecipe()
	{
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecipe(ITransposition newRecipe)
	{
		ITransposition oldRecipe = recipe;
		recipe = newRecipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE, oldRecipe, recipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ITransposition getOriginalTransposition()
	{
		if (originalTransposition != null && originalTransposition.eIsProxy())
		{
			InternalEObject oldOriginalTransposition = (InternalEObject)originalTransposition;
			originalTransposition = (ITransposition)eResolveProxy(oldOriginalTransposition);
			if (originalTransposition != oldOriginalTransposition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransposePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_TRANSPOSITION, oldOriginalTransposition, originalTransposition));
			}
		}
		return originalTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition basicGetOriginalTransposition()
	{
		return originalTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalTransposition(ITransposition newOriginalTransposition)
	{
		ITransposition oldOriginalTransposition = originalTransposition;
		originalTransposition = newOriginalTransposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_TRANSPOSITION, oldOriginalTransposition, originalTransposition));
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
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RULE:
				return basicSetRule(null, msgs);
			case TransposePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
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
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RULE:
				return getRule();
			case TransposePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return getImpliedTranspositions();
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE:
				if (resolve) return getRecipe();
				return basicGetRecipe();
			case TransposePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_TRANSPOSITION:
				if (resolve) return getOriginalTransposition();
				return basicGetOriginalTransposition();
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
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RULE:
				setRule((TTranspositionRule)newValue);
				return;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				getImpliedTranspositions().clear();
				getImpliedTranspositions().addAll((Collection<? extends TImplicitTransposition>)newValue);
				return;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE:
				setRecipe((ITransposition)newValue);
				return;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_TRANSPOSITION:
				setOriginalTransposition((ITransposition)newValue);
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
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RULE:
				setRule((TTranspositionRule)null);
				return;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				getImpliedTranspositions().clear();
				return;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE:
				setRecipe((ITransposition)null);
				return;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_TRANSPOSITION:
				setOriginalTransposition((ITransposition)null);
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
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RULE:
				return rule != null;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__IMPLIED_TRANSPOSITIONS:
				return impliedTranspositions != null && !impliedTranspositions.isEmpty();
			case TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE:
				return recipe != null;
			case TransposePackage.TIMPLICIT_TRANSPOSITION__ORIGINAL_TRANSPOSITION:
				return originalTransposition != null;
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
		if (baseClass == ISyntheticElement.class)
		{
			switch (derivedFeatureID)
			{
				case TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE: return TransposePackage.ISYNTHETIC_ELEMENT__RECIPE;
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
		if (baseClass == ISyntheticElement.class)
		{
			switch (baseFeatureID)
			{
				case TransposePackage.ISYNTHETIC_ELEMENT__RECIPE: return TransposePackage.TIMPLICIT_TRANSPOSITION__RECIPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TImplicitTranspositionImpl
