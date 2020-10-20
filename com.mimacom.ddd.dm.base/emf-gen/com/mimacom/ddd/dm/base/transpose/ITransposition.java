/**
 */
package com.mimacom.ddd.dm.base.transpose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITransposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.ITransposition#getRule <em>Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.ITransposition#getImpliedTranspositions <em>Implied Transpositions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getITransposition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITransposition extends EObject
{
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(TTranspositionRule)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getITransposition_Rule()
	 * @model containment="true"
	 * @generated
	 */
	TTranspositionRule getRule();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.ITransposition#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(TTranspositionRule value);

	/**
	 * Returns the value of the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.transpose.TImplicitTransposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied Transpositions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getITransposition_ImpliedTranspositions()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<TImplicitTransposition> getImpliedTranspositions();

} // ITransposition
