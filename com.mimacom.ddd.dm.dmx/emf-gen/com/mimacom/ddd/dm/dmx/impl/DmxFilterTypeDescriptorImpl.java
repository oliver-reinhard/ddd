/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Type Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl#getSingle <em>Single</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl#isCollection <em>Collection</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.impl.DmxFilterTypeDescriptorImpl#isMultiTyped <em>Multi Typed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DmxFilterTypeDescriptorImpl extends MinimalEObjectImpl.Container implements DmxFilterTypeDescriptor
{
	/**
	 * The default value of the '{@link #getSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected static final DmxBaseType SINGLE_EDEFAULT = DmxBaseType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getSingle() <em>Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingle()
	 * @generated
	 * @ordered
	 */
	protected DmxBaseType single = SINGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultiple() <em>Multiple</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiple()
	 * @generated
	 * @ordered
	 */
	protected DmxBaseTypeSet multiple;

	/**
	 * The default value of the '{@link #isCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean collection = COLLECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultiTyped() <em>Multi Typed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiTyped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_TYPED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmxFilterTypeDescriptorImpl()
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
		return DmxPackage.Literals.DMX_FILTER_TYPE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBaseType getSingle()
	{
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingle(DmxBaseType newSingle)
	{
		DmxBaseType oldSingle = single;
		single = newSingle == null ? SINGLE_EDEFAULT : newSingle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__SINGLE, oldSingle, single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBaseTypeSet getMultiple()
	{
		if (multiple != null && multiple.eIsProxy())
		{
			InternalEObject oldMultiple = (InternalEObject)multiple;
			multiple = (DmxBaseTypeSet)eResolveProxy(oldMultiple);
			if (multiple != oldMultiple)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE, oldMultiple, multiple));
			}
		}
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBaseTypeSet basicGetMultiple()
	{
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiple(DmxBaseTypeSet newMultiple)
	{
		DmxBaseTypeSet oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE, oldMultiple, multiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollection()
	{
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(boolean newCollection)
	{
		boolean oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiTyped()
	{
		// TODO: implement this method to return the 'Multi Typed' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiTyped(boolean newMultiTyped)
	{
		// TODO: implement this method to set the 'Multi Typed' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatible(DmxBaseType type, boolean collection)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatible(DmxBaseType type)
	{
		// TODO: implement this method
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
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__SINGLE:
				return getSingle();
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE:
				if (resolve) return getMultiple();
				return basicGetMultiple();
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION:
				return isCollection();
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED:
				return isMultiTyped();
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
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__SINGLE:
				setSingle((DmxBaseType)newValue);
				return;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE:
				setMultiple((DmxBaseTypeSet)newValue);
				return;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION:
				setCollection((Boolean)newValue);
				return;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED:
				setMultiTyped((Boolean)newValue);
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
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__SINGLE:
				setSingle(SINGLE_EDEFAULT);
				return;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE:
				setMultiple((DmxBaseTypeSet)null);
				return;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION:
				setCollection(COLLECTION_EDEFAULT);
				return;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED:
				setMultiTyped(MULTI_TYPED_EDEFAULT);
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
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__SINGLE:
				return single != SINGLE_EDEFAULT;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE:
				return multiple != null;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION:
				return collection != COLLECTION_EDEFAULT;
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED:
				return isMultiTyped() != MULTI_TYPED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE_BOOLEAN:
				return isCompatible((DmxBaseType)arguments.get(0), (Boolean)arguments.get(1));
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE:
				return isCompatible((DmxBaseType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (single: ");
		result.append(single);
		result.append(", collection: ");
		result.append(collection);
		result.append(')');
		return result.toString();
	}

} //DmxFilterTypeDescriptorImpl
