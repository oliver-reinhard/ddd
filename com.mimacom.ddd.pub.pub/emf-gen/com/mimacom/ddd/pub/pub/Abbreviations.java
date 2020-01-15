/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abbreviations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Abbreviations#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbbreviations()
 * @model
 * @generated
 */
public interface Abbreviations extends SegmentWithTable {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.Abbreviation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getAbbreviations_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Abbreviation> getEntries();

} // Abbreviations
