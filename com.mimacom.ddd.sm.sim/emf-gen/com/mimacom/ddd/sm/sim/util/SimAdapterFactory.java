/**
 */
package com.mimacom.ddd.sm.sim.util;

import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DSimpleType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.dm.base.IValueType;

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
			public Adapter caseSInformationModel(SInformationModel object)
			{
				return createSInformationModelAdapter();
			}
			@Override
			public Adapter caseSImplicitElementDeduction(SImplicitElementDeduction object)
			{
				return createSImplicitElementDeductionAdapter();
			}
			@Override
			public Adapter caseSDomainDeduction(SDomainDeduction object)
			{
				return createSDomainDeductionAdapter();
			}
			@Override
			public Adapter caseSAggregateDeduction(SAggregateDeduction object)
			{
				return createSAggregateDeductionAdapter();
			}
			@Override
			public Adapter caseSTypeDeduction(STypeDeduction object)
			{
				return createSTypeDeductionAdapter();
			}
			@Override
			public Adapter caseSPrimitiveDeduction(SPrimitiveDeduction object)
			{
				return createSPrimitiveDeductionAdapter();
			}
			@Override
			public Adapter caseSEnumerationDeduction(SEnumerationDeduction object)
			{
				return createSEnumerationDeductionAdapter();
			}
			@Override
			public Adapter caseSLiteralDeduction(SLiteralDeduction object)
			{
				return createSLiteralDeductionAdapter();
			}
			@Override
			public Adapter caseSComplexTypeDeduction(SComplexTypeDeduction object)
			{
				return createSComplexTypeDeductionAdapter();
			}
			@Override
			public Adapter caseSDetailTypeDeduction(SDetailTypeDeduction object)
			{
				return createSDetailTypeDeductionAdapter();
			}
			@Override
			public Adapter caseSEntityTypeDeduction(SEntityTypeDeduction object)
			{
				return createSEntityTypeDeductionAdapter();
			}
			@Override
			public Adapter caseSFeatureDeduction(SFeatureDeduction object)
			{
				return createSFeatureDeductionAdapter();
			}
			@Override
			public Adapter caseSAssociationDeduction(SAssociationDeduction object)
			{
				return createSAssociationDeductionAdapter();
			}
			@Override
			public Adapter caseSAttributeDeduction(SAttributeDeduction object)
			{
				return createSAttributeDeductionAdapter();
			}
			@Override
			public Adapter caseSQueryDeduction(SQueryDeduction object)
			{
				return createSQueryDeductionAdapter();
			}
			@Override
			public Adapter caseSQueryParameterDeduction(SQueryParameterDeduction object)
			{
				return createSQueryParameterDeductionAdapter();
			}
			@Override
			public Adapter caseSRenameRule(SRenameRule object)
			{
				return createSRenameRuleAdapter();
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
			public Adapter caseSGrabModelRule(SGrabModelRule object)
			{
				return createSGrabModelRuleAdapter();
			}
			@Override
			public Adapter caseDNamedElement(DNamedElement object)
			{
				return createDNamedElementAdapter();
			}
			@Override
			public Adapter caseDModel(DModel object)
			{
				return createDModelAdapter();
			}
			@Override
			public Adapter caseIDiagramRoot(IDiagramRoot object)
			{
				return createIDiagramRootAdapter();
			}
			@Override
			public Adapter caseIAggregateContainer(IAggregateContainer object)
			{
				return createIAggregateContainerAdapter();
			}
			@Override
			public Adapter caseITypeContainer(ITypeContainer object)
			{
				return createITypeContainerAdapter();
			}
			@Override
			public Adapter caseIStaticReferenceTarget(IStaticReferenceTarget object)
			{
				return createIStaticReferenceTargetAdapter();
			}
			@Override
			public Adapter caseIDeductionDefinition(IDeductionDefinition object)
			{
				return createIDeductionDefinitionAdapter();
			}
			@Override
			public Adapter caseIFeatureContainer(IFeatureContainer object)
			{
				return createIFeatureContainerAdapter();
			}
			@Override
			public Adapter caseINavigableMemberContainer(INavigableMemberContainer object)
			{
				return createINavigableMemberContainerAdapter();
			}
			@Override
			public Adapter caseIDeducibleElement(IDeducibleElement object)
			{
				return createIDeducibleElementAdapter();
			}
			@Override
			public Adapter caseDAggregate(DAggregate object)
			{
				return createDAggregateAdapter();
			}
			@Override
			public Adapter caseDType(DType object)
			{
				return createDTypeAdapter();
			}
			@Override
			public Adapter caseIValueType(IValueType object)
			{
				return createIValueTypeAdapter();
			}
			@Override
			public Adapter caseDSimpleType(DSimpleType object)
			{
				return createDSimpleTypeAdapter();
			}
			@Override
			public Adapter caseDPrimitive(DPrimitive object)
			{
				return createDPrimitiveAdapter();
			}
			@Override
			public Adapter caseDEnumeration(DEnumeration object)
			{
				return createDEnumerationAdapter();
			}
			@Override
			public Adapter caseDNavigableMember(DNavigableMember object)
			{
				return createDNavigableMemberAdapter();
			}
			@Override
			public Adapter caseDLiteral(DLiteral object)
			{
				return createDLiteralAdapter();
			}
			@Override
			public Adapter caseDComplexType(DComplexType object)
			{
				return createDComplexTypeAdapter();
			}
			@Override
			public Adapter caseDDetailType(DDetailType object)
			{
				return createDDetailTypeAdapter();
			}
			@Override
			public Adapter caseIIdentityType(IIdentityType object)
			{
				return createIIdentityTypeAdapter();
			}
			@Override
			public Adapter caseDEntityType(DEntityType object)
			{
				return createDEntityTypeAdapter();
			}
			@Override
			public Adapter caseDFeature(DFeature object)
			{
				return createDFeatureAdapter();
			}
			@Override
			public Adapter caseDAssociation(DAssociation object)
			{
				return createDAssociationAdapter();
			}
			@Override
			public Adapter caseDAttribute(DAttribute object)
			{
				return createDAttributeAdapter();
			}
			@Override
			public Adapter caseDQuery(DQuery object)
			{
				return createDQueryAdapter();
			}
			@Override
			public Adapter caseDQueryParameter(DQueryParameter object)
			{
				return createDQueryParameterAdapter();
			}
			@Override
			public Adapter caseDDeductionRule(DDeductionRule object)
			{
				return createDDeductionRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SImplicitElementDeduction <em>SImplicit Element Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SImplicitElementDeduction
	 * @generated
	 */
	public Adapter createSImplicitElementDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDomainDeduction <em>SDomain Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDomainDeduction
	 * @generated
	 */
	public Adapter createSDomainDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SAggregateDeduction <em>SAggregate Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SAggregateDeduction
	 * @generated
	 */
	public Adapter createSAggregateDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.STypeDeduction <em>SType Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.STypeDeduction
	 * @generated
	 */
	public Adapter createSTypeDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SPrimitiveDeduction <em>SPrimitive Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SPrimitiveDeduction
	 * @generated
	 */
	public Adapter createSPrimitiveDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SEnumerationDeduction <em>SEnumeration Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SEnumerationDeduction
	 * @generated
	 */
	public Adapter createSEnumerationDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SLiteralDeduction <em>SLiteral Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SLiteralDeduction
	 * @generated
	 */
	public Adapter createSLiteralDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SComplexTypeDeduction <em>SComplex Type Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SComplexTypeDeduction
	 * @generated
	 */
	public Adapter createSComplexTypeDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SDetailTypeDeduction <em>SDetail Type Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SDetailTypeDeduction
	 * @generated
	 */
	public Adapter createSDetailTypeDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SEntityTypeDeduction <em>SEntity Type Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SEntityTypeDeduction
	 * @generated
	 */
	public Adapter createSEntityTypeDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SFeatureDeduction <em>SFeature Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SFeatureDeduction
	 * @generated
	 */
	public Adapter createSFeatureDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SAssociationDeduction <em>SAssociation Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SAssociationDeduction
	 * @generated
	 */
	public Adapter createSAssociationDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SAttributeDeduction <em>SAttribute Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SAttributeDeduction
	 * @generated
	 */
	public Adapter createSAttributeDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SQueryDeduction <em>SQuery Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SQueryDeduction
	 * @generated
	 */
	public Adapter createSQueryDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SQueryParameterDeduction <em>SQuery Parameter Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SQueryParameterDeduction
	 * @generated
	 */
	public Adapter createSQueryParameterDeductionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SRenameRule <em>SRename Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SRenameRule
	 * @generated
	 */
	public Adapter createSRenameRuleAdapter()
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.sm.sim.SGrabModelRule <em>SGrab Model Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.sm.sim.SGrabModelRule
	 * @generated
	 */
	public Adapter createSGrabModelRuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DNamedElement <em>DNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DNamedElement
	 * @generated
	 */
	public Adapter createDNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DModel
	 * @generated
	 */
	public Adapter createDModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IDiagramRoot <em>IDiagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IDiagramRoot
	 * @generated
	 */
	public Adapter createIDiagramRootAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IAggregateContainer <em>IAggregate Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IAggregateContainer
	 * @generated
	 */
	public Adapter createIAggregateContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.ITypeContainer <em>IType Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.ITypeContainer
	 * @generated
	 */
	public Adapter createITypeContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IStaticReferenceTarget
	 * @generated
	 */
	public Adapter createIStaticReferenceTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IDeductionDefinition <em>IDeduction Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IDeductionDefinition
	 * @generated
	 */
	public Adapter createIDeductionDefinitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IFeatureContainer <em>IFeature Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IFeatureContainer
	 * @generated
	 */
	public Adapter createIFeatureContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.INavigableMemberContainer <em>INavigable Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.INavigableMemberContainer
	 * @generated
	 */
	public Adapter createINavigableMemberContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IDeducibleElement <em>IDeducible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IDeducibleElement
	 * @generated
	 */
	public Adapter createIDeducibleElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DAggregate <em>DAggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DAggregate
	 * @generated
	 */
	public Adapter createDAggregateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DType <em>DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DType
	 * @generated
	 */
	public Adapter createDTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IValueType <em>IValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IValueType
	 * @generated
	 */
	public Adapter createIValueTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DSimpleType <em>DSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DSimpleType
	 * @generated
	 */
	public Adapter createDSimpleTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DPrimitive <em>DPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DPrimitive
	 * @generated
	 */
	public Adapter createDPrimitiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DEnumeration <em>DEnumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DEnumeration
	 * @generated
	 */
	public Adapter createDEnumerationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DNavigableMember <em>DNavigable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DNavigableMember
	 * @generated
	 */
	public Adapter createDNavigableMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DLiteral <em>DLiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DLiteral
	 * @generated
	 */
	public Adapter createDLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DComplexType <em>DComplex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DComplexType
	 * @generated
	 */
	public Adapter createDComplexTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DDetailType <em>DDetail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DDetailType
	 * @generated
	 */
	public Adapter createDDetailTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IIdentityType <em>IIdentity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IIdentityType
	 * @generated
	 */
	public Adapter createIIdentityTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DEntityType <em>DEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DEntityType
	 * @generated
	 */
	public Adapter createDEntityTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DFeature <em>DFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DFeature
	 * @generated
	 */
	public Adapter createDFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DAssociation <em>DAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DAssociation
	 * @generated
	 */
	public Adapter createDAssociationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DAttribute <em>DAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DAttribute
	 * @generated
	 */
	public Adapter createDAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DQuery <em>DQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DQuery
	 * @generated
	 */
	public Adapter createDQueryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DQueryParameter <em>DQuery Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DQueryParameter
	 * @generated
	 */
	public Adapter createDQueryParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DDeductionRule <em>DDeduction Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DDeductionRule
	 * @generated
	 */
	public Adapter createDDeductionRuleAdapter()
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
