/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNamespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNamespace#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNamespace#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamespace()
 * @model
 * @generated
 */
public interface DNamespace extends DNamedElement
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamespace_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DImport> getImports();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(DModel)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamespace_Model()
	 * @model containment="true"
	 * @generated
	 */
	DModel getModel();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNamespace#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(DModel value);

} // DNamespace
