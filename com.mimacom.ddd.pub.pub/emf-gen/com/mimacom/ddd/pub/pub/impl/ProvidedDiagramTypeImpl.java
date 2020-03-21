/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.ProvidedDiagramType;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedDiagramTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedDiagramTypeImpl#getDiagramTypeName <em>Diagram Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedDiagramTypeImpl extends MinimalEObjectImpl.Container implements ProvidedDiagramType {
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
	 * The default value of the '{@link #getDiagramTypeName() <em>Diagram Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGRAM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagramTypeName() <em>Diagram Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramTypeName()
	 * @generated
	 * @ordered
	 */
	protected String diagramTypeName = DIAGRAM_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedDiagramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.PROVIDED_DIAGRAM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_DIAGRAM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagramTypeName() {
		return diagramTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramTypeName(String newDiagramTypeName) {
		String oldDiagramTypeName = diagramTypeName;
		diagramTypeName = newDiagramTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME, oldDiagramTypeName, diagramTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.PROVIDED_DIAGRAM_TYPE__NAME:
				return getName();
			case PubPackage.PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME:
				return getDiagramTypeName();
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
			case PubPackage.PROVIDED_DIAGRAM_TYPE__NAME:
				setName((String)newValue);
				return;
			case PubPackage.PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME:
				setDiagramTypeName((String)newValue);
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
			case PubPackage.PROVIDED_DIAGRAM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME:
				setDiagramTypeName(DIAGRAM_TYPE_NAME_EDEFAULT);
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
			case PubPackage.PROVIDED_DIAGRAM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.PROVIDED_DIAGRAM_TYPE__DIAGRAM_TYPE_NAME:
				return DIAGRAM_TYPE_NAME_EDEFAULT == null ? diagramTypeName != null : !DIAGRAM_TYPE_NAME_EDEFAULT.equals(diagramTypeName);
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
		result.append(", diagramTypeName: ");
		result.append(diagramTypeName);
		result.append(')');
		return result.toString();
	}

} //ProvidedDiagramTypeImpl
