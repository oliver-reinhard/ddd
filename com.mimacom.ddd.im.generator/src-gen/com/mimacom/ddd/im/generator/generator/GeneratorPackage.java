/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.im.generator.generator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.im.generator.generator.GeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "generator";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mimacom.com/ddd/im/generator/Generator";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "generator";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GeneratorPackage eINSTANCE = com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl.init();

  /**
   * The meta object id for the '{@link com.mimacom.ddd.im.generator.generator.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mimacom.ddd.im.generator.generator.impl.ModelImpl
   * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORT_SECTION = 0;

  /**
   * The feature id for the '<em><b>Type Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPE_MAPPINGS = 1;

  /**
   * The feature id for the '<em><b>Dto Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DTO_MAPPINGS = 2;

  /**
   * The feature id for the '<em><b>Exception Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXCEPTION_MAPPINGS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.mimacom.ddd.im.generator.generator.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mimacom.ddd.im.generator.generator.impl.TypeMappingImpl
   * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getTypeMapping()
   * @generated
   */
  int TYPE_MAPPING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Java Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__JAVA_TYPE = 1;

  /**
   * The number of structural features of the '<em>Type Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.mimacom.ddd.im.generator.generator.impl.DtoMappingImpl <em>Dto Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mimacom.ddd.im.generator.generator.impl.DtoMappingImpl
   * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getDtoMapping()
   * @generated
   */
  int DTO_MAPPING = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_MAPPING__NAME = 0;

  /**
   * The number of structural features of the '<em>Dto Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DTO_MAPPING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl <em>Exception Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl
   * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getExceptionMapping()
   * @generated
   */
  int EXCEPTION_MAPPING = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPING__EXTENDS = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPING__MESSAGE = 2;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPING__PACKAGE = 3;

  /**
   * The number of structural features of the '<em>Exception Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPTION_MAPPING_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link com.mimacom.ddd.im.generator.generator.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.mimacom.ddd.im.generator.generator.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link com.mimacom.ddd.im.generator.generator.Model#getImportSection <em>Import Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Section</em>'.
   * @see com.mimacom.ddd.im.generator.generator.Model#getImportSection()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ImportSection();

  /**
   * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.im.generator.generator.Model#getTypeMappings <em>Type Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Mappings</em>'.
   * @see com.mimacom.ddd.im.generator.generator.Model#getTypeMappings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_TypeMappings();

  /**
   * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.im.generator.generator.Model#getDtoMappings <em>Dto Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dto Mappings</em>'.
   * @see com.mimacom.ddd.im.generator.generator.Model#getDtoMappings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DtoMappings();

  /**
   * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.im.generator.generator.Model#getExceptionMappings <em>Exception Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exception Mappings</em>'.
   * @see com.mimacom.ddd.im.generator.generator.Model#getExceptionMappings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ExceptionMappings();

  /**
   * Returns the meta object for class '{@link com.mimacom.ddd.im.generator.generator.TypeMapping <em>Type Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Mapping</em>'.
   * @see com.mimacom.ddd.im.generator.generator.TypeMapping
   * @generated
   */
  EClass getTypeMapping();

  /**
   * Returns the meta object for the reference '{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.mimacom.ddd.im.generator.generator.TypeMapping#getName()
   * @see #getTypeMapping()
   * @generated
   */
  EReference getTypeMapping_Name();

  /**
   * Returns the meta object for the reference '{@link com.mimacom.ddd.im.generator.generator.TypeMapping#getJavaType <em>Java Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Java Type</em>'.
   * @see com.mimacom.ddd.im.generator.generator.TypeMapping#getJavaType()
   * @see #getTypeMapping()
   * @generated
   */
  EReference getTypeMapping_JavaType();

  /**
   * Returns the meta object for class '{@link com.mimacom.ddd.im.generator.generator.DtoMapping <em>Dto Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dto Mapping</em>'.
   * @see com.mimacom.ddd.im.generator.generator.DtoMapping
   * @generated
   */
  EClass getDtoMapping();

  /**
   * Returns the meta object for the reference '{@link com.mimacom.ddd.im.generator.generator.DtoMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.mimacom.ddd.im.generator.generator.DtoMapping#getName()
   * @see #getDtoMapping()
   * @generated
   */
  EReference getDtoMapping_Name();

  /**
   * Returns the meta object for class '{@link com.mimacom.ddd.im.generator.generator.ExceptionMapping <em>Exception Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exception Mapping</em>'.
   * @see com.mimacom.ddd.im.generator.generator.ExceptionMapping
   * @generated
   */
  EClass getExceptionMapping();

  /**
   * Returns the meta object for the reference '{@link com.mimacom.ddd.im.generator.generator.ExceptionMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see com.mimacom.ddd.im.generator.generator.ExceptionMapping#getName()
   * @see #getExceptionMapping()
   * @generated
   */
  EReference getExceptionMapping_Name();

  /**
   * Returns the meta object for the reference '{@link com.mimacom.ddd.im.generator.generator.ExceptionMapping#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see com.mimacom.ddd.im.generator.generator.ExceptionMapping#getExtends()
   * @see #getExceptionMapping()
   * @generated
   */
  EReference getExceptionMapping_Extends();

  /**
   * Returns the meta object for the attribute '{@link com.mimacom.ddd.im.generator.generator.ExceptionMapping#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see com.mimacom.ddd.im.generator.generator.ExceptionMapping#getMessage()
   * @see #getExceptionMapping()
   * @generated
   */
  EAttribute getExceptionMapping_Message();

  /**
   * Returns the meta object for the attribute '{@link com.mimacom.ddd.im.generator.generator.ExceptionMapping#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see com.mimacom.ddd.im.generator.generator.ExceptionMapping#getPackage()
   * @see #getExceptionMapping()
   * @generated
   */
  EAttribute getExceptionMapping_Package();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GeneratorFactory getGeneratorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.mimacom.ddd.im.generator.generator.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mimacom.ddd.im.generator.generator.impl.ModelImpl
     * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Import Section</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORT_SECTION = eINSTANCE.getModel_ImportSection();

    /**
     * The meta object literal for the '<em><b>Type Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPE_MAPPINGS = eINSTANCE.getModel_TypeMappings();

    /**
     * The meta object literal for the '<em><b>Dto Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DTO_MAPPINGS = eINSTANCE.getModel_DtoMappings();

    /**
     * The meta object literal for the '<em><b>Exception Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXCEPTION_MAPPINGS = eINSTANCE.getModel_ExceptionMappings();

    /**
     * The meta object literal for the '{@link com.mimacom.ddd.im.generator.generator.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mimacom.ddd.im.generator.generator.impl.TypeMappingImpl
     * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getTypeMapping()
     * @generated
     */
    EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING__NAME = eINSTANCE.getTypeMapping_Name();

    /**
     * The meta object literal for the '<em><b>Java Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING__JAVA_TYPE = eINSTANCE.getTypeMapping_JavaType();

    /**
     * The meta object literal for the '{@link com.mimacom.ddd.im.generator.generator.impl.DtoMappingImpl <em>Dto Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mimacom.ddd.im.generator.generator.impl.DtoMappingImpl
     * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getDtoMapping()
     * @generated
     */
    EClass DTO_MAPPING = eINSTANCE.getDtoMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DTO_MAPPING__NAME = eINSTANCE.getDtoMapping_Name();

    /**
     * The meta object literal for the '{@link com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl <em>Exception Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.mimacom.ddd.im.generator.generator.impl.ExceptionMappingImpl
     * @see com.mimacom.ddd.im.generator.generator.impl.GeneratorPackageImpl#getExceptionMapping()
     * @generated
     */
    EClass EXCEPTION_MAPPING = eINSTANCE.getExceptionMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_MAPPING__NAME = eINSTANCE.getExceptionMapping_Name();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION_MAPPING__EXTENDS = eINSTANCE.getExceptionMapping_Extends();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION_MAPPING__MESSAGE = eINSTANCE.getExceptionMapping_Message();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION_MAPPING__PACKAGE = eINSTANCE.getExceptionMapping_Package();

  }

} //GeneratorPackage
