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
			case BasePackage.DRICH_TEXT: return createDRichText();
			case BasePackage.DTEXT: return createDText();
			case BasePackage.DDOMAIN: return createDDomain();
			case BasePackage.DIMPORT: return createDImport();
			case BasePackage.DFUNCTION: return createDFunction();
			case BasePackage.DAGGREGATE: return createDAggregate();
			case BasePackage.DCONDITION: return createDCondition();
			case BasePackage.DPRIMITIVE: return createDPrimitive();
			case BasePackage.DENUMERATION: return createDEnumeration();
			case BasePackage.DLITERAL: return createDLiteral();
			case BasePackage.DDETAIL_TYPE: return createDDetailType();
			case BasePackage.DROOT_TYPE: return createDRootType();
			case BasePackage.DRELATIONSHIP: return createDRelationship();
			case BasePackage.DASSOCIATION: return createDAssociation();
			case BasePackage.DMULTIPLICITY: return createDMultiplicity();
			case BasePackage.DATTRIBUTE: return createDAttribute();
			case BasePackage.DQUERY: return createDQuery();
			case BasePackage.DQUERY_PARAMETER: return createDQueryParameter();
			case BasePackage.DDOMAIN_EVENT: return createDDomainEvent();
			case BasePackage.DCONTEXT: return createDContext();
			case BasePackage.DNOTIFICATION: return createDNotification();
			case BasePackage.DHUMAN: return createDHuman();
			case BasePackage.DSERVICE: return createDService();
			case BasePackage.DSERVICE_PARAMETER: return createDServiceParameter();
			case BasePackage.DTIME: return createDTime();
			case BasePackage.DEXISTING_APPLICATION: return createDExistingApplication();
			case BasePackage.DEXCEPTION: return createDException();
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
			case BasePackage.DASSOCIATION_KIND:
				return createDAssociationKindFromString(eDataType, initialValue);
			case BasePackage.DDIRECTION:
				return createDDirectionFromString(eDataType, initialValue);
			case BasePackage.DSERVICE_KIND:
				return createDServiceKindFromString(eDataType, initialValue);
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
			case BasePackage.DASSOCIATION_KIND:
				return convertDAssociationKindToString(eDataType, instanceValue);
			case BasePackage.DDIRECTION:
				return convertDDirectionToString(eDataType, instanceValue);
			case BasePackage.DSERVICE_KIND:
				return convertDServiceKindToString(eDataType, instanceValue);
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
	public DText createDText()
	{
		DTextImpl dText = new DTextImpl();
		return dText;
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
	public DFunction createDFunction()
	{
		DFunctionImpl dFunction = new DFunctionImpl();
		return dFunction;
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
	public DCondition createDCondition()
	{
		DConditionImpl dCondition = new DConditionImpl();
		return dCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DPrimitive createDPrimitive()
	{
		DPrimitiveImplCustom dPrimitive = new DPrimitiveImplCustom();
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
	public DRootType createDRootType()
	{
		DRootTypeImpl dRootType = new DRootTypeImpl();
		return dRootType;
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
	public DHuman createDHuman()
	{
		DHumanImpl dHuman = new DHumanImpl();
		return dHuman;
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
	@Override
	public DServiceParameter createDServiceParameter()
	{
		DServiceParameterImpl dServiceParameter = new DServiceParameterImpl();
		return dServiceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTime createDTime()
	{
		DTimeImpl dTime = new DTimeImpl();
		return dTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DExistingApplication createDExistingApplication()
	{
		DExistingApplicationImpl dExistingApplication = new DExistingApplicationImpl();
		return dExistingApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DException createDException()
	{
		DExceptionImpl dException = new DExceptionImpl();
		return dException;
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
	public DDirection createDDirectionFromString(EDataType eDataType, String initialValue)
	{
		DDirection result = DDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDDirectionToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DServiceKind createDServiceKindFromString(EDataType eDataType, String initialValue)
	{
		DServiceKind result = DServiceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDServiceKindToString(EDataType eDataType, Object instanceValue)
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
