/**
 */
package com.mimacom.ddd.dm.dmx.util;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.IRichTextElement;

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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DASSIGNMENT:
			{
				DAssignment dAssignment = (DAssignment)theEObject;
				T result = caseDAssignment(dAssignment);
				if (result == null) result = caseDExpression(dAssignment);
				if (result == null) result = caseIRichTextElement(dAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DBINARY_OPERATION:
			{
				DBinaryOperation dBinaryOperation = (DBinaryOperation)theEObject;
				T result = caseDBinaryOperation(dBinaryOperation);
				if (result == null) result = caseDExpression(dBinaryOperation);
				if (result == null) result = caseIRichTextElement(dBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DINSTANCE_OF_EXPRESSION:
			{
				DInstanceOfExpression dInstanceOfExpression = (DInstanceOfExpression)theEObject;
				T result = caseDInstanceOfExpression(dInstanceOfExpression);
				if (result == null) result = caseDExpression(dInstanceOfExpression);
				if (result == null) result = caseIRichTextElement(dInstanceOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DUNARY_OPERATION:
			{
				DUnaryOperation dUnaryOperation = (DUnaryOperation)theEObject;
				T result = caseDUnaryOperation(dUnaryOperation);
				if (result == null) result = caseDExpression(dUnaryOperation);
				if (result == null) result = caseIRichTextElement(dUnaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DTYPED_MEMBER_REFERENCE:
			{
				DTypedMemberReference dTypedMemberReference = (DTypedMemberReference)theEObject;
				T result = caseDTypedMemberReference(dTypedMemberReference);
				if (result == null) result = caseDExpression(dTypedMemberReference);
				if (result == null) result = caseIRichTextElement(dTypedMemberReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DCAST_EXPRESSION:
			{
				DCastExpression dCastExpression = (DCastExpression)theEObject;
				T result = caseDCastExpression(dCastExpression);
				if (result == null) result = caseDExpression(dCastExpression);
				if (result == null) result = caseIRichTextElement(dCastExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DSELF_EXPRESSION:
			{
				DSelfExpression dSelfExpression = (DSelfExpression)theEObject;
				T result = caseDSelfExpression(dSelfExpression);
				if (result == null) result = caseDExpression(dSelfExpression);
				if (result == null) result = caseIRichTextElement(dSelfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DRETURN_EXPRESSION:
			{
				DReturnExpression dReturnExpression = (DReturnExpression)theEObject;
				T result = caseDReturnExpression(dReturnExpression);
				if (result == null) result = caseDExpression(dReturnExpression);
				if (result == null) result = caseIRichTextElement(dReturnExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DRAISE_EXPRESSION:
			{
				DRaiseExpression dRaiseExpression = (DRaiseExpression)theEObject;
				T result = caseDRaiseExpression(dRaiseExpression);
				if (result == null) result = caseDExpression(dRaiseExpression);
				if (result == null) result = caseIRichTextElement(dRaiseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DFUNCTION_CALL:
			{
				DFunctionCall dFunctionCall = (DFunctionCall)theEObject;
				T result = caseDFunctionCall(dFunctionCall);
				if (result == null) result = caseDExpression(dFunctionCall);
				if (result == null) result = caseIRichTextElement(dFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DCONSTRUCTOR_CALL:
			{
				DConstructorCall dConstructorCall = (DConstructorCall)theEObject;
				T result = caseDConstructorCall(dConstructorCall);
				if (result == null) result = caseDExpression(dConstructorCall);
				if (result == null) result = caseIRichTextElement(dConstructorCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DCONTEXT_REFERENCE:
			{
				DContextReference dContextReference = (DContextReference)theEObject;
				T result = caseDContextReference(dContextReference);
				if (result == null) result = caseDExpression(dContextReference);
				if (result == null) result = caseIRichTextElement(dContextReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DIF_EXPRESSION:
			{
				DIfExpression dIfExpression = (DIfExpression)theEObject;
				T result = caseDIfExpression(dIfExpression);
				if (result == null) result = caseDExpression(dIfExpression);
				if (result == null) result = caseIRichTextElement(dIfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DFOR_LOOP_EXPRESSION:
			{
				DForLoopExpression dForLoopExpression = (DForLoopExpression)theEObject;
				T result = caseDForLoopExpression(dForLoopExpression);
				if (result == null) result = caseDExpression(dForLoopExpression);
				if (result == null) result = caseIRichTextElement(dForLoopExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DBOOLEAN_LITERAL:
			{
				DBooleanLiteral dBooleanLiteral = (DBooleanLiteral)theEObject;
				T result = caseDBooleanLiteral(dBooleanLiteral);
				if (result == null) result = caseDExpression(dBooleanLiteral);
				if (result == null) result = caseIRichTextElement(dBooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DSTRING_LITERAL:
			{
				DStringLiteral dStringLiteral = (DStringLiteral)theEObject;
				T result = caseDStringLiteral(dStringLiteral);
				if (result == null) result = caseDExpression(dStringLiteral);
				if (result == null) result = caseIRichTextElement(dStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DNATURAL_LITERAL:
			{
				DNaturalLiteral dNaturalLiteral = (DNaturalLiteral)theEObject;
				T result = caseDNaturalLiteral(dNaturalLiteral);
				if (result == null) result = caseDExpression(dNaturalLiteral);
				if (result == null) result = caseIRichTextElement(dNaturalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DDECIMAL_LITERAL:
			{
				DDecimalLiteral dDecimalLiteral = (DDecimalLiteral)theEObject;
				T result = caseDDecimalLiteral(dDecimalLiteral);
				if (result == null) result = caseDExpression(dDecimalLiteral);
				if (result == null) result = caseIRichTextElement(dDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DDATE_LITERAL:
			{
				DDateLiteral dDateLiteral = (DDateLiteral)theEObject;
				T result = caseDDateLiteral(dDateLiteral);
				if (result == null) result = caseDExpression(dDateLiteral);
				if (result == null) result = caseIRichTextElement(dDateLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DmxPackage.DUNDEFINED_LITERAL:
			{
				DUndefinedLiteral dUndefinedLiteral = (DUndefinedLiteral)theEObject;
				T result = caseDUndefinedLiteral(dUndefinedLiteral);
				if (result == null) result = caseDExpression(dUndefinedLiteral);
				if (result == null) result = caseIRichTextElement(dUndefinedLiteral);
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
	 * Returns the result of interpreting the object as an instance of '<em>DAssignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAssignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAssignment(DAssignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBinary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBinary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBinaryOperation(DBinaryOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInstance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInstance Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInstanceOfExpression(DInstanceOfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DUnary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DUnary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDUnaryOperation(DUnaryOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTyped Member Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTyped Member Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTypedMemberReference(DTypedMemberReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCastExpression(DCastExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSelf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSelf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSelfExpression(DSelfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DReturn Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DReturn Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDReturnExpression(DReturnExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DRaise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DRaise Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDRaiseExpression(DRaiseExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFunction Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFunction Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFunctionCall(DFunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DConstructor Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DConstructor Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDConstructorCall(DConstructorCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DContext Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DContext Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDContextReference(DContextReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DIf Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIf Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIfExpression(DIfExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFor Loop Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFor Loop Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDForLoopExpression(DForLoopExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBoolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBoolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBooleanLiteral(DBooleanLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DString Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DString Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDStringLiteral(DStringLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNatural Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNatural Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNaturalLiteral(DNaturalLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDecimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDecimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDecimalLiteral(DDecimalLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDate Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDate Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDateLiteral(DDateLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DUndefined Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DUndefined Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDUndefinedLiteral(DUndefinedLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRich Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRich Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRichTextElement(IRichTextElement object)
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
