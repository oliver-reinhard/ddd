/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedTableType#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.ProvidedTableType#getTableTypeName <em>Table Type Name</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedTableType()
 * @model
 * @generated
 */
public interface ProvidedTableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedTableType_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedTableType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Type Name</em>' attribute.
	 * @see #setTableTypeName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getProvidedTableType_TableTypeName()
	 * @model unique="false"
	 * @generated
	 */
	String getTableTypeName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.ProvidedTableType#getTableTypeName <em>Table Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type Name</em>' attribute.
	 * @see #getTableTypeName()
	 * @generated
	 */
	void setTableTypeName(String value);

} // ProvidedTableType
