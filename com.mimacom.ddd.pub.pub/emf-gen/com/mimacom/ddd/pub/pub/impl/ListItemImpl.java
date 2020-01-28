/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.dm.base.DRichText;

import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.NumberedElement;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.ReferenceTarget;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListItemImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListItemImpl extends BlockContainerImpl implements ListItem {
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
	protected ListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.LIST_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel_() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST_ITEM__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber_() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumber(int newSequenceNumber) {
		int oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST_ITEM__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PubPackage.LIST_ITEM__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(DRichText newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PubPackage.LIST_ITEM__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PubPackage.LIST_ITEM__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST_ITEM__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		if (eContainerFeatureID() != PubPackage.LIST_ITEM__LIST) return null;
		return (List)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List basicGetList() {
		if (eContainerFeatureID() != PubPackage.LIST_ITEM__LIST) return null;
		return (List)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newList, PubPackage.LIST_ITEM__LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		if (newList != eInternalContainer() || (eContainerFeatureID() != PubPackage.LIST_ITEM__LIST && newList != null)) {
			if (EcoreUtil.isAncestor(this, newList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, PubPackage.LIST__ITEMS, List.class, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST_ITEM__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		EObject _eContainer = this.eContainer();
		if ((_eContainer instanceof List)) {
			return this.getList().getLevel();
		}
		return PubConstants.UNDEFINED_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumber() {
		return this.getList().getItems().indexOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PubPackage.LIST_ITEM__LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetList((List)otherEnd, msgs);
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
			case PubPackage.LIST_ITEM__TITLE:
				return basicSetTitle(null, msgs);
			case PubPackage.LIST_ITEM__LIST:
				return basicSetList(null, msgs);
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
			case PubPackage.LIST_ITEM__LIST:
				return eInternalContainer().eInverseRemove(this, PubPackage.LIST__ITEMS, List.class, msgs);
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
			case PubPackage.LIST_ITEM__LEVEL:
				return getLevel();
			case PubPackage.LIST_ITEM__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case PubPackage.LIST_ITEM__NAME:
				return getName();
			case PubPackage.LIST_ITEM__ID:
				return getId();
			case PubPackage.LIST_ITEM__TITLE:
				return getTitle();
			case PubPackage.LIST_ITEM__LIST:
				if (resolve) return getList();
				return basicGetList();
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
			case PubPackage.LIST_ITEM__LEVEL:
				setLevel((Integer)newValue);
				return;
			case PubPackage.LIST_ITEM__SEQUENCE_NUMBER:
				setSequenceNumber((Integer)newValue);
				return;
			case PubPackage.LIST_ITEM__NAME:
				setName((String)newValue);
				return;
			case PubPackage.LIST_ITEM__TITLE:
				setTitle((DRichText)newValue);
				return;
			case PubPackage.LIST_ITEM__LIST:
				setList((List)newValue);
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
			case PubPackage.LIST_ITEM__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case PubPackage.LIST_ITEM__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case PubPackage.LIST_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.LIST_ITEM__TITLE:
				setTitle((DRichText)null);
				return;
			case PubPackage.LIST_ITEM__LIST:
				setList((List)null);
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
			case PubPackage.LIST_ITEM__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PubPackage.LIST_ITEM__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case PubPackage.LIST_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.LIST_ITEM__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case PubPackage.LIST_ITEM__TITLE:
				return title != null;
			case PubPackage.LIST_ITEM__LIST:
				return basicGetList() != null;
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
				case PubPackage.LIST_ITEM__LEVEL: return PubPackage.NUMBERED_ELEMENT__LEVEL;
				case PubPackage.LIST_ITEM__SEQUENCE_NUMBER: return PubPackage.NUMBERED_ELEMENT__SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (derivedFeatureID) {
				case PubPackage.LIST_ITEM__NAME: return PubPackage.REFERENCE_TARGET__NAME;
				case PubPackage.LIST_ITEM__ID: return PubPackage.REFERENCE_TARGET__ID;
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
				case PubPackage.NUMBERED_ELEMENT__LEVEL: return PubPackage.LIST_ITEM__LEVEL;
				case PubPackage.NUMBERED_ELEMENT__SEQUENCE_NUMBER: return PubPackage.LIST_ITEM__SEQUENCE_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == ReferenceTarget.class) {
			switch (baseFeatureID) {
				case PubPackage.REFERENCE_TARGET__NAME: return PubPackage.LIST_ITEM__NAME;
				case PubPackage.REFERENCE_TARGET__ID: return PubPackage.LIST_ITEM__ID;
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
			case PubPackage.LIST_ITEM___GET_LEVEL:
				return getLevel();
			case PubPackage.LIST_ITEM___GET_SEQUENCE_NUMBER:
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
		result.append(" (level: ");
		result.append(level);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ListItemImpl
