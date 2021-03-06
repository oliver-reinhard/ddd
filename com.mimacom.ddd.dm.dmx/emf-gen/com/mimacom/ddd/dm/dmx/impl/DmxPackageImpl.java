/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.base.BasePackage;

import com.mimacom.ddd.dm.base.transpose.TransposePackage;

import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBaseType;
import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperator;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxComplexObject;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDateLiteral;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxDetail;
import com.mimacom.ddd.dm.dmx.DmxEntity;
import com.mimacom.ddd.dm.dmx.DmxFactory;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxTestContext;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperator;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral;

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
	private EClass dmxModelEClass = null;

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
	private EClass dmxTestContextEClass = null;

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
	private EClass dmxCorrelationVariableEClass = null;

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
	private EClass dmxListExpressionEClass = null;

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
	private EClass dmxUrlLiteralEClass = null;

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
	private EClass dmxComplexObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxDetailEClass = null;

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
		DmxPackageImpl theDmxPackage = (DmxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TransposePackage.eINSTANCE.eClass();

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
	public EClass getDmxModel()
	{
		return dmxModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxModel_Filters()
	{
		return (EReference)dmxModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxModel_Tests()
	{
		return (EReference)dmxModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxTest()
	{
		return dmxTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxTest_Name()
	{
		return (EAttribute)dmxTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxTest_Context()
	{
		return (EReference)dmxTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxTest_Expr()
	{
		return (EReference)dmxTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxTestContext()
	{
		return dmxTestContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxTestContext_Value()
	{
		return (EReference)dmxTestContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxBaseTypeSet()
	{
		return dmxBaseTypeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxBaseTypeSet_Name()
	{
		return (EAttribute)dmxBaseTypeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxBaseTypeSet_Members()
	{
		return (EAttribute)dmxBaseTypeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxArchetype()
	{
		return dmxArchetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxArchetype_BaseType()
	{
		return (EAttribute)dmxArchetypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxFilter()
	{
		return dmxFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFilter_Parameters()
	{
		return (EReference)dmxFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFilter_TypeDesc()
	{
		return (EReference)dmxFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFilter_WithTypeSet()
	{
		return (EReference)dmxFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxFilterTypeDescriptor()
	{
		return dmxFilterTypeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxFilterTypeDescriptor_Single()
	{
		return (EAttribute)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFilterTypeDescriptor_Multiple()
	{
		return (EReference)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxFilterTypeDescriptor_Collection()
	{
		return (EAttribute)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxFilterTypeDescriptor_MultiTyped()
	{
		return (EAttribute)dmxFilterTypeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType_boolean()
	{
		return dmxFilterTypeDescriptorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDmxFilterTypeDescriptor__IsCompatible__DmxBaseType()
	{
		return dmxFilterTypeDescriptorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxFilterParameter()
	{
		return dmxFilterParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxFilterParameter_Name()
	{
		return (EAttribute)dmxFilterParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFilterParameter_TypeDesc()
	{
		return (EReference)dmxFilterParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxAssignment()
	{
		return dmxAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxAssignment_PrecedingNavigationSegment()
	{
		return (EReference)dmxAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxAssignment_AssignToMember()
	{
		return (EReference)dmxAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxAssignment_Value()
	{
		return (EReference)dmxAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxPredicateWithCorrelationVariable()
	{
		return dmxPredicateWithCorrelationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxPredicateWithCorrelationVariable_CorrelationVariable()
	{
		return (EReference)dmxPredicateWithCorrelationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxPredicateWithCorrelationVariable_Predicate()
	{
		return (EReference)dmxPredicateWithCorrelationVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxCorrelationVariable()
	{
		return dmxCorrelationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxMemberNavigation()
	{
		return dmxMemberNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxMemberNavigation_Member()
	{
		return (EReference)dmxMemberNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxMemberNavigation_PrecedingNavigationSegment()
	{
		return (EReference)dmxMemberNavigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxMemberNavigation_ExplicitOperationCall()
	{
		return (EAttribute)dmxMemberNavigationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxMemberNavigation_CallArguments()
	{
		return (EReference)dmxMemberNavigationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxMemberNavigation_Before()
	{
		return (EAttribute)dmxMemberNavigationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxCallArguments()
	{
		return dmxCallArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxCallArguments_Arguments()
	{
		return (EReference)dmxCallArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxFunctionCall()
	{
		return dmxFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFunctionCall_Function()
	{
		return (EReference)dmxFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxFunctionCall_CallArguments()
	{
		return (EReference)dmxFunctionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxBinaryOperation()
	{
		return dmxBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxBinaryOperation_LeftOperand()
	{
		return (EReference)dmxBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxBinaryOperation_Operator()
	{
		return (EAttribute)dmxBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxBinaryOperation_RightOperand()
	{
		return (EReference)dmxBinaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxInstanceOfExpression()
	{
		return dmxInstanceOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxInstanceOfExpression_Expression()
	{
		return (EReference)dmxInstanceOfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxInstanceOfExpression_Type()
	{
		return (EReference)dmxInstanceOfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxUnaryOperation()
	{
		return dmxUnaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxUnaryOperation_Operand()
	{
		return (EReference)dmxUnaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxUnaryOperation_Operator()
	{
		return (EAttribute)dmxUnaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxCastExpression()
	{
		return dmxCastExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxCastExpression_Target()
	{
		return (EReference)dmxCastExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxCastExpression_Type()
	{
		return (EReference)dmxCastExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxListExpression()
	{
		return dmxListExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxListExpression_Elements()
	{
		return (EReference)dmxListExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxStaticReference()
	{
		return dmxStaticReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxStaticReference_Target()
	{
		return (EReference)dmxStaticReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxStaticReference_Member()
	{
		return (EReference)dmxStaticReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxStaticReference_DisplayName()
	{
		return (EAttribute)dmxStaticReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxStaticReference_Plural()
	{
		return (EAttribute)dmxStaticReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxContextReference()
	{
		return dmxContextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxContextReference_Target()
	{
		return (EReference)dmxContextReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxContextReference_All()
	{
		return (EAttribute)dmxContextReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxContextReference_Before()
	{
		return (EAttribute)dmxContextReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxIfExpression()
	{
		return dmxIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxIfExpression_If()
	{
		return (EReference)dmxIfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxIfExpression_Then()
	{
		return (EReference)dmxIfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxIfExpression_Else()
	{
		return (EReference)dmxIfExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxBooleanLiteral()
	{
		return dmxBooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxBooleanLiteral_Value()
	{
		return (EAttribute)dmxBooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxStringLiteral()
	{
		return dmxStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxStringLiteral_Value()
	{
		return (EAttribute)dmxStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxNaturalLiteral()
	{
		return dmxNaturalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxNaturalLiteral_Value()
	{
		return (EAttribute)dmxNaturalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxDecimalLiteral()
	{
		return dmxDecimalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxDecimalLiteral_Value()
	{
		return (EAttribute)dmxDecimalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxDateLiteral()
	{
		return dmxDateLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxDateLiteral_Value()
	{
		return (EAttribute)dmxDateLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxUrlLiteral()
	{
		return dmxUrlLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxUrlLiteral_Value()
	{
		return (EAttribute)dmxUrlLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDmxUrlLiteral_Display()
	{
		return (EAttribute)dmxUrlLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxUndefinedLiteral()
	{
		return dmxUndefinedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxComplexObject()
	{
		return dmxComplexObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxComplexObject_Type()
	{
		return (EReference)dmxComplexObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxComplexObject_Fields()
	{
		return (EReference)dmxComplexObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxField()
	{
		return dmxFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxField_Feature()
	{
		return (EReference)dmxFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDmxField_Value()
	{
		return (EReference)dmxFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxEntity()
	{
		return dmxEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDmxDetail()
	{
		return dmxDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDmxBaseType()
	{
		return dmxBaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDmxBinaryOperator()
	{
		return dmxBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDmxUnaryOperator()
	{
		return dmxUnaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		dmxModelEClass = createEClass(DMX_MODEL);
		createEReference(dmxModelEClass, DMX_MODEL__FILTERS);
		createEReference(dmxModelEClass, DMX_MODEL__TESTS);

		dmxTestEClass = createEClass(DMX_TEST);
		createEAttribute(dmxTestEClass, DMX_TEST__NAME);
		createEReference(dmxTestEClass, DMX_TEST__CONTEXT);
		createEReference(dmxTestEClass, DMX_TEST__EXPR);

		dmxTestContextEClass = createEClass(DMX_TEST_CONTEXT);
		createEReference(dmxTestContextEClass, DMX_TEST_CONTEXT__VALUE);

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

		dmxCorrelationVariableEClass = createEClass(DMX_CORRELATION_VARIABLE);

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

		dmxListExpressionEClass = createEClass(DMX_LIST_EXPRESSION);
		createEReference(dmxListExpressionEClass, DMX_LIST_EXPRESSION__ELEMENTS);

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

		dmxUrlLiteralEClass = createEClass(DMX_URL_LITERAL);
		createEAttribute(dmxUrlLiteralEClass, DMX_URL_LITERAL__VALUE);
		createEAttribute(dmxUrlLiteralEClass, DMX_URL_LITERAL__DISPLAY);

		dmxUndefinedLiteralEClass = createEClass(DMX_UNDEFINED_LITERAL);

		dmxComplexObjectEClass = createEClass(DMX_COMPLEX_OBJECT);
		createEReference(dmxComplexObjectEClass, DMX_COMPLEX_OBJECT__TYPE);
		createEReference(dmxComplexObjectEClass, DMX_COMPLEX_OBJECT__FIELDS);

		dmxFieldEClass = createEClass(DMX_FIELD);
		createEReference(dmxFieldEClass, DMX_FIELD__FEATURE);
		createEReference(dmxFieldEClass, DMX_FIELD__VALUE);

		dmxEntityEClass = createEClass(DMX_ENTITY);

		dmxDetailEClass = createEClass(DMX_DETAIL);

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
		TransposePackage theTransposePackage = (TransposePackage)EPackage.Registry.INSTANCE.getEPackage(TransposePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dmxModelEClass.getESuperTypes().add(theBasePackage.getDModel());
		dmxModelEClass.getESuperTypes().add(theBasePackage.getITypeContainer());
		dmxTestEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dmxTestContextEClass.getESuperTypes().add(theBasePackage.getDContext());
		dmxArchetypeEClass.getESuperTypes().add(theBasePackage.getDPrimitive());
		dmxArchetypeEClass.getESuperTypes().add(theTransposePackage.getITransposableElement());
		dmxFilterEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		dmxAssignmentEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxPredicateWithCorrelationVariableEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxPredicateWithCorrelationVariableEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dmxCorrelationVariableEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		dmxMemberNavigationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxFunctionCallEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxBinaryOperationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxInstanceOfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxUnaryOperationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxCastExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxListExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxStaticReferenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxContextReferenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxIfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxBooleanLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxStringLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxNaturalLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxDecimalLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxDateLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxUrlLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxUndefinedLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxComplexObjectEClass.getESuperTypes().add(theBasePackage.getINavigableMemberContainer());
		dmxComplexObjectEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dmxFieldEClass.getESuperTypes().add(theBasePackage.getDNavigableMember());
		dmxEntityEClass.getESuperTypes().add(this.getDmxComplexObject());
		dmxDetailEClass.getESuperTypes().add(this.getDmxComplexObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmxModelEClass, DmxModel.class, "DmxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxModel_Filters(), this.getDmxFilter(), null, "filters", null, 0, -1, DmxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxModel_Tests(), this.getDmxTest(), null, "tests", null, 0, -1, DmxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxTestEClass, DmxTest.class, "DmxTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxTest_Name(), ecorePackage.getEString(), "name", null, 0, 1, DmxTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxTest_Context(), this.getDmxTestContext(), null, "context", null, 0, -1, DmxTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxTest_Expr(), theBasePackage.getDExpression(), null, "expr", null, 0, 1, DmxTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxTestContextEClass, DmxTestContext.class, "DmxTestContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxTestContext_Value(), theBasePackage.getDExpression(), null, "value", null, 0, 1, DmxTestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getDmxPredicateWithCorrelationVariable_CorrelationVariable(), this.getDmxCorrelationVariable(), null, "correlationVariable", null, 0, 1, DmxPredicateWithCorrelationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxPredicateWithCorrelationVariable_Predicate(), theBasePackage.getDExpression(), null, "predicate", null, 0, 1, DmxPredicateWithCorrelationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxCorrelationVariableEClass, DmxCorrelationVariable.class, "DmxCorrelationVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(dmxListExpressionEClass, DmxListExpression.class, "DmxListExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxListExpression_Elements(), theBasePackage.getDExpression(), null, "elements", null, 0, -1, DmxListExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(dmxUrlLiteralEClass, DmxUrlLiteral.class, "DmxUrlLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDmxUrlLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, DmxUrlLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDmxUrlLiteral_Display(), ecorePackage.getEString(), "display", null, 0, 1, DmxUrlLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxUndefinedLiteralEClass, DmxUndefinedLiteral.class, "DmxUndefinedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmxComplexObjectEClass, DmxComplexObject.class, "DmxComplexObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxComplexObject_Type(), theBasePackage.getDComplexType(), null, "type", null, 0, 1, DmxComplexObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxComplexObject_Fields(), this.getDmxField(), null, "fields", null, 0, -1, DmxComplexObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFieldEClass, DmxField.class, "DmxField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxField_Feature(), theBasePackage.getDFeature(), null, "feature", null, 0, 1, DmxField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxField_Value(), theBasePackage.getDExpression(), null, "value", null, 0, 1, DmxField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxEntityEClass, DmxEntity.class, "DmxEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmxDetailEClass, DmxDetail.class, "DmxDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dmxBaseTypeEEnum, DmxBaseType.class, "DmxBaseType");
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.UNDEFINED);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.AMBIGUOUS);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.VOID);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.BOOLEAN);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.NUMBER);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.TEXT);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.IDENTIFIER);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.TIMEPOINT);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.ENUM);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.STATE);
		addEEnumLiteral(dmxBaseTypeEEnum, DmxBaseType.STATE_EVENT);
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
		addEEnumLiteral(dmxBinaryOperatorEEnum, DmxBinaryOperator.IN);
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
