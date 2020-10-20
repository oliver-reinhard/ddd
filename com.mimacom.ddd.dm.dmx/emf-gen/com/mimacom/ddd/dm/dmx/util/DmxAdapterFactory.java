/**
 */
package com.mimacom.ddd.dm.dmx.util;

import com.mimacom.ddd.dm.base.base.DContext;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DSimpleType;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.IValueType;

import com.mimacom.ddd.dm.base.transpose.ITransposableElement;

import com.mimacom.ddd.dm.dmx.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.dmx.DmxPackage
 * @generated
 */
public class DmxAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DmxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmxAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = DmxPackage.eINSTANCE;
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
	protected DmxSwitch<Adapter> modelSwitch =
		new DmxSwitch<Adapter>()
		{
			@Override
			public Adapter caseDmxModel(DmxModel object)
			{
				return createDmxModelAdapter();
			}
			@Override
			public Adapter caseDmxTest(DmxTest object)
			{
				return createDmxTestAdapter();
			}
			@Override
			public Adapter caseDmxTestContext(DmxTestContext object)
			{
				return createDmxTestContextAdapter();
			}
			@Override
			public Adapter caseDmxBaseTypeSet(DmxBaseTypeSet object)
			{
				return createDmxBaseTypeSetAdapter();
			}
			@Override
			public Adapter caseDmxArchetype(DmxArchetype object)
			{
				return createDmxArchetypeAdapter();
			}
			@Override
			public Adapter caseDmxFilter(DmxFilter object)
			{
				return createDmxFilterAdapter();
			}
			@Override
			public Adapter caseDmxFilterTypeDescriptor(DmxFilterTypeDescriptor object)
			{
				return createDmxFilterTypeDescriptorAdapter();
			}
			@Override
			public Adapter caseDmxFilterParameter(DmxFilterParameter object)
			{
				return createDmxFilterParameterAdapter();
			}
			@Override
			public Adapter caseDmxAssignment(DmxAssignment object)
			{
				return createDmxAssignmentAdapter();
			}
			@Override
			public Adapter caseDmxPredicateWithCorrelationVariable(DmxPredicateWithCorrelationVariable object)
			{
				return createDmxPredicateWithCorrelationVariableAdapter();
			}
			@Override
			public Adapter caseDmxCorrelationVariable(DmxCorrelationVariable object)
			{
				return createDmxCorrelationVariableAdapter();
			}
			@Override
			public Adapter caseDmxMemberNavigation(DmxMemberNavigation object)
			{
				return createDmxMemberNavigationAdapter();
			}
			@Override
			public Adapter caseDmxCallArguments(DmxCallArguments object)
			{
				return createDmxCallArgumentsAdapter();
			}
			@Override
			public Adapter caseDmxFunctionCall(DmxFunctionCall object)
			{
				return createDmxFunctionCallAdapter();
			}
			@Override
			public Adapter caseDmxBinaryOperation(DmxBinaryOperation object)
			{
				return createDmxBinaryOperationAdapter();
			}
			@Override
			public Adapter caseDmxInstanceOfExpression(DmxInstanceOfExpression object)
			{
				return createDmxInstanceOfExpressionAdapter();
			}
			@Override
			public Adapter caseDmxUnaryOperation(DmxUnaryOperation object)
			{
				return createDmxUnaryOperationAdapter();
			}
			@Override
			public Adapter caseDmxCastExpression(DmxCastExpression object)
			{
				return createDmxCastExpressionAdapter();
			}
			@Override
			public Adapter caseDmxListExpression(DmxListExpression object)
			{
				return createDmxListExpressionAdapter();
			}
			@Override
			public Adapter caseDmxStaticReference(DmxStaticReference object)
			{
				return createDmxStaticReferenceAdapter();
			}
			@Override
			public Adapter caseDmxContextReference(DmxContextReference object)
			{
				return createDmxContextReferenceAdapter();
			}
			@Override
			public Adapter caseDmxIfExpression(DmxIfExpression object)
			{
				return createDmxIfExpressionAdapter();
			}
			@Override
			public Adapter caseDmxBooleanLiteral(DmxBooleanLiteral object)
			{
				return createDmxBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseDmxStringLiteral(DmxStringLiteral object)
			{
				return createDmxStringLiteralAdapter();
			}
			@Override
			public Adapter caseDmxNaturalLiteral(DmxNaturalLiteral object)
			{
				return createDmxNaturalLiteralAdapter();
			}
			@Override
			public Adapter caseDmxDecimalLiteral(DmxDecimalLiteral object)
			{
				return createDmxDecimalLiteralAdapter();
			}
			@Override
			public Adapter caseDmxDateLiteral(DmxDateLiteral object)
			{
				return createDmxDateLiteralAdapter();
			}
			@Override
			public Adapter caseDmxUrlLiteral(DmxUrlLiteral object)
			{
				return createDmxUrlLiteralAdapter();
			}
			@Override
			public Adapter caseDmxUndefinedLiteral(DmxUndefinedLiteral object)
			{
				return createDmxUndefinedLiteralAdapter();
			}
			@Override
			public Adapter caseDmxComplexObject(DmxComplexObject object)
			{
				return createDmxComplexObjectAdapter();
			}
			@Override
			public Adapter caseDmxField(DmxField object)
			{
				return createDmxFieldAdapter();
			}
			@Override
			public Adapter caseDmxEntity(DmxEntity object)
			{
				return createDmxEntityAdapter();
			}
			@Override
			public Adapter caseDmxDetail(DmxDetail object)
			{
				return createDmxDetailAdapter();
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
			public Adapter caseITypeContainer(ITypeContainer object)
			{
				return createITypeContainerAdapter();
			}
			@Override
			public Adapter caseINavigableMemberContainer(INavigableMemberContainer object)
			{
				return createINavigableMemberContainerAdapter();
			}
			@Override
			public Adapter caseDNavigableMember(DNavigableMember object)
			{
				return createDNavigableMemberAdapter();
			}
			@Override
			public Adapter caseDContext(DContext object)
			{
				return createDContextAdapter();
			}
			@Override
			public Adapter caseIStaticReferenceTarget(IStaticReferenceTarget object)
			{
				return createIStaticReferenceTargetAdapter();
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
			public Adapter caseITransposableElement(ITransposableElement object)
			{
				return createITransposableElementAdapter();
			}
			@Override
			public Adapter caseIRichTextSegment(IRichTextSegment object)
			{
				return createIRichTextSegmentAdapter();
			}
			@Override
			public Adapter caseDExpression(DExpression object)
			{
				return createDExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxModel
	 * @generated
	 */
	public Adapter createDmxModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxTest
	 * @generated
	 */
	public Adapter createDmxTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxTestContext <em>Test Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxTestContext
	 * @generated
	 */
	public Adapter createDmxTestContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxBaseTypeSet <em>Base Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxBaseTypeSet
	 * @generated
	 */
	public Adapter createDmxBaseTypeSetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxArchetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxArchetype
	 * @generated
	 */
	public Adapter createDmxArchetypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilter
	 * @generated
	 */
	public Adapter createDmxFilterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor <em>Filter Type Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor
	 * @generated
	 */
	public Adapter createDmxFilterTypeDescriptorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxFilterParameter <em>Filter Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxFilterParameter
	 * @generated
	 */
	public Adapter createDmxFilterParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxAssignment
	 * @generated
	 */
	public Adapter createDmxAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable <em>Predicate With Correlation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
	 * @generated
	 */
	public Adapter createDmxPredicateWithCorrelationVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxCorrelationVariable <em>Correlation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxCorrelationVariable
	 * @generated
	 */
	public Adapter createDmxCorrelationVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxMemberNavigation <em>Member Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxMemberNavigation
	 * @generated
	 */
	public Adapter createDmxMemberNavigationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxCallArguments <em>Call Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxCallArguments
	 * @generated
	 */
	public Adapter createDmxCallArgumentsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxFunctionCall
	 * @generated
	 */
	public Adapter createDmxFunctionCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxBinaryOperation <em>Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxBinaryOperation
	 * @generated
	 */
	public Adapter createDmxBinaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression <em>Instance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression
	 * @generated
	 */
	public Adapter createDmxInstanceOfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxUnaryOperation <em>Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxUnaryOperation
	 * @generated
	 */
	public Adapter createDmxUnaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxCastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxCastExpression
	 * @generated
	 */
	public Adapter createDmxCastExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxListExpression <em>List Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxListExpression
	 * @generated
	 */
	public Adapter createDmxListExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxStaticReference <em>Static Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxStaticReference
	 * @generated
	 */
	public Adapter createDmxStaticReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxContextReference <em>Context Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxContextReference
	 * @generated
	 */
	public Adapter createDmxContextReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxIfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxIfExpression
	 * @generated
	 */
	public Adapter createDmxIfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxBooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
	 * @generated
	 */
	public Adapter createDmxBooleanLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxStringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxStringLiteral
	 * @generated
	 */
	public Adapter createDmxStringLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxNaturalLiteral <em>Natural Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
	 * @generated
	 */
	public Adapter createDmxNaturalLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxDecimalLiteral <em>Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
	 * @generated
	 */
	public Adapter createDmxDecimalLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxDateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxDateLiteral
	 * @generated
	 */
	public Adapter createDmxDateLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxUrlLiteral <em>Url Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxUrlLiteral
	 * @generated
	 */
	public Adapter createDmxUrlLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral <em>Undefined Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
	 * @generated
	 */
	public Adapter createDmxUndefinedLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxComplexObject <em>Complex Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxComplexObject
	 * @generated
	 */
	public Adapter createDmxComplexObjectAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxField
	 * @generated
	 */
	public Adapter createDmxFieldAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxEntity
	 * @generated
	 */
	public Adapter createDmxEntityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DmxDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DmxDetail
	 * @generated
	 */
	public Adapter createDmxDetailAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DNamedElement <em>DNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DNamedElement
	 * @generated
	 */
	public Adapter createDNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DModel <em>DModel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DModel
	 * @generated
	 */
	public Adapter createDModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.ITypeContainer <em>IType Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.ITypeContainer
	 * @generated
	 */
	public Adapter createITypeContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.INavigableMemberContainer <em>INavigable Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.INavigableMemberContainer
	 * @generated
	 */
	public Adapter createINavigableMemberContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DNavigableMember <em>DNavigable Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DNavigableMember
	 * @generated
	 */
	public Adapter createDNavigableMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DContext <em>DContext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DContext
	 * @generated
	 */
	public Adapter createDContextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.IStaticReferenceTarget <em>IStatic Reference Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.IStaticReferenceTarget
	 * @generated
	 */
	public Adapter createIStaticReferenceTargetAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DType <em>DType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DType
	 * @generated
	 */
	public Adapter createDTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.IValueType <em>IValue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.IValueType
	 * @generated
	 */
	public Adapter createIValueTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DSimpleType <em>DSimple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DSimpleType
	 * @generated
	 */
	public Adapter createDSimpleTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DPrimitive <em>DPrimitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DPrimitive
	 * @generated
	 */
	public Adapter createDPrimitiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.transpose.ITransposableElement <em>ITransposable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.transpose.ITransposableElement
	 * @generated
	 */
	public Adapter createITransposableElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.IRichTextSegment <em>IRich Text Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.IRichTextSegment
	 * @generated
	 */
	public Adapter createIRichTextSegmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.base.DExpression <em>DExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.base.DExpression
	 * @generated
	 */
	public Adapter createDExpressionAdapter()
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

} //DmxAdapterFactory
