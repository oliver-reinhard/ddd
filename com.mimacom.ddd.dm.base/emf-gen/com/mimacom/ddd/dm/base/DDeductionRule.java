/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDeduction Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DDeductionRule#getSource <em>Source</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DDeductionRule#getNamedSource <em>Named Source</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDDeductionRule()
 * @model abstract="true"
 * @generated
 */
public interface DDeductionRule extends EObject
{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IDeducibleElement)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDeductionRule_Source()
	 * @model
	 * @generated
	 */
	IDeducibleElement getSource();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DDeductionRule#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IDeducibleElement value);

	/**
	 * Returns the value of the '<em><b>Named Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Source</em>' reference.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDDeductionRule_NamedSource()
	 * @model resolveProxies="false" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	DNamedElement getNamedSource();

} // DDeductionRule
