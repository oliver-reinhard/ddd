/**
 */
package com.mimacom.ddd.dm.base.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mimacom.ddd.dm.base.base.DAggregate#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDAggregate()
 * @model
 * @generated
 */
public interface DAggregate extends DNamedElement, ITypeContainer, IFeatureContainer, INavigableMemberContainer, IStaticReferenceTarget, ITransposableElement, IDiagramRoot
{
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.base.DEntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see com.mimacom.ddd.dm.base.base.BasePackage#getDAggregate_Roots()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DEntityType> getRoots();

} // DAggregate
