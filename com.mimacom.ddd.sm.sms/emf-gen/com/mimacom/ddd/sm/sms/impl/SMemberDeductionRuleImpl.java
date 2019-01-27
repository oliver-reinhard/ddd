/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms.impl;

import com.mimacom.ddd.dm.base.DNamedElement;

import com.mimacom.ddd.sm.sms.SMemberDeductionRule;
import com.mimacom.ddd.sm.sms.STransform;
import com.mimacom.ddd.sm.sms.SmsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMember Deduction Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sms.impl.SMemberDeductionRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sms.impl.SMemberDeductionRuleImpl#getTransform <em>Transform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMemberDeductionRuleImpl extends MinimalEObjectImpl.Container implements SMemberDeductionRule
{
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DNamedElement source;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected STransform transform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMemberDeductionRuleImpl()
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
		return SmsPackage.Literals.SMEMBER_DEDUCTION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamedElement getSource()
	{
		if (source != null && source.eIsProxy())
		{
			InternalEObject oldSource = (InternalEObject)source;
			source = (DNamedElement)eResolveProxy(oldSource);
			if (source != oldSource)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmsPackage.SMEMBER_DEDUCTION_RULE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNamedElement basicGetSource()
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(DNamedElement newSource)
	{
		DNamedElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmsPackage.SMEMBER_DEDUCTION_RULE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STransform getTransform()
	{
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(STransform newTransform, NotificationChain msgs)
	{
		STransform oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM, oldTransform, newTransform);
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
	public void setTransform(STransform newTransform)
	{
		if (newTransform != transform)
		{
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM, newTransform, newTransform));
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
			case SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM:
				return basicSetTransform(null, msgs);
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
			case SmsPackage.SMEMBER_DEDUCTION_RULE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM:
				return getTransform();
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
			case SmsPackage.SMEMBER_DEDUCTION_RULE__SOURCE:
				setSource((DNamedElement)newValue);
				return;
			case SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM:
				setTransform((STransform)newValue);
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
			case SmsPackage.SMEMBER_DEDUCTION_RULE__SOURCE:
				setSource((DNamedElement)null);
				return;
			case SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM:
				setTransform((STransform)null);
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
			case SmsPackage.SMEMBER_DEDUCTION_RULE__SOURCE:
				return source != null;
			case SmsPackage.SMEMBER_DEDUCTION_RULE__TRANSFORM:
				return transform != null;
		}
		return super.eIsSet(featureID);
	}

} //SMemberDeductionRuleImpl
