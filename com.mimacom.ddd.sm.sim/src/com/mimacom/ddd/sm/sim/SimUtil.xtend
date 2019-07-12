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