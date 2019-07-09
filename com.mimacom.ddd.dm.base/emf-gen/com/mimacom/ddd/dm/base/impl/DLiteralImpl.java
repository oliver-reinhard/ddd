/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DLiteral</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DLiteralImpl#getDeductionDefinition <em>Deduction Definition</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DLiteralImpl#isSynthetic <em>Synthetic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DLiteralImpl extends DTypedMemberImplCustom implements DLiteral
{
	/**
	 * The cached value of the '{@link #getDeductionDefinition() <em>Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionDefinition()
	 * @generated
	 * @ordered
	 */
	protected IDeductionDefinition deductionDefinition;

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
	protected DLiteralImpl()
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
		return BasePackage.Literals.DLITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDeductionDefinition getDeductionDefinition()
	{
		if (deductionDefinition != null && deductionDefinition.eIsProxy())
		{
			InternalEObject oldDeductionDefinition = (InternalEObject)deductionDefinition;
			deductionDefinition = (IDeductionDefinition)eResolveProxy(oldDeductionDefinition);
			if (deductionDefinition != oldDeductionDefinition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DLITERAL__DEDUCTION_DEFINITION, oldDeductionDefinition, deductionDefinition));
			}
		}
		return deductionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDeductionDefinition basicGetDeductionDefinition()
	{
		return deductionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeductionDefinition(IDeductionDefinition newDeductionDefinition)
	{
		IDeductionDefinition oldDeductionDefinition = deductionDefinition;
		deductionDefinition = newDeductionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DLITERAL__DEDUCTION_DEFINITION, oldDeductionDefinition, deductionDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DLITERAL__SYNTHETIC, oldSynthetic, synthetic));
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
			case BasePackage.DLITERAL__DEDUCTION_DEFINITION:
				if (resolve) return getDeductionDefinition();
				return basicGetDeductionDefinition();
			case BasePackage.DLITERAL__SYNTHETIC:
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
			case BasePackage.DLITERAL__DEDUCTION_DEFINITION:
				setDeductionDefinition((IDeductionDefinition)newValue);
				return;
			case BasePackage.DLITERAL__SYNTHETIC:
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
			case BasePackage.DLITERAL__DEDUCTION_DEFINITION:
				setDeductionDefinition((IDeductionDefinition)null);
				return;
			case BasePackage.DLITERAL__SYNTHETIC:
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
			case BasePackage.DLITERAL__DEDUCTION_DEFINITION:
				return deductionDefinition != null;
			case BasePackage.DLITERAL__SYNTHETIC:
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
		if (baseClass == IDeducibleElement.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DLITERAL__DEDUCTION_DEFINITION: return BasePackage.IDEDUCIBLE_ELEMENT__DEDUCTION_DEFINITION;
				case BasePackage.DLITERAL__SYNTHETIC: return BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC;
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
		if (baseClass == IDeducibleElement.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.IDEDUCIBLE_ELEMENT__DEDUCTION_DEFINITION: return BasePackage.DLITERAL__DEDUCTION_DEFINITION;
				case BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC: return BasePackage.DLITERAL__SYNTHETIC;
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

} //DLiteralImpl
