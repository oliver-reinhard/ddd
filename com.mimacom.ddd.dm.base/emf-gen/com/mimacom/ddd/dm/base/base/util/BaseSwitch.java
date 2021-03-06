/**
 */
package com.mimacom.ddd.dm.base.base.util;

import com.mimacom.ddd.dm.base.base.*;

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
 * @see com.mimacom.ddd.dm.base.base.BasePackage
 * @generated
 */
public class BaseSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = BasePackage.eINSTANCE;
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
			case BasePackage.IRICH_TEXT_SEGMENT:
			{
				IRichTextSegment iRichTextSegment = (IRichTextSegment)theEObject;
				T result = caseIRichTextSegment(iRichTextSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DTEXT_SEGMENT:
			{
				DTextSegment dTextSegment = (DTextSegment)theEObject;
				T result = caseDTextSegment(dTextSegment);
				if (result == null) result = caseIRichTextSegment(dTextSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DEXPRESSION:
			{
				DExpression dExpression = (DExpression)theEObject;
				T result = caseDExpression(dExpression);
				if (result == null) result = caseIRichTextSegment(dExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DRICH_TEXT:
			{
				DRichText dRichText = (DRichText)theEObject;
				T result = caseDRichText(dRichText);
				if (result == null) result = caseDExpression(dRichText);
				if (result == null) result = caseIRichTextSegment(dRichText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNAMED_ELEMENT:
			{
				DNamedElement dNamedElement = (DNamedElement)theEObject;
				T result = caseDNamedElement(dNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNOTE:
			{
				DNote dNote = (DNote)theEObject;
				T result = caseDNote(dNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.INOTE_CONTAINER:
			{
				INoteContainer iNoteContainer = (INoteContainer)theEObject;
				T result = caseINoteContainer(iNoteContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DIMPORT:
			{
				DImport dImport = (DImport)theEObject;
				T result = caseDImport(dImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DMODEL:
			{
				DModel dModel = (DModel)theEObject;
				T result = caseDModel(dModel);
				if (result == null) result = caseDNamedElement(dModel);
				if (result == null) result = caseINoteContainer(dModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNAMESPACE:
			{
				DNamespace dNamespace = (DNamespace)theEObject;
				T result = caseDNamespace(dNamespace);
				if (result == null) result = caseDNamedElement(dNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IDIAGRAM_ROOT:
			{
				IDiagramRoot iDiagramRoot = (IDiagramRoot)theEObject;
				T result = caseIDiagramRoot(iDiagramRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ISTATIC_REFERENCE_TARGET:
			{
				IStaticReferenceTarget iStaticReferenceTarget = (IStaticReferenceTarget)theEObject;
				T result = caseIStaticReferenceTarget(iStaticReferenceTarget);
				if (result == null) result = caseDNamedElement(iStaticReferenceTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DINFORMATION_MODEL:
			{
				DInformationModel dInformationModel = (DInformationModel)theEObject;
				T result = caseDInformationModel(dInformationModel);
				if (result == null) result = caseDModel(dInformationModel);
				if (result == null) result = caseIAggregateContainer(dInformationModel);
				if (result == null) result = caseITypeContainer(dInformationModel);
				if (result == null) result = caseIStaticReferenceTarget(dInformationModel);
				if (result == null) result = caseIDiagramRoot(dInformationModel);
				if (result == null) result = caseDNamedElement(dInformationModel);
				if (result == null) result = caseINoteContainer(dInformationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IAGGREGATE_CONTAINER:
			{
				IAggregateContainer iAggregateContainer = (IAggregateContainer)theEObject;
				T result = caseIAggregateContainer(iAggregateContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ITYPE_CONTAINER:
			{
				ITypeContainer iTypeContainer = (ITypeContainer)theEObject;
				T result = caseITypeContainer(iTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IFEATURE_CONTAINER:
			{
				IFeatureContainer iFeatureContainer = (IFeatureContainer)theEObject;
				T result = caseIFeatureContainer(iFeatureContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DAGGREGATE:
			{
				DAggregate dAggregate = (DAggregate)theEObject;
				T result = caseDAggregate(dAggregate);
				if (result == null) result = caseINoteContainer(dAggregate);
				if (result == null) result = caseITypeContainer(dAggregate);
				if (result == null) result = caseIFeatureContainer(dAggregate);
				if (result == null) result = caseINavigableMemberContainer(dAggregate);
				if (result == null) result = caseIStaticReferenceTarget(dAggregate);
				if (result == null) result = caseIDiagramRoot(dAggregate);
				if (result == null) result = caseDNamedElement(dAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNAVIGABLE_MEMBER:
			{
				DNavigableMember dNavigableMember = (DNavigableMember)theEObject;
				T result = caseDNavigableMember(dNavigableMember);
				if (result == null) result = caseDNamedElement(dNavigableMember);
				if (result == null) result = caseINoteContainer(dNavigableMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.INAVIGABLE_MEMBER_CONTAINER:
			{
				INavigableMemberContainer iNavigableMemberContainer = (INavigableMemberContainer)theEObject;
				T result = caseINavigableMemberContainer(iNavigableMemberContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCONTEXT:
			{
				DContext dContext = (DContext)theEObject;
				T result = caseDContext(dContext);
				if (result == null) result = caseDNavigableMember(dContext);
				if (result == null) result = caseDNamedElement(dContext);
				if (result == null) result = caseINoteContainer(dContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DMULTIPLICITY:
			{
				DMultiplicity dMultiplicity = (DMultiplicity)theEObject;
				T result = caseDMultiplicity(dMultiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IIDENTITY_TYPE:
			{
				IIdentityType iIdentityType = (IIdentityType)theEObject;
				T result = caseIIdentityType(iIdentityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IVALUE_TYPE:
			{
				IValueType iValueType = (IValueType)theEObject;
				T result = caseIValueType(iValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DTYPE:
			{
				DType dType = (DType)theEObject;
				T result = caseDType(dType);
				if (result == null) result = caseINoteContainer(dType);
				if (result == null) result = caseIStaticReferenceTarget(dType);
				if (result == null) result = caseDNamedElement(dType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNAMED_PREDICATE:
			{
				DNamedPredicate dNamedPredicate = (DNamedPredicate)theEObject;
				T result = caseDNamedPredicate(dNamedPredicate);
				if (result == null) result = caseDNamedElement(dNamedPredicate);
				if (result == null) result = caseINoteContainer(dNamedPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSIMPLE_TYPE:
			{
				DSimpleType dSimpleType = (DSimpleType)theEObject;
				T result = caseDSimpleType(dSimpleType);
				if (result == null) result = caseDType(dSimpleType);
				if (result == null) result = caseIValueType(dSimpleType);
				if (result == null) result = caseINoteContainer(dSimpleType);
				if (result == null) result = caseIStaticReferenceTarget(dSimpleType);
				if (result == null) result = caseDNamedElement(dSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DPRIMITIVE:
			{
				DPrimitive dPrimitive = (DPrimitive)theEObject;
				T result = caseDPrimitive(dPrimitive);
				if (result == null) result = caseDSimpleType(dPrimitive);
				if (result == null) result = caseDType(dPrimitive);
				if (result == null) result = caseIValueType(dPrimitive);
				if (result == null) result = caseINoteContainer(dPrimitive);
				if (result == null) result = caseIStaticReferenceTarget(dPrimitive);
				if (result == null) result = caseDNamedElement(dPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DENUMERATION:
			{
				DEnumeration dEnumeration = (DEnumeration)theEObject;
				T result = caseDEnumeration(dEnumeration);
				if (result == null) result = caseDSimpleType(dEnumeration);
				if (result == null) result = caseINavigableMemberContainer(dEnumeration);
				if (result == null) result = caseDType(dEnumeration);
				if (result == null) result = caseIValueType(dEnumeration);
				if (result == null) result = caseINoteContainer(dEnumeration);
				if (result == null) result = caseIStaticReferenceTarget(dEnumeration);
				if (result == null) result = caseDNamedElement(dEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DLITERAL:
			{
				DLiteral dLiteral = (DLiteral)theEObject;
				T result = caseDLiteral(dLiteral);
				if (result == null) result = caseDNavigableMember(dLiteral);
				if (result == null) result = caseDNamedElement(dLiteral);
				if (result == null) result = caseINoteContainer(dLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCOMPLEX_TYPE:
			{
				DComplexType dComplexType = (DComplexType)theEObject;
				T result = caseDComplexType(dComplexType);
				if (result == null) result = caseDType(dComplexType);
				if (result == null) result = caseIFeatureContainer(dComplexType);
				if (result == null) result = caseINavigableMemberContainer(dComplexType);
				if (result == null) result = caseINoteContainer(dComplexType);
				if (result == null) result = caseIStaticReferenceTarget(dComplexType);
				if (result == null) result = caseDNamedElement(dComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DDETAIL_TYPE:
			{
				DDetailType dDetailType = (DDetailType)theEObject;
				T result = caseDDetailType(dDetailType);
				if (result == null) result = caseDComplexType(dDetailType);
				if (result == null) result = caseIValueType(dDetailType);
				if (result == null) result = caseDType(dDetailType);
				if (result == null) result = caseIFeatureContainer(dDetailType);
				if (result == null) result = caseINavigableMemberContainer(dDetailType);
				if (result == null) result = caseINoteContainer(dDetailType);
				if (result == null) result = caseIStaticReferenceTarget(dDetailType);
				if (result == null) result = caseDNamedElement(dDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DENTITY_TYPE:
			{
				DEntityType dEntityType = (DEntityType)theEObject;
				T result = caseDEntityType(dEntityType);
				if (result == null) result = caseDComplexType(dEntityType);
				if (result == null) result = caseIIdentityType(dEntityType);
				if (result == null) result = caseDType(dEntityType);
				if (result == null) result = caseIFeatureContainer(dEntityType);
				if (result == null) result = caseINavigableMemberContainer(dEntityType);
				if (result == null) result = caseINoteContainer(dEntityType);
				if (result == null) result = caseIStaticReferenceTarget(dEntityType);
				if (result == null) result = caseDNamedElement(dEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DFEATURE:
			{
				DFeature dFeature = (DFeature)theEObject;
				T result = caseDFeature(dFeature);
				if (result == null) result = caseDNavigableMember(dFeature);
				if (result == null) result = caseDNamedElement(dFeature);
				if (result == null) result = caseINoteContainer(dFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DASSOCIATION:
			{
				DAssociation dAssociation = (DAssociation)theEObject;
				T result = caseDAssociation(dAssociation);
				if (result == null) result = caseDFeature(dAssociation);
				if (result == null) result = caseDNavigableMember(dAssociation);
				if (result == null) result = caseDNamedElement(dAssociation);
				if (result == null) result = caseINoteContainer(dAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DATTRIBUTE:
			{
				DAttribute dAttribute = (DAttribute)theEObject;
				T result = caseDAttribute(dAttribute);
				if (result == null) result = caseDFeature(dAttribute);
				if (result == null) result = caseDNavigableMember(dAttribute);
				if (result == null) result = caseDNamedElement(dAttribute);
				if (result == null) result = caseINoteContainer(dAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCOMPLEX_TYPE_PROXY_DUMMY:
			{
				DComplexTypeProxyDummy dComplexTypeProxyDummy = (DComplexTypeProxyDummy)theEObject;
				T result = caseDComplexTypeProxyDummy(dComplexTypeProxyDummy);
				if (result == null) result = caseDComplexType(dComplexTypeProxyDummy);
				if (result == null) result = caseDType(dComplexTypeProxyDummy);
				if (result == null) result = caseIFeatureContainer(dComplexTypeProxyDummy);
				if (result == null) result = caseINavigableMemberContainer(dComplexTypeProxyDummy);
				if (result == null) result = caseINoteContainer(dComplexTypeProxyDummy);
				if (result == null) result = caseIStaticReferenceTarget(dComplexTypeProxyDummy);
				if (result == null) result = caseDNamedElement(dComplexTypeProxyDummy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DFEATURE_PROXY_DUMMY:
			{
				DFeatureProxyDummy dFeatureProxyDummy = (DFeatureProxyDummy)theEObject;
				T result = caseDFeatureProxyDummy(dFeatureProxyDummy);
				if (result == null) result = caseDFeature(dFeatureProxyDummy);
				if (result == null) result = caseDNavigableMember(dFeatureProxyDummy);
				if (result == null) result = caseDNamedElement(dFeatureProxyDummy);
				if (result == null) result = caseINoteContainer(dFeatureProxyDummy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DQUERY:
			{
				DQuery dQuery = (DQuery)theEObject;
				T result = caseDQuery(dQuery);
				if (result == null) result = caseDFeature(dQuery);
				if (result == null) result = caseINavigableMemberContainer(dQuery);
				if (result == null) result = caseDNavigableMember(dQuery);
				if (result == null) result = caseDNamedElement(dQuery);
				if (result == null) result = caseINoteContainer(dQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DQUERY_PARAMETER:
			{
				DQueryParameter dQueryParameter = (DQueryParameter)theEObject;
				T result = caseDQueryParameter(dQueryParameter);
				if (result == null) result = caseDNavigableMember(dQueryParameter);
				if (result == null) result = caseDNamedElement(dQueryParameter);
				if (result == null) result = caseINoteContainer(dQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSTATE:
			{
				DState dState = (DState)theEObject;
				T result = caseDState(dState);
				if (result == null) result = caseDNavigableMember(dState);
				if (result == null) result = caseDNamedElement(dState);
				if (result == null) result = caseINoteContainer(dState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSTATE_EVENT:
			{
				DStateEvent dStateEvent = (DStateEvent)theEObject;
				T result = caseDStateEvent(dStateEvent);
				if (result == null) result = caseDNamedElement(dStateEvent);
				if (result == null) result = caseINoteContainer(dStateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRich Text Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRichTextSegment(IRichTextSegment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DText Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DText Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTextSegment(DTextSegment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDExpression(DExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DRich Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DRich Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDRichText(DRichText object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DNote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNote(DNote object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INote Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INote Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINoteContainer(INoteContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DImport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DImport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDImport(DImport object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DNamespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNamespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNamespace(DNamespace object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDContext(DContext object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMultiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMultiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMultiplicity(DMultiplicity object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DNamed Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNamed Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNamedPredicate(DNamedPredicate object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DComplex Type Proxy Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DComplex Type Proxy Dummy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDComplexTypeProxyDummy(DComplexTypeProxyDummy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFeature Proxy Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFeature Proxy Dummy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFeatureProxyDummy(DFeatureProxyDummy object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DState</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DState</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDState(DState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DState Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DState Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDStateEvent(DStateEvent object)
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

} //BaseSwitch
