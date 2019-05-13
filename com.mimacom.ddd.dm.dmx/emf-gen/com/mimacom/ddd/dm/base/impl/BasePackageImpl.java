/**
 */
package com.mimacom.ddd.dm.base.impl;

import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DActor;
import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAssociationKind;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DCondition;
import com.mimacom.ddd.dm.base.DContext;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DDirection;
import com.mimacom.ddd.dm.base.DDomain;
import com.mimacom.ddd.dm.base.DDomainEvent;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DException;
import com.mimacom.ddd.dm.base.DExistingApplication;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DFunction;
import com.mimacom.ddd.dm.base.DHuman;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNotification;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DRelationship;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DService;
import com.mimacom.ddd.dm.base.DServiceKind;
import com.mimacom.ddd.dm.base.DServiceParameter;
import com.mimacom.ddd.dm.base.DSimpleType;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.DTime;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.DTypedMember;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.dm.base.INamespace;
import com.mimacom.ddd.dm.base.IPrimaryNavigationTarget;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.ITypedMemberContainer;
import com.mimacom.ddd.dm.base.IValueType;

import com.mimacom.ddd.dm.dmx.DmxPackage;

import com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl;

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
	private EClass iNamespaceEClass = null;

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
	private EClass dTypedMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypedMemberContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPrimaryNavigationTargetEClass = null;

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
	private EClass dDomainEClass = null;

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
	private EClass dFunctionEClass = null;

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
	private EClass dTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dConditionEClass = null;

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
	private EClass dIdentityTypeEClass = null;

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
	private EClass dRelationshipEClass = null;

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
	private EClass dMultiplicityEClass = null;

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
	private EClass dDomainEventEClass = null;

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
	private EClass dNotificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dHumanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dServiceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dExistingApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dAssociationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dServiceKindEEnum = null;

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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DmxPackage.eNS_URI);
		DmxPackageImpl theDmxPackage = (DmxPackageImpl)(registeredPackage instanceof DmxPackageImpl ? registeredPackage : DmxPackage.eINSTANCE);

		// Create package meta-data objects
		theBasePackage.createPackageContents();
		theDmxPackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();
		theDmxPackage.initializePackageContents();

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
	public EClass getINamespace()
	{
		return iNamespaceEClass;
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
	public EClass getDTypedMember()
	{
		return dTypedMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTypedMember_Type()
	{
		return (EReference)dTypedMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDTypedMember_Multiplicity()
	{
		return (EReference)dTypedMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDTypedMember_Optional()
	{
		return (EAttribute)dTypedMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDTypedMember_Collection()
	{
		return (EAttribute)dTypedMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getITypedMemberContainer()
	{
		return iTypedMemberContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPrimaryNavigationTarget()
	{
		return iPrimaryNavigationTargetEClass;
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
	public EClass getDDomain()
	{
		return dDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Imports()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Types()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Functions()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Aggregates()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Applications()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Events()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomain_Actors()
	{
		return (EReference)dDomainEClass.getEStructuralFeatures().get(6);
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
	public EClass getDFunction()
	{
		return dFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDFunction_ParameterNames()
	{
		return (EAttribute)dFunctionEClass.getEStructuralFeatures().get(0);
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
	public EReference getDAggregate_Description()
	{
		return (EReference)dAggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAggregate_Types()
	{
		return (EReference)dAggregateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAggregate_Roots()
	{
		return (EReference)dAggregateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAggregate_DerivedName()
	{
		return (EAttribute)dAggregateEClass.getEStructuralFeatures().get(3);
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
	public EClass getDCondition()
	{
		return dConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCondition_Condition()
	{
		return (EReference)dConditionEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getDPrimitive_Archetype()
	{
		return (EAttribute)dPrimitiveEClass.getEStructuralFeatures().get(1);
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
	public EReference getDComplexType_Features()
	{
		return (EReference)dComplexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDComplexType_SuperType()
	{
		return (EReference)dComplexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDIdentityType()
	{
		return dIdentityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDIdentityType_Root()
	{
		return (EAttribute)dIdentityTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getDRelationship()
	{
		return dRelationshipEClass;
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
	public EClass getDDomainEvent()
	{
		return dDomainEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Before()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_After()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Trigger()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Notifications()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDDomainEvent_Context()
	{
		return (EReference)dDomainEventEClass.getEStructuralFeatures().get(4);
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
	public EClass getDNotification()
	{
		return dNotificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNotification_Notified()
	{
		return (EReference)dNotificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDActor()
	{
		return dActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDHuman()
	{
		return dHumanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDService()
	{
		return dServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDService_Kind()
	{
		return (EAttribute)dServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDService_Parameters()
	{
		return (EReference)dServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDService_Raises()
	{
		return (EReference)dServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDService_Precondition()
	{
		return (EReference)dServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDService_Postcondition()
	{
		return (EReference)dServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDService_Types()
	{
		return (EReference)dServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDServiceParameter()
	{
		return dServiceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDServiceParameter_Direction()
	{
		return (EAttribute)dServiceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDTime()
	{
		return dTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDExistingApplication()
	{
		return dExistingApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDExistingApplication_Types()
	{
		return (EReference)dExistingApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDExistingApplication_Services()
	{
		return (EReference)dExistingApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDExistingApplication_Exceptions()
	{
		return (EReference)dExistingApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDException()
	{
		return dExceptionEClass;
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
	public EEnum getDDirection()
	{
		return dDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDServiceKind()
	{
		return dServiceKindEEnum;
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
		iIdentityTypeEClass = createEClass(IIDENTITY_TYPE);

		iValueTypeEClass = createEClass(IVALUE_TYPE);

		iNamespaceEClass = createEClass(INAMESPACE);

		dNamedElementEClass = createEClass(DNAMED_ELEMENT);
		createEAttribute(dNamedElementEClass, DNAMED_ELEMENT__NAME);
		createEAttribute(dNamedElementEClass, DNAMED_ELEMENT__ALIASES);
		createEReference(dNamedElementEClass, DNAMED_ELEMENT__DESCRIPTION);

		dTypedMemberEClass = createEClass(DTYPED_MEMBER);
		createEReference(dTypedMemberEClass, DTYPED_MEMBER__TYPE);
		createEReference(dTypedMemberEClass, DTYPED_MEMBER__MULTIPLICITY);
		createEAttribute(dTypedMemberEClass, DTYPED_MEMBER__OPTIONAL);
		createEAttribute(dTypedMemberEClass, DTYPED_MEMBER__COLLECTION);

		iTypedMemberContainerEClass = createEClass(ITYPED_MEMBER_CONTAINER);

		iPrimaryNavigationTargetEClass = createEClass(IPRIMARY_NAVIGATION_TARGET);

		iRichTextSegmentEClass = createEClass(IRICH_TEXT_SEGMENT);

		dTextSegmentEClass = createEClass(DTEXT_SEGMENT);
		createEAttribute(dTextSegmentEClass, DTEXT_SEGMENT__VALUE);

		dExpressionEClass = createEClass(DEXPRESSION);

		dRichTextEClass = createEClass(DRICH_TEXT);
		createEReference(dRichTextEClass, DRICH_TEXT__SEGMENTS);

		dDomainEClass = createEClass(DDOMAIN);
		createEReference(dDomainEClass, DDOMAIN__IMPORTS);
		createEReference(dDomainEClass, DDOMAIN__TYPES);
		createEReference(dDomainEClass, DDOMAIN__FUNCTIONS);
		createEReference(dDomainEClass, DDOMAIN__AGGREGATES);
		createEReference(dDomainEClass, DDOMAIN__APPLICATIONS);
		createEReference(dDomainEClass, DDOMAIN__EVENTS);
		createEReference(dDomainEClass, DDOMAIN__ACTORS);

		dImportEClass = createEClass(DIMPORT);
		createEAttribute(dImportEClass, DIMPORT__IMPORTED_NAMESPACE);

		dFunctionEClass = createEClass(DFUNCTION);
		createEAttribute(dFunctionEClass, DFUNCTION__PARAMETER_NAMES);

		dAggregateEClass = createEClass(DAGGREGATE);
		createEReference(dAggregateEClass, DAGGREGATE__DESCRIPTION);
		createEReference(dAggregateEClass, DAGGREGATE__TYPES);
		createEReference(dAggregateEClass, DAGGREGATE__ROOTS);
		createEAttribute(dAggregateEClass, DAGGREGATE__DERIVED_NAME);

		dTypeEClass = createEClass(DTYPE);
		createEReference(dTypeEClass, DTYPE__CONSTRAINTS);
		createEAttribute(dTypeEClass, DTYPE__PRIMITIVE);

		dConditionEClass = createEClass(DCONDITION);
		createEReference(dConditionEClass, DCONDITION__CONDITION);

		dSimpleTypeEClass = createEClass(DSIMPLE_TYPE);

		dPrimitiveEClass = createEClass(DPRIMITIVE);
		createEReference(dPrimitiveEClass, DPRIMITIVE__REDEFINES);
		createEAttribute(dPrimitiveEClass, DPRIMITIVE__ARCHETYPE);

		dEnumerationEClass = createEClass(DENUMERATION);
		createEReference(dEnumerationEClass, DENUMERATION__LITERALS);

		dLiteralEClass = createEClass(DLITERAL);

		dComplexTypeEClass = createEClass(DCOMPLEX_TYPE);
		createEAttribute(dComplexTypeEClass, DCOMPLEX_TYPE__ABSTRACT);
		createEReference(dComplexTypeEClass, DCOMPLEX_TYPE__FEATURES);
		createEReference(dComplexTypeEClass, DCOMPLEX_TYPE__SUPER_TYPE);

		dIdentityTypeEClass = createEClass(DIDENTITY_TYPE);
		createEAttribute(dIdentityTypeEClass, DIDENTITY_TYPE__ROOT);

		dDetailTypeEClass = createEClass(DDETAIL_TYPE);

		dEntityTypeEClass = createEClass(DENTITY_TYPE);

		dRelationshipEClass = createEClass(DRELATIONSHIP);

		dFeatureEClass = createEClass(DFEATURE);

		dAssociationEClass = createEClass(DASSOCIATION);
		createEAttribute(dAssociationEClass, DASSOCIATION__KIND);
		createEAttribute(dAssociationEClass, DASSOCIATION__DERIVED);
		createEReference(dAssociationEClass, DASSOCIATION__SOURCE_TYPE);
		createEOperation(dAssociationEClass, DASSOCIATION___GET_TARGET_TYPE);

		dMultiplicityEClass = createEClass(DMULTIPLICITY);
		createEAttribute(dMultiplicityEClass, DMULTIPLICITY__MIN_OCCURS);
		createEAttribute(dMultiplicityEClass, DMULTIPLICITY__MAX_OCCURS);

		dAttributeEClass = createEClass(DATTRIBUTE);
		createEAttribute(dAttributeEClass, DATTRIBUTE__DETAIL);
		createEAttribute(dAttributeEClass, DATTRIBUTE__KEY);

		dQueryEClass = createEClass(DQUERY);
		createEReference(dQueryEClass, DQUERY__PARAMETERS);
		createEReference(dQueryEClass, DQUERY__RETURNS);

		dQueryParameterEClass = createEClass(DQUERY_PARAMETER);

		dDomainEventEClass = createEClass(DDOMAIN_EVENT);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__BEFORE);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__AFTER);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__TRIGGER);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__NOTIFICATIONS);
		createEReference(dDomainEventEClass, DDOMAIN_EVENT__CONTEXT);

		dContextEClass = createEClass(DCONTEXT);

		dNotificationEClass = createEClass(DNOTIFICATION);
		createEReference(dNotificationEClass, DNOTIFICATION__NOTIFIED);

		dActorEClass = createEClass(DACTOR);

		dHumanEClass = createEClass(DHUMAN);

		dServiceEClass = createEClass(DSERVICE);
		createEAttribute(dServiceEClass, DSERVICE__KIND);
		createEReference(dServiceEClass, DSERVICE__PARAMETERS);
		createEReference(dServiceEClass, DSERVICE__RAISES);
		createEReference(dServiceEClass, DSERVICE__PRECONDITION);
		createEReference(dServiceEClass, DSERVICE__POSTCONDITION);
		createEReference(dServiceEClass, DSERVICE__TYPES);

		dServiceParameterEClass = createEClass(DSERVICE_PARAMETER);
		createEAttribute(dServiceParameterEClass, DSERVICE_PARAMETER__DIRECTION);

		dTimeEClass = createEClass(DTIME);

		dExistingApplicationEClass = createEClass(DEXISTING_APPLICATION);
		createEReference(dExistingApplicationEClass, DEXISTING_APPLICATION__TYPES);
		createEReference(dExistingApplicationEClass, DEXISTING_APPLICATION__SERVICES);
		createEReference(dExistingApplicationEClass, DEXISTING_APPLICATION__EXCEPTIONS);

		dExceptionEClass = createEClass(DEXCEPTION);

		// Create enums
		dAssociationKindEEnum = createEEnum(DASSOCIATION_KIND);
		dDirectionEEnum = createEEnum(DDIRECTION);
		dServiceKindEEnum = createEEnum(DSERVICE_KIND);
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
		dTypedMemberEClass.getESuperTypes().add(this.getDNamedElement());
		iTypedMemberContainerEClass.getESuperTypes().add(this.getINamespace());
		iPrimaryNavigationTargetEClass.getESuperTypes().add(this.getDNamedElement());
		dTextSegmentEClass.getESuperTypes().add(this.getIRichTextSegment());
		dExpressionEClass.getESuperTypes().add(this.getIRichTextSegment());
		dRichTextEClass.getESuperTypes().add(this.getDExpression());
		dDomainEClass.getESuperTypes().add(this.getDNamedElement());
		dDomainEClass.getESuperTypes().add(this.getINamespace());
		dDomainEClass.getESuperTypes().add(this.getIPrimaryNavigationTarget());
		dFunctionEClass.getESuperTypes().add(this.getDTypedMember());
		dTypeEClass.getESuperTypes().add(this.getDNamedElement());
		dTypeEClass.getESuperTypes().add(this.getIPrimaryNavigationTarget());
		dConditionEClass.getESuperTypes().add(this.getDNamedElement());
		dSimpleTypeEClass.getESuperTypes().add(this.getDType());
		dSimpleTypeEClass.getESuperTypes().add(this.getIValueType());
		dPrimitiveEClass.getESuperTypes().add(this.getDSimpleType());
		dEnumerationEClass.getESuperTypes().add(this.getDSimpleType());
		dEnumerationEClass.getESuperTypes().add(this.getITypedMemberContainer());
		dLiteralEClass.getESuperTypes().add(this.getDTypedMember());
		dComplexTypeEClass.getESuperTypes().add(this.getDType());
		dComplexTypeEClass.getESuperTypes().add(this.getITypedMemberContainer());
		dIdentityTypeEClass.getESuperTypes().add(this.getDComplexType());
		dIdentityTypeEClass.getESuperTypes().add(this.getIIdentityType());
		dDetailTypeEClass.getESuperTypes().add(this.getDComplexType());
		dDetailTypeEClass.getESuperTypes().add(this.getIValueType());
		dEntityTypeEClass.getESuperTypes().add(this.getDIdentityType());
		dRelationshipEClass.getESuperTypes().add(this.getDIdentityType());
		dFeatureEClass.getESuperTypes().add(this.getDTypedMember());
		dAssociationEClass.getESuperTypes().add(this.getDFeature());
		dAttributeEClass.getESuperTypes().add(this.getDFeature());
		dQueryEClass.getESuperTypes().add(this.getDFeature());
		dQueryEClass.getESuperTypes().add(this.getITypedMemberContainer());
		dQueryParameterEClass.getESuperTypes().add(this.getDTypedMember());
		dDomainEventEClass.getESuperTypes().add(this.getDNamedElement());
		dDomainEventEClass.getESuperTypes().add(this.getITypedMemberContainer());
		dDomainEventEClass.getESuperTypes().add(this.getIPrimaryNavigationTarget());
		dContextEClass.getESuperTypes().add(this.getDTypedMember());
		dNotificationEClass.getESuperTypes().add(this.getDTypedMember());
		dActorEClass.getESuperTypes().add(this.getDNamedElement());
		dActorEClass.getESuperTypes().add(this.getIPrimaryNavigationTarget());
		dHumanEClass.getESuperTypes().add(this.getDActor());
		dServiceEClass.getESuperTypes().add(this.getDActor());
		dServiceEClass.getESuperTypes().add(this.getITypedMemberContainer());
		dServiceEClass.getESuperTypes().add(this.getIPrimaryNavigationTarget());
		dServiceParameterEClass.getESuperTypes().add(this.getDTypedMember());
		dTimeEClass.getESuperTypes().add(this.getDActor());
		dExistingApplicationEClass.getESuperTypes().add(this.getDNamedElement());
		dExistingApplicationEClass.getESuperTypes().add(this.getINamespace());
		dExistingApplicationEClass.getESuperTypes().add(this.getIPrimaryNavigationTarget());
		dExceptionEClass.getESuperTypes().add(this.getDNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(iIdentityTypeEClass, IIdentityType.class, "IIdentityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iValueTypeEClass, IValueType.class, "IValueType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iNamespaceEClass, INamespace.class, "INamespace", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dNamedElementEClass, DNamedElement.class, "DNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNamedElement_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNamedElement_Description(), this.getDRichText(), null, "description", null, 0, 1, DNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTypedMemberEClass, DTypedMember.class, "DTypedMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTypedMember_Type(), this.getDType(), null, "type", null, 0, 1, DTypedMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTypedMember_Multiplicity(), this.getDMultiplicity(), null, "multiplicity", null, 0, 1, DTypedMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTypedMember_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, DTypedMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDTypedMember_Collection(), ecorePackage.getEBoolean(), "collection", null, 0, 1, DTypedMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(iTypedMemberContainerEClass, ITypedMemberContainer.class, "ITypedMemberContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iPrimaryNavigationTargetEClass, IPrimaryNavigationTarget.class, "IPrimaryNavigationTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iRichTextSegmentEClass, IRichTextSegment.class, "IRichTextSegment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dTextSegmentEClass, DTextSegment.class, "DTextSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTextSegment_Value(), ecorePackage.getEString(), "value", null, 0, 1, DTextSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dExpressionEClass, DExpression.class, "DExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dRichTextEClass, DRichText.class, "DRichText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDRichText_Segments(), this.getIRichTextSegment(), null, "segments", null, 0, -1, DRichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDomainEClass, DDomain.class, "DDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDomain_Imports(), this.getDImport(), null, "imports", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomain_Types(), this.getDType(), null, "types", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomain_Functions(), this.getDFunction(), null, "functions", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomain_Aggregates(), this.getDAggregate(), null, "aggregates", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomain_Applications(), this.getDExistingApplication(), null, "applications", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomain_Events(), this.getDDomainEvent(), null, "events", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomain_Actors(), this.getDActor(), null, "actors", null, 0, -1, DDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dImportEClass, DImport.class, "DImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, DImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFunctionEClass, DFunction.class, "DFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDFunction_ParameterNames(), ecorePackage.getEString(), "parameterNames", null, 0, -1, DFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAggregateEClass, DAggregate.class, "DAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAggregate_Description(), this.getDRichText(), null, "description", null, 0, 1, DAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAggregate_Types(), this.getDType(), null, "types", null, 0, -1, DAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAggregate_Roots(), this.getDIdentityType(), null, "roots", null, 0, -1, DAggregate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDAggregate_DerivedName(), ecorePackage.getEString(), "derivedName", null, 0, 1, DAggregate.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dTypeEClass, DType.class, "DType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDType_Constraints(), this.getDCondition(), null, "constraints", null, 0, -1, DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDType_Primitive(), ecorePackage.getEBoolean(), "primitive", "true", 0, 1, DType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dConditionEClass, DCondition.class, "DCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDCondition_Condition(), this.getDExpression(), null, "condition", null, 0, 1, DCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSimpleTypeEClass, DSimpleType.class, "DSimpleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dPrimitiveEClass, DPrimitive.class, "DPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDPrimitive_Redefines(), this.getDPrimitive(), null, "redefines", null, 0, 1, DPrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDPrimitive_Archetype(), ecorePackage.getEBoolean(), "archetype", null, 0, 1, DPrimitive.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dEnumerationEClass, DEnumeration.class, "DEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEnumeration_Literals(), this.getDLiteral(), null, "literals", null, 0, -1, DEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dLiteralEClass, DLiteral.class, "DLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dComplexTypeEClass, DComplexType.class, "DComplexType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDComplexType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, DComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDComplexType_Features(), this.getDFeature(), null, "features", null, 0, -1, DComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDComplexType_SuperType(), this.getDComplexType(), null, "superType", null, 0, 1, DComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dIdentityTypeEClass, DIdentityType.class, "DIdentityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDIdentityType_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, DIdentityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDetailTypeEClass, DDetailType.class, "DDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dEntityTypeEClass, DEntityType.class, "DEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dRelationshipEClass, DRelationship.class, "DRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dFeatureEClass, DFeature.class, "DFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dAssociationEClass, DAssociation.class, "DAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAssociation_Kind(), this.getDAssociationKind(), "kind", null, 0, 1, DAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAssociation_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, DAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAssociation_SourceType(), this.getDComplexType(), null, "sourceType", null, 1, 1, DAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getDAssociation__GetTargetType(), this.getDEntityType(), "getTargetType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dMultiplicityEClass, DMultiplicity.class, "DMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMultiplicity_MinOccurs(), ecorePackage.getEInt(), "minOccurs", null, 0, 1, DMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMultiplicity_MaxOccurs(), ecorePackage.getEInt(), "maxOccurs", null, 0, 1, DMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAttributeEClass, DAttribute.class, "DAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDAttribute_Detail(), ecorePackage.getEBoolean(), "detail", null, 0, 1, DAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAttribute_Key(), ecorePackage.getEBoolean(), "key", null, 0, 1, DAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dQueryEClass, DQuery.class, "DQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDQuery_Parameters(), this.getDQueryParameter(), null, "parameters", null, 0, -1, DQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDQuery_Returns(), this.getDExpression(), null, "returns", null, 0, 1, DQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dQueryParameterEClass, DQueryParameter.class, "DQueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dDomainEventEClass, DDomainEvent.class, "DDomainEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDDomainEvent_Before(), this.getDCondition(), null, "before", null, 0, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_After(), this.getDCondition(), null, "after", null, 0, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_Trigger(), this.getDActor(), null, "trigger", null, 1, 1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_Notifications(), this.getDNotification(), null, "notifications", null, 0, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDDomainEvent_Context(), this.getDContext(), null, "context", null, 1, -1, DDomainEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dContextEClass, DContext.class, "DContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dNotificationEClass, DNotification.class, "DNotification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNotification_Notified(), this.getDActor(), null, "notified", null, 1, 1, DNotification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dActorEClass, DActor.class, "DActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dHumanEClass, DHuman.class, "DHuman", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dServiceEClass, DService.class, "DService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDService_Kind(), this.getDServiceKind(), "kind", null, 0, 1, DService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDService_Parameters(), this.getDServiceParameter(), null, "parameters", null, 0, -1, DService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDService_Raises(), this.getDException(), null, "raises", null, 0, -1, DService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDService_Precondition(), this.getDExpression(), null, "precondition", null, 0, 1, DService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDService_Postcondition(), this.getDExpression(), null, "postcondition", null, 0, 1, DService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDService_Types(), this.getDType(), null, "types", null, 0, -1, DService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dServiceParameterEClass, DServiceParameter.class, "DServiceParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDServiceParameter_Direction(), this.getDDirection(), "direction", null, 0, 1, DServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dTimeEClass, DTime.class, "DTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dExistingApplicationEClass, DExistingApplication.class, "DExistingApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDExistingApplication_Types(), this.getDType(), null, "types", null, 0, -1, DExistingApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDExistingApplication_Services(), this.getDService(), null, "services", null, 0, -1, DExistingApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDExistingApplication_Exceptions(), this.getDException(), null, "exceptions", null, 0, -1, DExistingApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dExceptionEClass, DException.class, "DException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dAssociationKindEEnum, DAssociationKind.class, "DAssociationKind");
		addEEnumLiteral(dAssociationKindEEnum, DAssociationKind.REFERENCE);
		addEEnumLiteral(dAssociationKindEEnum, DAssociationKind.COMPOSITE);
		addEEnumLiteral(dAssociationKindEEnum, DAssociationKind.INVERSE_COMPOSITE);

		initEEnum(dDirectionEEnum, DDirection.class, "DDirection");
		addEEnumLiteral(dDirectionEEnum, DDirection.INBOUND);
		addEEnumLiteral(dDirectionEEnum, DDirection.OUTBOUND);

		initEEnum(dServiceKindEEnum, DServiceKind.class, "DServiceKind");
		addEEnumLiteral(dServiceKindEEnum, DServiceKind.SYNCHRONOUS);
		addEEnumLiteral(dServiceKindEEnum, DServiceKind.ASYNCHRONOUS);

		// Create resource
		createResource(eNS_URI);
	}

} //BasePackageImpl
