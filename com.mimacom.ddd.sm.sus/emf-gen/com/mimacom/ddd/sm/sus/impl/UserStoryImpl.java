/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus.impl;

import com.mimacom.ddd.dm.base.DImport;

import com.mimacom.ddd.dm.base.impl.DNamedElementImpl;

import com.mimacom.ddd.sm.sus.Section;
import com.mimacom.ddd.sm.sus.SusPackage;
import com.mimacom.ddd.sm.sus.UserStory;

import dem.DDomainEvent;

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
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link com.mimacom.ddd.sm.sus.impl.UserStoryImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserStoryImpl extends DNamedElementImpl implements UserStory
{
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DImport> imports;

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
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected DDomainEvent event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserStoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SusPackage.Literals.USER_STORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DImport> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<DImport>(DImport.class, this, SusPackage.USER_STORY__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSections()
	{
		if (sections == null)
		{
			sections = new EObjectContainmentEList<Section>(Section.class, this, SusPackage.USER_STORY__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDomainEvent getEvent()
	{
		if (event != null && event.eIsProxy())
		{
			InternalEObject oldEvent = (InternalEObject)event;
			event = (DDomainEvent)eResolveProxy(oldEvent);
			if (event != oldEvent)
			{
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
	public DDomainEvent basicGetEvent()
	{
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(DDomainEvent newEvent)
	{
		DDomainEvent oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SusPackage.USER_STORY__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case SusPackage.USER_STORY__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SusPackage.USER_STORY__IMPORTS:
				return getImports();
			case SusPackage.USER_STORY__SECTIONS:
				return getSections();
			case SusPackage.USER_STORY__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SusPackage.USER_STORY__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DImport>)newValue);
				return;
			case SusPackage.USER_STORY__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case SusPackage.USER_STORY__EVENT:
				setEvent((DDomainEvent)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SusPackage.USER_STORY__IMPORTS:
				getImports().clear();
				return;
			case SusPackage.USER_STORY__SECTIONS:
				getSections().clear();
				return;
			case SusPackage.USER_STORY__EVENT:
				setEvent((DDomainEvent)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SusPackage.USER_STORY__IMPORTS:
				return imports != null && !imports.isEmpty();
			case SusPackage.USER_STORY__SECTIONS:
				return sections != null && !sections.isEmpty();
			case SusPackage.USER_STORY__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //UserStoryImpl
