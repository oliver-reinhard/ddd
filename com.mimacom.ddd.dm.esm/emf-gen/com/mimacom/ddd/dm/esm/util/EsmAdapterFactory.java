/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.util;

import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.IIdentityStateModel;
import com.mimacom.ddd.dm.base.INamespace;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;

import com.mimacom.ddd.dm.esm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.esm.EsmPackage
 * @generated
 */
public class EsmAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EsmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EsmAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = EsmPackage.eINSTANCE;
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
	protected EsmSwitch<Adapter> modelSwitch =
		new EsmSwitch<Adapter>()
		{
			@Override
			public Adapter caseDEntityStateModel(DEntityStateModel object)
			{
				return createDEntityStateModelAdapter();
			}
			@Override
			public Adapter caseDState(DState object)
			{
				return createDStateAdapter();
			}
			@Override
			public Adapter caseDEvent(DEvent object)
			{
				return createDEventAdapter();
			}
			@Override
			public Adapter caseDTransition(DTransition object)
			{
				return createDTransitionAdapter();
			}
			@Override
			public Adapter caseDNamedElement(DNamedElement object)
			{
				return createDNamedElementAdapter();
			}
			@Override
			public Adapter caseIIdentityStateModel(IIdentityStateModel object)
			{
				return createIIdentityStateModelAdapter();
			}
			@Override
			public Adapter caseINamespace(INamespace object)
			{
				return createINamespaceAdapter();
			}
			@Override
			public Adapter caseINavigableMemberContainer(INavigableMemberContainer object)
			{
				return createINavigableMemberContainerAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.esm.DEntityStateModel <em>DEntity State Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.esm.DEntityStateModel
	 * @generated
	 */
	public Adapter createDEntityStateModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.esm.DState <em>DState</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.esm.DState
	 * @generated
	 */
	public Adapter createDStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.esm.DEvent <em>DEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.esm.DEvent
	 * @generated
	 */
	public Adapter createDEventAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.esm.DTransition <em>DTransition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.esm.DTransition
	 * @generated
	 */
	public Adapter createDTransitionAdapter()
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IIdentityStateModel <em>IIdentity State Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IIdentityStateModel
	 * @generated
	 */
	public Adapter createIIdentityStateModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.INamespace <em>INamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.INamespace
	 * @generated
	 */
	public Adapter createINamespaceAdapter()
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

} //EsmAdapterFactory
