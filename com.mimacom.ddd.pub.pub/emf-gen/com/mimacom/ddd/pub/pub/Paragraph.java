/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Paragraph#getStyle <em>Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Paragraph#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends ContentBlock {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.ParagraphStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ParagraphStyle
	 * @see #setStyle(ParagraphStyle)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getParagraph_Style()
	 * @model unique="false"
	 * @generated
	 */
	ParagraphStyle getStyle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Paragraph#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ParagraphStyle
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(ParagraphStyle value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getParagraph_Text()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Paragraph#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DRichText value);

} // Paragraph
