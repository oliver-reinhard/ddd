/**
 */
package com.mimacom.ddd.dm.dim.util;

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
import com.mimacom.ddd.dm.base.base.INoteContainer;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.IValueType;

import com.mimacom.ddd.dm.base.transpose.ITransposableElement;

import com.mimacom.ddd.dm.dim.*;

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
 * @see com.mimacom.ddd.dm.dim.DimPackage
 * @generated
 */
public class DimSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DimPackage.eINSTANCE;
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
			case DimPackage.DOMAIN_INFORMATION_MODEL:
			{
				DomainInformationModel domainInformationModel = (DomainInformationModel)theEObject;
				T result = caseDomainInformationModel(domainInformationModel);
				if (result == null) result = caseDInformationModel(domainInformationModel);
				if (result == null) result = caseDModel(domainInformationModel);
				if (result == null) result = caseINoteContainer(domainInformationModel);
				if (result == null) result = caseIAggregateContainer(domainInformationModel);
				if (result == null) result = caseITypeContainer(domainInformationModel);
				if (result == null) result = caseIStaticReferenceTarget(domainInformationModel);
				if (result == null) result = caseIDiagramRoot(domainInformationModel);
				if (result == null) result = caseDNamedElement(domainInformationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_AGGREGATE:
			{
				DimAggregate dimAggregate = (DimAggregate)theEObject;
				T result = caseDimAggregate(dimAggregate);
				if (result == null) result = caseDAggregate(dimAggregate);
				if (result == null) result = caseITransposableElement(dimAggregate);
				if (result == null) result = caseINoteContainer(dimAggregate);
				if (result == null) result = caseITypeContainer(dimAggregate);
				if (result == null) result = caseIFeatureContainer(dimAggregate);
				if (result == null) result = caseINavigableMemberContainer(dimAggregate);
				if (result == null) result = caseIStaticReferenceTarget(dimAggregate);
				if (result == null) result = caseIDiagramRoot(dimAggregate);
				if (result == null) result = caseDNamedElement(dimAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_TYPE:
			{
				DimType dimType = (DimType)theEObject;
				T result = caseDimType(dimType);
				if (result == null) result = caseDType(dimType);
				if (result == null) result = caseITransposableElement(dimType);
				if (result == null) result = caseINoteContainer(dimType);
				if (result == null) result = caseIStaticReferenceTarget(dimType);
				if (result == null) result = caseDNamedElement(dimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_SIMPLE_TYPE:
			{
				DimSimpleType dimSimpleType = (DimSimpleType)theEObject;
				T result = caseDimSimpleType(dimSimpleType);
				if (result == null) result = caseDSimpleType(dimSimpleType);
				if (result == null) result = caseDimType(dimSimpleType);
				if (result == null) result = caseDType(dimSimpleType);
				if (result == null) result = caseIValueType(dimSimpleType);
				if (result == null) result = caseITransposableElement(dimSimpleType);
				if (result == null) result = caseINoteContainer(dimSimpleType);
				if (result == null) result = caseIStaticReferenceTarget(dimSimpleType);
				if (result == null) result = caseDNamedElement(dimSimpleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_PRIMITIVE:
			{
				DimPrimitive dimPrimitive = (DimPrimitive)theEObject;
				T result = caseDimPrimitive(dimPrimitive);
				if (result == null) result = caseDPrimitive(dimPrimitive);
				if (result == null) result = caseDimSimpleType(dimPrimitive);
				if (result == null) result = caseDSimpleType(dimPrimitive);
				if (result == null) result = caseDimType(dimPrimitive);
				if (result == null) result = caseDType(dimPrimitive);
				if (result == null) result = caseIValueType(dimPrimitive);
				if (result == null) result = caseITransposableElement(dimPrimitive);
				if (result == null) result = caseINoteContainer(dimPrimitive);
				if (result == null) result = caseIStaticReferenceTarget(dimPrimitive);
				if (result == null) result = caseDNamedElement(dimPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_ENUMERATION:
			{
				DimEnumeration dimEnumeration = (DimEnumeration)theEObject;
				T result = caseDimEnumeration(dimEnumeration);
				if (result == null) result = caseDEnumeration(dimEnumeration);
				if (result == null) result = caseDimSimpleType(dimEnumeration);
				if (result == null) result = caseDSimpleType(dimEnumeration);
				if (result == null) result = caseINavigableMemberContainer(dimEnumeration);
				if (result == null) result = caseDimType(dimEnumeration);
				if (result == null) result = caseDType(dimEnumeration);
				if (result == null) result = caseIValueType(dimEnumeration);
				if (result == null) result = caseITransposableElement(dimEnumeration);
				if (result == null) result = caseINoteContainer(dimEnumeration);
				if (result == null) result = caseIStaticReferenceTarget(dimEnumeration);
				if (result == null) result = caseDNamedElement(dimEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_LITERAL:
			{
				DimLiteral dimLiteral = (DimLiteral)theEObject;
				T result = caseDimLiteral(dimLiteral);
				if (result == null) result = caseDLiteral(dimLiteral);
				if (result == null) result = caseITransposableElement(dimLiteral);
				if (result == null) result = caseDNavigableMember(dimLiteral);
				if (result == null) result = caseDNamedElement(dimLiteral);
				if (result == null) result = caseINoteContainer(dimLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_COMPLEX_TYPE:
			{
				DimComplexType dimComplexType = (DimComplexType)theEObject;
				T result = caseDimComplexType(dimComplexType);
				if (result == null) result = caseDComplexType(dimComplexType);
				if (result == null) result = caseDimType(dimComplexType);
				if (result == null) result = caseDType(dimComplexType);
				if (result == null) result = caseIFeatureContainer(dimComplexType);
				if (result == null) result = caseINavigableMemberContainer(dimComplexType);
				if (result == null) result = caseITransposableElement(dimComplexType);
				if (result == null) result = caseINoteContainer(dimComplexType);
				if (result == null) result = caseIStaticReferenceTarget(dimComplexType);
				if (result == null) result = caseDNamedElement(dimComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_DETAIL_TYPE:
			{
				DimDetailType dimDetailType = (DimDetailType)theEObject;
				T result = caseDimDetailType(dimDetailType);
				if (result == null) result = caseDDetailType(dimDetailType);
				if (result == null) result = caseDimComplexType(dimDetailType);
				if (result == null) result = caseDComplexType(dimDetailType);
				if (result == null) result = caseIValueType(dimDetailType);
				if (result == null) result = caseDimType(dimDetailType);
				if (result == null) result = caseDType(dimDetailType);
				if (result == null) result = caseIFeatureContainer(dimDetailType);
				if (result == null) result = caseINavigableMemberContainer(dimDetailType);
				if (result == null) result = caseITransposableElement(dimDetailType);
				if (result == null) result = caseINoteContainer(dimDetailType);
				if (result == null) result = caseIStaticReferenceTarget(dimDetailType);
				if (result == null) result = caseDNamedElement(dimDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_ENTITY_TYPE:
			{
				DimEntityType dimEntityType = (DimEntityType)theEObject;
				T result = caseDimEntityType(dimEntityType);
				if (result == null) result = caseDEntityType(dimEntityType);
				if (result == null) result = caseDimComplexType(dimEntityType);
				if (result == null) result = caseDComplexType(dimEntityType);
				if (result == null) result = caseIIdentityType(dimEntityType);
				if (result == null) result = caseDimType(dimEntityType);
				if (result == null) result = caseDType(dimEntityType);
				if (result == null) result = caseIFeatureContainer(dimEntityType);
				if (result == null) result = caseINavigableMemberContainer(dimEntityType);
				if (result == null) result = caseITransposableElement(dimEntityType);
				if (result == null) result = caseINoteContainer(dimEntityType);
				if (result == null) result = caseIStaticReferenceTarget(dimEntityType);
				if (result == null) result = caseDNamedElement(dimEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_FEATURE:
			{
				DimFeature dimFeature = (DimFeature)theEObject;
				T result = caseDimFeature(dimFeature);
				if (result == null) result = caseDFeature(dimFeature);
				if (result == null) result = caseITransposableElement(dimFeature);
				if (result == null) result = caseDNavigableMember(dimFeature);
				if (result == null) result = caseDNamedElement(dimFeature);
				if (result == null) result = caseINoteContainer(dimFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_ASSOCIATION:
			{
				DimAssociation dimAssociation = (DimAssociation)theEObject;
				T result = caseDimAssociation(dimAssociation);
				if (result == null) result = caseDAssociation(dimAssociation);
				if (result == null) result = caseDimFeature(dimAssociation);
				if (result == null) result = caseDFeature(dimAssociation);
				if (result == null) result = caseITransposableElement(dimAssociation);
				if (result == null) result = caseDNavigableMember(dimAssociation);
				if (result == null) result = caseDNamedElement(dimAssociation);
				if (result == null) result = caseINoteContainer(dimAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_ATTRIBUTE:
			{
				DimAttribute dimAttribute = (DimAttribute)theEObject;
				T result = caseDimAttribute(dimAttribute);
				if (result == null) result = caseDAttribute(dimAttribute);
				if (result == null) result = caseDimFeature(dimAttribute);
				if (result == null) result = caseDFeature(dimAttribute);
				if (result == null) result = caseITransposableElement(dimAttribute);
				if (result == null) result = caseDNavigableMember(dimAttribute);
				if (result == null) result = caseDNamedElement(dimAttribute);
				if (result == null) result = caseINoteContainer(dimAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_QUERY:
			{
				DimQuery dimQuery = (DimQuery)theEObject;
				T result = caseDimQuery(dimQuery);
				if (result == null) result = caseDQuery(dimQuery);
				if (result == null) result = caseDimFeature(dimQuery);
				if (result == null) result = caseDFeature(dimQuery);
				if (result == null) result = caseINavigableMemberContainer(dimQuery);
				if (result == null) result = caseITransposableElement(dimQuery);
				if (result == null) result = caseDNavigableMember(dimQuery);
				if (result == null) result = caseDNamedElement(dimQuery);
				if (result == null) result = caseINoteContainer(dimQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DimPackage.DIM_QUERY_PARAMETER:
			{
				DimQueryParameter dimQueryParameter = (DimQueryParameter)theEObject;
				T result = caseDimQueryParameter(dimQueryParameter);
				if (result == null) result = caseDQueryParameter(dimQueryParameter);
				if (result == null) result = caseITransposableElement(dimQueryParameter);
				if (result == null) result = caseDNavigableMember(dimQueryParameter);
				if (result == null) result = caseDNamedElement(dimQueryParameter);
				if (result == null) result = caseINoteContainer(dimQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Information Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Information Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainInformationModel(DomainInformationModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimAggregate(DimAggregate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimType(DimType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimSimpleType(DimSimpleType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimPrimitive(DimPrimitive object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimEnumeration(DimEnumeration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimLiteral(DimLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimComplexType(DimComplexType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimDetailType(DimDetailType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimEntityType(DimEntityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimFeature(DimFeature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimAssociation(DimAssociation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimAttribute(DimAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimQuery(DimQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimQueryParameter(DimQueryParameter object)
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

} //DimSwitch
