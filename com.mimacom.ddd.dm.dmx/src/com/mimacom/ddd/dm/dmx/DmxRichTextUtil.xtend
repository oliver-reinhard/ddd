package com.mimacom.ddd.dm.dmx

import com.mimacom.ddd.dm.base.base.BasePackage
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.DRichText
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan
import com.mimacom.ddd.dm.base.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.ICompositeNode
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class DmxRichTextUtil {

	protected static val BASE = BasePackage.eINSTANCE

	static val START_OFFSET = 1 // Actual rich text starts after the "«" character of the DRichText element
	static val END_OFFSET = 1 // Actual richt ends before the "»" character of the DRichText element

	
	def String guard(String subject, String alternative) {
		if(subject !== null && ! subject.empty) return subject
		if(alternative !== null) return alternative
		return ""
	}

	/**
	 * Preconditions: rt is part of an XtextResource and the syntax the resource's text is valid
	 */
	def DStyledTextSpan parse(DRichText rt, ErrorMessageAcceptor acceptor) {
		val List<INode> nodes = NodeModelUtils.findNodesForFeature(rt, BASE.DRichText_Segments)
		if (!nodes.empty) {
			val INode root = nodes.head.rootNode
			val startIndex = nodes.head.offset
			val endIndex = nodes.last.endOffset - 1 // last.endOffset points to character *after* the actual text
			// strip rich-text delimiters « and »:
			if (endIndex - END_OFFSET >= startIndex + START_OFFSET) {
//				val text = new String(root.text.toCharArray, startIndex+START_OFFSET, endIndex-startIndex-END_OFFSET);
				val parser = new StyledTextParser(root.text, startIndex + START_OFFSET, endIndex - END_OFFSET, acceptor)
				return parser.parse
			}
		}
		return null
	}
	
	def String toPlainText(DRichText text) {
		val renderer = new AbstractRichTextToPlainTextRenderer {
			
			override protected getSourceText(DExpression expr) {
				expr.getSourceTextFromXtextResource
			}

			override protected renderStyleExpression(DExpression expr, String parsedText) {
				switch expr {
					DmxContextReference:
						super.renderStyleExpression(expr, expr.target.name)
					DmxStaticReference:
						super.renderStyleExpression(expr, expr.plainlinkText)
					default:
						throw new IllegalArgumentException("Unsupported content-block type: " + expr.class.name)
				}
			}
			
			override protected encode(String plainText) {
				return plainText
			}
			
		}
		renderer.render(text) as String
	}

	def String plainlinkText(DmxStaticReference ref) {
		if (! guard(ref.displayName, "").empty) {
			if (ref.plural) {
				return ref.displayName + "s"
			}
			return ref.displayName
		}
		return ref.target.name + "." + ref.member.name
	}
	
	

	/**
	 * Preconditions: xtextObject is part of an XtextResource and the syntax the resource's text is valid.<p>
	 * 
	 * @return {@code null} if no corresponding node was be found in the syntax tree.
	 */
	def String getSourceCodeFromXtextResource(EObject xtextObject) {
		val ICompositeNode node = NodeModelUtils.findActualNodeFor(xtextObject)
		return node !== null ? node.text : null;
	}
}
