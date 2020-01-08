package com.mimacom.ddd.dm.dmx

import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DRichText
import com.mimacom.ddd.dm.styledText.DStyledTextSpan
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor
import com.mimacom.ddd.dm.styledText.parser.StyledTextParser
import java.util.List
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class RichTextUtil {

	protected static val BASE = BasePackage.eINSTANCE
	
	static val START_OFFSET = 1 // Actual rich text starts after the "«" character of the DRichText element
	static val END_OFFSET = 1 // Actual richt ends before the "»" character of the DRichText element

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
	
	/**
	 * Preconditions: expr is part of an XtextResource and the syntax the resource's text is valid
	 */
	def String getSourceTextFromXtextResource(DExpression expr) {
		val List<INode> nodes = NodeModelUtils.findNodesForFeature(expr, BASE.DRichText_Segments)
		if (!nodes.empty) {
			val INode root = nodes.head.rootNode
			val startIndex = nodes.head.offset
			val endIndex = nodes.last.endOffset - 1 // last.endOffset points to character *after* the actual text
			return new String(root.text.toCharArray, startIndex, endIndex-startIndex);
		}
		return null
	}
}
