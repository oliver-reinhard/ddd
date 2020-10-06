/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DType;

import com.mimacom.ddd.dm.base.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxInstanceOfExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxInstanceOfExpressionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxInstanceOfExpressionImpl extends DExpressionImpl implements DmxInstanceOfExpression
{
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected DExpression expression;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxInstanceOfExpressionImpl()
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
		return DmxPackage.Literals.DMX_INSTANCE_OF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DExpression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(DExpression newExpression, NotificationChain msgs)
	{
		DExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(DExpression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType getType()
	{
		if (type != null && type.eIsProxy())
		{
			InternalEObject oldType = (InternalEObject)type;
			type = (DType)eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_INSTANCE_OF_EXPRESSION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType basicGetType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DType newType)
	{
		DType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_INSTANCE_OF_EXPRESSION__TYPE, oldType, type));
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
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION:
				return getExpression();
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION:
				setExpression((DExpression)newValue);
				return;
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__TYPE:
				setType((DType)newValue);
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
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION:
				setExpression((DExpression)null);
				return;
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__TYPE:
				setType((DType)null);
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
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__EXPRESSION:
				return expression != null;
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxInstanceOfExpressionImpl
