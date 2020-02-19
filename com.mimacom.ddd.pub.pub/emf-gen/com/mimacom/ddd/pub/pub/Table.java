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
 *   <li>{@link com.mimacom.ddd.pub.pub.Table#getRows <em>Rows</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Table#getGridlines <em>Gridlines</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends AbstractTable {
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

	/**
	 * Returns the value of the '<em><b>Gridlines</b></em>' attribute.
	 * The default value is <code>"HORIZONTAL"</code>.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.GridLines}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridlines</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.GridLines
	 * @see #setGridlines(GridLines)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTable_Gridlines()
	 * @model default="HORIZONTAL" unique="false"
	 * @generated
	 */
	GridLines getGridlines();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Table#getGridlines <em>Gridlines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridlines</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.GridLines
	 * @see #getGridlines()
	 * @generated
	 */
	void setGridlines(GridLines value);

} // Table
