/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.IDiagramRoot;

import com.mimacom.ddd.pub.pub.Figure;
import com.mimacom.ddd.pub.pub.FigureRenderer;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FigureImpl#getDiagramRoot <em>Diagram Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FigureImpl#getRenderer <em>Renderer</em>}</li>
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
	protected FigureRenderer renderer;

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
	public IDiagramRoot getDiagramRoot() {
		if (diagramRoot != null && diagramRoot.eIsProxy()) {
			InternalEObject oldDiagramRoot = (InternalEObject)diagramRoot;
			diagramRoot = (IDiagramRoot)eResolveProxy(oldDiagramRoot);
			if (diagramRoot != oldDiagramRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.FIGURE__DIAGRAM_ROOT, oldDiagramRoot, diagramRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FIGURE__DIAGRAM_ROOT, oldDiagramRoot, diagramRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FigureRenderer getRenderer() {
		if (renderer != null && renderer.eIsProxy()) {
			InternalEObject oldRenderer = (InternalEObject)renderer;
			renderer = (FigureRenderer)eResolveProxy(oldRenderer);
			if (renderer != oldRenderer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.FIGURE__RENDERER, oldRenderer, renderer));
			}
		}
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureRenderer basicGetRenderer() {
		return renderer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenderer(FigureRenderer newRenderer) {
		FigureRenderer oldRenderer = renderer;
		renderer = newRenderer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FIGURE__RENDERER, oldRenderer, renderer));
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
			case PubPackage.FIGURE__DIAGRAM_ROOT:
				if (resolve) return getDiagramRoot();
				return basicGetDiagramRoot();
			case PubPackage.FIGURE__RENDERER:
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
			case PubPackage.FIGURE__FILE_URI:
				setFileUri((String)newValue);
				return;
			case PubPackage.FIGURE__DIAGRAM_ROOT:
				setDiagramRoot((IDiagramRoot)newValue);
				return;
			case PubPackage.FIGURE__RENDERER:
				setRenderer((FigureRenderer)newValue);
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
			case PubPackage.FIGURE__DIAGRAM_ROOT:
				setDiagramRoot((IDiagramRoot)null);
				return;
			case PubPackage.FIGURE__RENDERER:
				setRenderer((FigureRenderer)null);
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
			case PubPackage.FIGURE__DIAGRAM_ROOT:
				return diagramRoot != null;
			case PubPackage.FIGURE__RENDERER:
				return renderer != null;
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
