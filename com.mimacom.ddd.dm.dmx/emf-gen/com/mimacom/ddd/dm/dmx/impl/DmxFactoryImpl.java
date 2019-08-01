/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.dmx.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmxFactoryImpl extends EFactoryImpl implements DmxFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DmxFactory init()
	{
		try
		{
			DmxFactory theDmxFactory = (DmxFactory)EPackage.Registry.INSTANCE.getEFactory(DmxPackage.eNS_URI);
			if (theDmxFactory != null)
			{
				return theDmxFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DmxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case DmxPackage.DMX_NAMESPACE: return createDmxNamespace();
			case DmxPackage.DMX_TEST: return createDmxTest();
			case DmxPackage.DMX_ARCHETYPE: return createDmxArchetype();
			case DmxPackage.DMX_FUNCTION: return createDmxFunction();
			case DmxPackage.DMX_FUNCTION_PARAMETER: return createDmxFunctionParameter();
			case DmxPackage.DMX_ITERATOR: return createDmxIterator();
			case DmxPackage.DMX_ASSIGNMENT: return createDmxAssignment();
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE: return createDmxPredicateWithCorrelationVariable();
			case DmxPackage.DMX_MEMBER_NAVIGATION: return createDmxMemberNavigation();
			case DmxPackage.DMX_BINARY_OPERATION: return createDmxBinaryOperation();
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION: return createDmxInstanceOfExpression();
			case DmxPackage.DMX_UNARY_OPERATION: return createDmxUnaryOperation();
			case DmxPackage.DMX_CAST_EXPRESSION: return createDmxCastExpression();
			case DmxPackage.DMX_SELF_EXPRESSION: return createDmxSelfExpression();
			case DmxPackage.DMX_RETURN_EXPRESSION: return createDmxReturnExpression();
			case DmxPackage.DMX_RAISE_EXPRESSION: return createDmxRaiseExpression();
			case DmxPackage.DMX_FUNCTION_CALL: return createDmxFunctionCall();
			case DmxPackage.DMX_CONSTRUCTOR_CALL: return createDmxConstructorCall();
			case DmxPackage.DMX_STATIC_REFERENCE: return createDmxStaticReference();
			case DmxPackage.DMX_CONTEXT_REFERENCE: return createDmxContextReference();
			case DmxPackage.DMX_IF_EXPRESSION: return createDmxIfExpression();
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION: return createDmxForLoopExpression();
			case DmxPackage.DMX_BOOLEAN_LITERAL: return createDmxBooleanLiteral();
			case DmxPackage.DMX_STRING_LITERAL: return createDmxStringLiteral();
			case DmxPackage.DMX_NATURAL_LITERAL: return createDmxNaturalLiteral();
			case DmxPackage.DMX_DECIMAL_LITERAL: return createDmxDecimalLiteral();
			case DmxPackage.DMX_DATE_LITERAL: return createDmxDateLiteral();
			case DmxPackage.DMX_UNDEFINED_LITERAL: return createDmxUndefinedLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case DmxPackage.DMX_BASE_TYPE:
				return createDmxBaseTypeFromString(eDataType, initialValue);
			case DmxPackage.DMX_BINARY_OPERATOR:
				return createDmxBinaryOperatorFromString(eDataType, initialValue);
			case DmxPackage.DMX_UNARY_OPERATOR:
				return createDmxUnaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case DmxPackage.DMX_BASE_TYPE:
				return convertDmxBaseTypeToString(eDataType, instanceValue);
			case DmxPackage.DMX_BINARY_OPERATOR:
				return convertDmxBinaryOperatorToString(eDataType, instanceValue);
			case DmxPackage.DMX_UNARY_OPERATOR:
				return convertDmxUnaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxNamespace createDmxNamespace()
	{
		DmxNamespaceImpl dmxNamespace = new DmxNamespaceImpl();
		return dmxNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxTest createDmxTest()
	{
		DmxTestImpl dmxTest = new DmxTestImpl();
		return dmxTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxArchetype createDmxArchetype()
	{
		DmxArchetypeImpl dmxArchetype = new DmxArchetypeImpl();
		return dmxArchetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxFunction createDmxFunction()
	{
		DmxFunctionImpl dmxFunction = new DmxFunctionImpl();
		return dmxFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxFunctionParameter createDmxFunctionParameter()
	{
		DmxFunctionParameterImpl dmxFunctionParameter = new DmxFunctionParameterImpl();
		return dmxFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxIterator createDmxIterator()
	{
		DmxIteratorImpl dmxIterator = new DmxIteratorImpl();
		return dmxIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxAssignment createDmxAssignment()
	{
		DmxAssignmentImpl dmxAssignment = new DmxAssignmentImpl();
		return dmxAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxPredicateWithCorrelationVariable createDmxPredicateWithCorrelationVariable()
	{
		DmxPredicateWithCorrelationVariableImpl dmxPredicateWithCorrelationVariable = new DmxPredicateWithCorrelationVariableImpl();
		return dmxPredicateWithCorrelationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxMemberNavigation createDmxMemberNavigation()
	{
		DmxMemberNavigationImpl dmxMemberNavigation = new DmxMemberNavigationImpl();
		return dmxMemberNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxBinaryOperation createDmxBinaryOperation()
	{
		DmxBinaryOperationImpl dmxBinaryOperation = new DmxBinaryOperationImpl();
		return dmxBinaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxInstanceOfExpression createDmxInstanceOfExpression()
	{
		DmxInstanceOfExpressionImpl dmxInstanceOfExpression = new DmxInstanceOfExpressionImpl();
		return dmxInstanceOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxUnaryOperation createDmxUnaryOperation()
	{
		DmxUnaryOperationImpl dmxUnaryOperation = new DmxUnaryOperationImpl();
		return dmxUnaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxCastExpression createDmxCastExpression()
	{
		DmxCastExpressionImpl dmxCastExpression = new DmxCastExpressionImpl();
		return dmxCastExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxSelfExpression createDmxSelfExpression()
	{
		DmxSelfExpressionImpl dmxSelfExpression = new DmxSelfExpressionImpl();
		return dmxSelfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxReturnExpression createDmxReturnExpression()
	{
		DmxReturnExpressionImpl dmxReturnExpression = new DmxReturnExpressionImpl();
		return dmxReturnExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxRaiseExpression createDmxRaiseExpression()
	{
		DmxRaiseExpressionImpl dmxRaiseExpression = new DmxRaiseExpressionImpl();
		return dmxRaiseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxFunctionCall createDmxFunctionCall()
	{
		DmxFunctionCallImpl dmxFunctionCall = new DmxFunctionCallImpl();
		return dmxFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxConstructorCall createDmxConstructorCall()
	{
		DmxConstructorCallImpl dmxConstructorCall = new DmxConstructorCallImpl();
		return dmxConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxStaticReference createDmxStaticReference()
	{
		DmxStaticReferenceImpl dmxStaticReference = new DmxStaticReferenceImpl();
		return dmxStaticReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxContextReference createDmxContextReference()
	{
		DmxContextReferenceImpl dmxContextReference = new DmxContextReferenceImpl();
		return dmxContextReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxIfExpression createDmxIfExpression()
	{
		DmxIfExpressionImpl dmxIfExpression = new DmxIfExpressionImpl();
		return dmxIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxForLoopExpression createDmxForLoopExpression()
	{
		DmxForLoopExpressionImpl dmxForLoopExpression = new DmxForLoopExpressionImpl();
		return dmxForLoopExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxBooleanLiteral createDmxBooleanLiteral()
	{
		DmxBooleanLiteralImpl dmxBooleanLiteral = new DmxBooleanLiteralImpl();
		return dmxBooleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxStringLiteral createDmxStringLiteral()
	{
		DmxStringLiteralImpl dmxStringLiteral = new DmxStringLiteralImpl();
		return dmxStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxNaturalLiteral createDmxNaturalLiteral()
	{
		DmxNaturalLiteralImpl dmxNaturalLiteral = new DmxNaturalLiteralImpl();
		return dmxNaturalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxDecimalLiteral createDmxDecimalLiteral()
	{
		DmxDecimalLiteralImpl dmxDecimalLiteral = new DmxDecimalLiteralImpl();
		return dmxDecimalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxDateLiteral createDmxDateLiteral()
	{
		DmxDateLiteralImpl dmxDateLiteral = new DmxDateLiteralImpl();
		return dmxDateLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxUndefinedLiteral createDmxUndefinedLiteral()
	{
		DmxUndefinedLiteralImpl dmxUndefinedLiteral = new DmxUndefinedLiteralImpl();
		return dmxUndefinedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBaseType createDmxBaseTypeFromString(EDataType eDataType, String initialValue)
	{
		DmxBaseType result = DmxBaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDmxBaseTypeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBinaryOperator createDmxBinaryOperatorFromString(EDataType eDataType, String initialValue)
	{
		DmxBinaryOperator result = DmxBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDmxBinaryOperatorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxUnaryOperator createDmxUnaryOperatorFromString(EDataType eDataType, String initialValue)
	{
		DmxUnaryOperator result = DmxUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDmxUnaryOperatorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxPackage getDmxPackage()
	{
		return (DmxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DmxPackage getPackage()
	{
		return DmxPackage.eINSTANCE;
	}

} //DmxFactoryImpl
