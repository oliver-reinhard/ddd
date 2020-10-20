/**
 */
package com.mimacom.ddd.dm.base.transpose;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImplicit Transposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TImplicitTransposition#getOriginalTransposition <em>Original Transposition</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTImplicitTransposition()
 * @model
 * @generated
 */
public interface TImplicitTransposition extends ITransposition, ISyntheticElement
{
	/**
	 * Returns the value of the '<em><b>Original Transposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Transposition</em>' reference.
	 * @see #setOriginalTransposition(ITransposition)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTImplicitTransposition_OriginalTransposition()
	 * @model transient="true"
	 * @generated
	 */
	ITransposition getOriginalTransposition();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TImplicitTransposition#getOriginalTransposition <em>Original Transposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Transposition</em>' reference.
	 * @see #getOriginalTransposition()
	 * @generated
	 */
	void setOriginalTransposition(ITransposition value);

} // TImplicitTransposition
