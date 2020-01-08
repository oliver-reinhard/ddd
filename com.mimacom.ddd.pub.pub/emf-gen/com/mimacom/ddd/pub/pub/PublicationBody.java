/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publication Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.PublicationBody#getDivisions <em>Divisions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getPublicationBody()
 * @model
 * @generated
 */
public interface PublicationBody extends DocumentSegment {
	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPublicationBody_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Division> getDivisions();

} // PublicationBody
