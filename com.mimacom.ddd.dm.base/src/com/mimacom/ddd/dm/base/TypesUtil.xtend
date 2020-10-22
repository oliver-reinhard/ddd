package com.mimacom.ddd.dm.base

import com.google.common.collect.Lists
import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DInformationModel
import com.mimacom.ddd.dm.base.base.DLiteral
import com.mimacom.ddd.dm.base.base.DNamedElement
import com.mimacom.ddd.dm.base.base.DNamedPredicate
import com.mimacom.ddd.dm.base.base.DNavigableMember
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DQueryParameter
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.IFeatureContainer
import com.mimacom.ddd.dm.base.base.impl.DDetailTypeImpl
import com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl
import com.mimacom.ddd.dm.base.base.impl.DEnumerationImpl
import com.mimacom.ddd.dm.base.base.impl.DPrimitiveImpl
import com.mimacom.ddd.dm.base.synthetic.TSyntheticAggregate
import com.mimacom.ddd.dm.base.transpose.ITransposableElement
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition
import com.mimacom.ddd.dm.base.transpose.TAssociationTransposition
import com.mimacom.ddd.dm.base.transpose.TAttributeTransposition
import com.mimacom.ddd.dm.base.transpose.TDetailTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TDitchRule
import com.mimacom.ddd.dm.base.transpose.TEntityTypeTransposition
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TFuseRule
import com.mimacom.ddd.dm.base.transpose.TGrabAggregateRule
import com.mimacom.ddd.dm.base.transpose.TGrabRule
import com.mimacom.ddd.dm.base.transpose.TInformationModel
import com.mimacom.ddd.dm.base.transpose.TMorphRule
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition
import com.mimacom.ddd.dm.base.transpose.TTranspositionRule
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import java.util.Collections
import java.util.LinkedHashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

class TypesUtil {

	/*
	 * Returns all the supertypes of the given type.
	 */
	def Set<DComplexType> typeHierarchy(DComplexType type) {
		val hierarchy = new LinkedHashSet<DComplexType>()
		var current = type.superType
		while (current !== null && ! hierarchy.contains(current)) {
			hierarchy.add(current)
			current = current.superType
		}
		return hierarchy
	}

	/*
	 * Returns the names of all the features of the given type: its own as well as the inherited ones.
	 */
	def dispatch List<DFeature> allFeatures(DComplexType type) {
		if (type === null) {
			return Collections.EMPTY_LIST
		}
		val features = Lists.newArrayList(type.features)
		for (t : type.typeHierarchy) {
			features.addAll(t.features)
		}
		return features
	}

	def dispatch List<DFeature> allFeatures(IFeatureContainer container) {
		return container.features
	}

	/*
	 * Returns the names of all the inherited features of the given type (but not its own features).
	 */
	def Set<String> inheritedFeatureNames(DComplexType type) {
		val supertypes = type.typeHierarchy
		val features = new LinkedHashSet<String>()
		for (t : supertypes) {
			features.addAll(t.features.map[name])
		}
		return features
	}

	def DInformationModel domain(EObject obj) {
		return EcoreUtil2.getContainerOfType(obj, DInformationModel) // global types are not owned by a domain => null
	}

	def String domainName(EObject obj) {
		val d = obj.domain
		return if (d !== null) d.name else "NO_DOMAIN"
	}

	def DAggregate aggregate(EObject obj) {
		return EcoreUtil2.getContainerOfType(obj, DAggregate) // global types are not owned by a domain => null
	}

	def String aggregateName(EObject obj) {
		val a = obj.aggregate
		return if (a !== null) a.name else "default"
	}

	def multiplicityText(DNavigableMember member) {
		val m = member.multiplicity
		if (m === null || m.minOccurs == 1 && m.maxOccurs == 1) return ""
		val maxOccurs = if (m.maxOccurs == -1) "*" else m.maxOccurs.toString
		return "[" + m.minOccurs + "," + maxOccurs + "]"
	}

	/*
	 * Precondition: d is the domain owning the association
	 */
	def boolean isTargetInsideDomain(DAssociation a, DInformationModel d) {
		if (a.targetType !== null) {
			val targetDomain = a.targetType.domain
			return d == targetDomain
		}
		return false
	}

	def boolean isTargetInsideDomain(DAssociation a) {
		val d = a.domain
		if (d === null) return false
		return a.isTargetInsideDomain(d)
	}

