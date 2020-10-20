/**
 */
package com.mimacom.ddd.dm.base.transpose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISynthetic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.transpose.ISyntheticElement#getRecipe <em>Recipe</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getISyntheticElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISyntheticElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' reference.
	 * @see #setRecipe(ITransposition)
	 * @see com.mimacom.ddd.dm.base.transpose.TransposePackage#getISyntheticElement_Recipe()
	 * @model
	 * @generated
	 */
	ITransposition getRecipe();

	/**
	 * Sets the value of the '{@link com.mimacom.ddd.dm.base.transpose.ISyntheticElement#getRecipe <em>Recipe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe</em>' reference.
	 * @see #getRecipe()
	 * @generated
	 */
	void setRecipe(ITransposition value);

} // ISyntheticElement
