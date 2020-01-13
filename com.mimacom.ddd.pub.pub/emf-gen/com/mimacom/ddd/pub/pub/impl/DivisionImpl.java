/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.DRichText;

import com.mimacom.ddd.pub.pub.BlockContainer;
import com.mimacom.ddd.pub.pub.ContentBlock;
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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getDivisions <em>Divisions</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getStartNumberingAt <em>Start Numbering At</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.DivisionImpl#getLogicalContainer <em>Logical Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DivisionImpl extends MinimalEObjectImpl.Container implements Division {
	/**
	 * The cached value of the '{@link #getDivisions() <em>Divisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Division> divisions;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentBlock> contents;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getLogicalContainer() <em>Logical Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalContainer()
	 * @generated
	 * @ordered
	 */
	protected Division logicalContainer;

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
	public EList<Division> getDivisions() {
		if (divisions == null) {
			divisions = new EObjectContainmentEList<Division>(Division.class, this, PubPackage.DIVISION__DIVISIONS);
		}
		return divisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division parent() {
		Division _logicalContainer = this.getLogicalContainer();
		boolean _tripleNotEquals = (_logicalContainer != null);
		if (_tripleNotEquals) {
			return this.getLogicalContainer();
		}
		else {
			EObject _eContainer = this.eContainer();
			if ((_eContainer instanceof Division)) {
				EObject _eContainer_1 = this.eContainer();
				return ((Division) _eContainer_1);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentBlock> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<ContentBlock>(ContentBlock.class, this, PubPackage.DIVISION__CONTENTS);
		}
		return contents;
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
			Division p = this.parent();
			while ((p != null)) {
				{
					b.insert(0, "-");
					b.insert(0, p.getSequenceNumber());
					p = p.parent();
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
	public Division getLogicalContainer() {
		if (logicalContainer != null && logicalContainer.eIsProxy()) {
			InternalEObject oldLogicalContainer = (InternalEObject)logicalContainer;
			logicalContainer = (Division)eResolveProxy(oldLogicalContainer);
			if (logicalContainer != oldLogicalContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.DIVISION__LOGICAL_CONTAINER, oldLogicalContainer, logicalContainer));
			}
		}
		return logicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Division basicGetLogicalContainer() {
		return logicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalContainer(Division newLogicalContainer) {
		Division oldLogicalContainer = logicalContainer;
		logicalContainer = newLogicalContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__LOGICAL_CONTAINER, oldLogicalContainer, logicalContainer));
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
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.DIVISION__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubPackage.DIVISION__DIVISIONS:
				return ((InternalEList<?>)getDivisions()).basicRemove(otherEnd, msgs);
			case PubPackage.DIVISION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case PubPackage.DIVISION__TITLE:
				return basicSetTitle(null, msgs);
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
			case PubPackage.DIVISION__DIVISIONS:
				return getDivisions();
			case PubPackage.DIVISION__CONTENTS:
				return getContents();
			case PubPackage.DIVISION__LEVEL:
				return getLevel();
			case PubPackage.DIVISION__SEQUENCE_NUMBER:
				return getSequenceNumber();
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
			case PubPackage.DIVISION__LOGICAL_CONTAINER:
				if (resolve) return getLogicalContainer();
				return basicGetLogicalContainer();
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
			case PubPackage.DIVISION__DIVISIONS:
				getDivisions().clear();
				getDivisions().addAll((Collection<? extends Division>)newValue);
				return;
			case PubPackage.DIVISION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends ContentBlock>)newValue);
				return;
			case PubPackage.DIVISION__LEVEL:
				setLevel((Integer)newValue);
				return;
			case PubPackage.DIVISION__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
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
			case PubPackage.DIVISION__LOGICAL_CONTAINER:
				setLogicalContainer((Division)newValue);
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
			case PubPackage.DIVISION__DIVISIONS:
				getDivisions().clear();
				return;
			case PubPackage.DIVISION__CONTENTS:
				getContents().clear();
				return;
			case PubPackage.DIVISION__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case PubPackage.DIVISION__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
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
			case PubPackage.DIVISION__LOGICAL_CONTAINER:
				setLogicalContainer((Division)null);
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
			case PubPackage.DIVISION__DIVISIONS:
				return divisions != null && !divisions.isEmpty();
			case PubPackage.DIVISION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case PubPackage.DIVISION__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PubPackage.DIVISION__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
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
			case PubPackage.DIVISION__LOGICAL_CONTAINER:
				return logicalContainer != null;
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
		if (baseClass == BlockContainer.class) {
			switch (derivedFeatureID) {
				case PubPackage.DIVISION__CONTENTS: return PubPackage.BLOCK_CONTAINER__CONTENTS;
				default: return -1;
			}
		}
		if (baseClass == NumberedElement.class) {
			switch (derivedFeatureID) {
				case PubPackage.DIVISION__LEVEL: return PubPackage.NUMBERED_ELEMENT__LEVEL;
				case PubPackage.DIVISION__SEQUENCE_NUMBER: return PubPackage.NUMBERED_ELEMENT__SEQUENCE_NUMBER;
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
		if (baseClass == BlockContainer.class) {
			switch (baseFeatureID) {
				case PubPackage.BLOCK_CONTAINER__CONTENTS: return PubPackage.DIVISION__CONTENTS;
				default: return -1;
			}
		}
		if (baseClass == NumberedElement.class) {
			switch (baseFeatureID) {
				case PubPackage.NUMBERED_ELEMENT__LEVEL: return PubPackage.DIVISION__LEVEL;
				case PubPackage.NUMBERED_ELEMENT__SEQUENCE_NUMBER: return PubPackage.DIVISION__SEQUENCE_NUMBER;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PubPackage.DIVISION___PARENT:
				return parent();
			case PubPackage.DIVISION___GET_DOCUMENT:
				return getDocument();
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
		result.append(" (level: ");
		result.append(level);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", name: ");
		result.append(name);
		result.append(", startNumberingAt: ");
		result.append(startNumberingAt);
		result.append(')');
		return result.toString();
	}

} //DivisionImpl
