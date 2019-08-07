/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DCaseConjunction;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedPredicate;

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
 * An implementation of the model object '<em><b>DCase Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DCaseConjunctionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DCaseConjunctionImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCaseConjunctionImpl extends DNamedElementImpl implements DCaseConjunction
{
	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected DExpression selector;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<DNamedPredicate> predicates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCaseConjunctionImpl()
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
		return BasePackage.Literals.DCASE_CONJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getSelector()
	{
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(DExpression newSelector, NotificationChain msgs)
	{
		DExpression oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DCASE_CONJUNCTION__SELECTOR, oldSelector, newSelector);
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
	public void setSelector(DExpression newSelector)
	{
		if (newSelector != selector)
		{
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DCASE_CONJUNCTION__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DCASE_CONJUNCTION__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DCASE_CONJUNCTION__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DNamedPredicate> getPredicates()
	{
		if (predicates == null)
		{
			predicates = new EObjectContainmentEList<DNamedPredicate>(DNamedPredicate.class, this, BasePackage.DCASE_CONJUNCTION__PREDICATES);
		}
		return predicates;
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
			case BasePackage.DCASE_CONJUNCTION__SELECTOR:
				return basicSetSelector(null, msgs);
			case BasePackage.DCASE_CONJUNCTION__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DCASE_CONJUNCTION__SELECTOR:
				return getSelector();
			case BasePackage.DCASE_CONJUNCTION__PREDICATES:
				return getPredicates();
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
			case BasePackage.DCASE_CONJUNCTION__SELECTOR:
				setSelector((DExpression)newValue);
				return;
			case BasePackage.DCASE_CONJUNCTION__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends DNamedPredicate>)newValue);
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
			case BasePackage.DCASE_CONJUNCTION__SELECTOR:
				setSelector((DExpression)null);
				return;
			case BasePackage.DCASE_CONJUNCTION__PREDICATES:
				getPredicates().clear();
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
			case BasePackage.DCASE_CONJUNCTION__SELECTOR:
				return selector != null;
			case BasePackage.DCASE_CONJUNCTION__PREDICATES:
				return predicates != null && !predicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DCaseConjunctionImpl
