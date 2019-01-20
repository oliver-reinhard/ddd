/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DExistingApplication;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDomain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.base.impl.DDomainImpl#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDomainImpl extends DNamedElementImpl implements DDomain
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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DType> types;

	/**
	 * The cached value of the '{@link #getAggregates() <em>Aggregates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregates()
	 * @generated
	 * @ordered
	 */
	protected EList<DAggregate> aggregates;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<DExistingApplication> applications;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DDomainEvent> events;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<DActor> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDomainImpl()
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
		return BasePackage.Literals.DDOMAIN;
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
			imports = new EObjectContainmentEList<DImport>(DImport.class, this, BasePackage.DDOMAIN__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DType> getTypes()
	{
		if (types == null)
		{
			types = new EObjectContainmentEList<DType>(DType.class, this, BasePackage.DDOMAIN__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DAggregate> getAggregates()
	{
		if (aggregates == null)
		{
			aggregates = new EObjectContainmentEList<DAggregate>(DAggregate.class, this, BasePackage.DDOMAIN__AGGREGATES);
		}
		return aggregates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DExistingApplication> getApplications()
	{
		if (applications == null)
		{
			applications = new EObjectContainmentEList<DExistingApplication>(DExistingApplication.class, this, BasePackage.DDOMAIN__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DDomainEvent> getEvents()
	{
		if (events == null)
		{
			events = new EObjectContainmentEList<DDomainEvent>(DDomainEvent.class, this, BasePackage.DDOMAIN__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DActor> getActors()
	{
		if (actors == null)
		{
			actors = new EObjectContainmentEList<DActor>(DActor.class, this, BasePackage.DDOMAIN__ACTORS);
		}
		return actors;
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
			case BasePackage.DDOMAIN__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__AGGREGATES:
				return ((InternalEList<?>)getAggregates()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case BasePackage.DDOMAIN__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
			case BasePackage.DDOMAIN__IMPORTS:
				return getImports();
			case BasePackage.DDOMAIN__TYPES:
				return getTypes();
			case BasePackage.DDOMAIN__AGGREGATES:
				return getAggregates();
			case BasePackage.DDOMAIN__APPLICATIONS:
				return getApplications();
			case BasePackage.DDOMAIN__EVENTS:
				return getEvents();
			case BasePackage.DDOMAIN__ACTORS:
				return getActors();
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
			case BasePackage.DDOMAIN__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends DImport>)newValue);
				return;
			case BasePackage.DDOMAIN__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends DType>)newValue);
				return;
			case BasePackage.DDOMAIN__AGGREGATES:
				getAggregates().clear();
				getAggregates().addAll((Collection<? extends DAggregate>)newValue);
				return;
			case BasePackage.DDOMAIN__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends DExistingApplication>)newValue);
				return;
			case BasePackage.DDOMAIN__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DDomainEvent>)newValue);
				return;
			case BasePackage.DDOMAIN__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends DActor>)newValue);
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
			case BasePackage.DDOMAIN__IMPORTS:
				getImports().clear();
				return;
			case BasePackage.DDOMAIN__TYPES:
				getTypes().clear();
				return;
			case BasePackage.DDOMAIN__AGGREGATES:
				getAggregates().clear();
				return;
			case BasePackage.DDOMAIN__APPLICATIONS:
				getApplications().clear();
				return;
			case BasePackage.DDOMAIN__EVENTS:
				getEvents().clear();
				return;
			case BasePackage.DDOMAIN__ACTORS:
				getActors().clear();
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
			case BasePackage.DDOMAIN__IMPORTS:
				return imports != null && !imports.isEmpty();
			case BasePackage.DDOMAIN__TYPES:
				return types != null && !types.isEmpty();
			case BasePackage.DDOMAIN__AGGREGATES:
				return aggregates != null && !aggregates.isEmpty();
			case BasePackage.DDOMAIN__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case BasePackage.DDOMAIN__EVENTS:
				return events != null && !events.isEmpty();
			case BasePackage.DDOMAIN__ACTORS:
				return actors != null && !actors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DDomainImpl
