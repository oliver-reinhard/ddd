/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.DImport;

import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.FigureRenderer;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.TableRenderer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl#getFigureRenderers <em>Figure Renderers</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl#getTableRenderers <em>Table Renderers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PubModelImpl extends MinimalEObjectImpl.Container implements PubModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DImport> imports;

	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;

	/**
	 * The cached value of the '{@link #getFigureRenderers() <em>Figure Renderers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureRenderers()
	 * @generated
	 * @ordered
	 */
	protected EList<FigureRenderer> figureRenderers;

	/**
	 * The cached value of the '{@link #getTableRenderers() <em>Table Renderers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableRenderers()
	 * @generated
	 * @ordered
	 */
	protected EList<TableRenderer> tableRenderers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.PUB_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<DImport>(DImport.class, this, PubPackage.PUB_MODEL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document getDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(Document newDocument, NotificationChain msgs) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubPackage.PUB_MODEL__DOCUMENT, oldDocument, newDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocument(Document newDocument) {
		if (newDocument != document) {
			NotificationChain msgs = null;
			if (document != null)
				msgs = ((InternalEObject)document).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubPackage.PUB_MODEL__DOCUMENT, null, msgs);
			if (newDocument != null)
				msgs = ((InternalEObject)newDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubPackage.PUB_MODEL__DOCUMENT, null, msgs);
			msgs = basicSetDocument(newDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.PUB_MODEL__DOCUMENT, newDocument, newDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FigureRenderer> getFigureRenderers() {
		if (figureRenderers == null) {
			figureRenderers = new EObjectContainmentEList<FigureRenderer>(FigureRenderer.class, this, PubPackage.PUB_MODEL__FIGURE_RENDERERS);
		}
		return figureRenderers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TableRenderer> getTableRenderers() {
		if (tableRenderers == null) {
			tableRenderers = new EObjectContainmentEList<TableRenderer>(TableRenderer.class, this, PubPackage.PUB_MODEL__TABLE_RENDERERS);
		}
		return tableRenderers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubPackage.PUB_MODEL__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case PubPackage.PUB_MODEL__DOCUMENT:
				return basicSetDocument(null, msgs);
			case PubPackage.PUB_MODEL__FIGURE_RENDERERS:
				return ((InternalEList<?>)getFigureRenderers()).basicRemove(otherEnd, msgs);
			case PubPackage.PUB_MODEL__TABLE_RENDERERS:
				return ((InternalEList<?>)getTableRenderers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.PUB_MODEL__IMPORTS:
				return getImports();
			case PubPackage.PUB_MODEL__DOCUMENT:
				return getDocument();
			case PubPackage.PUB_MODEL__FIGURE_RENDERERS:
				return getFigureRenderers();
			case PubPackage.PUB_MODEL__TABLE_RENDERERS:
				return getTableRenderers();
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
			case PubPackage.PUB_MODEL__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DImport>)newValue);
				return;
			case PubPackage.PUB_MODEL__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case PubPackage.PUB_MODEL__FIGURE_RENDERERS:
				getFigureRenderers().clear();
				getFigureRenderers().addAll((Collection<? extends FigureRenderer>)newValue);
				return;
			case PubPackage.PUB_MODEL__TABLE_RENDERERS:
				getTableRenderers().clear();
				getTableRenderers().addAll((Collection<? extends TableRenderer>)newValue);
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
			case PubPackage.PUB_MODEL__IMPORTS:
				getImports().clear();
				return;
			case PubPackage.PUB_MODEL__DOCUMENT:
				setDocument((Document)null);
				return;
			case PubPackage.PUB_MODEL__FIGURE_RENDERERS:
				getFigureRenderers().clear();
				return;
			case PubPackage.PUB_MODEL__TABLE_RENDERERS:
				getTableRenderers().clear();
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
			case PubPackage.PUB_MODEL__IMPORTS:
				return imports != null && !imports.isEmpty();
			case PubPackage.PUB_MODEL__DOCUMENT:
				return document != null;
			case PubPackage.PUB_MODEL__FIGURE_RENDERERS:
				return figureRenderers != null && !figureRenderers.isEmpty();
			case PubPackage.PUB_MODEL__TABLE_RENDERERS:
				return tableRenderers != null && !tableRenderers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PubModelImpl
