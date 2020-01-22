/**
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.base.DExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.pub.pub.Reference#getScope <em>Scope</em>}</li>
 *   <li>{@link com.mimacom.ddd.pub.pub.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.pub.pub.PubPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends DExpression {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mimacom.ddd.pub.pub.ReferenceScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ReferenceScope
	 * @see #setScope(ReferenceScope)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getReference_Scope()
	 * @model unique="false"
	 * @generated
	 */
	ReferenceScope getScope();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Reference#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see com.mimacom.ddd.pub.pub.ReferenceScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ReferenceScope value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ReferenceTarget)
	 * @see com.mimacom.ddd.pub.pub.PubPackage#getReference_Target()
	 * @model
	 * @generated
	 */
	ReferenceTarget getTarget();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.pub.pub.Reference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ReferenceTarget value);

} // Reference
