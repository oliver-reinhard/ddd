/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.dem.DemActor;
import com.mimacom.ddd.dm.dem.DemActorModel;
import com.mimacom.ddd.dm.dem.DemCaseConjunction;
import com.mimacom.ddd.dm.dem.DemDomainEvent;
import com.mimacom.ddd.dm.dem.DemEventsOverviewModel;
import com.mimacom.ddd.dm.dem.DemFactory;
import com.mimacom.ddd.dm.dem.DemHumanActorRole;
import com.mimacom.ddd.dm.dem.DemMessage;
import com.mimacom.ddd.dm.dem.DemNotification;
import com.mimacom.ddd.dm.dem.DemPackage;
import com.mimacom.ddd.dm.dem.DemService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemPackageImpl extends EPackageImpl implements DemPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demDomainEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demCaseConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demActorModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demHumanActorRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demEventsOverviewModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.mimacom.ddd.dm.dem.DemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DemPackageImpl()
	{
		super(eNS_URI, DemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DemPackage init()
	{
		if (isInited) return (DemPackage)EPackage.Registry.INSTANCE.getEPackage(DemPackage.eNS_URI);

		// Obtain or create and register package
		DemPackageImpl theDemPackage = (DemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDemPackage.createPackageContents();

		// Initialize created meta-data
		theDemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DemPackage.eNS_URI, theDemPackage);
		return theDemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemDomainEvent()
	{
		return demDomainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemDomainEvent_Context()
	{
		return (EReference)demDomainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemDomainEvent_Triggers()
	{
		return (EReference)demDomainEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemDomainEvent_PreconditionsCNF()
	{
		return (EReference)demDomainEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemDomainEvent_PostconditionsDNF()
	{
		return (EReference)demDomainEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemDomainEvent_Notifications()
	{
		return (EReference)demDomainEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemCaseConjunction()
	{
		return demCaseConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemCaseConjunction_Selector()
	{
		return (EReference)demCaseConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemCaseConjunction_Otherwise()
	{
		return (EAttribute)demCaseConjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemCaseConjunction_Predicates()
	{
		return (EReference)demCaseConjunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemNotification()
	{
		return demNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemNotification_Message()
	{
		return (EReference)demNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemNotification_Notified()
	{
		return (EReference)demNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemMessage()
	{
		return demMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemActorModel()
	{
		return demActorModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemActorModel_Actors()
	{
		return (EReference)demActorModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemActor()
	{
		return demActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemHumanActorRole()
	{
		return demHumanActorRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemService()
	{
		return demServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemEventsOverviewModel()
	{
		return demEventsOverviewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDemEventsOverviewModel_All()
	{
		return (EAttribute)demEventsOverviewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemEventsOverviewModel_Include()
	{
		return (EReference)demEventsOverviewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemEventsOverviewModel_Exclude()
	{
		return (EReference)demEventsOverviewModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemFactory getDemFactory()
	{
		return (DemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		demDomainEventEClass = createEClass(DEM_DOMAIN_EVENT);
		createEReference(demDomainEventEClass, DEM_DOMAIN_EVENT__CONTEXT);
		createEReference(demDomainEventEClass, DEM_DOMAIN_EVENT__TRIGGERS);
		createEReference(demDomainEventEClass, DEM_DOMAIN_EVENT__PRECONDITIONS_CNF);
		createEReference(demDomainEventEClass, DEM_DOMAIN_EVENT__POSTCONDITIONS_DNF);
		createEReference(demDomainEventEClass, DEM_DOMAIN_EVENT__NOTIFICATIONS);

		demCaseConjunctionEClass = createEClass(DEM_CASE_CONJUNCTION);
		createEReference(demCaseConjunctionEClass, DEM_CASE_CONJUNCTION__SELECTOR);
		createEAttribute(demCaseConjunctionEClass, DEM_CASE_CONJUNCTION__OTHERWISE);
		createEReference(demCaseConjunctionEClass, DEM_CASE_CONJUNCTION__PREDICATES);

		demNotificationEClass = createEClass(DEM_NOTIFICATION);
		createEReference(demNotificationEClass, DEM_NOTIFICATION__MESSAGE);
		createEReference(demNotificationEClass, DEM_NOTIFICATION__NOTIFIED);

		demMessageEClass = createEClass(DEM_MESSAGE);

		demActorModelEClass = createEClass(DEM_ACTOR_MODEL);
		createEReference(demActorModelEClass, DEM_ACTOR_MODEL__ACTORS);

		demActorEClass = createEClass(DEM_ACTOR);

		demHumanActorRoleEClass = createEClass(DEM_HUMAN_ACTOR_ROLE);

		demServiceEClass = createEClass(DEM_SERVICE);

		demEventsOverviewModelEClass = createEClass(DEM_EVENTS_OVERVIEW_MODEL);
		createEAttribute(demEventsOverviewModelEClass, DEM_EVENTS_OVERVIEW_MODEL__ALL);
		createEReference(demEventsOverviewModelEClass, DEM_EVENTS_OVERVIEW_MODEL__INCLUDE);
		createEReference(demEventsOverviewModelEClass, DEM_EVENTS_OVERVIEW_MODEL__EXCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		demDomainEventEClass.getESuperTypes().add(theBasePackage.getDModel());
		demDomainEventEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		demDomainEventEClass.getESuperTypes().add(theBasePackage.getIStaticReferenceTarget());
		demDomainEventEClass.getESuperTypes().add(theBasePackage.getIDiagramRoot());
		demCaseConjunctionEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		demNotificationEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		demNotificationEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		demMessageEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		demActorModelEClass.getESuperTypes().add(theBasePackage.getDModel());
		demActorEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		demActorEClass.getESuperTypes().add(theBasePackage.getIStaticReferenceTarget());
		demHumanActorRoleEClass.getESuperTypes().add(this.getDemActor());
		demServiceEClass.getESuperTypes().add(this.getDemActor());
		demEventsOverviewModelEClass.getESuperTypes().add(theBasePackage.getDModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(demDomainEventEClass, DemDomainEvent.class, "DemDomainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemDomainEvent_Context(), theBasePackage.getDContext(), null, "context", null, 1, -1, DemDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemDomainEvent_Triggers(), this.getDemActor(), null, "triggers", null, 1, -1, DemDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemDomainEvent_PreconditionsCNF(), theBasePackage.getDNamedPredicate(), null, "preconditionsCNF", null, 0, -1, DemDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemDomainEvent_PostconditionsDNF(), theBasePackage.getDNamedElement(), null, "postconditionsDNF", null, 0, -1, DemDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemDomainEvent_Notifications(), this.getDemNotification(), null, "notifications", null, 0, -1, DemDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demCaseConjunctionEClass, DemCaseConjunction.class, "DemCaseConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemCaseConjunction_Selector(), theBasePackage.getDExpression(), null, "selector", null, 0, 1, DemCaseConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDemCaseConjunction_Otherwise(), ecorePackage.getEBoolean(), "otherwise", null, 0, 1, DemCaseConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemCaseConjunction_Predicates(), theBasePackage.getDNamedPredicate(), null, "predicates", null, 0, -1, DemCaseConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demNotificationEClass, DemNotification.class, "DemNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemNotification_Message(), this.getDemMessage(), null, "message", null, 0, 1, DemNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemNotification_Notified(), this.getDemActor(), null, "notified", null, 1, 1, DemNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demMessageEClass, DemMessage.class, "DemMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demActorModelEClass, DemActorModel.class, "DemActorModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemActorModel_Actors(), this.getDemActor(), null, "actors", null, 0, -1, DemActorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demActorEClass, DemActor.class, "DemActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demHumanActorRoleEClass, DemHumanActorRole.class, "DemHumanActorRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demServiceEClass, DemService.class, "DemService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demEventsOverviewModelEClass, DemEventsOverviewModel.class, "DemEventsOverviewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDemEventsOverviewModel_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, DemEventsOverviewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemEventsOverviewModel_Include(), this.getDemDomainEvent(), null, "include", null, 0, -1, DemEventsOverviewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDemEventsOverviewModel_Exclude(), this.getDemDomainEvent(), null, "exclude", null, 0, -1, DemEventsOverviewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DemPackageImpl
