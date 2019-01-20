/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DQuery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.DQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.DQuery#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDQuery()
 * @model
 * @generated
 */
public interface DQuery extends DFeature
{
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DQueryParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDQuery_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DQueryParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' containment reference.
	 * @see #setReturns(DExpression)
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDQuery_Returns()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getReturns();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.DQuery#getReturns <em>Returns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' containment reference.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(DExpression value);

} // DQuery
