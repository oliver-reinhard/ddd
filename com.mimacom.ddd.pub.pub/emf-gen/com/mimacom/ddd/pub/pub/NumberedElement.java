/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numbered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getNumberedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NumberedElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	int getSequenceNumber();

} // NumberedElement
