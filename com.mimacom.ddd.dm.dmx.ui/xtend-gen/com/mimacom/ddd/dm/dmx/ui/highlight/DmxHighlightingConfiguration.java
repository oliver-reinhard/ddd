package com.mimacom.ddd.dm.dmx.ui.highlight;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class DmxHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String NAME_ID = "Name";
  
  public static final String RICH_TEXT_ID = "RichText";
  
  @Override
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(DmxHighlightingConfiguration.NAME_ID, "Names", this.nameTextStyle());
    acceptor.acceptDefaultHighlighting(DmxHighlightingConfiguration.RICH_TEXT_ID, "Rich Text", this.richtTextTextStyle());
  }
  
  public TextStyle nameTextStyle() {
    final TextStyle textStyle = new TextStyle();
    textStyle.setStyle(SWT.BOLD);
    RGB _rGB = new RGB(29, 32, 136);
    textStyle.setColor(_rGB);
    return textStyle;
  }
  
  public TextStyle richtTextTextStyle() {
    final TextStyle textStyle = new TextStyle();
    textStyle.setStyle(SWT.ITALIC);
    RGB _rGB = new RGB(52, 100, 100);
    textStyle.setColor(_rGB);
    return textStyle;
  }
}
