/**
 */
package com.mimacom.ddd.dm.base.base.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;

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
 * An implementation of the model object '<em><b>DQuery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DQueryImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DQueryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.impl.DQueryImpl#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DQueryImpl extends DFeatureImpl implements DQuery
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
	protected DQueryImpl()
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
		return BasePackage.Literals.DQUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNavigableMember> getNavigableMembers()
	{
		// TODO: implement this method to return the 'Navigable Members' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
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
			parameters = new EObjectContainmentEList<DQueryParameter>(DQueryParameter.class, this, BasePackage.DQUERY__PARAMETERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DQUERY__RETURNS, oldReturns, newReturns);
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
				msgs = ((InternalEObject)returns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DQUERY__RETURNS, null, msgs);
			if (newReturns != null)
				msgs = ((InternalEObject)newReturns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DQUERY__RETURNS, null, msgs);
			msgs = basicSetReturns(newReturns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DQUERY__RETURNS, newReturns, newReturns));
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
			case BasePackage.DQUERY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case BasePackage.DQUERY__RETURNS:
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
			case BasePackage.DQUERY__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case BasePackage.DQUERY__PARAMETERS:
				return getParameters();
			case BasePackage.DQUERY__RETURNS:
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
			case BasePackage.DQUERY__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case BasePackage.DQUERY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DQueryParameter>)newValue);
				return;
			case BasePackage.DQUERY__RETURNS:
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
			case BasePackage.DQUERY__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case BasePackage.DQUERY__PARAMETERS:
				getParameters().clear();
				return;
			case BasePackage.DQUERY__RETURNS:
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
			case BasePackage.DQUERY__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case BasePackage.DQUERY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BasePackage.DQUERY__RETURNS:
				return returns != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DQUERY__NAVIGABLE_MEMBERS: return BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS: return BasePackage.DQUERY__NAVIGABLE_MEMBERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DQueryImpl
