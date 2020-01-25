/**
 */
package com.mimacom.ddd.dm.dem.util;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;

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
			public Adapter caseDemModel(DemModel object)
			{
				return createDemModelAdapter();
			}
			@Override
			public Adapter caseDDomainEvent(DDomainEvent object)
			{
				return createDDomainEventAdapter();
			}
			@Override
			public Adapter caseDCaseConjunction(DCaseConjunction object)
			{
				return createDCaseConjunctionAdapter();
			}
			@Override
			public Adapter caseDNotification(DNotification object)
			{
				return createDNotificationAdapter();
			}
			@Override
			public Adapter caseDMessage(DMessage object)
			{
				return createDMessageAdapter();
			}
			@Override
			public Adapter caseDemActorModel(DemActorModel object)
			{
				return createDemActorModelAdapter();
			}
			@Override
			public Adapter caseDActor(DActor object)
			{
				return createDActorAdapter();
			}
			@Override
			public Adapter caseDHumanActorRole(DHumanActorRole object)
			{
				return createDHumanActorRoleAdapter();
			}
			@Override
			public Adapter caseDService(DService object)
			{
				return createDServiceAdapter();
			}
			@Override
			public Adapter caseDNamedElement(DNamedElement object)
			{
				return createDNamedElementAdapter();
			}
			@Override
			public Adapter caseDNamespace(DNamespace object)
			{
				return createDNamespaceAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DemModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DemModel
	 * @generated
	 */
	public Adapter createDemModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DDomainEvent <em>DDomain Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DDomainEvent
	 * @generated
	 */
	public Adapter createDDomainEventAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DCaseConjunction <em>DCase Conjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DCaseConjunction
	 * @generated
	 */
	public Adapter createDCaseConjunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DNotification <em>DNotification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DNotification
	 * @generated
	 */
	public Adapter createDNotificationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DMessage <em>DMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DMessage
	 * @generated
	 */
	public Adapter createDMessageAdapter()
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DActor <em>DActor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DActor
	 * @generated
	 */
	public Adapter createDActorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DHumanActorRole <em>DHuman Actor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DHumanActorRole
	 * @generated
	 */
	public Adapter createDHumanActorRoleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dem.DService <em>DService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dem.DService
	 * @generated
	 */
	public Adapter createDServiceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DNamedElement <em>DNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DNamedElement
	 * @generated
	 */
	public Adapter createDNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DNamespace <em>DNamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DNamespace
	 * @generated
	 */
	public Adapter createDNamespaceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.INavigableMemberContainer <em>INavigable Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.INavigableMemberContainer
	 * @generated
	 */
	public Adapter createINavigableMemberContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IStaticReferenceTarget
	 * @generated
	 */
	public Adapter createIStaticReferenceTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IDiagramRoot <em>IDiagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IDiagramRoot
	 * @generated
	 */
	public Adapter createIDiagramRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DNavigableMember <em>DNavigable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember
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
