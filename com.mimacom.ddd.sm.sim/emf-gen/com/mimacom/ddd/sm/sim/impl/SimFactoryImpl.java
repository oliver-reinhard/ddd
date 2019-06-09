/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.sm.sim.*;

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
public class SimFactoryImpl extends EFactoryImpl implements SimFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimFactory init()
	{
		try
		{
			SimFactory theSimFactory = (SimFactory)EPackage.Registry.INSTANCE.getEFactory(SimPackage.eNS_URI);
			if (theSimFactory != null)
			{
				return theSimFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimFactoryImpl()
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
			case SimPackage.SINFORMATION_MODEL: return createSInformationModel();
			case SimPackage.SNAMED_ELEMENT: return createSNamedElement();
			case SimPackage.SIMPORT: return createSImport();
			case SimPackage.SDOMAIN_PROXY: return createSDomainProxy();
			case SimPackage.SAGGREGATE: return createSAggregate();
			case SimPackage.STYPE: return createSType();
			case SimPackage.SSIMPLE_TYPE: return createSSimpleType();
			case SimPackage.SCOMPLEX_TYPE: return createSComplexType();
			case SimPackage.SCONDITION: return createSCondition();
			case SimPackage.SPRIMITIVE: return createSPrimitive();
			case SimPackage.SENUMERATION: return createSEnumeration();
			case SimPackage.SLITERAL: return createSLiteral();
			case SimPackage.SENTITY_TYPE: return createSEntityType();
			case SimPackage.SDETAIL_TYPE: return createSDetailType();
			case SimPackage.SFEATURE: return createSFeature();
			case SimPackage.SASSOCIATION: return createSAssociation();
			case SimPackage.SATTRIBUTE: return createSAttribute();
			case SimPackage.SQUERY: return createSQuery();
			case SimPackage.SQUERY_PARAMETER: return createSQueryParameter();
			case SimPackage.SEXPRESSION: return createSExpression();
			case SimPackage.SMULTIPLICITY: return createSMultiplicity();
			case SimPackage.SGRAB_RULE: return createSGrabRule();
			case SimPackage.SDITCH_RULE: return createSDitchRule();
			case SimPackage.SMORPH_RULE: return createSMorphRule();
			case SimPackage.SFUSE_RULE: return createSFuseRule();
			case SimPackage.SGRAB_AGGREGATE_RULE: return createSGrabAggregateRule();
			case SimPackage.SGRAB_DOMAIN_RULE: return createSGrabDomainRule();
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE: return createSSyntheticDeductionRule();
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
			case SimPackage.SINFORMATION_MODEL_KIND:
				return createSInformationModelKindFromString(eDataType, initialValue);
			case SimPackage.SELEMENT_NATURE:
				return createSElementNatureFromString(eDataType, initialValue);
			case SimPackage.SASSOCIATION_KIND:
				return createSAssociationKindFromString(eDataType, initialValue);
			case SimPackage.STRISTATE:
				return createSTristateFromString(eDataType, initialValue);
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
			case SimPackage.SINFORMATION_MODEL_KIND:
				return convertSInformationModelKindToString(eDataType, instanceValue);
			case SimPackage.SELEMENT_NATURE:
				return convertSElementNatureToString(eDataType, instanceValue);
			case SimPackage.SASSOCIATION_KIND:
				return convertSAssociationKindToString(eDataType, instanceValue);
			case SimPackage.STRISTATE:
				return convertSTristateToString(eDataType, instanceValue);
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
	public SInformationModel createSInformationModel()
	{
		SInformationModelImpl sInformationModel = new SInformationModelImpl();
		return sInformationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SNamedElement createSNamedElement()
	{
		SNamedElementImpl sNamedElement = new SNamedElementImpl();
		return sNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SImport createSImport()
	{
		SImportImpl sImport = new SImportImpl();
		return sImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDomainProxy createSDomainProxy()
	{
		SDomainProxyImplCustom sDomainProxy = new SDomainProxyImplCustom();
		return sDomainProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SAggregate createSAggregate()
	{
		SAggregateImplCustom sAggregate = new SAggregateImplCustom();
		return sAggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SType createSType()
	{
		STypeImpl sType = new STypeImpl();
		return sType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SSimpleType createSSimpleType()
	{
		SSimpleTypeImpl sSimpleType = new SSimpleTypeImpl();
		return sSimpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SComplexType createSComplexType()
	{
		SComplexTypeImpl sComplexType = new SComplexTypeImpl();
		return sComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SCondition createSCondition()
	{
		SConditionImpl sCondition = new SConditionImpl();
		return sCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPrimitive createSPrimitive()
	{
		SPrimitiveImplCustom sPrimitive = new SPrimitiveImplCustom();
		return sPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SEnumeration createSEnumeration()
	{
		SEnumerationImpl sEnumeration = new SEnumerationImpl();
		return sEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLiteral createSLiteral()
	{
		SLiteralImpl sLiteral = new SLiteralImpl();
		return sLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SEntityType createSEntityType()
	{
		SEntityTypeImpl sEntityType = new SEntityTypeImpl();
		return sEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDetailType createSDetailType()
	{
		SDetailTypeImpl sDetailType = new SDetailTypeImpl();
		return sDetailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SFeature createSFeature()
	{
		SFeatureImpl sFeature = new SFeatureImpl();
		return sFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SAssociation createSAssociation()
	{
		SAssociationImplCustom sAssociation = new SAssociationImplCustom();
		return sAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SAttribute createSAttribute()
	{
		SAttributeImpl sAttribute = new SAttributeImpl();
		return sAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SQuery createSQuery()
	{
		SQueryImpl sQuery = new SQueryImpl();
		return sQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SQueryParameter createSQueryParameter()
	{
		SQueryParameterImpl sQueryParameter = new SQueryParameterImpl();
		return sQueryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SExpression createSExpression()
	{
		SExpressionImpl sExpression = new SExpressionImpl();
		return sExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMultiplicity createSMultiplicity()
	{
		SMultiplicityImpl sMultiplicity = new SMultiplicityImpl();
		return sMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrabRule createSGrabRule()
	{
		SGrabRuleImpl sGrabRule = new SGrabRuleImpl();
		return sGrabRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDitchRule createSDitchRule()
	{
		SDitchRuleImpl sDitchRule = new SDitchRuleImpl();
		return sDitchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMorphRule createSMorphRule()
	{
		SMorphRuleImpl sMorphRule = new SMorphRuleImpl();
		return sMorphRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SFuseRule createSFuseRule()
	{
		SFuseRuleImpl sFuseRule = new SFuseRuleImpl();
		return sFuseRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrabAggregateRule createSGrabAggregateRule()
	{
		SGrabAggregateRuleImplCustom sGrabAggregateRule = new SGrabAggregateRuleImplCustom();
		return sGrabAggregateRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrabDomainRule createSGrabDomainRule()
	{
		SGrabDomainRuleImpl sGrabDomainRule = new SGrabDomainRuleImpl();
		return sGrabDomainRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SSyntheticDeductionRule createSSyntheticDeductionRule()
	{
		SSyntheticDeductionRuleImpl sSyntheticDeductionRule = new SSyntheticDeductionRuleImpl();
		return sSyntheticDeductionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SInformationModelKind createSInformationModelKindFromString(EDataType eDataType, String initialValue)
	{
		SInformationModelKind result = SInformationModelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSInformationModelKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SElementNature createSElementNatureFromString(EDataType eDataType, String initialValue)
	{
		SElementNature result = SElementNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSElementNatureToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAssociationKind createSAssociationKindFromString(EDataType eDataType, String initialValue)
	{
		SAssociationKind result = SAssociationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAssociationKindToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STristate createSTristateFromString(EDataType eDataType, String initialValue)
	{
		STristate result = STristate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTristateToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimPackage getSimPackage()
	{
		return (SimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimPackage getPackage()
	{
		return SimPackage.eINSTANCE;
	}

} //SimFactoryImpl
