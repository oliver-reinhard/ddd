/**
 */
package com.mimacom.ddd.pub.pub.impl;

import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableRow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TableImpl#getWidthPercent <em>Width Percent</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TableImpl#isHideGrid <em>Hide Grid</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.impl.TableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends TitledBlockImpl implements Table {
	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

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
	 * The default value of the '{@link #isHideGrid() <em>Hide Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideGrid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_GRID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideGrid() <em>Hide Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideGrid()
	 * @generated
	 * @ordered
	 */
	protected boolean hideGrid = HIDE_GRID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<TableRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PubPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TABLE__COLUMNS, oldColumns, columns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TABLE__WIDTH_PERCENT, oldWidthPercent, widthPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideGrid() {
		return hideGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideGrid(boolean newHideGrid) {
		boolean oldHideGrid = hideGrid;
		hideGrid = newHideGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PubPackage.TABLE__HIDE_GRID, oldHideGrid, hideGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<TableRow>(TableRow.class, this, PubPackage.TABLE__ROWS, PubPackage.TABLE_ROW__TABLE);
		}
		return rows;
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
			case PubPackage.TABLE__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
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
			case PubPackage.TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case PubPackage.TABLE__COLUMNS:
				return getColumns();
			case PubPackage.TABLE__WIDTH_PERCENT:
				return getWidthPercent();
			case PubPackage.TABLE__HIDE_GRID:
				return isHideGrid();
			case PubPackage.TABLE__ROWS:
				return getRows();
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
			case PubPackage.TABLE__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case PubPackage.TABLE__WIDTH_PERCENT:
				setWidthPercent((Integer)newValue);
				return;
			case PubPackage.TABLE__HIDE_GRID:
				setHideGrid((Boolean)newValue);
				return;
			case PubPackage.TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends TableRow>)newValue);
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
			case PubPackage.TABLE__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case PubPackage.TABLE__WIDTH_PERCENT:
				setWidthPercent(WIDTH_PERCENT_EDEFAULT);
				return;
			case PubPackage.TABLE__HIDE_GRID:
				setHideGrid(HIDE_GRID_EDEFAULT);
				return;
			case PubPackage.TABLE__ROWS:
				getRows().clear();
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
			case PubPackage.TABLE__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case PubPackage.TABLE__WIDTH_PERCENT:
				return widthPercent != WIDTH_PERCENT_EDEFAULT;
			case PubPackage.TABLE__HIDE_GRID:
				return hideGrid != HIDE_GRID_EDEFAULT;
			case PubPackage.TABLE__ROWS:
				return rows != null && !rows.isEmpty();
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
		result.append(" (columns: ");
		result.append(columns);
		result.append(", widthPercent: ");
		result.append(widthPercent);
		result.append(", hideGrid: ");
		result.append(hideGrid);
		result.append(')');
		return result.toString();
	}

} //TableImpl
