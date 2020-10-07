/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.impl.DInformationModelImpl;

import com.mimacom.ddd.dm.base.transpose.TInformationModel;
import com.mimacom.ddd.dm.base.transpose.TTypeMapping;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TInformation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TInformationModelImpl#getIndexingHelper <em>Indexing Helper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TInformationModelImpl extends DInformationModelImpl implements TInformationModel
{
	/**
	 * The cached value of the '{@link #getIndexingHelper() <em>Indexing Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexingHelper()
	 * @generated
	 * @ordered
	 */
	protected TTypeMapping indexingHelper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TInformationModelImpl()
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
		return TransposePackage.Literals.TINFORMATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTypeMapping getIndexingHelper()
	{
		return indexingHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexingHelper(TTypeMapping newIndexingHelper, NotificationChain msgs)
	{
		TTypeMapping oldIndexingHelper = indexingHelper;
		indexingHelper = newIndexingHelper;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER, oldIndexingHelper, newIndexingHelper);
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
	public void setIndexingHelper(TTypeMapping newIndexingHelper)
	{
		if (newIndexingHelper != indexingHelper)
		{
			NotificationChain msgs = null;
			if (indexingHelper != null)
				msgs = ((InternalEObject)indexingHelper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER, null, msgs);
			if (newIndexingHelper != null)
				msgs = ((InternalEObject)newIndexingHelper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER, null, msgs);
			msgs = basicSetIndexingHelper(newIndexingHelper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER, newIndexingHelper, newIndexingHelper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean allowsIdentityTypes()
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER:
				return basicSetIndexingHelper(null, msgs);
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
			case TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER:
				return getIndexingHelper();
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
			case TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER:
				setIndexingHelper((TTypeMapping)newValue);
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
			case TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER:
				setIndexingHelper((TTypeMapping)null);
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
			case TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER:
				return indexingHelper != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case TransposePackage.TINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES:
				return allowsIdentityTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TInformationModelImpl
