/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DNavigableMember;

import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxPackage;

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
 * An implementation of the model object '<em><b>Complex Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxComplexObjectImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxComplexObjectImpl extends MinimalEObjectImpl.Container implements DmxComplexObject
{
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DComplexType type;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<DmxField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxComplexObjectImpl()
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
		return DmxPackage.Literals.DMX_COMPLEX_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DComplexType getType()
	{
		if (type != null && type.eIsProxy())
		{
			InternalEObject oldType = (InternalEObject)type;
			type = (DComplexType)eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_COMPLEX_OBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DComplexType basicGetType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DComplexType newType)
	{
		DComplexType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_COMPLEX_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DmxField> getFields()
	{
		if (fields == null)
		{
			fields = new EObjectContainmentEList<DmxField>(DmxField.class, this, DmxPackage.DMX_COMPLEX_OBJECT__FIELDS);
		}
		return fields;
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
			case DmxPackage.DMX_COMPLEX_OBJECT__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case DmxPackage.DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case DmxPackage.DMX_COMPLEX_OBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DmxPackage.DMX_COMPLEX_OBJECT__FIELDS:
				return getFields();
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
			case DmxPackage.DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case DmxPackage.DMX_COMPLEX_OBJECT__TYPE:
				setType((DComplexType)newValue);
				return;
			case DmxPackage.DMX_COMPLEX_OBJECT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends DmxField>)newValue);
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
			case DmxPackage.DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case DmxPackage.DMX_COMPLEX_OBJECT__TYPE:
				setType((DComplexType)null);
				return;
			case DmxPackage.DMX_COMPLEX_OBJECT__FIELDS:
				getFields().clear();
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
			case DmxPackage.DMX_COMPLEX_OBJECT__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case DmxPackage.DMX_COMPLEX_OBJECT__TYPE:
				return type != null;
			case DmxPackage.DMX_COMPLEX_OBJECT__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DmxComplexObjectImpl
