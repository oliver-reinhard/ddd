/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.ui.contentassist

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.dmx.DmxUtil
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider
import com.mimacom.ddd.dm.dom.DomComplexObject
import com.mimacom.ddd.dm.dom.DomField
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

	override complete_DomField(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_DomField(model, ruleCall, context, acceptor)
		proposeAllMandatoryFieldsNotYetPresent(model.eContainer, false, acceptor, context)
		val container = model.eContainer
		if (container instanceof DomComplexObject) {
			if (container.ref !== null) {
				for (feature : container.ref.allFeatures) {
					if (! container.fields.map[ref].contains(feature)) { // propose only fields that are not  present yet
						val displayString = new StringBuilder(feature.name)
						if (feature.type !== null) {
							displayString.append(" - ")
							displayString.append(feature.type.name)
						}
						if (feature.optional) {
							displayString.append(" (optional)")
						}
						val proposal = '''«feature.name» = «feature.typedLiteral»'''
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
		if (model instanceof DomComplexObject) {
			if (model.ref !== null) {
				val features = model.ref.allFeatures.filter[! (optional || model.fields.map[ref].contains(it))]
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
	
	protected def String calcIndent(DomComplexObject container) {
		var indent = ""
		var EObject c = container
		while (c instanceof DomComplexObject || c instanceof DomField) {
			if (c instanceof DomComplexObject) {
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
				case IDENTIFIER: "someId"
				case NUMBER: "1"
				case TEXT: "\"\""
				case TIMEPOINT: "\"" + DmxUtil::TIMEPOINT_DATE_TIME_FORMAT.format(new Date()) + "\""
				case COMPLEX: "detail " + typeDescriptor.type.name + " { }"
				default: "unknownType"
			}
		}
	}
}
