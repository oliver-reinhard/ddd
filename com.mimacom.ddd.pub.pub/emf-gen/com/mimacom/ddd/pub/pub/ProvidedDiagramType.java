/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType#getDiagramTypeName <em>Diagram Type Name</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedDiagramType()
 * @model
 * @generated
 */
public interface ProvidedDiagramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedDiagramType_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Type Name</em>' attribute.
	 * @see #setDiagramTypeName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedDiagramType_DiagramTypeName()
	 * @model unique="false"
	 * @generated
	 */
	String getDiagramTypeName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedDiagramType#getDiagramTypeName <em>Diagram Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Type Name</em>' attribute.
	 * @see #getDiagramTypeName()
	 * @generated
	 */
	void setDiagramTypeName(String value);

} // ProvidedDiagramType
