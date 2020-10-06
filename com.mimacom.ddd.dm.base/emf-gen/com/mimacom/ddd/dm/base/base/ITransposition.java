/**
 */
package com.mimacom.ddd.dm.base.base;

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
 *   <li>{@link com.mimacom.ddd.dm.base.base.ITransposition#getTranspositionRule <em>Transposition Rule</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.base.ITransposition#getImpliedTranspositions <em>Implied Transpositions</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getITransposition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITransposition extends EObject
{
	/**
	 * Returns the value of the '<em><b>Transposition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transposition Rule</em>' containment reference.
	 * @see #setTranspositionRule(TTranspositionRule)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getITransposition_TranspositionRule()
	 * @model containment="true"
	 * @generated
	 */
	TTranspositionRule getTranspositionRule();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.ITransposition#getTranspositionRule <em>Transposition Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transposition Rule</em>' containment reference.
	 * @see #getTranspositionRule()
	 * @generated
	 */
	void setTranspositionRule(TTranspositionRule value);

	/**
	 * Returns the value of the '<em><b>Implied Transpositions</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.TImplicitTransposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied Transpositions</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getITransposition_ImpliedTranspositions()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<TImplicitTransposition> getImpliedTranspositions();

} // ITransposition
