/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAssociationKind;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityNature;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DImplicitDeduction;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DInformationModel;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DModel;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DMultiplicityShorthand;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.DNamespace;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DSimpleType;
import com.mimacom.ddd.dm.base.DState;
import com.mimacom.ddd.dm.base.DStateEvent;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.ITypeContainer;
import com.mimacom.ddd.dm.base.IValueType;

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
public class BasePackageImpl extends EPackageImpl implements BasePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDiagramRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaticReferenceTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRichTextSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTextSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dRichTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDeductionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dDeductionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDeducibleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dImplicitDeductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dInformationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAggregateContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFeatureContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNavigableMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNavigableMemberContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iIdentityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNamedPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSimpleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dPrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dDetailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dQueryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dMultiplicityShorthandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dEntityNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dAssociationKindEEnum = null;

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
	 * @see com.mimacom.ddd.dm.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl()
	{
		super(eNS_URI, BaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init()
	{
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasePackageImpl theBasePackage = registeredBasePackage instanceof BasePackageImpl ? (BasePackageImpl)registeredBasePackage : new BasePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNamedElement()
	{
		return dNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNamedElement_Name()
	{
		return (EAttribute)dNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNamedElement_Aliases()
	{
		return (EAttribute)dNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNamedElement_Description()
	{
		return (EReference)dNamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDImport()
	{
		return dImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDImport_ImportedNamespace()
	{
		return (EAttribute)dImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNamespace()
	{
		return dNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNamespace_Imports()
	{
		return (EReference)dNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNamespace_Model()
	{
		return (EReference)dNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDModel()
	{
		return dModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDiagramRoot()
	{
		return iDiagramRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIStaticReferenceTarget()
	{
		return iStaticReferenceTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIRichTextSegment()
	{
		return iRichTextSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDTextSegment()
	{
		return dTextSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDTextSegment_Value()
	{
		return (EAttribute)dTextSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDExpression()
	{
		return dExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDRichText()
	{
		return dRichTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDRichText_Segments()
	{
		return (EReference)dRichTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDeductionDefinition()
	{
		return iDeductionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIDeductionDefinition_DeductionRule()
	{
		return (EReference)iDeductionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIDeductionDefinition_ImpliedDeductions()
	{
		return (EReference)iDeductionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDDeductionRule()
	{
		return dDeductionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDeductionRule_Source()
	{
		return (EReference)dDeductionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDeductionRule_NamedSource()
	{
		return (EReference)dDeductionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIDeducibleElement()
	{
		return iDeducibleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIDeducibleElement_DeducedFrom()
	{
		return (EReference)iDeducibleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIDeducibleElement_Synthetic()
	{
		return (EAttribute)iDeducibleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDImplicitDeduction()
	{
		return dImplicitDeductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDImplicitDeduction_OriginalDeductionDefinition()
	{
		return (EReference)dImplicitDeductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDInformationModel()
	{
		return dInformationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIAggregateContainer()
	{
		return iAggregateContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIAggregateContainer_Aggregates()
	{
		return (EReference)iAggregateContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getITypeContainer()
	{
		return iTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getITypeContainer_Types()
	{
		return (EReference)iTypeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIFeatureContainer()
	{
		return iFeatureContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIFeatureContainer_Features()
	{
		return (EReference)iFeatureContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAggregate()
	{
		return dAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAggregate_Roots()
	{
		return (EReference)dAggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNavigableMember()
	{
		return dNavigableMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNavigableMember_Type()
	{
		return (EReference)dNavigableMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNavigableMember_Multiplicity()
	{
		return (EReference)dNavigableMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNavigableMember_Optional()
	{
		return (EAttribute)dNavigableMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNavigableMember_Collection()
	{
		return (EAttribute)dNavigableMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getINavigableMemberContainer()
	{
		return iNavigableMemberContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getINavigableMemberContainer_NavigableMembers()
	{
		return (EReference)iNavigableMemberContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDContext()
	{
		return dContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMultiplicity()
	{
		return dMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMultiplicity_MinOccurs()
	{
		return (EAttribute)dMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMultiplicity_MaxOccurs()
	{
		return (EAttribute)dMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMultiplicity_Shorthand()
	{
		return (EAttribute)dMultiplicityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIIdentityType()
	{
		return iIdentityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIValueType()
	{
		return iValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDType()
	{
		return dTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDType_Constraints()
	{
		return (EReference)dTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDType_Primitive()
	{
		return (EAttribute)dTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNamedPredicate()
	{
		return dNamedPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNamedPredicate_Predicate()
	{
		return (EReference)dNamedPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSimpleType()
	{
		return dSimpleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDPrimitive()
	{
		return dPrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDPrimitive_Redefines()
	{
		return (EReference)dPrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDEnumeration()
	{
		return dEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDEnumeration_Literals()
	{
		return (EReference)dEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDLiteral()
	{
		return dLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDComplexType()
	{
		return dComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDComplexType_Abstract()
	{
		return (EAttribute)dComplexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDComplexType_SuperType()
	{
		return (EReference)dComplexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDDetailType()
	{
		return dDetailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDEntityType()
	{
		return dEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDEntityType_Root()
	{
		return (EAttribute)dEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDEntityType_Nature()
	{
		return (EAttribute)dEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDEntityType_States()
	{
		return (EReference)dEntityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDEntityType_Events()
	{
		return (EReference)dEntityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDFeature()
	{
		return dFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAssociation()
	{
		return dAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAssociation_Kind()
	{
		return (EAttribute)dAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAssociation_Derived()
	{
		return (EAttribute)dAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAssociation_SourceType()
	{
		return (EReference)dAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDAssociation__GetTargetType()
	{
		return dAssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAttribute()
	{
		return dAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAttribute_Detail()
	{
		return (EAttribute)dAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAttribute_Key()
	{
		return (EAttribute)dAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQuery()
	{
		return dQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQuery_Parameters()
	{
		return (EReference)dQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQuery_Returns()
	{
		return (EReference)dQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQueryParameter()
	{
		return dQueryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDState()
	{
		return dStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDStateEvent()
	{
		return dStateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDMultiplicityShorthand()
	{
		return dMultiplicityShorthandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDEntityNature()
	{
		return dEntityNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDAssociationKind()
	{
		return dAssociationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseFactory getBaseFactory()
	{
		return (BaseFactory)getEFactoryInstance();
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
		dNamedElementEClass = createEClass(DNAMED_ELEMENT);
		createEAttribute(dNamedElementEClass, DNAMED_ELEMENT__NAME);
		createEAttribute(dNamedElementEClass, DNAMED_ELEMENT__ALIASES);
		createEReference(dNamedElementEClass, DNAMED_ELEMENT__DESCRIPTION);

		dImportEClass = createEClass(DIMPORT);
		createEAttribute(dImportEClass, DIMPORT__IMPORTED_NAMESPACE);

		dNamespaceEClass = createEClass(DNAMESPACE);
		createEReference(dNamespaceEClass, DNAMESPACE__IMPORTS);
		createEReference(dNamespaceEClass, DNAMESPACE__MODEL);

		dModelEClass = createEClass(DMODEL);

		iDiagramRootEClass = createEClass(IDIAGRAM_ROOT);

		iStaticReferenceTargetEClass = createEClass(ISTATIC_REFERENCE_TARGET);

		iRichTextSegmentEClass = createEClass(IRICH_TEXT_SEGMENT);

		dTextSegmentEClass = createEClass(DTEXT_SEGMENT);
		createEAttribute(dTextSegmentEClass, DTEXT_SEGMENT__VALUE);

		dExpressionEClass = createEClass(DEXPRESSION);

		dRichTextEClass = createEClass(DRICH_TEXT);
		createEReference(dRichTextEClass, DRICH_TEXT__SEGMENTS);

		iDeductionDefinitionEClass = createEClass(IDEDUCTION_DEFINITION);
		createEReference(iDeductionDefinitionEClass, IDEDUCTION_DEFINITION__DEDUCTION_RULE);
		createEReference(iDeductionDefinitionEClass, IDEDUCTION_DEFINITION__IMPLIED_DEDUCTIONS);

		dDeductionRuleEClass = createEClass(DDEDUCTION_RULE);
		createEReference(dDeductionRuleEClass, DDEDUCTION_RULE__SOURCE);
		createEReference(dDeductionRuleEClass, DDEDUCTION_RULE__NAMED_SOURCE);

		iDeducibleElementEClass = createEClass(IDEDUCIBLE_ELEMENT);
		createEReference(iDeducibleElementEClass, IDEDUCIBLE_ELEMENT__DEDUCED_FROM);
		createEAttribute(iDeducibleElementEClass, IDEDUCIBLE_ELEMENT__SYNTHETIC);

		dImplicitDeductionEClass = createEClass(DIMPLICIT_DEDUCTION);
		createEReference(dImplicitDeductionEClass, DIMPLICIT_DEDUCTION__ORIGINAL_DEDUCTION_DEFINITION);

		dInformationModelEClass = createEClass(DINFORMATION_MODEL);

		iAggregateContainerEClass = createEClass(IAGGREGATE_CONTAINER);
		createEReference(iAggregateContainerEClass, IAGGREGATE_CONTAINER__AGGREGATES);

		iTypeContainerEClass = createEClass(ITYPE_CONTAINER);
		createEReference(iTypeContainerEClass, ITYPE_CONTAINER__TYPES);

		iFeatureContainerEClass = createEClass(IFEATURE_CONTAINER);
		createEReference(iFeatureContainerEClass, IFEATURE_CONTAINER__FEATURES);

		dAggregateEClass = createEClass(DAGGREGATE);
		createEReference(dAggregateEClass, DAGGREGATE__ROOTS);

		dNavigableMemberEClass = createEClass(DNAVIGABLE_MEMBER);
		createEReference(dNavigableMemberEClass, DNAVIGABLE_MEMBER__TYPE);
		createEReference(dNavigableMemberEClass, DNAVIGABLE_MEMBER__MULTIPLICITY);
		createEAttribute(dNavigableMemberEClass, DNAVIGABLE_MEMBER__OPTIONAL);
		createEAttribute(dNavigableMemberEClass, DNAVIGABLE_MEMBER__COLLECTION);

		iNavigableMemberContainerEClass = createEClass(INAVIGABLE_MEMBER_CONTAINER);
		createEReference(iNavigableMemberContainerEClass, INAVIGABLE_MEMBER_CONTAINER__NAVIGABLE_MEMBERS);

		dContextEClass = createEClass(DCONTEXT);

		dMultiplicityEClass = createEClass(DMULTIPLICITY);
		createEAttribute(dMultiplicityEClass, DMULTIPLICITY__MIN_OCCURS);
		createEAttribute(dMultiplicityEClass, DMULTIPLICITY__MAX_OCCURS);
		createEAttribute(dMultiplicityEClass, DMULTIPLICITY__SHORTHAND);

		iIdentityTypeEClass = createEClass(IIDENTITY_TYPE);

		iValueTypeEClass = createEClass(IVALUE_TYPE);

		dTypeEClass = createEClass(DTYPE);
		createEReference(dTypeEClass, DTYPE__CONSTRAINTS);
		createEAttribute(dTypeEClass, DTYPE__PRIMITIVE);

		dNamedPredicateEClass = createEClass(DNAMED_PREDICATE);
		createEReference(dNamedPredicateEClass, DNAMED_PREDICATE__PREDICATE);

		dSimpleTypeEClass = createEClass(DSIMPLE_TYPE);

		dPrimitiveEClass = createEClass(DPRIMITIVE);
		createEReference(dPrimitiveEClass, DPRIMITIVE__REDEFINES);

		dEnumerationEClass = createEClass(DENUMERATION);
		createEReference(dEnumerationEClass, DENUMERATION__LITERALS);

		dLiteralEClass = createEClass(DLITERAL);

		dComplexTypeEClass = createEClass(DCOMPLEX_TYPE);
		createEAttribute(dComplexTypeEClass, DCOMPLEX_TYPE__ABSTRACT);
		createEReference(dComplexTypeEClass, DCOMPLEX_TYPE__SUPER_TYPE);

		dDetailTypeEClass = createEClass(DDETAIL_TYPE);

		dEntityTypeEClass = createEClass(DENTITY_TYPE);
		createEAttribute(dEntityTypeEClass, DENTITY_TYPE__ROOT);
		createEAttribute(dEntityTypeEClass, DENTITY_TYPE__NATURE);
		createEReference(dEntityTypeEClass, DENTITY_TYPE__STATES);
		createEReference(dEntityTypeEClass, DENTITY_TYPE__EVENTS);

		dFeatureEClass = createEClass(DFEATURE);

		dAssociationEClass = createEClass(DASSOCIATION);
		createEAttribute(dAssociationEClass, DASSOCIATION__KIND);
		createEAttribute(dAssociationEClass, DASSOCIATION__DERIVED);
		createEReference(dAssociationEClass, DASSOCIATION__SOURCE_TYPE);
		createEOperation(dAssociationEClass, DASSOCIATION___GET_TARGET_TYPE);

		dAttributeEClass = createEClass(DATTRIBUTE);
		createEAttribute(dAttributeEClass, DATTRIBUTE__DETAIL);
		createEAttribute(dAttributeEClass, DATTRIBUTE__KEY);

		dQueryEClass = createEClass(DQUERY);
		createEReference(dQueryEClass, DQUERY__PARAMETERS);
		createEReference(dQueryEClass, DQUERY__RETURNS);

		dQueryParameterEClass = createEClass(DQUERY_PARAMETER);

		dStateEClass = createEClass(DSTATE);

		dStateEventEClass = createEClass(DSTATE_EVENT);

		// Create enums
		dMultiplicityShorthandEEnum = createEEnum(DMULTIPLICITY_SHORTHAND);
		dEntityNatureEEnum = createEEnum(DENTITY_NATURE);
		dAssociationKindEEnum = createEEnum(DASSOCIATION_KIND);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dNamespaceEClass.getESuperTypes().add(this.getDNamedElement());
		dModelEClass.getESuperTypes().add(this.getDNamedElement());
		iStaticReferenceTargetEClass.getESuperTypes().add(this.getDNamedElement());
		dTextSegmentEClass.getESuperTypes().add(this.getIRichTextSegment());
		dExpressionEClass.getESuperTypes().add(this.getIRichTextSegment());
		dRichTextEClass.getESuperTypes().add(this.getDExpression());
		dImplicitDeductionEClass.getESuperTypes().add(this.getIDeductionDefinition());
		dInformationModelEClass.getESuperTypes().add(this.getDModel());
		dInformationModelEClass.getESuperTypes().add(this.getIAggregateContainer());
		dInformationModelEClass.getESuperTypes().add(this.getITypeContainer());
		dInformationModelEClass.getESuperTypes().add(this.getIStaticReferenceTarget());
		dInformationModelEClass.getESuperTypes().add(this.getIDeducibleElement());
		dInformationModelEClass.getESuperTypes().add(this.getIDiagramRoot());
		dAggregateEClass.getESuperTypes().add(this.getDNamedElement());
		dAggregateEClass.getESuperTypes().add(this.getITypeContainer());
		dAggregateEClass.getESuperTypes().add(this.getIFeatureContainer());
		dAggregateEClass.getESuperTypes().add(this.getINavigableMemberContainer());
		dAggregateEClass.getESuperTypes().add(this.getIStaticReferenceTarget());
		dAggregateEClass.getESuperTypes().add(this.getIDeducibleElement());
		dAggregateEClass.getESuperTypes().add(this.getIDiagramRoot());
		dNavigableMemberEClass.getESuperTypes().add(this.getDNamedElement());
		dContextEClass.getESuperTypes().add(this.getDNavigableMember());
		dTypeEClass.getESuperTypes().add(this.getDNamedElement());
		dTypeEClass.getESuperTypes().add(this.getIDeducibleElement());
		dTypeEClass.getESuperTypes().add(this.getIStaticReferenceTarget());
		dNamedPredicateEClass.getESuperTypes().add(this.getDNamedElement());
		dSimpleTypeEClass.getESuperTypes().add(this.getDType());
		dSimpleTypeEClass.getESuperTypes().add(this.getIValueType());
		dPrimitiveEClass.getESuperTypes().add(this.getDSimpleType());
		dEnumerationEClass.getESuperTypes().add(this.getDSimpleType());
		dEnumerationEClass.getESuperTypes().add(this.getINavigableMemberContainer());
		dLiteralEClass.getESuperTypes().add(this.getDNavigableMember());
		dLiteralEClass.getESuperTypes().add(this.getIDeducibleElement());
		dComplexTypeEClass.getESuperTypes().add(this.getDType());
		dComplexTypeEClass.getESuperTypes().add(this.getIFeatureContainer());
		dComplexTypeEClass.getESuperTypes().add(this.getINavigableMemberContainer());
		dDetailTypeEClass.getESuperTypes().add(this.getDComplexType());
		dDetailTypeEClass.getESuperTypes().add(this.getIValueType());
		dEntityTypeEClass.getESuperTypes().add(this.getDComplexType());
		dEntityTypeEClass.getESuperTypes().add(this.getIIdentityType());
		dFeatureEClass.getESuperTypes().add(this.getDNavigableMember());
		dFeatureEClass.getESuperTypes().add(this.getIDeducibleElement());
		dAssociationEClass.getESuperTypes().add(this.getDFeature());
		dAttributeEClass.getESuperTypes().add(this.getDFeature());
		dQueryEClass.getESuperTypes().add(this.getDFeature());
		dQueryEClass.getESuperTypes().add(this.getINavigableMemberContainer());
		dQueryParameterEClass.getESuperTypes().add(this.getDNavigableMember());
		dQueryParameterEClass.getESuperTypes().add(this.getIDeducibleElement());
		dStateEClass.getESuperTypes().add(this.getDNavigableMember());
		dStateEventEClass.getESuperTypes().add(this.getDNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(dNamedElementEClass, DNamedElement.class, "DNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNamedElement_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNamedElement_Description(), this.getDRichText(), null, "description", null, 0, 1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dImportEClass, DImport.class, "DImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, DImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dNamespaceEClass, DNamespace.class, "DNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNamespace_Imports(), this.getDImport(), null, "imports", null, 0, -1, DNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNamespace_Model(), this.getDModel(), null, "model", null, 0, 1, DNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dModelEClass, DModel.class, "DModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iDiagramRootEClass, IDiagramRoot.class, "IDiagramRoot", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iStaticReferenceTargetEClass, IStaticReferenceTarget.class, "IStaticReferenceTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRichTextSegmentEClass, IRichTextSegment.class, "IRichTextSegment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dTextSegmentEClass, DTextSegment.class, "DTextSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTextSegment_Value(), ecorePackage.getEString(), "value", null, 0, 1, DTextSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dExpressionEClass, DExpression.class, "DExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dRichTextEClass, DRichText.class, "DRichText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDRichText_Segments(), this.getIRichTextSegment(), null, "segments", null, 0, -1, DRichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iDeductionDefinitionEClass, IDeductionDefinition.class, "IDeductionDefinition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIDeductionDefinition_DeductionRule(), this.getDDeductionRule(), null, "deductionRule", null, 0, 1, IDeductionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIDeductionDefinition_ImpliedDeductions(), this.getDImplicitDeduction(), null, "impliedDeductions", null, 0, -1, IDeductionDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDeductionRuleEClass, DDeductionRule.class, "DDeductionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDeductionRule_Source(), this.getIDeducibleElement(), null, "source", null, 0, 1, DDeductionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDeductionRule_NamedSource(), this.getDNamedElement(), null, "namedSource", null, 0, 1, DDeductionRule.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iDeducibleElementEClass, IDeducibleElement.class, "IDeducibleElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIDeducibleElement_DeducedFrom(), this.getIDeductionDefinition(), null, "deducedFrom", null, 0, 1, IDeducibleElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIDeducibleElement_Synthetic(), ecorePackage.getEBoolean(), "synthetic", null, 0, 1, IDeducibleElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dImplicitDeductionEClass, DImplicitDeduction.class, "DImplicitDeduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDImplicitDeduction_OriginalDeductionDefinition(), this.getIDeductionDefinition(), null, "originalDeductionDefinition", null, 0, 1, DImplicitDeduction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dInformationModelEClass, DInformationModel.class, "DInformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iAggregateContainerEClass, IAggregateContainer.class, "IAggregateContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIAggregateContainer_Aggregates(), this.getDAggregate(), null, "aggregates", null, 0, -1, IAggregateContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTypeContainerEClass, ITypeContainer.class, "ITypeContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getITypeContainer_Types(), this.getDType(), null, "types", null, 0, -1, ITypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iFeatureContainerEClass, IFeatureContainer.class, "IFeatureContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFeatureContainer_Features(), this.getDFeature(), null, "features", null, 0, -1, IFeatureContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAggregateEClass, DAggregate.class, "DAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAggregate_Roots(), this.getDEntityType(), null, "roots", null, 0, -1, DAggregate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dNavigableMemberEClass, DNavigableMember.class, "DNavigableMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNavigableMember_Type(), this.getDType(), null, "type", null, 0, 1, DNavigableMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNavigableMember_Multiplicity(), this.getDMultiplicity(), null, "multiplicity", null, 0, 1, DNavigableMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNavigableMember_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, DNavigableMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNavigableMember_Collection(), ecorePackage.getEBoolean(), "collection", null, 0, 1, DNavigableMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iNavigableMemberContainerEClass, INavigableMemberContainer.class, "INavigableMemberContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getINavigableMemberContainer_NavigableMembers(), this.getDNavigableMember(), null, "navigableMembers", null, 0, -1, INavigableMemberContainer.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dContextEClass, DContext.class, "DContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dMultiplicityEClass, DMultiplicity.class, "DMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMultiplicity_MinOccurs(), ecorePackage.getEInt(), "minOccurs", null, 0, 1, DMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMultiplicity_MaxOccurs(), ecorePackage.getEInt(), "maxOccurs", null, 0, 1, DMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMultiplicity_Shorthand(), this.getDMultiplicityShorthand(), "shorthand", null, 0, 1, DMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iIdentityTypeEClass, IIdentityType.class, "IIdentityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iValueTypeEClass, IValueType.class, "IValueType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dTypeEClass, DType.class, "DType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDType_Constraints(), this.getDNamedPredicate(), null, "constraints", null, 0, -1, DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDType_Primitive(), ecorePackage.getEBoolean(), "primitive", "true", 0, 1, DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dNamedPredicateEClass, DNamedPredicate.class, "DNamedPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNamedPredicate_Predicate(), this.getDExpression(), null, "predicate", null, 0, 1, DNamedPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSimpleTypeEClass, DSimpleType.class, "DSimpleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dPrimitiveEClass, DPrimitive.class, "DPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDPrimitive_Redefines(), this.getDPrimitive(), null, "redefines", null, 0, 1, DPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dEnumerationEClass, DEnumeration.class, "DEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEnumeration_Literals(), this.getDLiteral(), null, "literals", null, 0, -1, DEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dLiteralEClass, DLiteral.class, "DLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dComplexTypeEClass, DComplexType.class, "DComplexType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDComplexType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, DComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDComplexType_SuperType(), this.getDComplexType(), null, "superType", null, 0, 1, DComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDetailTypeEClass, DDetailType.class, "DDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dEntityTypeEClass, DEntityType.class, "DEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEntityType_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, DEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEntityType_Nature(), this.getDEntityNature(), "nature", null, 0, 1, DEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEntityType_States(), this.getDState(), null, "states", null, 0, -1, DEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEntityType_Events(), this.getDStateEvent(), null, "events", null, 0, -1, DEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFeatureEClass, DFeature.class, "DFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dAssociationEClass, DAssociation.class, "DAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAssociation_Kind(), this.getDAssociationKind(), "kind", null, 0, 1, DAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAssociation_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, DAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAssociation_SourceType(), this.getDComplexType(), null, "sourceType", null, 1, 1, DAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getDAssociation__GetTargetType(), this.getDEntityType(), "getTargetType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dAttributeEClass, DAttribute.class, "DAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAttribute_Detail(), ecorePackage.getEBoolean(), "detail", null, 0, 1, DAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, DAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dQueryEClass, DQuery.class, "DQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDQuery_Parameters(), this.getDQueryParameter(), null, "parameters", null, 0, -1, DQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDQuery_Returns(), this.getDExpression(), null, "returns", null, 0, 1, DQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dQueryParameterEClass, DQueryParameter.class, "DQueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dStateEClass, DState.class, "DState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dStateEventEClass, DStateEvent.class, "DStateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dMultiplicityShorthandEEnum, DMultiplicityShorthand.class, "DMultiplicityShorthand");
		addEEnumLiteral(dMultiplicityShorthandEEnum, DMultiplicityShorthand.NONE);
		addEEnumLiteral(dMultiplicityShorthandEEnum, DMultiplicityShorthand.ZERO_OR_ONE);
		addEEnumLiteral(dMultiplicityShorthandEEnum, DMultiplicityShorthand.ONE_OR_MORE);
		addEEnumLiteral(dMultiplicityShorthandEEnum, DMultiplicityShorthand.ZERO_OR_MORE);

		initEEnum(dEntityNatureEEnum, DEntityNature.class, "DEntityNature");
		addEEnumLiteral(dEntityNatureEEnum, DEntityNature.CONTROLLED_ENTITY);
		addEEnumLiteral(dEntityNatureEEnum, DEntityNature.AUTONOMOUS_ENTITY);
		addEEnumLiteral(dEntityNatureEEnum, DEntityNature.RELATIONSHIP);

		initEEnum(dAssociationKindEEnum, DAssociationKind.class, "DAssociationKind");
		addEEnumLiteral(dAssociationKindEEnum, DAssociationKind.REFERENCE);
		addEEnumLiteral(dAssociationKindEEnum, DAssociationKind.COMPOSITE);
		addEEnumLiteral(dAssociationKindEEnum, DAssociationKind.INVERSE_COMPOSITE);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
