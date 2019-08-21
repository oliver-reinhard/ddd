/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm;

import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DNamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity State Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.esm.EsmEntityStateModel#getStates <em>States</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.EsmEntityStateModel#getForType <em>For Type</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.esm.EsmEntityStateModel#getTransition <em>Transition</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.esm.EsmPackage#getEsmEntityStateModel()
 * @model
 * @generated
 */
public interface EsmEntityStateModel extends DNamedElement
{
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.esm.EsmState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#getEsmEntityStateModel_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<EsmState> getStates();

	/**
	 * Returns the value of the '<em><b>For Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Type</em>' reference.
	 * @see #setForType(DEntityType)
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#getEsmEntityStateModel_ForType()
	 * @model
	 * @generated
	 */
	DEntityType getForType();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.esm.EsmEntityStateModel#getForType <em>For Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Type</em>' reference.
	 * @see #getForType()
	 * @generated
	 */
	void setForType(DEntityType value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.esm.EsmTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#getEsmEntityStateModel_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<EsmTransition> getTransition();

} // EsmEntityStateModel
