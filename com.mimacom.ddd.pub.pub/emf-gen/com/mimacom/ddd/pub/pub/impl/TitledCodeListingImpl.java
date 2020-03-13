/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.TitledCodeListing;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Titled Code Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl#isNumbered <em>Numbered</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl#getCodeLines <em>Code Lines</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledCodeListingImpl#getInclude <em>Include</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TitledCodeListingImpl extends TitledBlockImpl implements TitledCodeListing {
	/**
	 * The default value of the '{@link #isNumbered() <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNumbered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NUMBERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNumbered() <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNumbered()
	 * @generated
	 * @ordered
	 */
	protected boolean numbered = NUMBERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodeLines() <em>Code Lines</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeLines()
	 * @generated
	 * @ordered
	 */
	protected EList<String> codeLines;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EObject include;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitledCodeListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.TITLED_CODE_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNumbered() {
		return numbered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumbered(boolean newNumbered) {
		boolean oldNumbered = numbered;
		numbered = newNumbered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_CODE_LISTING__NUMBERED, oldNumbered, numbered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCodeLines() {
		if (codeLines == null) {
			codeLines = new EDataTypeEList<String>(String.class, this, PubPackage.TITLED_CODE_LISTING__CODE_LINES);
		}
		return codeLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getInclude() {
		if (include != null && include.eIsProxy()) {
			InternalEObject oldInclude = (InternalEObject)include;
			include = eResolveProxy(oldInclude);
			if (include != oldInclude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.TITLED_CODE_LISTING__INCLUDE, oldInclude, include));
			}
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(EObject newInclude) {
		EObject oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_CODE_LISTING__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.TITLED_CODE_LISTING__NUMBERED:
				return isNumbered();
			case PubPackage.TITLED_CODE_LISTING__CODE_LINES:
				return getCodeLines();
			case PubPackage.TITLED_CODE_LISTING__INCLUDE:
				if (resolve) return getInclude();
				return basicGetInclude();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PubPackage.TITLED_CODE_LISTING__NUMBERED:
				setNumbered((Boolean)newValue);
				return;
			case PubPackage.TITLED_CODE_LISTING__CODE_LINES:
				getCodeLines().clear();
				getCodeLines().addAll((Collection<? extends String>)newValue);
				return;
			case PubPackage.TITLED_CODE_LISTING__INCLUDE:
				setInclude((EObject)newValue);
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
			case PubPackage.TITLED_CODE_LISTING__NUMBERED:
				setNumbered(NUMBERED_EDEFAULT);
				return;
			case PubPackage.TITLED_CODE_LISTING__CODE_LINES:
				getCodeLines().clear();
				return;
			case PubPackage.TITLED_CODE_LISTING__INCLUDE:
				setInclude((EObject)null);
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
			case PubPackage.TITLED_CODE_LISTING__NUMBERED:
				return numbered != NUMBERED_EDEFAULT;
			case PubPackage.TITLED_CODE_LISTING__CODE_LINES:
				return codeLines != null && !codeLines.isEmpty();
			case PubPackage.TITLED_CODE_LISTING__INCLUDE:
				return include != null;
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
		result.append(" (numbered: ");
		result.append(numbered);
		result.append(", codeLines: ");
		result.append(codeLines);
		result.append(')');
		return result.toString();
	}

} //TitledCodeListingImpl
