/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.impl;

import com.mimacom.ddd.dm.dom.*;

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
public class DomFactoryImpl extends EFactoryImpl implements DomFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomFactory init()
	{
		try
		{
			DomFactory theDomFactory = (DomFactory)EPackage.Registry.INSTANCE.getEFactory(DomPackage.eNS_URI);
			if (theDomFactory != null)
			{
				return theDomFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomFactoryImpl()
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
			case DomPackage.DOM_MODEL: return createDomModel();
			case DomPackage.DOM_SNAPSHOT: return createDomSnapshot();
			case DomPackage.DOM_FIELD: return createDomField();
			case DomPackage.DOM_NAMED_COMPLEX_OBJECT: return createDomNamedComplexObject();
			case DomPackage.DOM_ENTITY: return createDomEntity();
			case DomPackage.DOM_DETAIL: return createDomDetail();
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
	public DomModel createDomModel()
	{
		DomModelImpl domModel = new DomModelImpl();
		return domModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomSnapshot createDomSnapshot()
	{
		DomSnapshotImpl domSnapshot = new DomSnapshotImpl();
		return domSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomField createDomField()
	{
		DomFieldImplCustom domField = new DomFieldImplCustom();
		return domField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomNamedComplexObject createDomNamedComplexObject()
	{
		DomNamedComplexObjectImplCustom domNamedComplexObject = new DomNamedComplexObjectImplCustom();
		return domNamedComplexObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomEntity createDomEntity()
	{
		DomEntityImpl domEntity = new DomEntityImpl();
		return domEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomDetail createDomDetail()
	{
		DomDetailImpl domDetail = new DomDetailImpl();
		return domDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomPackage getDomPackage()
	{
		return (DomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomPackage getPackage()
	{
		return DomPackage.eINSTANCE;
	}

} //DomFactoryImpl
