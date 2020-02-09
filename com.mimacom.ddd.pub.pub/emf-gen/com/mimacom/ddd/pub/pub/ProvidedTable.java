/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.IDiagramRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedTable#getDiagramRoot <em>Diagram Root</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedTable#getRenderer <em>Renderer</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedTable()
 * @model
 * @generated
 */
public interface ProvidedTable extends AbstractTable {
	/**
	 * Returns the value of the '<em><b>Diagram Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Root</em>' reference.
	 * @see #setDiagramRoot(IDiagramRoot)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedTable_DiagramRoot()
	 * @model
	 * @generated
	 */
	IDiagramRoot getDiagramRoot();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedTable#getDiagramRoot <em>Diagram Root</em>}' reference.
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
	 * @see #setRenderer(TableRenderer)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedTable_Renderer()
	 * @model
	 * @generated
	 */
	TableRenderer getRenderer();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedTable#getRenderer <em>Renderer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderer</em>' reference.
	 * @see #getRenderer()
	 * @generated
	 */
	void setRenderer(TableRenderer value);

} // ProvidedTable
