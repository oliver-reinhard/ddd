/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.ui.outline

import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.dmx.DmxAssignment
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxPackage
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class DmxOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	static val DMX = DmxPackage.eINSTANCE
	static val NULL_IMAGE = null as ImageDescriptor
	static val FEATURE_IMAGE = NULL_IMAGE
	
	
	def _createNode(IOutlineNode parentNode, DContext context) {
		// DmxContextReference has NO childeren => customise _createNode
		val type = if (context.type !== null) {
			" : " + context.type.name + if (context.multiplicity !== null) {
					"(" + context.multiplicity. minOccurs + " .. " + context.multiplicity. maxOccurs + ")"
				} else {
				""
				}
		} else {
			" : (no type)"
		}
		createEObjectNode(parentNode, context, imageDispatcher.invoke(context),	textDispatcher.invoke(context) + type , isLeafDispatcher.invoke(context));
	}
	
	def _createNode(IOutlineNode parentNode, DmxFilter filter) {
		// DmxContextReference has NO childeren => customise _createNode
		val node = createEObjectNode(parentNode, filter, imageDispatcher.invoke(filter),	textDispatcher.invoke(filter), isLeafDispatcher.invoke(filter));
		createEStructuralFeatureNode(node, filter, DMX.dmxFilter_TypeDesc, FEATURE_IMAGE, DMX.dmxFilter_TypeDesc.name + " " + filter.resultTypes +  if (filter.typeDesc.collection) "*" else "", true)
	}
	
	private def String getResultTypes(DmxFilter filter) {
		val desc = filter.typeDesc
		if (desc === null) {
			return "null"
		}
		if (desc.isMultiTyped) {
			val b = new StringBuilder(filter.typeDesc.multiple.members.get(0).literal)
			for(i:1..filter.typeDesc.multiple.members.size-1) {
				b.append(",")
				b.append(filter.typeDesc.multiple.members.get(i))
			}
			b.toString
		} else {
			desc.single.literal
		}
	}

	def _createChildren(IOutlineNode parentNode, DmxPredicateWithCorrelationVariable pred) {
		if (pred.correlationVariable !== null) {
			createEStructuralFeatureNode(parentNode, pred, DMX.dmxPredicateWithCorrelationVariable_CorrelationVariable, FEATURE_IMAGE, DMX.dmxPredicateWithCorrelationVariable_CorrelationVariable.name, false)
		}
		if (pred.value !== null) {
			createEStructuralFeatureNode(parentNode, pred, DMX.dmxPredicateWithCorrelationVariable_Value, FEATURE_IMAGE, DMX.dmxPredicateWithCorrelationVariable_Value.name, false)
		}
//		createEObjectNode(parentNode, pred.value)
	}
	
	def _createChildren(IOutlineNode parentNode, DmxMemberNavigation nav) {
		if (nav.member !== null && ! (nav.member.eIsProxy)) {
			createEStructuralFeatureNode(parentNode, nav, DMX.dmxMemberNavigation_Member, FEATURE_IMAGE, DMX.dmxMemberNavigation_Member.name, false)
		}
		if (nav.precedingNavigationSegment !== null) {
			createEStructuralFeatureNode(parentNode, nav, DMX.dmxMemberNavigation_PrecedingNavigationSegment, FEATURE_IMAGE, DMX.dmxMemberNavigation_PrecedingNavigationSegment.name, false)
		}
		if (nav.memberCallArguments.length > 0) {
			createEStructuralFeatureNode(parentNode, nav, DMX.dmxMemberNavigation_MemberCallArguments, FEATURE_IMAGE, DMX.dmxMemberNavigation_MemberCallArguments.name, false)
		}
	}
	
	def _createChildren(IOutlineNode parentNode, DmxAssignment assign) {
		if (assign.precedingNavigationSegment !== null) {
			createEStructuralFeatureNode(parentNode, assign, DMX.dmxAssignment_PrecedingNavigationSegment, FEATURE_IMAGE, DMX.dmxAssignment_PrecedingNavigationSegment.name, false)
		}
		if (assign.assignToMember !== null && ! (assign.assignToMember.eIsProxy)) {
			createEStructuralFeatureNode(parentNode, assign, DMX.dmxAssignment_AssignToMember, FEATURE_IMAGE, DMX.dmxAssignment_AssignToMember.name, false)
		}
		if (assign.value !== null && ! (assign.assignToMember.eIsProxy)) {
			createEStructuralFeatureNode(parentNode, assign, DMX.dmxAssignment_Value, FEATURE_IMAGE, DMX.dmxAssignment_Value.name, false)
		}
	}
	
	def _createNode(IOutlineNode parentNode, DmxContextReference ref) {
		// DmxContextReference has NO childeren => customise _createNode
		val node = createEObjectNode(parentNode, ref, imageDispatcher.invoke(ref),	textDispatcher.invoke(ref), isLeafDispatcher.invoke(ref));
		if (ref.target !== null) {
			createEStructuralFeatureNode(node, ref, DMX.dmxContextReference_Target, FEATURE_IMAGE, DMX.dmxContextReference_Target.name + ": " + ref.target.name, false)
		}
		if (ref.all) {
			createEStructuralFeatureNode(node, ref, DMX.dmxContextReference_All, FEATURE_IMAGE, DMX.dmxContextReference_All.name, true)
		}
	}
	
}
