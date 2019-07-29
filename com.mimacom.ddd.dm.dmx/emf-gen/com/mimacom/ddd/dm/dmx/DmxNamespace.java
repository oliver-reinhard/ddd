/**
 */
package com.mimacom.ddd.dm.dmx;

import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.base.ITypeContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxNamespace#getImports <em>Imports</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxNamespace#getFilters <em>Filters</em>}</li>
 *   <li>{@link com.mimacom.ddd.dm.dmx.DmxNamespace#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxNamespace()
 * @model
 * @generated
 */
public interface DmxNamespace extends DNamedElement, ITypeContainer
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DImport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxNamespace_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DImport> getImports();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dmx.DmxFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxNamespace_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmxFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.dmx.DmxTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see com.mimacom.ddd.dm.dmx.DmxPackage#getDmxNamespace_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<DmxTest> getTests();

} // DmxNamespace
