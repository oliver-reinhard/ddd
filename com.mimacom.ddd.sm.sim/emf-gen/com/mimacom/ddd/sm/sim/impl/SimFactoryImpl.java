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
			case SimPackage.STYPE_MAPPING: return createSTypeMapping();
			case SimPackage.SAGGREGATE_DEDUCTION: return createSAggregateDeduction();
			case SimPackage.SPRIMITIVE_DEDUCTION: return createSPrimitiveDeduction();
			case SimPackage.SENUMERATION_DEDUCTION: return createSEnumerationDeduction();
			case SimPackage.SLITERAL_DEDUCTION: return createSLiteralDeduction();
			case SimPackage.SDETAIL_TYPE_DEDUCTION: return createSDetailTypeDeduction();
			case SimPackage.SENTITY_TYPE_DEDUCTION: return createSEntityTypeDeduction();
			case SimPackage.SASSOCIATION_DEDUCTION: return createSAssociationDeduction();
			case SimPackage.SATTRIBUTE_DEDUCTION: return createSAttributeDeduction();
			case SimPackage.SQUERY_DEDUCTION: return createSQueryDeduction();
			case SimPackage.SQUERY_PARAMETER_DEDUCTION: return createSQueryParameterDeduction();
			case SimPackage.SGRAB_RULE: return createSGrabRule();
			case SimPackage.SDITCH_RULE: return createSDitchRule();
			case SimPackage.SMORPH_RULE: return createSMorphRule();
			case SimPackage.SFUSE_RULE: return createSFuseRule();
			case SimPackage.SGRAB_AGGREGATE_RULE: return createSGrabAggregateRule();
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
	public STypeMapping createSTypeMapping()
	{
		STypeMappingImpl sTypeMapping = new STypeMappingImpl();
		return sTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SAggregateDeduction createSAggregateDeduction()
	{
		SAggregateDeductionImpl sAggregateDeduction = new SAggregateDeductionImpl();
		return sAggregateDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPrimitiveDeduction createSPrimitiveDeduction()
	{
		SPrimitiveDeductionImpl sPrimitiveDeduction = new SPrimitiveDeductionImpl();
		return sPrimitiveDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SEnumerationDeduction createSEnumerationDeduction()
	{
		SEnumerationDeductionImpl sEnumerationDeduction = new SEnumerationDeductionImpl();
		return sEnumerationDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SLiteralDeduction createSLiteralDeduction()
	{
		SLiteralDeductionImpl sLiteralDeduction = new SLiteralDeductionImpl();
		return sLiteralDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SDetailTypeDeduction createSDetailTypeDeduction()
	{
		SDetailTypeDeductionImpl sDetailTypeDeduction = new SDetailTypeDeductionImpl();
		return sDetailTypeDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SEntityTypeDeduction createSEntityTypeDeduction()
	{
		SEntityTypeDeductionImpl sEntityTypeDeduction = new SEntityTypeDeductionImpl();
		return sEntityTypeDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SAssociationDeduction createSAssociationDeduction()
	{
		SAssociationDeductionImplCustom sAssociationDeduction = new SAssociationDeductionImplCustom();
		return sAssociationDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SAttributeDeduction createSAttributeDeduction()
	{
		SAttributeDeductionImpl sAttributeDeduction = new SAttributeDeductionImpl();
		return sAttributeDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SQueryDeduction createSQueryDeduction()
	{
		SQueryDeductionImpl sQueryDeduction = new SQueryDeductionImpl();
		return sQueryDeduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SQueryParameterDeduction createSQueryParameterDeduction()
	{
		SQueryParameterDeductionImpl sQueryParameterDeduction = new SQueryParameterDeductionImpl();
		return sQueryParameterDeduction;
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
