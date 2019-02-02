/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DPrimitive;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DPrimitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DPrimitiveImpl#getRedefines <em>Redefines</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DPrimitiveImpl#isArchetype <em>Archetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DPrimitiveImpl extends DSimpleTypeImpl implements DPrimitive
{
	/**
	 * The cached value of the '{@link #getRedefines() <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefines()
	 * @generated
	 * @ordered
	 */
	protected DPrimitive redefines;

	/**
	 * The default value of the '{@link #isArchetype() <em>Archetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchetype()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHETYPE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPrimitiveImpl()
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
		return BasePackage.Literals.DPRIMITIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DPrimitive getRedefines()
	{
		if (redefines != null && redefines.eIsProxy())
		{
			InternalEObject oldRedefines = (InternalEObject)redefines;
			redefines = (DPrimitive)eResolveProxy(oldRedefines);
			if (redefines != oldRedefines)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DPRIMITIVE__REDEFINES, oldRedefines, redefines));
			}
		}
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPrimitive basicGetRedefines()
	{
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefines(DPrimitive newRedefines)
	{
		DPrimitive oldRedefines = redefines;
		redefines = newRedefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DPRIMITIVE__REDEFINES, oldRedefines, redefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArchetype()
	{
		// TODO: implement this method to return the 'Archetype' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case BasePackage.DPRIMITIVE__REDEFINES:
				if (resolve) return getRedefines();
				return basicGetRedefines();
			case BasePackage.DPRIMITIVE__ARCHETYPE:
				return isArchetype();
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
			case BasePackage.DPRIMITIVE__REDEFINES:
				setRedefines((DPrimitive)newValue);
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
			case BasePackage.DPRIMITIVE__REDEFINES:
				setRedefines((DPrimitive)null);
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
			case BasePackage.DPRIMITIVE__REDEFINES:
				return redefines != null;
			case BasePackage.DPRIMITIVE__ARCHETYPE:
				return isArchetype() != ARCHETYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DPrimitiveImpl
