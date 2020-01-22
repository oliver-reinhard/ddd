/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.DivisionContainer#getDivisions <em>Divisions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivisionContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DivisionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Divisions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.Division}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divisions</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getDivisionContainer_Divisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Division> getDivisions();

} // DivisionContainer
