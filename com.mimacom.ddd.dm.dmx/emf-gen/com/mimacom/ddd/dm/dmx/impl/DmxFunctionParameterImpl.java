/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxFunctionParameter;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionParameterImpl#isBaseTypeCollection <em>Base Type Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxFunctionParameterImpl extends MinimalEObjectImpl.Container implements DmxFunctionParameter
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
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final DmxBaseType BASE_TYPE_EDEFAULT = DmxBaseType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected DmxBaseType baseType = BASE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBaseTypeCollection() <em>Base Type Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseTypeCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BASE_TYPE_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBaseTypeCollection() <em>Base Type Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBaseTypeCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean baseTypeCollection = BASE_TYPE_COLLECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxFunctionParameterImpl()
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
		return DmxPackage.Literals.DMX_FUNCTION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FUNCTION_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxBaseType getBaseType()
	{
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseType(DmxBaseType newBaseType)
	{
		DmxBaseType oldBaseType = baseType;
		baseType = newBaseType == null ? BASE_TYPE_EDEFAULT : newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBaseTypeCollection()
	{
		return baseTypeCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseTypeCollection(boolean newBaseTypeCollection)
	{
		boolean oldBaseTypeCollection = baseTypeCollection;
		baseTypeCollection = newBaseTypeCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION, oldBaseTypeCollection, baseTypeCollection));
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
			case DmxPackage.DMX_FUNCTION_PARAMETER__NAME:
				return getName();
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE:
				return getBaseType();
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION:
				return isBaseTypeCollection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case DmxPackage.DMX_FUNCTION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE:
				setBaseType((DmxBaseType)newValue);
				return;
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION:
				setBaseTypeCollection((Boolean)newValue);
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
			case DmxPackage.DMX_FUNCTION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
				return;
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION:
				setBaseTypeCollection(BASE_TYPE_COLLECTION_EDEFAULT);
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
			case DmxPackage.DMX_FUNCTION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE:
				return baseType != BASE_TYPE_EDEFAULT;
			case DmxPackage.DMX_FUNCTION_PARAMETER__BASE_TYPE_COLLECTION:
				return baseTypeCollection != BASE_TYPE_COLLECTION_EDEFAULT;
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
		result.append(", baseType: ");
		result.append(baseType);
		result.append(", baseTypeCollection: ");
		result.append(baseTypeCollection);
		result.append(')');
		return result.toString();
	}

} //DmxFunctionParameterImpl
