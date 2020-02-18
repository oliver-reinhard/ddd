/**
 */
package com.mimacom.ddd.pub.proto.impl;

import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.pub.proto.ProtoDivision;
import com.mimacom.ddd.pub.proto.ProtoDocumentSegment;
import com.mimacom.ddd.pub.proto.ProtoPackage;
import com.mimacom.ddd.pub.proto.ProtoSymbol;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.proto.PublicationNature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl#getPreamble <em>Preamble</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.proto.impl.PublicationClassImpl#getDivisions <em>Divisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicationClassImpl extends MinimalEObjectImpl.Container implements PublicationClass {
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
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final PublicationNature NATURE_EDEFAULT = PublicationNature.PRINT;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected PublicationNature nature = NATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtoSymbol> symbols;

	/**
	 * The cached value of the '{@link #getPreamble() <em>Preamble</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreamble()
	 * @generated
	 * @ordered
	 */
	protected DRichText preamble;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtoDocumentSegment> segments;

	/**
	 * The cached value of the '{@link #getDivisions() <em>Divisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtoDivision> divisions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtoPackage.Literals.PUBLICATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PUBLICATION_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublicationNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(PublicationNature newNature) {
		PublicationNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PUBLICATION_CLASS__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtoSymbol> getSymbols() {
		if (symbols == null) {
			symbols = new EObjectContainmentEList<ProtoSymbol>(ProtoSymbol.class, this, ProtoPackage.PUBLICATION_CLASS__SYMBOLS);
		}
		return symbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRichText getPreamble() {
		return preamble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreamble(DRichText newPreamble, NotificationChain msgs) {
		DRichText oldPreamble = preamble;
		preamble = newPreamble;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtoPackage.PUBLICATION_CLASS__PREAMBLE, oldPreamble, newPreamble);
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
	public void setPreamble(DRichText newPreamble) {
		if (newPreamble != preamble) {
			NotificationChain msgs = null;
			if (preamble != null)
				msgs = ((InternalEObject)preamble).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtoPackage.PUBLICATION_CLASS__PREAMBLE, null, msgs);
			if (newPreamble != null)
				msgs = ((InternalEObject)newPreamble).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtoPackage.PUBLICATION_CLASS__PREAMBLE, null, msgs);
			msgs = basicSetPreamble(newPreamble, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProtoPackage.PUBLICATION_CLASS__PREAMBLE, newPreamble, newPreamble));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtoDocumentSegment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentWithInverseEList<ProtoDocumentSegment>(ProtoDocumentSegment.class, this, ProtoPackage.PUBLICATION_CLASS__SEGMENTS, ProtoPackage.PROTO_DOCUMENT_SEGMENT__PARENT);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtoDivision> getDivisions() {
		if (divisions == null) {
			divisions = new EObjectContainmentEList<ProtoDivision>(ProtoDivision.class, this, ProtoPackage.PUBLICATION_CLASS__DIVISIONS);
		}
		return divisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtoPackage.PUBLICATION_CLASS__SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSegments()).basicAdd(otherEnd, msgs);
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
			case ProtoPackage.PUBLICATION_CLASS__SYMBOLS:
				return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
			case ProtoPackage.PUBLICATION_CLASS__PREAMBLE:
				return basicSetPreamble(null, msgs);
			case ProtoPackage.PUBLICATION_CLASS__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case ProtoPackage.PUBLICATION_CLASS__DIVISIONS:
				return ((InternalEList<?>)getDivisions()).basicRemove(otherEnd, msgs);
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
			case ProtoPackage.PUBLICATION_CLASS__NAME:
				return getName();
			case ProtoPackage.PUBLICATION_CLASS__NATURE:
				return getNature();
			case ProtoPackage.PUBLICATION_CLASS__SYMBOLS:
				return getSymbols();
			case ProtoPackage.PUBLICATION_CLASS__PREAMBLE:
				return getPreamble();
			case ProtoPackage.PUBLICATION_CLASS__SEGMENTS:
				return getSegments();
			case ProtoPackage.PUBLICATION_CLASS__DIVISIONS:
				return getDivisions();
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
			case ProtoPackage.PUBLICATION_CLASS__NAME:
				setName((String)newValue);
				return;
			case ProtoPackage.PUBLICATION_CLASS__NATURE:
				setNature((PublicationNature)newValue);
				return;
			case ProtoPackage.PUBLICATION_CLASS__SYMBOLS:
				getSymbols().clear();
				getSymbols().addAll((Collection<? extends ProtoSymbol>)newValue);
				return;
			case ProtoPackage.PUBLICATION_CLASS__PREAMBLE:
				setPreamble((DRichText)newValue);
				return;
			case ProtoPackage.PUBLICATION_CLASS__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends ProtoDocumentSegment>)newValue);
				return;
			case ProtoPackage.PUBLICATION_CLASS__DIVISIONS:
				getDivisions().clear();
				getDivisions().addAll((Collection<? extends ProtoDivision>)newValue);
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
			case ProtoPackage.PUBLICATION_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProtoPackage.PUBLICATION_CLASS__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case ProtoPackage.PUBLICATION_CLASS__SYMBOLS:
				getSymbols().clear();
				return;
			case ProtoPackage.PUBLICATION_CLASS__PREAMBLE:
				setPreamble((DRichText)null);
				return;
			case ProtoPackage.PUBLICATION_CLASS__SEGMENTS:
				getSegments().clear();
				return;
			case ProtoPackage.PUBLICATION_CLASS__DIVISIONS:
				getDivisions().clear();
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
			case ProtoPackage.PUBLICATION_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProtoPackage.PUBLICATION_CLASS__NATURE:
				return nature != NATURE_EDEFAULT;
			case ProtoPackage.PUBLICATION_CLASS__SYMBOLS:
				return symbols != null && !symbols.isEmpty();
			case ProtoPackage.PUBLICATION_CLASS__PREAMBLE:
				return preamble != null;
			case ProtoPackage.PUBLICATION_CLASS__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case ProtoPackage.PUBLICATION_CLASS__DIVISIONS:
				return divisions != null && !divisions.isEmpty();
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
		result.append(", nature: ");
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //PublicationClassImpl
