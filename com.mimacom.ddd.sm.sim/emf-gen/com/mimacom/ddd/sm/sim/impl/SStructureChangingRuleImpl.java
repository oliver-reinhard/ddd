/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DType;

import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SStructure Changing Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SStructureChangingRuleImpl#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SStructureChangingRuleImpl extends SRenameRuleImpl implements SStructureChangingRule
{
	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final STristate ABSTRACT_EDEFAULT = STristate.DONT_CARE;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected STristate abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootEntity() <em>Root Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntity()
	 * @generated
	 * @ordered
	 */
	protected static final STristate ROOT_ENTITY_EDEFAULT = STristate.DONT_CARE;

	/**
	 * The cached value of the '{@link #getRootEntity() <em>Root Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntity()
	 * @generated
	 * @ordered
	 */
	protected STristate rootEntity = ROOT_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected static final STristate ENTITY_EDEFAULT = STristate.DONT_CARE;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected STristate entity = ENTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendFrom() <em>Extend From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendFrom()
	 * @generated
	 * @ordered
	 */
	protected DType extendFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SStructureChangingRuleImpl()
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
		return SimPackage.Literals.SSTRUCTURE_CHANGING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STristate getAbstract()
	{
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(STristate newAbstract)
	{
		STristate oldAbstract = abstract_;
		abstract_ = newAbstract == null ? ABSTRACT_EDEFAULT : newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SSTRUCTURE_CHANGING_RULE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STristate getRootEntity()
	{
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootEntity(STristate newRootEntity)
	{
		STristate oldRootEntity = rootEntity;
		rootEntity = newRootEntity == null ? ROOT_ENTITY_EDEFAULT : newRootEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY, oldRootEntity, rootEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STristate getEntity()
	{
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(STristate newEntity)
	{
		STristate oldEntity = entity;
		entity = newEntity == null ? ENTITY_EDEFAULT : newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SSTRUCTURE_CHANGING_RULE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DType getExtendFrom()
	{
		if (extendFrom != null && extendFrom.eIsProxy())
		{
			InternalEObject oldExtendFrom = (InternalEObject)extendFrom;
			extendFrom = (DType)eResolveProxy(oldExtendFrom);
			if (extendFrom != oldExtendFrom)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
			}
		}
		return extendFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType basicGetExtendFrom()
	{
		return extendFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendFrom(DType newExtendFrom)
	{
		DType oldExtendFrom = extendFrom;
		extendFrom = newExtendFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
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
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ABSTRACT:
				return getAbstract();
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				return getRootEntity();
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ENTITY:
				return getEntity();
			case SimPackage.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
				if (resolve) return getExtendFrom();
				return basicGetExtendFrom();
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
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ABSTRACT:
				setAbstract((STristate)newValue);
				return;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				setRootEntity((STristate)newValue);
				return;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ENTITY:
				setEntity((STristate)newValue);
				return;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
				setExtendFrom((DType)newValue);
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
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				setRootEntity(ROOT_ENTITY_EDEFAULT);
				return;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ENTITY:
				setEntity(ENTITY_EDEFAULT);
				return;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
				setExtendFrom((DType)null);
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
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				return rootEntity != ROOT_ENTITY_EDEFAULT;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__ENTITY:
				return entity != ENTITY_EDEFAULT;
			case SimPackage.SSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
				return extendFrom != null;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", rootEntity: ");
		result.append(rootEntity);
		result.append(", entity: ");
		result.append(entity);
		result.append(')');
		return result.toString();
	}

} //SStructureChangingRuleImpl
