/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.DImport;

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
 *   <li>{@link com.mimacom.ddd.pub.pub.PubModel#getFigureRenderers <em>Figure Renderers</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.PubModel#getTableRenderers <em>Table Renderers</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel()
 * @model
 * @generated
 */
public interface PubModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DImport}.
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
	 * Returns the value of the '<em><b>Figure Renderers</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.FigureRenderer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Renderers</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel_FigureRenderers()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<FigureRenderer> getFigureRenderers();

	/**
	 * Returns the value of the '<em><b>Table Renderers</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.TableRenderer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Renderers</em>' containment reference list.
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getPubModel_TableRenderers()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<TableRenderer> getTableRenderers();

} // PubModel
