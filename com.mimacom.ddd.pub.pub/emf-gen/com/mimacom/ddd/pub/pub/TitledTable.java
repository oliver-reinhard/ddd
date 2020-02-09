/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledTable#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledTable()
 * @model
 * @generated
 */
public interface TitledTable extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(AbstractTable)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledTable_Table()
	 * @model containment="true"
	 * @generated
	 */
	AbstractTable getTable();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledTable#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(AbstractTable value);

} // TitledTable
