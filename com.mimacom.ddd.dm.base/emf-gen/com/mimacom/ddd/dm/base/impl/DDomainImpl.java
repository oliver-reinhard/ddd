/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IIdentityStateModel;
import com.mimacom.ddd.dm.base.INamespace;
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
 * An implementation of the model object '<em><b>DDomain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getDeducedFrom <em>Deduced From</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#isSynthetic <em>Synthetic</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getStateModels <em>State Models</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDomainImpl extends DNamedElementImpl implements DDomain
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
	 * The cached value of the '{@link #getStateModels() <em>State Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateModels()
	 * @generated
	 * @ordered
	 */
	protected EList<IIdentityStateModel> stateModels;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DDomainEvent> events;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<DActor> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDomainImpl()
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
		return BasePackage.Literals.DDOMAIN;
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
			types = new EObjectContainmentEList<DType>(DType.class, this, BasePackage.DDOMAIN__TYPES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DDOMAIN__DEDUCED_FROM, oldDeducedFrom, deducedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DDOMAIN__DEDUCED_FROM, oldDeducedFrom, deducedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DDOMAIN__SYNTHETIC, oldSynthetic, synthetic));
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
			imports = new EObjectContainmentEList<DImport>(DImport.class, this, BasePackage.DDOMAIN__IMPORTS);
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
			aggregates = new EObjectContainmentEList<DAggregate>(DAggregate.class, this, BasePackage.DDOMAIN__AGGREGATES);
		}
		return aggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IIdentityStateModel> getStateModels()
	{
		if (stateModels == null)
		{
			stateModels = new EObjectContainmentEList<IIdentityStateModel>(IIdentityStateModel.class, this, BasePackage.DDOMAIN__STATE_MODELS);
		}
		return stateModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DDomainEvent> getEvents()
	{
		if (events == null)
		{
			events = new EObjectContainmentEList<DDomainEvent>(DDomainEvent.class, this, BasePackage.DDOMAIN__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DActor> getActors()
	{
		if (actors == null)
		{
			actors = new EObjectContainmentEList<DActor>(DActor.class, this, BasePackage.DDOMAIN__ACTORS);
		}
		return actors;
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
			case BasePackage.DDOMAIN__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__STATE_MODELS:
				return ((InternalEList<?>)getStateModels()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DDOMAIN__TYPES:
				return getTypes();
			case BasePackage.DDOMAIN__DEDUCED_FROM:
				if (resolve) return getDeducedFrom();
				return basicGetDeducedFrom();
			case BasePackage.DDOMAIN__SYNTHETIC:
				return isSynthetic();
			case BasePackage.DDOMAIN__IMPORTS:
				return getImports();
			case BasePackage.DDOMAIN__AGGREGATES:
				return getAggregates();
			case BasePackage.DDOMAIN__STATE_MODELS:
				return getStateModels();
			case BasePackage.DDOMAIN__EVENTS:
				return getEvents();
			case BasePackage.DDOMAIN__ACTORS:
				return getActors();
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
			case BasePackage.DDOMAIN__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case BasePackage.DDOMAIN__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)newValue);
				return;
			case BasePackage.DDOMAIN__SYNTHETIC:
				setSynthetic((Boolean)newValue);
				return;
			case BasePackage.DDOMAIN__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DImport>)newValue);
				return;
			case BasePackage.DDOMAIN__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends DAggregate>)newValue);
				return;
			case BasePackage.DDOMAIN__STATE_MODELS:
				getStateModels().clear();
				getStateModels().addAll((Collection<? extends IIdentityStateModel>)newValue);
				return;
			case BasePackage.DDOMAIN__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DDomainEvent>)newValue);
				return;
			case BasePackage.DDOMAIN__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends DActor>)newValue);
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
			case BasePackage.DDOMAIN__TYPES:
				getTypes().clear();
				return;
			case BasePackage.DDOMAIN__DEDUCED_FROM:
				setDeducedFrom((IDeductionDefinition)null);
				return;
			case BasePackage.DDOMAIN__SYNTHETIC:
				setSynthetic(SYNTHETIC_EDEFAULT);
				return;
			case BasePackage.DDOMAIN__IMPORTS:
				getImports().clear();
				return;
			case BasePackage.DDOMAIN__AGGREGATES:
				getAggregates().clear();
				return;
			case BasePackage.DDOMAIN__STATE_MODELS:
				getStateModels().clear();
				return;
			case BasePackage.DDOMAIN__EVENTS:
				getEvents().clear();
				return;
			case BasePackage.DDOMAIN__ACTORS:
				getActors().clear();
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
			case BasePackage.DDOMAIN__TYPES:
				return types != null && !types.isEmpty();
			case BasePackage.DDOMAIN__DEDUCED_FROM:
				return deducedFrom != null;
			case BasePackage.DDOMAIN__SYNTHETIC:
				return synthetic != SYNTHETIC_EDEFAULT;
			case BasePackage.DDOMAIN__IMPORTS:
				return imports != null && !imports.isEmpty();
			case BasePackage.DDOMAIN__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case BasePackage.DDOMAIN__STATE_MODELS:
				return stateModels != null && !stateModels.isEmpty();
			case BasePackage.DDOMAIN__EVENTS:
				return events != null && !events.isEmpty();
			case BasePackage.DDOMAIN__ACTORS:
				return actors != null && !actors.isEmpty();
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
		if (baseClass == INamespace.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DDOMAIN__TYPES: return BasePackage.ITYPE_CONTAINER__TYPES;
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
				case BasePackage.DDOMAIN__DEDUCED_FROM: return BasePackage.IDEDUCIBLE_ELEMENT__DEDUCED_FROM;
				case BasePackage.DDOMAIN__SYNTHETIC: return BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC;
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
		if (baseClass == INamespace.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.ITYPE_CONTAINER__TYPES: return BasePackage.DDOMAIN__TYPES;
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
				case BasePackage.IDEDUCIBLE_ELEMENT__DEDUCED_FROM: return BasePackage.DDOMAIN__DEDUCED_FROM;
				case BasePackage.IDEDUCIBLE_ELEMENT__SYNTHETIC: return BasePackage.DDOMAIN__SYNTHETIC;
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

} //DDomainImpl
