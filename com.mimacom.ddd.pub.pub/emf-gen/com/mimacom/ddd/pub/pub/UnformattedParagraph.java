/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unformatted Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.UnformattedParagraph#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getUnformattedParagraph()
 * @model
 * @generated
 */
public interface UnformattedParagraph extends ContentBlock {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getUnformattedParagraph_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.UnformattedParagraph#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // UnformattedParagraph
