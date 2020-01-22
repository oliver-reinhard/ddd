/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SService Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.asm.SServiceOperation#getName <em>Name</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.SServiceOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.SServiceOperation#getRaises <em>Raises</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.SServiceOperation#getGuards <em>Guards</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.asm.SServiceOperation#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSServiceOperation()
 * @model
 * @generated
 */
public interface SServiceOperation extends INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSServiceOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.asm.SServiceOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.asm.SServiceParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSServiceOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SServiceParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Raises</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.sm.asm.SException}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raises</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raises</em>' reference list.
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSServiceOperation_Raises()
	 * @model
	 * @generated
	 */
	EList<SException> getRaises();

	/**
	 * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guards</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSServiceOperation_Guards()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getGuards();

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.asm.AsmPackage#getSServiceOperation_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DExpression> getEffects();

} // SServiceOperation
