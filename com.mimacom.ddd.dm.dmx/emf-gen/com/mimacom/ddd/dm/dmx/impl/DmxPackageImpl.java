/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxConstructorCall;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxDateLiteral;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxFactory;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxRaiseExpression;
import com.mimacom.ddd.dm.dmx.DmxReturnExpression;
import com.mimacom.ddd.dm.dmx.DmxSelfExpression;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperator;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;

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
public class DmxPackageImpl extends EPackageImpl implements DmxPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxBaseTypeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxArchetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFilterTypeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFilterParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxPredicateWithCorrelationVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxMemberNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxCallArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxInstanceOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxUnaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxCastExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxSelfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxReturnExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxRaiseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxStaticReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxContextReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxIfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxBooleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxNaturalLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxDecimalLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxDateLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxUndefinedLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dmxBaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dmxBinaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dmxUnaryOperatorEEnum = null;

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
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmxPackageImpl()
	{
		super(eNS_URI, DmxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DmxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DmxPackage init()
	{
		if (isInited) return (DmxPackage)EPackage.Registry.INSTANCE.getEPackage(DmxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDmxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DmxPackageImpl theDmxPackage = registeredDmxPackage instanceof DmxPackageImpl ? (DmxPackageImpl)registeredDmxPackage : new DmxPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDmxPackage.createPackageContents();

		// Initialize created meta-data
		theDmxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DmxPackage.eNS_URI, theDmxPackage);
		return theDmxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxNamespace()
	{
		return dmxNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxNamespace_Imports()
	{
		return (EReference)dmxNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxNamespace_Filters()
	{
		return (EReference)dmxNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxNamespace_Tests()
	{
		return (EReference)dmxNamespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxTest()
	{
		return dmxTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxTest_Name()
	{
		return (EAttribute)dmxTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxTest_Context()
	{
		return (EReference)dmxTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxTest_Expr()
	{
		return (EReference)dmxTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxBaseTypeSet()
	{
		return dmxBaseTypeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxBaseTypeSet_Name()
	{
		return (EAttribute)dmxBaseTypeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxBaseTypeSet_Members()
	{
		return (EAttribute)dmxBaseTypeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxArchetype()
	{
		return dmxArchetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxArchetype_BaseType()
	{
		return (EAttribute)dmxArchetypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxFilter()
	{
		return dmxFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFilter_Parameters()
	{
		return (EReference)dmxFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFilter_TypeDesc()
	{
		return (EReference)dmxFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFilter_WithTypeSet()
	{
		return (EReference)dmxFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxFilterTypeDescriptor()
	{
		return dmxFilterTypeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxFilterTypeDescriptor_Single()
	{
		return (EAttribute)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFilterTypeDescriptor_Multiple()
	{
		return (EReference)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxFilterTypeDescriptor_Collection()
	{
		return (EAttribute)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxFilterTypeDescriptor_MultiTyped()
	{
		return (EAttribute)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType_boolean()
	{
		return dmxFilterTypeDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType()
	{
		return dmxFilterTypeDescriptorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxFilterParameter()
	{
		return dmxFilterParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxFilterParameter_Name()
	{
		return (EAttribute)dmxFilterParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFilterParameter_TypeDesc()
	{
		return (EReference)dmxFilterParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxAssignment()
	{
		return dmxAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxAssignment_PrecedingNavigationSegment()
	{
		return (EReference)dmxAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxAssignment_AssignToMember()
	{
		return (EReference)dmxAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxAssignment_Value()
	{
		return (EReference)dmxAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxPredicateWithCorrelationVariable()
	{
		return dmxPredicateWithCorrelationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxPredicateWithCorrelationVariable_CorrelationVariable()
	{
		return (EReference)dmxPredicateWithCorrelationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxPredicateWithCorrelationVariable_Predicate()
	{
		return (EReference)dmxPredicateWithCorrelationVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxMemberNavigation()
	{
		return dmxMemberNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxMemberNavigation_Member()
	{
		return (EReference)dmxMemberNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxMemberNavigation_PrecedingNavigationSegment()
	{
		return (EReference)dmxMemberNavigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxMemberNavigation_ExplicitOperationCall()
	{
		return (EAttribute)dmxMemberNavigationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxMemberNavigation_CallArguments()
	{
		return (EReference)dmxMemberNavigationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxMemberNavigation_Before()
	{
		return (EAttribute)dmxMemberNavigationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxCallArguments()
	{
		return dmxCallArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxCallArguments_Arguments()
	{
		return (EReference)dmxCallArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxFunctionCall()
	{
		return dmxFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFunctionCall_Function()
	{
		return (EReference)dmxFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxFunctionCall_CallArguments()
	{
		return (EReference)dmxFunctionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxConstructorCall()
	{
		return dmxConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxConstructorCall_Constructor()
	{
		return (EReference)dmxConstructorCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxConstructorCall_ExplicitConstructorCall()
	{
		return (EAttribute)dmxConstructorCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxConstructorCall_CallArguments()
	{
		return (EReference)dmxConstructorCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxBinaryOperation()
	{
		return dmxBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxBinaryOperation_LeftOperand()
	{
		return (EReference)dmxBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxBinaryOperation_Operator()
	{
		return (EAttribute)dmxBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxBinaryOperation_RightOperand()
	{
		return (EReference)dmxBinaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxInstanceOfExpression()
	{
		return dmxInstanceOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxInstanceOfExpression_Expression()
	{
		return (EReference)dmxInstanceOfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxInstanceOfExpression_Type()
	{
		return (EReference)dmxInstanceOfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxUnaryOperation()
	{
		return dmxUnaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxUnaryOperation_Operand()
	{
		return (EReference)dmxUnaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxUnaryOperation_Operator()
	{
		return (EAttribute)dmxUnaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxCastExpression()
	{
		return dmxCastExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxCastExpression_Target()
	{
		return (EReference)dmxCastExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxCastExpression_Type()
	{
		return (EReference)dmxCastExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxSelfExpression()
	{
		return dmxSelfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxReturnExpression()
	{
		return dmxReturnExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxReturnExpression_Expression()
	{
		return (EReference)dmxReturnExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxRaiseExpression()
	{
		return dmxRaiseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxRaiseExpression_Expression()
	{
		return (EReference)dmxRaiseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxStaticReference()
	{
		return dmxStaticReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxStaticReference_Target()
	{
		return (EReference)dmxStaticReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxStaticReference_Member()
	{
		return (EReference)dmxStaticReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxStaticReference_DisplayName()
	{
		return (EAttribute)dmxStaticReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxStaticReference_Plural()
	{
		return (EAttribute)dmxStaticReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxContextReference()
	{
		return dmxContextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxContextReference_Target()
	{
		return (EReference)dmxContextReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxContextReference_All()
	{
		return (EAttribute)dmxContextReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxContextReference_Before()
	{
		return (EAttribute)dmxContextReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxIfExpression()
	{
		return dmxIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxIfExpression_If()
	{
		return (EReference)dmxIfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxIfExpression_Then()
	{
		return (EReference)dmxIfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxIfExpression_Else()
	{
		return (EReference)dmxIfExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxBooleanLiteral()
	{
		return dmxBooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxBooleanLiteral_Value()
	{
		return (EAttribute)dmxBooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxStringLiteral()
	{
		return dmxStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxStringLiteral_Value()
	{
		return (EAttribute)dmxStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxNaturalLiteral()
	{
		return dmxNaturalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxNaturalLiteral_Value()
	{
		return (EAttribute)dmxNaturalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxDecimalLiteral()
	{
		return dmxDecimalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxDecimalLiteral_Value()
	{
		return (EAttribute)dmxDecimalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxDateLiteral()
	{
		return dmxDateLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDmxDateLiteral_Value()
	{
		return (EAttribute)dmxDateLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDmxUndefinedLiteral()
	{
		return dmxUndefinedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDmxBaseType()
	{
		return dmxBaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDmxBinaryOperator()
	{
		return dmxBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDmxUnaryOperator()
	{
		return dmxUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DmxFactory getDmxFactory()
	{
		return (DmxFactory)getEFactoryInstance();
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
		dmxNamespaceEClass = createEClass(DMX_NAMESPACE);
		createEReference(dmxNamespaceEClass, DMX_NAMESPACE__IMPORTS);
		createEReference(dmxNamespaceEClass, DMX_NAMESPACE__FILTERS);
		createEReference(dmxNamespaceEClass, DMX_NAMESPACE__TESTS);

		dmxTestEClass = createEClass(DMX_TEST);
		createEAttribute(dmxTestEClass, DMX_TEST__NAME);
		createEReference(dmxTestEClass, DMX_TEST__CONTEXT);
		createEReference(dmxTestEClass, DMX_TEST__EXPR);

		dmxBaseTypeSetEClass = createEClass(DMX_BASE_TYPE_SET);
		createEAttribute(dmxBaseTypeSetEClass, DMX_BASE_TYPE_SET__NAME);
		createEAttribute(dmxBaseTypeSetEClass, DMX_BASE_TYPE_SET__MEMBERS);

		dmxArchetypeEClass = createEClass(DMX_ARCHETYPE);
		createEAttribute(dmxArchetypeEClass, DMX_ARCHETYPE__BASE_TYPE);

		dmxFilterEClass = createEClass(DMX_FILTER);
		createEReference(dmxFilterEClass, DMX_FILTER__PARAMETERS);
		createEReference(dmxFilterEClass, DMX_FILTER__TYPE_DESC);
		createEReference(dmxFilterEClass, DMX_FILTER__WITH_TYPE_SET);

		dmxFilterTypeDescriptorEClass = createEClass(DMX_FILTER_TYPE_DESCRIPTOR);
		createEAttribute(dmxFilterTypeDescriptorEClass, DMX_FILTER_TYPE_DESCRIPTOR__SINGLE);
		createEReference(dmxFilterTypeDescriptorEClass, DMX_FILTER_TYPE_DESCRIPTOR__MULTIPLE);
		createEAttribute(dmxFilterTypeDescriptorEClass, DMX_FILTER_TYPE_DESCRIPTOR__COLLECTION);
		createEAttribute(dmxFilterTypeDescriptorEClass, DMX_FILTER_TYPE_DESCRIPTOR__MULTI_TYPED);
		createEOperation(dmxFilterTypeDescriptorEClass, DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE_BOOLEAN);
		createEOperation(dmxFilterTypeDescriptorEClass, DMX_FILTER_TYPE_DESCRIPTOR___IS_COMPATIBLE__DMXBASETYPE);

		dmxFilterParameterEClass = createEClass(DMX_FILTER_PARAMETER);
		createEAttribute(dmxFilterParameterEClass, DMX_FILTER_PARAMETER__NAME);
		createEReference(dmxFilterParameterEClass, DMX_FILTER_PARAMETER__TYPE_DESC);

		dmxAssignmentEClass = createEClass(DMX_ASSIGNMENT);
		createEReference(dmxAssignmentEClass, DMX_ASSIGNMENT__PRECEDING_NAVIGATION_SEGMENT);
		createEReference(dmxAssignmentEClass, DMX_ASSIGNMENT__ASSIGN_TO_MEMBER);
		createEReference(dmxAssignmentEClass, DMX_ASSIGNMENT__VALUE);

		dmxPredicateWithCorrelationVariableEClass = createEClass(DMX_PREDICATE_WITH_CORRELATION_VARIABLE);
		createEReference(dmxPredicateWithCorrelationVariableEClass, DMX_PREDICATE_WITH_CORRELATION_VARIABLE__CORRELATION_VARIABLE);
		createEReference(dmxPredicateWithCorrelationVariableEClass, DMX_PREDICATE_WITH_CORRELATION_VARIABLE__PREDICATE);

		dmxMemberNavigationEClass = createEClass(DMX_MEMBER_NAVIGATION);
		createEReference(dmxMemberNavigationEClass, DMX_MEMBER_NAVIGATION__MEMBER);
		createEReference(dmxMemberNavigationEClass, DMX_MEMBER_NAVIGATION__PRECEDING_NAVIGATION_SEGMENT);
		createEAttribute(dmxMemberNavigationEClass, DMX_MEMBER_NAVIGATION__EXPLICIT_OPERATION_CALL);
		createEReference(dmxMemberNavigationEClass, DMX_MEMBER_NAVIGATION__CALL_ARGUMENTS);
		createEAttribute(dmxMemberNavigationEClass, DMX_MEMBER_NAVIGATION__BEFORE);

		dmxCallArgumentsEClass = createEClass(DMX_CALL_ARGUMENTS);
		createEReference(dmxCallArgumentsEClass, DMX_CALL_ARGUMENTS__ARGUMENTS);

		dmxFunctionCallEClass = createEClass(DMX_FUNCTION_CALL);
		createEReference(dmxFunctionCallEClass, DMX_FUNCTION_CALL__FUNCTION);
		createEReference(dmxFunctionCallEClass, DMX_FUNCTION_CALL__CALL_ARGUMENTS);

		dmxConstructorCallEClass = createEClass(DMX_CONSTRUCTOR_CALL);
		createEReference(dmxConstructorCallEClass, DMX_CONSTRUCTOR_CALL__CONSTRUCTOR);
		createEAttribute(dmxConstructorCallEClass, DMX_CONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL);
		createEReference(dmxConstructorCallEClass, DMX_CONSTRUCTOR_CALL__CALL_ARGUMENTS);

		dmxBinaryOperationEClass = createEClass(DMX_BINARY_OPERATION);
		createEReference(dmxBinaryOperationEClass, DMX_BINARY_OPERATION__LEFT_OPERAND);
		createEAttribute(dmxBinaryOperationEClass, DMX_BINARY_OPERATION__OPERATOR);
		createEReference(dmxBinaryOperationEClass, DMX_BINARY_OPERATION__RIGHT_OPERAND);

		dmxInstanceOfExpressionEClass = createEClass(DMX_INSTANCE_OF_EXPRESSION);
		createEReference(dmxInstanceOfExpressionEClass, DMX_INSTANCE_OF_EXPRESSION__EXPRESSION);
		createEReference(dmxInstanceOfExpressionEClass, DMX_INSTANCE_OF_EXPRESSION__TYPE);

		dmxUnaryOperationEClass = createEClass(DMX_UNARY_OPERATION);
		createEReference(dmxUnaryOperationEClass, DMX_UNARY_OPERATION__OPERAND);
		createEAttribute(dmxUnaryOperationEClass, DMX_UNARY_OPERATION__OPERATOR);

		dmxCastExpressionEClass = createEClass(DMX_CAST_EXPRESSION);
		createEReference(dmxCastExpressionEClass, DMX_CAST_EXPRESSION__TARGET);
		createEReference(dmxCastExpressionEClass, DMX_CAST_EXPRESSION__TYPE);

		dmxSelfExpressionEClass = createEClass(DMX_SELF_EXPRESSION);

		dmxReturnExpressionEClass = createEClass(DMX_RETURN_EXPRESSION);
		createEReference(dmxReturnExpressionEClass, DMX_RETURN_EXPRESSION__EXPRESSION);

		dmxRaiseExpressionEClass = createEClass(DMX_RAISE_EXPRESSION);
		createEReference(dmxRaiseExpressionEClass, DMX_RAISE_EXPRESSION__EXPRESSION);

		dmxStaticReferenceEClass = createEClass(DMX_STATIC_REFERENCE);
		createEReference(dmxStaticReferenceEClass, DMX_STATIC_REFERENCE__TARGET);
		createEReference(dmxStaticReferenceEClass, DMX_STATIC_REFERENCE__MEMBER);
		createEAttribute(dmxStaticReferenceEClass, DMX_STATIC_REFERENCE__DISPLAY_NAME);
		createEAttribute(dmxStaticReferenceEClass, DMX_STATIC_REFERENCE__PLURAL);

		dmxContextReferenceEClass = createEClass(DMX_CONTEXT_REFERENCE);
		createEReference(dmxContextReferenceEClass, DMX_CONTEXT_REFERENCE__TARGET);
		createEAttribute(dmxContextReferenceEClass, DMX_CONTEXT_REFERENCE__ALL);
		createEAttribute(dmxContextReferenceEClass, DMX_CONTEXT_REFERENCE__BEFORE);

		dmxIfExpressionEClass = createEClass(DMX_IF_EXPRESSION);
		createEReference(dmxIfExpressionEClass, DMX_IF_EXPRESSION__IF);
		createEReference(dmxIfExpressionEClass, DMX_IF_EXPRESSION__THEN);
		createEReference(dmxIfExpressionEClass, DMX_IF_EXPRESSION__ELSE);

		dmxBooleanLiteralEClass = createEClass(DMX_BOOLEAN_LITERAL);
		createEAttribute(dmxBooleanLiteralEClass, DMX_BOOLEAN_LITERAL__VALUE);

		dmxStringLiteralEClass = createEClass(DMX_STRING_LITERAL);
		createEAttribute(dmxStringLiteralEClass, DMX_STRING_LITERAL__VALUE);

		dmxNaturalLiteralEClass = createEClass(DMX_NATURAL_LITERAL);
		createEAttribute(dmxNaturalLiteralEClass, DMX_NATURAL_LITERAL__VALUE);

		dmxDecimalLiteralEClass = createEClass(DMX_DECIMAL_LITERAL);
		createEAttribute(dmxDecimalLiteralEClass, DMX_DECIMAL_LITERAL__VALUE);

		dmxDateLiteralEClass = createEClass(DMX_DATE_LITERAL);
		createEAttribute(dmxDateLiteralEClass, DMX_DATE_LITERAL__VALUE);

		dmxUndefinedLiteralEClass = createEClass(DMX_UNDEFINED_LITERAL);

		// Create enums
		dmxBaseTypeEEnum = createEEnum(DMX_BASE_TYPE);
		dmxBinaryOperatorEEnum = createEEnum(DMX_BINARY_OPERATOR);
		dmxUnaryOperatorEEnum = createEEnum(DMX_UNARY_OPERATOR);
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
		dmxNamespaceEClass.getESuperTypes().add(theBasePackage.getDNamedElement());
		dmxNamespaceEClass.getESuperTypes().add(theBasePackage.getITypeContainer());
		dmxTestEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dmxArchetypeEClass.getESuperTypes().add(theBasePackage.getDPrimitive());
		dmxFilterEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		dmxAssignmentEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxPredicateWithCorrelationVariableEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxPredicateWithCorrelationVariableEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dmxMemberNavigationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxFunctionCallEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxConstructorCallEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxBinaryOperationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxInstanceOfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxUnaryOperationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxCastExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxSelfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxReturnExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxRaiseExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxStaticReferenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxContextReferenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxIfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxBooleanLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxStringLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxNaturalLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxDecimalLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxDateLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxUndefinedLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmxNamespaceEClass, DmxNamespace.class, "DmxNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxNamespace_Imports(), theBasePackage.getDImport(), null, "imports", null, 0, -1, DmxNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxNamespace_Filters(), this.getDmxFilter(), null, "filters", null, 0, -1, DmxNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxNamespace_Tests(), this.getDmxTest(), null, "tests", null, 0, -1, DmxNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxTestEClass, DmxTest.class, "DmxTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxTest_Name(), ecorePackage.getEString(), "name", null, 0, 1, DmxTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxTest_Context(), theBasePackage.getDContext(), null, "context", null, 0, -1, DmxTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxTest_Expr(), theBasePackage.getDExpression(), null, "expr", null, 0, 1, DmxTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxBaseTypeSetEClass, DmxBaseTypeSet.class, "DmxBaseTypeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxBaseTypeSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, DmxBaseTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxBaseTypeSet_Members(), this.getDmxBaseType(), "members", null, 0, -1, DmxBaseTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxArchetypeEClass, DmxArchetype.class, "DmxArchetype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxArchetype_BaseType(), this.getDmxBaseType(), "baseType", null, 0, 1, DmxArchetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFilterEClass, DmxFilter.class, "DmxFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxFilter_Parameters(), this.getDmxFilterParameter(), null, "parameters", null, 0, -1, DmxFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxFilter_TypeDesc(), this.getDmxFilterTypeDescriptor(), null, "typeDesc", null, 0, 1, DmxFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxFilter_WithTypeSet(), this.getDmxBaseTypeSet(), null, "withTypeSet", null, 0, 1, DmxFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFilterTypeDescriptorEClass, DmxFilterTypeDescriptor.class, "DmxFilterTypeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxFilterTypeDescriptor_Single(), this.getDmxBaseType(), "single", null, 0, 1, DmxFilterTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxFilterTypeDescriptor_Multiple(), this.getDmxBaseTypeSet(), null, "multiple", null, 0, 1, DmxFilterTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxFilterTypeDescriptor_Collection(), ecorePackage.getEBoolean(), "collection", null, 0, 1, DmxFilterTypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxFilterTypeDescriptor_MultiTyped(), ecorePackage.getEBoolean(), "multiTyped", null, 0, 1, DmxFilterTypeDescriptor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType_boolean(), ecorePackage.getEBoolean(), "isCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDmxBaseType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "collection", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType(), ecorePackage.getEBoolean(), "isCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDmxBaseType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dmxFilterParameterEClass, DmxFilterParameter.class, "DmxFilterParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxFilterParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, DmxFilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxFilterParameter_TypeDesc(), this.getDmxFilterTypeDescriptor(), null, "typeDesc", null, 0, 1, DmxFilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxAssignmentEClass, DmxAssignment.class, "DmxAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxAssignment_PrecedingNavigationSegment(), theBasePackage.getDExpression(), null, "precedingNavigationSegment", null, 0, 1, DmxAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxAssignment_AssignToMember(), theBasePackage.getDNavigableMember(), null, "assignToMember", null, 0, 1, DmxAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxAssignment_Value(), theBasePackage.getDExpression(), null, "value", null, 0, 1, DmxAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxPredicateWithCorrelationVariableEClass, DmxPredicateWithCorrelationVariable.class, "DmxPredicateWithCorrelationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxPredicateWithCorrelationVariable_CorrelationVariable(), theBasePackage.getDContext(), null, "correlationVariable", null, 0, 1, DmxPredicateWithCorrelationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxPredicateWithCorrelationVariable_Predicate(), theBasePackage.getDExpression(), null, "predicate", null, 0, 1, DmxPredicateWithCorrelationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxMemberNavigationEClass, DmxMemberNavigation.class, "DmxMemberNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxMemberNavigation_Member(), theBasePackage.getDNavigableMember(), null, "member", null, 0, 1, DmxMemberNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxMemberNavigation_PrecedingNavigationSegment(), theBasePackage.getDExpression(), null, "precedingNavigationSegment", null, 0, 1, DmxMemberNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxMemberNavigation_ExplicitOperationCall(), ecorePackage.getEBoolean(), "explicitOperationCall", null, 0, 1, DmxMemberNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxMemberNavigation_CallArguments(), this.getDmxCallArguments(), null, "callArguments", null, 0, 1, DmxMemberNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxMemberNavigation_Before(), ecorePackage.getEBoolean(), "before", null, 0, 1, DmxMemberNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxCallArgumentsEClass, DmxCallArguments.class, "DmxCallArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxCallArguments_Arguments(), theBasePackage.getDExpression(), null, "arguments", null, 0, -1, DmxCallArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFunctionCallEClass, DmxFunctionCall.class, "DmxFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxFunctionCall_Function(), this.getDmxFilter(), null, "function", null, 0, 1, DmxFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxFunctionCall_CallArguments(), this.getDmxCallArguments(), null, "callArguments", null, 0, 1, DmxFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxConstructorCallEClass, DmxConstructorCall.class, "DmxConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxConstructorCall_Constructor(), theBasePackage.getDComplexType(), null, "constructor", null, 0, 1, DmxConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxConstructorCall_ExplicitConstructorCall(), ecorePackage.getEBoolean(), "explicitConstructorCall", null, 0, 1, DmxConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxConstructorCall_CallArguments(), this.getDmxCallArguments(), null, "callArguments", null, 0, 1, DmxConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxBinaryOperationEClass, DmxBinaryOperation.class, "DmxBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxBinaryOperation_LeftOperand(), theBasePackage.getDExpression(), null, "leftOperand", null, 0, 1, DmxBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxBinaryOperation_Operator(), this.getDmxBinaryOperator(), "operator", null, 0, 1, DmxBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxBinaryOperation_RightOperand(), theBasePackage.getDExpression(), null, "rightOperand", null, 0, 1, DmxBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxInstanceOfExpressionEClass, DmxInstanceOfExpression.class, "DmxInstanceOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxInstanceOfExpression_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DmxInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxInstanceOfExpression_Type(), theBasePackage.getDType(), null, "type", null, 0, 1, DmxInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxUnaryOperationEClass, DmxUnaryOperation.class, "DmxUnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxUnaryOperation_Operand(), theBasePackage.getDExpression(), null, "operand", null, 0, 1, DmxUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxUnaryOperation_Operator(), this.getDmxUnaryOperator(), "operator", null, 0, 1, DmxUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxCastExpressionEClass, DmxCastExpression.class, "DmxCastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxCastExpression_Target(), theBasePackage.getDExpression(), null, "target", null, 0, 1, DmxCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxCastExpression_Type(), theBasePackage.getDType(), null, "type", null, 0, 1, DmxCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxSelfExpressionEClass, DmxSelfExpression.class, "DmxSelfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmxReturnExpressionEClass, DmxReturnExpression.class, "DmxReturnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxReturnExpression_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DmxReturnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxRaiseExpressionEClass, DmxRaiseExpression.class, "DmxRaiseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxRaiseExpression_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DmxRaiseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxStaticReferenceEClass, DmxStaticReference.class, "DmxStaticReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxStaticReference_Target(), theBasePackage.getIStaticReferenceTarget(), null, "target", null, 0, 1, DmxStaticReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxStaticReference_Member(), theBasePackage.getDNavigableMember(), null, "member", null, 0, 1, DmxStaticReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxStaticReference_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DmxStaticReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxStaticReference_Plural(), ecorePackage.getEBoolean(), "plural", null, 0, 1, DmxStaticReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxContextReferenceEClass, DmxContextReference.class, "DmxContextReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxContextReference_Target(), theBasePackage.getDNamedElement(), null, "target", null, 0, 1, DmxContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxContextReference_All(), ecorePackage.getEBoolean(), "all", null, 0, 1, DmxContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxContextReference_Before(), ecorePackage.getEBoolean(), "before", null, 0, 1, DmxContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxIfExpressionEClass, DmxIfExpression.class, "DmxIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxIfExpression_If(), theBasePackage.getDExpression(), null, "if", null, 0, 1, DmxIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxIfExpression_Then(), theBasePackage.getDExpression(), null, "then", null, 0, 1, DmxIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxIfExpression_Else(), theBasePackage.getDExpression(), null, "else", null, 0, 1, DmxIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxBooleanLiteralEClass, DmxBooleanLiteral.class, "DmxBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, DmxBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxStringLiteralEClass, DmxStringLiteral.class, "DmxStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, DmxStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxNaturalLiteralEClass, DmxNaturalLiteral.class, "DmxNaturalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxNaturalLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, DmxNaturalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxDecimalLiteralEClass, DmxDecimalLiteral.class, "DmxDecimalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxDecimalLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, DmxDecimalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxDateLiteralEClass, DmxDateLiteral.class, "DmxDateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxDateLiteral_Value(), ecorePackage.getEDate(), "value", null, 0, 1, DmxDateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxUndefinedLiteralEClass, DmxUndefinedLiteral.class, "DmxUndefinedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dmxBaseTypeEEnum, DmxBaseType.class, "DmxBaseType");
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.UNDEFINED);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.VOID);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.BOOLEAN);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.NUMBER);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.TEXT);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.IDENTIFIER);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.TIMEPOINT);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.ENUM);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.COMPLEX);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.AGGREGATE);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.NOTIFICATION);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.SERVICE);

		initEEnum(dmxBinaryOperatorEEnum, DmxBinaryOperator.class, "DmxBinaryOperator");
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.ADD);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.SUBTRACT);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.MULTIPLY);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.DIVIDE);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.POWER);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.MODULO);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.AND);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.OR);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.XOR);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.EQUAL);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.NOT_EQUAL);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.LESS);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.LESS_OR_EQUAL);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.GREATER);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.UNTIL);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.SINGLE_ARROW);
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.DOUBLE_ARROW);

		initEEnum(dmxUnaryOperatorEEnum, DmxUnaryOperator.class, "DmxUnaryOperator");
		addEEnumLiteral(dmxUnaryOperatorEEnum, DmxUnaryOperator.PLUS);
		addEEnumLiteral(dmxUnaryOperatorEEnum, DmxUnaryOperator.MINUS);
		addEEnumLiteral(dmxUnaryOperatorEEnum, DmxUnaryOperator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //DmxPackageImpl
