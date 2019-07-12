/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.BasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dmx.DmxFactory
 * @model kind="package"
 * @generated
 */
public interface DmxPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mimacom.com/ddd/dm/dmx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DmxPackage eINSTANCE = com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxModelImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxModel()
	 * @generated
	 */
	int DMX_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Texts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__TEXTS = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL__EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl <em>DAssignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDAssignment()
	 * @generated
	 */
	int DASSIGNMENT = 1;

	/**
	 * The feature id for the '<em><b>Member Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT__MEMBER_CONTAINER = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT__MEMBER = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASSIGNMENT_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl <em>DBinary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperation()
	 * @generated
	 */
	int DBINARY_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION__LEFT_OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION__OPERATOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION__RIGHT_OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DBinary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DBinary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBINARY_OPERATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl <em>DInstance Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDInstanceOfExpression()
	 * @generated
	 */
	int DINSTANCE_OF_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION__TYPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DInstance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DInstance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINSTANCE_OF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl <em>DUnary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperation()
	 * @generated
	 */
	int DUNARY_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION__OPERAND = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION__OPERATOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DUnary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DUnary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNARY_OPERATION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DNavigableMemberReferenceImpl <em>DNavigable Member Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DNavigableMemberReferenceImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDNavigableMemberReference()
	 * @generated
	 */
	int DNAVIGABLE_MEMBER_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Member Container Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE__MEMBER_CONTAINER_REFERENCE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE__MEMBER = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Explicit Operation Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Member Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE__BEFORE = BasePackage.DEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>DNavigable Member Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>DNavigable Member Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNAVIGABLE_MEMBER_REFERENCE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl <em>DCast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDCastExpression()
	 * @generated
	 */
	int DCAST_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION__TYPE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DCast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DCast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCAST_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl <em>DSelf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDSelfExpression()
	 * @generated
	 */
	int DSELF_EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>DSelf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSELF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DSelf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSELF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl <em>DReturn Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDReturnExpression()
	 * @generated
	 */
	int DRETURN_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRETURN_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DReturn Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRETURN_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DReturn Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRETURN_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl <em>DRaise Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDRaiseExpression()
	 * @generated
	 */
	int DRAISE_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAISE_EXPRESSION__EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DRaise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAISE_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DRaise Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAISE_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl <em>DFunction Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDFunctionCall()
	 * @generated
	 */
	int DFUNCTION_CALL = 10;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL__FUNCTION = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Call Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DFunction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DFunction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFUNCTION_CALL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl <em>DConstructor Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDConstructorCall()
	 * @generated
	 */
	int DCONSTRUCTOR_CALL = 11;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL__CONSTRUCTOR = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Explicit Constructor Call</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL__ARGUMENTS = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DConstructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DConstructor Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONSTRUCTOR_CALL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl <em>DContext Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDContextReference()
	 * @generated
	 */
	int DCONTEXT_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_REFERENCE__TARGET = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_REFERENCE__BEFORE = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DContext Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_REFERENCE_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DContext Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCONTEXT_REFERENCE_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl <em>DIf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDIfExpression()
	 * @generated
	 */
	int DIF_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION__IF = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION__THEN = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION__ELSE = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIF_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl <em>DFor Loop Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDForLoopExpression()
	 * @generated
	 */
	int DFOR_LOOP_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION__DECLARED_PARAM = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION__FOR_EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION__EACH_EXPRESSION = BasePackage.DEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DFor Loop Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>DFor Loop Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFOR_LOOP_EXPRESSION_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl <em>DBoolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBooleanLiteral()
	 * @generated
	 */
	int DBOOLEAN_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBOOLEAN_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DBoolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBOOLEAN_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DBoolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBOOLEAN_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl <em>DString Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDStringLiteral()
	 * @generated
	 */
	int DSTRING_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTRING_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DString Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTRING_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DString Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSTRING_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl <em>DNatural Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDNaturalLiteral()
	 * @generated
	 */
	int DNATURAL_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNATURAL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DNatural Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNATURAL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DNatural Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DNATURAL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl <em>DDecimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDecimalLiteral()
	 * @generated
	 */
	int DDECIMAL_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDECIMAL_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DDecimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDECIMAL_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DDecimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDECIMAL_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl <em>DDate Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDateLiteral()
	 * @generated
	 */
	int DDATE_LITERAL = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATE_LITERAL__VALUE = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DDate Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATE_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DDate Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDATE_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl <em>DUndefined Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUndefinedLiteral()
	 * @generated
	 */
	int DUNDEFINED_LITERAL = 20;

	/**
	 * The number of structural features of the '<em>DUndefined Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNDEFINED_LITERAL_FEATURE_COUNT = BasePackage.DEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DUndefined Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUNDEFINED_LITERAL_OPERATION_COUNT = BasePackage.DEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperator <em>DBinary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperator()
	 * @generated
	 */
	int DBINARY_OPERATOR = 21;

	/**
	 * The meta object id for the '{@link com.mimacom.ddd.dm.dmx.DUnaryOperator <em>DUnary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperator
	 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperator()
	 * @generated
	 */
	int DUNARY_OPERATOR = 22;


	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DmxModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel
	 * @generated
	 */
	EClass getDmxModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxModel#getTexts <em>Texts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Texts</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel#getTexts()
	 * @see #getDmxModel()
	 * @generated
	 */
	EReference getDmxModel_Texts();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DmxModel#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel#getExpressions()
	 * @see #getDmxModel()
	 * @generated
	 */
	EReference getDmxModel_Expressions();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DAssignment <em>DAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAssignment</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment
	 * @generated
	 */
	EClass getDAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DAssignment#getMemberContainer <em>Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Container</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment#getMemberContainer()
	 * @see #getDAssignment()
	 * @generated
	 */
	EReference getDAssignment_MemberContainer();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DAssignment#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment#getMember()
	 * @see #getDAssignment()
	 * @generated
	 */
	EReference getDAssignment_Member();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment#getValue()
	 * @see #getDAssignment()
	 * @generated
	 */
	EReference getDAssignment_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation <em>DBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBinary Operation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation
	 * @generated
	 */
	EClass getDBinaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation#getLeftOperand()
	 * @see #getDBinaryOperation()
	 * @generated
	 */
	EReference getDBinaryOperation_LeftOperand();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation#getOperator()
	 * @see #getDBinaryOperation()
	 * @generated
	 */
	EAttribute getDBinaryOperation_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation#getRightOperand()
	 * @see #getDBinaryOperation()
	 * @generated
	 */
	EReference getDBinaryOperation_RightOperand();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression <em>DInstance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DInstance Of Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression
	 * @generated
	 */
	EClass getDInstanceOfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getExpression()
	 * @see #getDInstanceOfExpression()
	 * @generated
	 */
	EReference getDInstanceOfExpression_Expression();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression#getType()
	 * @see #getDInstanceOfExpression()
	 * @generated
	 */
	EReference getDInstanceOfExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation <em>DUnary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DUnary Operation</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation
	 * @generated
	 */
	EClass getDUnaryOperation();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperand()
	 * @see #getDUnaryOperation()
	 * @generated
	 */
	EReference getDUnaryOperation_Operand();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation#getOperator()
	 * @see #getDUnaryOperation()
	 * @generated
	 */
	EAttribute getDUnaryOperation_Operator();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference <em>DNavigable Member Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNavigable Member Reference</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNavigableMemberReference
	 * @generated
	 */
	EClass getDNavigableMemberReference();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberContainerReference <em>Member Container Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Container Reference</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberContainerReference()
	 * @see #getDNavigableMemberReference()
	 * @generated
	 */
	EReference getDNavigableMemberReference_MemberContainerReference();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMember()
	 * @see #getDNavigableMemberReference()
	 * @generated
	 */
	EReference getDNavigableMemberReference_Member();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isExplicitOperationCall <em>Explicit Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Operation Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isExplicitOperationCall()
	 * @see #getDNavigableMemberReference()
	 * @generated
	 */
	EAttribute getDNavigableMemberReference_ExplicitOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberCallArguments <em>Member Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNavigableMemberReference#getMemberCallArguments()
	 * @see #getDNavigableMemberReference()
	 * @generated
	 */
	EReference getDNavigableMemberReference_MemberCallArguments();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNavigableMemberReference#isBefore()
	 * @see #getDNavigableMemberReference()
	 * @generated
	 */
	EAttribute getDNavigableMemberReference_Before();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DCastExpression <em>DCast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCast Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression
	 * @generated
	 */
	EClass getDCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DCastExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression#getTarget()
	 * @see #getDCastExpression()
	 * @generated
	 */
	EReference getDCastExpression_Target();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DCastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression#getType()
	 * @see #getDCastExpression()
	 * @generated
	 */
	EReference getDCastExpression_Type();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DSelfExpression <em>DSelf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSelf Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DSelfExpression
	 * @generated
	 */
	EClass getDSelfExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DReturnExpression <em>DReturn Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DReturn Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DReturnExpression
	 * @generated
	 */
	EClass getDReturnExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DReturnExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DReturnExpression#getExpression()
	 * @see #getDReturnExpression()
	 * @generated
	 */
	EReference getDReturnExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DRaiseExpression <em>DRaise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DRaise Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DRaiseExpression
	 * @generated
	 */
	EClass getDRaiseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DRaiseExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DRaiseExpression#getExpression()
	 * @see #getDRaiseExpression()
	 * @generated
	 */
	EReference getDRaiseExpression_Expression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DFunctionCall <em>DFunction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFunction Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall
	 * @generated
	 */
	EClass getDFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall#getFunction()
	 * @see #getDFunctionCall()
	 * @generated
	 */
	EReference getDFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DFunctionCall#getFunctionCallArguments <em>Function Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Call Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall#getFunctionCallArguments()
	 * @see #getDFunctionCall()
	 * @generated
	 */
	EReference getDFunctionCall_FunctionCallArguments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DConstructorCall <em>DConstructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DConstructor Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall
	 * @generated
	 */
	EClass getDConstructorCall();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DConstructorCall#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constructor</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall#getConstructor()
	 * @see #getDConstructorCall()
	 * @generated
	 */
	EReference getDConstructorCall_Constructor();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DConstructorCall#isExplicitConstructorCall <em>Explicit Constructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit Constructor Call</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall#isExplicitConstructorCall()
	 * @see #getDConstructorCall()
	 * @generated
	 */
	EAttribute getDConstructorCall_ExplicitConstructorCall();

	/**
	 * Returns the meta object for the containment reference list '{@link com.mimacom.ddd.dm.dmx.DConstructorCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall#getArguments()
	 * @see #getDConstructorCall()
	 * @generated
	 */
	EReference getDConstructorCall_Arguments();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DContextReference <em>DContext Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DContext Reference</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DContextReference
	 * @generated
	 */
	EClass getDContextReference();

	/**
	 * Returns the meta object for the reference '{@link com.mimacom.ddd.dm.dmx.DContextReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DContextReference#getTarget()
	 * @see #getDContextReference()
	 * @generated
	 */
	EReference getDContextReference_Target();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DContextReference#isBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DContextReference#isBefore()
	 * @see #getDContextReference()
	 * @generated
	 */
	EAttribute getDContextReference_Before();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DIfExpression <em>DIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DIf Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression
	 * @generated
	 */
	EClass getDIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression#getIf()
	 * @see #getDIfExpression()
	 * @generated
	 */
	EReference getDIfExpression_If();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression#getThen()
	 * @see #getDIfExpression()
	 * @generated
	 */
	EReference getDIfExpression_Then();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DIfExpression#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression#getElse()
	 * @see #getDIfExpression()
	 * @generated
	 */
	EReference getDIfExpression_Else();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression <em>DFor Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFor Loop Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression
	 * @generated
	 */
	EClass getDForLoopExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression#getDeclaredParam <em>Declared Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared Param</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression#getDeclaredParam()
	 * @see #getDForLoopExpression()
	 * @generated
	 */
	EAttribute getDForLoopExpression_DeclaredParam();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression#getForExpression <em>For Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression#getForExpression()
	 * @see #getDForLoopExpression()
	 * @generated
	 */
	EReference getDForLoopExpression_ForExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression#getEachExpression <em>Each Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Each Expression</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression#getEachExpression()
	 * @see #getDForLoopExpression()
	 * @generated
	 */
	EReference getDForLoopExpression_EachExpression();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DBooleanLiteral <em>DBoolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBoolean Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBooleanLiteral
	 * @generated
	 */
	EClass getDBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DBooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBooleanLiteral#isValue()
	 * @see #getDBooleanLiteral()
	 * @generated
	 */
	EAttribute getDBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DStringLiteral <em>DString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DString Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DStringLiteral
	 * @generated
	 */
	EClass getDStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DStringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DStringLiteral#getValue()
	 * @see #getDStringLiteral()
	 * @generated
	 */
	EAttribute getDStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DNaturalLiteral <em>DNatural Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DNatural Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNaturalLiteral
	 * @generated
	 */
	EClass getDNaturalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DNaturalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DNaturalLiteral#getValue()
	 * @see #getDNaturalLiteral()
	 * @generated
	 */
	EAttribute getDNaturalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DDecimalLiteral <em>DDecimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDecimal Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDecimalLiteral
	 * @generated
	 */
	EClass getDDecimalLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DDecimalLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDecimalLiteral#getValue()
	 * @see #getDDecimalLiteral()
	 * @generated
	 */
	EAttribute getDDecimalLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DDateLiteral <em>DDate Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDate Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDateLiteral
	 * @generated
	 */
	EClass getDDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.mimacom.ddd.dm.dmx.DDateLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DDateLiteral#getValue()
	 * @see #getDDateLiteral()
	 * @generated
	 */
	EAttribute getDDateLiteral_Value();

	/**
	 * Returns the meta object for class '{@link com.mimacom.ddd.dm.dmx.DUndefinedLiteral <em>DUndefined Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DUndefined Literal</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUndefinedLiteral
	 * @generated
	 */
	EClass getDUndefinedLiteral();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DBinaryOperator <em>DBinary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DBinary Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
	 * @generated
	 */
	EEnum getDBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link com.mimacom.ddd.dm.dmx.DUnaryOperator <em>DUnary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DUnary Operator</em>'.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperator
	 * @generated
	 */
	EEnum getDUnaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DmxFactory getDmxFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DmxModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxModelImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDmxModel()
		 * @generated
		 */
		EClass DMX_MODEL = eINSTANCE.getDmxModel();

		/**
		 * The meta object literal for the '<em><b>Texts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MODEL__TEXTS = eINSTANCE.getDmxModel_Texts();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_MODEL__EXPRESSIONS = eINSTANCE.getDmxModel_Expressions();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl <em>DAssignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DAssignmentImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDAssignment()
		 * @generated
		 */
		EClass DASSIGNMENT = eINSTANCE.getDAssignment();

		/**
		 * The meta object literal for the '<em><b>Member Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSIGNMENT__MEMBER_CONTAINER = eINSTANCE.getDAssignment_MemberContainer();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSIGNMENT__MEMBER = eINSTANCE.getDAssignment_Member();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASSIGNMENT__VALUE = eINSTANCE.getDAssignment_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl <em>DBinary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DBinaryOperationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperation()
		 * @generated
		 */
		EClass DBINARY_OPERATION = eINSTANCE.getDBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBINARY_OPERATION__LEFT_OPERAND = eINSTANCE.getDBinaryOperation_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBINARY_OPERATION__OPERATOR = eINSTANCE.getDBinaryOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DBINARY_OPERATION__RIGHT_OPERAND = eINSTANCE.getDBinaryOperation_RightOperand();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl <em>DInstance Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DInstanceOfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDInstanceOfExpression()
		 * @generated
		 */
		EClass DINSTANCE_OF_EXPRESSION = eINSTANCE.getDInstanceOfExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINSTANCE_OF_EXPRESSION__EXPRESSION = eINSTANCE.getDInstanceOfExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DINSTANCE_OF_EXPRESSION__TYPE = eINSTANCE.getDInstanceOfExpression_Type();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl <em>DUnary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DUnaryOperationImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperation()
		 * @generated
		 */
		EClass DUNARY_OPERATION = eINSTANCE.getDUnaryOperation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUNARY_OPERATION__OPERAND = eINSTANCE.getDUnaryOperation_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUNARY_OPERATION__OPERATOR = eINSTANCE.getDUnaryOperation_Operator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DNavigableMemberReferenceImpl <em>DNavigable Member Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DNavigableMemberReferenceImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDNavigableMemberReference()
		 * @generated
		 */
		EClass DNAVIGABLE_MEMBER_REFERENCE = eINSTANCE.getDNavigableMemberReference();

		/**
		 * The meta object literal for the '<em><b>Member Container Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAVIGABLE_MEMBER_REFERENCE__MEMBER_CONTAINER_REFERENCE = eINSTANCE.getDNavigableMemberReference_MemberContainerReference();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAVIGABLE_MEMBER_REFERENCE__MEMBER = eINSTANCE.getDNavigableMemberReference_Member();

		/**
		 * The meta object literal for the '<em><b>Explicit Operation Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAVIGABLE_MEMBER_REFERENCE__EXPLICIT_OPERATION_CALL = eINSTANCE.getDNavigableMemberReference_ExplicitOperationCall();

		/**
		 * The meta object literal for the '<em><b>Member Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DNAVIGABLE_MEMBER_REFERENCE__MEMBER_CALL_ARGUMENTS = eINSTANCE.getDNavigableMemberReference_MemberCallArguments();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNAVIGABLE_MEMBER_REFERENCE__BEFORE = eINSTANCE.getDNavigableMemberReference_Before();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl <em>DCast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DCastExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDCastExpression()
		 * @generated
		 */
		EClass DCAST_EXPRESSION = eINSTANCE.getDCastExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAST_EXPRESSION__TARGET = eINSTANCE.getDCastExpression_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCAST_EXPRESSION__TYPE = eINSTANCE.getDCastExpression_Type();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl <em>DSelf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DSelfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDSelfExpression()
		 * @generated
		 */
		EClass DSELF_EXPRESSION = eINSTANCE.getDSelfExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl <em>DReturn Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DReturnExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDReturnExpression()
		 * @generated
		 */
		EClass DRETURN_EXPRESSION = eINSTANCE.getDReturnExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRETURN_EXPRESSION__EXPRESSION = eINSTANCE.getDReturnExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl <em>DRaise Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DRaiseExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDRaiseExpression()
		 * @generated
		 */
		EClass DRAISE_EXPRESSION = eINSTANCE.getDRaiseExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAISE_EXPRESSION__EXPRESSION = eINSTANCE.getDRaiseExpression_Expression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl <em>DFunction Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DFunctionCallImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDFunctionCall()
		 * @generated
		 */
		EClass DFUNCTION_CALL = eINSTANCE.getDFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFUNCTION_CALL__FUNCTION = eINSTANCE.getDFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Function Call Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFUNCTION_CALL__FUNCTION_CALL_ARGUMENTS = eINSTANCE.getDFunctionCall_FunctionCallArguments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl <em>DConstructor Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DConstructorCallImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDConstructorCall()
		 * @generated
		 */
		EClass DCONSTRUCTOR_CALL = eINSTANCE.getDConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONSTRUCTOR_CALL__CONSTRUCTOR = eINSTANCE.getDConstructorCall_Constructor();

		/**
		 * The meta object literal for the '<em><b>Explicit Constructor Call</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCONSTRUCTOR_CALL__EXPLICIT_CONSTRUCTOR_CALL = eINSTANCE.getDConstructorCall_ExplicitConstructorCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONSTRUCTOR_CALL__ARGUMENTS = eINSTANCE.getDConstructorCall_Arguments();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl <em>DContext Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DContextReferenceImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDContextReference()
		 * @generated
		 */
		EClass DCONTEXT_REFERENCE = eINSTANCE.getDContextReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DCONTEXT_REFERENCE__TARGET = eINSTANCE.getDContextReference_Target();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DCONTEXT_REFERENCE__BEFORE = eINSTANCE.getDContextReference_Before();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl <em>DIf Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DIfExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDIfExpression()
		 * @generated
		 */
		EClass DIF_EXPRESSION = eINSTANCE.getDIfExpression();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIF_EXPRESSION__IF = eINSTANCE.getDIfExpression_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIF_EXPRESSION__THEN = eINSTANCE.getDIfExpression_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIF_EXPRESSION__ELSE = eINSTANCE.getDIfExpression_Else();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl <em>DFor Loop Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DForLoopExpressionImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDForLoopExpression()
		 * @generated
		 */
		EClass DFOR_LOOP_EXPRESSION = eINSTANCE.getDForLoopExpression();

		/**
		 * The meta object literal for the '<em><b>Declared Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFOR_LOOP_EXPRESSION__DECLARED_PARAM = eINSTANCE.getDForLoopExpression_DeclaredParam();

		/**
		 * The meta object literal for the '<em><b>For Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFOR_LOOP_EXPRESSION__FOR_EXPRESSION = eINSTANCE.getDForLoopExpression_ForExpression();

		/**
		 * The meta object literal for the '<em><b>Each Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DFOR_LOOP_EXPRESSION__EACH_EXPRESSION = eINSTANCE.getDForLoopExpression_EachExpression();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl <em>DBoolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DBooleanLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBooleanLiteral()
		 * @generated
		 */
		EClass DBOOLEAN_LITERAL = eINSTANCE.getDBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBOOLEAN_LITERAL__VALUE = eINSTANCE.getDBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl <em>DString Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DStringLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDStringLiteral()
		 * @generated
		 */
		EClass DSTRING_LITERAL = eINSTANCE.getDStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSTRING_LITERAL__VALUE = eINSTANCE.getDStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl <em>DNatural Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DNaturalLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDNaturalLiteral()
		 * @generated
		 */
		EClass DNATURAL_LITERAL = eINSTANCE.getDNaturalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DNATURAL_LITERAL__VALUE = eINSTANCE.getDNaturalLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl <em>DDecimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DDecimalLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDecimalLiteral()
		 * @generated
		 */
		EClass DDECIMAL_LITERAL = eINSTANCE.getDDecimalLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDECIMAL_LITERAL__VALUE = eINSTANCE.getDDecimalLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl <em>DDate Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DDateLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDDateLiteral()
		 * @generated
		 */
		EClass DDATE_LITERAL = eINSTANCE.getDDateLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DDATE_LITERAL__VALUE = eINSTANCE.getDDateLiteral_Value();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl <em>DUndefined Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.impl.DUndefinedLiteralImpl
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUndefinedLiteral()
		 * @generated
		 */
		EClass DUNDEFINED_LITERAL = eINSTANCE.getDUndefinedLiteral();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DBinaryOperator <em>DBinary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DBinaryOperator
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDBinaryOperator()
		 * @generated
		 */
		EEnum DBINARY_OPERATOR = eINSTANCE.getDBinaryOperator();

		/**
		 * The meta object literal for the '{@link com.mimacom.ddd.dm.dmx.DUnaryOperator <em>DUnary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.mimacom.ddd.dm.dmx.DUnaryOperator
		 * @see com.mimacom.ddd.dm.dmx.impl.DmxPackageImpl#getDUnaryOperator()
		 * @generated
		 */
		EEnum DUNARY_OPERATOR = eINSTANCE.getDUnaryOperator();

	}

} //DmxPackage
