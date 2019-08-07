package com.mimacom.ddd.dm.dem.ui.highlighting

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class DemHighlightingConfiguration extends DefaultHighlightingConfiguration {
	
	public static val NAME_ID = "Name";

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor)
		acceptor.acceptDefaultHighlighting(NAME_ID, "Names", nameTextStyle());
	}

	def TextStyle nameTextStyle() {
		val textStyle = new TextStyle();
		textStyle.style = SWT.BOLD;
		textStyle.color = new RGB(3, 119, 145)
		return textStyle;
	}
}
