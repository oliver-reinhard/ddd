/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.DAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAssociation Deduction</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.mimacom.ddd.sm.sim.SimPackage#getSAssociationDeduction()
 * @model
 * @generated
 */
public interface SAssociationDeduction extends DAssociation, SFeatureDeduction
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SEntityTypeDeduction getTargetType();

} // SAssociationDeduction
