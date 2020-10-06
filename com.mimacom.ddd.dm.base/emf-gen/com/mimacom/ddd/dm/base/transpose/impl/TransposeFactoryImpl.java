/**
 */
package com.mimacom.ddd.dm.base.transpose.impl;

import com.mimacom.ddd.dm.base.transpose.*;

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
public class TransposeFactoryImpl extends EFactoryImpl implements TransposeFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransposeFactory init()
	{
		try
		{
			TransposeFactory theTransposeFactory = (TransposeFactory)EPackage.Registry.INSTANCE.getEFactory(TransposePackage.eNS_URI);
			if (theTransposeFactory != null)
			{
				return theTransposeFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TransposeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransposeFactoryImpl()
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
			case TransposePackage.TTYPE_MAPPING: return createTTypeMapping();
			case TransposePackage.TAGGREGATE_TRANSPOSITION: return createTAggregateTransposition();
			case TransposePackage.TPRIMITIVE_TRANSPOSITION: return createTPrimitiveTransposition();
			case TransposePackage.TENUMERATION_TRANSPOSITION: return createTEnumerationTransposition();
			case TransposePackage.TLITERAL_TRANSPOSITION: return createTLiteralTransposition();
			case TransposePackage.TDETAIL_TYPE_TRANSPOSITION: return createTDetailTypeTransposition();
			case TransposePackage.TENTITY_TYPE_TRANSPOSITION: return createTEntityTypeTransposition();
			case TransposePackage.TASSOCIATION_TRANSPOSITION: return createTAssociationTransposition();
			case TransposePackage.TATTRIBUTE_TRANSPOSITION: return createTAttributeTransposition();
			case TransposePackage.TQUERY_TRANSPOSITION: return createTQueryTransposition();
			case TransposePackage.TQUERY_PARAMETER_TRANSPOSITION: return createTQueryParameterTransposition();
			case TransposePackage.TGRAB_RULE: return createTGrabRule();
			case TransposePackage.TDITCH_RULE: return createTDitchRule();
			case TransposePackage.TMORPH_RULE: return createTMorphRule();
			case TransposePackage.TFUSE_RULE: return createTFuseRule();
			case TransposePackage.TGRAB_AGGREGATE_RULE: return createTGrabAggregateRule();
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
			case TransposePackage.TTRISTATE:
				return createTTristateFromString(eDataType, initialValue);
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
			case TransposePackage.TTRISTATE:
				return convertTTristateToString(eDataType, instanceValue);
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
	public TTypeMapping createTTypeMapping()
	{
		TTypeMappingImpl tTypeMapping = new TTypeMappingImpl();
		return tTypeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAggregateTransposition createTAggregateTransposition()
	{
		TAggregateTranspositionImpl tAggregateTransposition = new TAggregateTranspositionImpl();
		return tAggregateTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPrimitiveTransposition createTPrimitiveTransposition()
	{
		TPrimitiveTranspositionImpl tPrimitiveTransposition = new TPrimitiveTranspositionImpl();
		return tPrimitiveTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEnumerationTransposition createTEnumerationTransposition()
	{
		TEnumerationTranspositionImpl tEnumerationTransposition = new TEnumerationTranspositionImpl();
		return tEnumerationTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLiteralTransposition createTLiteralTransposition()
	{
		TLiteralTranspositionImpl tLiteralTransposition = new TLiteralTranspositionImpl();
		return tLiteralTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDetailTypeTransposition createTDetailTypeTransposition()
	{
		TDetailTypeTranspositionImpl tDetailTypeTransposition = new TDetailTypeTranspositionImpl();
		return tDetailTypeTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntityTypeTransposition createTEntityTypeTransposition()
	{
		TEntityTypeTranspositionImpl tEntityTypeTransposition = new TEntityTypeTranspositionImpl();
		return tEntityTypeTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociationTransposition createTAssociationTransposition()
	{
		TAssociationTranspositionImplCustom tAssociationTransposition = new TAssociationTranspositionImplCustom();
		return tAssociationTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAttributeTransposition createTAttributeTransposition()
	{
		TAttributeTranspositionImpl tAttributeTransposition = new TAttributeTranspositionImpl();
		return tAttributeTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TQueryTransposition createTQueryTransposition()
	{
		TQueryTranspositionImpl tQueryTransposition = new TQueryTranspositionImpl();
		return tQueryTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TQueryParameterTransposition createTQueryParameterTransposition()
	{
		TQueryParameterTranspositionImpl tQueryParameterTransposition = new TQueryParameterTranspositionImpl();
		return tQueryParameterTransposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGrabRule createTGrabRule()
	{
		TGrabRuleImpl tGrabRule = new TGrabRuleImpl();
		return tGrabRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDitchRule createTDitchRule()
	{
		TDitchRuleImpl tDitchRule = new TDitchRuleImpl();
		return tDitchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMorphRule createTMorphRule()
	{
		TMorphRuleImpl tMorphRule = new TMorphRuleImpl();
		return tMorphRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFuseRule createTFuseRule()
	{
		TFuseRuleImpl tFuseRule = new TFuseRuleImpl();
		return tFuseRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGrabAggregateRule createTGrabAggregateRule()
	{
		TGrabAggregateRuleImplCustom tGrabAggregateRule = new TGrabAggregateRuleImplCustom();
		return tGrabAggregateRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTristate createTTristateFromString(EDataType eDataType, String initialValue)
	{
		TTristate result = TTristate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTristateToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransposePackage getTransposePackage()
	{
		return (TransposePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TransposePackage getPackage()
	{
		return TransposePackage.eINSTANCE;
	}

} //TransposeFactoryImpl
