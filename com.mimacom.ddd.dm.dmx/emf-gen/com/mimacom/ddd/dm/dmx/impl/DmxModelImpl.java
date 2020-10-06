/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.ITypeContainer;

import com.mimacom.ddd.dm.base.base.impl.DModelImpl;

import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxTest;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxModelImpl extends DModelImpl implements DmxModel
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
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DmxFilter> filters;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<DmxTest> tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxModelImpl()
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
		return DmxPackage.Literals.DMX_MODEL;
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
			types = new EObjectContainmentEList<DType>(DType.class, this, DmxPackage.DMX_MODEL__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DmxFilter> getFilters()
	{
		if (filters == null)
		{
			filters = new EObjectContainmentEList<DmxFilter>(DmxFilter.class, this, DmxPackage.DMX_MODEL__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DmxTest> getTests()
	{
		if (tests == null)
		{
			tests = new EObjectContainmentEList<DmxTest>(DmxTest.class, this, DmxPackage.DMX_MODEL__TESTS);
		}
		return tests;
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
			case DmxPackage.DMX_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case DmxPackage.DMX_MODEL__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case DmxPackage.DMX_MODEL__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
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
			case DmxPackage.DMX_MODEL__TYPES:
				return getTypes();
			case DmxPackage.DMX_MODEL__FILTERS:
				return getFilters();
			case DmxPackage.DMX_MODEL__TESTS:
				return getTests();
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
			case DmxPackage.DMX_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case DmxPackage.DMX_MODEL__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends DmxFilter>)newValue);
				return;
			case DmxPackage.DMX_MODEL__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends DmxTest>)newValue);
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
			case DmxPackage.DMX_MODEL__TYPES:
				getTypes().clear();
				return;
			case DmxPackage.DMX_MODEL__FILTERS:
				getFilters().clear();
				return;
			case DmxPackage.DMX_MODEL__TESTS:
				getTests().clear();
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
			case DmxPackage.DMX_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case DmxPackage.DMX_MODEL__FILTERS:
				return filters != null && !filters.isEmpty();
			case DmxPackage.DMX_MODEL__TESTS:
				return tests != null && !tests.isEmpty();
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
				case DmxPackage.DMX_MODEL__TYPES: return BasePackage.ITYPE_CONTAINER__TYPES;
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
				case BasePackage.ITYPE_CONTAINER__TYPES: return DmxPackage.DMX_MODEL__TYPES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DmxModelImpl
