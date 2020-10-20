/**
 */
package com.mimacom.ddd.dm.dim.impl;

import com.mimacom.ddd.dm.base.base.impl.DLiteralImplCustom;

import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import com.mimacom.ddd.dm.dim.DimLiteral;
import com.mimacom.ddd.dm.dim.DimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dim.impl.DimLiteralImpl#getTransposedBy <em>Transposed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimLiteralImpl extends DLiteralImplCustom implements DimLiteral
{
	/**
	 * The cached value of the '{@link #getTransposedBy() <em>Transposed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransposedBy()
	 * @generated
	 * @ordered
	 */
	protected ITransposition transposedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimLiteralImpl()
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
		return DimPackage.Literals.DIM_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition getTransposedBy()
	{
		if (transposedBy != null && transposedBy.eIsProxy())
		{
			InternalEObject oldTransposedBy = (InternalEObject)transposedBy;
			transposedBy = (ITransposition)eResolveProxy(oldTransposedBy);
			if (transposedBy != oldTransposedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DimPackage.DIM_LITERAL__TRANSPOSED_BY, oldTransposedBy, transposedBy));
			}
		}
		return transposedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition basicGetTransposedBy()
	{
		return transposedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransposedBy(ITransposition newTransposedBy)
	{
		ITransposition oldTransposedBy = transposedBy;
		transposedBy = newTransposedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DimPackage.DIM_LITERAL__TRANSPOSED_BY, oldTransposedBy, transposedBy));
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
			case DimPackage.DIM_LITERAL__TRANSPOSED_BY:
				if (resolve) return getTransposedBy();
				return basicGetTransposedBy();
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
			case DimPackage.DIM_LITERAL__TRANSPOSED_BY:
				setTransposedBy((ITransposition)newValue);
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
			case DimPackage.DIM_LITERAL__TRANSPOSED_BY:
				setTransposedBy((ITransposition)null);
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
			case DimPackage.DIM_LITERAL__TRANSPOSED_BY:
				return transposedBy != null;
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
		if (baseClass == ITransposableElement.class)
		{
			switch (derivedFeatureID)
			{
				case DimPackage.DIM_LITERAL__TRANSPOSED_BY: return TransposePackage.ITRANSPOSABLE_ELEMENT__TRANSPOSED_BY;
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
		if (baseClass == ITransposableElement.class)
		{
			switch (baseFeatureID)
			{
				case TransposePackage.ITRANSPOSABLE_ELEMENT__TRANSPOSED_BY: return DimPackage.DIM_LITERAL__TRANSPOSED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DimLiteralImpl
