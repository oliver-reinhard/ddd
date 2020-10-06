/**
 */
package com.mimacom.ddd.dm.dem.util;

import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;

import com.mimacom.ddd.dm.dem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dem.DemPackage
 * @generated
 */
public class DemAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = DemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemSwitch<Adapter> modelSwitch =
		new DemSwitch<Adapter>()
		{
			@Override
			public Adapter caseDemDomainEvent(DemDomainEvent object)
			{
				return createDemDomainEventAdapter();
			}
			@Override
			public Adapter caseDemCaseConjunction(DemCaseConjunction object)
			{
				return createDemCaseConjunctionAdapter();
			}
			@Override
			public Adapter caseDemNotification(DemNotification object)
			{
				return createDemNotificationAdapter();
			}
			@Override
			public Adapter caseDemMessage(DemMessage object)
			{
				return createDemMessageAdapter();
			}
			@Override
			public Adapter caseDemActorModel(DemActorModel object)
			{
				return createDemActorModelAdapter();
			}
			@Override
			public Adapter caseDemActor(DemActor object)
			{
				return createDemActorAdapter();
			}
			@Override
			public Adapter caseDemHumanActorRole(DemHumanActorRole object)
			{
				return createDemHumanActorRoleAdapter();
			}
			@Override
			public Adapter caseDemService(DemService object)
			{
				return createDemServiceAdapter();
			}
			@Override
			public Adapter caseDemEventsOverviewModel(DemEventsOverviewModel object)
			{
				return createDemEventsOverviewModelAdapter();
			}
			@Override
			public Adapter caseDNamedElement(DNamedElement object)
			{
				return createDNamedElementAdapter();
			}
			@Override
			public Adapter caseDModel(DModel object)
			{
				return createDModelAdapter();
			}
			@Override
			public Adapter caseINavigableMemberContainer(INavigableMemberContainer object)
			{
				return createINavigableMemberContainerAdapter();
			}
			@Override
			public Adapter caseIStaticReferenceTarget(IStaticReferenceTarget object)
			{
				return createIStaticReferenceTargetAdapter();
			}
			@Override
			public Adapter caseIDiagramRoot(IDiagramRoot object)
			{
				return createIDiagramRootAdapter();
			}
			@Override
			public Adapter caseDNavigableMember(DNavigableMember object)
			{
				return createDNavigableMemberAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemDomainEvent <em>Domain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemDomainEvent
	 * @generated
	 */
	public Adapter createDemDomainEventAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemCaseConjunction <em>Case Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemCaseConjunction
	 * @generated
	 */
	public Adapter createDemCaseConjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemNotification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemNotification
	 * @generated
	 */
	public Adapter createDemNotificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemMessage
	 * @generated
	 */
	public Adapter createDemMessageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemActorModel <em>Actor Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemActorModel
	 * @generated
	 */
	public Adapter createDemActorModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemActor
	 * @generated
	 */
	public Adapter createDemActorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemHumanActorRole <em>Human Actor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemHumanActorRole
	 * @generated
	 */
	public Adapter createDemHumanActorRoleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemService
	 * @generated
	 */
	public Adapter createDemServiceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemEventsOverviewModel <em>Events Overview Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemEventsOverviewModel
	 * @generated
	 */
	public Adapter createDemEventsOverviewModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DNamedElement <em>DNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DNamedElement
	 * @generated
	 */
	public Adapter createDNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DModel
	 * @generated
	 */
	public Adapter createDModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.INavigableMemberContainer <em>INavigable Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.INavigableMemberContainer
	 * @generated
	 */
	public Adapter createINavigableMemberContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.IStaticReferenceTarget
	 * @generated
	 */
	public Adapter createIStaticReferenceTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.IDiagramRoot <em>IDiagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.IDiagramRoot
	 * @generated
	 */
	public Adapter createIDiagramRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DNavigableMember <em>DNavigable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DNavigableMember
	 * @generated
	 */
	public Adapter createDNavigableMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //DemAdapterFactory
