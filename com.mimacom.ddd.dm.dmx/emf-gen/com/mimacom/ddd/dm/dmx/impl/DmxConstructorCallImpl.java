/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DComplexType;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl#isExplicitConstructorCall <em>Explicit Constructor Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxConstructorCallImpl#getCallArguments <em>Call Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxConstructorCallImpl extends DExpressionImpl implements DmxConstructorCall
{
	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected DComplexType constructor;

	/**
	 * The default value of the '{@link #isExplicitConstructorCall() <em>Explicit Constructor Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitConstructorCall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitConstructorCall() <em>Explicit Constructor Call</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitConstructorCall()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitConstructorCall = EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT;

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
	protected DmxConstructorCallImpl()
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
		return DmxPackage.Literals.DMX_CONSTRUCTOR_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DComplexType getConstructor()
	{
		if (constructor != null && constructor.eIsProxy())
		{
			InternalEObject oldConstructor = (InternalEObject)constructor;
			constructor = (DComplexType)eResolveProxy(oldConstructor);
			if (constructor != oldConstructor)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_CONSTRUCTOR_CALL__CONSTRUCTOR, oldConstructor, constructor));
			}
		}
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DComplexType basicGetConstructor()
	{
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructor(DComplexType newConstructor)
	{
		DComplexType oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_CONSTRUCTOR_CALL__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExplicitConstructorCall()
	{
		return explicitConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExplicitConstructorCall(boolean newExplicitConstructorCall)
	{
		boolean oldExplicitConstructorCall = explicitConstructorCall;
		explicitConstructorCall = newExplicitConstructorCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL, oldExplicitConstructorCall, explicitConstructorCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS, oldCallArguments, newCallArguments);
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
	public void setCallArguments(DmxCallArguments newCallArguments)
	{
		if (newCallArguments != callArguments)
		{
			NotificationChain msgs = null;
			if (callArguments != null)
				msgs = ((InternalEObject)callArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS, null, msgs);
			if (newCallArguments != null)
				msgs = ((InternalEObject)newCallArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS, null, msgs);
			msgs = basicSetCallArguments(newCallArguments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS, newCallArguments, newCallArguments));
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
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS:
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
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CONSTRUCTOR:
				if (resolve) return getConstructor();
				return basicGetConstructor();
			case DmxPackage.DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				return isExplicitConstructorCall();
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS:
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
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CONSTRUCTOR:
				setConstructor((DComplexType)newValue);
				return;
			case DmxPackage.DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				setExplicitConstructorCall((Boolean)newValue);
				return;
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS:
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
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CONSTRUCTOR:
				setConstructor((DComplexType)null);
				return;
			case DmxPackage.DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				setExplicitConstructorCall(EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT);
				return;
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS:
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
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CONSTRUCTOR:
				return constructor != null;
			case DmxPackage.DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				return explicitConstructorCall != EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT;
			case DmxPackage.DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS:
				return callArguments != null;
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
		result.append(" (explicitConstructorCall: ");
		result.append(explicitConstructorCall);
		result.append(')');
		return result.toString();
	}

} //DmxConstructorCallImpl
