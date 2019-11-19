/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDeducible Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.IDeducibleElement#getDeducedFrom <em>Deduced From</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.IDeducibleElement#isSynthetic <em>Synthetic</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeducibleElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDeducibleElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Deduced From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deduced From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduced From</em>' reference.
	 * @see #setDeducedFrom(IDeductionDefinition)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeducibleElement_DeducedFrom()
	 * @model transient="true"
	 * @generated
	 */
	IDeductionDefinition getDeducedFrom();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.IDeducibleElement#getDeducedFrom <em>Deduced From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduced From</em>' reference.
	 * @see #getDeducedFrom()
	 * @generated
	 */
	void setDeducedFrom(IDeductionDefinition value);

	/**
	 * Returns the value of the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthetic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthetic</em>' attribute.
	 * @see #setSynthetic(boolean)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeducibleElement_Synthetic()
	 * @model transient="true"
	 * @generated
	 */
	boolean isSynthetic();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.IDeducibleElement#isSynthetic <em>Synthetic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthetic</em>' attribute.
	 * @see #isSynthetic()
	 * @generated
	 */
	void setSynthetic(boolean value);

} // IDeducibleElement
