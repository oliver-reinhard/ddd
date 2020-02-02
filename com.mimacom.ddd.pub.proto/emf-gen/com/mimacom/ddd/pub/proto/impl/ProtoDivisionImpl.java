/**
 */
package com.mimacom.ddd.pub.proto.impl;

import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoPackage;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoDivisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoDivisionImpl#getNumberingStyle <em>Numbering Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProtoDivisionImpl extends MinimalEObjectImpl.Container implements ProtoDivision {
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
	 * The default value of the '{@link #getNumberingStyle() <em>Numbering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ProtoSequenceNumberStyle NUMBERING_STYLE_EDEFAULT = ProtoSequenceNumberStyle.ARABIC;

	/**
	 * The cached value of the '{@link #getNumberingStyle() <em>Numbering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberingStyle()
	 * @generated
	 * @ordered
	 */
	protected ProtoSequenceNumberStyle numberingStyle = NUMBERING_STYLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtoDivisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtoPackage.Literals.PROTO_DIVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getClass().getSimpleName().replace("Impl", "").toLowerCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtoSequenceNumberStyle getNumberingStyle() {
		return numberingStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberingStyle(ProtoSequenceNumberStyle newNumberingStyle) {
		ProtoSequenceNumberStyle oldNumberingStyle = numberingStyle;
		numberingStyle = newNumberingStyle == null ? NUMBERING_STYLE_EDEFAULT : newNumberingStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PROTO_DIVISION__NUMBERING_STYLE, oldNumberingStyle, numberingStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtoPackage.PROTO_DIVISION__NAME:
				return getName();
			case ProtoPackage.PROTO_DIVISION__NUMBERING_STYLE:
				return getNumberingStyle();
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
			case ProtoPackage.PROTO_DIVISION__NUMBERING_STYLE:
				setNumberingStyle((ProtoSequenceNumberStyle)newValue);
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
			case ProtoPackage.PROTO_DIVISION__NUMBERING_STYLE:
				setNumberingStyle(NUMBERING_STYLE_EDEFAULT);
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
			case ProtoPackage.PROTO_DIVISION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProtoPackage.PROTO_DIVISION__NUMBERING_STYLE:
				return numberingStyle != NUMBERING_STYLE_EDEFAULT;
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
		result.append(" (numberingStyle: ");
		result.append(numberingStyle);
		result.append(')');
		return result.toString();
	}

} //ProtoDivisionImpl
