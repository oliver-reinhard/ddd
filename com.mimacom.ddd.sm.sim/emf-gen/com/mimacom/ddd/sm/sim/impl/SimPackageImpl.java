/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.sm.sim.SAggregateDeduction;
import com.mimacom.ddd.sm.sim.SAssociationDeduction;
import com.mimacom.ddd.sm.sim.SAttributeDeduction;
import com.mimacom.ddd.sm.sim.SComplexTypeDeduction;
import com.mimacom.ddd.sm.sim.SCoreQuery;
import com.mimacom.ddd.sm.sim.SDetailTypeDeduction;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SDomainDeduction;
import com.mimacom.ddd.sm.sim.SEntityTypeDeduction;
import com.mimacom.ddd.sm.sim.SEnumerationDeduction;
import com.mimacom.ddd.sm.sim.SFeatureDeduction;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SGrabDomainRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SImplicitElementDeduction;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.SLiteralDeduction;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction;
import com.mimacom.ddd.sm.sim.SQueryDeduction;
import com.mimacom.ddd.sm.sim.SQueryParameterDeduction;
import com.mimacom.ddd.sm.sim.SRenameRule;
import com.mimacom.ddd.sm.sim.SStructureChangingRule;
import com.mimacom.ddd.sm.sim.STristate;
import com.mimacom.ddd.sm.sim.STypeDeduction;
import com.mimacom.ddd.sm.sim.SimFactory;
import com.mimacom.ddd.sm.sim.SimPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimPackageImpl extends EPackageImpl implements SimPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sInformationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sCoreQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sImplicitElementDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDomainDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAggregateDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sTypeDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sPrimitiveDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sEnumerationDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sLiteralDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sComplexTypeDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDetailTypeDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sEntityTypeDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sFeatureDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAssociationDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAttributeDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sQueryDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sQueryParameterDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sRenameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrabRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDitchRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStructureChangingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sMorphRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sFuseRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrabAggregateRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGrabDomainRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sInformationModelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sTristateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.mimacom.ddd.sm.sim.SimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimPackageImpl()
	{
		super(eNS_URI, SimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimPackage init()
	{
		if (isInited) return (SimPackage)EPackage.Registry.INSTANCE.getEPackage(SimPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SimPackageImpl theSimPackage = registeredSimPackage instanceof SimPackageImpl ? (SimPackageImpl)registeredSimPackage : new SimPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimPackage.createPackageContents();

		// Initialize created meta-data
		theSimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimPackage.eNS_URI, theSimPackage);
		return theSimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSInformationModel()
	{
		return sInformationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSInformationModel_Generate()
	{
		return (EAttribute)sInformationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSInformationModel_Kind()
	{
		return (EAttribute)sInformationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSInformationModel_Name()
	{
		return (EAttribute)sInformationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Description()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Imports()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Queries()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Types()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Aggregates()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_DomainProxies()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCoreQuery()
	{
		return sCoreQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCoreQuery_Parameters()
	{
		return (EReference)sCoreQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCoreQuery_Returns()
	{
		return (EReference)sCoreQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSImplicitElementDeduction()
	{
		return sImplicitElementDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSImplicitElementDeduction_OriginalDeductionDefinition()
	{
		return (EReference)sImplicitElementDeductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDomainDeduction()
	{
		return sDomainDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSAggregateDeduction()
	{
		return sAggregateDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSTypeDeduction()
	{
		return sTypeDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSPrimitiveDeduction()
	{
		return sPrimitiveDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSEnumerationDeduction()
	{
		return sEnumerationDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSLiteralDeduction()
	{
		return sLiteralDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSComplexTypeDeduction()
	{
		return sComplexTypeDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDetailTypeDeduction()
	{
		return sDetailTypeDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSEntityTypeDeduction()
	{
		return sEntityTypeDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSFeatureDeduction()
	{
		return sFeatureDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSAssociationDeduction()
	{
		return sAssociationDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSAssociationDeduction__GetTargetType()
	{
		return sAssociationDeductionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSAttributeDeduction()
	{
		return sAttributeDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSQueryDeduction()
	{
		return sQueryDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSQueryParameterDeduction()
	{
		return sQueryParameterDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSRenameRule()
	{
		return sRenameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSRenameRule_RenameTo()
	{
		return (EAttribute)sRenameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrabRule()
	{
		return sGrabRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDitchRule()
	{
		return sDitchRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSStructureChangingRule()
	{
		return sStructureChangingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSStructureChangingRule_Abstract()
	{
		return (EAttribute)sStructureChangingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSStructureChangingRule_RootEntity()
	{
		return (EAttribute)sStructureChangingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSStructureChangingRule_Entity()
	{
		return (EAttribute)sStructureChangingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSStructureChangingRule_ExtendFrom()
	{
		return (EReference)sStructureChangingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMorphRule()
	{
		return sMorphRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMorphRule_RetypeTo()
	{
		return (EReference)sMorphRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSMorphRule_RemultiplyTo()
	{
		return (EReference)sMorphRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSFuseRule()
	{
		return sFuseRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSFuseRule_OtherSources()
	{
		return (EReference)sFuseRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrabAggregateRule()
	{
		return sGrabAggregateRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrabAggregateRule_Aggregate()
	{
		return (EReference)sGrabAggregateRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSGrabDomainRule()
	{
		return sGrabDomainRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSGrabDomainRule_Domain()
	{
		return (EReference)sGrabDomainRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSInformationModelKind()
	{
		return sInformationModelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSTristate()
	{
		return sTristateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimFactory getSimFactory()
	{
		return (SimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sInformationModelEClass = createEClass(SINFORMATION_MODEL);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__GENERATE);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__KIND);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__NAME);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__DESCRIPTION);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__IMPORTS);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__QUERIES);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__TYPES);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__AGGREGATES);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__DOMAIN_PROXIES);

		sCoreQueryEClass = createEClass(SCORE_QUERY);
		createEReference(sCoreQueryEClass, SCORE_QUERY__PARAMETERS);
		createEReference(sCoreQueryEClass, SCORE_QUERY__RETURNS);

		sImplicitElementDeductionEClass = createEClass(SIMPLICIT_ELEMENT_DEDUCTION);
		createEReference(sImplicitElementDeductionEClass, SIMPLICIT_ELEMENT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION);

		sDomainDeductionEClass = createEClass(SDOMAIN_DEDUCTION);

		sAggregateDeductionEClass = createEClass(SAGGREGATE_DEDUCTION);

		sTypeDeductionEClass = createEClass(STYPE_DEDUCTION);

		sPrimitiveDeductionEClass = createEClass(SPRIMITIVE_DEDUCTION);

		sEnumerationDeductionEClass = createEClass(SENUMERATION_DEDUCTION);

		sLiteralDeductionEClass = createEClass(SLITERAL_DEDUCTION);

		sComplexTypeDeductionEClass = createEClass(SCOMPLEX_TYPE_DEDUCTION);

		sDetailTypeDeductionEClass = createEClass(SDETAIL_TYPE_DEDUCTION);

		sEntityTypeDeductionEClass = createEClass(SENTITY_TYPE_DEDUCTION);

		sFeatureDeductionEClass = createEClass(SFEATURE_DEDUCTION);

		sAssociationDeductionEClass = createEClass(SASSOCIATION_DEDUCTION);
		createEOperation(sAssociationDeductionEClass, SASSOCIATION_DEDUCTION___GET_TARGET_TYPE);

		sAttributeDeductionEClass = createEClass(SATTRIBUTE_DEDUCTION);

		sQueryDeductionEClass = createEClass(SQUERY_DEDUCTION);

		sQueryParameterDeductionEClass = createEClass(SQUERY_PARAMETER_DEDUCTION);

		sRenameRuleEClass = createEClass(SRENAME_RULE);
		createEAttribute(sRenameRuleEClass, SRENAME_RULE__RENAME_TO);

		sGrabRuleEClass = createEClass(SGRAB_RULE);

		sDitchRuleEClass = createEClass(SDITCH_RULE);

		sStructureChangingRuleEClass = createEClass(SSTRUCTURE_CHANGING_RULE);
		createEAttribute(sStructureChangingRuleEClass, SSTRUCTURE_CHANGING_RULE__ABSTRACT);
		createEAttribute(sStructureChangingRuleEClass, SSTRUCTURE_CHANGING_RULE__ROOT_ENTITY);
		createEAttribute(sStructureChangingRuleEClass, SSTRUCTURE_CHANGING_RULE__ENTITY);
		createEReference(sStructureChangingRuleEClass, SSTRUCTURE_CHANGING_RULE__EXTEND_FROM);

		sMorphRuleEClass = createEClass(SMORPH_RULE);
		createEReference(sMorphRuleEClass, SMORPH_RULE__RETYPE_TO);
		createEReference(sMorphRuleEClass, SMORPH_RULE__REMULTIPLY_TO);

		sFuseRuleEClass = createEClass(SFUSE_RULE);
		createEReference(sFuseRuleEClass, SFUSE_RULE__OTHER_SOURCES);

		sGrabAggregateRuleEClass = createEClass(SGRAB_AGGREGATE_RULE);
		createEReference(sGrabAggregateRuleEClass, SGRAB_AGGREGATE_RULE__AGGREGATE);

		sGrabDomainRuleEClass = createEClass(SGRAB_DOMAIN_RULE);
		createEReference(sGrabDomainRuleEClass, SGRAB_DOMAIN_RULE__DOMAIN);

		// Create enums
		sInformationModelKindEEnum = createEEnum(SINFORMATION_MODEL_KIND);
		sTristateEEnum = createEEnum(STRISTATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sInformationModelEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		sCoreQueryEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		sCoreQueryEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		sImplicitElementDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sDomainDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sAggregateDeductionEClass.getESuperTypes().add(theBasePackage.getDAggregate());
		sAggregateDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sTypeDeductionEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		sTypeDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sPrimitiveDeductionEClass.getESuperTypes().add(theBasePackage.getDPrimitive());
		sPrimitiveDeductionEClass.getESuperTypes().add(this.getSTypeDeduction());
		sEnumerationDeductionEClass.getESuperTypes().add(theBasePackage.getDEnumeration());
		sEnumerationDeductionEClass.getESuperTypes().add(this.getSTypeDeduction());
		sLiteralDeductionEClass.getESuperTypes().add(theBasePackage.getDLiteral());
		sLiteralDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sComplexTypeDeductionEClass.getESuperTypes().add(this.getSTypeDeduction());
		sDetailTypeDeductionEClass.getESuperTypes().add(theBasePackage.getDDetailType());
		sDetailTypeDeductionEClass.getESuperTypes().add(this.getSComplexTypeDeduction());
		sEntityTypeDeductionEClass.getESuperTypes().add(theBasePackage.getDEntityType());
		sEntityTypeDeductionEClass.getESuperTypes().add(this.getSComplexTypeDeduction());
		sFeatureDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sAssociationDeductionEClass.getESuperTypes().add(theBasePackage.getDAssociation());
		sAssociationDeductionEClass.getESuperTypes().add(this.getSFeatureDeduction());
		sAttributeDeductionEClass.getESuperTypes().add(theBasePackage.getDAttribute());
		sAttributeDeductionEClass.getESuperTypes().add(this.getSFeatureDeduction());
		sQueryDeductionEClass.getESuperTypes().add(theBasePackage.getDQuery());
		sQueryDeductionEClass.getESuperTypes().add(this.getSFeatureDeduction());
		sQueryParameterDeductionEClass.getESuperTypes().add(theBasePackage.getDQueryParameter());
		sQueryParameterDeductionEClass.getESuperTypes().add(theBasePackage.getIDeductionDefinition());
		sRenameRuleEClass.getESuperTypes().add(theBasePackage.getDDeductionRule());
		sGrabRuleEClass.getESuperTypes().add(this.getSRenameRule());
		sDitchRuleEClass.getESuperTypes().add(theBasePackage.getDDeductionRule());
		sStructureChangingRuleEClass.getESuperTypes().add(this.getSRenameRule());
		sMorphRuleEClass.getESuperTypes().add(this.getSStructureChangingRule());
		sFuseRuleEClass.getESuperTypes().add(this.getSStructureChangingRule());
		sGrabAggregateRuleEClass.getESuperTypes().add(theBasePackage.getDDeductionRule());
		sGrabDomainRuleEClass.getESuperTypes().add(theBasePackage.getDDeductionRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(sInformationModelEClass, SInformationModel.class, "SInformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSInformationModel_Generate(), ecorePackage.getEBoolean(), "generate", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSInformationModel_Kind(), this.getSInformationModelKind(), "kind", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSInformationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Description(), theBasePackage.getDRichText(), null, "description", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Imports(), theBasePackage.getDImport(), null, "imports", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Queries(), this.getSCoreQuery(), null, "queries", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Types(), theBasePackage.getDType(), null, "types", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Aggregates(), theBasePackage.getDAggregate(), null, "aggregates", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_DomainProxies(), this.getSDomainDeduction(), null, "domainProxies", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sCoreQueryEClass, SCoreQuery.class, "SCoreQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSCoreQuery_Parameters(), theBasePackage.getDQueryParameter(), null, "parameters", null, 0, -1, SCoreQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCoreQuery_Returns(), theBasePackage.getDExpression(), null, "returns", null, 0, 1, SCoreQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sImplicitElementDeductionEClass, SImplicitElementDeduction.class, "SImplicitElementDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSImplicitElementDeduction_OriginalDeductionDefinition(), theBasePackage.getIDeductionDefinition(), null, "originalDeductionDefinition", null, 0, 1, SImplicitElementDeduction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDomainDeductionEClass, SDomainDeduction.class, "SDomainDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sAggregateDeductionEClass, SAggregateDeduction.class, "SAggregateDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sTypeDeductionEClass, STypeDeduction.class, "STypeDeduction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sPrimitiveDeductionEClass, SPrimitiveDeduction.class, "SPrimitiveDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sEnumerationDeductionEClass, SEnumerationDeduction.class, "SEnumerationDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sLiteralDeductionEClass, SLiteralDeduction.class, "SLiteralDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sComplexTypeDeductionEClass, SComplexTypeDeduction.class, "SComplexTypeDeduction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sDetailTypeDeductionEClass, SDetailTypeDeduction.class, "SDetailTypeDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sEntityTypeDeductionEClass, SEntityTypeDeduction.class, "SEntityTypeDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sFeatureDeductionEClass, SFeatureDeduction.class, "SFeatureDeduction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sAssociationDeductionEClass, SAssociationDeduction.class, "SAssociationDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSAssociationDeduction__GetTargetType(), this.getSEntityTypeDeduction(), "getTargetType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sAttributeDeductionEClass, SAttributeDeduction.class, "SAttributeDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sQueryDeductionEClass, SQueryDeduction.class, "SQueryDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sQueryParameterDeductionEClass, SQueryParameterDeduction.class, "SQueryParameterDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sRenameRuleEClass, SRenameRule.class, "SRenameRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSRenameRule_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, SRenameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sGrabRuleEClass, SGrabRule.class, "SGrabRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sDitchRuleEClass, SDitchRule.class, "SDitchRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sStructureChangingRuleEClass, SStructureChangingRule.class, "SStructureChangingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSStructureChangingRule_Abstract(), this.getSTristate(), "abstract", null, 0, 1, SStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructureChangingRule_RootEntity(), this.getSTristate(), "rootEntity", null, 0, 1, SStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSStructureChangingRule_Entity(), this.getSTristate(), "entity", null, 0, 1, SStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSStructureChangingRule_ExtendFrom(), theBasePackage.getDType(), null, "extendFrom", null, 0, 1, SStructureChangingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sMorphRuleEClass, SMorphRule.class, "SMorphRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMorphRule_RetypeTo(), theBasePackage.getDType(), null, "retypeTo", null, 0, 1, SMorphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMorphRule_RemultiplyTo(), theBasePackage.getDMultiplicity(), null, "remultiplyTo", null, 0, 1, SMorphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sFuseRuleEClass, SFuseRule.class, "SFuseRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSFuseRule_OtherSources(), theBasePackage.getDNamedElement(), null, "otherSources", null, 0, -1, SFuseRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sGrabAggregateRuleEClass, SGrabAggregateRule.class, "SGrabAggregateRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGrabAggregateRule_Aggregate(), theBasePackage.getDAggregate(), null, "aggregate", null, 0, 1, SGrabAggregateRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sGrabDomainRuleEClass, SGrabDomainRule.class, "SGrabDomainRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGrabDomainRule_Domain(), theBasePackage.getDDomain(), null, "domain", null, 0, 1, SGrabDomainRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sInformationModelKindEEnum, SInformationModelKind.class, "SInformationModelKind");
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.BASE);
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.INTERFACE);
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.CORE);

		initEEnum(sTristateEEnum, STristate.class, "STristate");
		addEEnumLiteral(sTristateEEnum, STristate.DONT_CARE);
		addEEnumLiteral(sTristateEEnum, STristate.FALSE);
		addEEnumLiteral(sTristateEEnum, STristate.TRUE);

		// Create resource
		createResource(eNS_URI);
	}

} //SimPackageImpl
