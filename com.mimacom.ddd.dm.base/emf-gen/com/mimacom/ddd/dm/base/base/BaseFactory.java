/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.mimacom.ddd.dm.base.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaseFactory eINSTANCE = com.mimacom.ddd.dm.base.base.impl.BaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DText Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DText Segment</em>'.
	 * @generated
	 */
	DTextSegment createDTextSegment();

	/**
	 * Returns a new object of class '<em>DRich Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DRich Text</em>'.
	 * @generated
	 */
	DRichText createDRichText();

	/**
	 * Returns a new object of class '<em>DNote</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNote</em>'.
	 * @generated
	 */
	DNote createDNote();

	/**
	 * Returns a new object of class '<em>DImport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DImport</em>'.
	 * @generated
	 */
	DImport createDImport();

	/**
	 * Returns a new object of class '<em>DNamespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNamespace</em>'.
	 * @generated
	 */
	DNamespace createDNamespace();

	/**
	 * Returns a new object of class '<em>DInformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DInformation Model</em>'.
	 * @generated
	 */
	DInformationModel createDInformationModel();

	/**
	 * Returns a new object of class '<em>DContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DContext</em>'.
	 * @generated
	 */
	DContext createDContext();

	/**
	 * Returns a new object of class '<em>DMultiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMultiplicity</em>'.
	 * @generated
	 */
	DMultiplicity createDMultiplicity();

	/**
	 * Returns a new object of class '<em>DNamed Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DNamed Predicate</em>'.
	 * @generated
	 */
	DNamedPredicate createDNamedPredicate();

	/**
	 * Returns a new object of class '<em>DComplex Type Proxy Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DComplex Type Proxy Dummy</em>'.
	 * @generated
	 */
	DComplexTypeProxyDummy createDComplexTypeProxyDummy();

	/**
	 * Returns a new object of class '<em>DFeature Proxy Dummy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFeature Proxy Dummy</em>'.
	 * @generated
	 */
	DFeatureProxyDummy createDFeatureProxyDummy();

	/**
	 * Returns a new object of class '<em>DState</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DState</em>'.
	 * @generated
	 */
	DState createDState();

	/**
	 * Returns a new object of class '<em>DState Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DState Event</em>'.
	 * @generated
	 */
	DStateEvent createDStateEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasePackage getBasePackage();

} //BaseFactory
