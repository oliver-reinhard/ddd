/**
 */
package com.mimacom.ddd.sm.sim.util;

import com.mimacom.ddd.dm.base.DAggregate;
import com.mimacom.ddd.dm.base.DAssociation;
import com.mimacom.ddd.dm.base.DAttribute;
import com.mimacom.ddd.dm.base.DComplexType;
import com.mimacom.ddd.dm.base.DDeductionRule;
import com.mimacom.ddd.dm.base.DDetailType;
import com.mimacom.ddd.dm.base.DEntityType;
import com.mimacom.ddd.dm.base.DEnumeration;
import com.mimacom.ddd.dm.base.DFeature;
import com.mimacom.ddd.dm.base.DIdentityType;
import com.mimacom.ddd.dm.base.DLiteral;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.DNavigableMember;
import com.mimacom.ddd.dm.base.DPrimitive;
import com.mimacom.ddd.dm.base.DQuery;
import com.mimacom.ddd.dm.base.DQueryParameter;
import com.mimacom.ddd.dm.base.DSimpleType;
import com.mimacom.ddd.dm.base.DType;
import com.mimacom.ddd.dm.base.IDeducibleElement;
import com.mimacom.ddd.dm.base.IDeductionDefinition;
import com.mimacom.ddd.dm.base.IIdentityType;
import com.mimacom.ddd.dm.base.INamespace;
import com.mimacom.ddd.dm.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.IPrimaryNavigationTarget;
import com.mimacom.ddd.dm.base.IValueType;

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
			case SimPackage.SINFORMATION_MODEL:
			{
				SInformationModel sInformationModel = (SInformationModel)theEObject;
				T result = caseSInformationModel(sInformationModel);
				if (result == null) result = caseINavigableMemberContainer(sInformationModel);
				if (result == null) result = caseINamespace(sInformationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SCORE_QUERY:
			{
				SCoreQuery sCoreQuery = (SCoreQuery)theEObject;
				T result = caseSCoreQuery(sCoreQuery);
				if (result == null) result = caseDNavigableMember(sCoreQuery);
				if (result == null) result = caseINavigableMemberContainer(sCoreQuery);
				if (result == null) result = caseDNamedElement(sCoreQuery);
				if (result == null) result = caseINamespace(sCoreQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SIMPLICIT_ELEMENT_DEDUCTION:
			{
				SImplicitElementDeduction sImplicitElementDeduction = (SImplicitElementDeduction)theEObject;
				T result = caseSImplicitElementDeduction(sImplicitElementDeduction);
				if (result == null) result = caseIDeductionDefinition(sImplicitElementDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDOMAIN_DEDUCTION:
			{
				SDomainDeduction sDomainDeduction = (SDomainDeduction)theEObject;
				T result = caseSDomainDeduction(sDomainDeduction);
				if (result == null) result = caseIDeductionDefinition(sDomainDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SAGGREGATE_DEDUCTION:
			{
				SAggregateDeduction sAggregateDeduction = (SAggregateDeduction)theEObject;
				T result = caseSAggregateDeduction(sAggregateDeduction);
				if (result == null) result = caseDAggregate(sAggregateDeduction);
				if (result == null) result = caseIDeductionDefinition(sAggregateDeduction);
				if (result == null) result = caseIDeducibleElement(sAggregateDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.STYPE_DEDUCTION:
			{
				STypeDeduction sTypeDeduction = (STypeDeduction)theEObject;
				T result = caseSTypeDeduction(sTypeDeduction);
				if (result == null) result = caseDNamedElement(sTypeDeduction);
				if (result == null) result = caseIDeductionDefinition(sTypeDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SPRIMITIVE_DEDUCTION:
			{
				SPrimitiveDeduction sPrimitiveDeduction = (SPrimitiveDeduction)theEObject;
				T result = caseSPrimitiveDeduction(sPrimitiveDeduction);
				if (result == null) result = caseDPrimitive(sPrimitiveDeduction);
				if (result == null) result = caseSTypeDeduction(sPrimitiveDeduction);
				if (result == null) result = caseDSimpleType(sPrimitiveDeduction);
				if (result == null) result = caseIDeductionDefinition(sPrimitiveDeduction);
				if (result == null) result = caseDType(sPrimitiveDeduction);
				if (result == null) result = caseIValueType(sPrimitiveDeduction);
				if (result == null) result = caseIDeducibleElement(sPrimitiveDeduction);
				if (result == null) result = caseIPrimaryNavigationTarget(sPrimitiveDeduction);
				if (result == null) result = caseDNamedElement(sPrimitiveDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SENUMERATION_DEDUCTION:
			{
				SEnumerationDeduction sEnumerationDeduction = (SEnumerationDeduction)theEObject;
				T result = caseSEnumerationDeduction(sEnumerationDeduction);
				if (result == null) result = caseDEnumeration(sEnumerationDeduction);
				if (result == null) result = caseSTypeDeduction(sEnumerationDeduction);
				if (result == null) result = caseDSimpleType(sEnumerationDeduction);
				if (result == null) result = caseINavigableMemberContainer(sEnumerationDeduction);
				if (result == null) result = caseIDeductionDefinition(sEnumerationDeduction);
				if (result == null) result = caseDType(sEnumerationDeduction);
				if (result == null) result = caseIValueType(sEnumerationDeduction);
				if (result == null) result = caseINamespace(sEnumerationDeduction);
				if (result == null) result = caseIDeducibleElement(sEnumerationDeduction);
				if (result == null) result = caseIPrimaryNavigationTarget(sEnumerationDeduction);
				if (result == null) result = caseDNamedElement(sEnumerationDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SLITERAL_DEDUCTION:
			{
				SLiteralDeduction sLiteralDeduction = (SLiteralDeduction)theEObject;
				T result = caseSLiteralDeduction(sLiteralDeduction);
				if (result == null) result = caseDLiteral(sLiteralDeduction);
				if (result == null) result = caseIDeductionDefinition(sLiteralDeduction);
				if (result == null) result = caseDNavigableMember(sLiteralDeduction);
				if (result == null) result = caseIDeducibleElement(sLiteralDeduction);
				if (result == null) result = caseDNamedElement(sLiteralDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SCOMPLEX_TYPE_DEDUCTION:
			{
				SComplexTypeDeduction sComplexTypeDeduction = (SComplexTypeDeduction)theEObject;
				T result = caseSComplexTypeDeduction(sComplexTypeDeduction);
				if (result == null) result = caseSTypeDeduction(sComplexTypeDeduction);
				if (result == null) result = caseDNamedElement(sComplexTypeDeduction);
				if (result == null) result = caseIDeductionDefinition(sComplexTypeDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDETAIL_TYPE_DEDUCTION:
			{
				SDetailTypeDeduction sDetailTypeDeduction = (SDetailTypeDeduction)theEObject;
				T result = caseSDetailTypeDeduction(sDetailTypeDeduction);
				if (result == null) result = caseDDetailType(sDetailTypeDeduction);
				if (result == null) result = caseSComplexTypeDeduction(sDetailTypeDeduction);
				if (result == null) result = caseDComplexType(sDetailTypeDeduction);
				if (result == null) result = caseIValueType(sDetailTypeDeduction);
				if (result == null) result = caseSTypeDeduction(sDetailTypeDeduction);
				if (result == null) result = caseDType(sDetailTypeDeduction);
				if (result == null) result = caseINavigableMemberContainer(sDetailTypeDeduction);
				if (result == null) result = caseIDeductionDefinition(sDetailTypeDeduction);
				if (result == null) result = caseIDeducibleElement(sDetailTypeDeduction);
				if (result == null) result = caseIPrimaryNavigationTarget(sDetailTypeDeduction);
				if (result == null) result = caseINamespace(sDetailTypeDeduction);
				if (result == null) result = caseDNamedElement(sDetailTypeDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SENTITY_TYPE_DEDUCTION:
			{
				SEntityTypeDeduction sEntityTypeDeduction = (SEntityTypeDeduction)theEObject;
				T result = caseSEntityTypeDeduction(sEntityTypeDeduction);
				if (result == null) result = caseDEntityType(sEntityTypeDeduction);
				if (result == null) result = caseSComplexTypeDeduction(sEntityTypeDeduction);
				if (result == null) result = caseDIdentityType(sEntityTypeDeduction);
				if (result == null) result = caseSTypeDeduction(sEntityTypeDeduction);
				if (result == null) result = caseDComplexType(sEntityTypeDeduction);
				if (result == null) result = caseIIdentityType(sEntityTypeDeduction);
				if (result == null) result = caseIDeductionDefinition(sEntityTypeDeduction);
				if (result == null) result = caseDType(sEntityTypeDeduction);
				if (result == null) result = caseINavigableMemberContainer(sEntityTypeDeduction);
				if (result == null) result = caseIDeducibleElement(sEntityTypeDeduction);
				if (result == null) result = caseIPrimaryNavigationTarget(sEntityTypeDeduction);
				if (result == null) result = caseINamespace(sEntityTypeDeduction);
				if (result == null) result = caseDNamedElement(sEntityTypeDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SFEATURE_DEDUCTION:
			{
				SFeatureDeduction sFeatureDeduction = (SFeatureDeduction)theEObject;
				T result = caseSFeatureDeduction(sFeatureDeduction);
				if (result == null) result = caseIDeductionDefinition(sFeatureDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SASSOCIATION_DEDUCTION:
			{
				SAssociationDeduction sAssociationDeduction = (SAssociationDeduction)theEObject;
				T result = caseSAssociationDeduction(sAssociationDeduction);
				if (result == null) result = caseDAssociation(sAssociationDeduction);
				if (result == null) result = caseSFeatureDeduction(sAssociationDeduction);
				if (result == null) result = caseDFeature(sAssociationDeduction);
				if (result == null) result = caseIDeductionDefinition(sAssociationDeduction);
				if (result == null) result = caseDNavigableMember(sAssociationDeduction);
				if (result == null) result = caseIDeducibleElement(sAssociationDeduction);
				if (result == null) result = caseDNamedElement(sAssociationDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SATTRIBUTE_DEDUCTION:
			{
				SAttributeDeduction sAttributeDeduction = (SAttributeDeduction)theEObject;
				T result = caseSAttributeDeduction(sAttributeDeduction);
				if (result == null) result = caseDAttribute(sAttributeDeduction);
				if (result == null) result = caseSFeatureDeduction(sAttributeDeduction);
				if (result == null) result = caseDFeature(sAttributeDeduction);
				if (result == null) result = caseIDeductionDefinition(sAttributeDeduction);
				if (result == null) result = caseDNavigableMember(sAttributeDeduction);
				if (result == null) result = caseIDeducibleElement(sAttributeDeduction);
				if (result == null) result = caseDNamedElement(sAttributeDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SQUERY_DEDUCTION:
			{
				SQueryDeduction sQueryDeduction = (SQueryDeduction)theEObject;
				T result = caseSQueryDeduction(sQueryDeduction);
				if (result == null) result = caseDQuery(sQueryDeduction);
				if (result == null) result = caseSFeatureDeduction(sQueryDeduction);
				if (result == null) result = caseDFeature(sQueryDeduction);
				if (result == null) result = caseINavigableMemberContainer(sQueryDeduction);
				if (result == null) result = caseIDeductionDefinition(sQueryDeduction);
				if (result == null) result = caseDNavigableMember(sQueryDeduction);
				if (result == null) result = caseIDeducibleElement(sQueryDeduction);
				if (result == null) result = caseINamespace(sQueryDeduction);
				if (result == null) result = caseDNamedElement(sQueryDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SQUERY_PARAMETER_DEDUCTION:
			{
				SQueryParameterDeduction sQueryParameterDeduction = (SQueryParameterDeduction)theEObject;
				T result = caseSQueryParameterDeduction(sQueryParameterDeduction);
				if (result == null) result = caseDQueryParameter(sQueryParameterDeduction);
				if (result == null) result = caseIDeductionDefinition(sQueryParameterDeduction);
				if (result == null) result = caseDNavigableMember(sQueryParameterDeduction);
				if (result == null) result = caseIDeducibleElement(sQueryParameterDeduction);
				if (result == null) result = caseDNamedElement(sQueryParameterDeduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SRENAME_RULE:
			{
				SRenameRule sRenameRule = (SRenameRule)theEObject;
				T result = caseSRenameRule(sRenameRule);
				if (result == null) result = caseDDeductionRule(sRenameRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SGRAB_RULE:
			{
				SGrabRule sGrabRule = (SGrabRule)theEObject;
				T result = caseSGrabRule(sGrabRule);
				if (result == null) result = caseSRenameRule(sGrabRule);
				if (result == null) result = caseDDeductionRule(sGrabRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SDITCH_RULE:
			{
				SDitchRule sDitchRule = (SDitchRule)theEObject;
				T result = caseSDitchRule(sDitchRule);
				if (result == null) result = caseDDeductionRule(sDitchRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SSTRUCTURE_CHANGING_RULE:
			{
				SStructureChangingRule sStructureChangingRule = (SStructureChangingRule)theEObject;
				T result = caseSStructureChangingRule(sStructureChangingRule);
				if (result == null) result = caseSRenameRule(sStructureChangingRule);
				if (result == null) result = caseDDeductionRule(sStructureChangingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SMORPH_RULE:
			{
				SMorphRule sMorphRule = (SMorphRule)theEObject;
				T result = caseSMorphRule(sMorphRule);
				if (result == null) result = caseSStructureChangingRule(sMorphRule);
				if (result == null) result = caseSRenameRule(sMorphRule);
				if (result == null) result = caseDDeductionRule(sMorphRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SFUSE_RULE:
			{
				SFuseRule sFuseRule = (SFuseRule)theEObject;
				T result = caseSFuseRule(sFuseRule);
				if (result == null) result = caseSStructureChangingRule(sFuseRule);
				if (result == null) result = caseSRenameRule(sFuseRule);
				if (result == null) result = caseDDeductionRule(sFuseRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SGRAB_AGGREGATE_RULE:
			{
				SGrabAggregateRule sGrabAggregateRule = (SGrabAggregateRule)theEObject;
				T result = caseSGrabAggregateRule(sGrabAggregateRule);
				if (result == null) result = caseDDeductionRule(sGrabAggregateRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimPackage.SGRAB_DOMAIN_RULE:
			{
				SGrabDomainRule sGrabDomainRule = (SGrabDomainRule)theEObject;
				T result = caseSGrabDomainRule(sGrabDomainRule);
				if (result == null) result = caseDDeductionRule(sGrabDomainRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>SCore Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SCore Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSCoreQuery(SCoreQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SImplicit Element Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SImplicit Element Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSImplicitElementDeduction(SImplicitElementDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDomain Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDomain Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDomainDeduction(SDomainDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAggregate Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAggregate Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAggregateDeduction(SAggregateDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SType Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SType Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTypeDeduction(STypeDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPrimitive Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPrimitive Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPrimitiveDeduction(SPrimitiveDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEnumeration Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEnumeration Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEnumerationDeduction(SEnumerationDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SLiteral Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SLiteral Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSLiteralDeduction(SLiteralDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SComplex Type Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SComplex Type Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSComplexTypeDeduction(SComplexTypeDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDetail Type Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDetail Type Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDetailTypeDeduction(SDetailTypeDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEntity Type Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEntity Type Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEntityTypeDeduction(SEntityTypeDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFeature Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFeature Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFeatureDeduction(SFeatureDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAssociation Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAssociation Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAssociationDeduction(SAssociationDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SAttribute Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SAttribute Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSAttributeDeduction(SAttributeDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQuery Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQuery Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQueryDeduction(SQueryDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQuery Parameter Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQuery Parameter Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQueryParameterDeduction(SQueryParameterDeduction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRename Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRename Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRenameRule(SRenameRule object)
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
