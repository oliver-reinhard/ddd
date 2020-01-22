/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import com.mimacom.ddd.dm.base.impl.DNamedElementImpl;

import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmLayoutDirection;
import com.mimacom.ddd.dm.esm.EsmPackage;
import com.mimacom.ddd.dm.esm.EsmTransition;
import com.mimacom.ddd.dm.esm.IEsmLayout;
import com.mimacom.ddd.dm.esm.IEsmState;
import com.mimacom.ddd.dm.esm.IEsmStateModel;

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
 * An implementation of the model object '<em><b>Entity State Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.impl.EsmEntityStateModelImpl#getForType <em>For Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsmEntityStateModelImpl extends DNamedElementImpl implements EsmEntityStateModel
{
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EsmLayoutDirection DIRECTION_EDEFAULT = EsmLayoutDirection.DEFAULT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EsmLayoutDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IEsmState> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<EsmTransition> transitions;

	/**
	 * The cached value of the '{@link #getForType() <em>For Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForType()
	 * @generated
	 * @ordered
	 */
	protected DEntityType forType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsmEntityStateModelImpl()
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
		return EsmPackage.Literals.ESM_ENTITY_STATE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsmLayoutDirection getDirection()
	{
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(EsmLayoutDirection newDirection)
	{
		EsmLayoutDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEsmState> getStates()
	{
		if (states == null)
		{
			states = new EObjectContainmentEList<IEsmState>(IEsmState.class, this, EsmPackage.ESM_ENTITY_STATE_MODEL__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EsmTransition> getTransitions()
	{
		if (transitions == null)
		{
			transitions = new EObjectContainmentEList<EsmTransition>(EsmTransition.class, this, EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DEntityType getForType()
	{
		if (forType != null && forType.eIsProxy())
		{
			InternalEObject oldForType = (InternalEObject)forType;
			forType = (DEntityType)eResolveProxy(oldForType);
			if (forType != oldForType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsmPackage.ESM_ENTITY_STATE_MODEL__FOR_TYPE, oldForType, forType));
			}
		}
		return forType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEntityType basicGetForType()
	{
		return forType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForType(DEntityType newForType)
	{
		DEntityType oldForType = forType;
		forType = newForType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EsmPackage.ESM_ENTITY_STATE_MODEL__FOR_TYPE, oldForType, forType));
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
			case EsmPackage.ESM_ENTITY_STATE_MODEL__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
			case EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION:
				return getDirection();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__STATES:
				return getStates();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS:
				return getTransitions();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__FOR_TYPE:
				if (resolve) return getForType();
				return basicGetForType();
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
			case EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION:
				setDirection((EsmLayoutDirection)newValue);
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends IEsmState>)newValue);
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends EsmTransition>)newValue);
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__FOR_TYPE:
				setForType((DEntityType)newValue);
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
			case EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__STATES:
				getStates().clear();
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS:
				getTransitions().clear();
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__FOR_TYPE:
				setForType((DEntityType)null);
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
			case EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case EsmPackage.ESM_ENTITY_STATE_MODEL__STATES:
				return states != null && !states.isEmpty();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case EsmPackage.ESM_ENTITY_STATE_MODEL__FOR_TYPE:
				return forType != null;
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
		if (baseClass == IEsmLayout.class)
		{
			switch (derivedFeatureID)
			{
				case EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION: return EsmPackage.IESM_LAYOUT__DIRECTION;
				default: return -1;
			}
		}
		if (baseClass == IEsmStateModel.class)
		{
			switch (derivedFeatureID)
			{
				case EsmPackage.ESM_ENTITY_STATE_MODEL__STATES: return EsmPackage.IESM_STATE_MODEL__STATES;
				case EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS: return EsmPackage.IESM_STATE_MODEL__TRANSITIONS;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (derivedFeatureID)
			{
				case EsmPackage.ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS: return BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS;
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
		if (baseClass == IEsmLayout.class)
		{
			switch (baseFeatureID)
			{
				case EsmPackage.IESM_LAYOUT__DIRECTION: return EsmPackage.ESM_ENTITY_STATE_MODEL__DIRECTION;
				default: return -1;
			}
		}
		if (baseClass == IEsmStateModel.class)
		{
			switch (baseFeatureID)
			{
				case EsmPackage.IESM_STATE_MODEL__STATES: return EsmPackage.ESM_ENTITY_STATE_MODEL__STATES;
				case EsmPackage.IESM_STATE_MODEL__TRANSITIONS: return EsmPackage.ESM_ENTITY_STATE_MODEL__TRANSITIONS;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS: return EsmPackage.ESM_ENTITY_STATE_MODEL__NAVIGABLE_MEMBERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //EsmEntityStateModelImpl
