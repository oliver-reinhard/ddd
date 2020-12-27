/**
 */
package com.mimacom.ddd.sm.sim;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.mimacom.ddd.sm.sim.SimFactory
 * @model kind="package"
 * @generated
 */
public interface SimPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/sm/sim";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimPackage eINSTANCE = com.mimacom.ddd.sm.sim.impl.SimPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.impl.SystemInformationModelImpl <em>System Information Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.impl.SystemInformationModelImpl
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSystemInformationModel()
	 * @generated
	 */
	int SYSTEM_INFORMATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__NAME = TransposePackage.TINFORMATION_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__ALIAS = TransposePackage.TINFORMATION_MODEL__ALIAS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__DESCRIPTION = TransposePackage.TINFORMATION_MODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__NOTES = TransposePackage.TINFORMATION_MODEL__NOTES;

	/**
	 * The feature id for the '<em><b>Aggregates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__AGGREGATES = TransposePackage.TINFORMATION_MODEL__AGGREGATES;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__TYPES = TransposePackage.TINFORMATION_MODEL__TYPES;

	/**
	 * The feature id for the '<em><b>Indexing Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__INDEXING_HELPER = TransposePackage.TINFORMATION_MODEL__INDEXING_HELPER;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__KIND = TransposePackage.TINFORMATION_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL__GENERATE = TransposePackage.TINFORMATION_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Information Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL_FEATURE_COUNT = TransposePackage.TINFORMATION_MODEL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Allows Identity Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL___ALLOWS_IDENTITY_TYPES = TransposePackage.TINFORMATION_MODEL___ALLOWS_IDENTITY_TYPES;

	/**
	 * The number of operations of the '<em>System Information Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INFORMATION_MODEL_OPERATION_COUNT = TransposePackage.TINFORMATION_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sim.SystemInformationModelKind <em>System Information Model Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModelKind
	 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSystemInformationModelKind()
	 * @generated
	 */
	int SYSTEM_INFORMATION_MODEL_KIND = 1;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sim.SystemInformationModel <em>System Information Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Information Model</em>'.
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModel
	 * @generated
	 */
	EClass getSystemInformationModel();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SystemInformationModel#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModel#getKind()
	 * @see #getSystemInformationModel()
	 * @generated
	 */
	EAttribute getSystemInformationModel_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sim.SystemInformationModel#isGenerate <em>Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModel#isGenerate()
	 * @see #getSystemInformationModel()
	 * @generated
	 */
	EAttribute getSystemInformationModel_Generate();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.sm.sim.SystemInformationModelKind <em>System Information Model Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Information Model Kind</em>'.
	 * @see com.mimacom.ddd.sm.sim.SystemInformationModelKind
	 * @generated
	 */
	EEnum getSystemInformationModelKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimFactory getSimFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.impl.SystemInformationModelImpl <em>System Information Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.impl.SystemInformationModelImpl
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSystemInformationModel()
		 * @generated
		 */
		EClass SYSTEM_INFORMATION_MODEL = eINSTANCE.getSystemInformationModel();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFORMATION_MODEL__KIND = eINSTANCE.getSystemInformationModel_Kind();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_INFORMATION_MODEL__GENERATE = eINSTANCE.getSystemInformationModel_Generate();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sim.SystemInformationModelKind <em>System Information Model Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sim.SystemInformationModelKind
		 * @see com.mimacom.ddd.sm.sim.impl.SimPackageImpl#getSystemInformationModelKind()
		 * @generated
		 */
		EEnum SYSTEM_INFORMATION_MODEL_KIND = eINSTANCE.getSystemInformationModelKind();

	}

} //SimPackage
