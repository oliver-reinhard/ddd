/**
 */
package com.mimacom.ddd.dm.base.util;

import com.mimacom.ddd.dm.base.*;

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
 * @see com.mimacom.ddd.dm.base.BasePackage
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
			case BasePackage.INAMESPACE:
			{
				INamespace iNamespace = (INamespace)theEObject;
				T result = caseINamespace(iNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ITYPE_CONTAINER:
			{
				ITypeContainer iTypeContainer = (ITypeContainer)theEObject;
				T result = caseITypeContainer(iTypeContainer);
				if (result == null) result = caseINamespace(iTypeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IDEDUCTION_DEFINITION:
			{
				IDeductionDefinition iDeductionDefinition = (IDeductionDefinition)theEObject;
				T result = caseIDeductionDefinition(iDeductionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IDEDUCIBLE_ELEMENT:
			{
				IDeducibleElement iDeducibleElement = (IDeducibleElement)theEObject;
				T result = caseIDeducibleElement(iDeducibleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DDEDUCTION_RULE:
			{
				DDeductionRule dDeductionRule = (DDeductionRule)theEObject;
				T result = caseDDeductionRule(dDeductionRule);
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
			case BasePackage.DNAVIGABLE_MEMBER:
			{
				DNavigableMember dNavigableMember = (DNavigableMember)theEObject;
				T result = caseDNavigableMember(dNavigableMember);
				if (result == null) result = caseDNamedElement(dNavigableMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.INAVIGABLE_MEMBER_CONTAINER:
			{
				INavigableMemberContainer iNavigableMemberContainer = (INavigableMemberContainer)theEObject;
				T result = caseINavigableMemberContainer(iNavigableMemberContainer);
				if (result == null) result = caseINamespace(iNavigableMemberContainer);
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
			case BasePackage.DIMPORT:
			{
				DImport dImport = (DImport)theEObject;
				T result = caseDImport(dImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DDOMAIN:
			{
				DDomain dDomain = (DDomain)theEObject;
				T result = caseDDomain(dDomain);
				if (result == null) result = caseITypeContainer(dDomain);
				if (result == null) result = caseIStaticReferenceTarget(dDomain);
				if (result == null) result = caseIDeducibleElement(dDomain);
				if (result == null) result = caseDNamedElement(dDomain);
				if (result == null) result = caseINamespace(dDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DAGGREGATE:
			{
				DAggregate dAggregate = (DAggregate)theEObject;
				T result = caseDAggregate(dAggregate);
				if (result == null) result = caseITypeContainer(dAggregate);
				if (result == null) result = caseIDeducibleElement(dAggregate);
				if (result == null) result = caseINamespace(dAggregate);
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
				if (result == null) result = caseIDeducibleElement(dType);
				if (result == null) result = caseIStaticReferenceTarget(dType);
				if (result == null) result = caseDNamedElement(dType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCONDITION:
			{
				DCondition dCondition = (DCondition)theEObject;
				T result = caseDCondition(dCondition);
				if (result == null) result = caseDNamedElement(dCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSIMPLE_TYPE:
			{
				DSimpleType dSimpleType = (DSimpleType)theEObject;
				T result = caseDSimpleType(dSimpleType);
				if (result == null) result = caseDType(dSimpleType);
				if (result == null) result = caseIValueType(dSimpleType);
				if (result == null) result = caseIDeducibleElement(dSimpleType);
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
				if (result == null) result = caseIDeducibleElement(dPrimitive);
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
				if (result == null) result = caseINamespace(dEnumeration);
				if (result == null) result = caseIDeducibleElement(dEnumeration);
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
				if (result == null) result = caseIDeducibleElement(dLiteral);
				if (result == null) result = caseDNamedElement(dLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCOMPLEX_TYPE:
			{
				DComplexType dComplexType = (DComplexType)theEObject;
				T result = caseDComplexType(dComplexType);
				if (result == null) result = caseDType(dComplexType);
				if (result == null) result = caseINavigableMemberContainer(dComplexType);
				if (result == null) result = caseIDeducibleElement(dComplexType);
				if (result == null) result = caseIStaticReferenceTarget(dComplexType);
				if (result == null) result = caseINamespace(dComplexType);
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
				if (result == null) result = caseINavigableMemberContainer(dDetailType);
				if (result == null) result = caseIDeducibleElement(dDetailType);
				if (result == null) result = caseIStaticReferenceTarget(dDetailType);
				if (result == null) result = caseINamespace(dDetailType);
				if (result == null) result = caseDNamedElement(dDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DIDENTITY_TYPE:
			{
				DIdentityType dIdentityType = (DIdentityType)theEObject;
				T result = caseDIdentityType(dIdentityType);
				if (result == null) result = caseDComplexType(dIdentityType);
				if (result == null) result = caseIIdentityType(dIdentityType);
				if (result == null) result = caseDType(dIdentityType);
				if (result == null) result = caseINavigableMemberContainer(dIdentityType);
				if (result == null) result = caseIDeducibleElement(dIdentityType);
				if (result == null) result = caseIStaticReferenceTarget(dIdentityType);
				if (result == null) result = caseINamespace(dIdentityType);
				if (result == null) result = caseDNamedElement(dIdentityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IIDENTITY_STATE_MODEL:
			{
				IIdentityStateModel iIdentityStateModel = (IIdentityStateModel)theEObject;
				T result = caseIIdentityStateModel(iIdentityStateModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DENTITY_TYPE:
			{
				DEntityType dEntityType = (DEntityType)theEObject;
				T result = caseDEntityType(dEntityType);
				if (result == null) result = caseDIdentityType(dEntityType);
				if (result == null) result = caseDComplexType(dEntityType);
				if (result == null) result = caseIIdentityType(dEntityType);
				if (result == null) result = caseDType(dEntityType);
				if (result == null) result = caseINavigableMemberContainer(dEntityType);
				if (result == null) result = caseIDeducibleElement(dEntityType);
				if (result == null) result = caseIStaticReferenceTarget(dEntityType);
				if (result == null) result = caseINamespace(dEntityType);
				if (result == null) result = caseDNamedElement(dEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DRELATIONSHIP:
			{
				DRelationship dRelationship = (DRelationship)theEObject;
				T result = caseDRelationship(dRelationship);
				if (result == null) result = caseDIdentityType(dRelationship);
				if (result == null) result = caseDComplexType(dRelationship);
				if (result == null) result = caseIIdentityType(dRelationship);
				if (result == null) result = caseDType(dRelationship);
				if (result == null) result = caseINavigableMemberContainer(dRelationship);
				if (result == null) result = caseIDeducibleElement(dRelationship);
				if (result == null) result = caseIStaticReferenceTarget(dRelationship);
				if (result == null) result = caseINamespace(dRelationship);
				if (result == null) result = caseDNamedElement(dRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DFEATURE:
			{
				DFeature dFeature = (DFeature)theEObject;
				T result = caseDFeature(dFeature);
				if (result == null) result = caseDNavigableMember(dFeature);
				if (result == null) result = caseIDeducibleElement(dFeature);
				if (result == null) result = caseDNamedElement(dFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DASSOCIATION:
			{
				DAssociation dAssociation = (DAssociation)theEObject;
				T result = caseDAssociation(dAssociation);
				if (result == null) result = caseDFeature(dAssociation);
				if (result == null) result = caseDNavigableMember(dAssociation);
				if (result == null) result = caseIDeducibleElement(dAssociation);
				if (result == null) result = caseDNamedElement(dAssociation);
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
			case BasePackage.DATTRIBUTE:
			{
				DAttribute dAttribute = (DAttribute)theEObject;
				T result = caseDAttribute(dAttribute);
				if (result == null) result = caseDFeature(dAttribute);
				if (result == null) result = caseDNavigableMember(dAttribute);
				if (result == null) result = caseIDeducibleElement(dAttribute);
				if (result == null) result = caseDNamedElement(dAttribute);
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
				if (result == null) result = caseIDeducibleElement(dQuery);
				if (result == null) result = caseINamespace(dQuery);
				if (result == null) result = caseDNamedElement(dQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DQUERY_PARAMETER:
			{
				DQueryParameter dQueryParameter = (DQueryParameter)theEObject;
				T result = caseDQueryParameter(dQueryParameter);
				if (result == null) result = caseDNavigableMember(dQueryParameter);
				if (result == null) result = caseIDeducibleElement(dQueryParameter);
				if (result == null) result = caseDNamedElement(dQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DDOMAIN_EVENT:
			{
				DDomainEvent dDomainEvent = (DDomainEvent)theEObject;
				T result = caseDDomainEvent(dDomainEvent);
				if (result == null) result = caseINavigableMemberContainer(dDomainEvent);
				if (result == null) result = caseIStaticReferenceTarget(dDomainEvent);
				if (result == null) result = caseDNamedElement(dDomainEvent);
				if (result == null) result = caseINamespace(dDomainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCONTEXT:
			{
				DContext dContext = (DContext)theEObject;
				T result = caseDContext(dContext);
				if (result == null) result = caseDNavigableMember(dContext);
				if (result == null) result = caseDNamedElement(dContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNOTIFICATION:
			{
				DNotification dNotification = (DNotification)theEObject;
				T result = caseDNotification(dNotification);
				if (result == null) result = caseDNavigableMember(dNotification);
				if (result == null) result = caseDNamedElement(dNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DACTOR:
			{
				DActor dActor = (DActor)theEObject;
				T result = caseDActor(dActor);
				if (result == null) result = caseIStaticReferenceTarget(dActor);
				if (result == null) result = caseDNamedElement(dActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DHUMAN:
			{
				DHuman dHuman = (DHuman)theEObject;
				T result = caseDHuman(dHuman);
				if (result == null) result = caseDActor(dHuman);
				if (result == null) result = caseIStaticReferenceTarget(dHuman);
				if (result == null) result = caseDNamedElement(dHuman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSERVICE:
			{
				DService dService = (DService)theEObject;
				T result = caseDService(dService);
				if (result == null) result = caseDActor(dService);
				if (result == null) result = caseITypeContainer(dService);
				if (result == null) result = caseINavigableMemberContainer(dService);
				if (result == null) result = caseIStaticReferenceTarget(dService);
				if (result == null) result = caseINamespace(dService);
				if (result == null) result = caseDNamedElement(dService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSERVICE_PARAMETER:
			{
				DServiceParameter dServiceParameter = (DServiceParameter)theEObject;
				T result = caseDServiceParameter(dServiceParameter);
				if (result == null) result = caseDNavigableMember(dServiceParameter);
				if (result == null) result = caseDNamedElement(dServiceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DTIME:
			{
				DTime dTime = (DTime)theEObject;
				T result = caseDTime(dTime);
				if (result == null) result = caseDActor(dTime);
				if (result == null) result = caseIStaticReferenceTarget(dTime);
				if (result == null) result = caseDNamedElement(dTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DEXISTING_APPLICATION:
			{
				DExistingApplication dExistingApplication = (DExistingApplication)theEObject;
				T result = caseDExistingApplication(dExistingApplication);
				if (result == null) result = caseITypeContainer(dExistingApplication);
				if (result == null) result = caseIStaticReferenceTarget(dExistingApplication);
				if (result == null) result = caseDNamedElement(dExistingApplication);
				if (result == null) result = caseINamespace(dExistingApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DEXCEPTION:
			{
				DException dException = (DException)theEObject;
				T result = caseDException(dException);
				if (result == null) result = caseDNamedElement(dException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamespace(INamespace object)
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
	 * Returns the result of interpreting the object as an instance of '<em>IDeduction Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDeduction Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDeductionDefinition(IDeductionDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDeducible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDeducible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDeducibleElement(IDeducibleElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DDeduction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDeduction Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDeductionRule(DDeductionRule object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DDomain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDomain(DDomain object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DCondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DCondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDCondition(DCondition object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DIdentity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DIdentity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDIdentityType(DIdentityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IIdentity State Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IIdentity State Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIIdentityStateModel(IIdentityStateModel object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DRelationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDRelationship(DRelationship object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DDomain Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DDomain Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDDomainEvent(DDomainEvent object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DNotification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DNotification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDNotification(DNotification object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DActor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DActor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDActor(DActor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DHuman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DHuman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDHuman(DHuman object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDService(DService object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DService Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DService Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDServiceParameter(DServiceParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTime(DTime object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DExisting Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DExisting Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDExistingApplication(DExistingApplication object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DException</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DException</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDException(DException object)
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
