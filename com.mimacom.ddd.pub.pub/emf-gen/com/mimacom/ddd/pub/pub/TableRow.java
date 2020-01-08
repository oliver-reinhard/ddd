/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableRow#getHeight <em>Height</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableRow#isIsHeading <em>Is Heading</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableRow#getCells <em>Cells</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TableRow#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableRow_Height()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TableRow#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Is Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Heading</em>' attribute.
	 * @see #setIsHeading(boolean)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableRow_IsHeading()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsHeading();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TableRow#isIsHeading <em>Is Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Heading</em>' attribute.
	 * @see #isIsHeading()
	 * @generated
	 */
	void setIsHeading(boolean value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.TableCell}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.TableCell#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableRow_Cells()
	 * @see com.mimacom.ddd.pub.pub.TableCell#getRow
	 * @model opposite="row" containment="true"
	 * @generated
	 */
	EList<TableCell> getCells();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.Table#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTableRow_Table()
	 * @see com.mimacom.ddd.pub.pub.Table#getRows
	 * @model opposite="rows" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TableRow#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // TableRow
