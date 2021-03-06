/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.ListItem#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.ListItem#getList <em>List</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends BlockContainer, Numbered, ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getListItem_Title()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ListItem#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(DRichText value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.List2#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' container reference.
	 * @see #setList(List2)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getListItem_List()
	 * @see com.mimacom.ddd.pub.pub.List2#getItems
	 * @model opposite="items" transient="false"
	 * @generated
	 */
	List2 getList();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ListItem#getList <em>List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' container reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List2 value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getSequenceNumber();

} // ListItem
