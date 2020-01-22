/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Table#getWidthPercent <em>Width Percent</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Table#isHideGrid <em>Hide Grid</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Table#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable_Columns()
	 * @model unique="false"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Table#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Width Percent</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Percent</em>' attribute.
	 * @see #setWidthPercent(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable_WidthPercent()
	 * @model default="100" unique="false"
	 * @generated
	 */
	int getWidthPercent();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Table#getWidthPercent <em>Width Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Percent</em>' attribute.
	 * @see #getWidthPercent()
	 * @generated
	 */
	void setWidthPercent(int value);

	/**
	 * Returns the value of the '<em><b>Hide Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Grid</em>' attribute.
	 * @see #setHideGrid(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable_HideGrid()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHideGrid();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Table#isHideGrid <em>Hide Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Grid</em>' attribute.
	 * @see #isHideGrid()
	 * @generated
	 */
	void setHideGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.TableRow}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.TableRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable_Rows()
	 * @see com.mimacom.ddd.pub.pub.TableRow#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<TableRow> getRows();

} // Table
