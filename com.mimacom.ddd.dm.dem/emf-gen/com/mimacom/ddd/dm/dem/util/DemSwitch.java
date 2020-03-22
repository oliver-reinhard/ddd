/**
 */
package com.mimacom.ddd.dm.dem.util;

import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamedElement;
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
			case DemPackage.DEM_DOMAIN_EVENT:
			{
				DemDomainEvent demDomainEvent = (DemDomainEvent)theEObject;
				T result = caseDemDomainEvent(demDomainEvent);
				if (result == null) result = caseDModel(demDomainEvent);
				if (result == null) result = caseINavigableMemberContainer(demDomainEvent);
				if (result == null) result = caseIStaticReferenceTarget(demDomainEvent);
				if (result == null) result = caseIDiagramRoot(demDomainEvent);
				if (result == null) result = caseDNamedElement(demDomainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_CASE_CONJUNCTION:
			{
				DemCaseConjunction demCaseConjunction = (DemCaseConjunction)theEObject;
				T result = caseDemCaseConjunction(demCaseConjunction);
				if (result == null) result = caseDNamedElement(demCaseConjunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_NOTIFICATION:
			{
				DemNotification demNotification = (DemNotification)theEObject;
				T result = caseDemNotification(demNotification);
				if (result == null) result = caseDNavigableMember(demNotification);
				if (result == null) result = caseINavigableMemberContainer(demNotification);
				if (result == null) result = caseDNamedElement(demNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_MESSAGE:
			{
				DemMessage demMessage = (DemMessage)theEObject;
				T result = caseDemMessage(demMessage);
				if (result == null) result = caseDNavigableMember(demMessage);
				if (result == null) result = caseDNamedElement(demMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_ACTOR_MODEL:
			{
				DemActorModel demActorModel = (DemActorModel)theEObject;
				T result = caseDemActorModel(demActorModel);
				if (result == null) result = caseDModel(demActorModel);
				if (result == null) result = caseDNamedElement(demActorModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_ACTOR:
			{
				DemActor demActor = (DemActor)theEObject;
				T result = caseDemActor(demActor);
				if (result == null) result = caseDNavigableMember(demActor);
				if (result == null) result = caseIStaticReferenceTarget(demActor);
				if (result == null) result = caseDNamedElement(demActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_HUMAN_ACTOR_ROLE:
			{
				DemHumanActorRole demHumanActorRole = (DemHumanActorRole)theEObject;
				T result = caseDemHumanActorRole(demHumanActorRole);
				if (result == null) result = caseDemActor(demHumanActorRole);
				if (result == null) result = caseDNavigableMember(demHumanActorRole);
				if (result == null) result = caseIStaticReferenceTarget(demHumanActorRole);
				if (result == null) result = caseDNamedElement(demHumanActorRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_SERVICE:
			{
				DemService demService = (DemService)theEObject;
				T result = caseDemService(demService);
				if (result == null) result = caseDemActor(demService);
				if (result == null) result = caseDNavigableMember(demService);
				if (result == null) result = caseIStaticReferenceTarget(demService);
				if (result == null) result = caseDNamedElement(demService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL:
			{
				DemEventsOverviewModel demEventsOverviewModel = (DemEventsOverviewModel)theEObject;
				T result = caseDemEventsOverviewModel(demEventsOverviewModel);
				if (result == null) result = caseDModel(demEventsOverviewModel);
				if (result == null) result = caseDNamedElement(demEventsOverviewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemDomainEvent(DemDomainEvent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Conjunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemCaseConjunction(DemCaseConjunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemNotification(DemNotification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemMessage(DemMessage object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemActor(DemActor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Actor Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Actor Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemHumanActorRole(DemHumanActorRole object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemService(DemService object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events Overview Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events Overview Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemEventsOverviewModel(DemEventsOverviewModel object)
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
