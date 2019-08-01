/**
 */
package com.mimacom.ddd.dm.dmx.util;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DSimpleType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.INamespace;
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
			case DmxPackage.DMX_NAMESPACE:
			{
				DmxNamespace dmxNamespace = (DmxNamespace)theEObject;
				T result = caseDmxNamespace(dmxNamespace);
				if (result == null) result = caseDNamedElement(dmxNamespace);
				if (result == null) result = caseITypeContainer(dmxNamespace);
				if (result == null) result = caseINamespace(dmxNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_TEST:
			{
				DmxTest dmxTest = (DmxTest)theEObject;
				T result = caseDmxTest(dmxTest);
				if (result == null) result = caseINavigableMemberContainer(dmxTest);
				if (result == null) result = caseINamespace(dmxTest);
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
			case DmxPackage.DMX_FUNCTION:
			{
				DmxFunction dmxFunction = (DmxFunction)theEObject;
				T result = caseDmxFunction(dmxFunction);
				if (result == null) result = caseDmxFilter(dmxFunction);
				if (result == null) result = caseDNavigableMember(dmxFunction);
				if (result == null) result = caseDNamedElement(dmxFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_FUNCTION_PARAMETER:
			{
				DmxFunctionParameter dmxFunctionParameter = (DmxFunctionParameter)theEObject;
				T result = caseDmxFunctionParameter(dmxFunctionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_ITERATOR:
			{
				DmxIterator dmxIterator = (DmxIterator)theEObject;
				T result = caseDmxIterator(dmxIterator);
				if (result == null) result = caseDmxFilter(dmxIterator);
				if (result == null) result = caseDNavigableMember(dmxIterator);
				if (result == null) result = caseDNamedElement(dmxIterator);
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
				if (result == null) result = caseINamespace(dmxPredicateWithCorrelationVariable);
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
			case DmxPackage.DMX_SELF_EXPRESSION:
			{
				DmxSelfExpression dmxSelfExpression = (DmxSelfExpression)theEObject;
				T result = caseDmxSelfExpression(dmxSelfExpression);
				if (result == null) result = caseDExpression(dmxSelfExpression);
				if (result == null) result = caseIRichTextSegment(dmxSelfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_RETURN_EXPRESSION:
			{
				DmxReturnExpression dmxReturnExpression = (DmxReturnExpression)theEObject;
				T result = caseDmxReturnExpression(dmxReturnExpression);
				if (result == null) result = caseDExpression(dmxReturnExpression);
				if (result == null) result = caseIRichTextSegment(dmxReturnExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DMX_RAISE_EXPRESSION:
			{
				DmxRaiseExpression dmxRaiseExpression = (DmxRaiseExpression)theEObject;
				T result = caseDmxRaiseExpression(dmxRaiseExpression);
				if (result == null) result = caseDExpression(dmxRaiseExpression);
				if (result == null) result = caseIRichTextSegment(dmxRaiseExpression);
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
			case DmxPackage.DMX_CONSTRUCTOR_CALL:
			{
				DmxConstructorCall dmxConstructorCall = (DmxConstructorCall)theEObject;
				T result = caseDmxConstructorCall(dmxConstructorCall);
				if (result == null) result = caseDExpression(dmxConstructorCall);
				if (result == null) result = caseIRichTextSegment(dmxConstructorCall);
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
			case DmxPackage.DMX_FOR_LOOP_EXPRESSION:
			{
				DmxForLoopExpression dmxForLoopExpression = (DmxForLoopExpression)theEObject;
				T result = caseDmxForLoopExpression(dmxForLoopExpression);
				if (result == null) result = caseDExpression(dmxForLoopExpression);
				if (result == null) result = caseIRichTextSegment(dmxForLoopExpression);
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
			case DmxPackage.DMX_UNDEFINED_LITERAL:
			{
				DmxUndefinedLiteral dmxUndefinedLiteral = (DmxUndefinedLiteral)theEObject;
				T result = caseDmxUndefinedLiteral(dmxUndefinedLiteral);
				if (result == null) result = caseDExpression(dmxUndefinedLiteral);
				if (result == null) result = caseIRichTextSegment(dmxUndefinedLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxNamespace(DmxNamespace object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxFunction(DmxFunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxFunctionParameter(DmxFunctionParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxIterator(DmxIterator object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Self Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxSelfExpression(DmxSelfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxReturnExpression(DmxReturnExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxRaiseExpression(DmxRaiseExpression object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxConstructorCall(DmxConstructorCall object)
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
	 * Returns the result of interpreting the object as an instance of '<em>For Loop Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDmxForLoopExpression(DmxForLoopExpression object)
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
	 * Returns the result of interpreting the object as an instance of '<em>INamespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamespace(INamespace object)
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
