/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.ui.contentassist

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.dmx.DmxComplexObject
import com.mimacom.ddd.dm.dmx.DmxField
import com.mimacom.ddd.dm.dmx.DmxUtil
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider
import com.mimacom.ddd.dm.dom.DomUtil
import java.util.Date
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class DomProposalProvider extends AbstractDomProposalProvider {

	@Inject extension DomUtil util
	@Inject DmxTypeDescriptorProvider typeDescriptorProvider
	
	static var int idCurrent = 1

	override complete_DmxField(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_DmxField(model, ruleCall, context, acceptor)
		proposeAllMandatoryFieldsNotYetPresent(model.eContainer, false, acceptor, context)
		val container = model.eContainer
		if (container instanceof DmxComplexObject) {
			if (container.type !== null) {
				for (f : container.type.allFeatures) {
					if (! container.fields.map[feature].contains(f)) { // propose only fields that are not  present yet
						val displayString = new StringBuilder(f.name)
						if (f.type !== null) {
							displayString.append(" - ")
							displayString.append(f.type.name)
						}
						if (f.optional) {
							displayString.append(" (optional)")
						}
						val proposal = '''«f.name» = «f.typedLiteral»'''
						acceptor.accept(createCompletionProposal(proposal, displayString.toString, null, context))
					}
				}
			}
		}
	}

	override complete_DomFieldListStartSymbol(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_DomFieldListStartSymbol(model, ruleCall, context, acceptor)
		proposeAllMandatoryFieldsNotYetPresent(model, true, acceptor, context)
	}

	protected def void proposeAllMandatoryFieldsNotYetPresent(EObject model, boolean surroundWithBraces, ICompletionProposalAcceptor acceptor, ContentAssistContext context) {
		if (model instanceof DmxComplexObject) {
			if (model.type !== null) {
				// exclude optional features and features already present in fields of this complex object:
				val features = model.type.allFeatures.filter[! (optional || model.fields.map[feature].contains(it))]
				val proposal = new StringBuilder()
				if (surroundWithBraces) {
					proposal.append("{\n")
				}
				var indent = calcIndent(model)
				for (var i=0; i<features.size; i++) {
					val feature = features.get(i)
					val field = '''«IF i>0 || surroundWithBraces»«indent»	«ENDIF»«feature.name» = «feature.typedLiteral»
					'''
					proposal.append(field)
				}
				if (surroundWithBraces) {
					proposal.append(indent)
					proposal.append("}")
				}
				acceptor.accept(createCompletionProposal(proposal.toString, "All mandatory fields", null, context))
			}
		}
	}
	
	protected def String calcIndent(DmxComplexObject container) {
		var indent = ""
		var EObject c = container
		while (c instanceof DmxComplexObject || c instanceof DmxField) {
			if (c instanceof DmxComplexObject) {
				indent += "\t"
			}
			c = c.eContainer
		}
		return indent
	}

	def String typedLiteral(DFeature f) {
		if (f.type !== null) {
			val typeDescriptor = typeDescriptorProvider.getTypeDescriptor(f.type, false)
			val baseType = typeDescriptor.baseType
			switch baseType {
				case BOOLEAN: "true"
				case ENUM: typeDescriptor.type.name + "." + (typeDescriptor.type as DEnumeration).literals.head.name
				case IDENTIFIER: nextId
				case NUMBER: "1"
				case TEXT: "\"\""
				case TIMEPOINT: "\"" + DmxUtil::TIMEPOINT_DATE_TIME_FORMAT.format(new Date()) + "\""
				case COMPLEX: "detail " + typeDescriptor.type.name + " { }"
				default: "unknownType"
			}
		}
	}
	
	def String nextId() {
		idCurrent++
		return Integer.toString(idCurrent)
	}
}
