/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNamedElement#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNamedElement#getAliases <em>Aliases</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNamedElement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface DNamedElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aliases</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aliases</em>' attribute list.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamedElement_Aliases()
	 * @model
	 * @generated
	 */
	EList<String> getAliases();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DRichText)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamedElement_Description()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getDescription();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNamedElement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DRichText value);

} // DNamedElement
