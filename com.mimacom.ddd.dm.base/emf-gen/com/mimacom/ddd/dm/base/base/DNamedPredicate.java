/**
 */
package com.mimacom.ddd.dm.base.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DNamed Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DNamedPredicate#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamedPredicate()
 * @model
 * @generated
 */
public interface DNamedPredicate extends DNamedElement, INoteContainer
{
	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(DExpression)
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDNamedPredicate_Predicate()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getPredicate();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.base.DNamedPredicate#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(DExpression value);

} // DNamedPredicate
