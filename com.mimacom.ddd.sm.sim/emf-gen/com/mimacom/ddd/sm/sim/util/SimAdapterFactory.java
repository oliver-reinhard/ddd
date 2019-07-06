/**
 */
package com.mimacom.ddd.sm.sim.util;

import com.mimacom.ddd.sm.sim.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.sm.sim.SimPackage
 * @generated
 */
public class SimAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimSwitch<Adapter> modelSwitch =
		new SimSwitch<Adapter>()
		{
			@Override
			public Adapter caseSIdentityType(SIdentityType object)
			{
				return createSIdentityTypeAdapter();
			}
			@Override
			public Adapter caseSValueType(SValueType object)
			{
				return createSValueTypeAdapter();
			}
			@Override
			public Adapter caseSInformationModel(SInformationModel object)
			{
				return createSInformationModelAdapter();
			}
			@Override
			public Adapter caseSNamedElement(SNamedElement object)
			{
				return createSNamedElementAdapter();
			}
			@Override
			public Adapter caseSDeducibleElement(SDeducibleElement object)
			{
				return createSDeducibleElementAdapter();
			}
			@Override
			public Adapter caseSNamedDeducibleElement(SNamedDeducibleElement object)
			{
				return createSNamedDeducibleElementAdapter();
			}
			@Override
			public Adapter caseSExpression(SExpression object)
			{
				return createSExpressionAdapter();
			}
			@Override
			public Adapter caseSImport(SImport object)
			{
				return createSImportAdapter();
			}
			@Override
			public Adapter caseSDomainProxy(SDomainProxy object)
			{
				return createSDomainProxyAdapter();
			}
			@Override
			public Adapter caseSAggregate(SAggregate object)
			{
				return createSAggregateAdapter();
			}
			@Override
			public Adapter caseSType(SType object)
			{
				return createSTypeAdapter();
			}
			@Override
			public Adapter caseSCondition(SCondition object)
			{
				return createSConditionAdapter();
			}
			@Override
			public Adapter caseSSimpleType(SSimpleType object)
			{
				return createSSimpleTypeAdapter();
			}
			@Override
			public Adapter caseSPrimitive(SPrimitive object)
			{
				return createSPrimitiveAdapter();
			}
			@Override
			public Adapter caseSEnumeration(SEnumeration object)
			{
				return createSEnumerationAdapter();
			}
			@Override
			public Adapter caseSLiteral(SLiteral object)
			{
				return createSLiteralAdapter();
			}
			@Override
			public Adapter caseSComplexType(SComplexType object)
			{
				return createSComplexTypeAdapter();
			}
			@Override
			public Adapter caseSDetailType(SDetailType object)
			{
				return createSDetailTypeAdapter();
			}
			@Override
			public Adapter caseSEntityType(SEntityType object)
			{
				return createSEntityTypeAdapter();
			}
			@Override
			public Adapter caseSFeature(SFeature object)
			{
				return createSFeatureAdapter();
			}
			@Override
			public Adapter caseSAssociation(SAssociation object)
			{
				return createSAssociationAdapter();
			}
			@Override
			public Adapter caseSMultiplicity(SMultiplicity object)
			{
				return createSMultiplicityAdapter();
			}
			@Override
			public Adapter caseSAttribute(SAttribute object)
			{
				return createSAttributeAdapter();
			}
			@Override
			public Adapter caseSQuery(SQuery object)
			{
				return createSQueryAdapter();
			}
			@Override
			public Adapter caseSQueryParameter(SQueryParameter object)
			{
				return createSQueryParameterAdapter();
			}
			@Override
			public Adapter caseSDeductionRule(SDeductionRule object)
			{
				return createSDeductionRuleAdapter();
			}
			@Override
			public Adapter caseSGrabRule(SGrabRule object)
			{
				return createSGrabRuleAdapter();
			}
			@Override
			public Adapter caseSDitchRule(SDitchRule object)
			{
				return createSDitchRuleAdapter();
			}
			@Override
			public Adapter caseSStructureChangingRule(SStructureChangingRule object)
			{
				return createSStructureChangingRuleAdapter();
			}
			@Override
			public Adapter caseSMorphRule(SMorphRule object)
			{
				return createSMorphRuleAdapter();
			}
			@Override
			public Adapter caseSFuseRule(SFuseRule object)
			{
				return createSFuseRuleAdapter();
			}
			@Override
			public Adapter caseSGrabAggregateRule(SGrabAggregateRule object)
			{
				return createSGrabAggregateRuleAdapter();
			}
			@Override
			public Adapter caseSGrabDomainRule(SGrabDomainRule object)
			{
				return createSGrabDomainRuleAdapter();
			}
			@Override
			public Adapter caseSSyntheticDeductionRule(SSyntheticDeductionRule object)
			{
				return createSSyntheticDeductionRuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SIdentityType <em>SIdentity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SIdentityType
	 * @generated
	 */
	public Adapter createSIdentityTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SValueType <em>SValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SValueType
	 * @generated
	 */
	public Adapter createSValueTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SInformationModel <em>SInformation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SInformationModel
	 * @generated
	 */
	public Adapter createSInformationModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SNamedElement <em>SNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SNamedElement
	 * @generated
	 */
	public Adapter createSNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDeducibleElement <em>SDeducible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDeducibleElement
	 * @generated
	 */
	public Adapter createSDeducibleElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SNamedDeducibleElement <em>SNamed Deducible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SNamedDeducibleElement
	 * @generated
	 */
	public Adapter createSNamedDeducibleElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SExpression <em>SExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SExpression
	 * @generated
	 */
	public Adapter createSExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SImport <em>SImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SImport
	 * @generated
	 */
	public Adapter createSImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDomainProxy <em>SDomain Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDomainProxy
	 * @generated
	 */
	public Adapter createSDomainProxyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SAggregate <em>SAggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SAggregate
	 * @generated
	 */
	public Adapter createSAggregateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SType <em>SType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SType
	 * @generated
	 */
	public Adapter createSTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SCondition <em>SCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SCondition
	 * @generated
	 */
	public Adapter createSConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SSimpleType <em>SSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SSimpleType
	 * @generated
	 */
	public Adapter createSSimpleTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SPrimitive <em>SPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SPrimitive
	 * @generated
	 */
	public Adapter createSPrimitiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SEnumeration <em>SEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SEnumeration
	 * @generated
	 */
	public Adapter createSEnumerationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SLiteral <em>SLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SLiteral
	 * @generated
	 */
	public Adapter createSLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SComplexType <em>SComplex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SComplexType
	 * @generated
	 */
	public Adapter createSComplexTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDetailType <em>SDetail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDetailType
	 * @generated
	 */
	public Adapter createSDetailTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SEntityType <em>SEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SEntityType
	 * @generated
	 */
	public Adapter createSEntityTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SFeature <em>SFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SFeature
	 * @generated
	 */
	public Adapter createSFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SAssociation <em>SAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SAssociation
	 * @generated
	 */
	public Adapter createSAssociationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SMultiplicity <em>SMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SMultiplicity
	 * @generated
	 */
	public Adapter createSMultiplicityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SAttribute <em>SAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SAttribute
	 * @generated
	 */
	public Adapter createSAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SQuery <em>SQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SQuery
	 * @generated
	 */
	public Adapter createSQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SQueryParameter <em>SQuery Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SQueryParameter
	 * @generated
	 */
	public Adapter createSQueryParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDeductionRule <em>SDeduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDeductionRule
	 * @generated
	 */
	public Adapter createSDeductionRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SGrabRule <em>SGrab Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SGrabRule
	 * @generated
	 */
	public Adapter createSGrabRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDitchRule <em>SDitch Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDitchRule
	 * @generated
	 */
	public Adapter createSDitchRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SStructureChangingRule <em>SStructure Changing Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SStructureChangingRule
	 * @generated
	 */
	public Adapter createSStructureChangingRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SMorphRule <em>SMorph Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SMorphRule
	 * @generated
	 */
	public Adapter createSMorphRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SFuseRule <em>SFuse Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SFuseRule
	 * @generated
	 */
	public Adapter createSFuseRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SGrabAggregateRule <em>SGrab Aggregate Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SGrabAggregateRule
	 * @generated
	 */
	public Adapter createSGrabAggregateRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SGrabDomainRule <em>SGrab Domain Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SGrabDomainRule
	 * @generated
	 */
	public Adapter createSGrabDomainRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SSyntheticDeductionRule <em>SSynthetic Deduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SSyntheticDeductionRule
	 * @generated
	 */
	public Adapter createSSyntheticDeductionRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //SimAdapterFactory
