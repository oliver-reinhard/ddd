/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DInformationModel;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IDiagramRoot;
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
 * An implementation of the model object '<em><b>DInformation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl#getDeducedFrom <em>Deduced From</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DInformationModelImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DInformationModelImpl extends DNamedElementImpl implements DInformationModel
{
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DImport> imports;

	/**
	 * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregates()
	 * @generated
	 * @ordered
	 */
	protected EList<DAggregate> aggregates;

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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DInformationModelImpl()
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
		return BasePackage.Literals.DINFORMATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DImport> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<DImport>(DImport.class, this, BasePackage.DINFORMATION_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DAggregate> getAggregates()
	{
		if (aggregates == null)
		{
			aggregates = new EObjectContainmentEList<DAggregate>(DAggregate.class, this, BasePackage.DINFORMATION_MODEL__AGGREGATES);
		}
		return aggregates;
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
			types = new EObjectContainmentEList<DType>(DType.class, this, BasePackage.DINFORMATION_MODEL__TYPES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DINFORMATION_MODEL__DEDUCED_FROM, oldDeducedFrom, deducedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DINFORMATION_MODEL__DEDUCED_FROM, oldDeducedFrom, deducedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DINFORMATION_MODEL__SYNTHETIC, oldSynthetic, synthetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomain()
	{
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain)
	{
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DINFORMATION_MODEL__DOMAIN, oldDomain, domain));
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
			case BasePackage.DINFORMATION_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case BasePackage.DINFORMATION_MODEL__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case BasePackage.DINFORMATION_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DINFORMATION_MODEL__IMPORTS:
				return getImports();
			case BasePackage.DINFORMATION_MODEL__AGGREGATES:
				return getAggregates();
			case BasePackage.DINFORMATION_MODEL__TYPES:
				return getTypes();
			case BasePackage.DINFORMATION_MODEL__DEDUCED_FROM:
				if (resolve) return getDeducedFrom();
				return basicGetDeducedFrom();
			case BasePackage.DINFORMATION_MODEL__SYNTHETIC:
				return isSynthetic();
			case BasePackage.DINFORMATION_MODEL__DOMAIN:
				return getDomain();
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
			case BasePackage.DINFORMATION_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DImport>)newValue);
				return;
			case BasePackage.DINFORMATION_MODEL__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends DAggregate>)newValue);
				return;
			case BasePackage.DINFORMATION_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case BasePackage.DINFORMATION_MODEL__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)newValue);
				return;
			case BasePackage.DINFORMATION_MODEL__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case BasePackage.DINFORMATION_MODEL__DOMAIN:
				setDomain((String)newValue);
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
			case BasePackage.DINFORMATION_MODEL__IMPORTS:
				getImports().clear();
				return;
			case BasePackage.DINFORMATION_MODEL__AGGREGATES:
				getAggregates().clear();
				return;
			case BasePackage.DINFORMATION_MODEL__TYPES:
				getTypes().clear();
				return;
			case BasePackage.DINFORMATION_MODEL__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)null);
				return;
			case BasePackage.DINFORMATION_MODEL__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case BasePackage.DINFORMATION_MODEL__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
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
			case BasePackage.DINFORMATION_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case BasePackage.DINFORMATION_MODEL__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case BasePackage.DINFORMATION_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case BasePackage.DINFORMATION_MODEL__DEDUCED_FROM:
				return deducedFrom != null;
			case BasePackage.DINFORMATION_MODEL__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
			case BasePackage.DINFORMATION_MODEL__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
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
		if (baseClass == IAggregateContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DINFORMATION_MODEL__AGGREGATES: return BasePackage.IAGGREGATE_CONTAINER__AGGREGATES;
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DINFORMATION_MODEL__TYPES: return BasePackage.ITYPE_CONTAINER__TYPES;
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
				case BasePackage.DINFORMATION_MODEL__DEDUCED_FROM: return BasePackage.IDEDUCIBLE_ELEMENT__DEDUCED_FROM;
				case BasePackage.DINFORMATION_MODEL__SYNTHETIC: return BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC;
				default: return -1;
			}
		}
		if (baseClass == IDiagramRoot.class)
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
		if (baseClass == IAggregateContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.IAGGREGATE_CONTAINER__AGGREGATES: return BasePackage.DINFORMATION_MODEL__AGGREGATES;
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.ITYPE_CONTAINER__TYPES: return BasePackage.DINFORMATION_MODEL__TYPES;
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
				case BasePackage.IDEDUCIBLE_ELEMENT__DEDUCED_FROM: return BasePackage.DINFORMATION_MODEL__DEDUCED_FROM;
				case BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC: return BasePackage.DINFORMATION_MODEL__SYNTHETIC;
				default: return -1;
			}
		}
		if (baseClass == IDiagramRoot.class)
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
		result.append(", domain: ");
		result.append(domain);
		result.append(')');
		return result.toString();
	}

} //DInformationModelImpl
