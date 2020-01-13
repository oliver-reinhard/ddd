/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Titled Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledBlock#getTitle <em>Title</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledBlock#getLogicalContainer <em>Logical Container</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.TitledBlock#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledBlock()
 * @model abstract="true"
 * @generated
 */
public interface TitledBlock extends ContentBlock, NumberedElement, ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledBlock_Title()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledBlock#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(DRichText value);

	/**
	 * Returns the value of the '<em><b>Logical Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Container</em>' reference.
	 * @see #setLogicalContainer(Chapter)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledBlock_LogicalContainer()
	 * @model transient="true"
	 * @generated
	 */
	Chapter getLogicalContainer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledBlock#getLogicalContainer <em>Logical Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Container</em>' reference.
	 * @see #getLogicalContainer()
	 * @generated
	 */
	void setLogicalContainer(Chapter value);

	/**
	 * Returns the value of the '<em><b>Sequence Number In Chapter</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number In Chapter</em>' attribute.
	 * @see #setSequenceNumberInChapter(int)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getTitledBlock_SequenceNumberInChapter()
	 * @model default="-1" unique="false" transient="true"
	 * @generated
	 */
	int getSequenceNumberInChapter();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.TitledBlock#getSequenceNumberInChapter <em>Sequence Number In Chapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number In Chapter</em>' attribute.
	 * @see #getSequenceNumberInChapter()
	 * @generated
	 */
	void setSequenceNumberInChapter(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Division parent();

} // TitledBlock
