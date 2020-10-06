/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DAttributeImpl#isDetail <em>Detail</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DAttributeImpl#isKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAttributeImpl extends DFeatureImpl implements DAttribute
{
	/**
	 * The default value of the '{@link #isDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetail()
	 * @generated
	 * @ordered
	 */
	protected boolean detail = DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKey()
	 * @generated
	 * @ordered
	 */
	protected boolean key = KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAttributeImpl()
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
		return BasePackage.Literals.DATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDetail()
	{
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetail(boolean newDetail)
	{
		boolean oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATTRIBUTE__DETAIL, oldDetail, detail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKey()
	{
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(boolean newKey)
	{
		boolean oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DATTRIBUTE__KEY, oldKey, key));
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
			case BasePackage.DATTRIBUTE__DETAIL:
				return isDetail();
			case BasePackage.DATTRIBUTE__KEY:
				return isKey();
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
			case BasePackage.DATTRIBUTE__DETAIL:
				setDetail((Boolean)newValue);
				return;
			case BasePackage.DATTRIBUTE__KEY:
				setKey((Boolean)newValue);
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
			case BasePackage.DATTRIBUTE__DETAIL:
				setDetail(DETAIL_EDEFAULT);
				return;
			case BasePackage.DATTRIBUTE__KEY:
				setKey(KEY_EDEFAULT);
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
			case BasePackage.DATTRIBUTE__DETAIL:
				return detail != DETAIL_EDEFAULT;
			case BasePackage.DATTRIBUTE__KEY:
				return key != KEY_EDEFAULT;
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
		result.append(" (detail: ");
		result.append(detail);
		result.append(", key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //DAttributeImpl
