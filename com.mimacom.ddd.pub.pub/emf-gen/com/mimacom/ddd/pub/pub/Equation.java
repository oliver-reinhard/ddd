/**
 */
package com.mimacom.ddd.pub.pub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Equation#getFileUri <em>File Uri</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getEquation()
 * @model
 * @generated
 */
public interface Equation extends TitledBlock {
	/**
	 * Returns the value of the '<em><b>File Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Uri</em>' attribute.
	 * @see #setFileUri(String)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getEquation_FileUri()
	 * @model unique="false"
	 * @generated
	 */
	String getFileUri();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Equation#getFileUri <em>File Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Uri</em>' attribute.
	 * @see #getFileUri()
	 * @generated
	 */
	void setFileUri(String value);

} // Equation
