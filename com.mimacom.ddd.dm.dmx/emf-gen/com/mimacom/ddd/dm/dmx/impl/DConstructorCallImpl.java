/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DExpression;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DConstructorCall;
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
 * An implementation of the model object '<em><b>DConstructor Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl#isExplicitConstructorCall <em>Explicit Constructor Call</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DConstructorCallImpl extends DExpressionImpl implements DConstructorCall
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
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<DExpression> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DConstructorCallImpl()
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
		return DmxPackage.Literals.DCONSTRUCTOR_CALL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DCONSTRUCTOR_CALL__CONSTRUCTOR, oldConstructor, constructor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONSTRUCTOR_CALL__CONSTRUCTOR, oldConstructor, constructor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL, oldExplicitConstructorCall, explicitConstructorCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DExpression> getArguments()
	{
		if (arguments == null)
		{
			arguments = new EObjectContainmentEList<DExpression>(DExpression.class, this, DmxPackage.DCONSTRUCTOR_CALL__ARGUMENTS);
		}
		return arguments;
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
			case DmxPackage.DCONSTRUCTOR_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case DmxPackage.DCONSTRUCTOR_CALL__CONSTRUCTOR:
				if (resolve) return getConstructor();
				return basicGetConstructor();
			case DmxPackage.DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				return isExplicitConstructorCall();
			case DmxPackage.DCONSTRUCTOR_CALL__ARGUMENTS:
				return getArguments();
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
			case DmxPackage.DCONSTRUCTOR_CALL__CONSTRUCTOR:
				setConstructor((DComplexType)newValue);
				return;
			case DmxPackage.DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				setExplicitConstructorCall((Boolean)newValue);
				return;
			case DmxPackage.DCONSTRUCTOR_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends DExpression>)newValue);
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
			case DmxPackage.DCONSTRUCTOR_CALL__CONSTRUCTOR:
				setConstructor((DComplexType)null);
				return;
			case DmxPackage.DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				setExplicitConstructorCall(EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT);
				return;
			case DmxPackage.DCONSTRUCTOR_CALL__ARGUMENTS:
				getArguments().clear();
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
			case DmxPackage.DCONSTRUCTOR_CALL__CONSTRUCTOR:
				return constructor != null;
			case DmxPackage.DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL:
				return explicitConstructorCall != EXPLICIT_CONSTRUCTOR_CALL_EDEFAULT;
			case DmxPackage.DCONSTRUCTOR_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
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

} //DConstructorCallImpl
