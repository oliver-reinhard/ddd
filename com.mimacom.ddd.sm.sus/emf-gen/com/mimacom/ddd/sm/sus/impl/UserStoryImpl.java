/**
 */
package com.mimacom.ddd.sm.sus.impl;

import com.mimacom.ddd.dm.base.base.DRichText;

import com.mimacom.ddd.dm.base.base.impl.DModelImpl;

import com.mimacom.ddd.dm.dem.DemDomainEvent;

import com.mimacom.ddd.pub.pub.Section;

import com.mimacom.ddd.sm.sus.SusPackage;
import com.mimacom.ddd.sm.sus.UserStory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getJiraKey <em>Jira Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserStoryImpl extends DModelImpl implements UserStory {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected DemDomainEvent event;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected DRichText goal;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

	/**
	 * The default value of the '{@link #getJiraKey() <em>Jira Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJiraKey()
	 * @generated
	 * @ordered
	 */
	protected static final String JIRA_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJiraKey() <em>Jira Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJiraKey()
	 * @generated
	 * @ordered
	 */
	protected String jiraKey = JIRA_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SusPackage.Literals.USER_STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemDomainEvent getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject)event;
			event = (DemDomainEvent)eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SusPackage.USER_STORY__EVENT, oldEvent, event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemDomainEvent basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(DemDomainEvent newEvent) {
		DemDomainEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SusPackage.USER_STORY__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRichText getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(DRichText newGoal, NotificationChain msgs) {
		DRichText oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SusPackage.USER_STORY__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(DRichText newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SusPackage.USER_STORY__GOAL, null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SusPackage.USER_STORY__GOAL, null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SusPackage.USER_STORY__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, SusPackage.USER_STORY__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJiraKey() {
		return jiraKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJiraKey(String newJiraKey) {
		String oldJiraKey = jiraKey;
		jiraKey = newJiraKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SusPackage.USER_STORY__JIRA_KEY, oldJiraKey, jiraKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SusPackage.USER_STORY__GOAL:
				return basicSetGoal(null, msgs);
			case SusPackage.USER_STORY__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SusPackage.USER_STORY__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case SusPackage.USER_STORY__GOAL:
				return getGoal();
			case SusPackage.USER_STORY__SECTIONS:
				return getSections();
			case SusPackage.USER_STORY__JIRA_KEY:
				return getJiraKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SusPackage.USER_STORY__EVENT:
				setEvent((DemDomainEvent)newValue);
				return;
			case SusPackage.USER_STORY__GOAL:
				setGoal((DRichText)newValue);
				return;
			case SusPackage.USER_STORY__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case SusPackage.USER_STORY__JIRA_KEY:
				setJiraKey((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SusPackage.USER_STORY__EVENT:
				setEvent((DemDomainEvent)null);
				return;
			case SusPackage.USER_STORY__GOAL:
				setGoal((DRichText)null);
				return;
			case SusPackage.USER_STORY__SECTIONS:
				getSections().clear();
				return;
			case SusPackage.USER_STORY__JIRA_KEY:
				setJiraKey(JIRA_KEY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SusPackage.USER_STORY__EVENT:
				return event != null;
			case SusPackage.USER_STORY__GOAL:
				return goal != null;
			case SusPackage.USER_STORY__SECTIONS:
				return sections != null && !sections.isEmpty();
			case SusPackage.USER_STORY__JIRA_KEY:
				return JIRA_KEY_EDEFAULT == null ? jiraKey != null : !JIRA_KEY_EDEFAULT.equals(jiraKey);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jiraKey: ");
		result.append(jiraKey);
		result.append(')');
		return result.toString();
	}

} //UserStoryImpl
