/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DMultiplicityShorthand;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMultiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DMultiplicityImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DMultiplicityImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DMultiplicityImpl#getShorthand <em>Shorthand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMultiplicityImpl extends MinimalEObjectImpl.Container implements DMultiplicity
{
	/**
	 * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_OCCURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected int minOccurs = MIN_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_OCCURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected int maxOccurs = MAX_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShorthand() <em>Shorthand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShorthand()
	 * @generated
	 * @ordered
	 */
	protected static final DMultiplicityShorthand SHORTHAND_EDEFAULT = DMultiplicityShorthand.NONE;

	/**
	 * The cached value of the '{@link #getShorthand() <em>Shorthand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShorthand()
	 * @generated
	 * @ordered
	 */
	protected DMultiplicityShorthand shorthand = SHORTHAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMultiplicityImpl()
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
		return BasePackage.Literals.DMULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinOccurs()
	{
		return minOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOccurs(int newMinOccurs)
	{
		int oldMinOccurs = minOccurs;
		minOccurs = newMinOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DMULTIPLICITY__MIN_OCCURS, oldMinOccurs, minOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxOccurs()
	{
		return maxOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurs(int newMaxOccurs)
	{
		int oldMaxOccurs = maxOccurs;
		maxOccurs = newMaxOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DMULTIPLICITY__MAX_OCCURS, oldMaxOccurs, maxOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMultiplicityShorthand getShorthand()
	{
		return shorthand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShorthand(DMultiplicityShorthand newShorthand)
	{
		DMultiplicityShorthand oldShorthand = shorthand;
		shorthand = newShorthand == null ? SHORTHAND_EDEFAULT : newShorthand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DMULTIPLICITY__SHORTHAND, oldShorthand, shorthand));
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
			case BasePackage.DMULTIPLICITY__MIN_OCCURS:
				return getMinOccurs();
			case BasePackage.DMULTIPLICITY__MAX_OCCURS:
				return getMaxOccurs();
			case BasePackage.DMULTIPLICITY__SHORTHAND:
				return getShorthand();
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
			case BasePackage.DMULTIPLICITY__MIN_OCCURS:
				setMinOccurs((Integer)newValue);
				return;
			case BasePackage.DMULTIPLICITY__MAX_OCCURS:
				setMaxOccurs((Integer)newValue);
				return;
			case BasePackage.DMULTIPLICITY__SHORTHAND:
				setShorthand((DMultiplicityShorthand)newValue);
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
			case BasePackage.DMULTIPLICITY__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case BasePackage.DMULTIPLICITY__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case BasePackage.DMULTIPLICITY__SHORTHAND:
				setShorthand(SHORTHAND_EDEFAULT);
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
			case BasePackage.DMULTIPLICITY__MIN_OCCURS:
				return minOccurs != MIN_OCCURS_EDEFAULT;
			case BasePackage.DMULTIPLICITY__MAX_OCCURS:
				return maxOccurs != MAX_OCCURS_EDEFAULT;
			case BasePackage.DMULTIPLICITY__SHORTHAND:
				return shorthand != SHORTHAND_EDEFAULT;
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
		result.append(" (minOccurs: ");
		result.append(minOccurs);
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(", shorthand: ");
		result.append(shorthand);
		result.append(')');
		return result.toString();
	}

} //DMultiplicityImpl
