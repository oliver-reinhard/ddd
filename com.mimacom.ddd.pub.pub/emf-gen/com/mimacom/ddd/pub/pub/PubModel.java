/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.base.DImport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.PubModel#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.PubModel#getDocument <em>Document</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.PubModel#getProvidedDiagramTypes <em>Provided Diagram Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.PubModel#getProvidedTableTypes <em>Provided Table Types</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel()
 * @model
 * @generated
 */
public interface PubModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DImport> getImports();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Document)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel_Document()
	 * @model containment="true"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.PubModel#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>Provided Diagram Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.ProvidedDiagramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Diagram Types</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel_ProvidedDiagramTypes()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<ProvidedDiagramType> getProvidedDiagramTypes();

	/**
	 * Returns the value of the '<em><b>Provided Table Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.ProvidedTableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Table Types</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel_ProvidedTableTypes()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<ProvidedTableType> getProvidedTableTypes();

} // PubModel
