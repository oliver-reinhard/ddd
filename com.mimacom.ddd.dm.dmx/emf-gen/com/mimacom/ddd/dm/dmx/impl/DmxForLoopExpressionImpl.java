/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxForLoopExpression;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Loop Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxForLoopExpressionImpl#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxForLoopExpressionImpl extends DExpressionImpl implements DmxForLoopExpression
{
	/**
	 * The default value of the '{@link #getDeclaredParam() <em>Declared Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredParam()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARED_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaredParam() <em>Declared Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredParam()
	 * @generated
	 * @ordered
	 */
	protected String declaredParam = DECLARED_PARAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForExpression()
	 * @generated
	 * @ordered
	 */
	protected DExpression forExpression;

	/**
	 * The cached value of the '{@link #getEachExpression() <em>Each Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEachExpression()
	 * @generated
	 * @ordered
	 */
	protected DExpression eachExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxForLoopExpressionImpl()
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
		return DmxPackage.Literals.DMX_FOR_LOOP_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclaredParam()
	{
		return declaredParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclaredParam(String newDeclaredParam)
	{
		String oldDeclaredParam = declaredParam;
		declaredParam = newDeclaredParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM, oldDeclaredParam, declaredParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getForExpression()
	{
		return forExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForExpression(DExpression newForExpression, NotificationChain msgs)
	{
		DExpression oldForExpression = forExpression;
		forExpression = newForExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION, oldForExpression, newForExpression);
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
	public void setForExpression(DExpression newForExpression)
	{
		if (newForExpression != forExpression)
		{
			NotificationChain msgs = null;
			if (forExpression != null)
				msgs = ((InternalEObject)forExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION, null, msgs);
			if (newForExpression != null)
				msgs = ((InternalEObject)newForExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION, null, msgs);
			msgs = basicSetForExpression(newForExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION, newForExpression, newForExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getEachExpression()
	{
		return eachExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEachExpression(DExpression newEachExpression, NotificationChain msgs)
	{
		DExpression oldEachExpression = eachExpression;
		eachExpression = newEachExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, oldEachExpression, newEachExpression);
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
	public void setEachExpression(DExpression newEachExpression)
	{
		if (newEachExpression != eachExpression)
		{
			NotificationChain msgs = null;
			if (eachExpression != null)
				msgs = ((InternalEObject)eachExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, null, msgs);
			if (newEachExpression != null)
				msgs = ((InternalEObject)newEachExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, null, msgs);
			msgs = basicSetEachExpression(newEachExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION, newEachExpression, newEachExpression));
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
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
				return basicSetForExpression(null, msgs);
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				return basicSetEachExpression(null, msgs);
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
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM:
				return getDeclaredParam();
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
				return getForExpression();
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				return getEachExpression();
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
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM:
				setDeclaredParam((String)newValue);
				return;
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
				setForExpression((DExpression)newValue);
				return;
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				setEachExpression((DExpression)newValue);
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
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM:
				setDeclaredParam(DECLARED_PARAM_EDEFAULT);
				return;
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
				setForExpression((DExpression)null);
				return;
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				setEachExpression((DExpression)null);
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
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__DECLARED_PARAM:
				return DECLARED_PARAM_EDEFAULT == null ? declaredParam != null : !DECLARED_PARAM_EDEFAULT.equals(declaredParam);
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__FOR_EXPRESSION:
				return forExpression != null;
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION__EACH_EXPRESSION:
				return eachExpression != null;
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
		result.append(" (declaredParam: ");
		result.append(declaredParam);
		result.append(')');
		return result.toString();
	}

} //DmxForLoopExpressionImpl
