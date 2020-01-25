/**
 */
package com.mimacom.ddd.dm.dem.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.dm.dem.DActor;
import com.mimacom.ddd.dm.dem.DCaseConjunction;
import com.mimacom.ddd.dm.dem.DDomainEvent;
import com.mimacom.ddd.dm.dem.DHumanActorRole;
import com.mimacom.ddd.dm.dem.DMessage;
import com.mimacom.ddd.dm.dem.DNotification;
import com.mimacom.ddd.dm.dem.DService;
import com.mimacom.ddd.dm.dem.DemActorModel;
import com.mimacom.ddd.dm.dem.DemFactory;
import com.mimacom.ddd.dm.dem.DemModel;
import com.mimacom.ddd.dm.dem.DemPackage;

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
	private EClass demModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dDomainEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dCaseConjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dMessageEClass = null;

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
	private EClass dActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dHumanActorRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dServiceEClass = null;

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
		Object registeredDemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DemPackageImpl theDemPackage = registeredDemPackage instanceof DemPackageImpl ? (DemPackageImpl)registeredDemPackage : new DemPackageImpl();

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
	@Override
	public EClass getDemModel()
	{
		return demModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDemModel_Domain()
	{
		return (EAttribute)demModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDDomainEvent()
	{
		return dDomainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Context()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Trigger()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_PreconditionsCNF()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_PostconditionsDNF()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Notifications()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDCaseConjunction()
	{
		return dCaseConjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCaseConjunction_Selector()
	{
		return (EReference)dCaseConjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDCaseConjunction_Otherwise()
	{
		return (EAttribute)dCaseConjunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCaseConjunction_Predicates()
	{
		return (EReference)dCaseConjunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNotification()
	{
		return dNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNotification_Message()
	{
		return (EReference)dNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNotification_Notified()
	{
		return (EReference)dNotificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMessage()
	{
		return dMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDemActorModel()
	{
		return demActorModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDemActorModel_Actors()
	{
		return (EReference)demActorModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDActor()
	{
		return dActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDHumanActorRole()
	{
		return dHumanActorRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDService()
	{
		return dServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		demModelEClass = createEClass(DEM_MODEL);
		createEAttribute(demModelEClass, DEM_MODEL__DOMAIN);

		dDomainEventEClass = createEClass(DDOMAIN_EVENT);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__CONTEXT);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__TRIGGER);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__PRECONDITIONS_CNF);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__POSTCONDITIONS_DNF);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__NOTIFICATIONS);

		dCaseConjunctionEClass = createEClass(DCASE_CONJUNCTION);
		createEReference(dCaseConjunctionEClass, DCASE_CONJUNCTION__SELECTOR);
		createEAttribute(dCaseConjunctionEClass, DCASE_CONJUNCTION__OTHERWISE);
		createEReference(dCaseConjunctionEClass, DCASE_CONJUNCTION__PREDICATES);

		dNotificationEClass = createEClass(DNOTIFICATION);
		createEReference(dNotificationEClass, DNOTIFICATION__MESSAGE);
		createEReference(dNotificationEClass, DNOTIFICATION__NOTIFIED);

		dMessageEClass = createEClass(DMESSAGE);

		demActorModelEClass = createEClass(DEM_ACTOR_MODEL);
		createEReference(demActorModelEClass, DEM_ACTOR_MODEL__ACTORS);

		dActorEClass = createEClass(DACTOR);

		dHumanActorRoleEClass = createEClass(DHUMAN_ACTOR_ROLE);

		dServiceEClass = createEClass(DSERVICE);
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
		demModelEClass.getESuperTypes().add(theBasePackage.getDNamespace());
		dDomainEventEClass.getESuperTypes().add(this.getDemModel());
		dDomainEventEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dDomainEventEClass.getESuperTypes().add(theBasePackage.getIStaticReferenceTarget());
		dDomainEventEClass.getESuperTypes().add(theBasePackage.getIDiagramRoot());
		dCaseConjunctionEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		dNotificationEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		dNotificationEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dMessageEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		demActorModelEClass.getESuperTypes().add(this.getDemModel());
		dActorEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		dActorEClass.getESuperTypes().add(theBasePackage.getIStaticReferenceTarget());
		dHumanActorRoleEClass.getESuperTypes().add(this.getDActor());
		dServiceEClass.getESuperTypes().add(this.getDActor());

		// Initialize classes, features, and operations; add parameters
		initEClass(demModelEClass, DemModel.class, "DemModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDemModel_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, DemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDomainEventEClass, DDomainEvent.class, "DDomainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDomainEvent_Context(), theBasePackage.getDContext(), null, "context", null, 1, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_Trigger(), this.getDActor(), null, "trigger", null, 1, 1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_PreconditionsCNF(), theBasePackage.getDNamedPredicate(), null, "preconditionsCNF", null, 0, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_PostconditionsDNF(), theBasePackage.getDNamedElement(), null, "postconditionsDNF", null, 0, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_Notifications(), this.getDNotification(), null, "notifications", null, 0, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dCaseConjunctionEClass, DCaseConjunction.class, "DCaseConjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDCaseConjunction_Selector(), theBasePackage.getDExpression(), null, "selector", null, 0, 1, DCaseConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDCaseConjunction_Otherwise(), ecorePackage.getEBoolean(), "otherwise", null, 0, 1, DCaseConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCaseConjunction_Predicates(), theBasePackage.getDNamedPredicate(), null, "predicates", null, 0, -1, DCaseConjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dNotificationEClass, DNotification.class, "DNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNotification_Message(), this.getDMessage(), null, "message", null, 0, 1, DNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNotification_Notified(), this.getDActor(), null, "notified", null, 1, 1, DNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dMessageEClass, DMessage.class, "DMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demActorModelEClass, DemActorModel.class, "DemActorModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemActorModel_Actors(), this.getDActor(), null, "actors", null, 0, -1, DemActorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dActorEClass, DActor.class, "DActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dHumanActorRoleEClass, DHumanActorRole.class, "DHumanActorRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dServiceEClass, DService.class, "DService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DemPackageImpl
