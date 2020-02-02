/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.IDiagramRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Figure#getFileUri <em>File Uri</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Figure#getDiagramRoot <em>Diagram Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Figure#getRenderer <em>Renderer</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigure()
 * @model
 * @generated
 */
public interface Figure extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>File Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Uri</em>' attribute.
	 * @see #setFileUri(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigure_FileUri()
	 * @model unique="false"
	 * @generated
	 */
	String getFileUri();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Figure#getFileUri <em>File Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Uri</em>' attribute.
	 * @see #getFileUri()
	 * @generated
	 */
	void setFileUri(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Root</em>' reference.
	 * @see #setDiagramRoot(IDiagramRoot)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigure_DiagramRoot()
	 * @model
	 * @generated
	 */
	IDiagramRoot getDiagramRoot();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Figure#getDiagramRoot <em>Diagram Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Root</em>' reference.
	 * @see #getDiagramRoot()
	 * @generated
	 */
	void setDiagramRoot(IDiagramRoot value);

	/**
	 * Returns the value of the '<em><b>Renderer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderer</em>' reference.
	 * @see #setRenderer(FigureRenderer)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getFigure_Renderer()
	 * @model
	 * @generated
	 */
	FigureRenderer getRenderer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Figure#getRenderer <em>Renderer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderer</em>' reference.
	 * @see #getRenderer()
	 * @generated
	 */
	void setRenderer(FigureRenderer value);

} // Figure
