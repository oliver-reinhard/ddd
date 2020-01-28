/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.Abbreviation;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.AbbreviationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.AbbreviationImpl#getLongForm <em>Long Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbbreviationImpl extends MinimalEObjectImpl.Container implements Abbreviation {
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
	 * The default value of the '{@link #getLongForm() <em>Long Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongForm()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_FORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongForm() <em>Long Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongForm()
	 * @generated
	 * @ordered
	 */
	protected String longForm = LONG_FORM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbbreviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.ABBREVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.ABBREVIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongForm() {
		return longForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongForm(String newLongForm) {
		String oldLongForm = longForm;
		longForm = newLongForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.ABBREVIATION__LONG_FORM, oldLongForm, longForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.ABBREVIATION__NAME:
				return getName();
			case PubPackage.ABBREVIATION__LONG_FORM:
				return getLongForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PubPackage.ABBREVIATION__NAME:
				setName((String)newValue);
				return;
			case PubPackage.ABBREVIATION__LONG_FORM:
				setLongForm((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PubPackage.ABBREVIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.ABBREVIATION__LONG_FORM:
				setLongForm(LONG_FORM_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PubPackage.ABBREVIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.ABBREVIATION__LONG_FORM:
				return LONG_FORM_EDEFAULT == null ? longForm != null : !LONG_FORM_EDEFAULT.equals(longForm);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", longForm: ");
		result.append(longForm);
		result.append(')');
		return result.toString();
	}

} //AbbreviationImpl
