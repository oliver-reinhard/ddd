/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DExpression;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate With Correlation Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl#getCorrelationVariable <em>Correlation Variable</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxPredicateWithCorrelationVariableImpl extends DExpressionImpl implements DmxPredicateWithCorrelationVariable
{
	/**
	 * The cached value of the '{@link #getCorrelationVariable() <em>Correlation Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationVariable()
	 * @generated
	 * @ordered
	 */
	protected DContext correlationVariable;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DExpression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxPredicateWithCorrelationVariableImpl()
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
		return DmxPackage.Literals.DMX_PREDICATE_WITH_CORRELATION_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DContext getCorrelationVariable()
	{
		return correlationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationVariable(DContext newCorrelationVariable, NotificationChain msgs)
	{
		DContext oldCorrelationVariable = correlationVariable;
		correlationVariable = newCorrelationVariable;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE, oldCorrelationVariable, newCorrelationVariable);
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
	public void setCorrelationVariable(DContext newCorrelationVariable)
	{
		if (newCorrelationVariable != correlationVariable)
		{
			NotificationChain msgs = null;
			if (correlationVariable != null)
				msgs = ((InternalEObject)correlationVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE, null, msgs);
			if (newCorrelationVariable != null)
				msgs = ((InternalEObject)newCorrelationVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE, null, msgs);
			msgs = basicSetCorrelationVariable(newCorrelationVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE, newCorrelationVariable, newCorrelationVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(DExpression newValue, NotificationChain msgs)
	{
		DExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE, oldValue, newValue);
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
	public void setValue(DExpression newValue)
	{
		if (newValue != value)
		{
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE, newValue, newValue));
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE:
				return basicSetCorrelationVariable(null, msgs);
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE:
				return basicSetValue(null, msgs);
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE:
				return getCorrelationVariable();
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE:
				return getValue();
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE:
				setCorrelationVariable((DContext)newValue);
				return;
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE:
				setValue((DExpression)newValue);
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE:
				setCorrelationVariable((DContext)null);
				return;
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE:
				setValue((DExpression)null);
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE:
				return correlationVariable != null;
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxPredicateWithCorrelationVariableImpl
