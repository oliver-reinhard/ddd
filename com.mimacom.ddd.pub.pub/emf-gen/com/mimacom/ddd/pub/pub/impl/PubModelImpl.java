/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.base.DImport;

import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.ProvidedDiagramType;
import com.mimacom.ddd.pub.pub.ProvidedTableType;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.PubPackage;

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
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl#getProvidedDiagramTypes <em>Provided Diagram Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.PubModelImpl#getProvidedTableTypes <em>Provided Table Types</em>}</li>
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
	 * The cached value of the '{@link #getProvidedDiagramTypes() <em>Provided Diagram Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedDiagramTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedDiagramType> providedDiagramTypes;

	/**
	 * The cached value of the '{@link #getProvidedTableTypes() <em>Provided Table Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedTableTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ProvidedTableType> providedTableTypes;

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
	public EList<ProvidedDiagramType> getProvidedDiagramTypes() {
		if (providedDiagramTypes == null) {
			providedDiagramTypes = new EObjectContainmentEList<ProvidedDiagramType>(ProvidedDiagramType.class, this, PubPackage.PUB_MODEL__PROVIDED_DIAGRAM_TYPES);
		}
		return providedDiagramTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProvidedTableType> getProvidedTableTypes() {
		if (providedTableTypes == null) {
			providedTableTypes = new EObjectContainmentEList<ProvidedTableType>(ProvidedTableType.class, this, PubPackage.PUB_MODEL__PROVIDED_TABLE_TYPES);
		}
		return providedTableTypes;
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
			case PubPackage.PUB_MODEL__PROVIDED_DIAGRAM_TYPES:
				return ((InternalEList<?>)getProvidedDiagramTypes()).basicRemove(otherEnd, msgs);
			case PubPackage.PUB_MODEL__PROVIDED_TABLE_TYPES:
				return ((InternalEList<?>)getProvidedTableTypes()).basicRemove(otherEnd, msgs);
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
			case PubPackage.PUB_MODEL__PROVIDED_DIAGRAM_TYPES:
				return getProvidedDiagramTypes();
			case PubPackage.PUB_MODEL__PROVIDED_TABLE_TYPES:
				return getProvidedTableTypes();
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
			case PubPackage.PUB_MODEL__PROVIDED_DIAGRAM_TYPES:
				getProvidedDiagramTypes().clear();
				getProvidedDiagramTypes().addAll((Collection<? extends ProvidedDiagramType>)newValue);
				return;
			case PubPackage.PUB_MODEL__PROVIDED_TABLE_TYPES:
				getProvidedTableTypes().clear();
				getProvidedTableTypes().addAll((Collection<? extends ProvidedTableType>)newValue);
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
			case PubPackage.PUB_MODEL__PROVIDED_DIAGRAM_TYPES:
				getProvidedDiagramTypes().clear();
				return;
			case PubPackage.PUB_MODEL__PROVIDED_TABLE_TYPES:
				getProvidedTableTypes().clear();
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
			case PubPackage.PUB_MODEL__PROVIDED_DIAGRAM_TYPES:
				return providedDiagramTypes != null && !providedDiagramTypes.isEmpty();
			case PubPackage.PUB_MODEL__PROVIDED_TABLE_TYPES:
				return providedTableTypes != null && !providedTableTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PubModelImpl
