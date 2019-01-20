/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DException;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DServiceKind;
import com.mimacom.ddd.dm.base.DServiceParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DService</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getRaises <em>Raises</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DServiceImpl extends DActorImpl implements DService
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<DServiceParameter> parameters;

	/**
	 * The cached value of the '{@link #getRaises() <em>Raises</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaises()
	 * @generated
	 * @ordered
	 */
	protected EList<DException> raises;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DServiceKind KIND_EDEFAULT = DServiceKind.SYNCHRONOUS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DServiceKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected DExpression precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected DExpression postcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DServiceImpl()
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
		return BasePackage.Literals.DSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DServiceParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<DServiceParameter>(DServiceParameter.class, this, BasePackage.DSERVICE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DException> getRaises()
	{
		if (raises == null)
		{
			raises = new EObjectResolvingEList<DException>(DException.class, this, BasePackage.DSERVICE__RAISES);
		}
		return raises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DServiceKind getKind()
	{
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(DServiceKind newKind)
	{
		DServiceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DSERVICE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getPrecondition()
	{
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(DExpression newPrecondition, NotificationChain msgs)
	{
		DExpression oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DSERVICE__PRECONDITION, oldPrecondition, newPrecondition);
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
	public void setPrecondition(DExpression newPrecondition)
	{
		if (newPrecondition != precondition)
		{
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DSERVICE__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DSERVICE__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DSERVICE__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExpression getPostcondition()
	{
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(DExpression newPostcondition, NotificationChain msgs)
	{
		DExpression oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.DSERVICE__POSTCONDITION, oldPostcondition, newPostcondition);
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
	public void setPostcondition(DExpression newPostcondition)
	{
		if (newPostcondition != postcondition)
		{
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.DSERVICE__POSTCONDITION, null, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasePackage.DSERVICE__POSTCONDITION, null, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DSERVICE__POSTCONDITION, newPostcondition, newPostcondition));
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
			case BasePackage.DSERVICE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case BasePackage.DSERVICE__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case BasePackage.DSERVICE__POSTCONDITION:
				return basicSetPostcondition(null, msgs);
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
			case BasePackage.DSERVICE__PARAMETERS:
				return getParameters();
			case BasePackage.DSERVICE__RAISES:
				return getRaises();
			case BasePackage.DSERVICE__KIND:
				return getKind();
			case BasePackage.DSERVICE__PRECONDITION:
				return getPrecondition();
			case BasePackage.DSERVICE__POSTCONDITION:
				return getPostcondition();
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
			case BasePackage.DSERVICE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DServiceParameter>)newValue);
				return;
			case BasePackage.DSERVICE__RAISES:
				getRaises().clear();
				getRaises().addAll((Collection<? extends DException>)newValue);
				return;
			case BasePackage.DSERVICE__KIND:
				setKind((DServiceKind)newValue);
				return;
			case BasePackage.DSERVICE__PRECONDITION:
				setPrecondition((DExpression)newValue);
				return;
			case BasePackage.DSERVICE__POSTCONDITION:
				setPostcondition((DExpression)newValue);
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
			case BasePackage.DSERVICE__PARAMETERS:
				getParameters().clear();
				return;
			case BasePackage.DSERVICE__RAISES:
				getRaises().clear();
				return;
			case BasePackage.DSERVICE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case BasePackage.DSERVICE__PRECONDITION:
				setPrecondition((DExpression)null);
				return;
			case BasePackage.DSERVICE__POSTCONDITION:
				setPostcondition((DExpression)null);
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
			case BasePackage.DSERVICE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BasePackage.DSERVICE__RAISES:
				return raises != null && !raises.isEmpty();
			case BasePackage.DSERVICE__KIND:
				return kind != KIND_EDEFAULT;
			case BasePackage.DSERVICE__PRECONDITION:
				return precondition != null;
			case BasePackage.DSERVICE__POSTCONDITION:
				return postcondition != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DServiceImpl
