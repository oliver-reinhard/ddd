/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.base.DRichText;

import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Footnote;
import com.mimacom.ddd.pub.pub.Numbered;
import com.mimacom.ddd.pub.pub.NumberedByChapter;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.ReferenceTarget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Footnote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getLogicalContainer <em>Logical Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.FootnoteImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FootnoteImpl extends ContentBlockImpl implements Footnote {
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
	 * The cached value of the '{@link #getLogicalContainer() <em>Logical Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalContainer()
	 * @generated
	 * @ordered
	 */
	protected Chapter logicalContainer;

	/**
	 * The default value of the '{@link #getSequenceNumberInChapter() <em>Sequence Number In Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumberInChapter()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUMBER_IN_CHAPTER_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSequenceNumberInChapter() <em>Sequence Number In Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumberInChapter()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumberInChapter = SEQUENCE_NUMBER_IN_CHAPTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected DRichText text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FootnoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.FOOTNOTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return this.getName();
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Chapter getLogicalContainer() {
		if (logicalContainer != null && logicalContainer.eIsProxy()) {
			InternalEObject oldLogicalContainer = (InternalEObject)logicalContainer;
			logicalContainer = (Chapter)eResolveProxy(oldLogicalContainer);
			if (logicalContainer != oldLogicalContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.FOOTNOTE__LOGICAL_CONTAINER, oldLogicalContainer, logicalContainer));
			}
		}
		return logicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chapter basicGetLogicalContainer() {
		return logicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalContainer(Chapter newLogicalContainer) {
		Chapter oldLogicalContainer = logicalContainer;
		logicalContainer = newLogicalContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__LOGICAL_CONTAINER, oldLogicalContainer, logicalContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSequenceNumberInChapter() {
		return sequenceNumberInChapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumberInChapter(int newSequenceNumberInChapter) {
		int oldSequenceNumberInChapter = sequenceNumberInChapter;
		sequenceNumberInChapter = newSequenceNumberInChapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER, oldSequenceNumberInChapter, sequenceNumberInChapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRichText getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(DRichText newText, NotificationChain msgs) {
		DRichText oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__TEXT, oldText, newText);
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
	public void setText(DRichText newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubPackage.FOOTNOTE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubPackage.FOOTNOTE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.FOOTNOTE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubPackage.FOOTNOTE__TEXT:
				return basicSetText(null, msgs);
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
			case PubPackage.FOOTNOTE__NAME:
				return getName();
			case PubPackage.FOOTNOTE__ID:
				return getId();
			case PubPackage.FOOTNOTE__LEVEL:
				return getLevel();
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case PubPackage.FOOTNOTE__LOGICAL_CONTAINER:
				if (resolve) return getLogicalContainer();
				return basicGetLogicalContainer();
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER:
				return getSequenceNumberInChapter();
			case PubPackage.FOOTNOTE__TEXT:
				return getText();
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
			case PubPackage.FOOTNOTE__NAME:
				setName((String)newValue);
				return;
			case PubPackage.FOOTNOTE__LEVEL:
				setLevel((Integer)newValue);
				return;
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case PubPackage.FOOTNOTE__LOGICAL_CONTAINER:
				setLogicalContainer((Chapter)newValue);
				return;
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER:
				setSequenceNumberInChapter((Integer)newValue);
				return;
			case PubPackage.FOOTNOTE__TEXT:
				setText((DRichText)newValue);
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
			case PubPackage.FOOTNOTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.FOOTNOTE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case PubPackage.FOOTNOTE__LOGICAL_CONTAINER:
				setLogicalContainer((Chapter)null);
				return;
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER:
				setSequenceNumberInChapter(SEQUENCE_NUMBER_IN_CHAPTER_EDEFAULT);
				return;
			case PubPackage.FOOTNOTE__TEXT:
				setText((DRichText)null);
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
			case PubPackage.FOOTNOTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.FOOTNOTE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case PubPackage.FOOTNOTE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case PubPackage.FOOTNOTE__LOGICAL_CONTAINER:
				return logicalContainer != null;
			case PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER:
				return sequenceNumberInChapter != SEQUENCE_NUMBER_IN_CHAPTER_EDEFAULT;
			case PubPackage.FOOTNOTE__TEXT:
				return text != null;
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
		if (baseClass == ReferenceTarget.class) {
			switch (derivedFeatureID) {
				case PubPackage.FOOTNOTE__NAME: return PubPackage.REFERENCE_TARGET__NAME;
				case PubPackage.FOOTNOTE__ID: return PubPackage.REFERENCE_TARGET__ID;
				default: return -1;
			}
		}
		if (baseClass == Numbered.class) {
			switch (derivedFeatureID) {
				case PubPackage.FOOTNOTE__LEVEL: return PubPackage.NUMBERED__LEVEL;
				case PubPackage.FOOTNOTE__SEQUENCE_NUMBER: return PubPackage.NUMBERED__SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == NumberedByChapter.class) {
			switch (derivedFeatureID) {
				case PubPackage.FOOTNOTE__LOGICAL_CONTAINER: return PubPackage.NUMBERED_BY_CHAPTER__LOGICAL_CONTAINER;
				case PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER: return PubPackage.NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER_IN_CHAPTER;
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
		if (baseClass == ReferenceTarget.class) {
			switch (baseFeatureID) {
				case PubPackage.REFERENCE_TARGET__NAME: return PubPackage.FOOTNOTE__NAME;
				case PubPackage.REFERENCE_TARGET__ID: return PubPackage.FOOTNOTE__ID;
				default: return -1;
			}
		}
		if (baseClass == Numbered.class) {
			switch (baseFeatureID) {
				case PubPackage.NUMBERED__LEVEL: return PubPackage.FOOTNOTE__LEVEL;
				case PubPackage.NUMBERED__SEQUENCE_NUMBER: return PubPackage.FOOTNOTE__SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == NumberedByChapter.class) {
			switch (baseFeatureID) {
				case PubPackage.NUMBERED_BY_CHAPTER__LOGICAL_CONTAINER: return PubPackage.FOOTNOTE__LOGICAL_CONTAINER;
				case PubPackage.NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER_IN_CHAPTER: return PubPackage.FOOTNOTE__SEQUENCE_NUMBER_IN_CHAPTER;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", level: ");
		result.append(level);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", sequenceNumberInChapter: ");
		result.append(sequenceNumberInChapter);
		result.append(')');
		return result.toString();
	}

} //FootnoteImpl
