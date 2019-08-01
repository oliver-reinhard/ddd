/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DExpression;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl#getIf <em>If</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxIfExpressionImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxIfExpressionImpl extends DExpressionImpl implements DmxIfExpression
{
	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected DExpression if_;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected DExpression then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected DExpression else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxIfExpressionImpl()
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
		return DmxPackage.Literals.DMX_IF_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getIf()
	{
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(DExpression newIf, NotificationChain msgs)
	{
		DExpression oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_IF_EXPRESSION__IF, oldIf, newIf);
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
	public void setIf(DExpression newIf)
	{
		if (newIf != if_)
		{
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_IF_EXPRESSION__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_IF_EXPRESSION__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_IF_EXPRESSION__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getThen()
	{
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(DExpression newThen, NotificationChain msgs)
	{
		DExpression oldThen = then;
		then = newThen;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_IF_EXPRESSION__THEN, oldThen, newThen);
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
	public void setThen(DExpression newThen)
	{
		if (newThen != then)
		{
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_IF_EXPRESSION__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_IF_EXPRESSION__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_IF_EXPRESSION__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getElse()
	{
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(DExpression newElse, NotificationChain msgs)
	{
		DExpression oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_IF_EXPRESSION__ELSE, oldElse, newElse);
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
	public void setElse(DExpression newElse)
	{
		if (newElse != else_)
		{
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_IF_EXPRESSION__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_IF_EXPRESSION__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_IF_EXPRESSION__ELSE, newElse, newElse));
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
			case DmxPackage.DMX_IF_EXPRESSION__IF:
				return basicSetIf(null, msgs);
			case DmxPackage.DMX_IF_EXPRESSION__THEN:
				return basicSetThen(null, msgs);
			case DmxPackage.DMX_IF_EXPRESSION__ELSE:
				return basicSetElse(null, msgs);
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
			case DmxPackage.DMX_IF_EXPRESSION__IF:
				return getIf();
			case DmxPackage.DMX_IF_EXPRESSION__THEN:
				return getThen();
			case DmxPackage.DMX_IF_EXPRESSION__ELSE:
				return getElse();
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
			case DmxPackage.DMX_IF_EXPRESSION__IF:
				setIf((DExpression)newValue);
				return;
			case DmxPackage.DMX_IF_EXPRESSION__THEN:
				setThen((DExpression)newValue);
				return;
			case DmxPackage.DMX_IF_EXPRESSION__ELSE:
				setElse((DExpression)newValue);
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
			case DmxPackage.DMX_IF_EXPRESSION__IF:
				setIf((DExpression)null);
				return;
			case DmxPackage.DMX_IF_EXPRESSION__THEN:
				setThen((DExpression)null);
				return;
			case DmxPackage.DMX_IF_EXPRESSION__ELSE:
				setElse((DExpression)null);
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
			case DmxPackage.DMX_IF_EXPRESSION__IF:
				return if_ != null;
			case DmxPackage.DMX_IF_EXPRESSION__THEN:
				return then != null;
			case DmxPackage.DMX_IF_EXPRESSION__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxIfExpressionImpl
