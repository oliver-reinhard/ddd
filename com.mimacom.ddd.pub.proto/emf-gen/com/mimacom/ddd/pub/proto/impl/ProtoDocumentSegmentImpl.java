/**
 */
package com.mimacom.ddd.pub.proto.impl;

import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoPackage;
import com.mimacom.ddd.pub.proto.PublicationClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.ProtoDocumentSegmentImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProtoDocumentSegmentImpl extends MinimalEObjectImpl.Container implements ProtoDocumentSegment {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtoDocumentSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtoPackage.Literals.PROTO_DOCUMENT_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return this.getClass().getSimpleName().replace("Impl", "").toLowerCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PROTO_DOCUMENT_SEGMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PROTO_DOCUMENT_SEGMENT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationClass getParent() {
		if (eContainerFeatureID() != ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT) return null;
		return (PublicationClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationClass basicGetParent() {
		if (eContainerFeatureID() != ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT) return null;
		return (PublicationClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(PublicationClass newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(PublicationClass newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ProtoPackage.PUBLICATION_CLASS__SEGMENTS, PublicationClass.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((PublicationClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, ProtoPackage.PUBLICATION_CLASS__SEGMENTS, PublicationClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__NAME:
				return getName();
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__TITLE:
				return getTitle();
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__OPTIONAL:
				return isOptional();
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__TITLE:
				setTitle((String)newValue);
				return;
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				setParent((PublicationClass)newValue);
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
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				setParent((PublicationClass)null);
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
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT:
				return basicGetParent() != null;
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
		result.append(" (title: ");
		result.append(title);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //ProtoDocumentSegmentImpl
