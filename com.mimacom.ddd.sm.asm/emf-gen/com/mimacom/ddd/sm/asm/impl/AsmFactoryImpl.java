/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.impl;

import com.mimacom.ddd.sm.asm.*;

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
public class AsmFactoryImpl extends EFactoryImpl implements AsmFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AsmFactory init()
	{
		try
		{
			AsmFactory theAsmFactory = (AsmFactory)EPackage.Registry.INSTANCE.getEFactory(AsmPackage.eNS_URI);
			if (theAsmFactory != null)
			{
				return theAsmFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsmFactoryImpl()
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
			case AsmPackage.SAPPLICATION: return createSApplication();
			case AsmPackage.SSERVICE_INTERFACE: return createSServiceInterface();
			case AsmPackage.SWATCHDOG: return createSWatchdog();
			case AsmPackage.SHUMAN: return createSHuman();
			case AsmPackage.SSERVICE_OPERATION: return createSServiceOperation();
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
	public SApplication createSApplication()
	{
		SApplicationImpl sApplication = new SApplicationImpl();
		return sApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SServiceInterface createSServiceInterface()
	{
		SServiceInterfaceImpl sServiceInterface = new SServiceInterfaceImpl();
		return sServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SWatchdog createSWatchdog()
	{
		SWatchdogImpl sWatchdog = new SWatchdogImpl();
		return sWatchdog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SHuman createSHuman()
	{
		SHumanImpl sHuman = new SHumanImpl();
		return sHuman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SServiceOperation createSServiceOperation()
	{
		SServiceOperationImpl sServiceOperation = new SServiceOperationImpl();
		return sServiceOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsmPackage getAsmPackage()
	{
		return (AsmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AsmPackage getPackage()
	{
		return AsmPackage.eINSTANCE;
	}

} //AsmFactoryImpl