/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.impl;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DNavigableMember;

import com.mimacom.ddd.sm.asm.AsmException;
import com.mimacom.ddd.sm.asm.AsmPackage;
import com.mimacom.ddd.sm.asm.AsmServiceOperation;
import com.mimacom.ddd.sm.asm.AsmServiceParameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceOperationImpl#getNavigableMembers <em>Navigable Members</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceOperationImpl#getRaises <em>Raises</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceOperationImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.impl.AsmServiceOperationImpl#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsmServiceOperationImpl extends MinimalEObjectImpl.Container implements AsmServiceOperation
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AsmServiceParameter> parameters;

	/**
	 * The cached value of the '{@link #getRaises() <em>Raises</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaises()
	 * @generated
	 * @ordered
	 */
	protected EList<AsmException> raises;

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
	protected AsmServiceOperationImpl()
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
		return AsmPackage.Literals.ASM_SERVICE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DNavigableMember> getNavigableMembers()
	{
		// TODO: implement this method to return the 'Navigable Members' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsmPackage.ASM_SERVICE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsmServiceParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<AsmServiceParameter>(AsmServiceParameter.class, this, AsmPackage.ASM_SERVICE_OPERATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsmException> getRaises()
	{
		if (raises == null)
		{
			raises = new EObjectResolvingEList<AsmException>(AsmException.class, this, AsmPackage.ASM_SERVICE_OPERATION__RAISES);
		}
		return raises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DExpression> getGuards()
	{
		if (guards == null)
		{
			guards = new EObjectContainmentEList<DExpression>(DExpression.class, this, AsmPackage.ASM_SERVICE_OPERATION__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DExpression> getEffects()
	{
		if (effects == null)
		{
			effects = new EObjectContainmentEList<DExpression>(DExpression.class, this, AsmPackage.ASM_SERVICE_OPERATION__EFFECTS);
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
			case AsmPackage.ASM_SERVICE_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case AsmPackage.ASM_SERVICE_OPERATION__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case AsmPackage.ASM_SERVICE_OPERATION__EFFECTS:
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
			case AsmPackage.ASM_SERVICE_OPERATION__NAVIGABLE_MEMBERS:
				return getNavigableMembers();
			case AsmPackage.ASM_SERVICE_OPERATION__NAME:
				return getName();
			case AsmPackage.ASM_SERVICE_OPERATION__PARAMETERS:
				return getParameters();
			case AsmPackage.ASM_SERVICE_OPERATION__RAISES:
				return getRaises();
			case AsmPackage.ASM_SERVICE_OPERATION__GUARDS:
				return getGuards();
			case AsmPackage.ASM_SERVICE_OPERATION__EFFECTS:
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
			case AsmPackage.ASM_SERVICE_OPERATION__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				getNavigableMembers().addAll((Collection<? extends DNavigableMember>)newValue);
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends AsmServiceParameter>)newValue);
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__RAISES:
				getRaises().clear();
				getRaises().addAll((Collection<? extends AsmException>)newValue);
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends DExpression>)newValue);
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__EFFECTS:
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
			case AsmPackage.ASM_SERVICE_OPERATION__NAVIGABLE_MEMBERS:
				getNavigableMembers().clear();
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__RAISES:
				getRaises().clear();
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__GUARDS:
				getGuards().clear();
				return;
			case AsmPackage.ASM_SERVICE_OPERATION__EFFECTS:
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
			case AsmPackage.ASM_SERVICE_OPERATION__NAVIGABLE_MEMBERS:
				return !getNavigableMembers().isEmpty();
			case AsmPackage.ASM_SERVICE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AsmPackage.ASM_SERVICE_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AsmPackage.ASM_SERVICE_OPERATION__RAISES:
				return raises != null && !raises.isEmpty();
			case AsmPackage.ASM_SERVICE_OPERATION__GUARDS:
				return guards != null && !guards.isEmpty();
			case AsmPackage.ASM_SERVICE_OPERATION__EFFECTS:
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
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AsmServiceOperationImpl