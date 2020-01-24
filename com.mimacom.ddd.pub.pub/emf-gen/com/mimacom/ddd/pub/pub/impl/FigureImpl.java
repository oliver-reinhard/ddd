/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.Figure;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FigureImpl#getFileUri <em>File Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FigureImpl extends TitledBlockImpl implements Figure {
	/**
	 * The default value of the '{@link #getFileUri() <em>File Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileUri()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileUri() <em>File Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileUri()
	 * @generated
	 * @ordered
	 */
	protected String fileUri = FILE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.FIGURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileUri() {
		return fileUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileUri(String newFileUri) {
		String oldFileUri = fileUri;
		fileUri = newFileUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FIGURE__FILE_URI, oldFileUri, fileUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.FIGURE__FILE_URI:
				return getFileUri();
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
			case PubPackage.FIGURE__FILE_URI:
				setFileUri((String)newValue);
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
			case PubPackage.FIGURE__FILE_URI:
				setFileUri(FILE_URI_EDEFAULT);
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
			case PubPackage.FIGURE__FILE_URI:
				return FILE_URI_EDEFAULT == null ? fileUri != null : !FILE_URI_EDEFAULT.equals(fileUri);
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
		result.append(" (fileUri: ");
		result.append(fileUri);
		result.append(')');
		return result.toString();
	}

} //FigureImpl
