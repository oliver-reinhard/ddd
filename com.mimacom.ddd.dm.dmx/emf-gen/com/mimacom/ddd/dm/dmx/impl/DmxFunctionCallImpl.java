/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFunctionCallImpl#getCallArguments <em>Call Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxFunctionCallImpl extends DExpressionImpl implements DmxFunctionCall
{
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected DmxFilter function;

	/**
	 * The cached value of the '{@link #getCallArguments() <em>Call Arguments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallArguments()
	 * @generated
	 * @ordered
	 */
	protected DmxCallArguments callArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxFunctionCallImpl()
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
		return DmxPackage.Literals.DMX_FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxFilter getFunction()
	{
		if (function != null && function.eIsProxy())
		{
			InternalEObject oldFunction = (InternalEObject)function;
			function = (DmxFilter)eResolveProxy(oldFunction);
			if (function != oldFunction)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_FUNCTION_CALL__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxFilter basicGetFunction()
	{
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(DmxFilter newFunction)
	{
		DmxFilter oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FUNCTION_CALL__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxCallArguments getCallArguments()
	{
		return callArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallArguments(DmxCallArguments newCallArguments, NotificationChain msgs)
	{
		DmxCallArguments oldCallArguments = callArguments;
		callArguments = newCallArguments;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS, oldCallArguments, newCallArguments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallArguments(DmxCallArguments newCallArguments)
	{
		if (newCallArguments != callArguments)
		{
			NotificationChain msgs = null;
			if (callArguments != null)
				msgs = ((InternalEObject)callArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS, null, msgs);
			if (newCallArguments != null)
				msgs = ((InternalEObject)newCallArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS, null, msgs);
			msgs = basicSetCallArguments(newCallArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS, newCallArguments, newCallArguments));
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
			case DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS:
				return basicSetCallArguments(null, msgs);
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
			case DmxPackage.DMX_FUNCTION_CALL__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS:
				return getCallArguments();
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
			case DmxPackage.DMX_FUNCTION_CALL__FUNCTION:
				setFunction((DmxFilter)newValue);
				return;
			case DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS:
				setCallArguments((DmxCallArguments)newValue);
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
			case DmxPackage.DMX_FUNCTION_CALL__FUNCTION:
				setFunction((DmxFilter)null);
				return;
			case DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS:
				setCallArguments((DmxCallArguments)null);
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
			case DmxPackage.DMX_FUNCTION_CALL__FUNCTION:
				return function != null;
			case DmxPackage.DMX_FUNCTION_CALL__CALL_ARGUMENTS:
				return callArguments != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxFunctionCallImpl
