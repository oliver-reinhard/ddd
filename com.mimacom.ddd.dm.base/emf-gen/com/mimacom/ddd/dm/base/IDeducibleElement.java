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
 *   <li>{@link com.mimacom.ddd.dm.base.IDeducibleElement#getDeductionDefinition <em>Deduction Definition</em>}</li>
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
	 * Returns the value of the '<em><b>Deduction Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Definition</em>' reference.
	 * @see #setDeductionDefinition(IDeductionDefinition)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIDeducibleElement_DeductionDefinition()
	 * @model
	 * @generated
	 */
	IDeductionDefinition getDeductionDefinition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.IDeducibleElement#getDeductionDefinition <em>Deduction Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Definition</em>' reference.
	 * @see #getDeductionDefinition()
	 * @generated
	 */
	void setDeductionDefinition(IDeductionDefinition value);

	/**
	 * Returns the value of the '<em><b>Synthetic</b></em>' attribute.
	 * <!-- begin-user-doc -->
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
