/**
 */
package com.mimacom.ddd.pub.pub;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeProvider#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeProvider#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.CodeProvider#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CodeProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeProvider_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.CodeProvider#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' attribute.
	 * @see #setRootElement(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeProvider_RootElement()
	 * @model unique="false"
	 * @generated
	 */
	String getRootElement();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.CodeProvider#getRootElement <em>Root Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Element</em>' attribute.
	 * @see #getRootElement()
	 * @generated
	 */
	void setRootElement(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getCodeProvider_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.CodeProvider#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CodeProvider
