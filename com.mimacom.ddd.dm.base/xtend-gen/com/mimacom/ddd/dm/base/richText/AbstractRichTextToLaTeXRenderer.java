package com.mimacom.ddd.dm.base.richText;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextRenderer;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AbstractRichTextToLaTeXRenderer extends AbstractRichTextRenderer {
  @Extension
  private RichTextUtil _richTextUtil = new RichTextUtil();
  
  @Override
  protected String encode(final String plainText) {
    return this._richTextUtil.escapeLaTeX(plainText);
  }
  
  @Override
  protected CharSequence renderStylePlain(final DStyledTextSpan span) {
    return this.render(span);
  }
  
  @Override
  protected CharSequence renderStyleEmphasis(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\textit{" + _render);
    return (_plus + "}");
  }
  
  @Override
  protected CharSequence renderStyleStrong(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\textbf{" + _render);
    return (_plus + "}");
  }
  
  @Override
  protected CharSequence renderStyleMonospace(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\texttt{" + _render);
    return (_plus + "}");
  }
  
  @Override
  protected CharSequence renderStyleKeyword(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\textbf{\\textsf{" + _render);
    return (_plus + "}}");
  }
  
  @Override
  protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
    return (("\\textbf{\\texttt{" + parsedText) + "}}");
  }
  
  @Override
  protected CharSequence renderStyleUnderline(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\underline{" + _render);
    return (_plus + "}");
  }
  
  @Override
  protected CharSequence renderStyleStrikethrough(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\sout{" + _render);
    return (_plus + "}");
  }
  
  @Override
  protected CharSequence renderStyleSubscript(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\textsubscript{" + _render);
    return (_plus + "}");
  }
  
  @Override
  protected CharSequence renderStyleSuperscript(final DStyledTextSpan span) {
    CharSequence _render = this.render(span);
    String _plus = ("\\textsuperscript{" + _render);
    return (_plus + "}");
  }
}
