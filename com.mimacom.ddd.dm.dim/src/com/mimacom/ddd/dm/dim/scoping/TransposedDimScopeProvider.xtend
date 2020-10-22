/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.scoping

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.ITypeContainer
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TComplexTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule
import com.mimacom.ddd.dm.base.transpose.TransposePackage
import com.mimacom.ddd.dm.dim.DimUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes

class TransposedDimScopeProvider extends DimScopeProvider {

	@Inject extension DimUtil

	static val BASE = BasePackage.eINSTANCE
	static val TRANSPOSE = TransposePackage.eINSTANCE

	override getScope(EObject context, EReference reference) {

		if (reference == TRANSPOSE.TTranspositionRule_Source) {
			val decduction = context instanceof TTranspositionRule ? context.eContainer : context
			val container = decduction.eContainer
			
			if (decduction instanceof TAggregateTransposition) {
				return getDefaultScopeOfType(decduction, BASE.DAggregate)

			} else if (decduction instanceof TPrimitiveTransposition) {
				return getDefaultScopeOfType(decduction, BASE.DPrimitive)

			} else if (decduction instanceof TEntityTypeTransposition) {
				return getDefaultScopeOfType(decduction, BASE.DEntityType)

			} else if (decduction instanceof TDetailTypeTransposition) {
				return getDefaultScopeOfType(decduction, BASE.DDetailType)

			} else if (decduction instanceof TLiteralTransposition) {
				if (container instanceof TEnumerationTransposition) {
					val sourceType = container.rule?.source
					if (sourceType instanceof DEnumeration) {
						return Scopes.scopeFor(sourceType.literals)
					}
				}
				return IScope.NULLSCOPE

			} else if (decduction instanceof TFeatureTransposition) {
				if (container instanceof TComplexTypeTransposition) {
					val sourceType = container.rule?.source
					if (sourceType instanceof DComplexType) {
						val requiredFeatureType = decduction.baseClass
						return getInheritedFeaturesScope(sourceType, requiredFeatureType, IScope.NULLSCOPE)
					}
				} else if (container instanceof TAggregateTransposition) {
					val source = container.rule?.source
					if (source instanceof DAggregate) {
						return Scopes.scopeFor(source.features.filter(DQuery))
					}
				}
				return IScope.NULLSCOPE

			} else if (decduction instanceof TQueryParameterTransposition) {
				if (container instanceof TQueryTransposition) {
					val source = container.rule?.source
					if (source instanceof DQuery) {
						return Scopes.scopeFor(source.parameters)
					}
				}
				return IScope.NULLSCOPE
			}
		}
		super.getScope(context, reference)
	}

	override getDefaultScopeOfType(EObject context, EClass type) {
		if (context instanceof DQuery || context instanceof DQueryParameter) {
			val container = EcoreUtil2.getContainerOfType(context, ITypeContainer)
			if (container instanceof TAggregateTransposition) {
				val outerScope = getDefaultScopeOfType(container, BASE.IValueType)
				val syntheticTypes = container.syntheticTypes
				if (! syntheticTypes.empty) {
					return Scopes.scopeFor(syntheticTypes, outerScope)
				}
				return outerScope
			}
		}
		return super.getDefaultScopeOfType(context, type)
	}

	protected def IScope getInheritedFeaturesScope(DComplexType owner, Class<? extends EObject> featureType,
		IScope outerScope) {
		val features = owner.features.filter(featureType)
		if (owner.superType !== null) {
			return Scopes.scopeFor(features, getInheritedFeaturesScope(owner.superType, featureType, outerScope)) // recursion
		} else {
			return Scopes.scopeFor(features, outerScope)
		}
	}
}