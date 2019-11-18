/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom;

import com.mimacom.ddd.dm.base.BasePackage;

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
 * @see com.mimacom.ddd.dm.dom.DomFactory
 * @model kind="package"
 * @generated
 */
public interface DomPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/dom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomPackage eINSTANCE = com.mimacom.ddd.dm.dom.impl.DomPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dom.impl.DomModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dom.impl.DomModelImpl
	 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomModel()
	 * @generated
	 */
	int DOM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Snapshots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_MODEL__SNAPSHOTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dom.impl.DomSnapshotImpl <em>Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dom.impl.DomSnapshotImpl
	 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomSnapshot()
	 * @generated
	 */
	int DOM_SNAPSHOT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_SNAPSHOT__NAME = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_SNAPSHOT__OBJECTS = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_SNAPSHOT_FEATURE_COUNT = BasePackage.INAVIGABLE_MEMBER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dom.impl.DomObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dom.impl.DomObjectImpl
	 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomObject()
	 * @generated
	 */
	int DOM_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__NAME = BasePackage.DNAVIGABLE_MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__ALIASES = BasePackage.DNAVIGABLE_MEMBER__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__DESCRIPTION = BasePackage.DNAVIGABLE_MEMBER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__TYPE = BasePackage.DNAVIGABLE_MEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__MULTIPLICITY = BasePackage.DNAVIGABLE_MEMBER__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__OPTIONAL = BasePackage.DNAVIGABLE_MEMBER__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT__COLLECTION = BasePackage.DNAVIGABLE_MEMBER__COLLECTION;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_OBJECT_FEATURE_COUNT = BasePackage.DNAVIGABLE_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dom.impl.DomNamedComplexObjectImpl <em>Named Complex Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dom.impl.DomNamedComplexObjectImpl
	 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomNamedComplexObject()
	 * @generated
	 */
	int DOM_NAMED_COMPLEX_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__NAME = DOM_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__ALIASES = DOM_OBJECT__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__DESCRIPTION = DOM_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__TYPE = DOM_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__MULTIPLICITY = DOM_OBJECT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__OPTIONAL = DOM_OBJECT__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__COLLECTION = DOM_OBJECT__COLLECTION;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT__OBJECT = DOM_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Complex Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOM_NAMED_COMPLEX_OBJECT_FEATURE_COUNT = DOM_OBJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dom.DomModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomModel
	 * @generated
	 */
	EClass getDomModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dom.DomModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomModel#getImports()
	 * @see #getDomModel()
	 * @generated
	 */
	EReference getDomModel_Imports();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dom.DomModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomModel#getName()
	 * @see #getDomModel()
	 * @generated
	 */
	EAttribute getDomModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dom.DomModel#getSnapshots <em>Snapshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Snapshots</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomModel#getSnapshots()
	 * @see #getDomModel()
	 * @generated
	 */
	EReference getDomModel_Snapshots();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dom.DomSnapshot <em>Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snapshot</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomSnapshot
	 * @generated
	 */
	EClass getDomSnapshot();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dom.DomSnapshot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomSnapshot#getName()
	 * @see #getDomSnapshot()
	 * @generated
	 */
	EAttribute getDomSnapshot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dom.DomSnapshot#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomSnapshot#getObjects()
	 * @see #getDomSnapshot()
	 * @generated
	 */
	EReference getDomSnapshot_Objects();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dom.DomObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomObject
	 * @generated
	 */
	EClass getDomObject();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dom.DomNamedComplexObject <em>Named Complex Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Complex Object</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomNamedComplexObject
	 * @generated
	 */
	EClass getDomNamedComplexObject();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dom.DomNamedComplexObject#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see com.mimacom.ddd.dm.dom.DomNamedComplexObject#getObject()
	 * @see #getDomNamedComplexObject()
	 * @generated
	 */
	EReference getDomNamedComplexObject_Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomFactory getDomFactory();

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
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dom.impl.DomModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dom.impl.DomModelImpl
		 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomModel()
		 * @generated
		 */
		EClass DOM_MODEL = eINSTANCE.getDomModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOM_MODEL__IMPORTS = eINSTANCE.getDomModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOM_MODEL__NAME = eINSTANCE.getDomModel_Name();

		/**
		 * The meta object literal for the '<em><b>Snapshots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOM_MODEL__SNAPSHOTS = eINSTANCE.getDomModel_Snapshots();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dom.impl.DomSnapshotImpl <em>Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dom.impl.DomSnapshotImpl
		 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomSnapshot()
		 * @generated
		 */
		EClass DOM_SNAPSHOT = eINSTANCE.getDomSnapshot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOM_SNAPSHOT__NAME = eINSTANCE.getDomSnapshot_Name();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOM_SNAPSHOT__OBJECTS = eINSTANCE.getDomSnapshot_Objects();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dom.impl.DomObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dom.impl.DomObjectImpl
		 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomObject()
		 * @generated
		 */
		EClass DOM_OBJECT = eINSTANCE.getDomObject();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dom.impl.DomNamedComplexObjectImpl <em>Named Complex Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dom.impl.DomNamedComplexObjectImpl
		 * @see com.mimacom.ddd.dm.dom.impl.DomPackageImpl#getDomNamedComplexObject()
		 * @generated
		 */
		EClass DOM_NAMED_COMPLEX_OBJECT = eINSTANCE.getDomNamedComplexObject();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOM_NAMED_COMPLEX_OBJECT__OBJECT = eINSTANCE.getDomNamedComplexObject_Object();

	}

} //DomPackage
