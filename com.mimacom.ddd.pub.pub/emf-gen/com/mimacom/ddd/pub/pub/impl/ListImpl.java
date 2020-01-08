/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.pub.Division;
import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.ListStyle;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.ReferenceTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListImpl#getNumberingStyle <em>Numbering Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.ListImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListImpl extends ContentBlockImpl implements List {
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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ListStyle STYLE_EDEFAULT = ListStyle.BULLET;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected ListStyle style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberingStyle() <em>Numbering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final ProtoSequenceNumberStyle NUMBERING_STYLE_EDEFAULT = ProtoSequenceNumberStyle.ARABIC;

	/**
	 * The cached value of the '{@link #getNumberingStyle() <em>Numbering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberingStyle()
	 * @generated
	 * @ordered
	 */
	protected ProtoSequenceNumberStyle numberingStyle = NUMBERING_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST__NAME, oldName, name));
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
	public ListStyle getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(ListStyle newStyle) {
		ListStyle oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtoSequenceNumberStyle getNumberingStyle() {
		return numberingStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberingStyle(ProtoSequenceNumberStyle newNumberingStyle) {
		ProtoSequenceNumberStyle oldNumberingStyle = numberingStyle;
		numberingStyle = newNumberingStyle == null ? NUMBERING_STYLE_EDEFAULT : newNumberingStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.LIST__NUMBERING_STYLE, oldNumberingStyle, numberingStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLevel() {
		int i = 0;
		EObject parent = this.eContainer();
		while (((parent != null) && (!(parent instanceof Division)))) {
			{
				EObject _eContainer = this.eContainer();
				if ((_eContainer instanceof List)) {
					i++;
				}
				parent = parent.eContainer();
			}
		}
		return i;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ListItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<ListItem>(ListItem.class, this, PubPackage.LIST__ITEMS, PubPackage.LIST_ITEM__LIST);
		}
		return items;
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
			case PubPackage.LIST__ITEMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItems()).basicAdd(otherEnd, msgs);
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
			case PubPackage.LIST__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case PubPackage.LIST__NAME:
				return getName();
			case PubPackage.LIST__ID:
				return getId();
			case PubPackage.LIST__STYLE:
				return getStyle();
			case PubPackage.LIST__NUMBERING_STYLE:
				return getNumberingStyle();
			case PubPackage.LIST__LEVEL:
				return getLevel();
			case PubPackage.LIST__ITEMS:
				return getItems();
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
			case PubPackage.LIST__NAME:
				setName((String)newValue);
				return;
			case PubPackage.LIST__STYLE:
				setStyle((ListStyle)newValue);
				return;
			case PubPackage.LIST__NUMBERING_STYLE:
				setNumberingStyle((ProtoSequenceNumberStyle)newValue);
				return;
			case PubPackage.LIST__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ListItem>)newValue);
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
			case PubPackage.LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PubPackage.LIST__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case PubPackage.LIST__NUMBERING_STYLE:
				setNumberingStyle(NUMBERING_STYLE_EDEFAULT);
				return;
			case PubPackage.LIST__ITEMS:
				getItems().clear();
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
			case PubPackage.LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PubPackage.LIST__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case PubPackage.LIST__STYLE:
				return style != STYLE_EDEFAULT;
			case PubPackage.LIST__NUMBERING_STYLE:
				return numberingStyle != NUMBERING_STYLE_EDEFAULT;
			case PubPackage.LIST__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case PubPackage.LIST__ITEMS:
				return items != null && !items.isEmpty();
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
				case PubPackage.LIST__NAME: return PubPackage.REFERENCE_TARGET__NAME;
				case PubPackage.LIST__ID: return PubPackage.REFERENCE_TARGET__ID;
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
				case PubPackage.REFERENCE_TARGET__NAME: return PubPackage.LIST__NAME;
				case PubPackage.REFERENCE_TARGET__ID: return PubPackage.LIST__ID;
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
		result.append(", style: ");
		result.append(style);
		result.append(", numberingStyle: ");
		result.append(numberingStyle);
		result.append(')');
		return result.toString();
	}

} //ListImpl
