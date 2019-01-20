/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFunction;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxPackage;

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
 * An implementation of the model object '<em><b>DFunction Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl#getFunctionCallArguments <em>Function Call Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DFunctionCallImpl extends DExpressionImpl implements DFunctionCall
{
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected DFunction function;

	/**
	 * The cached value of the '{@link #getFunctionCallArguments() <em>Function Call Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionCallArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<DExpression> functionCallArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFunctionCallImpl()
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
		return DmxPackage.Literals.DFUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DFunction getFunction()
	{
		if (function != null && function.eIsProxy())
		{
			InternalEObject oldFunction = (InternalEObject)function;
			function = (DFunction)eResolveProxy(oldFunction);
			if (function != oldFunction)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DFUNCTION_CALL__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFunction basicGetFunction()
	{
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(DFunction newFunction)
	{
		DFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DFUNCTION_CALL__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DExpression> getFunctionCallArguments()
	{
		if (functionCallArguments == null)
		{
			functionCallArguments = new EObjectContainmentEList<DExpression>(DExpression.class, this, DmxPackage.DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS);
		}
		return functionCallArguments;
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
			case DmxPackage.DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS:
				return ((InternalEList<?>)getFunctionCallArguments()).basicRemove(otherEnd, msgs);
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
			case DmxPackage.DFUNCTION_CALL__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case DmxPackage.DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS:
				return getFunctionCallArguments();
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
			case DmxPackage.DFUNCTION_CALL__FUNCTION:
				setFunction((DFunction)newValue);
				return;
			case DmxPackage.DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS:
				getFunctionCallArguments().clear();
				getFunctionCallArguments().addAll((Collection<? extends DExpression>)newValue);
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
			case DmxPackage.DFUNCTION_CALL__FUNCTION:
				setFunction((DFunction)null);
				return;
			case DmxPackage.DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS:
				getFunctionCallArguments().clear();
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
			case DmxPackage.DFUNCTION_CALL__FUNCTION:
				return function != null;
			case DmxPackage.DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS:
				return functionCallArguments != null && !functionCallArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DFunctionCallImpl
