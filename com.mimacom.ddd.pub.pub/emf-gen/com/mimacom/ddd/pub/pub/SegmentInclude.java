/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.SegmentInclude#getInclude <em>Include</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getSegmentInclude()
 * @model
 * @generated
 */
public interface SegmentInclude extends DocumentSegment {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' reference.
	 * @see #setInclude(DocumentSegment)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getSegmentInclude_Include()
	 * @model
	 * @generated
	 */
	DocumentSegment getInclude();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.SegmentInclude#getInclude <em>Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(DocumentSegment value);

} // SegmentInclude
