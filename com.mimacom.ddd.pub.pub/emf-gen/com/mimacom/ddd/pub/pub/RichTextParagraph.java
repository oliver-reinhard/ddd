/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich Text Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.RichTextParagraph#getStyle <em>Style</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.RichTextParagraph#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getRichTextParagraph()
 * @model
 * @generated
 */
public interface RichTextParagraph extends Paragraph {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.ParagraphStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ParagraphStyle
	 * @see #setStyle(ParagraphStyle)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getRichTextParagraph_Style()
	 * @model unique="false"
	 * @generated
	 */
	ParagraphStyle getStyle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.RichTextParagraph#getStyle <em>Style</em>}' attribute.
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
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getRichTextParagraph_Text()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.RichTextParagraph#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DRichText value);

} // RichTextParagraph
