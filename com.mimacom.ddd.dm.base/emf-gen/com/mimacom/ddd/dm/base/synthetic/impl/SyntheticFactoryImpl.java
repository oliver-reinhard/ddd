/**
 */
package com.mimacom.ddd.dm.base.synthetic.impl;

import com.mimacom.ddd.dm.base.synthetic.*;

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
public class SyntheticFactoryImpl extends EFactoryImpl implements SyntheticFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SyntheticFactory init()
	{
		try
		{
			SyntheticFactory theSyntheticFactory = (SyntheticFactory)EPackage.Registry.INSTANCE.getEFactory(SyntheticPackage.eNS_URI);
			if (theSyntheticFactory != null)
			{
				return theSyntheticFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SyntheticFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntheticFactoryImpl()
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
			case SyntheticPackage.TSYNTHETIC_AGGREGATE: return createTSyntheticAggregate();
			case SyntheticPackage.TSYNTHETIC_PRIMITIVE: return createTSyntheticPrimitive();
			case SyntheticPackage.TSYNTHETIC_ENUMERATION: return createTSyntheticEnumeration();
			case SyntheticPackage.TSYNTHETIC_LITERAL: return createTSyntheticLiteral();
			case SyntheticPackage.TSYNTHETIC_DETAIL_TYPE: return createTSyntheticDetailType();
			case SyntheticPackage.TSYNTHETIC_ENTITY_TYPE: return createTSyntheticEntityType();
			case SyntheticPackage.TSYNTHETIC_ASSOCIATION: return createTSyntheticAssociation();
			case SyntheticPackage.TSYNTHETIC_ATTRIBUTE: return createTSyntheticAttribute();
			case SyntheticPackage.TSYNTHETIC_QUERY: return createTSyntheticQuery();
			case SyntheticPackage.TSYNTHETIC_QUERY_PARAMETER: return createTSyntheticQueryParameter();
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
	public TSyntheticAggregate createTSyntheticAggregate()
	{
		TSyntheticAggregateImpl tSyntheticAggregate = new TSyntheticAggregateImpl();
		return tSyntheticAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticPrimitive createTSyntheticPrimitive()
	{
		TSyntheticPrimitiveImpl tSyntheticPrimitive = new TSyntheticPrimitiveImpl();
		return tSyntheticPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticEnumeration createTSyntheticEnumeration()
	{
		TSyntheticEnumerationImpl tSyntheticEnumeration = new TSyntheticEnumerationImpl();
		return tSyntheticEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticLiteral createTSyntheticLiteral()
	{
		TSyntheticLiteralImpl tSyntheticLiteral = new TSyntheticLiteralImpl();
		return tSyntheticLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticDetailType createTSyntheticDetailType()
	{
		TSyntheticDetailTypeImpl tSyntheticDetailType = new TSyntheticDetailTypeImpl();
		return tSyntheticDetailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticEntityType createTSyntheticEntityType()
	{
		TSyntheticEntityTypeImpl tSyntheticEntityType = new TSyntheticEntityTypeImpl();
		return tSyntheticEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticAssociation createTSyntheticAssociation()
	{
		TSyntheticAssociationImpl tSyntheticAssociation = new TSyntheticAssociationImpl();
		return tSyntheticAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticAttribute createTSyntheticAttribute()
	{
		TSyntheticAttributeImpl tSyntheticAttribute = new TSyntheticAttributeImpl();
		return tSyntheticAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticQuery createTSyntheticQuery()
	{
		TSyntheticQueryImpl tSyntheticQuery = new TSyntheticQueryImpl();
		return tSyntheticQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSyntheticQueryParameter createTSyntheticQueryParameter()
	{
		TSyntheticQueryParameterImpl tSyntheticQueryParameter = new TSyntheticQueryParameterImpl();
		return tSyntheticQueryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SyntheticPackage getSyntheticPackage()
	{
		return (SyntheticPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SyntheticPackage getPackage()
	{
		return SyntheticPackage.eINSTANCE;
	}

} //SyntheticFactoryImpl
