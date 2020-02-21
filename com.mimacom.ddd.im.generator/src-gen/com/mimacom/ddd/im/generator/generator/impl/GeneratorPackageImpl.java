/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.im.generator.generator.GeneratorFactory;
import com.mimacom.ddd.im.generator.generator.GeneratorPackage;
import com.mimacom.ddd.im.generator.generator.Model;
import com.mimacom.ddd.im.generator.generator.TypeMapping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorPackageImpl extends EPackageImpl implements GeneratorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeMappingEClass = null;

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
   * @see com.mimacom.ddd.im.generator.generator.GeneratorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GeneratorPackageImpl()
  {
    super(eNS_URI, GeneratorFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link GeneratorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GeneratorPackage init()
  {
    if (isInited) return (GeneratorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI);

    // Obtain or create and register package
    GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneratorPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    BasePackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theGeneratorPackage.createPackageContents();

    // Initialize created meta-data
    theGeneratorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGeneratorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GeneratorPackage.eNS_URI, theGeneratorPackage);
    return theGeneratorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_TypeMappings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeMapping()
  {
    return typeMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeMapping_Name()
  {
    return (EReference)typeMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeMapping_JavaType()
  {
    return (EReference)typeMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneratorFactory getGeneratorFactory()
  {
    return (GeneratorFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__TYPE_MAPPINGS);

    typeMappingEClass = createEClass(TYPE_MAPPING);
    createEReference(typeMappingEClass, TYPE_MAPPING__NAME);
    createEReference(typeMappingEClass, TYPE_MAPPING__JAVA_TYPE);
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
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_TypeMappings(), this.getTypeMapping(), null, "typeMappings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeMappingEClass, TypeMapping.class, "TypeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeMapping_Name(), theBasePackage.getDType(), null, "name", null, 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeMapping_JavaType(), theTypesPackage.getJvmType(), null, "javaType", null, 0, 1, TypeMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GeneratorPackageImpl
