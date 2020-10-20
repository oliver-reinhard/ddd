/**
 */
package com.mimacom.ddd.dm.base.synthetic.impl;

import com.mimacom.ddd.dm.base.base.impl.DAggregateImplCustom;

import com.mimacom.ddd.dm.base.synthetic.SyntheticPackage;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate;

import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSynthetic Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticAggregateImpl#getRecipe <em>Recipe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSyntheticAggregateImpl extends DAggregateImplCustom implements TSyntheticAggregate
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSyntheticAggregateImpl()
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
		return SyntheticPackage.Literals.TSYNTHETIC_AGGREGATE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE, oldRecipe, recipe));
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
			case SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE:
				if (resolve) return getRecipe();
				return basicGetRecipe();
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
			case SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE:
				setRecipe((ITransposition)newValue);
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
			case SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE:
				setRecipe((ITransposition)null);
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
			case SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE:
				return recipe != null;
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
				case SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE: return TransposePackage.ISYNTHETIC_ELEMENT__RECIPE;
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
				case TransposePackage.ISYNTHETIC_ELEMENT__RECIPE: return SyntheticPackage.TSYNTHETIC_AGGREGATE__RECIPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TSyntheticAggregateImpl
