/**
 */
package com.mimacom.ddd.dm.styledText;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.styledText.StyledTextPackage
 * @generated
 */
public interface StyledTextFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StyledTextFactory eINSTANCE = com.mimacom.ddd.dm.styledText.impl.StyledTextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DStyled Text Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DStyled Text Span</em>'.
	 * @generated
	 */
	DStyledTextSpan createDStyledTextSpan();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StyledTextPackage getStyledTextPackage();

} //StyledTextFactory
