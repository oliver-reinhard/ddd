/**
 */
package com.mimacom.ddd.sm.sus;

import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DRichText;

import com.mimacom.ddd.dm.dem.DemDomainEvent;

import com.mimacom.ddd.pub.pub.Section;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sus.UserStory#getEvent <em>Event</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.UserStory#getGoal <em>Goal</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.UserStory#getSections <em>Sections</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.UserStory#getJiraKey <em>Jira Key</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.sm.sus.SusPackage#getUserStory()
 * @model
 * @generated
 */
public interface UserStory extends DModel {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(DemDomainEvent)
	 * @see com.mimacom.ddd.sm.sus.SusPackage#getUserStory_Event()
	 * @model
	 * @generated
	 */
	DemDomainEvent getEvent();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sus.UserStory#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(DemDomainEvent value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(DRichText)
	 * @see com.mimacom.ddd.sm.sus.SusPackage#getUserStory_Goal()
	 * @model containment="true"
	 * @generated
	 */
	DRichText getGoal();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sus.UserStory#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(DRichText value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.pub.pub.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see com.mimacom.ddd.sm.sus.SusPackage#getUserStory_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Jira Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jira Key</em>' attribute.
	 * @see #setJiraKey(String)
	 * @see com.mimacom.ddd.sm.sus.SusPackage#getUserStory_JiraKey()
	 * @model unique="false"
	 * @generated
	 */
	String getJiraKey();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.sm.sus.UserStory#getJiraKey <em>Jira Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jira Key</em>' attribute.
	 * @see #getJiraKey()
	 * @generated
	 */
	void setJiraKey(String value);

} // UserStory
