/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.dm.dom.DomComplexObject;
import com.mimacom.ddd.dm.dom.DomDetail;
import com.mimacom.ddd.dm.dom.DomEntity;
import com.mimacom.ddd.dm.dom.DomFactory;
import com.mimacom.ddd.dm.dom.DomField;
import com.mimacom.ddd.dm.dom.DomModel;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import com.mimacom.ddd.dm.dom.DomObject;
import com.mimacom.ddd.dm.dom.DomPackage;
import com.mimacom.ddd.dm.dom.DomSnapshot;

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
public class DomPackageImpl extends EPackageImpl implements DomPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domComplexObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domNamedComplexObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domDetailEClass = null;

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
	 * @see com.mimacom.ddd.dm.dom.DomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomPackageImpl()
	{
		super(eNS_URI, DomFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomPackage init()
	{
		if (isInited) return (DomPackage)EPackage.Registry.INSTANCE.getEPackage(DomPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomPackageImpl theDomPackage = registeredDomPackage instanceof DomPackageImpl ? (DomPackageImpl)registeredDomPackage : new DomPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDomPackage.createPackageContents();

		// Initialize created meta-data
		theDomPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomPackage.eNS_URI, theDomPackage);
		return theDomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomModel()
	{
		return domModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomModel_Imports()
	{
		return (EReference)domModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomModel_Name()
	{
		return (EAttribute)domModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomModel_Snapshots()
	{
		return (EReference)domModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomSnapshot()
	{
		return domSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomSnapshot_Name()
	{
		return (EAttribute)domSnapshotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomSnapshot_Objects()
	{
		return (EReference)domSnapshotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomObject()
	{
		return domObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomComplexObject()
	{
		return domComplexObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomComplexObject_Ref()
	{
		return (EReference)domComplexObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomComplexObject_Fields()
	{
		return (EReference)domComplexObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomField()
	{
		return domFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomField_Ref()
	{
		return (EReference)domFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomField_Value()
	{
		return (EReference)domFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomNamedComplexObject()
	{
		return domNamedComplexObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomNamedComplexObject_Object()
	{
		return (EReference)domNamedComplexObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomEntity()
	{
		return domEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomDetail()
	{
		return domDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomFactory getDomFactory()
	{
		return (DomFactory)getEFactoryInstance();
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
		domModelEClass = createEClass(DOM_MODEL);
		createEReference(domModelEClass, DOM_MODEL__IMPORTS);
		createEAttribute(domModelEClass, DOM_MODEL__NAME);
		createEReference(domModelEClass, DOM_MODEL__SNAPSHOTS);

		domSnapshotEClass = createEClass(DOM_SNAPSHOT);
		createEAttribute(domSnapshotEClass, DOM_SNAPSHOT__NAME);
		createEReference(domSnapshotEClass, DOM_SNAPSHOT__OBJECTS);

		domObjectEClass = createEClass(DOM_OBJECT);

		domComplexObjectEClass = createEClass(DOM_COMPLEX_OBJECT);
		createEReference(domComplexObjectEClass, DOM_COMPLEX_OBJECT__REF);
		createEReference(domComplexObjectEClass, DOM_COMPLEX_OBJECT__FIELDS);

		domFieldEClass = createEClass(DOM_FIELD);
		createEReference(domFieldEClass, DOM_FIELD__REF);
		createEReference(domFieldEClass, DOM_FIELD__VALUE);

		domNamedComplexObjectEClass = createEClass(DOM_NAMED_COMPLEX_OBJECT);
		createEReference(domNamedComplexObjectEClass, DOM_NAMED_COMPLEX_OBJECT__OBJECT);

		domEntityEClass = createEClass(DOM_ENTITY);

		domDetailEClass = createEClass(DOM_DETAIL);
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
		domSnapshotEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		domObjectEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		domComplexObjectEClass.getESuperTypes().add(theBasePackage.getDExpression());
		domComplexObjectEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		domFieldEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		domNamedComplexObjectEClass.getESuperTypes().add(this.getDomObject());
		domEntityEClass.getESuperTypes().add(this.getDomComplexObject());
		domDetailEClass.getESuperTypes().add(this.getDomComplexObject());

		// Initialize classes and features; add operations and parameters
		initEClass(domModelEClass, DomModel.class, "DomModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomModel_Imports(), theBasePackage.getDImport(), null, "imports", null, 0, -1, DomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomModel_Snapshots(), this.getDomSnapshot(), null, "snapshots", null, 0, -1, DomModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domSnapshotEClass, DomSnapshot.class, "DomSnapshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomSnapshot_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomSnapshot_Objects(), this.getDomObject(), null, "objects", null, 0, -1, DomSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domObjectEClass, DomObject.class, "DomObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domComplexObjectEClass, DomComplexObject.class, "DomComplexObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomComplexObject_Ref(), theBasePackage.getDComplexType(), null, "ref", null, 0, 1, DomComplexObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomComplexObject_Fields(), this.getDomField(), null, "fields", null, 0, -1, DomComplexObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domFieldEClass, DomField.class, "DomField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomField_Ref(), theBasePackage.getDFeature(), null, "ref", null, 0, 1, DomField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomField_Value(), theBasePackage.getDExpression(), null, "value", null, 0, 1, DomField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domNamedComplexObjectEClass, DomNamedComplexObject.class, "DomNamedComplexObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomNamedComplexObject_Object(), this.getDomComplexObject(), null, "object", null, 0, 1, DomNamedComplexObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domEntityEClass, DomEntity.class, "DomEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domDetailEClass, DomDetail.class, "DomDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DomPackageImpl
