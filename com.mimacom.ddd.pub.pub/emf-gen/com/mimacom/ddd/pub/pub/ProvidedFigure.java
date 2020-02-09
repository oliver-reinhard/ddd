/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.IDiagramRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramRoot <em>Diagram Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getRenderer <em>Renderer</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedFigure()
 * @model
 * @generated
 */
public interface ProvidedFigure extends AbstractFigure {
	/**
	 * Returns the value of the '<em><b>Diagram Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Root</em>' reference.
	 * @see #setDiagramRoot(IDiagramRoot)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedFigure_DiagramRoot()
	 * @model
	 * @generated
	 */
	IDiagramRoot getDiagramRoot();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramRoot <em>Diagram Root</em>}' reference.
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
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedFigure_Renderer()
	 * @model
	 * @generated
	 */
	FigureRenderer getRenderer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getRenderer <em>Renderer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderer</em>' reference.
	 * @see #getRenderer()
	 * @generated
	 */
	void setRenderer(FigureRenderer value);

} // ProvidedFigure
