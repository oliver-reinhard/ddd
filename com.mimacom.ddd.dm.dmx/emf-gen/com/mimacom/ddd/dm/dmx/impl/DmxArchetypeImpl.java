/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.base.impl.DPrimitiveImpl;

import com.mimacom.ddd.dm.base.transpose.ITransposableElement;
import com.mimacom.ddd.dm.base.transpose.ITransposition;
import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl#getTransposedBy <em>Transposed By</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxArchetypeImpl#getBaseType <em>Base Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxArchetypeImpl extends DPrimitiveImpl implements DmxArchetype
{
	/**
	 * The cached value of the '{@link #getTransposedBy() <em>Transposed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransposedBy()
	 * @generated
	 * @ordered
	 */
	protected ITransposition transposedBy;

	/**
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final DmxBaseType BASE_TYPE_EDEFAULT = DmxBaseType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected DmxBaseType baseType = BASE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxArchetypeImpl()
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
		return DmxPackage.Literals.DMX_ARCHETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition getTransposedBy()
	{
		if (transposedBy != null && transposedBy.eIsProxy())
		{
			InternalEObject oldTransposedBy = (InternalEObject)transposedBy;
			transposedBy = (ITransposition)eResolveProxy(oldTransposedBy);
			if (transposedBy != oldTransposedBy)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY, oldTransposedBy, transposedBy));
			}
		}
		return transposedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITransposition basicGetTransposedBy()
	{
		return transposedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransposedBy(ITransposition newTransposedBy)
	{
		ITransposition oldTransposedBy = transposedBy;
		transposedBy = newTransposedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY, oldTransposedBy, transposedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBaseType getBaseType()
	{
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(DmxBaseType newBaseType)
	{
		DmxBaseType oldBaseType = baseType;
		baseType = newBaseType == null ? BASE_TYPE_EDEFAULT : newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_ARCHETYPE__BASE_TYPE, oldBaseType, baseType));
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
			case DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY:
				if (resolve) return getTransposedBy();
				return basicGetTransposedBy();
			case DmxPackage.DMX_ARCHETYPE__BASE_TYPE:
				return getBaseType();
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
			case DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY:
				setTransposedBy((ITransposition)newValue);
				return;
			case DmxPackage.DMX_ARCHETYPE__BASE_TYPE:
				setBaseType((DmxBaseType)newValue);
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
			case DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY:
				setTransposedBy((ITransposition)null);
				return;
			case DmxPackage.DMX_ARCHETYPE__BASE_TYPE:
				setBaseType(BASE_TYPE_EDEFAULT);
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
			case DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY:
				return transposedBy != null;
			case DmxPackage.DMX_ARCHETYPE__BASE_TYPE:
				return baseType != BASE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == ITransposableElement.class)
		{
			switch (derivedFeatureID)
			{
				case DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY: return TransposePackage.ITRANSPOSABLE_ELEMENT__TRANSPOSED_BY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == ITransposableElement.class)
		{
			switch (baseFeatureID)
			{
				case TransposePackage.ITRANSPOSABLE_ELEMENT__TRANSPOSED_BY: return DmxPackage.DMX_ARCHETYPE__TRANSPOSED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (baseType: ");
		result.append(baseType);
		result.append(')');
		return result.toString();
	}

} //DmxArchetypeImpl
