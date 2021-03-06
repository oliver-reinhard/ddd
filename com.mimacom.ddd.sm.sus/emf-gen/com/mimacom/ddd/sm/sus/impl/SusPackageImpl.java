/**
 */
package com.mimacom.ddd.sm.sus.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.dem.DemPackage;

import com.mimacom.ddd.pub.proto.ProtoPackage;

import com.mimacom.ddd.pub.pub.PubPackage;

import com.mimacom.ddd.sm.sus.SusFactory;
import com.mimacom.ddd.sm.sus.SusPackage;
import com.mimacom.ddd.sm.sus.UserStory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SusPackageImpl extends EPackageImpl implements SusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStoryEClass = null;

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
	 * @see com.mimacom.ddd.sm.sus.SusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SusPackageImpl() {
		super(eNS_URI, SusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SusPackage init() {
		if (isInited) return (SusPackage)EPackage.Registry.INSTANCE.getEPackage(SusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SusPackageImpl theSusPackage = registeredSusPackage instanceof SusPackageImpl ? (SusPackageImpl)registeredSusPackage : new SusPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		DemPackage.eINSTANCE.eClass();
		PubPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ProtoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSusPackage.createPackageContents();

		// Initialize created meta-data
		theSusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SusPackage.eNS_URI, theSusPackage);
		return theSusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserStory() {
		return userStoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_Event() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_Goal() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_Sections() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserStory_JiraKey() {
		return (EAttribute)userStoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SusFactory getSusFactory() {
		return (SusFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userStoryEClass = createEClass(USER_STORY);
		createEReference(userStoryEClass, USER_STORY__EVENT);
		createEReference(userStoryEClass, USER_STORY__GOAL);
		createEReference(userStoryEClass, USER_STORY__SECTIONS);
		createEAttribute(userStoryEClass, USER_STORY__JIRA_KEY);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		DemPackage theDemPackage = (DemPackage)EPackage.Registry.INSTANCE.getEPackage(DemPackage.eNS_URI);
		PubPackage thePubPackage = (PubPackage)EPackage.Registry.INSTANCE.getEPackage(PubPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userStoryEClass.getESuperTypes().add(theBasePackage.getDModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(userStoryEClass, UserStory.class, "UserStory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserStory_Event(), theDemPackage.getDemDomainEvent(), null, "event", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserStory_Goal(), theBasePackage.getDRichText(), null, "goal", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserStory_Sections(), thePubPackage.getSection(), null, "sections", null, 0, -1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserStory_JiraKey(), theEcorePackage.getEString(), "jiraKey", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SusPackageImpl
