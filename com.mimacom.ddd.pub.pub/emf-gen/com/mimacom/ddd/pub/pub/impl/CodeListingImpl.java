/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.CodeLanguage;
import com.mimacom.ddd.pub.pub.CodeListing;
import com.mimacom.ddd.pub.pub.PubPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
<<<<<<< HEAD
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.CodeListingImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.CodeListingImpl#getCodeLines <em>Code Lines</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.CodeListingImpl#getInclude <em>Include</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeListingImpl extends TitledBlockImpl implements CodeListing {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CodeLanguage FORMAT_EDEFAULT = CodeLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected CodeLanguage format = FORMAT_EDEFAULT;

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
	protected CodeListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.CODE_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLanguage getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(CodeLanguage newFormat) {
		CodeLanguage oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.CODE_LISTING__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCodeLines() {
		if (codeLines == null) {
			codeLines = new EDataTypeEList<String>(String.class, this, PubPackage.CODE_LISTING__CODE_LINES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.CODE_LISTING__INCLUDE, oldInclude, include));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.CODE_LISTING__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.CODE_LISTING__FORMAT:
				return getFormat();
			case PubPackage.CODE_LISTING__CODE_LINES:
				return getCodeLines();
			case PubPackage.CODE_LISTING__INCLUDE:
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
			case PubPackage.CODE_LISTING__FORMAT:
				setFormat((CodeLanguage)newValue);
				return;
			case PubPackage.CODE_LISTING__CODE_LINES:
				getCodeLines().clear();
				getCodeLines().addAll((Collection<? extends String>)newValue);
				return;
			case PubPackage.CODE_LISTING__INCLUDE:
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
			case PubPackage.CODE_LISTING__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case PubPackage.CODE_LISTING__CODE_LINES:
				getCodeLines().clear();
				return;
			case PubPackage.CODE_LISTING__INCLUDE:
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
			case PubPackage.CODE_LISTING__FORMAT:
				return format != FORMAT_EDEFAULT;
			case PubPackage.CODE_LISTING__CODE_LINES:
				return codeLines != null && !codeLines.isEmpty();
			case PubPackage.CODE_LISTING__INCLUDE:
				return include != null;
=======

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Listing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.CodeListingImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.CodeListingImpl#getCodeLines <em>Code Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeListingImpl extends TitledBlockImpl implements CodeListing {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CodeLanguage FORMAT_EDEFAULT = CodeLanguage.JAVA;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected CodeLanguage format = FORMAT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeListingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.CODE_LISTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeLanguage getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(CodeLanguage newFormat) {
		CodeLanguage oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.CODE_LISTING__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCodeLines() {
		if (codeLines == null) {
			codeLines = new EDataTypeEList<String>(String.class, this, PubPackage.CODE_LISTING__CODE_LINES);
		}
		return codeLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.CODE_LISTING__FORMAT:
				return getFormat();
			case PubPackage.CODE_LISTING__CODE_LINES:
				return getCodeLines();
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
			case PubPackage.CODE_LISTING__FORMAT:
				setFormat((CodeLanguage)newValue);
				return;
			case PubPackage.CODE_LISTING__CODE_LINES:
				getCodeLines().clear();
				getCodeLines().addAll((Collection<? extends String>)newValue);
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
			case PubPackage.CODE_LISTING__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case PubPackage.CODE_LISTING__CODE_LINES:
				getCodeLines().clear();
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
			case PubPackage.CODE_LISTING__FORMAT:
				return format != FORMAT_EDEFAULT;
			case PubPackage.CODE_LISTING__CODE_LINES:
				return codeLines != null && !codeLines.isEmpty();
>>>>>>> refs/remotes/origin/master
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
		result.append(" (format: ");
		result.append(format);
		result.append(", codeLines: ");
		result.append(codeLines);
		result.append(')');
		return result.toString();
	}

} //CodeListingImpl
