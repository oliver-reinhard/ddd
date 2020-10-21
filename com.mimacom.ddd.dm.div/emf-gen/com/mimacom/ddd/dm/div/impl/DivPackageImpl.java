/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.div.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import com.mimacom.ddd.dm.div.DivFactory;
import com.mimacom.ddd.dm.div.DivPackage;
import com.mimacom.ddd.dm.div.DomainInformationView;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DivPackageImpl extends EPackageImpl implements DivPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainInformationViewEClass = null;

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
	 * @see com.mimacom.ddd.dm.div.DivPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DivPackageImpl()
	{
		super(eNS_URI, DivFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DivPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DivPackage init()
	{
		if (isInited) return (DivPackage)EPackage.Registry.INSTANCE.getEPackage(DivPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDivPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DivPackageImpl theDivPackage = registeredDivPackage instanceof DivPackageImpl ? (DivPackageImpl)registeredDivPackage : new DivPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		TransposePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDivPackage.createPackageContents();

		// Initialize created meta-data
		theDivPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDivPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DivPackage.eNS_URI, theDivPackage);
		return theDivPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainInformationView()
	{
		return domainInformationViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivFactory getDivFactory()
	{
		return (DivFactory)getEFactoryInstance();
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
		domainInformationViewEClass = createEClass(DOMAIN_INFORMATION_VIEW);
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
		TransposePackage theTransposePackage = (TransposePackage)EPackage.Registry.INSTANCE.getEPackage(TransposePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainInformationViewEClass.getESuperTypes().add(theTransposePackage.getTInformationModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainInformationViewEClass, DomainInformationView.class, "DomainInformationView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DivPackageImpl
