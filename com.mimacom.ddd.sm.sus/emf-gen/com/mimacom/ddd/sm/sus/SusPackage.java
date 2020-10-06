/**
 */
package com.mimacom.ddd.sm.sus;

import com.mimacom.ddd.dm.base.base.BasePackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.sm.sus.SusFactory
 * @model kind="package"
 * @generated
 */
public interface SusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/sm/sus";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sus";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SusPackage eINSTANCE = com.mimacom.ddd.sm.sus.impl.SusPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.sm.sus.impl.UserStoryImpl
	 * @see com.mimacom.ddd.sm.sus.impl.SusPackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__NAME = BasePackage.DMODEL__NAME;

	/**
	 * The feature id for the '<em><b>Aliases</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ALIASES = BasePackage.DMODEL__ALIASES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__DESCRIPTION = BasePackage.DMODEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__EVENT = BasePackage.DMODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__GOAL = BasePackage.DMODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__SECTIONS = BasePackage.DMODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jira Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__JIRA_KEY = BasePackage.DMODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = BasePackage.DMODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_OPERATION_COUNT = BasePackage.DMODEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.sm.sus.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see com.mimacom.ddd.sm.sus.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.sm.sus.UserStory#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see com.mimacom.ddd.sm.sus.UserStory#getEvent()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Event();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.sm.sus.UserStory#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal</em>'.
	 * @see com.mimacom.ddd.sm.sus.UserStory#getGoal()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.sm.sus.UserStory#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see com.mimacom.ddd.sm.sus.UserStory#getSections()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Sections();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.sm.sus.UserStory#getJiraKey <em>Jira Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jira Key</em>'.
	 * @see com.mimacom.ddd.sm.sus.UserStory#getJiraKey()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_JiraKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SusFactory getSusFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.sm.sus.impl.UserStoryImpl
		 * @see com.mimacom.ddd.sm.sus.impl.SusPackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__EVENT = eINSTANCE.getUserStory_Event();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__GOAL = eINSTANCE.getUserStory_Goal();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__SECTIONS = eINSTANCE.getUserStory_Sections();

		/**
		 * The meta object literal for the '<em><b>Jira Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__JIRA_KEY = eINSTANCE.getUserStory_JiraKey();

	}

} //SusPackage
