/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich Text Referencing Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Internal, not referenced by PUB grammar.
 * 
 * Used to by table providers to reference DRichText elements of models instead of
 * 	- copying the full DRichText structure (which creates challenges in resolving cross-references) or
 * 	- changing the DRichText element's eContainer (which causes problems for the former eContainer)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.RichTextReferencingParagraph#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getRichTextReferencingParagraph()
 * @model
 * @generated
 */
public interface RichTextReferencingParagraph extends ContentBlock {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getRichTextReferencingParagraph_Text()
	 * @model
	 * @generated
	 */
	DRichText getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.RichTextReferencingParagraph#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DRichText value);

} // RichTextReferencingParagraph
