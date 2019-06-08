/**
 */
package com.mimacom.ddd.sm.sim.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SAssociation;
import com.mimacom.ddd.sm.sim.SAssociationKind;
import com.mimacom.ddd.sm.sim.SAttribute;
import com.mimacom.ddd.sm.sim.SComplexType;
import com.mimacom.ddd.sm.sim.SCondition;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SDeductionRule;
import com.mimacom.ddd.sm.sim.SDetailType;
import com.mimacom.ddd.sm.sim.SDitchRule;
import com.mimacom.ddd.sm.sim.SDomainProxy;
import com.mimacom.ddd.sm.sim.SElementNature;
import com.mimacom.ddd.sm.sim.SEntityType;
import com.mimacom.ddd.sm.sim.SEnumeration;
import com.mimacom.ddd.sm.sim.SExpression;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SFuseRule;
import com.mimacom.ddd.sm.sim.SGrabAggregateRule;
import com.mimacom.ddd.sm.sim.SGrabDomainRule;
import com.mimacom.ddd.sm.sim.SGrabRule;
import com.mimacom.ddd.sm.sim.SIdentityType;
import com.mimacom.ddd.sm.sim.SImport;
import com.mimacom.ddd.sm.sim.SInformationModel;
import com.mimacom.ddd.sm.sim.SInformationModelKind;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SMorphRule;
import com.mimacom.ddd.sm.sim.SMultiplicity;
import com.mimacom.ddd.sm.sim.SNamedDeducibleElement;
import com.mimacom.ddd.sm.sim.SNamedElement;
import com.mimacom.ddd.sm.sim.SPrimitive;
import com.mimacom.ddd.sm.sim.SQuery;
import com.mimacom.ddd.sm.sim.SQueryParameter;
import com.mimacom.ddd.sm.sim.SSimpleType;
import com.mimacom.ddd.sm.sim.SSyntheticDeductionRule;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SValueType;
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
	private EClass sIdentityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sValueTypeEClass = null;

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
	private EClass sNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDeducibleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sNamedDeducibleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDomainProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDetailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sQueryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sDeductionRuleEClass = null;

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
	private EClass sMorphRuleEClass = null;

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
	private EClass sSyntheticDeductionRuleEClass = null;

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
	private EEnum sElementNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sAssociationKindEEnum = null;

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
	public EClass getSIdentityType()
	{
		return sIdentityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSValueType()
	{
		return sValueTypeEClass;
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
	public EReference getSInformationModel_Imports()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Types()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_Aggregates()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSInformationModel_DomainProxies()
	{
		return (EReference)sInformationModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSNamedElement()
	{
		return sNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSNamedElement_Name()
	{
		return (EAttribute)sNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDeducibleElement()
	{
		return sDeducibleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSDeducibleElement_DeductionRule()
	{
		return (EReference)sDeducibleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSDeducibleElement_Nature()
	{
		return (EAttribute)sDeducibleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSDeducibleElement_Synthetic()
	{
		return (EAttribute)sDeducibleElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSNamedDeducibleElement()
	{
		return sNamedDeducibleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSImport()
	{
		return sImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSImport_ImportedNamespace()
	{
		return (EAttribute)sImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDomainProxy()
	{
		return sDomainProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSAggregate()
	{
		return sAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSAggregate_Types()
	{
		return (EReference)sAggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSAggregate_Roots()
	{
		return (EReference)sAggregateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSAggregate_DerivedName()
	{
		return (EAttribute)sAggregateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSType()
	{
		return sTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSSimpleType()
	{
		return sSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSSimpleType_Constraints()
	{
		return (EReference)sSimpleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSComplexType()
	{
		return sComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSComplexType_Abstract()
	{
		return (EAttribute)sComplexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSComplexType_SuperType()
	{
		return (EReference)sComplexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSComplexType_Features()
	{
		return (EReference)sComplexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSComplexType_Constraints()
	{
		return (EReference)sComplexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCondition()
	{
		return sConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCondition_Condition()
	{
		return (EReference)sConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSPrimitive()
	{
		return sPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSPrimitive_Redefines()
	{
		return (EReference)sPrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSPrimitive_Archetype()
	{
		return (EAttribute)sPrimitiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSEnumeration()
	{
		return sEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSEnumeration_Literals()
	{
		return (EReference)sEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSLiteral()
	{
		return sLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSEntityType()
	{
		return sEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSEntityType_Root()
	{
		return (EAttribute)sEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDetailType()
	{
		return sDetailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSFeature()
	{
		return sFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSFeature_Type()
	{
		return (EReference)sFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSFeature_Multiplicity()
	{
		return (EReference)sFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSAssociation()
	{
		return sAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSAssociation_Derived()
	{
		return (EAttribute)sAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSAssociation_Kind()
	{
		return (EAttribute)sAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSAssociation__GetTargetType()
	{
		return sAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSAttribute()
	{
		return sAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSAttribute_Detail()
	{
		return (EAttribute)sAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSAttribute_Key()
	{
		return (EAttribute)sAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSQuery()
	{
		return sQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSQuery_Parameters()
	{
		return (EReference)sQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSQuery_Returns()
	{
		return (EReference)sQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSQueryParameter()
	{
		return sQueryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSQueryParameter_Type()
	{
		return (EReference)sQueryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSQueryParameter_Multiplicity()
	{
		return (EReference)sQueryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSExpression()
	{
		return sExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSExpression_Expr()
	{
		return (EAttribute)sExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSMultiplicity()
	{
		return sMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSMultiplicity_MinOccurs()
	{
		return (EAttribute)sMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSMultiplicity_MaxOccurs()
	{
		return (EAttribute)sMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSDeductionRule()
	{
		return sDeductionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSDeductionRule_Source()
	{
		return (EReference)sDeductionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSDeductionRule_NamedSource()
	{
		return (EReference)sDeductionRuleEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSGrabRule_RenameTo()
	{
		return (EAttribute)sGrabRuleEClass.getEStructuralFeatures().get(0);
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
	public EReference getSFuseRule_ExtendFrom()
	{
		return (EReference)sFuseRuleEClass.getEStructuralFeatures().get(1);
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
	public EClass getSSyntheticDeductionRule()
	{
		return sSyntheticDeductionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSSyntheticDeductionRule_ElementWithRule()
	{
		return (EReference)sSyntheticDeductionRuleEClass.getEStructuralFeatures().get(0);
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
	public EEnum getSElementNature()
	{
		return sElementNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSAssociationKind()
	{
		return sAssociationKindEEnum;
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
		sIdentityTypeEClass = createEClass(SIDENTITY_TYPE);

		sValueTypeEClass = createEClass(SVALUE_TYPE);

		sInformationModelEClass = createEClass(SINFORMATION_MODEL);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__GENERATE);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__KIND);
		createEAttribute(sInformationModelEClass, SINFORMATION_MODEL__NAME);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__IMPORTS);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__TYPES);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__AGGREGATES);
		createEReference(sInformationModelEClass, SINFORMATION_MODEL__DOMAIN_PROXIES);

		sNamedElementEClass = createEClass(SNAMED_ELEMENT);
		createEAttribute(sNamedElementEClass, SNAMED_ELEMENT__NAME);

		sDeducibleElementEClass = createEClass(SDEDUCIBLE_ELEMENT);
		createEReference(sDeducibleElementEClass, SDEDUCIBLE_ELEMENT__DEDUCTION_RULE);
		createEAttribute(sDeducibleElementEClass, SDEDUCIBLE_ELEMENT__NATURE);
		createEAttribute(sDeducibleElementEClass, SDEDUCIBLE_ELEMENT__SYNTHETIC);

		sNamedDeducibleElementEClass = createEClass(SNAMED_DEDUCIBLE_ELEMENT);

		sImportEClass = createEClass(SIMPORT);
		createEAttribute(sImportEClass, SIMPORT__IMPORTED_NAMESPACE);

		sDomainProxyEClass = createEClass(SDOMAIN_PROXY);

		sAggregateEClass = createEClass(SAGGREGATE);
		createEReference(sAggregateEClass, SAGGREGATE__TYPES);
		createEReference(sAggregateEClass, SAGGREGATE__ROOTS);
		createEAttribute(sAggregateEClass, SAGGREGATE__DERIVED_NAME);

		sTypeEClass = createEClass(STYPE);

		sSimpleTypeEClass = createEClass(SSIMPLE_TYPE);
		createEReference(sSimpleTypeEClass, SSIMPLE_TYPE__CONSTRAINTS);

		sComplexTypeEClass = createEClass(SCOMPLEX_TYPE);
		createEAttribute(sComplexTypeEClass, SCOMPLEX_TYPE__ABSTRACT);
		createEReference(sComplexTypeEClass, SCOMPLEX_TYPE__SUPER_TYPE);
		createEReference(sComplexTypeEClass, SCOMPLEX_TYPE__FEATURES);
		createEReference(sComplexTypeEClass, SCOMPLEX_TYPE__CONSTRAINTS);

		sConditionEClass = createEClass(SCONDITION);
		createEReference(sConditionEClass, SCONDITION__CONDITION);

		sPrimitiveEClass = createEClass(SPRIMITIVE);
		createEReference(sPrimitiveEClass, SPRIMITIVE__REDEFINES);
		createEAttribute(sPrimitiveEClass, SPRIMITIVE__ARCHETYPE);

		sEnumerationEClass = createEClass(SENUMERATION);
		createEReference(sEnumerationEClass, SENUMERATION__LITERALS);

		sLiteralEClass = createEClass(SLITERAL);

		sEntityTypeEClass = createEClass(SENTITY_TYPE);
		createEAttribute(sEntityTypeEClass, SENTITY_TYPE__ROOT);

		sDetailTypeEClass = createEClass(SDETAIL_TYPE);

		sFeatureEClass = createEClass(SFEATURE);
		createEReference(sFeatureEClass, SFEATURE__TYPE);
		createEReference(sFeatureEClass, SFEATURE__MULTIPLICITY);

		sAssociationEClass = createEClass(SASSOCIATION);
		createEAttribute(sAssociationEClass, SASSOCIATION__DERIVED);
		createEAttribute(sAssociationEClass, SASSOCIATION__KIND);
		createEOperation(sAssociationEClass, SASSOCIATION___GET_TARGET_TYPE);

		sAttributeEClass = createEClass(SATTRIBUTE);
		createEAttribute(sAttributeEClass, SATTRIBUTE__DETAIL);
		createEAttribute(sAttributeEClass, SATTRIBUTE__KEY);

		sQueryEClass = createEClass(SQUERY);
		createEReference(sQueryEClass, SQUERY__PARAMETERS);
		createEReference(sQueryEClass, SQUERY__RETURNS);

		sQueryParameterEClass = createEClass(SQUERY_PARAMETER);
		createEReference(sQueryParameterEClass, SQUERY_PARAMETER__TYPE);
		createEReference(sQueryParameterEClass, SQUERY_PARAMETER__MULTIPLICITY);

		sExpressionEClass = createEClass(SEXPRESSION);
		createEAttribute(sExpressionEClass, SEXPRESSION__EXPR);

		sMultiplicityEClass = createEClass(SMULTIPLICITY);
		createEAttribute(sMultiplicityEClass, SMULTIPLICITY__MIN_OCCURS);
		createEAttribute(sMultiplicityEClass, SMULTIPLICITY__MAX_OCCURS);

		sDeductionRuleEClass = createEClass(SDEDUCTION_RULE);
		createEReference(sDeductionRuleEClass, SDEDUCTION_RULE__SOURCE);
		createEReference(sDeductionRuleEClass, SDEDUCTION_RULE__NAMED_SOURCE);

		sGrabRuleEClass = createEClass(SGRAB_RULE);
		createEAttribute(sGrabRuleEClass, SGRAB_RULE__RENAME_TO);

		sMorphRuleEClass = createEClass(SMORPH_RULE);
		createEReference(sMorphRuleEClass, SMORPH_RULE__RETYPE_TO);
		createEReference(sMorphRuleEClass, SMORPH_RULE__REMULTIPLY_TO);

		sDitchRuleEClass = createEClass(SDITCH_RULE);

		sFuseRuleEClass = createEClass(SFUSE_RULE);
		createEReference(sFuseRuleEClass, SFUSE_RULE__OTHER_SOURCES);
		createEReference(sFuseRuleEClass, SFUSE_RULE__EXTEND_FROM);

		sGrabAggregateRuleEClass = createEClass(SGRAB_AGGREGATE_RULE);
		createEReference(sGrabAggregateRuleEClass, SGRAB_AGGREGATE_RULE__AGGREGATE);

		sGrabDomainRuleEClass = createEClass(SGRAB_DOMAIN_RULE);
		createEReference(sGrabDomainRuleEClass, SGRAB_DOMAIN_RULE__DOMAIN);

		sSyntheticDeductionRuleEClass = createEClass(SSYNTHETIC_DEDUCTION_RULE);
		createEReference(sSyntheticDeductionRuleEClass, SSYNTHETIC_DEDUCTION_RULE__ELEMENT_WITH_RULE);

		// Create enums
		sInformationModelKindEEnum = createEEnum(SINFORMATION_MODEL_KIND);
		sElementNatureEEnum = createEEnum(SELEMENT_NATURE);
		sAssociationKindEEnum = createEEnum(SASSOCIATION_KIND);
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
		sNamedDeducibleElementEClass.getESuperTypes().add(this.getSNamedElement());
		sNamedDeducibleElementEClass.getESuperTypes().add(this.getSDeducibleElement());
		sDomainProxyEClass.getESuperTypes().add(this.getSDeducibleElement());
		sAggregateEClass.getESuperTypes().add(this.getSDeducibleElement());
		sTypeEClass.getESuperTypes().add(this.getSNamedDeducibleElement());
		sSimpleTypeEClass.getESuperTypes().add(this.getSType());
		sSimpleTypeEClass.getESuperTypes().add(this.getSValueType());
		sComplexTypeEClass.getESuperTypes().add(this.getSType());
		sConditionEClass.getESuperTypes().add(this.getSNamedElement());
		sPrimitiveEClass.getESuperTypes().add(this.getSSimpleType());
		sEnumerationEClass.getESuperTypes().add(this.getSSimpleType());
		sLiteralEClass.getESuperTypes().add(this.getSNamedDeducibleElement());
		sEntityTypeEClass.getESuperTypes().add(this.getSComplexType());
		sEntityTypeEClass.getESuperTypes().add(this.getSIdentityType());
		sDetailTypeEClass.getESuperTypes().add(this.getSComplexType());
		sDetailTypeEClass.getESuperTypes().add(this.getSValueType());
		sFeatureEClass.getESuperTypes().add(this.getSNamedDeducibleElement());
		sAssociationEClass.getESuperTypes().add(this.getSFeature());
		sAttributeEClass.getESuperTypes().add(this.getSFeature());
		sQueryEClass.getESuperTypes().add(this.getSFeature());
		sQueryParameterEClass.getESuperTypes().add(this.getSNamedDeducibleElement());
		sGrabRuleEClass.getESuperTypes().add(this.getSDeductionRule());
		sMorphRuleEClass.getESuperTypes().add(this.getSGrabRule());
		sDitchRuleEClass.getESuperTypes().add(this.getSDeductionRule());
		sFuseRuleEClass.getESuperTypes().add(this.getSGrabRule());
		sGrabAggregateRuleEClass.getESuperTypes().add(this.getSDeductionRule());
		sGrabDomainRuleEClass.getESuperTypes().add(this.getSDeductionRule());
		sSyntheticDeductionRuleEClass.getESuperTypes().add(this.getSDeductionRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(sIdentityTypeEClass, SIdentityType.class, "SIdentityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sValueTypeEClass, SValueType.class, "SValueType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sInformationModelEClass, SInformationModel.class, "SInformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSInformationModel_Generate(), ecorePackage.getEBoolean(), "generate", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSInformationModel_Kind(), this.getSInformationModelKind(), "kind", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSInformationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Imports(), this.getSImport(), null, "imports", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Types(), this.getSType(), null, "types", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_Aggregates(), this.getSAggregate(), null, "aggregates", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSInformationModel_DomainProxies(), this.getSDomainProxy(), null, "domainProxies", null, 0, -1, SInformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sNamedElementEClass, SNamedElement.class, "SNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDeducibleElementEClass, SDeducibleElement.class, "SDeducibleElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDeducibleElement_DeductionRule(), this.getSDeductionRule(), null, "deductionRule", null, 0, 1, SDeducibleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDeducibleElement_Nature(), this.getSElementNature(), "nature", null, 0, 1, SDeducibleElement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDeducibleElement_Synthetic(), ecorePackage.getEBoolean(), "synthetic", null, 0, 1, SDeducibleElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sNamedDeducibleElementEClass, SNamedDeducibleElement.class, "SNamedDeducibleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sImportEClass, SImport.class, "SImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, SImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDomainProxyEClass, SDomainProxy.class, "SDomainProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sAggregateEClass, SAggregate.class, "SAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSAggregate_Types(), this.getSType(), null, "types", null, 0, -1, SAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSAggregate_Roots(), this.getSEntityType(), null, "roots", null, 0, -1, SAggregate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAggregate_DerivedName(), ecorePackage.getEString(), "derivedName", null, 0, 1, SAggregate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sTypeEClass, SType.class, "SType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sSimpleTypeEClass, SSimpleType.class, "SSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSimpleType_Constraints(), this.getSCondition(), null, "constraints", null, 0, -1, SSimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sComplexTypeEClass, SComplexType.class, "SComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSComplexType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, SComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSComplexType_SuperType(), this.getSComplexType(), null, "superType", null, 0, 1, SComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSComplexType_Features(), this.getSFeature(), null, "features", null, 0, -1, SComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSComplexType_Constraints(), this.getSCondition(), null, "constraints", null, 0, -1, SComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sConditionEClass, SCondition.class, "SCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSCondition_Condition(), this.getSExpression(), null, "condition", null, 0, 1, SCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sPrimitiveEClass, SPrimitive.class, "SPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPrimitive_Redefines(), this.getSPrimitive(), null, "redefines", null, 0, 1, SPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPrimitive_Archetype(), ecorePackage.getEBoolean(), "archetype", null, 0, 1, SPrimitive.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sEnumerationEClass, SEnumeration.class, "SEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSEnumeration_Literals(), this.getSLiteral(), null, "literals", null, 0, -1, SEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sLiteralEClass, SLiteral.class, "SLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sEntityTypeEClass, SEntityType.class, "SEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSEntityType_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, SEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDetailTypeEClass, SDetailType.class, "SDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sFeatureEClass, SFeature.class, "SFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSFeature_Type(), this.getSType(), null, "type", null, 0, 1, SFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSFeature_Multiplicity(), this.getSMultiplicity(), null, "multiplicity", null, 0, 1, SFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sAssociationEClass, SAssociation.class, "SAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSAssociation_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, SAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAssociation_Kind(), this.getSAssociationKind(), "kind", null, 0, 1, SAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSAssociation__GetTargetType(), this.getSEntityType(), "getTargetType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sAttributeEClass, SAttribute.class, "SAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSAttribute_Detail(), ecorePackage.getEBoolean(), "detail", null, 0, 1, SAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, SAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sQueryEClass, SQuery.class, "SQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQuery_Parameters(), this.getSQueryParameter(), null, "parameters", null, 0, -1, SQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQuery_Returns(), this.getSExpression(), null, "returns", null, 0, 1, SQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sQueryParameterEClass, SQueryParameter.class, "SQueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQueryParameter_Type(), this.getSType(), null, "type", null, 0, 1, SQueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSQueryParameter_Multiplicity(), this.getSMultiplicity(), null, "multiplicity", null, 0, 1, SQueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sExpressionEClass, SExpression.class, "SExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSExpression_Expr(), ecorePackage.getEString(), "expr", null, 0, 1, SExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sMultiplicityEClass, SMultiplicity.class, "SMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSMultiplicity_MinOccurs(), ecorePackage.getEInt(), "minOccurs", null, 0, 1, SMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSMultiplicity_MaxOccurs(), ecorePackage.getEInt(), "maxOccurs", null, 0, 1, SMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDeductionRuleEClass, SDeductionRule.class, "SDeductionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDeductionRule_Source(), ecorePackage.getEObject(), null, "source", null, 0, 1, SDeductionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSDeductionRule_NamedSource(), theBasePackage.getDNamedElement(), null, "namedSource", null, 0, 1, SDeductionRule.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sGrabRuleEClass, SGrabRule.class, "SGrabRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSGrabRule_RenameTo(), ecorePackage.getEString(), "renameTo", null, 0, 1, SGrabRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sMorphRuleEClass, SMorphRule.class, "SMorphRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSMorphRule_RetypeTo(), this.getSType(), null, "retypeTo", null, 0, 1, SMorphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSMorphRule_RemultiplyTo(), this.getSMultiplicity(), null, "remultiplyTo", null, 0, 1, SMorphRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sDitchRuleEClass, SDitchRule.class, "SDitchRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sFuseRuleEClass, SFuseRule.class, "SFuseRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSFuseRule_OtherSources(), theBasePackage.getDNamedElement(), null, "otherSources", null, 0, -1, SFuseRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSFuseRule_ExtendFrom(), this.getSType(), null, "extendFrom", null, 0, 1, SFuseRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sGrabAggregateRuleEClass, SGrabAggregateRule.class, "SGrabAggregateRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGrabAggregateRule_Aggregate(), theBasePackage.getDAggregate(), null, "aggregate", null, 0, 1, SGrabAggregateRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sGrabDomainRuleEClass, SGrabDomainRule.class, "SGrabDomainRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGrabDomainRule_Domain(), theBasePackage.getDDomain(), null, "domain", null, 0, 1, SGrabDomainRule.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sSyntheticDeductionRuleEClass, SSyntheticDeductionRule.class, "SSyntheticDeductionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSSyntheticDeductionRule_ElementWithRule(), this.getSDeducibleElement(), null, "elementWithRule", null, 0, 1, SSyntheticDeductionRule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sInformationModelKindEEnum, SInformationModelKind.class, "SInformationModelKind");
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.BASE);
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.INTERFACE);
		addEEnumLiteral(sInformationModelKindEEnum, SInformationModelKind.CORE);

		initEEnum(sElementNatureEEnum, SElementNature.class, "SElementNature");
		addEEnumLiteral(sElementNatureEEnum, SElementNature.GENUINE);
		addEEnumLiteral(sElementNatureEEnum, SElementNature.DEDUCTION_RULE);
		addEEnumLiteral(sElementNatureEEnum, SElementNature.SYNTHETIC);

		initEEnum(sAssociationKindEEnum, SAssociationKind.class, "SAssociationKind");
		addEEnumLiteral(sAssociationKindEEnum, SAssociationKind.REFERENCE);
		addEEnumLiteral(sAssociationKindEEnum, SAssociationKind.COMPOSITE);
		addEEnumLiteral(sAssociationKindEEnum, SAssociationKind.INVERSE_COMPOSITE);

		// Create resource
		createResource(eNS_URI);
	}

} //SimPackageImpl
