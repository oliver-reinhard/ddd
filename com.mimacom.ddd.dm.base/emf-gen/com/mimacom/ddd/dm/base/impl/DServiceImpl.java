/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DException;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DServiceKind;
import com.mimacom.ddd.dm.base.DServiceParameter;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.INamespace;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.ITypeContainer;

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
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getRaises <em>Raises</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DServiceImpl#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DServiceImpl extends DActorImpl implements DService
{
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DType> types;

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
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<DExpression> guards;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<DExpression> effects;

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
	public EList<DType> getTypes()
	{
		if (types == null)
		{
			types = new EObjectContainmentEList<DType>(DType.class, this, BasePackage.DSERVICE__TYPES);
		}
		return types;
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
	public EList<DExpression> getGuards()
	{
		if (guards == null)
		{
			guards = new EObjectContainmentEList<DExpression>(DExpression.class, this, BasePackage.DSERVICE__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DExpression> getEffects()
	{
		if (effects == null)
		{
			effects = new EObjectContainmentEList<DExpression>(DExpression.class, this, BasePackage.DSERVICE__EFFECTS);
		}
		return effects;
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
			case BasePackage.DSERVICE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case BasePackage.DSERVICE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case BasePackage.DSERVICE__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case BasePackage.DSERVICE__EFFECTS:
				return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DSERVICE__TYPES:
				return getTypes();
			case BasePackage.DSERVICE__KIND:
				return getKind();
			case BasePackage.DSERVICE__PARAMETERS:
				return getParameters();
			case BasePackage.DSERVICE__RAISES:
				return getRaises();
			case BasePackage.DSERVICE__GUARDS:
				return getGuards();
			case BasePackage.DSERVICE__EFFECTS:
				return getEffects();
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
			case BasePackage.DSERVICE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case BasePackage.DSERVICE__KIND:
				setKind((DServiceKind)newValue);
				return;
			case BasePackage.DSERVICE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends DServiceParameter>)newValue);
				return;
			case BasePackage.DSERVICE__RAISES:
				getRaises().clear();
				getRaises().addAll((Collection<? extends DException>)newValue);
				return;
			case BasePackage.DSERVICE__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends DExpression>)newValue);
				return;
			case BasePackage.DSERVICE__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends DExpression>)newValue);
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
			case BasePackage.DSERVICE__TYPES:
				getTypes().clear();
				return;
			case BasePackage.DSERVICE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case BasePackage.DSERVICE__PARAMETERS:
				getParameters().clear();
				return;
			case BasePackage.DSERVICE__RAISES:
				getRaises().clear();
				return;
			case BasePackage.DSERVICE__GUARDS:
				getGuards().clear();
				return;
			case BasePackage.DSERVICE__EFFECTS:
				getEffects().clear();
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
			case BasePackage.DSERVICE__TYPES:
				return types != null && !types.isEmpty();
			case BasePackage.DSERVICE__KIND:
				return kind != KIND_EDEFAULT;
			case BasePackage.DSERVICE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BasePackage.DSERVICE__RAISES:
				return raises != null && !raises.isEmpty();
			case BasePackage.DSERVICE__GUARDS:
				return guards != null && !guards.isEmpty();
			case BasePackage.DSERVICE__EFFECTS:
				return effects != null && !effects.isEmpty();
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
		if (baseClass == INamespace.class)
		{
			switch (derivedFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (derivedFeatureID)
			{
				case BasePackage.DSERVICE__TYPES: return BasePackage.ITYPE_CONTAINER__TYPES;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (derivedFeatureID)
			{
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
		if (baseClass == INamespace.class)
		{
			switch (baseFeatureID)
			{
				default: return -1;
			}
		}
		if (baseClass == ITypeContainer.class)
		{
			switch (baseFeatureID)
			{
				case BasePackage.ITYPE_CONTAINER__TYPES: return BasePackage.DSERVICE__TYPES;
				default: return -1;
			}
		}
		if (baseClass == INavigableMemberContainer.class)
		{
			switch (baseFeatureID)
			{
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DServiceImpl
