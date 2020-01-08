/**
 */
package com.mimacom.ddd.pub.pub;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.DocumentSegment#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocumentSegment()
 * @model abstract="true"
 * @generated
 */
public interface DocumentSegment extends ReferenceTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void setName(String name);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.Component#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Component)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDocumentSegment_Parent()
	 * @see com.mimacom.ddd.pub.pub.Component#getSegments
	 * @model opposite="segments" transient="false"
	 * @generated
	 */
	Component getParent();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.DocumentSegment#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Component value);

} // DocumentSegment
