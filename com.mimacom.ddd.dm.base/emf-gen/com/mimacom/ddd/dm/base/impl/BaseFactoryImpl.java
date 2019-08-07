/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class BaseFactoryImpl extends EFactoryImpl implements BaseFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaseFactory init()
	{
		try
		{
			BaseFactory theBaseFactory = (BaseFactory)EPackage.Registry.INSTANCE.getEFactory(BasePackage.eNS_URI);
			if (theBaseFactory != null)
			{
				return theBaseFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl()
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
			case BasePackage.DTEXT_SEGMENT: return createDTextSegment();
			case BasePackage.DRICH_TEXT: return createDRichText();
			case BasePackage.DIMPORT: return createDImport();
			case BasePackage.DDOMAIN: return createDDomain();
			case BasePackage.DAGGREGATE: return createDAggregate();
			case BasePackage.DNAMED_PREDICATE: return createDNamedPredicate();
			case BasePackage.DPRIMITIVE: return createDPrimitive();
			case BasePackage.DENUMERATION: return createDEnumeration();
			case BasePackage.DLITERAL: return createDLiteral();
			case BasePackage.DDETAIL_TYPE: return createDDetailType();
			case BasePackage.DENTITY_TYPE: return createDEntityType();
			case BasePackage.DRELATIONSHIP: return createDRelationship();
			case BasePackage.DASSOCIATION: return createDAssociation();
			case BasePackage.DMULTIPLICITY: return createDMultiplicity();
			case BasePackage.DATTRIBUTE: return createDAttribute();
			case BasePackage.DQUERY: return createDQuery();
			case BasePackage.DQUERY_PARAMETER: return createDQueryParameter();
			case BasePackage.DDOMAIN_EVENT: return createDDomainEvent();
			case BasePackage.DCASE_CONJUNCTION: return createDCaseConjunction();
			case BasePackage.DCONTEXT: return createDContext();
			case BasePackage.DNOTIFICATION: return createDNotification();
			case BasePackage.DMESSAGE: return createDMessage();
			case BasePackage.DHUMAN_ACTOR_ROLE: return createDHumanActorRole();
			case BasePackage.DSERVICE: return createDService();
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
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case BasePackage.DIDENTITY_ORIGIN:
				return createDIdentityOriginFromString(eDataType, initialValue);
			case BasePackage.DASSOCIATION_KIND:
				return createDAssociationKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case BasePackage.DIDENTITY_ORIGIN:
				return convertDIdentityOriginToString(eDataType, instanceValue);
			case BasePackage.DASSOCIATION_KIND:
				return convertDAssociationKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTextSegment createDTextSegment()
	{
		DTextSegmentImpl dTextSegment = new DTextSegmentImpl();
		return dTextSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRichText createDRichText()
	{
		DRichTextImpl dRichText = new DRichTextImpl();
		return dRichText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DImport createDImport()
	{
		DImportImpl dImport = new DImportImpl();
		return dImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDomain createDDomain()
	{
		DDomainImpl dDomain = new DDomainImpl();
		return dDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAggregate createDAggregate()
	{
		DAggregateImplCustom dAggregate = new DAggregateImplCustom();
		return dAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNamedPredicate createDNamedPredicate()
	{
		DNamedPredicateImpl dNamedPredicate = new DNamedPredicateImpl();
		return dNamedPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DPrimitive createDPrimitive()
	{
		DPrimitiveImpl dPrimitive = new DPrimitiveImpl();
		return dPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DEnumeration createDEnumeration()
	{
		DEnumerationImpl dEnumeration = new DEnumerationImpl();
		return dEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DLiteral createDLiteral()
	{
		DLiteralImplCustom dLiteral = new DLiteralImplCustom();
		return dLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDetailType createDDetailType()
	{
		DDetailTypeImpl dDetailType = new DDetailTypeImpl();
		return dDetailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DEntityType createDEntityType()
	{
		DEntityTypeImpl dEntityType = new DEntityTypeImpl();
		return dEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DRelationship createDRelationship()
	{
		DRelationshipImpl dRelationship = new DRelationshipImpl();
		return dRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAssociation createDAssociation()
	{
		DAssociationImplCustom dAssociation = new DAssociationImplCustom();
		return dAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMultiplicity createDMultiplicity()
	{
		DMultiplicityImpl dMultiplicity = new DMultiplicityImpl();
		return dMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAttribute createDAttribute()
	{
		DAttributeImpl dAttribute = new DAttributeImpl();
		return dAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQuery createDQuery()
	{
		DQueryImpl dQuery = new DQueryImpl();
		return dQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQueryParameter createDQueryParameter()
	{
		DQueryParameterImpl dQueryParameter = new DQueryParameterImpl();
		return dQueryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DDomainEvent createDDomainEvent()
	{
		DDomainEventImpl dDomainEvent = new DDomainEventImpl();
		return dDomainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCaseConjunction createDCaseConjunction()
	{
		DCaseConjunctionImpl dCaseConjunction = new DCaseConjunctionImpl();
		return dCaseConjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DContext createDContext()
	{
		DContextImpl dContext = new DContextImpl();
		return dContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DNotification createDNotification()
	{
		DNotificationImpl dNotification = new DNotificationImpl();
		return dNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMessage createDMessage()
	{
		DMessageImplCustom dMessage = new DMessageImplCustom();
		return dMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DHumanActorRole createDHumanActorRole()
	{
		DHumanActorRoleImpl dHumanActorRole = new DHumanActorRoleImpl();
		return dHumanActorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DService createDService()
	{
		DServiceImpl dService = new DServiceImpl();
		return dService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIdentityOrigin createDIdentityOriginFromString(EDataType eDataType, String initialValue)
	{
		DIdentityOrigin result = DIdentityOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDIdentityOriginToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAssociationKind createDAssociationKindFromString(EDataType eDataType, String initialValue)
	{
		DAssociationKind result = DAssociationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAssociationKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePackage getBasePackage()
	{
		return (BasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasePackage getPackage()
	{
		return BasePackage.eINSTANCE;
	}

} //BaseFactoryImpl
