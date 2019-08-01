/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate With Correlation Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getCorrelationVariable <em>Correlation Variable</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxPredicateWithCorrelationVariable()
 * @model
 * @generated
 */
public interface DmxPredicateWithCorrelationVariable extends DExpression, INavigableMemberContainer
{
	/**
	 * Returns the value of the '<em><b>Correlation Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Variable</em>' containment reference.
	 * @see #setCorrelationVariable(DContext)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxPredicateWithCorrelationVariable_CorrelationVariable()
	 * @model containment="true"
	 * @generated
	 */
	DContext getCorrelationVariable();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getCorrelationVariable <em>Correlation Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Variable</em>' containment reference.
	 * @see #getCorrelationVariable()
	 * @generated
	 */
	void setCorrelationVariable(DContext value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(DExpression)
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxPredicateWithCorrelationVariable_Value()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getValue();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DExpression value);

} // DmxPredicateWithCorrelationVariable
