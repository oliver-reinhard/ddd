/**
 */
package com.mimacom.ddd.dm.base.transpose.util;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DInformationModel;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DSimpleType;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IAggregateContainer;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.IIdentityType;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.IValueType;

import com.mimacom.ddd.dm.base.transpose.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage
 * @generated
 */
public class TransposeSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransposePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransposeSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = TransposePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case TransposePackage.ITRANSPOSITION:
			{
				ITransposition iTransposition = (ITransposition)theEObject;
				T result = caseITransposition(iTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TTRANSPOSITION_RULE:
			{
				TTranspositionRule tTranspositionRule = (TTranspositionRule)theEObject;
				T result = caseTTranspositionRule(tTranspositionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.ITRANSPOSABLE_ELEMENT:
			{
				ITransposableElement iTransposableElement = (ITransposableElement)theEObject;
				T result = caseITransposableElement(iTransposableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.ISYNTHETIC_ELEMENT:
			{
				ISyntheticElement iSyntheticElement = (ISyntheticElement)theEObject;
				T result = caseISyntheticElement(iSyntheticElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TIMPLICIT_TRANSPOSITION:
			{
				TImplicitTransposition tImplicitTransposition = (TImplicitTransposition)theEObject;
				T result = caseTImplicitTransposition(tImplicitTransposition);
				if (result == null) result = caseITransposition(tImplicitTransposition);
				if (result == null) result = caseISyntheticElement(tImplicitTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TINFORMATION_MODEL:
			{
				TInformationModel tInformationModel = (TInformationModel)theEObject;
				T result = caseTInformationModel(tInformationModel);
				if (result == null) result = caseDInformationModel(tInformationModel);
				if (result == null) result = caseDModel(tInformationModel);
				if (result == null) result = caseIAggregateContainer(tInformationModel);
				if (result == null) result = caseITypeContainer(tInformationModel);
				if (result == null) result = caseIStaticReferenceTarget(tInformationModel);
				if (result == null) result = caseIDiagramRoot(tInformationModel);
				if (result == null) result = caseDNamedElement(tInformationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TTYPE_MAPPING:
			{
				TTypeMapping tTypeMapping = (TTypeMapping)theEObject;
				T result = caseTTypeMapping(tTypeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TAGGREGATE_TRANSPOSITION:
			{
				TAggregateTransposition tAggregateTransposition = (TAggregateTransposition)theEObject;
				T result = caseTAggregateTransposition(tAggregateTransposition);
				if (result == null) result = caseDAggregate(tAggregateTransposition);
				if (result == null) result = caseITransposition(tAggregateTransposition);
				if (result == null) result = caseITypeContainer(tAggregateTransposition);
				if (result == null) result = caseIFeatureContainer(tAggregateTransposition);
				if (result == null) result = caseINavigableMemberContainer(tAggregateTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tAggregateTransposition);
				if (result == null) result = caseIDiagramRoot(tAggregateTransposition);
				if (result == null) result = caseDNamedElement(tAggregateTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TTYPE_TRANSPOSITION:
			{
				TTypeTransposition tTypeTransposition = (TTypeTransposition)theEObject;
				T result = caseTTypeTransposition(tTypeTransposition);
				if (result == null) result = caseDType(tTypeTransposition);
				if (result == null) result = caseITransposition(tTypeTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tTypeTransposition);
				if (result == null) result = caseDNamedElement(tTypeTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TPRIMITIVE_TRANSPOSITION:
			{
				TPrimitiveTransposition tPrimitiveTransposition = (TPrimitiveTransposition)theEObject;
				T result = caseTPrimitiveTransposition(tPrimitiveTransposition);
				if (result == null) result = caseDPrimitive(tPrimitiveTransposition);
				if (result == null) result = caseTTypeTransposition(tPrimitiveTransposition);
				if (result == null) result = caseDSimpleType(tPrimitiveTransposition);
				if (result == null) result = caseITransposition(tPrimitiveTransposition);
				if (result == null) result = caseDType(tPrimitiveTransposition);
				if (result == null) result = caseIValueType(tPrimitiveTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tPrimitiveTransposition);
				if (result == null) result = caseDNamedElement(tPrimitiveTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TENUMERATION_TRANSPOSITION:
			{
				TEnumerationTransposition tEnumerationTransposition = (TEnumerationTransposition)theEObject;
				T result = caseTEnumerationTransposition(tEnumerationTransposition);
				if (result == null) result = caseDEnumeration(tEnumerationTransposition);
				if (result == null) result = caseTTypeTransposition(tEnumerationTransposition);
				if (result == null) result = caseDSimpleType(tEnumerationTransposition);
				if (result == null) result = caseINavigableMemberContainer(tEnumerationTransposition);
				if (result == null) result = caseITransposition(tEnumerationTransposition);
				if (result == null) result = caseDType(tEnumerationTransposition);
				if (result == null) result = caseIValueType(tEnumerationTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tEnumerationTransposition);
				if (result == null) result = caseDNamedElement(tEnumerationTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TLITERAL_TRANSPOSITION:
			{
				TLiteralTransposition tLiteralTransposition = (TLiteralTransposition)theEObject;
				T result = caseTLiteralTransposition(tLiteralTransposition);
				if (result == null) result = caseDLiteral(tLiteralTransposition);
				if (result == null) result = caseITransposition(tLiteralTransposition);
				if (result == null) result = caseDNavigableMember(tLiteralTransposition);
				if (result == null) result = caseDNamedElement(tLiteralTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TCOMPLEX_TYPE_TRANSPOSITION:
			{
				TComplexTypeTransposition tComplexTypeTransposition = (TComplexTypeTransposition)theEObject;
				T result = caseTComplexTypeTransposition(tComplexTypeTransposition);
				if (result == null) result = caseTTypeTransposition(tComplexTypeTransposition);
				if (result == null) result = caseDType(tComplexTypeTransposition);
				if (result == null) result = caseITransposition(tComplexTypeTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tComplexTypeTransposition);
				if (result == null) result = caseDNamedElement(tComplexTypeTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TDETAIL_TYPE_TRANSPOSITION:
			{
				TDetailTypeTransposition tDetailTypeTransposition = (TDetailTypeTransposition)theEObject;
				T result = caseTDetailTypeTransposition(tDetailTypeTransposition);
				if (result == null) result = caseDDetailType(tDetailTypeTransposition);
				if (result == null) result = caseTComplexTypeTransposition(tDetailTypeTransposition);
				if (result == null) result = caseDComplexType(tDetailTypeTransposition);
				if (result == null) result = caseIValueType(tDetailTypeTransposition);
				if (result == null) result = caseTTypeTransposition(tDetailTypeTransposition);
				if (result == null) result = caseDType(tDetailTypeTransposition);
				if (result == null) result = caseIFeatureContainer(tDetailTypeTransposition);
				if (result == null) result = caseINavigableMemberContainer(tDetailTypeTransposition);
				if (result == null) result = caseITransposition(tDetailTypeTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tDetailTypeTransposition);
				if (result == null) result = caseDNamedElement(tDetailTypeTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TENTITY_TYPE_TRANSPOSITION:
			{
				TEntityTypeTransposition tEntityTypeTransposition = (TEntityTypeTransposition)theEObject;
				T result = caseTEntityTypeTransposition(tEntityTypeTransposition);
				if (result == null) result = caseDEntityType(tEntityTypeTransposition);
				if (result == null) result = caseTComplexTypeTransposition(tEntityTypeTransposition);
				if (result == null) result = caseDComplexType(tEntityTypeTransposition);
				if (result == null) result = caseIIdentityType(tEntityTypeTransposition);
				if (result == null) result = caseTTypeTransposition(tEntityTypeTransposition);
				if (result == null) result = caseDType(tEntityTypeTransposition);
				if (result == null) result = caseIFeatureContainer(tEntityTypeTransposition);
				if (result == null) result = caseINavigableMemberContainer(tEntityTypeTransposition);
				if (result == null) result = caseITransposition(tEntityTypeTransposition);
				if (result == null) result = caseIStaticReferenceTarget(tEntityTypeTransposition);
				if (result == null) result = caseDNamedElement(tEntityTypeTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TFEATURE_TRANSPOSITION:
			{
				TFeatureTransposition tFeatureTransposition = (TFeatureTransposition)theEObject;
				T result = caseTFeatureTransposition(tFeatureTransposition);
				if (result == null) result = caseDFeature(tFeatureTransposition);
				if (result == null) result = caseITransposition(tFeatureTransposition);
				if (result == null) result = caseDNavigableMember(tFeatureTransposition);
				if (result == null) result = caseDNamedElement(tFeatureTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TASSOCIATION_TRANSPOSITION:
			{
				TAssociationTransposition tAssociationTransposition = (TAssociationTransposition)theEObject;
				T result = caseTAssociationTransposition(tAssociationTransposition);
				if (result == null) result = caseDAssociation(tAssociationTransposition);
				if (result == null) result = caseTFeatureTransposition(tAssociationTransposition);
				if (result == null) result = caseDFeature(tAssociationTransposition);
				if (result == null) result = caseITransposition(tAssociationTransposition);
				if (result == null) result = caseDNavigableMember(tAssociationTransposition);
				if (result == null) result = caseDNamedElement(tAssociationTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TATTRIBUTE_TRANSPOSITION:
			{
				TAttributeTransposition tAttributeTransposition = (TAttributeTransposition)theEObject;
				T result = caseTAttributeTransposition(tAttributeTransposition);
				if (result == null) result = caseDAttribute(tAttributeTransposition);
				if (result == null) result = caseTFeatureTransposition(tAttributeTransposition);
				if (result == null) result = caseDFeature(tAttributeTransposition);
				if (result == null) result = caseITransposition(tAttributeTransposition);
				if (result == null) result = caseDNavigableMember(tAttributeTransposition);
				if (result == null) result = caseDNamedElement(tAttributeTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TQUERY_TRANSPOSITION:
			{
				TQueryTransposition tQueryTransposition = (TQueryTransposition)theEObject;
				T result = caseTQueryTransposition(tQueryTransposition);
				if (result == null) result = caseDQuery(tQueryTransposition);
				if (result == null) result = caseTFeatureTransposition(tQueryTransposition);
				if (result == null) result = caseDFeature(tQueryTransposition);
				if (result == null) result = caseINavigableMemberContainer(tQueryTransposition);
				if (result == null) result = caseITransposition(tQueryTransposition);
				if (result == null) result = caseDNavigableMember(tQueryTransposition);
				if (result == null) result = caseDNamedElement(tQueryTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TQUERY_PARAMETER_TRANSPOSITION:
			{
				TQueryParameterTransposition tQueryParameterTransposition = (TQueryParameterTransposition)theEObject;
				T result = caseTQueryParameterTransposition(tQueryParameterTransposition);
				if (result == null) result = caseDQueryParameter(tQueryParameterTransposition);
				if (result == null) result = caseITransposition(tQueryParameterTransposition);
				if (result == null) result = caseDNavigableMember(tQueryParameterTransposition);
				if (result == null) result = caseDNamedElement(tQueryParameterTransposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TRENAME_RULE:
			{
				TRenameRule tRenameRule = (TRenameRule)theEObject;
				T result = caseTRenameRule(tRenameRule);
				if (result == null) result = caseTTranspositionRule(tRenameRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TGRAB_RULE:
			{
				TGrabRule tGrabRule = (TGrabRule)theEObject;
				T result = caseTGrabRule(tGrabRule);
				if (result == null) result = caseTRenameRule(tGrabRule);
				if (result == null) result = caseTTranspositionRule(tGrabRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TDITCH_RULE:
			{
				TDitchRule tDitchRule = (TDitchRule)theEObject;
				T result = caseTDitchRule(tDitchRule);
				if (result == null) result = caseTTranspositionRule(tDitchRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TSTRUCTURE_CHANGING_RULE:
			{
				TStructureChangingRule tStructureChangingRule = (TStructureChangingRule)theEObject;
				T result = caseTStructureChangingRule(tStructureChangingRule);
				if (result == null) result = caseTRenameRule(tStructureChangingRule);
				if (result == null) result = caseTTranspositionRule(tStructureChangingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TMORPH_RULE:
			{
				TMorphRule tMorphRule = (TMorphRule)theEObject;
				T result = caseTMorphRule(tMorphRule);
				if (result == null) result = caseTStructureChangingRule(tMorphRule);
				if (result == null) result = caseTRenameRule(tMorphRule);
				if (result == null) result = caseTTranspositionRule(tMorphRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TFUSE_RULE:
			{
				TFuseRule tFuseRule = (TFuseRule)theEObject;
				T result = caseTFuseRule(tFuseRule);
				if (result == null) result = caseTStructureChangingRule(tFuseRule);
				if (result == null) result = caseTRenameRule(tFuseRule);
				if (result == null) result = caseTTranspositionRule(tFuseRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TransposePackage.TGRAB_AGGREGATE_RULE:
			{
				TGrabAggregateRule tGrabAggregateRule = (TGrabAggregateRule)theEObject;
				T result = caseTGrabAggregateRule(tGrabAggregateRule);
				if (result == null) result = caseTRenameRule(tGrabAggregateRule);
				if (result == null) result = caseTTranspositionRule(tGrabAggregateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITransposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITransposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITransposition(ITransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTransposition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTransposition Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTranspositionRule(TTranspositionRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITransposable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITransposable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITransposableElement(ITransposableElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISynthetic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISynthetic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISyntheticElement(ISyntheticElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImplicit Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImplicit Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImplicitTransposition(TImplicitTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInformation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInformationModel(TInformationModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TType Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TType Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTypeMapping(TTypeMapping object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAggregate Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAggregate Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAggregateTransposition(TAggregateTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TType Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TType Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTypeTransposition(TTypeTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPrimitive Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPrimitive Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPrimitiveTransposition(TPrimitiveTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEnumeration Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEnumeration Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEnumerationTransposition(TEnumerationTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLiteral Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLiteral Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLiteralTransposition(TLiteralTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TComplex Type Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TComplex Type Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTComplexTypeTransposition(TComplexTypeTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDetail Type Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDetail Type Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDetailTypeTransposition(TDetailTypeTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntity Type Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntity Type Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntityTypeTransposition(TEntityTypeTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFeature Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFeature Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFeatureTransposition(TFeatureTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAssociation Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAssociation Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAssociationTransposition(TAssociationTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAttribute Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAttribute Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAttributeTransposition(TAttributeTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TQuery Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TQuery Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTQueryTransposition(TQueryTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TQuery Parameter Transposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TQuery Parameter Transposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTQueryParameterTransposition(TQueryParameterTransposition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRename Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRename Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRenameRule(TRenameRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGrab Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGrab Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGrabRule(TGrabRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDitch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDitch Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDitchRule(TDitchRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TStructure Changing Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TStructure Changing Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTStructureChangingRule(TStructureChangingRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMorph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMorph Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMorphRule(TMorphRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFuse Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFuse Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFuseRule(TFuseRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGrab Aggregate Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGrab Aggregate Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGrabAggregateRule(TGrabAggregateRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNamedElement(DNamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDModel(DModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAggregate Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAggregate Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAggregateContainer(IAggregateContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypeContainer(ITypeContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStatic Reference Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStatic Reference Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaticReferenceTarget(IStaticReferenceTarget object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDiagram Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDiagram Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDiagramRoot(IDiagramRoot object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DInformation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDInformationModel(DInformationModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFeature Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFeature Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFeatureContainer(IFeatureContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INavigable Member Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INavigable Member Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINavigableMemberContainer(INavigableMemberContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAggregate(DAggregate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDType(DType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IValue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IValue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIValueType(IValueType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSimple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSimple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSimpleType(DSimpleType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DPrimitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDPrimitive(DPrimitive object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEnumeration(DEnumeration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DNavigable Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNavigable Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNavigableMember(DNavigableMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDLiteral(DLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DComplex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DComplex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDComplexType(DComplexType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDetail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDetail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDetailType(DDetailType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IIdentity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IIdentity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIIdentityType(IIdentityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEntity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEntityType(DEntityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFeature(DFeature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAssociation(DAssociation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAttribute(DAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQuery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQuery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQuery(DQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQuery Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQuery Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQueryParameter(DQueryParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //TransposeSwitch
