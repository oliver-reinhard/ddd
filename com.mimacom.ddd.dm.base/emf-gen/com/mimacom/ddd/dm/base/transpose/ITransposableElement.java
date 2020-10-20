/**
 */
package com.mimacom.ddd.dm.base.transpose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITransposable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.ITransposableElement#getTransposedBy <em>Transposed By</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getITransposableElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITransposableElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Transposed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transposed By</em>' reference.
	 * @see #setTransposedBy(ITransposition)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getITransposableElement_TransposedBy()
	 * @model transient="true"
	 * @generated
	 */
	ITransposition getTransposedBy();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.ITransposableElement#getTransposedBy <em>Transposed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transposed By</em>' reference.
	 * @see #getTransposedBy()
	 * @generated
	 */
	void setTransposedBy(ITransposition value);

} // ITransposableElement
