/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IEsm Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.esm.IEsmLayout#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.esm.EsmPackage#getIEsmLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IEsmLayout extends EObject
{
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.dm.esm.EsmLayoutDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see com.mimacom.ddd.dm.esm.EsmLayoutDirection
	 * @see #setDirection(EsmLayoutDirection)
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#getIEsmLayout_Direction()
	 * @model
	 * @generated
	 */
	EsmLayoutDirection getDirection();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.esm.IEsmLayout#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see com.mimacom.ddd.dm.esm.EsmLayoutDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EsmLayoutDirection value);

} // IEsmLayout
