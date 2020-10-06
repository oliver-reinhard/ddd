/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;

import com.mimacom.ddd.dm.base.base.impl.DNamedElementImpl;

import com.mimacom.ddd.dm.dem.DemCaseConjunction;
import com.mimacom.ddd.dm.dem.DemPackage;

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
 * An implementation of the model object '<em><b>Case Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl#isOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.impl.DemCaseConjunctionImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DemCaseConjunctionImpl extends DNamedElementImpl implements DemCaseConjunction
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
	 * The default value of the '{@link #isOtherwise() <em>Otherwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOtherwise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OTHERWISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOtherwise() <em>Otherwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOtherwise()
	 * @generated
	 * @ordered
	 */
	protected boolean otherwise = OTHERWISE_EDEFAULT;

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
	protected DemCaseConjunctionImpl()
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
		return DemPackage.Literals.DEM_CASE_CONJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemPackage.DEM_CASE_CONJUNCTION__SELECTOR, oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(DExpression newSelector)
	{
		if (newSelector != selector)
		{
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemPackage.DEM_CASE_CONJUNCTION__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemPackage.DEM_CASE_CONJUNCTION__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DEM_CASE_CONJUNCTION__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOtherwise()
	{
		return otherwise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherwise(boolean newOtherwise)
	{
		boolean oldOtherwise = otherwise;
		otherwise = newOtherwise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemPackage.DEM_CASE_CONJUNCTION__OTHERWISE, oldOtherwise, otherwise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNamedPredicate> getPredicates()
	{
		if (predicates == null)
		{
			predicates = new EObjectContainmentEList<DNamedPredicate>(DNamedPredicate.class, this, DemPackage.DEM_CASE_CONJUNCTION__PREDICATES);
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
			case DemPackage.DEM_CASE_CONJUNCTION__SELECTOR:
				return basicSetSelector(null, msgs);
			case DemPackage.DEM_CASE_CONJUNCTION__PREDICATES:
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
			case DemPackage.DEM_CASE_CONJUNCTION__SELECTOR:
				return getSelector();
			case DemPackage.DEM_CASE_CONJUNCTION__OTHERWISE:
				return isOtherwise();
			case DemPackage.DEM_CASE_CONJUNCTION__PREDICATES:
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
			case DemPackage.DEM_CASE_CONJUNCTION__SELECTOR:
				setSelector((DExpression)newValue);
				return;
			case DemPackage.DEM_CASE_CONJUNCTION__OTHERWISE:
				setOtherwise((Boolean)newValue);
				return;
			case DemPackage.DEM_CASE_CONJUNCTION__PREDICATES:
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
			case DemPackage.DEM_CASE_CONJUNCTION__SELECTOR:
				setSelector((DExpression)null);
				return;
			case DemPackage.DEM_CASE_CONJUNCTION__OTHERWISE:
				setOtherwise(OTHERWISE_EDEFAULT);
				return;
			case DemPackage.DEM_CASE_CONJUNCTION__PREDICATES:
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
			case DemPackage.DEM_CASE_CONJUNCTION__SELECTOR:
				return selector != null;
			case DemPackage.DEM_CASE_CONJUNCTION__OTHERWISE:
				return otherwise != OTHERWISE_EDEFAULT;
			case DemPackage.DEM_CASE_CONJUNCTION__PREDICATES:
				return predicates != null && !predicates.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (otherwise: ");
		result.append(otherwise);
		result.append(')');
		return result.toString();
	}

} //DemCaseConjunctionImpl
