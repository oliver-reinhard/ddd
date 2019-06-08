/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPrimitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SPrimitiveImpl#getRedefines <em>Redefines</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SPrimitiveImpl#isArchetype <em>Archetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPrimitiveImpl extends SSimpleTypeImpl implements SPrimitive
{
	/**
	 * The cached value of the '{@link #getRedefines() <em>Redefines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefines()
	 * @generated
	 * @ordered
	 */
	protected SPrimitive redefines;

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
	protected SPrimitiveImpl()
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
		return SimPackage.Literals.SPRIMITIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPrimitive getRedefines()
	{
		if (redefines != null && redefines.eIsProxy())
		{
			InternalEObject oldRedefines = (InternalEObject)redefines;
			redefines = (SPrimitive)eResolveProxy(oldRedefines);
			if (redefines != oldRedefines)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SPRIMITIVE__REDEFINES, oldRedefines, redefines));
			}
		}
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPrimitive basicGetRedefines()
	{
		return redefines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefines(SPrimitive newRedefines)
	{
		SPrimitive oldRedefines = redefines;
		redefines = newRedefines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SPRIMITIVE__REDEFINES, oldRedefines, redefines));
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
			case SimPackage.SPRIMITIVE__REDEFINES:
				if (resolve) return getRedefines();
				return basicGetRedefines();
			case SimPackage.SPRIMITIVE__ARCHETYPE:
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
			case SimPackage.SPRIMITIVE__REDEFINES:
				setRedefines((SPrimitive)newValue);
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
			case SimPackage.SPRIMITIVE__REDEFINES:
				setRedefines((SPrimitive)null);
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
			case SimPackage.SPRIMITIVE__REDEFINES:
				return redefines != null;
			case SimPackage.SPRIMITIVE__ARCHETYPE:
				return isArchetype() != ARCHETYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SPrimitiveImpl
