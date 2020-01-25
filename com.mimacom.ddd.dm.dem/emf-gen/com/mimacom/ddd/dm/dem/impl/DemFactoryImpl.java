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
			case DemPackage.DDOMAIN_EVENT: return createDDomainEvent();
			case DemPackage.DCASE_CONJUNCTION: return createDCaseConjunction();
			case DemPackage.DNOTIFICATION: return createDNotification();
			case DemPackage.DMESSAGE: return createDMessage();
			case DemPackage.DHUMAN_ACTOR_ROLE: return createDHumanActorRole();
			case DemPackage.DSERVICE: return createDService();
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
	public DDomainEvent createDDomainEvent()
	{
		DDomainEventImplCustom dDomainEvent = new DDomainEventImplCustom();
		return dDomainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCaseConjunction createDCaseConjunction()
	{
		DCaseConjunctionImpl dCaseConjunction = new DCaseConjunctionImpl();
		return dCaseConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNotification createDNotification()
	{
		DNotificationImplCustom dNotification = new DNotificationImplCustom();
		return dNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMessage createDMessage()
	{
		DMessageImplCustom dMessage = new DMessageImplCustom();
		return dMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DHumanActorRole createDHumanActorRole()
	{
		DHumanActorRoleImpl dHumanActorRole = new DHumanActorRoleImpl();
		return dHumanActorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DService createDService()
	{
		DServiceImpl dService = new DServiceImpl();
		return dService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
