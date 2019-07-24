/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DFunction;
import com.mimacom.ddd.dm.base.DFunctionParameter;
import com.mimacom.ddd.dm.base.DSystemType;

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
 * An implementation of the model object '<em><b>DFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DFunctionImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DFunctionImpl#isSystemTypeMany <em>System Type Many</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DFunctionImpl extends DNavigableMemberImplCustom implements DFunction
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DFunctionParameter> parameters;

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
	protected DFunctionImpl()
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
		return BasePackage.Literals.DFUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DFunctionParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<DFunctionParameter>(DFunctionParameter.class, this, BasePackage.DFUNCTION__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DFUNCTION__SYSTEM_TYPE, oldSystemType, systemType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DFUNCTION__SYSTEM_TYPE_MANY, oldSystemTypeMany, systemTypeMany));
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
			case BasePackage.DFUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DFUNCTION__PARAMETERS:
				return getParameters();
			case BasePackage.DFUNCTION__SYSTEM_TYPE:
				return getSystemType();
			case BasePackage.DFUNCTION__SYSTEM_TYPE_MANY:
				return isSystemTypeMany();
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
			case BasePackage.DFUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DFunctionParameter>)newValue);
				return;
			case BasePackage.DFUNCTION__SYSTEM_TYPE:
				setSystemType((DSystemType)newValue);
				return;
			case BasePackage.DFUNCTION__SYSTEM_TYPE_MANY:
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
			case BasePackage.DFUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case BasePackage.DFUNCTION__SYSTEM_TYPE:
				setSystemType(SYSTEM_TYPE_EDEFAULT);
				return;
			case BasePackage.DFUNCTION__SYSTEM_TYPE_MANY:
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
			case BasePackage.DFUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BasePackage.DFUNCTION__SYSTEM_TYPE:
				return systemType != SYSTEM_TYPE_EDEFAULT;
			case BasePackage.DFUNCTION__SYSTEM_TYPE_MANY:
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
		result.append(" (systemType: ");
		result.append(systemType);
		result.append(", systemTypeMany: ");
		result.append(systemTypeMany);
		result.append(')');
		return result.toString();
	}

} //DFunctionImpl
