/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Footnote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Footnote#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getFootnote()
 * @model
 * @generated
 */
public interface Footnote extends ContentBlock, ReferenceTarget, NumberedByChapter {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getFootnote_Text()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Footnote#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DRichText value);

} // Footnote
