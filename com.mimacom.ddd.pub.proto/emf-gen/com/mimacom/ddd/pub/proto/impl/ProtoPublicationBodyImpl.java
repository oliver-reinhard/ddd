/**
 */
package com.mimacom.ddd.pub.proto.impl;

import com.mimacom.ddd.pub.proto.ProtoPackage;
import com.mimacom.ddd.pub.proto.ProtoPublicationBody;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoPublicationBodyImpl#isAllowParts <em>Allow Parts</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoPublicationBodyImpl#isAllowAppendix <em>Allow Appendix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtoPublicationBodyImpl extends ProtoDocumentSegmentImpl implements ProtoPublicationBody {
	/**
	 * The default value of the '{@link #isAllowParts() <em>Allow Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowParts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_PARTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowParts() <em>Allow Parts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowParts()
	 * @generated
	 * @ordered
	 */
	protected boolean allowParts = ALLOW_PARTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowAppendix() <em>Allow Appendix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAppendix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_APPENDIX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowAppendix() <em>Allow Appendix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowAppendix()
	 * @generated
	 * @ordered
	 */
	protected boolean allowAppendix = ALLOW_APPENDIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtoPublicationBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtoPackage.Literals.PROTO_PUBLICATION_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowParts() {
		return allowParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowParts(boolean newAllowParts) {
		boolean oldAllowParts = allowParts;
		allowParts = newAllowParts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_PARTS, oldAllowParts, allowParts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowAppendix() {
		return allowAppendix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowAppendix(boolean newAllowAppendix) {
		boolean oldAllowAppendix = allowAppendix;
		allowAppendix = newAllowAppendix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_APPENDIX, oldAllowAppendix, allowAppendix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_PARTS:
				return isAllowParts();
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_APPENDIX:
				return isAllowAppendix();
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
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_PARTS:
				setAllowParts((Boolean)newValue);
				return;
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_APPENDIX:
				setAllowAppendix((Boolean)newValue);
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
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_PARTS:
				setAllowParts(ALLOW_PARTS_EDEFAULT);
				return;
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_APPENDIX:
				setAllowAppendix(ALLOW_APPENDIX_EDEFAULT);
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
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_PARTS:
				return allowParts != ALLOW_PARTS_EDEFAULT;
			case ProtoPackage.PROTO_PUBLICATION_BODY__ALLOW_APPENDIX:
				return allowAppendix != ALLOW_APPENDIX_EDEFAULT;
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
		result.append(" (allowParts: ");
		result.append(allowParts);
		result.append(", allowAppendix: ");
		result.append(allowAppendix);
		result.append(')');
		return result.toString();
	}

} //ProtoPublicationBodyImpl
