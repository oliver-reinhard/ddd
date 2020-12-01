/**
 */
package com.mimacom.ddd.dm.base.synthetic.util;

import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DAssociation;
import com.mimacom.ddd.dm.base.base.DAttribute;
import com.mimacom.ddd.dm.base.base.DComplexType;
import com.mimacom.ddd.dm.base.base.DDetailType;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DEnumeration;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DNamedElement;
import com.mimacom.ddd.dm.base.base.DNavigableMember;
import com.mimacom.ddd.dm.base.base.DPrimitive;
import com.mimacom.ddd.dm.base.base.DQuery;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DSimpleType;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.base.IDiagramRoot;
import com.mimacom.ddd.dm.base.base.IFeatureContainer;
import com.mimacom.ddd.dm.base.base.IIdentityType;
import com.mimacom.ddd.dm.base.base.INavigableMemberContainer;
import com.mimacom.ddd.dm.base.base.INoteContainer;
import com.mimacom.ddd.dm.base.base.IStaticReferenceTarget;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.base.IValueType;

import com.mimacom.ddd.dm.base.synthetic.*;

import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;

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
 * @see com.mimacom.ddd.dm.base.synthetic.SyntheticPackage
 * @generated
 */
public class SyntheticSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SyntheticPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SyntheticSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = SyntheticPackage.eINSTANCE;
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
			case SyntheticPackage.TSYNTHETIC_AGGREGATE:
			{
				TSyntheticAggregate tSyntheticAggregate = (TSyntheticAggregate)theEObject;
				T result = caseTSyntheticAggregate(tSyntheticAggregate);
				if (result == null) result = caseDAggregate(tSyntheticAggregate);
				if (result == null) result = caseISyntheticElement(tSyntheticAggregate);
				if (result == null) result = caseINoteContainer(tSyntheticAggregate);
				if (result == null) result = caseITypeContainer(tSyntheticAggregate);
				if (result == null) result = caseIFeatureContainer(tSyntheticAggregate);
				if (result == null) result = caseINavigableMemberContainer(tSyntheticAggregate);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticAggregate);
				if (result == null) result = caseIDiagramRoot(tSyntheticAggregate);
				if (result == null) result = caseDNamedElement(tSyntheticAggregate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_TYPE:
			{
				TSyntheticType tSyntheticType = (TSyntheticType)theEObject;
				T result = caseTSyntheticType(tSyntheticType);
				if (result == null) result = caseDType(tSyntheticType);
				if (result == null) result = caseISyntheticElement(tSyntheticType);
				if (result == null) result = caseINoteContainer(tSyntheticType);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticType);
				if (result == null) result = caseDNamedElement(tSyntheticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_PRIMITIVE:
			{
				TSyntheticPrimitive tSyntheticPrimitive = (TSyntheticPrimitive)theEObject;
				T result = caseTSyntheticPrimitive(tSyntheticPrimitive);
				if (result == null) result = caseDPrimitive(tSyntheticPrimitive);
				if (result == null) result = caseTSyntheticType(tSyntheticPrimitive);
				if (result == null) result = caseDSimpleType(tSyntheticPrimitive);
				if (result == null) result = caseISyntheticElement(tSyntheticPrimitive);
				if (result == null) result = caseDType(tSyntheticPrimitive);
				if (result == null) result = caseIValueType(tSyntheticPrimitive);
				if (result == null) result = caseINoteContainer(tSyntheticPrimitive);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticPrimitive);
				if (result == null) result = caseDNamedElement(tSyntheticPrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_ENUMERATION:
			{
				TSyntheticEnumeration tSyntheticEnumeration = (TSyntheticEnumeration)theEObject;
				T result = caseTSyntheticEnumeration(tSyntheticEnumeration);
				if (result == null) result = caseDEnumeration(tSyntheticEnumeration);
				if (result == null) result = caseTSyntheticType(tSyntheticEnumeration);
				if (result == null) result = caseDSimpleType(tSyntheticEnumeration);
				if (result == null) result = caseINavigableMemberContainer(tSyntheticEnumeration);
				if (result == null) result = caseISyntheticElement(tSyntheticEnumeration);
				if (result == null) result = caseDType(tSyntheticEnumeration);
				if (result == null) result = caseIValueType(tSyntheticEnumeration);
				if (result == null) result = caseINoteContainer(tSyntheticEnumeration);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticEnumeration);
				if (result == null) result = caseDNamedElement(tSyntheticEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_LITERAL:
			{
				TSyntheticLiteral tSyntheticLiteral = (TSyntheticLiteral)theEObject;
				T result = caseTSyntheticLiteral(tSyntheticLiteral);
				if (result == null) result = caseDLiteral(tSyntheticLiteral);
				if (result == null) result = caseISyntheticElement(tSyntheticLiteral);
				if (result == null) result = caseDNavigableMember(tSyntheticLiteral);
				if (result == null) result = caseDNamedElement(tSyntheticLiteral);
				if (result == null) result = caseINoteContainer(tSyntheticLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_COMPLEX_TYPE:
			{
				TSyntheticComplexType tSyntheticComplexType = (TSyntheticComplexType)theEObject;
				T result = caseTSyntheticComplexType(tSyntheticComplexType);
				if (result == null) result = caseDComplexType(tSyntheticComplexType);
				if (result == null) result = caseTSyntheticType(tSyntheticComplexType);
				if (result == null) result = caseDType(tSyntheticComplexType);
				if (result == null) result = caseIFeatureContainer(tSyntheticComplexType);
				if (result == null) result = caseINavigableMemberContainer(tSyntheticComplexType);
				if (result == null) result = caseISyntheticElement(tSyntheticComplexType);
				if (result == null) result = caseINoteContainer(tSyntheticComplexType);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticComplexType);
				if (result == null) result = caseDNamedElement(tSyntheticComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_DETAIL_TYPE:
			{
				TSyntheticDetailType tSyntheticDetailType = (TSyntheticDetailType)theEObject;
				T result = caseTSyntheticDetailType(tSyntheticDetailType);
				if (result == null) result = caseDDetailType(tSyntheticDetailType);
				if (result == null) result = caseTSyntheticComplexType(tSyntheticDetailType);
				if (result == null) result = caseDComplexType(tSyntheticDetailType);
				if (result == null) result = caseIValueType(tSyntheticDetailType);
				if (result == null) result = caseTSyntheticType(tSyntheticDetailType);
				if (result == null) result = caseDType(tSyntheticDetailType);
				if (result == null) result = caseIFeatureContainer(tSyntheticDetailType);
				if (result == null) result = caseINavigableMemberContainer(tSyntheticDetailType);
				if (result == null) result = caseISyntheticElement(tSyntheticDetailType);
				if (result == null) result = caseINoteContainer(tSyntheticDetailType);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticDetailType);
				if (result == null) result = caseDNamedElement(tSyntheticDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_ENTITY_TYPE:
			{
				TSyntheticEntityType tSyntheticEntityType = (TSyntheticEntityType)theEObject;
				T result = caseTSyntheticEntityType(tSyntheticEntityType);
				if (result == null) result = caseDEntityType(tSyntheticEntityType);
				if (result == null) result = caseTSyntheticComplexType(tSyntheticEntityType);
				if (result == null) result = caseDComplexType(tSyntheticEntityType);
				if (result == null) result = caseIIdentityType(tSyntheticEntityType);
				if (result == null) result = caseTSyntheticType(tSyntheticEntityType);
				if (result == null) result = caseDType(tSyntheticEntityType);
				if (result == null) result = caseIFeatureContainer(tSyntheticEntityType);
				if (result == null) result = caseINavigableMemberContainer(tSyntheticEntityType);
				if (result == null) result = caseISyntheticElement(tSyntheticEntityType);
				if (result == null) result = caseINoteContainer(tSyntheticEntityType);
				if (result == null) result = caseIStaticReferenceTarget(tSyntheticEntityType);
				if (result == null) result = caseDNamedElement(tSyntheticEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_FEATURE:
			{
				TSyntheticFeature tSyntheticFeature = (TSyntheticFeature)theEObject;
				T result = caseTSyntheticFeature(tSyntheticFeature);
				if (result == null) result = caseDFeature(tSyntheticFeature);
				if (result == null) result = caseISyntheticElement(tSyntheticFeature);
				if (result == null) result = caseDNavigableMember(tSyntheticFeature);
				if (result == null) result = caseDNamedElement(tSyntheticFeature);
				if (result == null) result = caseINoteContainer(tSyntheticFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_ASSOCIATION:
			{
				TSyntheticAssociation tSyntheticAssociation = (TSyntheticAssociation)theEObject;
				T result = caseTSyntheticAssociation(tSyntheticAssociation);
				if (result == null) result = caseDAssociation(tSyntheticAssociation);
				if (result == null) result = caseTSyntheticFeature(tSyntheticAssociation);
				if (result == null) result = caseDFeature(tSyntheticAssociation);
				if (result == null) result = caseISyntheticElement(tSyntheticAssociation);
				if (result == null) result = caseDNavigableMember(tSyntheticAssociation);
				if (result == null) result = caseDNamedElement(tSyntheticAssociation);
				if (result == null) result = caseINoteContainer(tSyntheticAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_ATTRIBUTE:
			{
				TSyntheticAttribute tSyntheticAttribute = (TSyntheticAttribute)theEObject;
				T result = caseTSyntheticAttribute(tSyntheticAttribute);
				if (result == null) result = caseDAttribute(tSyntheticAttribute);
				if (result == null) result = caseTSyntheticFeature(tSyntheticAttribute);
				if (result == null) result = caseDFeature(tSyntheticAttribute);
				if (result == null) result = caseISyntheticElement(tSyntheticAttribute);
				if (result == null) result = caseDNavigableMember(tSyntheticAttribute);
				if (result == null) result = caseDNamedElement(tSyntheticAttribute);
				if (result == null) result = caseINoteContainer(tSyntheticAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_QUERY:
			{
				TSyntheticQuery tSyntheticQuery = (TSyntheticQuery)theEObject;
				T result = caseTSyntheticQuery(tSyntheticQuery);
				if (result == null) result = caseDQuery(tSyntheticQuery);
				if (result == null) result = caseTSyntheticFeature(tSyntheticQuery);
				if (result == null) result = caseDFeature(tSyntheticQuery);
				if (result == null) result = caseINavigableMemberContainer(tSyntheticQuery);
				if (result == null) result = caseISyntheticElement(tSyntheticQuery);
				if (result == null) result = caseDNavigableMember(tSyntheticQuery);
				if (result == null) result = caseDNamedElement(tSyntheticQuery);
				if (result == null) result = caseINoteContainer(tSyntheticQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SyntheticPackage.TSYNTHETIC_QUERY_PARAMETER:
			{
				TSyntheticQueryParameter tSyntheticQueryParameter = (TSyntheticQueryParameter)theEObject;
				T result = caseTSyntheticQueryParameter(tSyntheticQueryParameter);
				if (result == null) result = caseDQueryParameter(tSyntheticQueryParameter);
				if (result == null) result = caseISyntheticElement(tSyntheticQueryParameter);
				if (result == null) result = caseDNavigableMember(tSyntheticQueryParameter);
				if (result == null) result = caseDNamedElement(tSyntheticQueryParameter);
				if (result == null) result = caseINoteContainer(tSyntheticQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Aggregate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticAggregate(TSyntheticAggregate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticType(TSyntheticType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticPrimitive(TSyntheticPrimitive object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticEnumeration(TSyntheticEnumeration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticLiteral(TSyntheticLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticComplexType(TSyntheticComplexType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Detail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Detail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticDetailType(TSyntheticDetailType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticEntityType(TSyntheticEntityType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticFeature(TSyntheticFeature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticAssociation(TSyntheticAssociation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticAttribute(TSyntheticAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticQuery(TSyntheticQuery object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSynthetic Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSynthetic Query Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSyntheticQueryParameter(TSyntheticQueryParameter object)
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

} //SyntheticSwitch
