/**
 */
package com.mimacom.ddd.dm.dim.impl;

import com.mimacom.ddd.dm.dim.*;

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
public class DimFactoryImpl extends EFactoryImpl implements DimFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DimFactory init()
	{
		try
		{
			DimFactory theDimFactory = (DimFactory)EPackage.Registry.INSTANCE.getEFactory(DimPackage.eNS_URI);
			if (theDimFactory != null)
			{
				return theDimFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimFactoryImpl()
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
			case DimPackage.DOMAIN_INFORMATION_MODEL: return createDomainInformationModel();
			case DimPackage.DIM_AGGREGATE: return createDimAggregate();
			case DimPackage.DIM_PRIMITIVE: return createDimPrimitive();
			case DimPackage.DIM_ENUMERATION: return createDimEnumeration();
			case DimPackage.DIM_LITERAL: return createDimLiteral();
			case DimPackage.DIM_DETAIL_TYPE: return createDimDetailType();
			case DimPackage.DIM_ENTITY_TYPE: return createDimEntityType();
			case DimPackage.DIM_ASSOCIATION: return createDimAssociation();
			case DimPackage.DIM_ATTRIBUTE: return createDimAttribute();
			case DimPackage.DIM_QUERY: return createDimQuery();
			case DimPackage.DIM_QUERY_PARAMETER: return createDimQueryParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainInformationModel createDomainInformationModel()
	{
		DomainInformationModelImpl domainInformationModel = new DomainInformationModelImpl();
		return domainInformationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimAggregate createDimAggregate()
	{
		DimAggregateImpl dimAggregate = new DimAggregateImpl();
		return dimAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimPrimitive createDimPrimitive()
	{
		DimPrimitiveImpl dimPrimitive = new DimPrimitiveImpl();
		return dimPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimEnumeration createDimEnumeration()
	{
		DimEnumerationImpl dimEnumeration = new DimEnumerationImpl();
		return dimEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimLiteral createDimLiteral()
	{
		DimLiteralImpl dimLiteral = new DimLiteralImpl();
		return dimLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimDetailType createDimDetailType()
	{
		DimDetailTypeImpl dimDetailType = new DimDetailTypeImpl();
		return dimDetailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimEntityType createDimEntityType()
	{
		DimEntityTypeImpl dimEntityType = new DimEntityTypeImpl();
		return dimEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimAssociation createDimAssociation()
	{
		DimAssociationImpl dimAssociation = new DimAssociationImpl();
		return dimAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimAttribute createDimAttribute()
	{
		DimAttributeImpl dimAttribute = new DimAttributeImpl();
		return dimAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimQuery createDimQuery()
	{
		DimQueryImpl dimQuery = new DimQueryImpl();
		return dimQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimQueryParameter createDimQueryParameter()
	{
		DimQueryParameterImpl dimQueryParameter = new DimQueryParameterImpl();
		return dimQueryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimPackage getDimPackage()
	{
		return (DimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DimPackage getPackage()
	{
		return DimPackage.eINSTANCE;
	}

} //DimFactoryImpl
