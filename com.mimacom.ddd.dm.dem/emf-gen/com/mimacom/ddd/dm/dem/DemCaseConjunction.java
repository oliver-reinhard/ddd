/**
 */
package com.mimacom.ddd.dm.dem;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#getSelector <em>Selector</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#isOtherwise <em>Otherwise</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemCaseConjunction()
 * @model
 * @generated
 */
public interface DemCaseConjunction extends DNamedElement
{
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(DExpression)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemCaseConjunction_Selector()
	 * @model containment="true"
	 * @generated
	 */
	DExpression getSelector();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(DExpression value);

	/**
	 * Returns the value of the '<em><b>Otherwise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherwise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherwise</em>' attribute.
	 * @see #setOtherwise(boolean)
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemCaseConjunction_Otherwise()
	 * @model
	 * @generated
	 */
	boolean isOtherwise();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction#isOtherwise <em>Otherwise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherwise</em>' attribute.
	 * @see #isOtherwise()
	 * @generated
	 */
	void setOtherwise(boolean value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DNamedPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dem.DemPackage#getDemCaseConjunction_Predicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<DNamedPredicate> getPredicates();

} // DemCaseConjunction
