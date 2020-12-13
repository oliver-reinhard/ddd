package com.mimacom.ddd.dm.base.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.base.styledText.parser.NullErrorMessageAcceptor;
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class RichTextToPlantUmlNoteTextRenderer extends AbstractRichTextRenderer {
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Override
  protected String getSourceText(final DExpression expr) {
    return AbstractRichTextRenderer.getSourceTextFromXtextResource(expr);
  }
  
  @Override
  protected StyledTextParser createParser(final String source) {
    NullErrorMessageAcceptor _nullErrorMessageAcceptor = new NullErrorMessageAcceptor();
    return new StyledTextParser(source, _nullErrorMessageAcceptor);
  }
  
  @Override
  protected String encode(final String plainText) {
    return this._richTextUtil.escapePlantUml(plainText);
  }
  
  @Override
  protected CharSequence renderStylePlain(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleEmphasis(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<i>" + _render);
    return (_plus + "</i>");
  }
  
  @Override
  protected CharSequence renderStyleStrong(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<b>" + _render);
    return (_plus + "</b>");
  }
  
  @Override
  protected CharSequence renderStyleMonospace(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\"\"" + _render);
    return (_plus + "\"\"");
  }
  
  @Override
  protected CharSequence renderStyleKeyword(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<b><color:DimGrey>" + _render);
    return (_plus + "</color></b>");
  }
  
  @Override
  protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
    return (("<b>\"\"" + parsedText) + "\"\"</b>");
  }
  
  @Override
  protected CharSequence renderStyleUnderline(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<u>" + _render);
    return (_plus + "</u>");
  }
  
  @Override
  protected CharSequence renderStyleStrikethrough(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<s>" + _render);
    return (_plus + "</s>");
  }
  
  @Override
  protected CharSequence renderStyleSubscript(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<size:7>" + _render);
    return (_plus + "</size>");
  }
  
  @Override
  protected CharSequence renderStyleSuperscript(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<size:7>^" + _render);
    return (_plus + "^</size>");
  }
}
