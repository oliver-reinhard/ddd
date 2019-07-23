/**
 */
package com.mimacom.ddd.dm.dmx.impl;

import com.mimacom.ddd.dm.base.BasePackage;

import com.mimacom.ddd.dm.dmx.DAssignment;
import com.mimacom.ddd.dm.dmx.DBinaryOperation;
import com.mimacom.ddd.dm.dmx.DBinaryOperator;
import com.mimacom.ddd.dm.dmx.DBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DCastExpression;
import com.mimacom.ddd.dm.dmx.DConstructorCall;
import com.mimacom.ddd.dm.dmx.DContextReference;
import com.mimacom.ddd.dm.dmx.DDateLiteral;
import com.mimacom.ddd.dm.dmx.DDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DForLoopExpression;
import com.mimacom.ddd.dm.dmx.DFunctionCall;
import com.mimacom.ddd.dm.dmx.DIfExpression;
import com.mimacom.ddd.dm.dmx.DInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DNavigableMemberReference;
import com.mimacom.ddd.dm.dmx.DRaiseExpression;
import com.mimacom.ddd.dm.dmx.DReturnExpression;
import com.mimacom.ddd.dm.dmx.DSelfExpression;
import com.mimacom.ddd.dm.dmx.DStringLiteral;
import com.mimacom.ddd.dm.dmx.DUnaryOperation;
import com.mimacom.ddd.dm.dmx.DUnaryOperator;
import com.mimacom.ddd.dm.dmx.DUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxFactory;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EClass dAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dInstanceOfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dUnaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNavigableMemberReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dCastExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dSelfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dReturnExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dRaiseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dConstructorCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dContextReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dIfExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dForLoopExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dBooleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dNaturalLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dDecimalLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dDateLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dUndefinedLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dBinaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dUnaryOperatorEEnum = null;

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
	public EClass getDmxModel()
	{
		return dmxModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxModel_Texts()
	{
		return (EReference)dmxModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDmxModel_Expressions()
	{
		return (EReference)dmxModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAssignment()
	{
		return dAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAssignment_MemberContainer()
	{
		return (EReference)dAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAssignment_Member()
	{
		return (EReference)dAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAssignment_Value()
	{
		return (EReference)dAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDBinaryOperation()
	{
		return dBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDBinaryOperation_LeftOperand()
	{
		return (EReference)dBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBinaryOperation_Operator()
	{
		return (EAttribute)dBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDBinaryOperation_RightOperand()
	{
		return (EReference)dBinaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDInstanceOfExpression()
	{
		return dInstanceOfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDInstanceOfExpression_Expression()
	{
		return (EReference)dInstanceOfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDInstanceOfExpression_Type()
	{
		return (EReference)dInstanceOfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDUnaryOperation()
	{
		return dUnaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDUnaryOperation_Operand()
	{
		return (EReference)dUnaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDUnaryOperation_Operator()
	{
		return (EAttribute)dUnaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNavigableMemberReference()
	{
		return dNavigableMemberReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNavigableMemberReference_MemberContainerReference()
	{
		return (EReference)dNavigableMemberReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNavigableMemberReference_Member()
	{
		return (EReference)dNavigableMemberReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNavigableMemberReference_ExplicitOperationCall()
	{
		return (EAttribute)dNavigableMemberReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDNavigableMemberReference_MemberCallArguments()
	{
		return (EReference)dNavigableMemberReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNavigableMemberReference_Before()
	{
		return (EAttribute)dNavigableMemberReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDCastExpression()
	{
		return dCastExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCastExpression_Target()
	{
		return (EReference)dCastExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDCastExpression_Type()
	{
		return (EReference)dCastExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSelfExpression()
	{
		return dSelfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDReturnExpression()
	{
		return dReturnExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDReturnExpression_Expression()
	{
		return (EReference)dReturnExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDRaiseExpression()
	{
		return dRaiseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDRaiseExpression_Expression()
	{
		return (EReference)dRaiseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDFunctionCall()
	{
		return dFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDFunctionCall_Function()
	{
		return (EReference)dFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDFunctionCall_FunctionCallArguments()
	{
		return (EReference)dFunctionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDConstructorCall()
	{
		return dConstructorCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDConstructorCall_Constructor()
	{
		return (EReference)dConstructorCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDConstructorCall_ExplicitConstructorCall()
	{
		return (EAttribute)dConstructorCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDConstructorCall_Arguments()
	{
		return (EReference)dConstructorCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDContextReference()
	{
		return dContextReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDContextReference_Target()
	{
		return (EReference)dContextReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDContextReference_Before()
	{
		return (EAttribute)dContextReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDContextReference_Member()
	{
		return (EReference)dContextReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDContextReference_DisplayName()
	{
		return (EAttribute)dContextReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDContextReference_Plural()
	{
		return (EAttribute)dContextReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDIfExpression()
	{
		return dIfExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIfExpression_If()
	{
		return (EReference)dIfExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIfExpression_Then()
	{
		return (EReference)dIfExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDIfExpression_Else()
	{
		return (EReference)dIfExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDForLoopExpression()
	{
		return dForLoopExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDForLoopExpression_DeclaredParam()
	{
		return (EAttribute)dForLoopExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDForLoopExpression_ForExpression()
	{
		return (EReference)dForLoopExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDForLoopExpression_EachExpression()
	{
		return (EReference)dForLoopExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDBooleanLiteral()
	{
		return dBooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDBooleanLiteral_Value()
	{
		return (EAttribute)dBooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDStringLiteral()
	{
		return dStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDStringLiteral_Value()
	{
		return (EAttribute)dStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDNaturalLiteral()
	{
		return dNaturalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDNaturalLiteral_Value()
	{
		return (EAttribute)dNaturalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDDecimalLiteral()
	{
		return dDecimalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDDecimalLiteral_Value()
	{
		return (EAttribute)dDecimalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDDateLiteral()
	{
		return dDateLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDDateLiteral_Value()
	{
		return (EAttribute)dDateLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDUndefinedLiteral()
	{
		return dUndefinedLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDBinaryOperator()
	{
		return dBinaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDUnaryOperator()
	{
		return dUnaryOperatorEEnum;
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
		dmxModelEClass = createEClass(DMX_MODEL);
		createEReference(dmxModelEClass, DMX_MODEL__TEXTS);
		createEReference(dmxModelEClass, DMX_MODEL__EXPRESSIONS);

		dAssignmentEClass = createEClass(DASSIGNMENT);
		createEReference(dAssignmentEClass, DASSIGNMENT__MEMBER_CONTAINER);
		createEReference(dAssignmentEClass, DASSIGNMENT__MEMBER);
		createEReference(dAssignmentEClass, DASSIGNMENT__VALUE);

		dBinaryOperationEClass = createEClass(DBINARY_OPERATION);
		createEReference(dBinaryOperationEClass, DBINARY_OPERATION__LEFT_OPERAND);
		createEAttribute(dBinaryOperationEClass, DBINARY_OPERATION__OPERATOR);
		createEReference(dBinaryOperationEClass, DBINARY_OPERATION__RIGHT_OPERAND);

		dInstanceOfExpressionEClass = createEClass(DINSTANCE_OF_EXPRESSION);
		createEReference(dInstanceOfExpressionEClass, DINSTANCE_OF_EXPRESSION__EXPRESSION);
		createEReference(dInstanceOfExpressionEClass, DINSTANCE_OF_EXPRESSION__TYPE);

		dUnaryOperationEClass = createEClass(DUNARY_OPERATION);
		createEReference(dUnaryOperationEClass, DUNARY_OPERATION__OPERAND);
		createEAttribute(dUnaryOperationEClass, DUNARY_OPERATION__OPERATOR);

		dNavigableMemberReferenceEClass = createEClass(DNAVIGABLE_MEMBER_REFERENCE);
		createEReference(dNavigableMemberReferenceEClass, DNAVIGABLE_MEMBER_REFERENCE__MEMBER_CONTAINER_REFERENCE);
		createEReference(dNavigableMemberReferenceEClass, DNAVIGABLE_MEMBER_REFERENCE__MEMBER);
		createEAttribute(dNavigableMemberReferenceEClass, DNAVIGABLE_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL);
		createEReference(dNavigableMemberReferenceEClass, DNAVIGABLE_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS);
		createEAttribute(dNavigableMemberReferenceEClass, DNAVIGABLE_MEMBER_REFERENCE__BEFORE);

		dCastExpressionEClass = createEClass(DCAST_EXPRESSION);
		createEReference(dCastExpressionEClass, DCAST_EXPRESSION__TARGET);
		createEReference(dCastExpressionEClass, DCAST_EXPRESSION__TYPE);

		dSelfExpressionEClass = createEClass(DSELF_EXPRESSION);

		dReturnExpressionEClass = createEClass(DRETURN_EXPRESSION);
		createEReference(dReturnExpressionEClass, DRETURN_EXPRESSION__EXPRESSION);

		dRaiseExpressionEClass = createEClass(DRAISE_EXPRESSION);
		createEReference(dRaiseExpressionEClass, DRAISE_EXPRESSION__EXPRESSION);

		dFunctionCallEClass = createEClass(DFUNCTION_CALL);
		createEReference(dFunctionCallEClass, DFUNCTION_CALL__FUNCTION);
		createEReference(dFunctionCallEClass, DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS);

		dConstructorCallEClass = createEClass(DCONSTRUCTOR_CALL);
		createEReference(dConstructorCallEClass, DCONSTRUCTOR_CALL__CONSTRUCTOR);
		createEAttribute(dConstructorCallEClass, DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL);
		createEReference(dConstructorCallEClass, DCONSTRUCTOR_CALL__ARGUMENTS);

		dContextReferenceEClass = createEClass(DCONTEXT_REFERENCE);
		createEReference(dContextReferenceEClass, DCONTEXT_REFERENCE__TARGET);
		createEAttribute(dContextReferenceEClass, DCONTEXT_REFERENCE__BEFORE);
		createEReference(dContextReferenceEClass, DCONTEXT_REFERENCE__MEMBER);
		createEAttribute(dContextReferenceEClass, DCONTEXT_REFERENCE__DISPLAY_NAME);
		createEAttribute(dContextReferenceEClass, DCONTEXT_REFERENCE__PLURAL);

		dIfExpressionEClass = createEClass(DIF_EXPRESSION);
		createEReference(dIfExpressionEClass, DIF_EXPRESSION__IF);
		createEReference(dIfExpressionEClass, DIF_EXPRESSION__THEN);
		createEReference(dIfExpressionEClass, DIF_EXPRESSION__ELSE);

		dForLoopExpressionEClass = createEClass(DFOR_LOOP_EXPRESSION);
		createEAttribute(dForLoopExpressionEClass, DFOR_LOOP_EXPRESSION__DECLARED_PARAM);
		createEReference(dForLoopExpressionEClass, DFOR_LOOP_EXPRESSION__FOR_EXPRESSION);
		createEReference(dForLoopExpressionEClass, DFOR_LOOP_EXPRESSION__EACH_EXPRESSION);

		dBooleanLiteralEClass = createEClass(DBOOLEAN_LITERAL);
		createEAttribute(dBooleanLiteralEClass, DBOOLEAN_LITERAL__VALUE);

		dStringLiteralEClass = createEClass(DSTRING_LITERAL);
		createEAttribute(dStringLiteralEClass, DSTRING_LITERAL__VALUE);

		dNaturalLiteralEClass = createEClass(DNATURAL_LITERAL);
		createEAttribute(dNaturalLiteralEClass, DNATURAL_LITERAL__VALUE);

		dDecimalLiteralEClass = createEClass(DDECIMAL_LITERAL);
		createEAttribute(dDecimalLiteralEClass, DDECIMAL_LITERAL__VALUE);

		dDateLiteralEClass = createEClass(DDATE_LITERAL);
		createEAttribute(dDateLiteralEClass, DDATE_LITERAL__VALUE);

		dUndefinedLiteralEClass = createEClass(DUNDEFINED_LITERAL);

		// Create enums
		dBinaryOperatorEEnum = createEEnum(DBINARY_OPERATOR);
		dUnaryOperatorEEnum = createEEnum(DUNARY_OPERATOR);
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
		dAssignmentEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dBinaryOperationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dInstanceOfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dUnaryOperationEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dNavigableMemberReferenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dCastExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dSelfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dReturnExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dRaiseExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dFunctionCallEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dConstructorCallEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dContextReferenceEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dIfExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dForLoopExpressionEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dBooleanLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dStringLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dNaturalLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dDecimalLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dDateLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());
		dUndefinedLiteralEClass.getESuperTypes().add(theBasePackage.getDExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmxModelEClass, DmxModel.class, "DmxModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDmxModel_Texts(), theBasePackage.getDRichText(), null, "texts", null, 0, -1, DmxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDmxModel_Expressions(), theBasePackage.getDExpression(), null, "expressions", null, 0, -1, DmxModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dAssignmentEClass, DAssignment.class, "DAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAssignment_MemberContainer(), theBasePackage.getDExpression(), null, "memberContainer", null, 0, 1, DAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAssignment_Member(), theBasePackage.getDNavigableMember(), null, "member", null, 0, 1, DAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAssignment_Value(), theBasePackage.getDExpression(), null, "value", null, 0, 1, DAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBinaryOperationEClass, DBinaryOperation.class, "DBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBinaryOperation_LeftOperand(), theBasePackage.getDExpression(), null, "leftOperand", null, 0, 1, DBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBinaryOperation_Operator(), this.getDBinaryOperator(), "operator", null, 0, 1, DBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBinaryOperation_RightOperand(), theBasePackage.getDExpression(), null, "rightOperand", null, 0, 1, DBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dInstanceOfExpressionEClass, DInstanceOfExpression.class, "DInstanceOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDInstanceOfExpression_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDInstanceOfExpression_Type(), theBasePackage.getDType(), null, "type", null, 0, 1, DInstanceOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dUnaryOperationEClass, DUnaryOperation.class, "DUnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDUnaryOperation_Operand(), theBasePackage.getDExpression(), null, "operand", null, 0, 1, DUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDUnaryOperation_Operator(), this.getDUnaryOperator(), "operator", null, 0, 1, DUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dNavigableMemberReferenceEClass, DNavigableMemberReference.class, "DNavigableMemberReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDNavigableMemberReference_MemberContainerReference(), theBasePackage.getDExpression(), null, "memberContainerReference", null, 0, 1, DNavigableMemberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNavigableMemberReference_Member(), theBasePackage.getDNavigableMember(), null, "member", null, 0, 1, DNavigableMemberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNavigableMemberReference_ExplicitOperationCall(), ecorePackage.getEBoolean(), "explicitOperationCall", null, 0, 1, DNavigableMemberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDNavigableMemberReference_MemberCallArguments(), theBasePackage.getDExpression(), null, "memberCallArguments", null, 0, -1, DNavigableMemberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDNavigableMemberReference_Before(), ecorePackage.getEBoolean(), "before", null, 0, 1, DNavigableMemberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dCastExpressionEClass, DCastExpression.class, "DCastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDCastExpression_Target(), theBasePackage.getDExpression(), null, "target", null, 0, 1, DCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDCastExpression_Type(), theBasePackage.getDType(), null, "type", null, 0, 1, DCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dSelfExpressionEClass, DSelfExpression.class, "DSelfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dReturnExpressionEClass, DReturnExpression.class, "DReturnExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDReturnExpression_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DReturnExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dRaiseExpressionEClass, DRaiseExpression.class, "DRaiseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDRaiseExpression_Expression(), theBasePackage.getDExpression(), null, "expression", null, 0, 1, DRaiseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dFunctionCallEClass, DFunctionCall.class, "DFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDFunctionCall_Function(), theBasePackage.getDFunction(), null, "function", null, 0, 1, DFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDFunctionCall_FunctionCallArguments(), theBasePackage.getDExpression(), null, "functionCallArguments", null, 0, -1, DFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dConstructorCallEClass, DConstructorCall.class, "DConstructorCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDConstructorCall_Constructor(), theBasePackage.getDComplexType(), null, "constructor", null, 0, 1, DConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDConstructorCall_ExplicitConstructorCall(), ecorePackage.getEBoolean(), "explicitConstructorCall", null, 0, 1, DConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDConstructorCall_Arguments(), theBasePackage.getDExpression(), null, "arguments", null, 0, -1, DConstructorCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dContextReferenceEClass, DContextReference.class, "DContextReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDContextReference_Target(), theBasePackage.getDNamedElement(), null, "target", null, 0, 1, DContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDContextReference_Before(), ecorePackage.getEBoolean(), "before", null, 0, 1, DContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDContextReference_Member(), theBasePackage.getDNavigableMember(), null, "member", null, 0, 1, DContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDContextReference_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, DContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDContextReference_Plural(), ecorePackage.getEBoolean(), "plural", null, 0, 1, DContextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dIfExpressionEClass, DIfExpression.class, "DIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDIfExpression_If(), theBasePackage.getDExpression(), null, "if", null, 0, 1, DIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDIfExpression_Then(), theBasePackage.getDExpression(), null, "then", null, 0, 1, DIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDIfExpression_Else(), theBasePackage.getDExpression(), null, "else", null, 0, 1, DIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dForLoopExpressionEClass, DForLoopExpression.class, "DForLoopExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDForLoopExpression_DeclaredParam(), ecorePackage.getEString(), "declaredParam", null, 0, 1, DForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDForLoopExpression_ForExpression(), theBasePackage.getDExpression(), null, "forExpression", null, 0, 1, DForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDForLoopExpression_EachExpression(), theBasePackage.getDExpression(), null, "eachExpression", null, 0, 1, DForLoopExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dBooleanLiteralEClass, DBooleanLiteral.class, "DBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, DBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dStringLiteralEClass, DStringLiteral.class, "DStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, DStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dNaturalLiteralEClass, DNaturalLiteral.class, "DNaturalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDNaturalLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, DNaturalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDecimalLiteralEClass, DDecimalLiteral.class, "DDecimalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDDecimalLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, DDecimalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dDateLiteralEClass, DDateLiteral.class, "DDateLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDDateLiteral_Value(), ecorePackage.getEDate(), "value", null, 0, 1, DDateLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dUndefinedLiteralEClass, DUndefinedLiteral.class, "DUndefinedLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dBinaryOperatorEEnum, DBinaryOperator.class, "DBinaryOperator");
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.ADD);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.SUBTRACT);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.MULTIPLY);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.DIVIDE);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.POWER);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.MODULO);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.AND);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.OR);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.XOR);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.EQUAL);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.NOT_EQUAL);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.LESS);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.LESS_OR_EQUAL);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.GREATER_OR_EQUAL);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.GREATER);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.UNTIL);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.SINGLE_ARROW);
		addEEnumLiteral(dBinaryOperatorEEnum, DBinaryOperator.DOUBLE_ARROW);

		initEEnum(dUnaryOperatorEEnum, DUnaryOperator.class, "DUnaryOperator");
		addEEnumLiteral(dUnaryOperatorEEnum, DUnaryOperator.PLUS);
		addEEnumLiteral(dUnaryOperatorEEnum, DUnaryOperator.MINUS);
		addEEnumLiteral(dUnaryOperatorEEnum, DUnaryOperator.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //DmxPackageImpl
