/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.IDiagramRoot;

import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.ProvidedDiagramType;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Figure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl#getDiagramRoot <em>Diagram Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ProvidedFigureImpl#isPreferRasterDiagram <em>Prefer Raster Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedFigureImpl extends AbstractFigureImpl implements ProvidedFigure {
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
	 * The cached value of the '{@link #getDiagramType() <em>Diagram Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramType()
	 * @generated
	 * @ordered
	 */
	protected ProvidedDiagramType diagramType;

	/**
	 * The default value of the '{@link #isPreferRasterDiagram() <em>Prefer Raster Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferRasterDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFER_RASTER_DIAGRAM_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedFigureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.PROVIDED_FIGURE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.PROVIDED_FIGURE__DIAGRAM_ROOT, oldDiagramRoot, diagramRoot));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_FIGURE__DIAGRAM_ROOT, oldDiagramRoot, diagramRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedDiagramType getDiagramType() {
		if (diagramType != null && diagramType.eIsProxy()) {
			InternalEObject oldDiagramType = (InternalEObject)diagramType;
			diagramType = (ProvidedDiagramType)eResolveProxy(oldDiagramType);
			if (diagramType != oldDiagramType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.PROVIDED_FIGURE__DIAGRAM_TYPE, oldDiagramType, diagramType));
			}
		}
		return diagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedDiagramType basicGetDiagramType() {
		return diagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagramType(ProvidedDiagramType newDiagramType) {
		ProvidedDiagramType oldDiagramType = diagramType;
		diagramType = newDiagramType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PROVIDED_FIGURE__DIAGRAM_TYPE, oldDiagramType, diagramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreferRasterDiagram() {
		final Document doc = EcoreUtil2.<Document>getContainerOfType(this, Document.class);
		if ((doc != null)) {
			return doc.isPreferRasterDiagrams();
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_ROOT:
				if (resolve) return getDiagramRoot();
				return basicGetDiagramRoot();
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_TYPE:
				if (resolve) return getDiagramType();
				return basicGetDiagramType();
			case PubPackage.PROVIDED_FIGURE__PREFER_RASTER_DIAGRAM:
				return isPreferRasterDiagram();
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
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_ROOT:
				setDiagramRoot((IDiagramRoot)newValue);
				return;
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_TYPE:
				setDiagramType((ProvidedDiagramType)newValue);
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
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_ROOT:
				setDiagramRoot((IDiagramRoot)null);
				return;
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_TYPE:
				setDiagramType((ProvidedDiagramType)null);
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
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_ROOT:
				return diagramRoot != null;
			case PubPackage.PROVIDED_FIGURE__DIAGRAM_TYPE:
				return diagramType != null;
			case PubPackage.PROVIDED_FIGURE__PREFER_RASTER_DIAGRAM:
				return isPreferRasterDiagram() != PREFER_RASTER_DIAGRAM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProvidedFigureImpl
