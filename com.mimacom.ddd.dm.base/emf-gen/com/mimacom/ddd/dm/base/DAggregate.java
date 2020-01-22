/**
 */
package com.mimacom.ddd.dm.base;

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
 *   <li>{@link com.mimacom.ddd.dm.base.DAggregate#getRoots <em>Roots</em>}</li>
 * </ul>
 *
 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate()
 * @model
 * @generated
 */
public interface DAggregate extends DNamedElement, ITypeContainer, IFeatureContainer, INavigableMemberContainer, IStaticReferenceTarget, IDeducibleElement
{
	/**
	 * Returns the value of the '<em><b>Roots</b></em>' reference list.
	 * The list contents are of type {@link com.mimacom.ddd.dm.base.DEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' reference list.
	 * @see com.mimacom.ddd.dm.base.BasePackage#getDAggregate_Roots()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<DEntityType> getRoots();

} // DAggregate
