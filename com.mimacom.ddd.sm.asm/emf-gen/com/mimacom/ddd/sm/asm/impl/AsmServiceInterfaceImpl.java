/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.impl;

import com.mimacom.ddd.sm.asm.AsmException;
import com.mimacom.ddd.sm.asm.AsmPackage;
import com.mimacom.ddd.sm.asm.AsmServiceInterface;
import com.mimacom.ddd.sm.asm.AsmServiceOperation;

import com.mimacom.ddd.sm.sim.SystemInformationModel;

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
 * An implementation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceInterfaceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceInterfaceImpl#getCore <em>Core</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceInterfaceImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceInterfaceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsmServiceInterfaceImpl extends ApplicationServiceModelImpl implements AsmServiceInterface
{
	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected SystemInformationModel interface_;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected SystemInformationModel core;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<AsmException> exceptions;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<AsmServiceOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsmServiceInterfaceImpl()
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
		return AsmPackage.Literals.ASM_SERVICE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationModel getInterface()
	{
		if (interface_ != null && interface_.eIsProxy())
		{
			InternalEObject oldInterface = (InternalEObject)interface_;
			interface_ = (SystemInformationModel)eResolveProxy(oldInterface);
			if (interface_ != oldInterface)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsmPackage.ASM_SERVICE_INTERFACE__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationModel basicGetInterface()
	{
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(SystemInformationModel newInterface)
	{
		SystemInformationModel oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsmPackage.ASM_SERVICE_INTERFACE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationModel getCore()
	{
		if (core != null && core.eIsProxy())
		{
			InternalEObject oldCore = (InternalEObject)core;
			core = (SystemInformationModel)eResolveProxy(oldCore);
			if (core != oldCore)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AsmPackage.ASM_SERVICE_INTERFACE__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInformationModel basicGetCore()
	{
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(SystemInformationModel newCore)
	{
		SystemInformationModel oldCore = core;
		core = newCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsmPackage.ASM_SERVICE_INTERFACE__CORE, oldCore, core));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsmException> getExceptions()
	{
		if (exceptions == null)
		{
			exceptions = new EObjectContainmentEList<AsmException>(AsmException.class, this, AsmPackage.ASM_SERVICE_INTERFACE__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsmServiceOperation> getOperations()
	{
		if (operations == null)
		{
			operations = new EObjectContainmentEList<AsmServiceOperation>(AsmServiceOperation.class, this, AsmPackage.ASM_SERVICE_INTERFACE__OPERATIONS);
		}
		return operations;
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
			case AsmPackage.ASM_SERVICE_INTERFACE__EXCEPTIONS:
				return ((InternalEList<?>)getExceptions()).basicRemove(otherEnd, msgs);
			case AsmPackage.ASM_SERVICE_INTERFACE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case AsmPackage.ASM_SERVICE_INTERFACE__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
			case AsmPackage.ASM_SERVICE_INTERFACE__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case AsmPackage.ASM_SERVICE_INTERFACE__EXCEPTIONS:
				return getExceptions();
			case AsmPackage.ASM_SERVICE_INTERFACE__OPERATIONS:
				return getOperations();
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
			case AsmPackage.ASM_SERVICE_INTERFACE__INTERFACE:
				setInterface((SystemInformationModel)newValue);
				return;
			case AsmPackage.ASM_SERVICE_INTERFACE__CORE:
				setCore((SystemInformationModel)newValue);
				return;
			case AsmPackage.ASM_SERVICE_INTERFACE__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends AsmException>)newValue);
				return;
			case AsmPackage.ASM_SERVICE_INTERFACE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends AsmServiceOperation>)newValue);
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
			case AsmPackage.ASM_SERVICE_INTERFACE__INTERFACE:
				setInterface((SystemInformationModel)null);
				return;
			case AsmPackage.ASM_SERVICE_INTERFACE__CORE:
				setCore((SystemInformationModel)null);
				return;
			case AsmPackage.ASM_SERVICE_INTERFACE__EXCEPTIONS:
				getExceptions().clear();
				return;
			case AsmPackage.ASM_SERVICE_INTERFACE__OPERATIONS:
				getOperations().clear();
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
			case AsmPackage.ASM_SERVICE_INTERFACE__INTERFACE:
				return interface_ != null;
			case AsmPackage.ASM_SERVICE_INTERFACE__CORE:
				return core != null;
			case AsmPackage.ASM_SERVICE_INTERFACE__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
			case AsmPackage.ASM_SERVICE_INTERFACE__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AsmServiceInterfaceImpl