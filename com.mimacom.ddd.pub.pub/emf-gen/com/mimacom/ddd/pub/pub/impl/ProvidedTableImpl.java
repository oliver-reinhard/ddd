/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.base.IDiagramRoot;

import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.ProvidedTableType;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl#getDiagramRoot <em>Diagram Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl#getTableType <em>Table Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedTableImpl extends AbstractTableImpl implements ProvidedTable {
	/**
	 * The cached value of the '{@link #getDiagramRoot() <em>Diagram Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramRoot()
	 * @generated
	 * @ordered
	 */
	protected IDiagramRoot diagramRoot;

	/**
	 * The cached value of the '{@link #getTableType() <em>Table Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected ProvidedTableType tableType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.PROVIDED_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IDiagramRoot getDiagramRoot() {
		if (diagramRoot != null && diagramRoot.eIsProxy()) {
			InternalEObject oldDiagramRoot = (InternalEObject)diagramRoot;
			diagramRoot = (IDiagramRoot)eResolveProxy(oldDiagramRoot);
			if (diagramRoot != oldDiagramRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.PROVIDED_TABLE__DIAGRAM_ROOT, oldDiagramRoot, diagramRoot));
			}
		}
		return diagramRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagramRoot basicGetDiagramRoot() {
		return diagramRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagramRoot(IDiagramRoot newDiagramRoot) {
		IDiagramRoot oldDiagramRoot = diagramRoot;
		diagramRoot = newDiagramRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_TABLE__DIAGRAM_ROOT, oldDiagramRoot, diagramRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedTableType getTableType() {
		if (tableType != null && tableType.eIsProxy()) {
			InternalEObject oldTableType = (InternalEObject)tableType;
			tableType = (ProvidedTableType)eResolveProxy(oldTableType);
			if (tableType != oldTableType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.PROVIDED_TABLE__TABLE_TYPE, oldTableType, tableType));
			}
		}
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedTableType basicGetTableType() {
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableType(ProvidedTableType newTableType) {
		ProvidedTableType oldTableType = tableType;
		tableType = newTableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_TABLE__TABLE_TYPE, oldTableType, tableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.PROVIDED_TABLE__DIAGRAM_ROOT:
				if (resolve) return getDiagramRoot();
				return basicGetDiagramRoot();
			case PubPackage.PROVIDED_TABLE__TABLE_TYPE:
				if (resolve) return getTableType();
				return basicGetTableType();
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
			case PubPackage.PROVIDED_TABLE__DIAGRAM_ROOT:
				setDiagramRoot((IDiagramRoot)newValue);
				return;
			case PubPackage.PROVIDED_TABLE__TABLE_TYPE:
				setTableType((ProvidedTableType)newValue);
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
			case PubPackage.PROVIDED_TABLE__DIAGRAM_ROOT:
				setDiagramRoot((IDiagramRoot)null);
				return;
			case PubPackage.PROVIDED_TABLE__TABLE_TYPE:
				setTableType((ProvidedTableType)null);
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
			case PubPackage.PROVIDED_TABLE__DIAGRAM_ROOT:
				return diagramRoot != null;
			case PubPackage.PROVIDED_TABLE__TABLE_TYPE:
				return tableType != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedTableImpl
