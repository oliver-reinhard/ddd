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
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxPredicateWithCorrelationVariableImpl#getPredicate <em>Predicate</em>}</li>
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
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected DExpression predicate;

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
	public DExpression getPredicate()
	{
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(DExpression newPredicate, NotificationChain msgs)
	{
		DExpression oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE, oldPredicate, newPredicate);
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
	public void setPredicate(DExpression newPredicate)
	{
		if (newPredicate != predicate)
		{
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE, newPredicate, newPredicate));
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE:
				return basicSetPredicate(null, msgs);
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE:
				return getPredicate();
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE:
				setPredicate((DExpression)newValue);
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE:
				setPredicate((DExpression)null);
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
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE:
				return predicate != null;
		}
		return super.eIsSet(featureID);
	}

} //DmxPredicateWithCorrelationVariableImpl
