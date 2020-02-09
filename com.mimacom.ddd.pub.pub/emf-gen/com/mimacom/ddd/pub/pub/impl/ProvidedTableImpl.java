/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.IDiagramRoot;

import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.TableRenderer;

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
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedTableImpl#getRenderer <em>Renderer</em>}</li>
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
	 * The cached value of the '{@link #getRenderer() <em>Renderer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderer()
	 * @generated
	 * @ordered
	 */
	protected TableRenderer renderer;

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
	public TableRenderer getRenderer() {
		if (renderer != null && renderer.eIsProxy()) {
			InternalEObject oldRenderer = (InternalEObject)renderer;
			renderer = (TableRenderer)eResolveProxy(oldRenderer);
			if (renderer != oldRenderer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.PROVIDED_TABLE__RENDERER, oldRenderer, renderer));
			}
		}
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRenderer basicGetRenderer() {
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenderer(TableRenderer newRenderer) {
		TableRenderer oldRenderer = renderer;
		renderer = newRenderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_TABLE__RENDERER, oldRenderer, renderer));
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
			case PubPackage.PROVIDED_TABLE__RENDERER:
				if (resolve) return getRenderer();
				return basicGetRenderer();
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
			case PubPackage.PROVIDED_TABLE__RENDERER:
				setRenderer((TableRenderer)newValue);
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
			case PubPackage.PROVIDED_TABLE__RENDERER:
				setRenderer((TableRenderer)null);
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
			case PubPackage.PROVIDED_TABLE__RENDERER:
				return renderer != null;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedTableImpl
