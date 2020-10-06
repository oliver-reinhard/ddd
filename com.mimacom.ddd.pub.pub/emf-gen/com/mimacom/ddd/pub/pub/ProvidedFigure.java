/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.IDiagramRoot;

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
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramType <em>Diagram Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedFigure#isPreferRasterDiagram <em>Prefer Raster Diagram</em>}</li>
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
	 * Returns the value of the '<em><b>Diagram Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Type</em>' reference.
	 * @see #setDiagramType(ProvidedDiagramType)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedFigure_DiagramType()
	 * @model
	 * @generated
	 */
	ProvidedDiagramType getDiagramType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedFigure#getDiagramType <em>Diagram Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Type</em>' reference.
	 * @see #getDiagramType()
	 * @generated
	 */
	void setDiagramType(ProvidedDiagramType value);

	/**
	 * Returns the value of the '<em><b>Prefer Raster Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefer Raster Diagram</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedFigure_PreferRasterDiagram()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isPreferRasterDiagram();

} // ProvidedFigure
