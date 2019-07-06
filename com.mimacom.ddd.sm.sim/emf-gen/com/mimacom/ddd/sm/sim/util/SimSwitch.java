/**
 */
package com.mimacom.ddd.sm.sim.util;

import com.mimacom.ddd.sm.sim.*;

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
 * @see com.mimacom.ddd.sm.sim.SimPackage
 * @generated
 */
public class SimSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = SimPackage.eINSTANCE;
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
			case SimPackage.SIDENTITY_TYPE:
			{
				SIdentityType sIdentityType = (SIdentityType)theEObject;
				T result = caseSIdentityType(sIdentityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SVALUE_TYPE:
			{
				SValueType sValueType = (SValueType)theEObject;
				T result = caseSValueType(sValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SINFORMATION_MODEL:
			{
				SInformationModel sInformationModel = (SInformationModel)theEObject;
				T result = caseSInformationModel(sInformationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SNAMED_ELEMENT:
			{
				SNamedElement sNamedElement = (SNamedElement)theEObject;
				T result = caseSNamedElement(sNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDEDUCIBLE_ELEMENT:
			{
				SDeducibleElement sDeducibleElement = (SDeducibleElement)theEObject;
				T result = caseSDeducibleElement(sDeducibleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SNAMED_DEDUCIBLE_ELEMENT:
			{
				SNamedDeducibleElement sNamedDeducibleElement = (SNamedDeducibleElement)theEObject;
				T result = caseSNamedDeducibleElement(sNamedDeducibleElement);
				if (result == null) result = caseSNamedElement(sNamedDeducibleElement);
				if (result == null) result = caseSDeducibleElement(sNamedDeducibleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SEXPRESSION:
			{
				SExpression sExpression = (SExpression)theEObject;
				T result = caseSExpression(sExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SIMPORT:
			{
				SImport sImport = (SImport)theEObject;
				T result = caseSImport(sImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDOMAIN_PROXY:
			{
				SDomainProxy sDomainProxy = (SDomainProxy)theEObject;
				T result = caseSDomainProxy(sDomainProxy);
				if (result == null) result = caseSDeducibleElement(sDomainProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SAGGREGATE:
			{
				SAggregate sAggregate = (SAggregate)theEObject;
				T result = caseSAggregate(sAggregate);
				if (result == null) result = caseSDeducibleElement(sAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.STYPE:
			{
				SType sType = (SType)theEObject;
				T result = caseSType(sType);
				if (result == null) result = caseSNamedDeducibleElement(sType);
				if (result == null) result = caseSNamedElement(sType);
				if (result == null) result = caseSDeducibleElement(sType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SCONDITION:
			{
				SCondition sCondition = (SCondition)theEObject;
				T result = caseSCondition(sCondition);
				if (result == null) result = caseSNamedElement(sCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SSIMPLE_TYPE:
			{
				SSimpleType sSimpleType = (SSimpleType)theEObject;
				T result = caseSSimpleType(sSimpleType);
				if (result == null) result = caseSType(sSimpleType);
				if (result == null) result = caseSValueType(sSimpleType);
				if (result == null) result = caseSNamedDeducibleElement(sSimpleType);
				if (result == null) result = caseSNamedElement(sSimpleType);
				if (result == null) result = caseSDeducibleElement(sSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SPRIMITIVE:
			{
				SPrimitive sPrimitive = (SPrimitive)theEObject;
				T result = caseSPrimitive(sPrimitive);
				if (result == null) result = caseSSimpleType(sPrimitive);
				if (result == null) result = caseSType(sPrimitive);
				if (result == null) result = caseSValueType(sPrimitive);
				if (result == null) result = caseSNamedDeducibleElement(sPrimitive);
				if (result == null) result = caseSNamedElement(sPrimitive);
				if (result == null) result = caseSDeducibleElement(sPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SENUMERATION:
			{
				SEnumeration sEnumeration = (SEnumeration)theEObject;
				T result = caseSEnumeration(sEnumeration);
				if (result == null) result = caseSSimpleType(sEnumeration);
				if (result == null) result = caseSType(sEnumeration);
				if (result == null) result = caseSValueType(sEnumeration);
				if (result == null) result = caseSNamedDeducibleElement(sEnumeration);
				if (result == null) result = caseSNamedElement(sEnumeration);
				if (result == null) result = caseSDeducibleElement(sEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SLITERAL:
			{
				SLiteral sLiteral = (SLiteral)theEObject;
				T result = caseSLiteral(sLiteral);
				if (result == null) result = caseSNamedDeducibleElement(sLiteral);
				if (result == null) result = caseSNamedElement(sLiteral);
				if (result == null) result = caseSDeducibleElement(sLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SCOMPLEX_TYPE:
			{
				SComplexType sComplexType = (SComplexType)theEObject;
				T result = caseSComplexType(sComplexType);
				if (result == null) result = caseSType(sComplexType);
				if (result == null) result = caseSNamedDeducibleElement(sComplexType);
				if (result == null) result = caseSNamedElement(sComplexType);
				if (result == null) result = caseSDeducibleElement(sComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDETAIL_TYPE:
			{
				SDetailType sDetailType = (SDetailType)theEObject;
				T result = caseSDetailType(sDetailType);
				if (result == null) result = caseSComplexType(sDetailType);
				if (result == null) result = caseSValueType(sDetailType);
				if (result == null) result = caseSType(sDetailType);
				if (result == null) result = caseSNamedDeducibleElement(sDetailType);
				if (result == null) result = caseSNamedElement(sDetailType);
				if (result == null) result = caseSDeducibleElement(sDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SENTITY_TYPE:
			{
				SEntityType sEntityType = (SEntityType)theEObject;
				T result = caseSEntityType(sEntityType);
				if (result == null) result = caseSComplexType(sEntityType);
				if (result == null) result = caseSIdentityType(sEntityType);
				if (result == null) result = caseSType(sEntityType);
				if (result == null) result = caseSNamedDeducibleElement(sEntityType);
				if (result == null) result = caseSNamedElement(sEntityType);
				if (result == null) result = caseSDeducibleElement(sEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SFEATURE:
			{
				SFeature sFeature = (SFeature)theEObject;
				T result = caseSFeature(sFeature);
				if (result == null) result = caseSNamedDeducibleElement(sFeature);
				if (result == null) result = caseSNamedElement(sFeature);
				if (result == null) result = caseSDeducibleElement(sFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SASSOCIATION:
			{
				SAssociation sAssociation = (SAssociation)theEObject;
				T result = caseSAssociation(sAssociation);
				if (result == null) result = caseSFeature(sAssociation);
				if (result == null) result = caseSNamedDeducibleElement(sAssociation);
				if (result == null) result = caseSNamedElement(sAssociation);
				if (result == null) result = caseSDeducibleElement(sAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SMULTIPLICITY:
			{
				SMultiplicity sMultiplicity = (SMultiplicity)theEObject;
				T result = caseSMultiplicity(sMultiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SATTRIBUTE:
			{
				SAttribute sAttribute = (SAttribute)theEObject;
				T result = caseSAttribute(sAttribute);
				if (result == null) result = caseSFeature(sAttribute);
				if (result == null) result = caseSNamedDeducibleElement(sAttribute);
				if (result == null) result = caseSNamedElement(sAttribute);
				if (result == null) result = caseSDeducibleElement(sAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SQUERY:
			{
				SQuery sQuery = (SQuery)theEObject;
				T result = caseSQuery(sQuery);
				if (result == null) result = caseSFeature(sQuery);
				if (result == null) result = caseSNamedDeducibleElement(sQuery);
				if (result == null) result = caseSNamedElement(sQuery);
				if (result == null) result = caseSDeducibleElement(sQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SQUERY_PARAMETER:
			{
				SQueryParameter sQueryParameter = (SQueryParameter)theEObject;
				T result = caseSQueryParameter(sQueryParameter);
				if (result == null) result = caseSNamedDeducibleElement(sQueryParameter);
				if (result == null) result = caseSNamedElement(sQueryParameter);
				if (result == null) result = caseSDeducibleElement(sQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDEDUCTION_RULE:
			{
				SDeductionRule sDeductionRule = (SDeductionRule)theEObject;
				T result = caseSDeductionRule(sDeductionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SGRAB_RULE:
			{
				SGrabRule sGrabRule = (SGrabRule)theEObject;
				T result = caseSGrabRule(sGrabRule);
				if (result == null) result = caseSDeductionRule(sGrabRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDITCH_RULE:
			{
				SDitchRule sDitchRule = (SDitchRule)theEObject;
				T result = caseSDitchRule(sDitchRule);
				if (result == null) result = caseSDeductionRule(sDitchRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SSTRUCTURE_CHANGING_RULE:
			{
				SStructureChangingRule sStructureChangingRule = (SStructureChangingRule)theEObject;
				T result = caseSStructureChangingRule(sStructureChangingRule);
				if (result == null) result = caseSGrabRule(sStructureChangingRule);
				if (result == null) result = caseSDeductionRule(sStructureChangingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SMORPH_RULE:
			{
				SMorphRule sMorphRule = (SMorphRule)theEObject;
				T result = caseSMorphRule(sMorphRule);
				if (result == null) result = caseSStructureChangingRule(sMorphRule);
				if (result == null) result = caseSGrabRule(sMorphRule);
				if (result == null) result = caseSDeductionRule(sMorphRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SFUSE_RULE:
			{
				SFuseRule sFuseRule = (SFuseRule)theEObject;
				T result = caseSFuseRule(sFuseRule);
				if (result == null) result = caseSStructureChangingRule(sFuseRule);
				if (result == null) result = caseSGrabRule(sFuseRule);
				if (result == null) result = caseSDeductionRule(sFuseRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SGRAB_AGGREGATE_RULE:
			{
				SGrabAggregateRule sGrabAggregateRule = (SGrabAggregateRule)theEObject;
				T result = caseSGrabAggregateRule(sGrabAggregateRule);
				if (result == null) result = caseSDeductionRule(sGrabAggregateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SGRAB_DOMAIN_RULE:
			{
				SGrabDomainRule sGrabDomainRule = (SGrabDomainRule)theEObject;
				T result = caseSGrabDomainRule(sGrabDomainRule);
				if (result == null) result = caseSDeductionRule(sGrabDomainRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SSYNTHETIC_DEDUCTION_RULE:
			{
				SSyntheticDeductionRule sSyntheticDeductionRule = (SSyntheticDeductionRule)theEObject;
				T result = caseSSyntheticDeductionRule(sSyntheticDeductionRule);
				if (result == null) result = caseSDeductionRule(sSyntheticDeductionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SIdentity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SIdentity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSIdentityType(SIdentityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SValue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SValue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSValueType(SValueType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SInformation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSInformationModel(SInformationModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNamedElement(SNamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDeducible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDeducible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDeducibleElement(SDeducibleElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SNamed Deducible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SNamed Deducible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSNamedDeducibleElement(SNamedDeducibleElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSExpression(SExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SImport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SImport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSImport(SImport object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDomain Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDomain Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDomainProxy(SDomainProxy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAggregate(SAggregate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSType(SType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SCondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCondition(SCondition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSimple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSimple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSimpleType(SSimpleType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPrimitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPrimitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPrimitive(SPrimitive object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEnumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEnumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEnumeration(SEnumeration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLiteral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLiteral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLiteral(SLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SComplex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SComplex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSComplexType(SComplexType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDetail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDetail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDetailType(SDetailType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEntity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEntity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEntityType(SEntityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFeature(SFeature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAssociation(SAssociation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMultiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMultiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMultiplicity(SMultiplicity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAttribute(SAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQuery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQuery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQuery(SQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQuery Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQuery Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQueryParameter(SQueryParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDeduction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDeduction Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDeductionRule(SDeductionRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGrab Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGrab Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrabRule(SGrabRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDitch Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDitch Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDitchRule(SDitchRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SStructure Changing Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SStructure Changing Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSStructureChangingRule(SStructureChangingRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMorph Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMorph Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSMorphRule(SMorphRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFuse Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFuse Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFuseRule(SFuseRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGrab Aggregate Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGrab Aggregate Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrabAggregateRule(SGrabAggregateRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGrab Domain Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGrab Domain Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGrabDomainRule(SGrabDomainRule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSynthetic Deduction Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSynthetic Deduction Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSyntheticDeductionRule(SSyntheticDeductionRule object)
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

} //SimSwitch
