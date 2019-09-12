/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.util;

import com.mimacom.ddd.dm.dom.*;

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
 * @see com.mimacom.ddd.dm.dom.DomPackage
 * @generated
 */
public class DomSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = DomPackage.eINSTANCE;
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
			case DomPackage.DOM_MODEL:
			{
				DomModel domModel = (DomModel)theEObject;
				T result = caseDomModel(domModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomPackage.SNAPSHOT:
			{
				Snapshot snapshot = (Snapshot)theEObject;
				T result = caseSnapshot(snapshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomPackage.DOM_COMPLEX_OBJECT:
			{
				DomComplexObject domComplexObject = (DomComplexObject)theEObject;
				T result = caseDomComplexObject(domComplexObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomPackage.DOM_ENTITY_OBJECT:
			{
				DomEntityObject domEntityObject = (DomEntityObject)theEObject;
				T result = caseDomEntityObject(domEntityObject);
				if (result == null) result = caseDomComplexObject(domEntityObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomPackage.DOM_DETAIL_OBJECT:
			{
				DomDetailObject domDetailObject = (DomDetailObject)theEObject;
				T result = caseDomDetailObject(domDetailObject);
				if (result == null) result = caseDomComplexObject(domDetailObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomPackage.DOM_FIELD:
			{
				DomField domField = (DomField)theEObject;
				T result = caseDomField(domField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomModel(DomModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snapshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snapshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapshot(Snapshot object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomComplexObject(DomComplexObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomEntityObject(DomEntityObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detail Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detail Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomDetailObject(DomDetailObject object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomField(DomField object)
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

} //DomSwitch
