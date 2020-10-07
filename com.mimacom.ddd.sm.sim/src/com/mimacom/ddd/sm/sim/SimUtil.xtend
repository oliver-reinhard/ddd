package com.mimacom.ddd.sm.sim

import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DFeature
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.base.TTranspositionRule
import com.mimacom.ddd.dm.base.base.impl.DDetailTypeImpl
import com.mimacom.ddd.dm.base.base.impl.DEntityTypeImpl
import com.mimacom.ddd.dm.base.base.impl.DEnumerationImpl
import com.mimacom.ddd.dm.base.base.impl.DPrimitiveImpl
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
import com.mimacom.ddd.dm.base.transpose.TMorphRule
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
import com.mimacom.ddd.dm.base.transpose.TQueryTransposition
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import com.mimacom.ddd.dm.dim.DimUtil
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EClass

class SimUtil extends DimUtil {
	
	def Class<? extends DType> baseImplClass(TTypeTransposition type) {
		switch (type) {
			TPrimitiveTransposition : DPrimitiveImpl
			TEnumerationTransposition : DEnumerationImpl
			TEntityTypeTransposition : DEntityTypeImpl
			TDetailTypeTransposition : DDetailTypeImpl
		}
	}
	def Class<? extends DFeature> baseClass(TFeatureTransposition feature) {
		switch (feature) {
			TAttributeTransposition : DAttribute
			TAssociationTransposition : DAssociation
			TQueryTransposition : DQuery
		}
	}
	
	def List<DType> syntheticTypes(TAggregateTransposition a) {
		// get synthetic aggregate that was created for 'aggregate' rule:
		val model = a.eContainer as SInformationModel
		val syntheticAggregates = model.aggregates.filter[isSynthetic && getTransposedBy == a]
		if (syntheticAggregates.size == 1) {
			return syntheticAggregates.head.types
		}
		return Collections.EMPTY_LIST
	}
	
	def EClass baseEClass(TFeatureTransposition feature) {
		switch (feature) {
			TAttributeTransposition : BasePackage.eINSTANCE.DAttribute
			TAssociationTransposition : BasePackage.eINSTANCE.DAssociation
			TQueryTransposition : BasePackage.eINSTANCE.DQuery
		}
	}
	
	override String label(DAggregate a) {
		return "Aggregate " + a.name
	}
	
	def String label(TTranspositionRule rule) {
		return switch rule {
			TMorphRule : "Morph "  + rule.source.label + if (rule.getRenameTo !== null) " as " + rule.getRenameTo else ""
			TFuseRule:  "Fuse "  + rule.source.label
			TGrabRule : "Grab "  + rule.source.label + if (rule.getRenameTo !== null) " as " + rule.getRenameTo else ""
			TDitchRule : "Ditch "  + rule.source.label
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