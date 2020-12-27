/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.div;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.div.DivFactory
 * @model kind="package"
 * @generated
 */
public interface DivPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "div";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/div";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "div";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivPackage eINSTANCE = com.mimacom.ddd.dm.div.impl.DivPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.div.impl.DomainInformationViewImpl <em>Domain Information View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.div.impl.DomainInformationViewImpl
	 * @see com.mimacom.ddd.dm.div.impl.DivPackageImpl#getDomainInformationView()
	 * @generated
	 */
	int DOMAIN_INFORMATION_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__NAME = TransposePackage.TINFORMATION_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__ALIAS = TransposePackage.TINFORMATION_MODEL__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__DESCRIPTION = TransposePackage.TINFORMATION_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__NOTES = TransposePackage.TINFORMATION_MODEL__NOTES;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__AGGREGATES = TransposePackage.TINFORMATION_MODEL__AGGREGATES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__TYPES = TransposePackage.TINFORMATION_MODEL__TYPES;

	/**
	 * The feature id for the '<em><b>Indexing Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__INDEXING_HELPER = TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER;

	/**
	 * The feature id for the '<em><b>Read Only View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW__READ_ONLY_VIEW = TransposePackage.TINFORMATION_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Information View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW_FEATURE_COUNT = TransposePackage.TINFORMATION_MODEL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Allows Identity Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW___ALLOWS_IDENTITY_TYPES = TransposePackage.TINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES;

	/**
	 * The number of operations of the '<em>Domain Information View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_INFORMATION_VIEW_OPERATION_COUNT = TransposePackage.TINFORMATION_MODEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.div.DomainInformationView <em>Domain Information View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Information View</em>'.
	 * @see com.mimacom.ddd.dm.div.DomainInformationView
	 * @generated
	 */
	EClass getDomainInformationView();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.div.DomainInformationView#isReadOnlyView <em>Read Only View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only View</em>'.
	 * @see com.mimacom.ddd.dm.div.DomainInformationView#isReadOnlyView()
	 * @see #getDomainInformationView()
	 * @generated
	 */
	EAttribute getDomainInformationView_ReadOnlyView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DivFactory getDivFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.div.impl.DomainInformationViewImpl <em>Domain Information View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.div.impl.DomainInformationViewImpl
		 * @see com.mimacom.ddd.dm.div.impl.DivPackageImpl#getDomainInformationView()
		 * @generated
		 */
		EClass DOMAIN_INFORMATION_VIEW = eINSTANCE.getDomainInformationView();

		/**
		 * The meta object literal for the '<em><b>Read Only View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_INFORMATION_VIEW__READ_ONLY_VIEW = eINSTANCE.getDomainInformationView_ReadOnlyView();

	}

} //DivPackage
