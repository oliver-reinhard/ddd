/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.base.DType;

import com.mimacom.ddd.dm.base.transpose.TStructureChangingRule;
import com.mimacom.ddd.dm.base.transpose.TTristate;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TStructure Changing Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl#getRootEntity <em>Root Entity</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl#getDetail <em>Detail</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.impl.TStructureChangingRuleImpl#getExtendFrom <em>Extend From</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TStructureChangingRuleImpl extends TRenameRuleImpl implements TStructureChangingRule
{
	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final TTristate ABSTRACT_EDEFAULT = TTristate.DONT_CARE;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected TTristate abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootEntity() <em>Root Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntity()
	 * @generated
	 * @ordered
	 */
	protected static final TTristate ROOT_ENTITY_EDEFAULT = TTristate.DONT_CARE;

	/**
	 * The cached value of the '{@link #getRootEntity() <em>Root Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootEntity()
	 * @generated
	 * @ordered
	 */
	protected TTristate rootEntity = ROOT_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected static final TTristate DETAIL_EDEFAULT = TTristate.DONT_CARE;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected TTristate detail = DETAIL_EDEFAULT;

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
	protected TStructureChangingRuleImpl()
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
		return TransposePackage.Literals.TSTRUCTURE_CHANGING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTristate getAbstract()
	{
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(TTristate newAbstract)
	{
		TTristate oldAbstract = abstract_;
		abstract_ = newAbstract == null ? ABSTRACT_EDEFAULT : newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TSTRUCTURE_CHANGING_RULE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTristate getRootEntity()
	{
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootEntity(TTristate newRootEntity)
	{
		TTristate oldRootEntity = rootEntity;
		rootEntity = newRootEntity == null ? ROOT_ENTITY_EDEFAULT : newRootEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY, oldRootEntity, rootEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTristate getDetail()
	{
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetail(TTristate newDetail)
	{
		TTristate oldDetail = detail;
		detail = newDetail == null ? DETAIL_EDEFAULT : newDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TSTRUCTURE_CHANGING_RULE__DETAIL, oldDetail, detail));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransposePackage.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransposePackage.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM, oldExtendFrom, extendFrom));
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
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ABSTRACT:
				return getAbstract();
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				return getRootEntity();
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__DETAIL:
				return getDetail();
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
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
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ABSTRACT:
				setAbstract((TTristate)newValue);
				return;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				setRootEntity((TTristate)newValue);
				return;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__DETAIL:
				setDetail((TTristate)newValue);
				return;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
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
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				setRootEntity(ROOT_ENTITY_EDEFAULT);
				return;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__DETAIL:
				setDetail(DETAIL_EDEFAULT);
				return;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
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
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__ROOT_ENTITY:
				return rootEntity != ROOT_ENTITY_EDEFAULT;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__DETAIL:
				return detail != DETAIL_EDEFAULT;
			case TransposePackage.TSTRUCTURE_CHANGING_RULE__EXTEND_FROM:
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
		result.append(", detail: ");
		result.append(detail);
		result.append(')');
		return result.toString();
	}

} //TStructureChangingRuleImpl
