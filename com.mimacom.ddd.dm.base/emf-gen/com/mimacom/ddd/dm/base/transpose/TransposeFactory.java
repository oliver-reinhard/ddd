/**
 */
package com.mimacom.ddd.dm.base.transpose;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage
 * @generated
 */
public interface TransposeFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransposeFactory eINSTANCE = com.mimacom.ddd.dm.base.transpose.impl.TransposeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TImplicit Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImplicit Transposition</em>'.
	 * @generated
	 */
	TImplicitTransposition createTImplicitTransposition();

	/**
	 * Returns a new object of class '<em>TInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInformation Model</em>'.
	 * @generated
	 */
	TInformationModel createTInformationModel();

	/**
	 * Returns a new object of class '<em>TType Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TType Mapping</em>'.
	 * @generated
	 */
	TTypeMapping createTTypeMapping();

	/**
	 * Returns a new object of class '<em>TAggregate Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAggregate Transposition</em>'.
	 * @generated
	 */
	TAggregateTransposition createTAggregateTransposition();

	/**
	 * Returns a new object of class '<em>TPrimitive Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPrimitive Transposition</em>'.
	 * @generated
	 */
	TPrimitiveTransposition createTPrimitiveTransposition();

	/**
	 * Returns a new object of class '<em>TEnumeration Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEnumeration Transposition</em>'.
	 * @generated
	 */
	TEnumerationTransposition createTEnumerationTransposition();

	/**
	 * Returns a new object of class '<em>TLiteral Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLiteral Transposition</em>'.
	 * @generated
	 */
	TLiteralTransposition createTLiteralTransposition();

	/**
	 * Returns a new object of class '<em>TDetail Type Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDetail Type Transposition</em>'.
	 * @generated
	 */
	TDetailTypeTransposition createTDetailTypeTransposition();

	/**
	 * Returns a new object of class '<em>TEntity Type Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEntity Type Transposition</em>'.
	 * @generated
	 */
	TEntityTypeTransposition createTEntityTypeTransposition();

	/**
	 * Returns a new object of class '<em>TAssociation Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAssociation Transposition</em>'.
	 * @generated
	 */
	TAssociationTransposition createTAssociationTransposition();

	/**
	 * Returns a new object of class '<em>TAttribute Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAttribute Transposition</em>'.
	 * @generated
	 */
	TAttributeTransposition createTAttributeTransposition();

	/**
	 * Returns a new object of class '<em>TQuery Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TQuery Transposition</em>'.
	 * @generated
	 */
	TQueryTransposition createTQueryTransposition();

	/**
	 * Returns a new object of class '<em>TQuery Parameter Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TQuery Parameter Transposition</em>'.
	 * @generated
	 */
	TQueryParameterTransposition createTQueryParameterTransposition();

	/**
	 * Returns a new object of class '<em>TGrab Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGrab Rule</em>'.
	 * @generated
	 */
	TGrabRule createTGrabRule();

	/**
	 * Returns a new object of class '<em>TFuse Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFuse Rule</em>'.
	 * @generated
	 */
	TFuseRule createTFuseRule();

	/**
	 * Returns a new object of class '<em>TMorph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMorph Rule</em>'.
	 * @generated
	 */
	TMorphRule createTMorphRule();

	/**
	 * Returns a new object of class '<em>TDitch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDitch Rule</em>'.
	 * @generated
	 */
	TDitchRule createTDitchRule();

	/**
	 * Returns a new object of class '<em>TGrab Aggregate Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGrab Aggregate Rule</em>'.
	 * @generated
	 */
	TGrabAggregateRule createTGrabAggregateRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransposePackage getTransposePackage();

} //TransposeFactory
