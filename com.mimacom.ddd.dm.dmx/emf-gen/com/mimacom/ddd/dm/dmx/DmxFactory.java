/**
 */
package com.mimacom.ddd.dm.dmx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dmx.DmxPackage
 * @generated
 */
public interface DmxFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmxFactory eINSTANCE = com.mimacom.ddd.dm.dmx.impl.DmxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	DmxNamespace createDmxNamespace();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	DmxTest createDmxTest();

	/**
	 * Returns a new object of class '<em>Test Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Context</em>'.
	 * @generated
	 */
	DmxTestContext createDmxTestContext();

	/**
	 * Returns a new object of class '<em>Base Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Type Set</em>'.
	 * @generated
	 */
	DmxBaseTypeSet createDmxBaseTypeSet();

	/**
	 * Returns a new object of class '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype</em>'.
	 * @generated
	 */
	DmxArchetype createDmxArchetype();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	DmxFilter createDmxFilter();

	/**
	 * Returns a new object of class '<em>Filter Type Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Type Descriptor</em>'.
	 * @generated
	 */
	DmxFilterTypeDescriptor createDmxFilterTypeDescriptor();

	/**
	 * Returns a new object of class '<em>Filter Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Parameter</em>'.
	 * @generated
	 */
	DmxFilterParameter createDmxFilterParameter();

	/**
	 * Returns a new object of class '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment</em>'.
	 * @generated
	 */
	DmxAssignment createDmxAssignment();

	/**
	 * Returns a new object of class '<em>Predicate With Correlation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate With Correlation Variable</em>'.
	 * @generated
	 */
	DmxPredicateWithCorrelationVariable createDmxPredicateWithCorrelationVariable();

	/**
	 * Returns a new object of class '<em>Correlation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correlation Variable</em>'.
	 * @generated
	 */
	DmxCorrelationVariable createDmxCorrelationVariable();

	/**
	 * Returns a new object of class '<em>Member Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Navigation</em>'.
	 * @generated
	 */
	DmxMemberNavigation createDmxMemberNavigation();

	/**
	 * Returns a new object of class '<em>Call Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Arguments</em>'.
	 * @generated
	 */
	DmxCallArguments createDmxCallArguments();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	DmxFunctionCall createDmxFunctionCall();

	/**
	 * Returns a new object of class '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operation</em>'.
	 * @generated
	 */
	DmxBinaryOperation createDmxBinaryOperation();

	/**
	 * Returns a new object of class '<em>Instance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Of Expression</em>'.
	 * @generated
	 */
	DmxInstanceOfExpression createDmxInstanceOfExpression();

	/**
	 * Returns a new object of class '<em>Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Operation</em>'.
	 * @generated
	 */
	DmxUnaryOperation createDmxUnaryOperation();

	/**
	 * Returns a new object of class '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cast Expression</em>'.
	 * @generated
	 */
	DmxCastExpression createDmxCastExpression();

	/**
	 * Returns a new object of class '<em>List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Expression</em>'.
	 * @generated
	 */
	DmxListExpression createDmxListExpression();

	/**
	 * Returns a new object of class '<em>Static Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Static Reference</em>'.
	 * @generated
	 */
	DmxStaticReference createDmxStaticReference();

	/**
	 * Returns a new object of class '<em>Context Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Reference</em>'.
	 * @generated
	 */
	DmxContextReference createDmxContextReference();

	/**
	 * Returns a new object of class '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression</em>'.
	 * @generated
	 */
	DmxIfExpression createDmxIfExpression();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	DmxBooleanLiteral createDmxBooleanLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	DmxStringLiteral createDmxStringLiteral();

	/**
	 * Returns a new object of class '<em>Natural Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Literal</em>'.
	 * @generated
	 */
	DmxNaturalLiteral createDmxNaturalLiteral();

	/**
	 * Returns a new object of class '<em>Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Literal</em>'.
	 * @generated
	 */
	DmxDecimalLiteral createDmxDecimalLiteral();

	/**
	 * Returns a new object of class '<em>Date Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Literal</em>'.
	 * @generated
	 */
	DmxDateLiteral createDmxDateLiteral();

	/**
	 * Returns a new object of class '<em>Undefined Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undefined Literal</em>'.
	 * @generated
	 */
	DmxUndefinedLiteral createDmxUndefinedLiteral();

	/**
	 * Returns a new object of class '<em>Complex Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Object</em>'.
	 * @generated
	 */
	DmxComplexObject createDmxComplexObject();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	DmxField createDmxField();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	DmxEntity createDmxEntity();

	/**
	 * Returns a new object of class '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detail</em>'.
	 * @generated
	 */
	DmxDetail createDmxDetail();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmxPackage getDmxPackage();

} //DmxFactory
