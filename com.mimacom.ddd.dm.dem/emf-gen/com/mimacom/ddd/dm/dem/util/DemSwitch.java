/**
 */
package com.mimacom.ddd.dm.dem.util;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;

import com.mimacom.ddd.dm.dem.*;

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
 * @see com.mimacom.ddd.dm.dem.DemPackage
 * @generated
 */
public class DemSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DemPackage.eINSTANCE;
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
			case DemPackage.DEM_MODEL:
			{
				DemModel demModel = (DemModel)theEObject;
				T result = caseDemModel(demModel);
				if (result == null) result = caseDNamespace(demModel);
				if (result == null) result = caseDNamedElement(demModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DDOMAIN_EVENT:
			{
				DDomainEvent dDomainEvent = (DDomainEvent)theEObject;
				T result = caseDDomainEvent(dDomainEvent);
				if (result == null) result = caseDemModel(dDomainEvent);
				if (result == null) result = caseINavigableMemberContainer(dDomainEvent);
				if (result == null) result = caseIStaticReferenceTarget(dDomainEvent);
				if (result == null) result = caseIDiagramRoot(dDomainEvent);
				if (result == null) result = caseDNamespace(dDomainEvent);
				if (result == null) result = caseDNamedElement(dDomainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DCASE_CONJUNCTION:
			{
				DCaseConjunction dCaseConjunction = (DCaseConjunction)theEObject;
				T result = caseDCaseConjunction(dCaseConjunction);
				if (result == null) result = caseDNamedElement(dCaseConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DNOTIFICATION:
			{
				DNotification dNotification = (DNotification)theEObject;
				T result = caseDNotification(dNotification);
				if (result == null) result = caseDNavigableMember(dNotification);
				if (result == null) result = caseINavigableMemberContainer(dNotification);
				if (result == null) result = caseDNamedElement(dNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DMESSAGE:
			{
				DMessage dMessage = (DMessage)theEObject;
				T result = caseDMessage(dMessage);
				if (result == null) result = caseDNavigableMember(dMessage);
				if (result == null) result = caseDNamedElement(dMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_ACTOR_MODEL:
			{
				DemActorModel demActorModel = (DemActorModel)theEObject;
				T result = caseDemActorModel(demActorModel);
				if (result == null) result = caseDemModel(demActorModel);
				if (result == null) result = caseDNamespace(demActorModel);
				if (result == null) result = caseDNamedElement(demActorModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DACTOR:
			{
				DActor dActor = (DActor)theEObject;
				T result = caseDActor(dActor);
				if (result == null) result = caseDNavigableMember(dActor);
				if (result == null) result = caseIStaticReferenceTarget(dActor);
				if (result == null) result = caseDNamedElement(dActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DHUMAN_ACTOR_ROLE:
			{
				DHumanActorRole dHumanActorRole = (DHumanActorRole)theEObject;
				T result = caseDHumanActorRole(dHumanActorRole);
				if (result == null) result = caseDActor(dHumanActorRole);
				if (result == null) result = caseDNavigableMember(dHumanActorRole);
				if (result == null) result = caseIStaticReferenceTarget(dHumanActorRole);
				if (result == null) result = caseDNamedElement(dHumanActorRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DSERVICE:
			{
				DService dService = (DService)theEObject;
				T result = caseDService(dService);
				if (result == null) result = caseDActor(dService);
				if (result == null) result = caseDNavigableMember(dService);
				if (result == null) result = caseIStaticReferenceTarget(dService);
				if (result == null) result = caseDNamedElement(dService);
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
	public T caseDemModel(DemModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDomain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDomain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDomainEvent(DDomainEvent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DCase Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCase Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCaseConjunction(DCaseConjunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNotification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNotification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNotification(DNotification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMessage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMessage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMessage(DMessage object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemActorModel(DemActorModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DActor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DActor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDActor(DActor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DHuman Actor Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DHuman Actor Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDHumanActorRole(DHumanActorRole object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDService(DService object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DNamespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNamespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNamespace(DNamespace object)
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
	 * Returns the result of interpreting the object as an instance of '<em>IDiagram Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDiagram Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDiagramRoot(IDiagramRoot object)
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

} //DemSwitch
