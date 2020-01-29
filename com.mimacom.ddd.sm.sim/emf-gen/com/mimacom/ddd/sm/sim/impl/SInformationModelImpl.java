/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;

import com.mimacom.ddd.sm.sim.SDomainDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.SimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SInformation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#isGenerate <em>Generate</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getDomainProxies <em>Domain Proxies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SInformationModelImpl extends MinimalEObjectImpl.Container implements SInformationModel
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliases() <em>Aliases</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliases()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliases;

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
	 * The default value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerate() <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerate()
	 * @generated
	 * @ordered
	 */
	protected boolean generate = GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SInformationModelKind KIND_EDEFAULT = SInformationModelKind.BASE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SInformationModelKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainProxies() <em>Domain Proxies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainProxies()
	 * @generated
	 * @ordered
	 */
	protected EList<SDomainDeduction> domainProxies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SInformationModelImpl()
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
		return SimPackage.Literals.SINFORMATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliases()
	{
		if (aliases == null)
		{
			aliases = new EDataTypeUniqueEList<String>(String.class, this, SimPackage.SINFORMATION_MODEL__ALIASES);
		}
		return aliases;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SINFORMATION_MODEL__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SINFORMATION_MODEL__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__DESCRIPTION, newDescription, newDescription));
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
			aggregates = new EObjectContainmentEList<DAggregate>(DAggregate.class, this, SimPackage.SINFORMATION_MODEL__AGGREGATES);
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
			types = new EObjectContainmentEList<DType>(DType.class, this, SimPackage.SINFORMATION_MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerate()
	{
		return generate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerate(boolean newGenerate)
	{
		boolean oldGenerate = generate;
		generate = newGenerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__GENERATE, oldGenerate, generate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SInformationModelKind getKind()
	{
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(SInformationModelKind newKind)
	{
		SInformationModelKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SDomainDeduction> getDomainProxies()
	{
		if (domainProxies == null)
		{
			domainProxies = new EObjectContainmentEList<SDomainDeduction>(SDomainDeduction.class, this, SimPackage.SINFORMATION_MODEL__DOMAIN_PROXIES);
		}
		return domainProxies;
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
			case SimPackage.SINFORMATION_MODEL__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case SimPackage.SINFORMATION_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case SimPackage.SINFORMATION_MODEL__DOMAIN_PROXIES:
				return ((InternalEList<?>)getDomainProxies()).basicRemove(otherEnd, msgs);
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
			case SimPackage.SINFORMATION_MODEL__NAME:
				return getName();
			case SimPackage.SINFORMATION_MODEL__ALIASES:
				return getAliases();
			case SimPackage.SINFORMATION_MODEL__DESCRIPTION:
				return getDescription();
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				return getAggregates();
			case SimPackage.SINFORMATION_MODEL__TYPES:
				return getTypes();
			case SimPackage.SINFORMATION_MODEL__GENERATE:
				return isGenerate();
			case SimPackage.SINFORMATION_MODEL__KIND:
				return getKind();
			case SimPackage.SINFORMATION_MODEL__DOMAIN_PROXIES:
				return getDomainProxies();
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
			case SimPackage.SINFORMATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends String>)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__DESCRIPTION:
				setDescription((DRichText)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends DAggregate>)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__GENERATE:
				setGenerate((Boolean)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__KIND:
				setKind((SInformationModelKind)newValue);
				return;
			case SimPackage.SINFORMATION_MODEL__DOMAIN_PROXIES:
				getDomainProxies().clear();
				getDomainProxies().addAll((Collection<? extends SDomainDeduction>)newValue);
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
			case SimPackage.SINFORMATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimPackage.SINFORMATION_MODEL__ALIASES:
				getAliases().clear();
				return;
			case SimPackage.SINFORMATION_MODEL__DESCRIPTION:
				setDescription((DRichText)null);
				return;
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				getAggregates().clear();
				return;
			case SimPackage.SINFORMATION_MODEL__TYPES:
				getTypes().clear();
				return;
			case SimPackage.SINFORMATION_MODEL__GENERATE:
				setGenerate(GENERATE_EDEFAULT);
				return;
			case SimPackage.SINFORMATION_MODEL__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SimPackage.SINFORMATION_MODEL__DOMAIN_PROXIES:
				getDomainProxies().clear();
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
			case SimPackage.SINFORMATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimPackage.SINFORMATION_MODEL__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case SimPackage.SINFORMATION_MODEL__DESCRIPTION:
				return description != null;
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case SimPackage.SINFORMATION_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case SimPackage.SINFORMATION_MODEL__GENERATE:
				return generate != GENERATE_EDEFAULT;
			case SimPackage.SINFORMATION_MODEL__KIND:
				return kind != KIND_EDEFAULT;
			case SimPackage.SINFORMATION_MODEL__DOMAIN_PROXIES:
				return domainProxies != null && !domainProxies.isEmpty();
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
		if (baseClass == DNamedElement.class)
		{
			switch (derivedFeatureID)
			{
				case SimPackage.SINFORMATION_MODEL__NAME: return BasePackage.DNAMED_ELEMENT__NAME;
				case SimPackage.SINFORMATION_MODEL__ALIASES: return BasePackage.DNAMED_ELEMENT__ALIASES;
				case SimPackage.SINFORMATION_MODEL__DESCRIPTION: return BasePackage.DNAMED_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DModel.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == IAggregateContainer.class)
		{
			switch (derivedFeatureID)
			{
				case SimPackage.SINFORMATION_MODEL__AGGREGATES: return BasePackage.IAGGREGATE_CONTAINER__AGGREGATES;
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (derivedFeatureID)
			{
				case SimPackage.SINFORMATION_MODEL__TYPES: return BasePackage.ITYPE_CONTAINER__TYPES;
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
		if (baseClass == DNamedElement.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.DNAMED_ELEMENT__NAME: return SimPackage.SINFORMATION_MODEL__NAME;
				case BasePackage.DNAMED_ELEMENT__ALIASES: return SimPackage.SINFORMATION_MODEL__ALIASES;
				case BasePackage.DNAMED_ELEMENT__DESCRIPTION: return SimPackage.SINFORMATION_MODEL__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DModel.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == IAggregateContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.IAGGREGATE_CONTAINER__AGGREGATES: return SimPackage.SINFORMATION_MODEL__AGGREGATES;
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.ITYPE_CONTAINER__TYPES: return SimPackage.SINFORMATION_MODEL__TYPES;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", aliases: ");
		result.append(aliases);
		result.append(", generate: ");
		result.append(generate);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SInformationModelImpl
