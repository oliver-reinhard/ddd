/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.dem.*;

import org.eclipse.emf.ecore.EClass;
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
public class DemFactoryImpl extends EFactoryImpl implements DemFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DemFactory init()
	{
		try
		{
			DemFactory theDemFactory = (DemFactory)EPackage.Registry.INSTANCE.getEFactory(DemPackage.eNS_URI);
			if (theDemFactory != null)
			{
				return theDemFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemFactoryImpl()
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
			case DemPackage.DEM_DOMAIN_EVENT: return createDemDomainEvent();
			case DemPackage.DEM_CASE_CONJUNCTION: return createDemCaseConjunction();
			case DemPackage.DEM_NOTIFICATION: return createDemNotification();
			case DemPackage.DEM_MESSAGE: return createDemMessage();
			case DemPackage.DEM_ACTOR_MODEL: return createDemActorModel();
			case DemPackage.DEM_HUMAN_ACTOR_ROLE: return createDemHumanActorRole();
			case DemPackage.DEM_SERVICE: return createDemService();
			case DemPackage.DEM_EVENTS_OVERVIEW_MODEL: return createDemEventsOverviewModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemDomainEvent createDemDomainEvent()
	{
		DemDomainEventImplCustom demDomainEvent = new DemDomainEventImplCustom();
		return demDomainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemCaseConjunction createDemCaseConjunction()
	{
		DemCaseConjunctionImpl demCaseConjunction = new DemCaseConjunctionImpl();
		return demCaseConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemNotification createDemNotification()
	{
		DemNotificationImplCustom demNotification = new DemNotificationImplCustom();
		return demNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemMessage createDemMessage()
	{
		DemMessageImplCustom demMessage = new DemMessageImplCustom();
		return demMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemActorModel createDemActorModel()
	{
		DemActorModelImpl demActorModel = new DemActorModelImpl();
		return demActorModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemHumanActorRole createDemHumanActorRole()
	{
		DemHumanActorRoleImpl demHumanActorRole = new DemHumanActorRoleImpl();
		return demHumanActorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemService createDemService()
	{
		DemServiceImpl demService = new DemServiceImpl();
		return demService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemEventsOverviewModel createDemEventsOverviewModel()
	{
		DemEventsOverviewModelImpl demEventsOverviewModel = new DemEventsOverviewModelImpl();
		return demEventsOverviewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemPackage getDemPackage()
	{
		return (DemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DemPackage getPackage()
	{
		return DemPackage.eINSTANCE;
	}

} //DemFactoryImpl
