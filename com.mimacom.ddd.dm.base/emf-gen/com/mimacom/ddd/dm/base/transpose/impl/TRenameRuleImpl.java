/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.transpose.TRenameRule;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TRename Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TRenameRuleImpl#getRenameTo <em>Rename To</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TRenameRuleImpl#isReadOnlyView <em>Read Only View</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TRenameRuleImpl extends TTranspositionRuleImpl implements TRenameRule
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
	 * The default value of the '{@link #isReadOnlyView() <em>Read Only View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnlyView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnlyView() <em>Read Only View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnlyView()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnlyView = READ_ONLY_VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRenameRuleImpl()
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
		return TransposePackage.Literals.TRENAME_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TRENAME_RULE__RENAME_TO, oldRenameTo, renameTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnlyView()
	{
		return readOnlyView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnlyView(boolean newReadOnlyView)
	{
		boolean oldReadOnlyView = readOnlyView;
		readOnlyView = newReadOnlyView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TRENAME_RULE__READ_ONLY_VIEW, oldReadOnlyView, readOnlyView));
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
			case TransposePackage.TRENAME_RULE__RENAME_TO:
				return getRenameTo();
			case TransposePackage.TRENAME_RULE__READ_ONLY_VIEW:
				return isReadOnlyView();
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
			case TransposePackage.TRENAME_RULE__RENAME_TO:
				setRenameTo((String)newValue);
				return;
			case TransposePackage.TRENAME_RULE__READ_ONLY_VIEW:
				setReadOnlyView((Boolean)newValue);
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
			case TransposePackage.TRENAME_RULE__RENAME_TO:
				setRenameTo(RENAME_TO_EDEFAULT);
				return;
			case TransposePackage.TRENAME_RULE__READ_ONLY_VIEW:
				setReadOnlyView(READ_ONLY_VIEW_EDEFAULT);
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
			case TransposePackage.TRENAME_RULE__RENAME_TO:
				return RENAME_TO_EDEFAULT == null ? renameTo != null : !RENAME_TO_EDEFAULT.equals(renameTo);
			case TransposePackage.TRENAME_RULE__READ_ONLY_VIEW:
				return readOnlyView != READ_ONLY_VIEW_EDEFAULT;
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
		result.append(", readOnlyView: ");
		result.append(readOnlyView);
		result.append(')');
		return result.toString();
	}

} //TRenameRuleImpl
