/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IPrimaryNavigationTarget;

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
 * An implementation of the model object '<em><b>DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DTypeImpl#getDeductionDefinition <em>Deduction Definition</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DTypeImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DTypeImpl#isPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DTypeImpl extends DNamedElementImpl implements DType
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DCondition> constraints;

	/**
	 * The default value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMITIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPrimitive() <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimitive()
	 * @generated
	 * @ordered
	 */
	protected boolean primitive = PRIMITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTypeImpl()
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
		return BasePackage.Literals.DTYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DTYPE__DEDUCTION_DEFINITION, oldDeductionDefinition, deductionDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DTYPE__DEDUCTION_DEFINITION, oldDeductionDefinition, deductionDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DTYPE__SYNTHETIC, oldSynthetic, synthetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DCondition> getConstraints()
	{
		if (constraints == null)
		{
			constraints = new EObjectContainmentEList<DCondition>(DCondition.class, this, BasePackage.DTYPE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrimitive()
	{
		return primitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitive(boolean newPrimitive)
	{
		boolean oldPrimitive = primitive;
		primitive = newPrimitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DTYPE__PRIMITIVE, oldPrimitive, primitive));
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
			case BasePackage.DTYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DTYPE__DEDUCTION_DEFINITION:
				if (resolve) return getDeductionDefinition();
				return basicGetDeductionDefinition();
			case BasePackage.DTYPE__SYNTHETIC:
				return isSynthetic();
			case BasePackage.DTYPE__CONSTRAINTS:
				return getConstraints();
			case BasePackage.DTYPE__PRIMITIVE:
				return isPrimitive();
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
			case BasePackage.DTYPE__DEDUCTION_DEFINITION:
				setDeductionDefinition((IDeductionDefinition)newValue);
				return;
			case BasePackage.DTYPE__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case BasePackage.DTYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DCondition>)newValue);
				return;
			case BasePackage.DTYPE__PRIMITIVE:
				setPrimitive((Boolean)newValue);
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
			case BasePackage.DTYPE__DEDUCTION_DEFINITION:
				setDeductionDefinition((IDeductionDefinition)null);
				return;
			case BasePackage.DTYPE__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case BasePackage.DTYPE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case BasePackage.DTYPE__PRIMITIVE:
				setPrimitive(PRIMITIVE_EDEFAULT);
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
			case BasePackage.DTYPE__DEDUCTION_DEFINITION:
				return deductionDefinition != null;
			case BasePackage.DTYPE__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
			case BasePackage.DTYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case BasePackage.DTYPE__PRIMITIVE:
				return primitive != PRIMITIVE_EDEFAULT;
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
				case BasePackage.DTYPE__DEDUCTION_DEFINITION: return BasePackage.IDEDUCIBLE_ELEMENT__DEDUCTION_DEFINITION;
				case BasePackage.DTYPE__SYNTHETIC: return BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC;
				default: return -1;
			}
		}
		if (baseClass == IPrimaryNavigationTarget.class)
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
		if (baseClass == IDeducibleElement.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.IDEDUCIBLE_ELEMENT__DEDUCTION_DEFINITION: return BasePackage.DTYPE__DEDUCTION_DEFINITION;
				case BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC: return BasePackage.DTYPE__SYNTHETIC;
				default: return -1;
			}
		}
		if (baseClass == IPrimaryNavigationTarget.class)
		{
			switch (baseFeatureID)
			{
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
		result.append(", primitive: ");
		result.append(primitive);
		result.append(')');
		return result.toString();
	}

} //DTypeImpl
