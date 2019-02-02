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
			case BasePackage.IRICH_TEXT_ELEMENT:
			{
				IRichTextElement iRichTextElement = (IRichTextElement)theEObject;
				T result = caseIRichTextElement(iRichTextElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.INAMESPACE:
			{
				INamespace iNamespace = (INamespace)theEObject;
				T result = caseINamespace(iNamespace);
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
			case BasePackage.DTYPED_MEMBER:
			{
				DTypedMember dTypedMember = (DTypedMember)theEObject;
				T result = caseDTypedMember(dTypedMember);
				if (result == null) result = caseDNamedElement(dTypedMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.ITYPED_MEMBER_CONTAINER:
			{
				ITypedMemberContainer iTypedMemberContainer = (ITypedMemberContainer)theEObject;
				T result = caseITypedMemberContainer(iTypedMemberContainer);
				if (result == null) result = caseINamespace(iTypedMemberContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.IPRIMARY_NAVIGATION_TARGET:
			{
				IPrimaryNavigationTarget iPrimaryNavigationTarget = (IPrimaryNavigationTarget)theEObject;
				T result = caseIPrimaryNavigationTarget(iPrimaryNavigationTarget);
				if (result == null) result = caseDNamedElement(iPrimaryNavigationTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DRICH_TEXT:
			{
				DRichText dRichText = (DRichText)theEObject;
				T result = caseDRichText(dRichText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DTEXT:
			{
				DText dText = (DText)theEObject;
				T result = caseDText(dText);
				if (result == null) result = caseIRichTextElement(dText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DEXPRESSION:
			{
				DExpression dExpression = (DExpression)theEObject;
				T result = caseDExpression(dExpression);
				if (result == null) result = caseIRichTextElement(dExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DDOMAIN:
			{
				DDomain dDomain = (DDomain)theEObject;
				T result = caseDDomain(dDomain);
				if (result == null) result = caseINamespace(dDomain);
				if (result == null) result = caseIPrimaryNavigationTarget(dDomain);
				if (result == null) result = caseDNamedElement(dDomain);
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
			case BasePackage.DFUNCTION:
			{
				DFunction dFunction = (DFunction)theEObject;
				T result = caseDFunction(dFunction);
				if (result == null) result = caseDTypedMember(dFunction);
				if (result == null) result = caseDNamedElement(dFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DAGGREGATE:
			{
				DAggregate dAggregate = (DAggregate)theEObject;
				T result = caseDAggregate(dAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DTYPE:
			{
				DType dType = (DType)theEObject;
				T result = caseDType(dType);
				if (result == null) result = caseIPrimaryNavigationTarget(dType);
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
				if (result == null) result = caseIPrimaryNavigationTarget(dSimpleType);
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
				if (result == null) result = caseIPrimaryNavigationTarget(dPrimitive);
				if (result == null) result = caseDNamedElement(dPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DENUMERATION:
			{
				DEnumeration dEnumeration = (DEnumeration)theEObject;
				T result = caseDEnumeration(dEnumeration);
				if (result == null) result = caseDSimpleType(dEnumeration);
				if (result == null) result = caseITypedMemberContainer(dEnumeration);
				if (result == null) result = caseDType(dEnumeration);
				if (result == null) result = caseIValueType(dEnumeration);
				if (result == null) result = caseINamespace(dEnumeration);
				if (result == null) result = caseIPrimaryNavigationTarget(dEnumeration);
				if (result == null) result = caseDNamedElement(dEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DLITERAL:
			{
				DLiteral dLiteral = (DLiteral)theEObject;
				T result = caseDLiteral(dLiteral);
				if (result == null) result = caseDTypedMember(dLiteral);
				if (result == null) result = caseDNamedElement(dLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCOMPLEX_TYPE:
			{
				DComplexType dComplexType = (DComplexType)theEObject;
				T result = caseDComplexType(dComplexType);
				if (result == null) result = caseDType(dComplexType);
				if (result == null) result = caseITypedMemberContainer(dComplexType);
				if (result == null) result = caseIPrimaryNavigationTarget(dComplexType);
				if (result == null) result = caseINamespace(dComplexType);
				if (result == null) result = caseDNamedElement(dComplexType);
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
				if (result == null) result = caseITypedMemberContainer(dIdentityType);
				if (result == null) result = caseIPrimaryNavigationTarget(dIdentityType);
				if (result == null) result = caseINamespace(dIdentityType);
				if (result == null) result = caseDNamedElement(dIdentityType);
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
				if (result == null) result = caseITypedMemberContainer(dDetailType);
				if (result == null) result = caseIPrimaryNavigationTarget(dDetailType);
				if (result == null) result = caseINamespace(dDetailType);
				if (result == null) result = caseDNamedElement(dDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DROOT_TYPE:
			{
				DRootType dRootType = (DRootType)theEObject;
				T result = caseDRootType(dRootType);
				if (result == null) result = caseDIdentityType(dRootType);
				if (result == null) result = caseDComplexType(dRootType);
				if (result == null) result = caseIIdentityType(dRootType);
				if (result == null) result = caseDType(dRootType);
				if (result == null) result = caseITypedMemberContainer(dRootType);
				if (result == null) result = caseIPrimaryNavigationTarget(dRootType);
				if (result == null) result = caseINamespace(dRootType);
				if (result == null) result = caseDNamedElement(dRootType);
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
				if (result == null) result = caseITypedMemberContainer(dRelationship);
				if (result == null) result = caseIPrimaryNavigationTarget(dRelationship);
				if (result == null) result = caseINamespace(dRelationship);
				if (result == null) result = caseDNamedElement(dRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DFEATURE:
			{
				DFeature dFeature = (DFeature)theEObject;
				T result = caseDFeature(dFeature);
				if (result == null) result = caseDTypedMember(dFeature);
				if (result == null) result = caseDNamedElement(dFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DASSOCIATION:
			{
				DAssociation dAssociation = (DAssociation)theEObject;
				T result = caseDAssociation(dAssociation);
				if (result == null) result = caseDFeature(dAssociation);
				if (result == null) result = caseDTypedMember(dAssociation);
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
				if (result == null) result = caseDTypedMember(dAttribute);
				if (result == null) result = caseDNamedElement(dAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DQUERY:
			{
				DQuery dQuery = (DQuery)theEObject;
				T result = caseDQuery(dQuery);
				if (result == null) result = caseDFeature(dQuery);
				if (result == null) result = caseITypedMemberContainer(dQuery);
				if (result == null) result = caseDTypedMember(dQuery);
				if (result == null) result = caseINamespace(dQuery);
				if (result == null) result = caseDNamedElement(dQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DQUERY_PARAMETER:
			{
				DQueryParameter dQueryParameter = (DQueryParameter)theEObject;
				T result = caseDQueryParameter(dQueryParameter);
				if (result == null) result = caseDTypedMember(dQueryParameter);
				if (result == null) result = caseDNamedElement(dQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DDOMAIN_EVENT:
			{
				DDomainEvent dDomainEvent = (DDomainEvent)theEObject;
				T result = caseDDomainEvent(dDomainEvent);
				if (result == null) result = caseITypedMemberContainer(dDomainEvent);
				if (result == null) result = caseIPrimaryNavigationTarget(dDomainEvent);
				if (result == null) result = caseDNamedElement(dDomainEvent);
				if (result == null) result = caseINamespace(dDomainEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DCONTEXT:
			{
				DContext dContext = (DContext)theEObject;
				T result = caseDContext(dContext);
				if (result == null) result = caseDTypedMember(dContext);
				if (result == null) result = caseDNamedElement(dContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DNOTIFICATION:
			{
				DNotification dNotification = (DNotification)theEObject;
				T result = caseDNotification(dNotification);
				if (result == null) result = caseDTypedMember(dNotification);
				if (result == null) result = caseDNamedElement(dNotification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DACTOR:
			{
				DActor dActor = (DActor)theEObject;
				T result = caseDActor(dActor);
				if (result == null) result = caseIPrimaryNavigationTarget(dActor);
				if (result == null) result = caseDNamedElement(dActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DHUMAN:
			{
				DHuman dHuman = (DHuman)theEObject;
				T result = caseDHuman(dHuman);
				if (result == null) result = caseDActor(dHuman);
				if (result == null) result = caseIPrimaryNavigationTarget(dHuman);
				if (result == null) result = caseDNamedElement(dHuman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSERVICE:
			{
				DService dService = (DService)theEObject;
				T result = caseDService(dService);
				if (result == null) result = caseDActor(dService);
				if (result == null) result = caseITypedMemberContainer(dService);
				if (result == null) result = caseIPrimaryNavigationTarget(dService);
				if (result == null) result = caseINamespace(dService);
				if (result == null) result = caseDNamedElement(dService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DSERVICE_PARAMETER:
			{
				DServiceParameter dServiceParameter = (DServiceParameter)theEObject;
				T result = caseDServiceParameter(dServiceParameter);
				if (result == null) result = caseDTypedMember(dServiceParameter);
				if (result == null) result = caseDNamedElement(dServiceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DTIME:
			{
				DTime dTime = (DTime)theEObject;
				T result = caseDTime(dTime);
				if (result == null) result = caseDActor(dTime);
				if (result == null) result = caseIPrimaryNavigationTarget(dTime);
				if (result == null) result = caseDNamedElement(dTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasePackage.DEXISTING_APPLICATION:
			{
				DExistingApplication dExistingApplication = (DExistingApplication)theEObject;
				T result = caseDExistingApplication(dExistingApplication);
				if (result == null) result = caseINamespace(dExistingApplication);
				if (result == null) result = caseIPrimaryNavigationTarget(dExistingApplication);
				if (result == null) result = caseDNamedElement(dExistingApplication);
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
	 * Returns the result of interpreting the object as an instance of '<em>IRich Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRich Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRichTextElement(IRichTextElement object)
	{
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>DTyped Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTyped Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTypedMember(DTypedMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITyped Member Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITyped Member Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITypedMemberContainer(ITypedMemberContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPrimary Navigation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPrimary Navigation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPrimaryNavigationTarget(IPrimaryNavigationTarget object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DText</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DText</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDText(DText object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DFunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFunction(DFunction object)
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
	 * Returns the result of interpreting the object as an instance of '<em>DRoot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DRoot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDRootType(DRootType object)
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
