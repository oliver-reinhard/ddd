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
	 * Returns a new object of class '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype</em>'.
	 * @generated
	 */
	DmxArchetype createDmxArchetype();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	DmxFunction createDmxFunction();

	/**
	 * Returns a new object of class '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Parameter</em>'.
	 * @generated
	 */
	DmxFunctionParameter createDmxFunctionParameter();

	/**
	 * Returns a new object of class '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator</em>'.
	 * @generated
	 */
	DmxIterator createDmxIterator();

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
	 * Returns a new object of class '<em>Member Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Navigation</em>'.
	 * @generated
	 */
	DmxMemberNavigation createDmxMemberNavigation();

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
	 * Returns a new object of class '<em>Self Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Expression</em>'.
	 * @generated
	 */
	DmxSelfExpression createDmxSelfExpression();

	/**
	 * Returns a new object of class '<em>Return Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Expression</em>'.
	 * @generated
	 */
	DmxReturnExpression createDmxReturnExpression();

	/**
	 * Returns a new object of class '<em>Raise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raise Expression</em>'.
	 * @generated
	 */
	DmxRaiseExpression createDmxRaiseExpression();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	DmxFunctionCall createDmxFunctionCall();

	/**
	 * Returns a new object of class '<em>Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Call</em>'.
	 * @generated
	 */
	DmxConstructorCall createDmxConstructorCall();

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
	 * Returns a new object of class '<em>For Loop Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop Expression</em>'.
	 * @generated
	 */
	DmxForLoopExpression createDmxForLoopExpression();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmxPackage getDmxPackage();

} //DmxFactory
