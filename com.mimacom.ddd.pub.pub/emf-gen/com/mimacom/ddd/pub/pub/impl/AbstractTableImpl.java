/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.AbstractTable;
import com.mimacom.ddd.pub.pub.GridLines;
import com.mimacom.ddd.pub.pub.PubPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.AbstractTableImpl#getWidthPercent <em>Width Percent</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.AbstractTableImpl#getGridlines <em>Gridlines</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTableImpl extends MinimalEObjectImpl.Container implements AbstractTable {
	/**
	 * The default value of the '{@link #getWidthPercent() <em>Width Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthPercent()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_PERCENT_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getWidthPercent() <em>Width Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthPercent()
	 * @generated
	 * @ordered
	 */
	protected int widthPercent = WIDTH_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridlines() <em>Gridlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridlines()
	 * @generated
	 * @ordered
	 */
	protected static final GridLines GRIDLINES_EDEFAULT = GridLines.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getGridlines() <em>Gridlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridlines()
	 * @generated
	 * @ordered
	 */
	protected GridLines gridlines = GRIDLINES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.ABSTRACT_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidthPercent() {
		return widthPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthPercent(int newWidthPercent) {
		int oldWidthPercent = widthPercent;
		widthPercent = newWidthPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.ABSTRACT_TABLE__WIDTH_PERCENT, oldWidthPercent, widthPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridLines getGridlines() {
		return gridlines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridlines(GridLines newGridlines) {
		GridLines oldGridlines = gridlines;
		gridlines = newGridlines == null ? GRIDLINES_EDEFAULT : newGridlines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.ABSTRACT_TABLE__GRIDLINES, oldGridlines, gridlines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PubPackage.ABSTRACT_TABLE__WIDTH_PERCENT:
				return getWidthPercent();
			case PubPackage.ABSTRACT_TABLE__GRIDLINES:
				return getGridlines();
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
			case PubPackage.ABSTRACT_TABLE__WIDTH_PERCENT:
				setWidthPercent((Integer)newValue);
				return;
			case PubPackage.ABSTRACT_TABLE__GRIDLINES:
				setGridlines((GridLines)newValue);
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
			case PubPackage.ABSTRACT_TABLE__WIDTH_PERCENT:
				setWidthPercent(WIDTH_PERCENT_EDEFAULT);
				return;
			case PubPackage.ABSTRACT_TABLE__GRIDLINES:
				setGridlines(GRIDLINES_EDEFAULT);
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
			case PubPackage.ABSTRACT_TABLE__WIDTH_PERCENT:
				return widthPercent != WIDTH_PERCENT_EDEFAULT;
			case PubPackage.ABSTRACT_TABLE__GRIDLINES:
				return gridlines != GRIDLINES_EDEFAULT;
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
		result.append(" (widthPercent: ");
		result.append(widthPercent);
		result.append(", gridlines: ");
		result.append(gridlines);
		result.append(')');
		return result.toString();
	}

} //AbstractTableImpl
