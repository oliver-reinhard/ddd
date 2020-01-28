/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DType;

import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMorph Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl#getRetypeTo <em>Retype To</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sim.impl.SMorphRuleImpl#getRemultiplyTo <em>Remultiply To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMorphRuleImpl extends SStructureChangingRuleImpl implements SMorphRule
{
	/**
	 * The cached value of the '{@link #getRetypeTo() <em>Retype To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetypeTo()
	 * @generated
	 * @ordered
	 */
	protected DType retypeTo;

	/**
	 * The cached value of the '{@link #getRemultiplyTo() <em>Remultiply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemultiplyTo()
	 * @generated
	 * @ordered
	 */
	protected DMultiplicity remultiplyTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMorphRuleImpl()
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
		return SimPackage.Literals.SMORPH_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType getRetypeTo()
	{
		if (retypeTo != null && retypeTo.eIsProxy())
		{
			InternalEObject oldRetypeTo = (InternalEObject)retypeTo;
			retypeTo = (DType)eResolveProxy(oldRetypeTo);
			if (retypeTo != oldRetypeTo)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimPackage.SMORPH_RULE__RETYPE_TO, oldRetypeTo, retypeTo));
			}
		}
		return retypeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DType basicGetRetypeTo()
	{
		return retypeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetypeTo(DType newRetypeTo)
	{
		DType oldRetypeTo = retypeTo;
		retypeTo = newRetypeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SMORPH_RULE__RETYPE_TO, oldRetypeTo, retypeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMultiplicity getRemultiplyTo()
	{
		return remultiplyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemultiplyTo(DMultiplicity newRemultiplyTo, NotificationChain msgs)
	{
		DMultiplicity oldRemultiplyTo = remultiplyTo;
		remultiplyTo = newRemultiplyTo;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimPackage.SMORPH_RULE__REMULTIPLY_TO, oldRemultiplyTo, newRemultiplyTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemultiplyTo(DMultiplicity newRemultiplyTo)
	{
		if (newRemultiplyTo != remultiplyTo)
		{
			NotificationChain msgs = null;
			if (remultiplyTo != null)
				msgs = ((InternalEObject)remultiplyTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimPackage.SMORPH_RULE__REMULTIPLY_TO, null, msgs);
			if (newRemultiplyTo != null)
				msgs = ((InternalEObject)newRemultiplyTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimPackage.SMORPH_RULE__REMULTIPLY_TO, null, msgs);
			msgs = basicSetRemultiplyTo(newRemultiplyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SMORPH_RULE__REMULTIPLY_TO, newRemultiplyTo, newRemultiplyTo));
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
			case SimPackage.SMORPH_RULE__REMULTIPLY_TO:
				return basicSetRemultiplyTo(null, msgs);
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
			case SimPackage.SMORPH_RULE__RETYPE_TO:
				if (resolve) return getRetypeTo();
				return basicGetRetypeTo();
			case SimPackage.SMORPH_RULE__REMULTIPLY_TO:
				return getRemultiplyTo();
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
			case SimPackage.SMORPH_RULE__RETYPE_TO:
				setRetypeTo((DType)newValue);
				return;
			case SimPackage.SMORPH_RULE__REMULTIPLY_TO:
				setRemultiplyTo((DMultiplicity)newValue);
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
			case SimPackage.SMORPH_RULE__RETYPE_TO:
				setRetypeTo((DType)null);
				return;
			case SimPackage.SMORPH_RULE__REMULTIPLY_TO:
				setRemultiplyTo((DMultiplicity)null);
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
			case SimPackage.SMORPH_RULE__RETYPE_TO:
				return retypeTo != null;
			case SimPackage.SMORPH_RULE__REMULTIPLY_TO:
				return remultiplyTo != null;
		}
		return super.eIsSet(featureID);
	}

} //SMorphRuleImpl
