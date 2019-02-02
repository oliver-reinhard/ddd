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
			case DmxPackage.DASSIGNMENT: return createDAssignment();
			case DmxPackage.DBINARY_OPERATION: return createDBinaryOperation();
			case DmxPackage.DINSTANCE_OF_EXPRESSION: return createDInstanceOfExpression();
			case DmxPackage.DUNARY_OPERATION: return createDUnaryOperation();
			case DmxPackage.DTYPED_MEMBER_REFERENCE: return createDTypedMemberReference();
			case DmxPackage.DCAST_EXPRESSION: return createDCastExpression();
			case DmxPackage.DSELF_EXPRESSION: return createDSelfExpression();
			case DmxPackage.DRETURN_EXPRESSION: return createDReturnExpression();
			case DmxPackage.DRAISE_EXPRESSION: return createDRaiseExpression();
			case DmxPackage.DFUNCTION_CALL: return createDFunctionCall();
			case DmxPackage.DCONSTRUCTOR_CALL: return createDConstructorCall();
			case DmxPackage.DCONTEXT_REFERENCE: return createDContextReference();
			case DmxPackage.DIF_EXPRESSION: return createDIfExpression();
			case DmxPackage.DFOR_LOOP_EXPRESSION: return createDForLoopExpression();
			case DmxPackage.DBOOLEAN_LITERAL: return createDBooleanLiteral();
			case DmxPackage.DSTRING_LITERAL: return createDStringLiteral();
			case DmxPackage.DNATURAL_LITERAL: return createDNaturalLiteral();
			case DmxPackage.DDECIMAL_LITERAL: return createDDecimalLiteral();
			case DmxPackage.DDATE_LITERAL: return createDDateLiteral();
			case DmxPackage.DUNDEFINED_LITERAL: return createDUndefinedLiteral();
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
			case DmxPackage.DBINARY_OPERATOR:
				return createDBinaryOperatorFromString(eDataType, initialValue);
			case DmxPackage.DUNARY_OPERATOR:
				return createDUnaryOperatorFromString(eDataType, initialValue);
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
			case DmxPackage.DBINARY_OPERATOR:
				return convertDBinaryOperatorToString(eDataType, instanceValue);
			case DmxPackage.DUNARY_OPERATOR:
				return convertDUnaryOperatorToString(eDataType, instanceValue);
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
	@Override
	public DAssignment createDAssignment()
	{
		DAssignmentImpl dAssignment = new DAssignmentImpl();
		return dAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBinaryOperation createDBinaryOperation()
	{
		DBinaryOperationImpl dBinaryOperation = new DBinaryOperationImpl();
		return dBinaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DInstanceOfExpression createDInstanceOfExpression()
	{
		DInstanceOfExpressionImpl dInstanceOfExpression = new DInstanceOfExpressionImpl();
		return dInstanceOfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DUnaryOperation createDUnaryOperation()
	{
		DUnaryOperationImpl dUnaryOperation = new DUnaryOperationImpl();
		return dUnaryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTypedMemberReference createDTypedMemberReference()
	{
		DTypedMemberReferenceImpl dTypedMemberReference = new DTypedMemberReferenceImpl();
		return dTypedMemberReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCastExpression createDCastExpression()
	{
		DCastExpressionImpl dCastExpression = new DCastExpressionImpl();
		return dCastExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSelfExpression createDSelfExpression()
	{
		DSelfExpressionImpl dSelfExpression = new DSelfExpressionImpl();
		return dSelfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DReturnExpression createDReturnExpression()
	{
		DReturnExpressionImpl dReturnExpression = new DReturnExpressionImpl();
		return dReturnExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRaiseExpression createDRaiseExpression()
	{
		DRaiseExpressionImpl dRaiseExpression = new DRaiseExpressionImpl();
		return dRaiseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DFunctionCall createDFunctionCall()
	{
		DFunctionCallImpl dFunctionCall = new DFunctionCallImpl();
		return dFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DConstructorCall createDConstructorCall()
	{
		DConstructorCallImpl dConstructorCall = new DConstructorCallImpl();
		return dConstructorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DContextReference createDContextReference()
	{
		DContextReferenceImpl dContextReference = new DContextReferenceImpl();
		return dContextReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DIfExpression createDIfExpression()
	{
		DIfExpressionImpl dIfExpression = new DIfExpressionImpl();
		return dIfExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DForLoopExpression createDForLoopExpression()
	{
		DForLoopExpressionImpl dForLoopExpression = new DForLoopExpressionImpl();
		return dForLoopExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DBooleanLiteral createDBooleanLiteral()
	{
		DBooleanLiteralImpl dBooleanLiteral = new DBooleanLiteralImpl();
		return dBooleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DStringLiteral createDStringLiteral()
	{
		DStringLiteralImpl dStringLiteral = new DStringLiteralImpl();
		return dStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNaturalLiteral createDNaturalLiteral()
	{
		DNaturalLiteralImpl dNaturalLiteral = new DNaturalLiteralImpl();
		return dNaturalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDecimalLiteral createDDecimalLiteral()
	{
		DDecimalLiteralImpl dDecimalLiteral = new DDecimalLiteralImpl();
		return dDecimalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDateLiteral createDDateLiteral()
	{
		DDateLiteralImpl dDateLiteral = new DDateLiteralImpl();
		return dDateLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DUndefinedLiteral createDUndefinedLiteral()
	{
		DUndefinedLiteralImpl dUndefinedLiteral = new DUndefinedLiteralImpl();
		return dUndefinedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBinaryOperator createDBinaryOperatorFromString(EDataType eDataType, String initialValue)
	{
		DBinaryOperator result = DBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDBinaryOperatorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DUnaryOperator createDUnaryOperatorFromString(EDataType eDataType, String initialValue)
	{
		DUnaryOperator result = DUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDUnaryOperatorToString(EDataType eDataType, Object instanceValue)
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
