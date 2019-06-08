/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SCondition;
import com.mimacom.ddd.sm.sim.SFeature;
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
 * An implementation of the model object '<em><b>SComplex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SComplexTypeImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SComplexTypeImpl extends STypeImpl implements SComplexType
{
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected SComplexType superType;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<SFeature> features;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<SCondition> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SComplexTypeImpl()
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
		return SimPackage.Literals.SCOMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract()
	{
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract)
	{
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SCOMPLEX_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SComplexType getSuperType()
	{
		if (superType != null && superType.eIsProxy())
		{
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (SComplexType)eResolveProxy(oldSuperType);
			if (superType != oldSuperType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SCOMPLEX_TYPE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SComplexType basicGetSuperType()
	{
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperType(SComplexType newSuperType)
	{
		SComplexType oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SCOMPLEX_TYPE__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SFeature> getFeatures()
	{
		if (features == null)
		{
			features = new EObjectContainmentEList<SFeature>(SFeature.class, this, SimPackage.SCOMPLEX_TYPE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SCondition> getConstraints()
	{
		if (constraints == null)
		{
			constraints = new EObjectContainmentEList<SCondition>(SCondition.class, this, SimPackage.SCOMPLEX_TYPE__CONSTRAINTS);
		}
		return constraints;
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
			case SimPackage.SCOMPLEX_TYPE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case SimPackage.SCOMPLEX_TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case SimPackage.SCOMPLEX_TYPE__ABSTRACT:
				return isAbstract();
			case SimPackage.SCOMPLEX_TYPE__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case SimPackage.SCOMPLEX_TYPE__FEATURES:
				return getFeatures();
			case SimPackage.SCOMPLEX_TYPE__CONSTRAINTS:
				return getConstraints();
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
			case SimPackage.SCOMPLEX_TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case SimPackage.SCOMPLEX_TYPE__SUPER_TYPE:
				setSuperType((SComplexType)newValue);
				return;
			case SimPackage.SCOMPLEX_TYPE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends SFeature>)newValue);
				return;
			case SimPackage.SCOMPLEX_TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends SCondition>)newValue);
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
			case SimPackage.SCOMPLEX_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case SimPackage.SCOMPLEX_TYPE__SUPER_TYPE:
				setSuperType((SComplexType)null);
				return;
			case SimPackage.SCOMPLEX_TYPE__FEATURES:
				getFeatures().clear();
				return;
			case SimPackage.SCOMPLEX_TYPE__CONSTRAINTS:
				getConstraints().clear();
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
			case SimPackage.SCOMPLEX_TYPE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case SimPackage.SCOMPLEX_TYPE__SUPER_TYPE:
				return superType != null;
			case SimPackage.SCOMPLEX_TYPE__FEATURES:
				return features != null && !features.isEmpty();
			case SimPackage.SCOMPLEX_TYPE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SComplexTypeImpl
