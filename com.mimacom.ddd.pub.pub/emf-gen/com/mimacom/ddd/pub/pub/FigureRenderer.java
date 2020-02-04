/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure Renderer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.FigureRenderer#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.FigureRenderer#getDiagramName <em>Diagram Name</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigureRenderer()
 * @model
 * @generated
 */
public interface FigureRenderer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigureRenderer_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.FigureRenderer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Name</em>' attribute.
	 * @see #setDiagramName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigureRenderer_DiagramName()
	 * @model unique="false"
	 * @generated
	 */
	String getDiagramName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.FigureRenderer#getDiagramName <em>Diagram Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Name</em>' attribute.
	 * @see #getDiagramName()
	 * @generated
	 */
	void setDiagramName(String value);

} // FigureRenderer
