/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.base.ITransposableElement;
import com.mimacom.ddd.dm.base.base.ITransposition;

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
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DTypeImpl#getTransposedBy <em>Transposed By</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DTypeImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DTypeImpl#isPrimitive <em>Primitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DTypeImpl extends DNamedElementImpl implements DType
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
	protected EList<DNamedPredicate> constraints;

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
	public ITransposition getTransposedBy()
	{
		if (transposedBy != null && transposedBy.eIsProxy())
		{
			InternalEObject oldTransposedBy = (InternalEObject)transposedBy;
			transposedBy = (ITransposition)eResolveProxy(oldTransposedBy);
			if (transposedBy != oldTransposedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DTYPE__TRANSPOSED_BY, oldTransposedBy, transposedBy));
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
	@Override
	public void setTransposedBy(ITransposition newTransposedBy)
	{
		ITransposition oldTransposedBy = transposedBy;
		transposedBy = newTransposedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DTYPE__TRANSPOSED_BY, oldTransposedBy, transposedBy));
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
	public EList<DNamedPredicate> getConstraints()
	{
		if (constraints == null)
		{
			constraints = new EObjectContainmentEList<DNamedPredicate>(DNamedPredicate.class, this, BasePackage.DTYPE__CONSTRAINTS);
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
			case BasePackage.DTYPE__TRANSPOSED_BY:
				if (resolve) return getTransposedBy();
				return basicGetTransposedBy();
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
			case BasePackage.DTYPE__TRANSPOSED_BY:
				setTransposedBy((ITransposition)newValue);
				return;
			case BasePackage.DTYPE__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case BasePackage.DTYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DNamedPredicate>)newValue);
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
			case BasePackage.DTYPE__TRANSPOSED_BY:
				setTransposedBy((ITransposition)null);
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
			case BasePackage.DTYPE__TRANSPOSED_BY:
				return transposedBy != null;
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
		if (baseClass == ITransposableElement.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DTYPE__TRANSPOSED_BY: return BasePackage.ITRANSPOSABLE_ELEMENT__TRANSPOSED_BY;
				case BasePackage.DTYPE__SYNTHETIC: return BasePackage.ITRANSPOSABLE_ELEMENT__SYNTHETIC;
				default: return -1;
			}
		}
		if (baseClass == IStaticReferenceTarget.class)
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
		if (baseClass == ITransposableElement.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.ITRANSPOSABLE_ELEMENT__TRANSPOSED_BY: return BasePackage.DTYPE__TRANSPOSED_BY;
				case BasePackage.ITRANSPOSABLE_ELEMENT__SYNTHETIC: return BasePackage.DTYPE__SYNTHETIC;
				default: return -1;
			}
		}
		if (baseClass == IStaticReferenceTarget.class)
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
