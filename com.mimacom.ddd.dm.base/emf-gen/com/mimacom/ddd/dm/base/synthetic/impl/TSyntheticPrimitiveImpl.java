/**
 */
package com.mimacom.ddd.dm.base.synthetic.impl;

import com.mimacom.ddd.dm.base.base.impl.DPrimitiveImpl;

import com.mimacom.ddd.dm.base.synthetic.SyntheticPackage;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticPrimitive;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticType;

import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSynthetic Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.synthetic.impl.TSyntheticPrimitiveImpl#getRecipe <em>Recipe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSyntheticPrimitiveImpl extends DPrimitiveImpl implements TSyntheticPrimitive
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
	protected TSyntheticPrimitiveImpl()
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
		return SyntheticPackage.Literals.TSYNTHETIC_PRIMITIVE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE, oldRecipe, recipe));
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
			case SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE:
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
			case SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE:
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
			case SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE:
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
			case SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE:
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
				case SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE: return TransposePackage.ISYNTHETIC_ELEMENT__RECIPE;
				default: return -1;
			}
		}
		if (baseClass == TSyntheticType.class)
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
		if (baseClass == ISyntheticElement.class)
		{
			switch (baseFeatureID)
			{
				case TransposePackage.ISYNTHETIC_ELEMENT__RECIPE: return SyntheticPackage.TSYNTHETIC_PRIMITIVE__RECIPE;
				default: return -1;
			}
		}
		if (baseClass == TSyntheticType.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TSyntheticPrimitiveImpl
