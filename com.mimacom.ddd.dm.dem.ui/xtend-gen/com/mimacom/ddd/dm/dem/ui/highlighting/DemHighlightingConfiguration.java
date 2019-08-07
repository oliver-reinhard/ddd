package com.mimacom.ddd.dm.dem.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class DemHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String NAME_ID = "Name";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(DemHighlightingConfiguration.NAME_ID, "Names", this.nameTextStyle());
  }
  
  public TextStyle nameTextStyle() {
    final TextStyle textStyle = new TextStyle();
    textStyle.setStyle(SWT.BOLD);
    RGB _rGB = new RGB(3, 119, 145);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
