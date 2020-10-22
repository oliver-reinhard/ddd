/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.div.impl;

import com.mimacom.ddd.dm.div.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DivFactoryImpl extends EFactoryImpl implements DivFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DivFactory init()
	{
		try
		{
			DivFactory theDivFactory = (DivFactory)EPackage.Registry.INSTANCE.getEFactory(DivPackage.eNS_URI);
			if (theDivFactory != null)
			{
				return theDivFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DivFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case DivPackage.DOMAIN_INFORMATION_VIEW: return createDomainInformationView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainInformationView createDomainInformationView()
	{
		DomainInformationViewImpl domainInformationView = new DomainInformationViewImpl();
		return domainInformationView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DivPackage getDivPackage()
	{
		return (DivPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DivPackage getPackage()
	{
		return DivPackage.eINSTANCE;
	}

} //DivFactoryImpl