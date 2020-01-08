/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.DRichText;

import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.ReferenceTarget;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getStartNumberingAt <em>Start Numbering At</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getSubdivisions <em>Subdivisions</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DivisionImpl extends BlockContainerImpl implements Division {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartNumberingAt() <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNumberingAt()
	 * @generated
	 * @ordered
	 */
	protected static final int START_NUMBERING_AT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStartNumberingAt() <em>Start Numbering At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartNumberingAt()
	 * @generated
	 * @ordered
	 */
	protected int startNumberingAt = START_NUMBERING_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected DRichText title;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected Division include;

	/**
	 * The cached value of the '{@link #getSubdivisions() <em>Subdivisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdivisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Division> subdivisions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.DIVISION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		if (((this.getName() == null) || this.getName().isEmpty())) {
			final StringBuilder b = new StringBuilder();
			b.append(this.getSequenceNumber());
			EObject parent = this.eContainer();
			while ((parent instanceof Division)) {
				{
					b.insert(0, "-");
					b.insert(0, ((Division)parent).getSequenceNumber());
					parent = ((Division)parent).eContainer();
				}
			}
			return b.toString();
		}
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartNumberingAt() {
		return startNumberingAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartNumberingAt(int newStartNumberingAt) {
		int oldStartNumberingAt = startNumberingAt;
		startNumberingAt = newStartNumberingAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__START_NUMBERING_AT, oldStartNumberingAt, startNumberingAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRichText getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(DRichText newTitle, NotificationChain msgs) {
		DRichText oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__TITLE, oldTitle, newTitle);
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
	public void setTitle(DRichText newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubPackage.DIVISION__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubPackage.DIVISION__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division getInclude() {
		if (include != null && include.eIsProxy()) {
			InternalEObject oldInclude = (InternalEObject)include;
			include = (Division)eResolveProxy(oldInclude);
			if (include != oldInclude) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.DIVISION__INCLUDE, oldInclude, include));
			}
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division basicGetInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclude(Division newInclude) {
		Division oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Division> getSubdivisions() {
		if (subdivisions == null) {
			subdivisions = new EObjectContainmentWithInverseEList<Division>(Division.class, this, PubPackage.DIVISION__SUBDIVISIONS, PubPackage.DIVISION__PARENT);
		}
		return subdivisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division getParent() {
		if (eContainerFeatureID() != PubPackage.DIVISION__PARENT) return null;
		return (Division)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division basicGetParent() {
		if (eContainerFeatureID() != PubPackage.DIVISION__PARENT) return null;
		return (Division)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Division newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, PubPackage.DIVISION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Division newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != PubPackage.DIVISION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, PubPackage.DIVISION__SUBDIVISIONS, Division.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document getDocument() {
		EObject parent = this.eContainer();
		while (((parent != null) && (!(parent instanceof Document)))) {
			parent = parent.eContainer();
		}
		return ((Document) parent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		EObject _eContainer = this.eContainer();
		if ((_eContainer instanceof Division)) {
			int _level = this.getParent().getLevel();
			return (_level + 1);
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSequenceNumber() {
		EObject _eContainer = this.eContainer();
		if ((_eContainer instanceof Division)) {
			return this.getParent().getSubdivisions().indexOf(this);
		}
		return (-1);
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
			case PubPackage.DIVISION__SUBDIVISIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubdivisions()).basicAdd(otherEnd, msgs);
			case PubPackage.DIVISION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Division)otherEnd, msgs);
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
			case PubPackage.DIVISION__TITLE:
				return basicSetTitle(null, msgs);
			case PubPackage.DIVISION__SUBDIVISIONS:
				return ((InternalEList<?>)getSubdivisions()).basicRemove(otherEnd, msgs);
			case PubPackage.DIVISION__PARENT:
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
			case PubPackage.DIVISION__PARENT:
				return eInternalContainer().eInverseRemove(this, PubPackage.DIVISION__SUBDIVISIONS, Division.class, msgs);
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
			case PubPackage.DIVISION__NAME:
				return getName();
			case PubPackage.DIVISION__ID:
				return getId();
			case PubPackage.DIVISION__START_NUMBERING_AT:
				return getStartNumberingAt();
			case PubPackage.DIVISION__TITLE:
				return getTitle();
			case PubPackage.DIVISION__INCLUDE:
				if (resolve) return getInclude();
				return basicGetInclude();
			case PubPackage.DIVISION__SUBDIVISIONS:
				return getSubdivisions();
			case PubPackage.DIVISION__PARENT:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PubPackage.DIVISION__NAME:
				setName((String)newValue);
				return;
			case PubPackage.DIVISION__START_NUMBERING_AT:
				setStartNumberingAt((Integer)newValue);
				return;
			case PubPackage.DIVISION__TITLE:
				setTitle((DRichText)newValue);
				return;
			case PubPackage.DIVISION__INCLUDE:
				setInclude((Division)newValue);
				return;
			case PubPackage.DIVISION__SUBDIVISIONS:
				getSubdivisions().clear();
				getSubdivisions().addAll((Collection<? extends Division>)newValue);
				return;
			case PubPackage.DIVISION__PARENT:
				setParent((Division)newValue);
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
			case PubPackage.DIVISION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.DIVISION__START_NUMBERING_AT:
				setStartNumberingAt(START_NUMBERING_AT_EDEFAULT);
				return;
			case PubPackage.DIVISION__TITLE:
				setTitle((DRichText)null);
				return;
			case PubPackage.DIVISION__INCLUDE:
				setInclude((Division)null);
				return;
			case PubPackage.DIVISION__SUBDIVISIONS:
				getSubdivisions().clear();
				return;
			case PubPackage.DIVISION__PARENT:
				setParent((Division)null);
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
			case PubPackage.DIVISION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.DIVISION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case PubPackage.DIVISION__START_NUMBERING_AT:
				return startNumberingAt != START_NUMBERING_AT_EDEFAULT;
			case PubPackage.DIVISION__TITLE:
				return title != null;
			case PubPackage.DIVISION__INCLUDE:
				return include != null;
			case PubPackage.DIVISION__SUBDIVISIONS:
				return subdivisions != null && !subdivisions.isEmpty();
			case PubPackage.DIVISION__PARENT:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NumberedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (derivedFeatureID) {
				case PubPackage.DIVISION__NAME: return PubPackage.REFERENCE_TARGET__NAME;
				case PubPackage.DIVISION__ID: return PubPackage.REFERENCE_TARGET__ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NumberedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (baseFeatureID) {
				case PubPackage.REFERENCE_TARGET__NAME: return PubPackage.DIVISION__NAME;
				case PubPackage.REFERENCE_TARGET__ID: return PubPackage.DIVISION__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NumberedElement.class) {
			switch (baseOperationID) {
				case PubPackage.NUMBERED_ELEMENT___GET_LEVEL: return PubPackage.DIVISION___GET_LEVEL;
				case PubPackage.NUMBERED_ELEMENT___GET_SEQUENCE_NUMBER: return PubPackage.DIVISION___GET_SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PubPackage.DIVISION___GET_DOCUMENT:
				return getDocument();
			case PubPackage.DIVISION___GET_LEVEL:
				return getLevel();
			case PubPackage.DIVISION___GET_SEQUENCE_NUMBER:
				return getSequenceNumber();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", startNumberingAt: ");
		result.append(startNumberingAt);
		result.append(')');
		return result.toString();
	}

} //DivisionImpl
