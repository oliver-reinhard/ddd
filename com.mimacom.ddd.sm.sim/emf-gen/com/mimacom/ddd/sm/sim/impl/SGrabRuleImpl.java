/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.impl.DDeductionRuleImplCustom;

import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGrab Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SGrabRuleImpl#getRenameTo <em>Rename To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrabRuleImpl extends DDeductionRuleImplCustom implements SGrabRule
{
	/**
	 * The default value of the '{@link #getRenameTo() <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenameTo()
	 * @generated
	 * @ordered
	 */
	protected static final String RENAME_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRenameTo() <em>Rename To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenameTo()
	 * @generated
	 * @ordered
	 */
	protected String renameTo = RENAME_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrabRuleImpl()
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
		return SimPackage.Literals.SGRAB_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRenameTo()
	{
		return renameTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenameTo(String newRenameTo)
	{
		String oldRenameTo = renameTo;
		renameTo = newRenameTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SGRAB_RULE__RENAME_TO, oldRenameTo, renameTo));
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
			case SimPackage.SGRAB_RULE__RENAME_TO:
				return getRenameTo();
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
			case SimPackage.SGRAB_RULE__RENAME_TO:
				setRenameTo((String)newValue);
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
			case SimPackage.SGRAB_RULE__RENAME_TO:
				setRenameTo(RENAME_TO_EDEFAULT);
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
			case SimPackage.SGRAB_RULE__RENAME_TO:
				return RENAME_TO_EDEFAULT == null ? renameTo != null : !RENAME_TO_EDEFAULT.equals(renameTo);
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
		result.append(" (renameTo: ");
		result.append(renameTo);
		result.append(')');
		return result.toString();
	}

} //SGrabRuleImpl
