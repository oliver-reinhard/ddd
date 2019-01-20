/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DNamedElement;

import com.mimacom.ddd.dm.base.impl.DExpressionImpl;

import com.mimacom.ddd.dm.dmx.DContextReference;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DContext Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl#getContextElement <em>Context Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DContextReferenceImpl extends DExpressionImpl implements DContextReference
{
	/**
	 * The cached value of the '{@link #getContextElement() <em>Context Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextElement()
	 * @generated
	 * @ordered
	 */
	protected DNamedElement contextElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DContextReferenceImpl()
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
		return DmxPackage.Literals.DCONTEXT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamedElement getContextElement()
	{
		if (contextElement != null && contextElement.eIsProxy())
		{
			InternalEObject oldContextElement = (InternalEObject)contextElement;
			contextElement = (DNamedElement)eResolveProxy(oldContextElement);
			if (contextElement != oldContextElement)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DCONTEXT_REFERENCE__CONTEXT_ELEMENT, oldContextElement, contextElement));
			}
		}
		return contextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNamedElement basicGetContextElement()
	{
		return contextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextElement(DNamedElement newContextElement)
	{
		DNamedElement oldContextElement = contextElement;
		contextElement = newContextElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONTEXT_REFERENCE__CONTEXT_ELEMENT, oldContextElement, contextElement));
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
			case DmxPackage.DCONTEXT_REFERENCE__CONTEXT_ELEMENT:
				if (resolve) return getContextElement();
				return basicGetContextElement();
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
			case DmxPackage.DCONTEXT_REFERENCE__CONTEXT_ELEMENT:
				setContextElement((DNamedElement)newValue);
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
			case DmxPackage.DCONTEXT_REFERENCE__CONTEXT_ELEMENT:
				setContextElement((DNamedElement)null);
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
			case DmxPackage.DCONTEXT_REFERENCE__CONTEXT_ELEMENT:
				return contextElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DContextReferenceImpl
