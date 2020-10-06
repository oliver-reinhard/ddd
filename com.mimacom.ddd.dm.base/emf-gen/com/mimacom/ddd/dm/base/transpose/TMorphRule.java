/**
 */
package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TMorph Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TMorphRule#getRetypeTo <em>Retype To</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.TMorphRule#getRemultiplyTo <em>Remultiply To</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTMorphRule()
 * @model
 * @generated
 */
public interface TMorphRule extends TStructureChangingRule
{
	/**
	 * Returns the value of the '<em><b>Retype To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retype To</em>' reference.
	 * @see #setRetypeTo(DType)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTMorphRule_RetypeTo()
	 * @model
	 * @generated
	 */
	DType getRetypeTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TMorphRule#getRetypeTo <em>Retype To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retype To</em>' reference.
	 * @see #getRetypeTo()
	 * @generated
	 */
	void setRetypeTo(DType value);

	/**
	 * Returns the value of the '<em><b>Remultiply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remultiply To</em>' containment reference.
	 * @see #setRemultiplyTo(DMultiplicity)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTMorphRule_RemultiplyTo()
	 * @model containment="true"
	 * @generated
	 */
	DMultiplicity getRemultiplyTo();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.TMorphRule#getRemultiplyTo <em>Remultiply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remultiply To</em>' containment reference.
	 * @see #getRemultiplyTo()
	 * @generated
	 */
	void setRemultiplyTo(DMultiplicity value);

} // TMorphRule
