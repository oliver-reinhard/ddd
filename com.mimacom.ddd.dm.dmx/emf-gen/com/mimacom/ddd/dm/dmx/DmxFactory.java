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
	 * Returns a new object of class '<em>DAssignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAssignment</em>'.
	 * @generated
	 */
	DAssignment createDAssignment();

	/**
	 * Returns a new object of class '<em>DPredicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DPredicate</em>'.
	 * @generated
	 */
	DPredicate createDPredicate();

	/**
	 * Returns a new object of class '<em>DBinary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBinary Operation</em>'.
	 * @generated
	 */
	DBinaryOperation createDBinaryOperation();

	/**
	 * Returns a new object of class '<em>DInstance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DInstance Of Expression</em>'.
	 * @generated
	 */
	DInstanceOfExpression createDInstanceOfExpression();

	/**
	 * Returns a new object of class '<em>DUnary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DUnary Operation</em>'.
	 * @generated
	 */
	DUnaryOperation createDUnaryOperation();

	/**
	 * Returns a new object of class '<em>Member Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Navigation</em>'.
	 * @generated
	 */
	DmxMemberNavigation createDmxMemberNavigation();

	/**
	 * Returns a new object of class '<em>DCast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DCast Expression</em>'.
	 * @generated
	 */
	DCastExpression createDCastExpression();

	/**
	 * Returns a new object of class '<em>DSelf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSelf Expression</em>'.
	 * @generated
	 */
	DSelfExpression createDSelfExpression();

	/**
	 * Returns a new object of class '<em>DReturn Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DReturn Expression</em>'.
	 * @generated
	 */
	DReturnExpression createDReturnExpression();

	/**
	 * Returns a new object of class '<em>DRaise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DRaise Expression</em>'.
	 * @generated
	 */
	DRaiseExpression createDRaiseExpression();

	/**
	 * Returns a new object of class '<em>DFunction Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFunction Call</em>'.
	 * @generated
	 */
	DFunctionCall createDFunctionCall();

	/**
	 * Returns a new object of class '<em>DConstructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DConstructor Call</em>'.
	 * @generated
	 */
	DConstructorCall createDConstructorCall();

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
	 * Returns a new object of class '<em>DIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DIf Expression</em>'.
	 * @generated
	 */
	DIfExpression createDIfExpression();

	/**
	 * Returns a new object of class '<em>DFor Loop Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFor Loop Expression</em>'.
	 * @generated
	 */
	DForLoopExpression createDForLoopExpression();

	/**
	 * Returns a new object of class '<em>DBoolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBoolean Literal</em>'.
	 * @generated
	 */
	DBooleanLiteral createDBooleanLiteral();

	/**
	 * Returns a new object of class '<em>DString Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DString Literal</em>'.
	 * @generated
	 */
	DStringLiteral createDStringLiteral();

	/**
	 * Returns a new object of class '<em>DNatural Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNatural Literal</em>'.
	 * @generated
	 */
	DNaturalLiteral createDNaturalLiteral();

	/**
	 * Returns a new object of class '<em>DDecimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDecimal Literal</em>'.
	 * @generated
	 */
	DDecimalLiteral createDDecimalLiteral();

	/**
	 * Returns a new object of class '<em>DDate Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DDate Literal</em>'.
	 * @generated
	 */
	DDateLiteral createDDateLiteral();

	/**
	 * Returns a new object of class '<em>DUndefined Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DUndefined Literal</em>'.
	 * @generated
	 */
	DUndefinedLiteral createDUndefinedLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DmxPackage getDmxPackage();

} //DmxFactory
