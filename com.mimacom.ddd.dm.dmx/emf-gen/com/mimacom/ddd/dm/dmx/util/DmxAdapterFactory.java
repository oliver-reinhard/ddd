/**
 */
package com.mimacom.ddd.dm.dmx.util;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.IRichTextElement;

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
			public Adapter caseDAssignment(DAssignment object)
			{
				return createDAssignmentAdapter();
			}
			@Override
			public Adapter caseDBinaryOperation(DBinaryOperation object)
			{
				return createDBinaryOperationAdapter();
			}
			@Override
			public Adapter caseDInstanceOfExpression(DInstanceOfExpression object)
			{
				return createDInstanceOfExpressionAdapter();
			}
			@Override
			public Adapter caseDUnaryOperation(DUnaryOperation object)
			{
				return createDUnaryOperationAdapter();
			}
			@Override
			public Adapter caseDTypedMemberReference(DTypedMemberReference object)
			{
				return createDTypedMemberReferenceAdapter();
			}
			@Override
			public Adapter caseDCastExpression(DCastExpression object)
			{
				return createDCastExpressionAdapter();
			}
			@Override
			public Adapter caseDSelfExpression(DSelfExpression object)
			{
				return createDSelfExpressionAdapter();
			}
			@Override
			public Adapter caseDReturnExpression(DReturnExpression object)
			{
				return createDReturnExpressionAdapter();
			}
			@Override
			public Adapter caseDRaiseExpression(DRaiseExpression object)
			{
				return createDRaiseExpressionAdapter();
			}
			@Override
			public Adapter caseDFunctionCall(DFunctionCall object)
			{
				return createDFunctionCallAdapter();
			}
			@Override
			public Adapter caseDConstructorCall(DConstructorCall object)
			{
				return createDConstructorCallAdapter();
			}
			@Override
			public Adapter caseDContextReference(DContextReference object)
			{
				return createDContextReferenceAdapter();
			}
			@Override
			public Adapter caseDIfExpression(DIfExpression object)
			{
				return createDIfExpressionAdapter();
			}
			@Override
			public Adapter caseDForLoopExpression(DForLoopExpression object)
			{
				return createDForLoopExpressionAdapter();
			}
			@Override
			public Adapter caseDBooleanLiteral(DBooleanLiteral object)
			{
				return createDBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseDStringLiteral(DStringLiteral object)
			{
				return createDStringLiteralAdapter();
			}
			@Override
			public Adapter caseDNaturalLiteral(DNaturalLiteral object)
			{
				return createDNaturalLiteralAdapter();
			}
			@Override
			public Adapter caseDDecimalLiteral(DDecimalLiteral object)
			{
				return createDDecimalLiteralAdapter();
			}
			@Override
			public Adapter caseDDateLiteral(DDateLiteral object)
			{
				return createDDateLiteralAdapter();
			}
			@Override
			public Adapter caseDNilLiteral(DNilLiteral object)
			{
				return createDNilLiteralAdapter();
			}
			@Override
			public Adapter caseIRichTextElement(IRichTextElement object)
			{
				return createIRichTextElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DAssignment <em>DAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DAssignment
	 * @generated
	 */
	public Adapter createDAssignmentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DBinaryOperation <em>DBinary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DBinaryOperation
	 * @generated
	 */
	public Adapter createDBinaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DInstanceOfExpression <em>DInstance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DInstanceOfExpression
	 * @generated
	 */
	public Adapter createDInstanceOfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DUnaryOperation <em>DUnary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DUnaryOperation
	 * @generated
	 */
	public Adapter createDUnaryOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DTypedMemberReference <em>DTyped Member Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DTypedMemberReference
	 * @generated
	 */
	public Adapter createDTypedMemberReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DCastExpression <em>DCast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DCastExpression
	 * @generated
	 */
	public Adapter createDCastExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DSelfExpression <em>DSelf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DSelfExpression
	 * @generated
	 */
	public Adapter createDSelfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DReturnExpression <em>DReturn Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DReturnExpression
	 * @generated
	 */
	public Adapter createDReturnExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DRaiseExpression <em>DRaise Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DRaiseExpression
	 * @generated
	 */
	public Adapter createDRaiseExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DFunctionCall <em>DFunction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DFunctionCall
	 * @generated
	 */
	public Adapter createDFunctionCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DConstructorCall <em>DConstructor Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DConstructorCall
	 * @generated
	 */
	public Adapter createDConstructorCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DContextReference <em>DContext Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DContextReference
	 * @generated
	 */
	public Adapter createDContextReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DIfExpression <em>DIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DIfExpression
	 * @generated
	 */
	public Adapter createDIfExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DForLoopExpression <em>DFor Loop Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DForLoopExpression
	 * @generated
	 */
	public Adapter createDForLoopExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DBooleanLiteral <em>DBoolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DBooleanLiteral
	 * @generated
	 */
	public Adapter createDBooleanLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DStringLiteral <em>DString Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DStringLiteral
	 * @generated
	 */
	public Adapter createDStringLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DNaturalLiteral <em>DNatural Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DNaturalLiteral
	 * @generated
	 */
	public Adapter createDNaturalLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DDecimalLiteral <em>DDecimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DDecimalLiteral
	 * @generated
	 */
	public Adapter createDDecimalLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DDateLiteral <em>DDate Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DDateLiteral
	 * @generated
	 */
	public Adapter createDDateLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.dmx.DNilLiteral <em>DNil Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.dmx.DNilLiteral
	 * @generated
	 */
	public Adapter createDNilLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.IRichTextElement <em>IRich Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.IRichTextElement
	 * @generated
	 */
	public Adapter createIRichTextElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.mimacom.ddd.dm.base.DExpression <em>DExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.mimacom.ddd.dm.base.DExpression
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