	/*
	 * Precondition: d is the domain owning the feature
	 */
	def boolean isTypeInsideDomain(DFeature f, DInformationModel d) {
		if (f.getType !== null) {
			val targetDomain = f.getType.domain
			return d == targetDomain
		}
		return false
	}

	def boolean isTypeInsideDomain(DFeature f) {
		val d = f.domain
		if (d === null) return false
		return f.isTypeInsideDomain(d)
	}

	// // Labels
	def String describeType(DNavigableMember m) {
		val b = new StringBuilder
		if (m.type !== null) {
			if (m.type.name !== null) {
				b.append(m.type.name)
				b.append(m.multiplicityText)
			}
			b.append(" (")
			b.append(m.type.metatypeName)
			b.append(")")
		}
		return b.toString
	}

	def String metatypeName(DType type) {
		switch type {
			DPrimitive:
				"Primitive"
			DEnumeration:
				"Enumeration"
			DEntityType: {
				val name = switch type.nature {
					case AUTONOMOUS_ENTITY,
					case CONTROLLED_ENTITY: "Entity"
					case RELATIONSHIP: "Relationship"
					default: type.nature.getName
				}
				if (type.root) "main " + name else name
			}
			DDetailType:
				"Detail"
			default:
				type.class.simpleName
		}
	}

	def Class<? extends DType> baseImplClass(TTypeTransposition type) {
		switch (type) {
			TPrimitiveTransposition: DPrimitiveImpl
			TEnumerationTransposition: DEnumerationImpl
			TEntityTypeTransposition: DEntityTypeImpl
			TDetailTypeTransposition: DDetailTypeImpl
		}
	}

	def Class<? extends DFeature> baseClass(TFeatureTransposition feature) {
		switch (feature) {
			TAttributeTransposition: DAttribute
			TAssociationTransposition: DAssociation
			TQueryTransposition: DQuery
		}
	}

	def EClass baseEClass(TFeatureTransposition feature) {
		switch (feature) {
			TAttributeTransposition: BasePackage.eINSTANCE.DAttribute
			TAssociationTransposition: BasePackage.eINSTANCE.DAssociation
			TQueryTransposition: BasePackage.eINSTANCE.DQuery
		}
	}

	def List<DType> syntheticTypes(TAggregateTransposition a) {
		// get synthetic aggregate that was created for 'aggregate' rule:
		val model = a.eContainer as TInformationModel
		val syntheticAggregates = model.aggregates.filter(TSyntheticAggregate).filter[recipe == a]
		if (syntheticAggregates.size == 1) {
			return syntheticAggregates.head.types
		}
		return Collections.EMPTY_LIST
	}

	def String label(DAggregate a) {
		return "Component " + a.name
	}

	def String label(DType type) {
		return type.metatypeName + " " + type?.name
	}

	def String label(DLiteral lit) {
		return lit.name
	}

	def String label(DAssociation a) {
		switch a.kind {
			case REFERENCE: "Reference to "
			case COMPOSITE: "Composite to "
			case INVERSE_COMPOSITE: "Inverse Composite to "
			default: a.kind.toString
		}
	}

	def String label(DFeature f) {
		return f.name + " : " + f.getType?.label
	}

	def String label(DQuery f) {
		return f.name + "() : " + f.getType?.label
	}

	def String label(DQueryParameter p) {
		return p.name + " : " + p.getType?.label
	}

	def String label(DNamedPredicate c) {
		return "Constraint " + c.name
	}

	def String label(ITransposableElement e) {
		if (e instanceof DNamedElement) return e.name
		return e.toString
	}

	def String label(TTranspositionRule rule) {
		return switch rule {
			TMorphRule: "Morph " + rule.source.label + if (rule.getRenameTo !== null) " as " + rule.getRenameTo else ""
			TFuseRule: "Fuse " + rule.source.label
			TGrabRule: "Grab " + rule.source.label + if (rule.getRenameTo !== null) " as " + rule.getRenameTo else ""
			TDitchRule: "Ditch " + rule.source.label
			TGrabAggregateRule: "Grab aggregate " + rule.source.label
			default: rule.class.simpleName
		}
	}

	def String label(TFuseRule rule) {
		val sb = new StringBuilder(rule.namedSource?.name)
		for (s : rule.otherSources) {
			sb.append(" and ")
			sb.append(s.name)
		}
		return sb.toString
	}
}
