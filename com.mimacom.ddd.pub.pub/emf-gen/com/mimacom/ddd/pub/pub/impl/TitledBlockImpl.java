/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.base.DRichText;

import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.Numbered;
import com.mimacom.ddd.pub.pub.NumberedByChapter;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.ReferenceTarget;
import com.mimacom.ddd.pub.pub.TitledBlock;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Titled Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getLogicalContainer <em>Logical Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TitledBlockImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TitledBlockImpl extends ContentBlockImpl implements TitledBlock {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected DRichText title;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TitledBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.TITLED_BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER, oldLogicalContainer, logicalContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER, oldLogicalContainer, logicalContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER, oldSequenceNumberInChapter, sequenceNumberInChapter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		if (((this.getName() == null) || this.getName().isEmpty())) {
			final String blockType = this.getClass().getSimpleName().replace("Titled", "").replace("Impl", "").toLowerCase();
			int _sequenceNumber = this.getSequenceNumber();
			boolean _notEquals = (_sequenceNumber != (-1));
			if (_notEquals) {
				int _sequenceNumber_1 = this.getSequenceNumber();
				return ((blockType + "-") + Integer.valueOf(_sequenceNumber_1));
			}
			int _hashCode = this.hashCode();
			return ((blockType + "-") + Integer.valueOf(_hashCode));
		}
		return this.getName();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubPackage.TITLED_BLOCK__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubPackage.TITLED_BLOCK__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TITLED_BLOCK__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division parent() {
		Chapter _logicalContainer = this.getLogicalContainer();
		boolean _tripleNotEquals = (_logicalContainer != null);
		if (_tripleNotEquals) {
			return this.getLogicalContainer();
		}
		EObject p = this.eContainer();
		while (((p != null) && (!(p instanceof Division)))) {
			p = p.eContainer();
		}
		EObject _eContainer = this.eContainer();
		return ((Division) _eContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubPackage.TITLED_BLOCK__TITLE:
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
			case PubPackage.TITLED_BLOCK__LEVEL:
				return getLevel();
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER:
				if (resolve) return getLogicalContainer();
				return basicGetLogicalContainer();
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER:
				return getSequenceNumberInChapter();
			case PubPackage.TITLED_BLOCK__NAME:
				return getName();
			case PubPackage.TITLED_BLOCK__ID:
				return getId();
			case PubPackage.TITLED_BLOCK__TITLE:
				return getTitle();
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
			case PubPackage.TITLED_BLOCK__LEVEL:
				setLevel((Integer)newValue);
				return;
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER:
				setLogicalContainer((Chapter)newValue);
				return;
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER:
				setSequenceNumberInChapter((Integer)newValue);
				return;
			case PubPackage.TITLED_BLOCK__NAME:
				setName((String)newValue);
				return;
			case PubPackage.TITLED_BLOCK__TITLE:
				setTitle((DRichText)newValue);
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
			case PubPackage.TITLED_BLOCK__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER:
				setLogicalContainer((Chapter)null);
				return;
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER:
				setSequenceNumberInChapter(SEQUENCE_NUMBER_IN_CHAPTER_EDEFAULT);
				return;
			case PubPackage.TITLED_BLOCK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.TITLED_BLOCK__TITLE:
				setTitle((DRichText)null);
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
			case PubPackage.TITLED_BLOCK__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER:
				return logicalContainer != null;
			case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER:
				return sequenceNumberInChapter != SEQUENCE_NUMBER_IN_CHAPTER_EDEFAULT;
			case PubPackage.TITLED_BLOCK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.TITLED_BLOCK__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case PubPackage.TITLED_BLOCK__TITLE:
				return title != null;
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
		if (baseClass == Numbered.class) {
			switch (derivedFeatureID) {
				case PubPackage.TITLED_BLOCK__LEVEL: return PubPackage.NUMBERED__LEVEL;
				case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER: return PubPackage.NUMBERED__SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == NumberedByChapter.class) {
			switch (derivedFeatureID) {
				case PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER: return PubPackage.NUMBERED_BY_CHAPTER__LOGICAL_CONTAINER;
				case PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER: return PubPackage.NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER_IN_CHAPTER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (derivedFeatureID) {
				case PubPackage.TITLED_BLOCK__NAME: return PubPackage.REFERENCE_TARGET__NAME;
				case PubPackage.TITLED_BLOCK__ID: return PubPackage.REFERENCE_TARGET__ID;
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
		if (baseClass == Numbered.class) {
			switch (baseFeatureID) {
				case PubPackage.NUMBERED__LEVEL: return PubPackage.TITLED_BLOCK__LEVEL;
				case PubPackage.NUMBERED__SEQUENCE_NUMBER: return PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == NumberedByChapter.class) {
			switch (baseFeatureID) {
				case PubPackage.NUMBERED_BY_CHAPTER__LOGICAL_CONTAINER: return PubPackage.TITLED_BLOCK__LOGICAL_CONTAINER;
				case PubPackage.NUMBERED_BY_CHAPTER__SEQUENCE_NUMBER_IN_CHAPTER: return PubPackage.TITLED_BLOCK__SEQUENCE_NUMBER_IN_CHAPTER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (baseFeatureID) {
				case PubPackage.REFERENCE_TARGET__NAME: return PubPackage.TITLED_BLOCK__NAME;
				case PubPackage.REFERENCE_TARGET__ID: return PubPackage.TITLED_BLOCK__ID;
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
			case PubPackage.TITLED_BLOCK___PARENT:
				return parent();
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
		result.append(", sequenceNumberInChapter: ");
		result.append(sequenceNumberInChapter);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TitledBlockImpl
