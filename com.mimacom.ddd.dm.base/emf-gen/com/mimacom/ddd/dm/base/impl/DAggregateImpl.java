/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;

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
 * An implementation of the model object '<em><b>DAggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getDeducedFrom <em>Deduced From</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DAggregateImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAggregateImpl extends DNamedElementImpl implements DAggregate
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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<DFeature> features;

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
<<<<<<< Upstream, based on 31adbbe530a348e8e7950d43c70d55be3ba288b1
=======
	@Override
	public EList<DFeature> getFeatures()
	{
		if (features == null)
		{
			features = new EObjectContainmentEList<DFeature>(DFeature.class, this, BasePackage.DAGGREGATE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNavigableMember> getNavigableMembers()
	{
		// TODO: implement this method to return the 'Navigable Members' reference list
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
>>>>>>> 0d09db5 SIM: update to enhanced BASE model and semantics
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
	public boolean isSynthetic()
	{
		return synthetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<DEntityType> getRoots()
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
<<<<<<< Upstream, based on 31adbbe530a348e8e7950d43c70d55be3ba288b1
	public EList<DQuery> getStaticQueries()
	{
		if (staticQueries == null)
		{
			staticQueries = new EObjectContainmentEList<DQuery>(DQuery.class, this, BasePackage.DAGGREGATE__STATIC_QUERIES);
		}
		return staticQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
=======
>>>>>>> 0d09db5 SIM: update to enhanced BASE model and semantics
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BasePackage.DAGGREGATE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case BasePackage.DAGGREGATE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DAGGREGATE__FEATURES:
				return getFeatures();
			case BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				if (resolve) return getDeducedFrom();
				return basicGetDeducedFrom();
			case BasePackage.DAGGREGATE__SYNTHETIC:
				return isSynthetic();
			case BasePackage.DAGGREGATE__ROOTS:
				return getRoots();
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
			case BasePackage.DAGGREGATE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends DFeature>)newValue);
				return;
			case BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)newValue);
				return;
			case BasePackage.DAGGREGATE__SYNTHETIC:
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
			case BasePackage.DAGGREGATE__TYPES:
				getTypes().clear();
				return;
			case BasePackage.DAGGREGATE__FEATURES:
				getFeatures().clear();
				return;
			case BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)null);
				return;
			case BasePackage.DAGGREGATE__SYNTHETIC:
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
			case BasePackage.DAGGREGATE__TYPES:
				return types != null && !types.isEmpty();
			case BasePackage.DAGGREGATE__FEATURES:
				return features != null && !features.isEmpty();
			case BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case BasePackage.DAGGREGATE__DEDUCED_FROM:
				return deducedFrom != null;
			case BasePackage.DAGGREGATE__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
			case BasePackage.DAGGREGATE__ROOTS:
				return !getRoots().isEmpty();
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
		if (baseClass == ITypeContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DAGGREGATE__TYPES: return BasePackage.ITYPE_CONTAINER__TYPES;
				default: return -1;
			}
		}
		if (baseClass == IFeatureContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DAGGREGATE__FEATURES: return BasePackage.IFEATURE_CONTAINER__FEATURES;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS: return BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;
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
		if (baseClass == ITypeContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.ITYPE_CONTAINER__TYPES: return BasePackage.DAGGREGATE__TYPES;
				default: return -1;
			}
		}
		if (baseClass == IFeatureContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.IFEATURE_CONTAINER__FEATURES: return BasePackage.DAGGREGATE__FEATURES;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS: return BasePackage.DAGGREGATE__NAVIGABLE_MEMBERS;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (synthetic: ");
		result.append(synthetic);
		result.append(')');
		return result.toString();
	}

} //DAggregateImpl
