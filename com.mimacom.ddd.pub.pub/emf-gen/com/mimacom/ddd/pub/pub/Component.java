/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Component#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Document {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.DocumentSegment}.
	 * It is bidirectional and its opposite is '{@link com.mimacom.ddd.pub.pub.DocumentSegment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getComponent_Segments()
	 * @see com.mimacom.ddd.pub.pub.DocumentSegment#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<DocumentSegment> getSegments();

} // Component
