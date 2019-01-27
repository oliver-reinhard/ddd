/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sms.impl;

import com.mimacom.ddd.sm.sms.*;

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
public class SmsFactoryImpl extends EFactoryImpl implements SmsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmsFactory init()
	{
		try
		{
			SmsFactory theSmsFactory = (SmsFactory)EPackage.Registry.INSTANCE.getEFactory(SmsPackage.eNS_URI);
			if (theSmsFactory != null)
			{
				return theSmsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmsFactoryImpl()
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
			case SmsPackage.SDOMAIN: return createSDomain();
			case SmsPackage.SNAMED_ELEMENT: return createSNamedElement();
			case SmsPackage.SDEDUCIBLE_ELEMENT: return createSDeducibleElement();
			case SmsPackage.SDEDUCIBLE_MEMBER_ELEMENT: return createSDeducibleMemberElement();
			case SmsPackage.SIMPORT: return createSImport();
			case SmsPackage.SAGGREGATE: return createSAggregate();
			case SmsPackage.STYPE: return createSType();
			case SmsPackage.SSIMPLE_TYPE: return createSSimpleType();
			case SmsPackage.SCOMPLEX_TYPE: return createSComplexType();
			case SmsPackage.SCONDITION: return createSCondition();
			case SmsPackage.SPRIMITIVE: return createSPrimitive();
			case SmsPackage.SENUMERATION: return createSEnumeration();
			case SmsPackage.SLITERAL: return createSLiteral();
			case SmsPackage.SROOT_TYPE: return createSRootType();
			case SmsPackage.SDETAIL_TYPE: return createSDetailType();
			case SmsPackage.SFEATURE: return createSFeature();
			case SmsPackage.SASSOCIATION: return createSAssociation();
			case SmsPackage.SATTRIBUTE: return createSAttribute();
			case SmsPackage.SQUERY: return createSQuery();
			case SmsPackage.SQUERY_PARAMETER: return createSQueryParameter();
			case SmsPackage.SEXPRESSION: return createSExpression();
			case SmsPackage.SMULTIPLICITY: return createSMultiplicity();
			case SmsPackage.SDEDUCTION_RULE: return createSDeductionRule();
			case SmsPackage.SMEMBER_DEDUCTION_RULE: return createSMemberDeductionRule();
			case SmsPackage.SSPOOF_TRANSFORM: return createSSpoofTransform();
			case SmsPackage.SMORPH_TRANSFORM: return createSMorphTransform();
			case SmsPackage.SDITCH_TRANSFORM: return createSDitchTransform();
			case SmsPackage.SFUSE_TRANSFORM: return createSFuseTransform();
			case SmsPackage.SCHOP_TRANSFORM: return createSChopTransform();
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
			case SmsPackage.SELEMENT_NATURE:
				return createSElementNatureFromString(eDataType, initialValue);
			case SmsPackage.SASSOCIATION_KIND:
				return createSAssociationKindFromString(eDataType, initialValue);
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
			case SmsPackage.SELEMENT_NATURE:
				return convertSElementNatureToString(eDataType, instanceValue);
			case SmsPackage.SASSOCIATION_KIND:
				return convertSAssociationKindToString(eDataType, instanceValue);
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
	public SDomain createSDomain()
	{
		SDomainImpl sDomain = new SDomainImpl();
		return sDomain;
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
	public SDeducibleElement createSDeducibleElement()
	{
		SDeducibleElementImplCustom sDeducibleElement = new SDeducibleElementImplCustom();
		return sDeducibleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDeducibleMemberElement createSDeducibleMemberElement()
	{
		SDeducibleMemberElementImplCustom sDeducibleMemberElement = new SDeducibleMemberElementImplCustom();
		return sDeducibleMemberElement;
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
	public SAggregate createSAggregate()
	{
		SAggregateImpl sAggregate = new SAggregateImpl();
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
		SPrimitiveImpl sPrimitive = new SPrimitiveImpl();
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
	public SRootType createSRootType()
	{
		SRootTypeImpl sRootType = new SRootTypeImpl();
		return sRootType;
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
		SAssociationImpl sAssociation = new SAssociationImpl();
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
	public SDeductionRule createSDeductionRule()
	{
		SDeductionRuleImpl sDeductionRule = new SDeductionRuleImpl();
		return sDeductionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMemberDeductionRule createSMemberDeductionRule()
	{
		SMemberDeductionRuleImpl sMemberDeductionRule = new SMemberDeductionRuleImpl();
		return sMemberDeductionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SSpoofTransform createSSpoofTransform()
	{
		SSpoofTransformImpl sSpoofTransform = new SSpoofTransformImpl();
		return sSpoofTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SMorphTransform createSMorphTransform()
	{
		SMorphTransformImpl sMorphTransform = new SMorphTransformImpl();
		return sMorphTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDitchTransform createSDitchTransform()
	{
		SDitchTransformImpl sDitchTransform = new SDitchTransformImpl();
		return sDitchTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SFuseTransform createSFuseTransform()
	{
		SFuseTransformImpl sFuseTransform = new SFuseTransformImpl();
		return sFuseTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SChopTransform createSChopTransform()
	{
		SChopTransformImpl sChopTransform = new SChopTransformImpl();
		return sChopTransform;
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
	@Override
	public SmsPackage getSmsPackage()
	{
		return (SmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmsPackage getPackage()
	{
		return SmsPackage.eINSTANCE;
	}

} //SmsFactoryImpl
