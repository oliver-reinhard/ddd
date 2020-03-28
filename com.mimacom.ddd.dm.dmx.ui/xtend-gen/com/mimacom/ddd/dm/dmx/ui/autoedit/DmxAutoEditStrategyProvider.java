package com.mimacom.ddd.dm.dmx.ui.autoedit;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;

@SuppressWarnings("all")
public class DmxAutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {
  @Override
  public void configureStringLiteral(final AbstractEditStrategyProvider.IEditStrategyAcceptor acceptor) {
    super.configureStringLiteral(acceptor);
    acceptor.accept(this.singleLineTerminals.newInstance("«", "»"), IDocument.DEFAULT_CONTENT_TYPE);
  }
}
