/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;

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
 * An implementation of the model object '<em><b>DAggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getDeducedFrom <em>Deduced From</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getRoots <em>Roots</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getDerivedName <em>Derived Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAggregateImpl extends MinimalEObjectImpl.Container implements DAggregate
{
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DType> types;

	/**
	 * The cached value of the '{@link #getDeducedFrom() <em>Deduced From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeducedFrom()
	 * @generated
	 * @ordered
	 */
	protected IDeductionDefinition deducedFrom;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DRichText description;

	/**
	 * The default value of the '{@link #getDerivedName() <em>Derived Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedName()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAggregateImpl()
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
		return BasePackage.Literals.DAGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DType> getTypes()
	{
		if (types == null)
		{
			types = new EObjectContainmentEList<DType>(DType.class, this, BasePackage.DAGGREGATE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDeductionDefinition getDeducedFrom()
	{
		if (deducedFrom != null && deducedFrom.eIsProxy())
		{
			InternalEObject oldDeducedFrom = (InternalEObject)deducedFrom;
			deducedFrom = (IDeductionDefinition)eResolveProxy(oldDeducedFrom);
			if (deducedFrom != oldDeducedFrom)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DAGGREGATE__DEDUCED_FROM, oldDeducedFrom, deducedFrom));
			}
		}
		return deducedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDeductionDefinition basicGetDeducedFrom()
	{
		return deducedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeducedFrom(IDeductionDefinition newDeducedFrom)
	{
		IDeductionDefinition oldDeducedFrom = deducedFrom;
		deducedFrom = newDeducedFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DAGGREGATE__DEDUCED_FROM, oldDeducedFrom, deducedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DAGGREGATE__SYNTHETIC, oldSynthetic, synthetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRichText getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DRichText newDescription, NotificationChain msgs)
	{
		DRichText oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DAGGREGATE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(DRichText newDescription)
	{
		if (newDescription != description)
		{
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DAGGREGATE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DAGGREGATE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DAGGREGATE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DIdentityType> getRoots()
	{
		// TODO: implement this method to return the 'Roots' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDerivedName()
	{
		// TODO: implement this method to return the 'Derived Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BasePackage.DAGGREGATE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case BasePackage.DAGGREGATE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case BasePackage.DAGGREGATE__TYPES:
				return getTypes();
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				if (resolve) return getDeducedFrom();
				return basicGetDeducedFrom();
			case BasePackage.DAGGREGATE__SYNTHETIC:
				return isSynthetic();
			case BasePackage.DAGGREGATE__DESCRIPTION:
				return getDescription();
			case BasePackage.DAGGREGATE__ROOTS:
				return getRoots();
			case BasePackage.DAGGREGATE__DERIVED_NAME:
				return getDerivedName();
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
			case BasePackage.DAGGREGATE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)newValue);
				return;
			case BasePackage.DAGGREGATE__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case BasePackage.DAGGREGATE__DESCRIPTION:
				setDescription((DRichText)newValue);
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
			case BasePackage.DAGGREGATE__TYPES:
				getTypes().clear();
				return;
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)null);
				return;
			case BasePackage.DAGGREGATE__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case BasePackage.DAGGREGATE__DESCRIPTION:
				setDescription((DRichText)null);
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
			case BasePackage.DAGGREGATE__TYPES:
				return types != null && !types.isEmpty();
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				return deducedFrom != null;
			case BasePackage.DAGGREGATE__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
			case BasePackage.DAGGREGATE__DESCRIPTION:
				return description != null;
			case BasePackage.DAGGREGATE__ROOTS:
				return !getRoots().isEmpty();
			case BasePackage.DAGGREGATE__DERIVED_NAME:
				return DERIVED_NAME_EDEFAULT == null ? getDerivedName() != null : !DERIVED_NAME_EDEFAULT.equals(getDerivedName());
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
				case BasePackage.DAGGREGATE__DEDUCED_FROM: return BasePackage.IDEDUCIBLE_ELEMENT__DEDUCED_FROM;
				case BasePackage.DAGGREGATE__SYNTHETIC: return BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC;
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
				case BasePackage.IDEDUCIBLE_ELEMENT__DEDUCED_FROM: return BasePackage.DAGGREGATE__DEDUCED_FROM;
				case BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC: return BasePackage.DAGGREGATE__SYNTHETIC;
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

} //DAggregateImpl
