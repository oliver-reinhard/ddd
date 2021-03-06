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
			case DmxPackage.DMX_MODEL: return createDmxModel();
			case DmxPackage.DMX_TEST: return createDmxTest();
			case DmxPackage.DMX_TEST_CONTEXT: return createDmxTestContext();
			case DmxPackage.DMX_BASE_TYPE_SET: return createDmxBaseTypeSet();
			case DmxPackage.DMX_ARCHETYPE: return createDmxArchetype();
			case DmxPackage.DMX_FILTER: return createDmxFilter();
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR: return createDmxFilterTypeDescriptor();
			case DmxPackage.DMX_FILTER_PARAMETER: return createDmxFilterParameter();
			case DmxPackage.DMX_ASSIGNMENT: return createDmxAssignment();
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE: return createDmxPredicateWithCorrelationVariable();
			case DmxPackage.DMX_CORRELATION_VARIABLE: return createDmxCorrelationVariable();
			case DmxPackage.DMX_MEMBER_NAVIGATION: return createDmxMemberNavigation();
			case DmxPackage.DMX_CALL_ARGUMENTS: return createDmxCallArguments();
			case DmxPackage.DMX_FUNCTION_CALL: return createDmxFunctionCall();
			case DmxPackage.DMX_BINARY_OPERATION: return createDmxBinaryOperation();
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION: return createDmxInstanceOfExpression();
			case DmxPackage.DMX_UNARY_OPERATION: return createDmxUnaryOperation();
			case DmxPackage.DMX_CAST_EXPRESSION: return createDmxCastExpression();
			case DmxPackage.DMX_LIST_EXPRESSION: return createDmxListExpression();
			case DmxPackage.DMX_STATIC_REFERENCE: return createDmxStaticReference();
			case DmxPackage.DMX_CONTEXT_REFERENCE: return createDmxContextReference();
			case DmxPackage.DMX_IF_EXPRESSION: return createDmxIfExpression();
			case DmxPackage.DMX_BOOLEAN_LITERAL: return createDmxBooleanLiteral();
			case DmxPackage.DMX_STRING_LITERAL: return createDmxStringLiteral();
			case DmxPackage.DMX_NATURAL_LITERAL: return createDmxNaturalLiteral();
			case DmxPackage.DMX_DECIMAL_LITERAL: return createDmxDecimalLiteral();
			case DmxPackage.DMX_DATE_LITERAL: return createDmxDateLiteral();
			case DmxPackage.DMX_URL_LITERAL: return createDmxUrlLiteral();
			case DmxPackage.DMX_UNDEFINED_LITERAL: return createDmxUndefinedLiteral();
			case DmxPackage.DMX_COMPLEX_OBJECT: return createDmxComplexObject();
			case DmxPackage.DMX_FIELD: return createDmxField();
			case DmxPackage.DMX_ENTITY: return createDmxEntity();
			case DmxPackage.DMX_DETAIL: return createDmxDetail();
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
	public DmxModel createDmxModel()
	{
		DmxModelImpl dmxModel = new DmxModelImpl();
		return dmxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxTest createDmxTest()
	{
		DmxTestImplCustom dmxTest = new DmxTestImplCustom();
		return dmxTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxTestContext createDmxTestContext()
	{
		DmxTestContextImpl dmxTestContext = new DmxTestContextImpl();
		return dmxTestContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxBaseTypeSet createDmxBaseTypeSet()
	{
		DmxBaseTypeSetImpl dmxBaseTypeSet = new DmxBaseTypeSetImpl();
		return dmxBaseTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DmxFilter createDmxFilter()
	{
		DmxFilterImpl dmxFilter = new DmxFilterImpl();
		return dmxFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxFilterTypeDescriptor createDmxFilterTypeDescriptor()
	{
		DmxFilterTypeDescriptorImplCustom dmxFilterTypeDescriptor = new DmxFilterTypeDescriptorImplCustom();
		return dmxFilterTypeDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxFilterParameter createDmxFilterParameter()
	{
		DmxFilterParameterImpl dmxFilterParameter = new DmxFilterParameterImpl();
		return dmxFilterParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DmxPredicateWithCorrelationVariable createDmxPredicateWithCorrelationVariable()
	{
		DmxPredicateWithCorrelationVariableImplCustom dmxPredicateWithCorrelationVariable = new DmxPredicateWithCorrelationVariableImplCustom();
		return dmxPredicateWithCorrelationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxCorrelationVariable createDmxCorrelationVariable()
	{
		DmxCorrelationVariableImpl dmxCorrelationVariable = new DmxCorrelationVariableImpl();
		return dmxCorrelationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DmxCallArguments createDmxCallArguments()
	{
		DmxCallArgumentsImpl dmxCallArguments = new DmxCallArgumentsImpl();
		return dmxCallArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DmxListExpression createDmxListExpression()
	{
		DmxListExpressionImpl dmxListExpression = new DmxListExpressionImpl();
		return dmxListExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DmxUrlLiteral createDmxUrlLiteral()
	{
		DmxUrlLiteralImpl dmxUrlLiteral = new DmxUrlLiteralImpl();
		return dmxUrlLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public DmxComplexObject createDmxComplexObject()
	{
		DmxComplexObjectImplCustom dmxComplexObject = new DmxComplexObjectImplCustom();
		return dmxComplexObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxField createDmxField()
	{
		DmxFieldImplCustom dmxField = new DmxFieldImplCustom();
		return dmxField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxEntity createDmxEntity()
	{
		DmxEntityImpl dmxEntity = new DmxEntityImpl();
		return dmxEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxDetail createDmxDetail()
	{
		DmxDetailImpl dmxDetail = new DmxDetailImpl();
		return dmxDetail;
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
