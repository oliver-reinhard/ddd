/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DQueryParameter;

import com.mimacom.ddd.dm.base.impl.DNavigableMemberImplCustom;

import com.mimacom.ddd.sm.sim.SCoreQuery;
import com.mimacom.ddd.sm.sim.SimPackage;

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
 * An implementation of the model object '<em><b>SCore Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SCoreQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SCoreQueryImpl#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCoreQueryImpl extends DNavigableMemberImplCustom implements SCoreQuery
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DQueryParameter> parameters;

	/**
	 * The cached value of the '{@link #getReturns() <em>Returns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturns()
	 * @generated
	 * @ordered
	 */
	protected DExpression returns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCoreQueryImpl()
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
		return SimPackage.Literals.SCORE_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DQueryParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<DQueryParameter>(DQueryParameter.class, this, SimPackage.SCORE_QUERY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getReturns()
	{
		return returns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturns(DExpression newReturns, NotificationChain msgs)
	{
		DExpression oldReturns = returns;
		returns = newReturns;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SCORE_QUERY__RETURNS, oldReturns, newReturns);
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
	public void setReturns(DExpression newReturns)
	{
		if (newReturns != returns)
		{
			NotificationChain msgs = null;
			if (returns != null)
				msgs = ((InternalEObject)returns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SCORE_QUERY__RETURNS, null, msgs);
			if (newReturns != null)
				msgs = ((InternalEObject)newReturns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SCORE_QUERY__RETURNS, null, msgs);
			msgs = basicSetReturns(newReturns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SCORE_QUERY__RETURNS, newReturns, newReturns));
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
			case SimPackage.SCORE_QUERY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case SimPackage.SCORE_QUERY__RETURNS:
				return basicSetReturns(null, msgs);
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
			case SimPackage.SCORE_QUERY__PARAMETERS:
				return getParameters();
			case SimPackage.SCORE_QUERY__RETURNS:
				return getReturns();
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
			case SimPackage.SCORE_QUERY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DQueryParameter>)newValue);
				return;
			case SimPackage.SCORE_QUERY__RETURNS:
				setReturns((DExpression)newValue);
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
			case SimPackage.SCORE_QUERY__PARAMETERS:
				getParameters().clear();
				return;
			case SimPackage.SCORE_QUERY__RETURNS:
				setReturns((DExpression)null);
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
			case SimPackage.SCORE_QUERY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SimPackage.SCORE_QUERY__RETURNS:
				return returns != null;
		}
		return super.eIsSet(featureID);
	}

} //SCoreQueryImpl
