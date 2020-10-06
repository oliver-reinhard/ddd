/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.DRichText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admonition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Admonition#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Admonition#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getAdmonition()
 * @model
 * @generated
 */
public interface Admonition extends ContentBlock, BlockContainer, ReferenceTarget {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.AdmonitionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.AdmonitionKind
	 * @see #setKind(AdmonitionKind)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAdmonition_Kind()
	 * @model unique="false"
	 * @generated
	 */
	AdmonitionKind getKind();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Admonition#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.AdmonitionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AdmonitionKind value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(DRichText)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAdmonition_Title()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getTitle();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Admonition#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(DRichText value);

} // Admonition
