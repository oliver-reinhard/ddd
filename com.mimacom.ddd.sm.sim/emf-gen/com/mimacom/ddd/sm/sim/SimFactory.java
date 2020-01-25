/**
 */
package com.mimacom.ddd.sm.sim;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.sm.sim.SimPackage
 * @generated
 */
public interface SimFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimFactory eINSTANCE = com.mimacom.ddd.sm.sim.impl.SimFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SInformation Model</em>'.
	 * @generated
	 */
	SInformationModel createSInformationModel();

	/**
	 * Returns a new object of class '<em>SImplicit Element Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SImplicit Element Deduction</em>'.
	 * @generated
	 */
	SImplicitElementDeduction createSImplicitElementDeduction();

	/**
	 * Returns a new object of class '<em>SDomain Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDomain Deduction</em>'.
	 * @generated
	 */
	SDomainDeduction createSDomainDeduction();

	/**
	 * Returns a new object of class '<em>SAggregate Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAggregate Deduction</em>'.
	 * @generated
	 */
	SAggregateDeduction createSAggregateDeduction();

	/**
	 * Returns a new object of class '<em>SPrimitive Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPrimitive Deduction</em>'.
	 * @generated
	 */
	SPrimitiveDeduction createSPrimitiveDeduction();

	/**
	 * Returns a new object of class '<em>SEnumeration Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEnumeration Deduction</em>'.
	 * @generated
	 */
	SEnumerationDeduction createSEnumerationDeduction();

	/**
	 * Returns a new object of class '<em>SLiteral Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLiteral Deduction</em>'.
	 * @generated
	 */
	SLiteralDeduction createSLiteralDeduction();

	/**
	 * Returns a new object of class '<em>SDetail Type Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDetail Type Deduction</em>'.
	 * @generated
	 */
	SDetailTypeDeduction createSDetailTypeDeduction();

	/**
	 * Returns a new object of class '<em>SEntity Type Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEntity Type Deduction</em>'.
	 * @generated
	 */
	SEntityTypeDeduction createSEntityTypeDeduction();

	/**
	 * Returns a new object of class '<em>SAssociation Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAssociation Deduction</em>'.
	 * @generated
	 */
	SAssociationDeduction createSAssociationDeduction();

	/**
	 * Returns a new object of class '<em>SAttribute Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAttribute Deduction</em>'.
	 * @generated
	 */
	SAttributeDeduction createSAttributeDeduction();

	/**
	 * Returns a new object of class '<em>SQuery Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQuery Deduction</em>'.
	 * @generated
	 */
	SQueryDeduction createSQueryDeduction();

	/**
	 * Returns a new object of class '<em>SQuery Parameter Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQuery Parameter Deduction</em>'.
	 * @generated
	 */
	SQueryParameterDeduction createSQueryParameterDeduction();

	/**
	 * Returns a new object of class '<em>SGrab Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGrab Rule</em>'.
	 * @generated
	 */
	SGrabRule createSGrabRule();

	/**
	 * Returns a new object of class '<em>SDitch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDitch Rule</em>'.
	 * @generated
	 */
	SDitchRule createSDitchRule();

	/**
	 * Returns a new object of class '<em>SMorph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMorph Rule</em>'.
	 * @generated
	 */
	SMorphRule createSMorphRule();

	/**
	 * Returns a new object of class '<em>SFuse Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFuse Rule</em>'.
	 * @generated
	 */
	SFuseRule createSFuseRule();

	/**
	 * Returns a new object of class '<em>SGrab Aggregate Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGrab Aggregate Rule</em>'.
	 * @generated
	 */
	SGrabAggregateRule createSGrabAggregateRule();

	/**
	 * Returns a new object of class '<em>SGrab Model Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGrab Model Rule</em>'.
	 * @generated
	 */
	SGrabModelRule createSGrabModelRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimPackage getSimPackage();

} //SimFactory
