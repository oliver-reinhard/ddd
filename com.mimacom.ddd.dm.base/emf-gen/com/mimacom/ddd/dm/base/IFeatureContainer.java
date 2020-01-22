/**
 */
package com.mimacom.ddd.dm.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFeature Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.IFeatureContainer#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getIFeatureContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFeatureContainer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getIFeatureContainer_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFeature> getFeatures();

} // IFeatureContainer
