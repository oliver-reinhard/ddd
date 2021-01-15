/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.List2#getStyle <em>Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.List2#getNumberingStyle <em>Numbering Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.List2#getLevel <em>Level</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.List2#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getList2()
 * @model
 * @generated
 */
public interface List2 extends ContentBlock, ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.ListStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ListStyle
	 * @see #setStyle(ListStyle)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getList2_Style()
	 * @model unique="false"
	 * @generated
	 */
	ListStyle getStyle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.List2#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ListStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ListStyle value);

	/**
	 * Returns the value of the '<em><b>Numbering Style</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbering Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
	 * @see #setNumberingStyle(ProtoSequenceNumberStyle)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getList2_NumberingStyle()
	 * @model unique="false"
	 * @generated
	 */
	ProtoSequenceNumberStyle getNumberingStyle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.List2#getNumberingStyle <em>Numbering Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbering Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
	 * @see #getNumberingStyle()
	 * @generated
	 */
	void setNumberingStyle(ProtoSequenceNumberStyle value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getList2_Level()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.ListItem}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.ListItem#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getList2_Items()
	 * @see com.mimacom.ddd.pub.pub.ListItem#getList
	 * @model opposite="list" containment="true"
	 * @generated
	 */
	EList<ListItem> getItems();

} // List2
