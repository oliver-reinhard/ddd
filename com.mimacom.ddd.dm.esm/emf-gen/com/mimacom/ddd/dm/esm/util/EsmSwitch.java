/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.util;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.INamespace;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import com.mimacom.ddd.dm.esm.*;

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
 * @see com.mimacom.ddd.dm.esm.EsmPackage
 * @generated
 */
public class EsmSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsmSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = EsmPackage.eINSTANCE;
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
			case EsmPackage.ESM_DOMAIN:
			{
				EsmDomain esmDomain = (EsmDomain)theEObject;
				T result = caseEsmDomain(esmDomain);
				if (result == null) result = caseDNamedElement(esmDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.IESM_LAYOUT:
			{
				IEsmLayout iEsmLayout = (IEsmLayout)theEObject;
				T result = caseIEsmLayout(iEsmLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.IESM_STATE_MODEL:
			{
				IEsmStateModel iEsmStateModel = (IEsmStateModel)theEObject;
				T result = caseIEsmStateModel(iEsmStateModel);
				if (result == null) result = caseIEsmLayout(iEsmStateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_ENTITY_STATE_MODEL:
			{
				EsmEntityStateModel esmEntityStateModel = (EsmEntityStateModel)theEObject;
				T result = caseEsmEntityStateModel(esmEntityStateModel);
				if (result == null) result = caseDNamedElement(esmEntityStateModel);
				if (result == null) result = caseIEsmStateModel(esmEntityStateModel);
				if (result == null) result = caseINavigableMemberContainer(esmEntityStateModel);
				if (result == null) result = caseIEsmLayout(esmEntityStateModel);
				if (result == null) result = caseINamespace(esmEntityStateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.IESM_STATE:
			{
				IEsmState iEsmState = (IEsmState)theEObject;
				T result = caseIEsmState(iEsmState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_STATE:
			{
				EsmState esmState = (EsmState)theEObject;
				T result = caseEsmState(esmState);
				if (result == null) result = caseIEsmState(esmState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_DERIVED_STATE:
			{
				EsmDerivedState esmDerivedState = (EsmDerivedState)theEObject;
				T result = caseEsmDerivedState(esmDerivedState);
				if (result == null) result = caseEsmState(esmDerivedState);
				if (result == null) result = caseIEsmState(esmDerivedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_COMPOSITE_STATE:
			{
				EsmCompositeState esmCompositeState = (EsmCompositeState)theEObject;
				T result = caseEsmCompositeState(esmCompositeState);
				if (result == null) result = caseIEsmState(esmCompositeState);
				if (result == null) result = caseIEsmStateModel(esmCompositeState);
				if (result == null) result = caseIEsmLayout(esmCompositeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_CONCURRENT_STATE:
			{
				EsmConcurrentState esmConcurrentState = (EsmConcurrentState)theEObject;
				T result = caseEsmConcurrentState(esmConcurrentState);
				if (result == null) result = caseIEsmState(esmConcurrentState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_SUB_STATE_MODEL:
			{
				EsmSubStateModel esmSubStateModel = (EsmSubStateModel)theEObject;
				T result = caseEsmSubStateModel(esmSubStateModel);
				if (result == null) result = caseIEsmStateModel(esmSubStateModel);
				if (result == null) result = caseIEsmLayout(esmSubStateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EsmPackage.ESM_TRANSITION:
			{
				EsmTransition esmTransition = (EsmTransition)theEObject;
				T result = caseEsmTransition(esmTransition);
				if (result == null) result = caseIEsmLayout(esmTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmDomain(EsmDomain object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEsm Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEsm Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEsmLayout(IEsmLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEsm State Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEsm State Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEsmStateModel(IEsmStateModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity State Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity State Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmEntityStateModel(EsmEntityStateModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEsm State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEsm State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEsmState(IEsmState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmState(EsmState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmDerivedState(EsmDerivedState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmCompositeState(EsmCompositeState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrent State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrent State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmConcurrentState(EsmConcurrentState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub State Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub State Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmSubStateModel(EsmSubStateModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsmTransition(EsmTransition object)
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

} //EsmSwitch
