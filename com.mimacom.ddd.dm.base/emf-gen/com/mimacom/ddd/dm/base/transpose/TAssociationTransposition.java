/**
 */
package com.mimacom.ddd.dm.base.transpose;

import com.mimacom.ddd.dm.base.base.DAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAssociation Transposition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getTAssociationTransposition()
 * @model
 * @generated
 */
public interface TAssociationTransposition extends DAssociation, TFeatureTransposition
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TEntityTypeTransposition getTargetType();

} // TAssociationTransposition
