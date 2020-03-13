package com.mimacom.ddd.pub.pub.ui.autoedit

import org.eclipse.jface.text.IDocument
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider

class PubAutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {
	override void configureStringLiteral(AbstractEditStrategyProvider.IEditStrategyAcceptor acceptor) {
		super.configureStringLiteral(acceptor);
		acceptor.accept(singleLineTerminals.newInstance("«", "»"), IDocument.DEFAULT_CONTENT_TYPE);
	}
}