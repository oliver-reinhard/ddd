package com.mimacom.ddd.dm.dem.ui.highlighting

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class DemHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static val NAME_ID = "Name";
	public static val RICH_TEXT_ID = "RichText";

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(NAME_ID, "Names", nameTextStyle());
		acceptor.acceptDefaultHighlighting(RICH_TEXT_ID, "Rich Text", richtTextTextStyle());
	}

	def TextStyle nameTextStyle() {
		val textStyle = new TextStyle();
		textStyle.style = SWT.BOLD;
		textStyle.color = new RGB(29, 32, 136)
		return textStyle;
	}

	def TextStyle richtTextTextStyle() {
		val textStyle = new TextStyle();
		textStyle.style = SWT.ITALIC;
		textStyle.color = new RGB(52, 100, 100)
		return textStyle;
	}
}
