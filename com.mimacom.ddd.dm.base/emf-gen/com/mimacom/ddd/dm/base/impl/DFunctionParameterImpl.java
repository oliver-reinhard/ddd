/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DFunctionParameter;
import com.mimacom.ddd.dm.base.DSystemType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFunction Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DFunctionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DFunctionParameterImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DFunctionParameterImpl#isSystemTypeMany <em>System Type Many</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DFunctionParameterImpl extends MinimalEObjectImpl.Container implements DFunctionParameter
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
	 * The default value of the '{@link #getSystemType() <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected static final DSystemType SYSTEM_TYPE_EDEFAULT = DSystemType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSystemType() <em>System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected DSystemType systemType = SYSTEM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSystemTypeMany() <em>System Type Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystemTypeMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYSTEM_TYPE_MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSystemTypeMany() <em>System Type Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystemTypeMany()
	 * @generated
	 * @ordered
	 */
	protected boolean systemTypeMany = SYSTEM_TYPE_MANY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFunctionParameterImpl()
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
		return BasePackage.Literals.DFUNCTION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DFUNCTION_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSystemType getSystemType()
	{
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemType(DSystemType newSystemType)
	{
		DSystemType oldSystemType = systemType;
		systemType = newSystemType == null ? SYSTEM_TYPE_EDEFAULT : newSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE, oldSystemType, systemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSystemTypeMany()
	{
		return systemTypeMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemTypeMany(boolean newSystemTypeMany)
	{
		boolean oldSystemTypeMany = systemTypeMany;
		systemTypeMany = newSystemTypeMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE_MANY, oldSystemTypeMany, systemTypeMany));
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
			case BasePackage.DFUNCTION_PARAMETER__NAME:
				return getName();
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE:
				return getSystemType();
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE_MANY:
				return isSystemTypeMany();
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
			case BasePackage.DFUNCTION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE:
				setSystemType((DSystemType)newValue);
				return;
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE_MANY:
				setSystemTypeMany((Boolean)newValue);
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
			case BasePackage.DFUNCTION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE:
				setSystemType(SYSTEM_TYPE_EDEFAULT);
				return;
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE_MANY:
				setSystemTypeMany(SYSTEM_TYPE_MANY_EDEFAULT);
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
			case BasePackage.DFUNCTION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE:
				return systemType != SYSTEM_TYPE_EDEFAULT;
			case BasePackage.DFUNCTION_PARAMETER__SYSTEM_TYPE_MANY:
				return systemTypeMany != SYSTEM_TYPE_MANY_EDEFAULT;
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
		result.append(", systemType: ");
		result.append(systemType);
		result.append(", systemTypeMany: ");
		result.append(systemTypeMany);
		result.append(')');
		return result.toString();
	}

} //DFunctionParameterImpl
