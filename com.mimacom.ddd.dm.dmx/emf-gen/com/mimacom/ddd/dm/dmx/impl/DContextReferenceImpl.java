/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;

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
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl#isBefore <em>Before</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl#isPlural <em>Plural</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DContextReferenceImpl extends DExpressionImpl implements DContextReference
{
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DNamedElement target;

	/**
	 * The default value of the '{@link #isBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEFORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBefore()
	 * @generated
	 * @ordered
	 */
	protected boolean before = BEFORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected DNavigableMember member;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPlural() <em>Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlural()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLURAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlural() <em>Plural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlural()
	 * @generated
	 * @ordered
	 */
	protected boolean plural = PLURAL_EDEFAULT;

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
	public DNamedElement getTarget()
	{
		if (target != null && target.eIsProxy())
		{
			InternalEObject oldTarget = (InternalEObject)target;
			target = (DNamedElement)eResolveProxy(oldTarget);
			if (target != oldTarget)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DCONTEXT_REFERENCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNamedElement basicGetTarget()
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(DNamedElement newTarget)
	{
		DNamedElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONTEXT_REFERENCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBefore()
	{
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBefore(boolean newBefore)
	{
		boolean oldBefore = before;
		before = newBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONTEXT_REFERENCE__BEFORE, oldBefore, before));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNavigableMember getMember()
	{
		if (member != null && member.eIsProxy())
		{
			InternalEObject oldMember = (InternalEObject)member;
			member = (DNavigableMember)eResolveProxy(oldMember);
			if (member != oldMember)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DCONTEXT_REFERENCE__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DNavigableMember basicGetMember()
	{
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMember(DNavigableMember newMember)
	{
		DNavigableMember oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONTEXT_REFERENCE__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName()
	{
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName)
	{
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONTEXT_REFERENCE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPlural()
	{
		return plural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlural(boolean newPlural)
	{
		boolean oldPlural = plural;
		plural = newPlural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DCONTEXT_REFERENCE__PLURAL, oldPlural, plural));
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
			case DmxPackage.DCONTEXT_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DmxPackage.DCONTEXT_REFERENCE__BEFORE:
				return isBefore();
			case DmxPackage.DCONTEXT_REFERENCE__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case DmxPackage.DCONTEXT_REFERENCE__DISPLAY_NAME:
				return getDisplayName();
			case DmxPackage.DCONTEXT_REFERENCE__PLURAL:
				return isPlural();
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
			case DmxPackage.DCONTEXT_REFERENCE__TARGET:
				setTarget((DNamedElement)newValue);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__BEFORE:
				setBefore((Boolean)newValue);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__MEMBER:
				setMember((DNavigableMember)newValue);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__PLURAL:
				setPlural((Boolean)newValue);
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
			case DmxPackage.DCONTEXT_REFERENCE__TARGET:
				setTarget((DNamedElement)null);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__BEFORE:
				setBefore(BEFORE_EDEFAULT);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__MEMBER:
				setMember((DNavigableMember)null);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case DmxPackage.DCONTEXT_REFERENCE__PLURAL:
				setPlural(PLURAL_EDEFAULT);
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
			case DmxPackage.DCONTEXT_REFERENCE__TARGET:
				return target != null;
			case DmxPackage.DCONTEXT_REFERENCE__BEFORE:
				return before != BEFORE_EDEFAULT;
			case DmxPackage.DCONTEXT_REFERENCE__MEMBER:
				return member != null;
			case DmxPackage.DCONTEXT_REFERENCE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case DmxPackage.DCONTEXT_REFERENCE__PLURAL:
				return plural != PLURAL_EDEFAULT;
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
		result.append(" (before: ");
		result.append(before);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", plural: ");
		result.append(plural);
		result.append(')');
		return result.toString();
	}

} //DContextReferenceImpl
