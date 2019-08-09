/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.impl.DNavigableMemberImplCustom;

import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxPackage;

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
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl#getTypeDesc <em>Type Desc</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterImpl#getWithTypeSet <em>With Type Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxFilterImpl extends DNavigableMemberImplCustom implements DmxFilter
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DmxFilterParameter> parameters;

	/**
	 * The cached value of the '{@link #getTypeDesc() <em>Type Desc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDesc()
	 * @generated
	 * @ordered
	 */
	protected DmxFilterTypeDescriptor typeDesc;

	/**
	 * The cached value of the '{@link #getWithTypeSet() <em>With Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithTypeSet()
	 * @generated
	 * @ordered
	 */
	protected DmxBaseTypeSet withTypeSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxFilterImpl()
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
		return DmxPackage.Literals.DMX_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DmxFilterParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<DmxFilterParameter>(DmxFilterParameter.class, this, DmxPackage.DMX_FILTER__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxFilterTypeDescriptor getTypeDesc()
	{
		return typeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDesc(DmxFilterTypeDescriptor newTypeDesc, NotificationChain msgs)
	{
		DmxFilterTypeDescriptor oldTypeDesc = typeDesc;
		typeDesc = newTypeDesc;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER__TYPE_DESC, oldTypeDesc, newTypeDesc);
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
	public void setTypeDesc(DmxFilterTypeDescriptor newTypeDesc)
	{
		if (newTypeDesc != typeDesc)
		{
			NotificationChain msgs = null;
			if (typeDesc != null)
				msgs = ((InternalEObject)typeDesc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FILTER__TYPE_DESC, null, msgs);
			if (newTypeDesc != null)
				msgs = ((InternalEObject)newTypeDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FILTER__TYPE_DESC, null, msgs);
			msgs = basicSetTypeDesc(newTypeDesc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER__TYPE_DESC, newTypeDesc, newTypeDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxBaseTypeSet getWithTypeSet()
	{
		return withTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithTypeSet(DmxBaseTypeSet newWithTypeSet, NotificationChain msgs)
	{
		DmxBaseTypeSet oldWithTypeSet = withTypeSet;
		withTypeSet = newWithTypeSet;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER__WITH_TYPE_SET, oldWithTypeSet, newWithTypeSet);
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
	public void setWithTypeSet(DmxBaseTypeSet newWithTypeSet)
	{
		if (newWithTypeSet != withTypeSet)
		{
			NotificationChain msgs = null;
			if (withTypeSet != null)
				msgs = ((InternalEObject)withTypeSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FILTER__WITH_TYPE_SET, null, msgs);
			if (newWithTypeSet != null)
				msgs = ((InternalEObject)newWithTypeSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FILTER__WITH_TYPE_SET, null, msgs);
			msgs = basicSetWithTypeSet(newWithTypeSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER__WITH_TYPE_SET, newWithTypeSet, newWithTypeSet));
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
			case DmxPackage.DMX_FILTER__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DmxPackage.DMX_FILTER__TYPE_DESC:
				return basicSetTypeDesc(null, msgs);
			case DmxPackage.DMX_FILTER__WITH_TYPE_SET:
				return basicSetWithTypeSet(null, msgs);
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
			case DmxPackage.DMX_FILTER__PARAMETERS:
				return getParameters();
			case DmxPackage.DMX_FILTER__TYPE_DESC:
				return getTypeDesc();
			case DmxPackage.DMX_FILTER__WITH_TYPE_SET:
				return getWithTypeSet();
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
			case DmxPackage.DMX_FILTER__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DmxFilterParameter>)newValue);
				return;
			case DmxPackage.DMX_FILTER__TYPE_DESC:
				setTypeDesc((DmxFilterTypeDescriptor)newValue);
				return;
			case DmxPackage.DMX_FILTER__WITH_TYPE_SET:
				setWithTypeSet((DmxBaseTypeSet)newValue);
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
			case DmxPackage.DMX_FILTER__PARAMETERS:
				getParameters().clear();
				return;
			case DmxPackage.DMX_FILTER__TYPE_DESC:
				setTypeDesc((DmxFilterTypeDescriptor)null);
				return;
			case DmxPackage.DMX_FILTER__WITH_TYPE_SET:
				setWithTypeSet((DmxBaseTypeSet)null);
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
			case DmxPackage.DMX_FILTER__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DmxPackage.DMX_FILTER__TYPE_DESC:
				return typeDesc != null;
			case DmxPackage.DMX_FILTER__WITH_TYPE_SET:
				return withTypeSet != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxFilterImpl
