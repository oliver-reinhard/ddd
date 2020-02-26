/**
 */
package com.mimacom.ddd.dm.dmx.util;

import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DSimpleType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.dm.base.IValueType;

import com.mimacom.ddd.dm.dmx.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dmx.DmxPackage
 * @generated
 */
public class DmxSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DmxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DmxPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case DmxPackage.DMX_MODEL:
			{
				DmxModel dmxModel = (DmxModel)theEObject;
				T result = caseDmxModel(dmxModel);
				if (result == null) result = caseDModel(dmxModel);
				if (result == null) result = caseITypeContainer(dmxModel);
				if (result == null) result = caseDNamedElement(dmxModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_TEST:
			{
				DmxTest dmxTest = (DmxTest)theEObject;
				T result = caseDmxTest(dmxTest);
				if (result == null) result = caseINavigableMemberContainer(dmxTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_TEST_CONTEXT:
			{
				DmxTestContext dmxTestContext = (DmxTestContext)theEObject;
				T result = caseDmxTestContext(dmxTestContext);
				if (result == null) result = caseDContext(dmxTestContext);
				if (result == null) result = caseDNavigableMember(dmxTestContext);
				if (result == null) result = caseDNamedElement(dmxTestContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_BASE_TYPE_SET:
			{
				DmxBaseTypeSet dmxBaseTypeSet = (DmxBaseTypeSet)theEObject;
				T result = caseDmxBaseTypeSet(dmxBaseTypeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_ARCHETYPE:
			{
				DmxArchetype dmxArchetype = (DmxArchetype)theEObject;
				T result = caseDmxArchetype(dmxArchetype);
				if (result == null) result = caseDPrimitive(dmxArchetype);
				if (result == null) result = caseDSimpleType(dmxArchetype);
				if (result == null) result = caseDType(dmxArchetype);
				if (result == null) result = caseIValueType(dmxArchetype);
				if (result == null) result = caseIDeducibleElement(dmxArchetype);
				if (result == null) result = caseIStaticReferenceTarget(dmxArchetype);
				if (result == null) result = caseDNamedElement(dmxArchetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_FILTER:
			{
				DmxFilter dmxFilter = (DmxFilter)theEObject;
				T result = caseDmxFilter(dmxFilter);
				if (result == null) result = caseDNavigableMember(dmxFilter);
				if (result == null) result = caseDNamedElement(dmxFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR:
			{
				DmxFilterTypeDescriptor dmxFilterTypeDescriptor = (DmxFilterTypeDescriptor)theEObject;
				T result = caseDmxFilterTypeDescriptor(dmxFilterTypeDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_FILTER_PARAMETER:
			{
				DmxFilterParameter dmxFilterParameter = (DmxFilterParameter)theEObject;
				T result = caseDmxFilterParameter(dmxFilterParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_ASSIGNMENT:
			{
				DmxAssignment dmxAssignment = (DmxAssignment)theEObject;
				T result = caseDmxAssignment(dmxAssignment);
				if (result == null) result = caseDExpression(dmxAssignment);
				if (result == null) result = caseIRichTextSegment(dmxAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE:
			{
				DmxPredicateWithCorrelationVariable dmxPredicateWithCorrelationVariable = (DmxPredicateWithCorrelationVariable)theEObject;
				T result = caseDmxPredicateWithCorrelationVariable(dmxPredicateWithCorrelationVariable);
				if (result == null) result = caseDExpression(dmxPredicateWithCorrelationVariable);
				if (result == null) result = caseINavigableMemberContainer(dmxPredicateWithCorrelationVariable);
				if (result == null) result = caseIRichTextSegment(dmxPredicateWithCorrelationVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_CORRELATION_VARIABLE:
			{
				DmxCorrelationVariable dmxCorrelationVariable = (DmxCorrelationVariable)theEObject;
				T result = caseDmxCorrelationVariable(dmxCorrelationVariable);
				if (result == null) result = caseDNavigableMember(dmxCorrelationVariable);
				if (result == null) result = caseDNamedElement(dmxCorrelationVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_MEMBER_NAVIGATION:
			{
				DmxMemberNavigation dmxMemberNavigation = (DmxMemberNavigation)theEObject;
				T result = caseDmxMemberNavigation(dmxMemberNavigation);
				if (result == null) result = caseDExpression(dmxMemberNavigation);
				if (result == null) result = caseIRichTextSegment(dmxMemberNavigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_CALL_ARGUMENTS:
			{
				DmxCallArguments dmxCallArguments = (DmxCallArguments)theEObject;
				T result = caseDmxCallArguments(dmxCallArguments);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_FUNCTION_CALL:
			{
				DmxFunctionCall dmxFunctionCall = (DmxFunctionCall)theEObject;
				T result = caseDmxFunctionCall(dmxFunctionCall);
				if (result == null) result = caseDExpression(dmxFunctionCall);
				if (result == null) result = caseIRichTextSegment(dmxFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_BINARY_OPERATION:
			{
				DmxBinaryOperation dmxBinaryOperation = (DmxBinaryOperation)theEObject;
				T result = caseDmxBinaryOperation(dmxBinaryOperation);
				if (result == null) result = caseDExpression(dmxBinaryOperation);
				if (result == null) result = caseIRichTextSegment(dmxBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION:
			{
				DmxInstanceOfExpression dmxInstanceOfExpression = (DmxInstanceOfExpression)theEObject;
				T result = caseDmxInstanceOfExpression(dmxInstanceOfExpression);
				if (result == null) result = caseDExpression(dmxInstanceOfExpression);
				if (result == null) result = caseIRichTextSegment(dmxInstanceOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_UNARY_OPERATION:
			{
				DmxUnaryOperation dmxUnaryOperation = (DmxUnaryOperation)theEObject;
				T result = caseDmxUnaryOperation(dmxUnaryOperation);
				if (result == null) result = caseDExpression(dmxUnaryOperation);
				if (result == null) result = caseIRichTextSegment(dmxUnaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_CAST_EXPRESSION:
			{
				DmxCastExpression dmxCastExpression = (DmxCastExpression)theEObject;
				T result = caseDmxCastExpression(dmxCastExpression);
				if (result == null) result = caseDExpression(dmxCastExpression);
				if (result == null) result = caseIRichTextSegment(dmxCastExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_LIST_EXPRESSION:
			{
				DmxListExpression dmxListExpression = (DmxListExpression)theEObject;
				T result = caseDmxListExpression(dmxListExpression);
				if (result == null) result = caseDExpression(dmxListExpression);
				if (result == null) result = caseIRichTextSegment(dmxListExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_STATIC_REFERENCE:
			{
				DmxStaticReference dmxStaticReference = (DmxStaticReference)theEObject;
				T result = caseDmxStaticReference(dmxStaticReference);
				if (result == null) result = caseDExpression(dmxStaticReference);
				if (result == null) result = caseIRichTextSegment(dmxStaticReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_CONTEXT_REFERENCE:
			{
				DmxContextReference dmxContextReference = (DmxContextReference)theEObject;
				T result = caseDmxContextReference(dmxContextReference);
				if (result == null) result = caseDExpression(dmxContextReference);
				if (result == null) result = caseIRichTextSegment(dmxContextReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_IF_EXPRESSION:
			{
				DmxIfExpression dmxIfExpression = (DmxIfExpression)theEObject;
				T result = caseDmxIfExpression(dmxIfExpression);
				if (result == null) result = caseDExpression(dmxIfExpression);
				if (result == null) result = caseIRichTextSegment(dmxIfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_BOOLEAN_LITERAL:
			{
				DmxBooleanLiteral dmxBooleanLiteral = (DmxBooleanLiteral)theEObject;
				T result = caseDmxBooleanLiteral(dmxBooleanLiteral);
				if (result == null) result = caseDExpression(dmxBooleanLiteral);
				if (result == null) result = caseIRichTextSegment(dmxBooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_STRING_LITERAL:
			{
				DmxStringLiteral dmxStringLiteral = (DmxStringLiteral)theEObject;
				T result = caseDmxStringLiteral(dmxStringLiteral);
				if (result == null) result = caseDExpression(dmxStringLiteral);
				if (result == null) result = caseIRichTextSegment(dmxStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_NATURAL_LITERAL:
			{
				DmxNaturalLiteral dmxNaturalLiteral = (DmxNaturalLiteral)theEObject;
				T result = caseDmxNaturalLiteral(dmxNaturalLiteral);
				if (result == null) result = caseDExpression(dmxNaturalLiteral);
				if (result == null) result = caseIRichTextSegment(dmxNaturalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_DECIMAL_LITERAL:
			{
				DmxDecimalLiteral dmxDecimalLiteral = (DmxDecimalLiteral)theEObject;
				T result = caseDmxDecimalLiteral(dmxDecimalLiteral);
				if (result == null) result = caseDExpression(dmxDecimalLiteral);
				if (result == null) result = caseIRichTextSegment(dmxDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_DATE_LITERAL:
			{
				DmxDateLiteral dmxDateLiteral = (DmxDateLiteral)theEObject;
				T result = caseDmxDateLiteral(dmxDateLiteral);
				if (result == null) result = caseDExpression(dmxDateLiteral);
				if (result == null) result = caseIRichTextSegment(dmxDateLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_URL_LITERAL:
			{
				DmxUrlLiteral dmxUrlLiteral = (DmxUrlLiteral)theEObject;
				T result = caseDmxUrlLiteral(dmxUrlLiteral);
				if (result == null) result = caseDExpression(dmxUrlLiteral);
				if (result == null) result = caseIRichTextSegment(dmxUrlLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_UNDEFINED_LITERAL:
			{
				DmxUndefinedLiteral dmxUndefinedLiteral = (DmxUndefinedLiteral)theEObject;
				T result = caseDmxUndefinedLiteral(dmxUndefinedLiteral);
				if (result == null) result = caseDExpression(dmxUndefinedLiteral);
				if (result == null) result = caseIRichTextSegment(dmxUndefinedLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_COMPLEX_OBJECT:
			{
				DmxComplexObject dmxComplexObject = (DmxComplexObject)theEObject;
				T result = caseDmxComplexObject(dmxComplexObject);
				if (result == null) result = caseINavigableMemberContainer(dmxComplexObject);
				if (result == null) result = caseDExpression(dmxComplexObject);
				if (result == null) result = caseIRichTextSegment(dmxComplexObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_FIELD:
			{
				DmxField dmxField = (DmxField)theEObject;
				T result = caseDmxField(dmxField);
				if (result == null) result = caseDNavigableMember(dmxField);
				if (result == null) result = caseDNamedElement(dmxField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_ENTITY:
			{
				DmxEntity dmxEntity = (DmxEntity)theEObject;
				T result = caseDmxEntity(dmxEntity);
				if (result == null) result = caseDmxComplexObject(dmxEntity);
				if (result == null) result = caseINavigableMemberContainer(dmxEntity);
				if (result == null) result = caseDExpression(dmxEntity);
				if (result == null) result = caseIRichTextSegment(dmxEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_DETAIL:
			{
				DmxDetail dmxDetail = (DmxDetail)theEObject;
				T result = caseDmxDetail(dmxDetail);
				if (result == null) result = caseDmxComplexObject(dmxDetail);
				if (result == null) result = caseINavigableMemberContainer(dmxDetail);
				if (result == null) result = caseDExpression(dmxDetail);
				if (result == null) result = caseIRichTextSegment(dmxDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxModel(DmxModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxTest(DmxTest object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxTestContext(DmxTestContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Type Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxBaseTypeSet(DmxBaseTypeSet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archetype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxArchetype(DmxArchetype object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxFilter(DmxFilter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxFilterTypeDescriptor(DmxFilterTypeDescriptor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxFilterParameter(DmxFilterParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxAssignment(DmxAssignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate With Correlation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate With Correlation Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxPredicateWithCorrelationVariable(DmxPredicateWithCorrelationVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxCorrelationVariable(DmxCorrelationVariable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxMemberNavigation(DmxMemberNavigation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxCallArguments(DmxCallArguments object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxFunctionCall(DmxFunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxBinaryOperation(DmxBinaryOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxInstanceOfExpression(DmxInstanceOfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxUnaryOperation(DmxUnaryOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxCastExpression(DmxCastExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxListExpression(DmxListExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxStaticReference(DmxStaticReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxContextReference(DmxContextReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxIfExpression(DmxIfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxBooleanLiteral(DmxBooleanLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxStringLiteral(DmxStringLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxNaturalLiteral(DmxNaturalLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxDecimalLiteral(DmxDecimalLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxDateLiteral(DmxDateLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxUrlLiteral(DmxUrlLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undefined Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undefined Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxUndefinedLiteral(DmxUndefinedLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxComplexObject(DmxComplexObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxField(DmxField object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxEntity(DmxEntity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxDetail(DmxDetail object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNamedElement(DNamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDModel(DModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypeContainer(ITypeContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INavigable Member Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INavigable Member Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINavigableMemberContainer(INavigableMemberContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNavigable Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNavigable Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNavigableMember(DNavigableMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDContext(DContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDeducible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDeducible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDeducibleElement(IDeducibleElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStatic Reference Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStatic Reference Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaticReferenceTarget(IStaticReferenceTarget object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDType(DType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IValue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IValue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIValueType(IValueType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSimple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSimple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSimpleType(DSimpleType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPrimitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPrimitive(DPrimitive object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRichTextSegment(IRichTextSegment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDExpression(DExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //DmxSwitch
