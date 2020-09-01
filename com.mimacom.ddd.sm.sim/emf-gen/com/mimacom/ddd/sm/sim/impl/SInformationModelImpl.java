/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;

import com.mimacom.ddd.dm.base.impl.DModelImpl;

import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.STypeMapping;
import com.mimacom.ddd.sm.sim.SimPackage;

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
 * An implementation of the model object '<em><b>SInformation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#isGenerate <em>Generate</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SInformationModelImpl#getIndexingHelper <em>Indexing Helper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SInformationModelImpl extends DModelImpl implements SInformationModel
{
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
	 * The cached value of the '{@link #getIndexingHelper() <em>Indexing Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexingHelper()
	 * @generated
	 * @ordered
	 */
	protected STypeMapping indexingHelper;

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
	public STypeMapping getIndexingHelper()
	{
		return indexingHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexingHelper(STypeMapping newIndexingHelper, NotificationChain msgs)
	{
		STypeMapping oldIndexingHelper = indexingHelper;
		indexingHelper = newIndexingHelper;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__INDEXING_HELPER, oldIndexingHelper, newIndexingHelper);
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
	public void setIndexingHelper(STypeMapping newIndexingHelper)
	{
		if (newIndexingHelper != indexingHelper)
		{
			NotificationChain msgs = null;
			if (indexingHelper != null)
				msgs = ((InternalEObject)indexingHelper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SINFORMATION_MODEL__INDEXING_HELPER, null, msgs);
			if (newIndexingHelper != null)
				msgs = ((InternalEObject)newIndexingHelper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SINFORMATION_MODEL__INDEXING_HELPER, null, msgs);
			msgs = basicSetIndexingHelper(newIndexingHelper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SINFORMATION_MODEL__INDEXING_HELPER, newIndexingHelper, newIndexingHelper));
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
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case SimPackage.SINFORMATION_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case SimPackage.SINFORMATION_MODEL__INDEXING_HELPER:
				return basicSetIndexingHelper(null, msgs);
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
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				return getAggregates();
			case SimPackage.SINFORMATION_MODEL__TYPES:
				return getTypes();
			case SimPackage.SINFORMATION_MODEL__GENERATE:
				return isGenerate();
			case SimPackage.SINFORMATION_MODEL__KIND:
				return getKind();
			case SimPackage.SINFORMATION_MODEL__INDEXING_HELPER:
				return getIndexingHelper();
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
			case SimPackage.SINFORMATION_MODEL__INDEXING_HELPER:
				setIndexingHelper((STypeMapping)newValue);
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
			case SimPackage.SINFORMATION_MODEL__INDEXING_HELPER:
				setIndexingHelper((STypeMapping)null);
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
			case SimPackage.SINFORMATION_MODEL__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case SimPackage.SINFORMATION_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case SimPackage.SINFORMATION_MODEL__GENERATE:
				return generate != GENERATE_EDEFAULT;
			case SimPackage.SINFORMATION_MODEL__KIND:
				return kind != KIND_EDEFAULT;
			case SimPackage.SINFORMATION_MODEL__INDEXING_HELPER:
				return indexingHelper != null;
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
		if (baseClass == IDiagramRoot.class)
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
		if (baseClass == IDiagramRoot.class)
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
		result.append(" (generate: ");
		result.append(generate);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SInformationModelImpl
