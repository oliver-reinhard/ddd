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
	 * Returns a new object of class '<em>SNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SNamed Element</em>'.
	 * @generated
	 */
	SNamedElement createSNamedElement();

	/**
	 * Returns a new object of class '<em>SImport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SImport</em>'.
	 * @generated
	 */
	SImport createSImport();

	/**
	 * Returns a new object of class '<em>SDomain Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDomain Proxy</em>'.
	 * @generated
	 */
	SDomainProxy createSDomainProxy();

	/**
	 * Returns a new object of class '<em>SAggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAggregate</em>'.
	 * @generated
	 */
	SAggregate createSAggregate();

	/**
	 * Returns a new object of class '<em>SType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SType</em>'.
	 * @generated
	 */
	SType createSType();

	/**
	 * Returns a new object of class '<em>SSimple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSimple Type</em>'.
	 * @generated
	 */
	SSimpleType createSSimpleType();

	/**
	 * Returns a new object of class '<em>SComplex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SComplex Type</em>'.
	 * @generated
	 */
	SComplexType createSComplexType();

	/**
	 * Returns a new object of class '<em>SCondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SCondition</em>'.
	 * @generated
	 */
	SCondition createSCondition();

	/**
	 * Returns a new object of class '<em>SPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SPrimitive</em>'.
	 * @generated
	 */
	SPrimitive createSPrimitive();

	/**
	 * Returns a new object of class '<em>SEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEnumeration</em>'.
	 * @generated
	 */
	SEnumeration createSEnumeration();

	/**
	 * Returns a new object of class '<em>SLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SLiteral</em>'.
	 * @generated
	 */
	SLiteral createSLiteral();

	/**
	 * Returns a new object of class '<em>SEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEntity Type</em>'.
	 * @generated
	 */
	SEntityType createSEntityType();

	/**
	 * Returns a new object of class '<em>SDetail Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDetail Type</em>'.
	 * @generated
	 */
	SDetailType createSDetailType();

	/**
	 * Returns a new object of class '<em>SFeature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SFeature</em>'.
	 * @generated
	 */
	SFeature createSFeature();

	/**
	 * Returns a new object of class '<em>SAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAssociation</em>'.
	 * @generated
	 */
	SAssociation createSAssociation();

	/**
	 * Returns a new object of class '<em>SAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SAttribute</em>'.
	 * @generated
	 */
	SAttribute createSAttribute();

	/**
	 * Returns a new object of class '<em>SQuery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQuery</em>'.
	 * @generated
	 */
	SQuery createSQuery();

	/**
	 * Returns a new object of class '<em>SQuery Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQuery Parameter</em>'.
	 * @generated
	 */
	SQueryParameter createSQueryParameter();

	/**
	 * Returns a new object of class '<em>SExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SExpression</em>'.
	 * @generated
	 */
	SExpression createSExpression();

	/**
	 * Returns a new object of class '<em>SMultiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMultiplicity</em>'.
	 * @generated
	 */
	SMultiplicity createSMultiplicity();

	/**
	 * Returns a new object of class '<em>SGrab Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGrab Rule</em>'.
	 * @generated
	 */
	SGrabRule createSGrabRule();

	/**
	 * Returns a new object of class '<em>SMorph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMorph Rule</em>'.
	 * @generated
	 */
	SMorphRule createSMorphRule();

	/**
	 * Returns a new object of class '<em>SDitch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDitch Rule</em>'.
	 * @generated
	 */
	SDitchRule createSDitchRule();

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
	 * Returns a new object of class '<em>SGrab Domain Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGrab Domain Rule</em>'.
	 * @generated
	 */
	SGrabDomainRule createSGrabDomainRule();

	/**
	 * Returns a new object of class '<em>SSynthetic Deduction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SSynthetic Deduction Rule</em>'.
	 * @generated
	 */
	SSyntheticDeductionRule createSSyntheticDeductionRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimPackage getSimPackage();

} //SimFactory
