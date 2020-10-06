/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DRichText;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DNamed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DNamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DNamedElementImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DNamedElementImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DNamedElementImpl extends MinimalEObjectImpl.Container implements DNamedElement
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DNamedElementImpl()
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
		return BasePackage.Literals.DNAMED_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DNAMED_ELEMENT__NAME, oldName, name));
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
			aliases = new EDataTypeUniqueEList<String>(String.class, this, BasePackage.DNAMED_ELEMENT__ALIASES);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DNAMED_ELEMENT__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DNAMED_ELEMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DNAMED_ELEMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DNAMED_ELEMENT__DESCRIPTION, newDescription, newDescription));
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
			case BasePackage.DNAMED_ELEMENT__DESCRIPTION:
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
			case BasePackage.DNAMED_ELEMENT__NAME:
				return getName();
			case BasePackage.DNAMED_ELEMENT__ALIASES:
				return getAliases();
			case BasePackage.DNAMED_ELEMENT__DESCRIPTION:
				return getDescription();
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
			case BasePackage.DNAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case BasePackage.DNAMED_ELEMENT__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends String>)newValue);
				return;
			case BasePackage.DNAMED_ELEMENT__DESCRIPTION:
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
			case BasePackage.DNAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BasePackage.DNAMED_ELEMENT__ALIASES:
				getAliases().clear();
				return;
			case BasePackage.DNAMED_ELEMENT__DESCRIPTION:
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
			case BasePackage.DNAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BasePackage.DNAMED_ELEMENT__ALIASES:
				return aliases != null && !aliases.isEmpty();
			case BasePackage.DNAMED_ELEMENT__DESCRIPTION:
				return description != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //DNamedElementImpl
