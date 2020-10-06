package com.mimacom.ddd.dm.base.richText;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan;

@SuppressWarnings("all")
public abstract class AbstractRichTextToPlainTextRenderer extends AbstractRichTextRenderer {
  @Override
  protected CharSequence renderStylePlain(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleEmphasis(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleStrong(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleKeyword(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
    return parsedText;
  }
  
  @Override
  protected CharSequence renderStyleMonospace(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleUnderline(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleStrikethrough(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleSubscript(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleSuperscript(final DStyledTextSpan span) {
    return this.render(span);
  }
}
