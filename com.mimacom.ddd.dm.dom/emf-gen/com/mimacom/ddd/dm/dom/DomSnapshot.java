/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom;

import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dom.DomSnapshot#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dom.DomSnapshot#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dom.DomPackage#getDomSnapshot()
 * @model
 * @generated
 */
public interface DomSnapshot extends INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.dom.DomPackage#getDomSnapshot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dom.DomSnapshot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dom.DomObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dom.DomPackage#getDomSnapshot_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomObject> getObjects();

} // DomSnapshot
