package com.mimacom.ddd.sm.sim

import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DDeductionRule
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.base.impl.DDetailTypeImpl
import com.mimacom.ddd.dm.base.impl.DEntityTypeImpl
import com.mimacom.ddd.dm.base.impl.DEnumerationImpl
import com.mimacom.ddd.dm.base.impl.DPrimitiveImpl
import com.mimacom.ddd.dm.dim.DimUtil
import javax.inject.Inject
import org.eclipse.emf.ecore.EClass

class SimUtil {
	
	@Inject extension DimUtil
	
	def Class<? extends DType> baseImplClass(STypeDeduction type) {
		switch (type) {
			SPrimitiveDeduction : DPrimitiveImpl
			SEnumerationDeduction : DEnumerationImpl
			SEntityTypeDeduction : DEntityTypeImpl
			SDetailTypeDeduction : DDetailTypeImpl
		}
	}
	def Class<? extends DFeature> baseClass(SFeatureDeduction feature) {
		switch (feature) {
			SAttributeDeduction : DAttribute
			SAssociationDeduction : DAssociation
			SQueryDeduction : DQuery
		}
	}
	
	def EClass baseEClass(SFeatureDeduction feature) {
		switch (feature) {
			SAttributeDeduction : BasePackage.eINSTANCE.DAttribute
			SAssociationDeduction : BasePackage.eINSTANCE.DAssociation
			SQueryDeduction : BasePackage.eINSTANCE.DQuery
		}
	}
	
//	def SAggregate aggregate(EObject obj) {
//			return EcoreUtil2.getContainerOfType(obj, SAggregate)// global types are not owned by a domain => null
//	}
//	
//	def String aggregateName(EObject obj) {
//			val a = obj.aggregate
//			return if (a !== null) a.derivedName else "NO_AGGREGATE" 
//	}
//	
//	/*
//	 * Returns all the supertypes of the given type.
//	 */
//	def Set<SComplexType> typeHierarchy(SComplexType type) {
//		val hierarchy = new LinkedHashSet<SComplexType>()
//		var current = type.superType
//		while (current !== null && ! hierarchy.contains(current)) {
//			hierarchy.add(current)
//			current = current.superType
//		}
//		return hierarchy
//	}
//	
//	/*
//	 * Returns all the supertypes of the given type.
//	 */
//	def Set<DComplexType> typeHierarchy(DComplexType type) {
//		val hierarchy = new LinkedHashSet<DComplexType>()
//		var current = type.superType
//		while (current !== null && ! hierarchy.contains(current)) {
//			hierarchy.add(current)
//			current = current.superType
//		}
//		return hierarchy
//	}
	
//	/*
//	 * Returns the names of all the inherited features of the given type.
//	 */
//	def Set<String> inheritedFeatureNames(SComplexType type) {
//		val supertypes = type.typeHierarchy
//		val features = new LinkedHashSet<String>()
//		for (t : supertypes) {
//			features.addAll(t.features.map[name])
//		}
//		return features
//	}
//	//// Labels
	
//	def String label(SAggregate a) {
//		return "Aggregate " + a.derivedName
//	}
//	
//	def String label(SType type) {
//		val typeLabel = switch type {
//			SPrimitive: if (type.archetype) "Archetype " else  "Primitive "
//			SEnumeration: "Enumeration "
//			SEntityType: if (type.root) "Root " else "Entity "
//			SDetailType: "Detail "
//			SAssociation: switch type.kind {
//				case REFERENCE: "Reference "
//				case COMPOSITE: "Composite "
//				case INVERSE_COMPOSITE: "Inverse Composite "
//				default: type.kind.toString
//			}
//			default: type.class.simpleName + " "
//		}
//		return typeLabel + if (type?.name !== null) type.name else "NO_NAME"
//	}
//	
//	def String label(SFeature f) {
//		return f?.name + " : " + f.type?.label
//	}
//	
//	def String label(SQueryParameter p) {
//		return p?.name + " : " + p.type?.label
//	}
//	
//	def String label(SCondition c) {
//		return "Constraint " + c.name
//	}
	
	def String label(DDeductionRule rule) {
		return switch rule {
			SMorphRule : "Morph "  + rule.source.label + if (rule.renameTo !== null) " as " + rule.renameTo else ""
			SFuseRule:  "Fuse "  + rule.source.label
			SGrabRule : "Grab "  + rule.source.label + if (rule.renameTo !== null) " as " + rule.renameTo else ""
			SDitchRule : "Ditch "  + rule.source.label
			SGrabAggregateRule: "Grab aggregate " + rule.source.label
			default: rule.class.simpleName
		}
	}
	
	def String label(SFuseRule rule) {
		val sb = new StringBuilder(rule.namedSource?.name)
		for (s : rule.otherSources) {
			sb.append(" and ")
			sb.append(s.name)
		}
		return sb.toString
	}
}