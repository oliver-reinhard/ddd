package com.mimacom.ddd.dm.base.richText;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;

@SuppressWarnings("all")
public abstract class AbstractRichTextToHtmlRenderer extends AbstractRichTextRenderer {
  @Override
  protected CharSequence renderStylePlain(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleEmphasis(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<em>" + _render);
    return (_plus + "</em>");
  }
  
  @Override
  protected CharSequence renderStyleStrong(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<strong>" + _render);
    return (_plus + "</strong>");
  }
  
  @Override
  protected CharSequence renderStyleMonospace(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<strong>" + _render);
    return (_plus + "</strong>");
  }
  
  @Override
  protected CharSequence renderStyleKeyword(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<b>" + _render);
    return (_plus + "</b>");
  }
  
  @Override
  protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
    return (("<b><code>" + parsedText) + "</code></b>");
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
    String _plus = ("<sup>" + _render);
    return (_plus + "</sup>");
  }
  
  @Override
  protected CharSequence renderStyleSuperscript(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("<sub>" + _render);
    return (_plus + "</sub>");
  }
}