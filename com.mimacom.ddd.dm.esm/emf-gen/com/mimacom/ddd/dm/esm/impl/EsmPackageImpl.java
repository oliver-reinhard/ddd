/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.dm.esm.DEntityStateModel;
import com.mimacom.ddd.dm.esm.DEvent;
import com.mimacom.ddd.dm.esm.DState;
import com.mimacom.ddd.dm.esm.DTransition;
import com.mimacom.ddd.dm.esm.EsmFactory;
import com.mimacom.ddd.dm.esm.EsmPackage;

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
public class EsmPackageImpl extends EPackageImpl implements EsmPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEntityStateModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTransitionEClass = null;

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
	 * @see com.mimacom.ddd.dm.esm.EsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EsmPackageImpl()
	{
		super(eNS_URI, EsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EsmPackage init()
	{
		if (isInited) return (EsmPackage)EPackage.Registry.INSTANCE.getEPackage(EsmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEsmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EsmPackageImpl theEsmPackage = registeredEsmPackage instanceof EsmPackageImpl ? (EsmPackageImpl)registeredEsmPackage : new EsmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEsmPackage.createPackageContents();

		// Initialize created meta-data
		theEsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEsmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EsmPackage.eNS_URI, theEsmPackage);
		return theEsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDEntityStateModel()
	{
		return dEntityStateModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDEntityStateModel_States()
	{
		return (EReference)dEntityStateModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDEntityStateModel_Events()
	{
		return (EReference)dEntityStateModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDEntityStateModel_Transition()
	{
		return (EReference)dEntityStateModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDState()
	{
		return dStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDState_Name()
	{
		return (EAttribute)dStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDState_Expression()
	{
		return (EReference)dStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDEvent()
	{
		return dEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDEvent_Name()
	{
		return (EAttribute)dEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDTransition()
	{
		return dTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTransition_From()
	{
		return (EReference)dTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTransition_To()
	{
		return (EReference)dTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTransition_Event()
	{
		return (EReference)dTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTransition_Guard()
	{
		return (EReference)dTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EsmFactory getEsmFactory()
	{
		return (EsmFactory)getEFactoryInstance();
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
		dEntityStateModelEClass = createEClass(DENTITY_STATE_MODEL);
		createEReference(dEntityStateModelEClass, DENTITY_STATE_MODEL__STATES);
		createEReference(dEntityStateModelEClass, DENTITY_STATE_MODEL__EVENTS);
		createEReference(dEntityStateModelEClass, DENTITY_STATE_MODEL__TRANSITION);

		dStateEClass = createEClass(DSTATE);
		createEAttribute(dStateEClass, DSTATE__NAME);
		createEReference(dStateEClass, DSTATE__EXPRESSION);

		dEventEClass = createEClass(DEVENT);
		createEAttribute(dEventEClass, DEVENT__NAME);

		dTransitionEClass = createEClass(DTRANSITION);
		createEReference(dTransitionEClass, DTRANSITION__FROM);
		createEReference(dTransitionEClass, DTRANSITION__TO);
		createEReference(dTransitionEClass, DTRANSITION__EVENT);
		createEReference(dTransitionEClass, DTRANSITION__GUARD);
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
		dEntityStateModelEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		dEntityStateModelEClass.getESuperTypes().add(theBasePackage.getIEntityStateModel());
		dEntityStateModelEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());

		// Initialize classes and features; add operations and parameters
		initEClass(dEntityStateModelEClass, DEntityStateModel.class, "DEntityStateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEntityStateModel_States(), this.getDState(), null, "states", null, 0, -1, DEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEntityStateModel_Events(), this.getDEvent(), null, "events", null, 0, -1, DEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEntityStateModel_Transition(), this.getDTransition(), null, "transition", null, 0, -1, DEntityStateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dStateEClass, DState.class, "DState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDState_Name(), ecorePackage.getEString(), "name", null, 0, 1, DState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDState_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dEventEClass, DEvent.class, "DEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, DEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTransitionEClass, DTransition.class, "DTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTransition_From(), this.getDState(), null, "from", null, 0, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTransition_To(), this.getDState(), null, "to", null, 0, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTransition_Event(), this.getDEvent(), null, "event", null, 0, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTransition_Guard(), theBasePackage.getDExpression(), null, "guard", null, 0, 1, DTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EsmPackageImpl
