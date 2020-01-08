package com.mimacom.ddd.dm.base.richText;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.styledText.DTextAttribute;
import com.mimacom.ddd.dm.styledText.DTextStyle;
import com.mimacom.ddd.dm.styledText.StyledTextFactory;
import com.mimacom.ddd.dm.styledText.parser.ErrorMessageAcceptor;
import com.mimacom.ddd.dm.styledText.parser.StyledTextParser;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class AbstractRichTextRenderer {
  public static class RendererErrorMessageAcceptor implements ErrorMessageAcceptor {
    @Override
    public void acceptError(final String message, final int offset, final int length) throws IllegalStateException {
      throw new IllegalStateException(((("DRichText parse error: invalid format: \'" + message) + "\' at position ") + Integer.valueOf(offset)));
    }
  }
  
  private List<DExpression> expressions;
  
  private int currentExpressionIndex = (-1);
  
  public synchronized CharSequence render(final DRichText text) throws IllegalStateException {
    final String source = this.getSourceText(text);
    if ((source != null)) {
      this.expressions = IterableExtensions.<DExpression>toList(Iterables.<DExpression>filter(text.getSegments(), DExpression.class));
      this.currentExpressionIndex = (-1);
      AbstractRichTextRenderer.RendererErrorMessageAcceptor _rendererErrorMessageAcceptor = new AbstractRichTextRenderer.RendererErrorMessageAcceptor();
      final StyledTextParser parser = new StyledTextParser(source, _rendererErrorMessageAcceptor);
      final DStyledTextSpan span = parser.parse();
      if ((span != null)) {
        return this.render(span);
      }
    }
    return "";
  }
  
  /**
   * Returns the source text underlying the rich text {@code text}, i.e. {@code text} is a structured form of the underlying source text.
   */
  protected String getSourceText(final DRichText text) {
    final StringBuilder b = new StringBuilder();
    EList<IRichTextSegment> _segments = text.getSegments();
    for (final IRichTextSegment s : _segments) {
      if ((s instanceof DTextSegment)) {
        b.append(((DTextSegment)s).getValue());
      } else {
        if ((s instanceof DExpression)) {
          final String exprText = this.getSourceText(((DExpression)s));
          b.append("[");
          b.append(exprText);
          b.append("]");
        }
      }
    }
    return b.toString();
  }
  
  /**
   * Returns the source text underlying the given expression. If this text is not required to later render the expression, return an empty but non-null string.
   */
  protected abstract String getSourceText(final DExpression expr);
  
  protected CharSequence render(final DStyledTextSpan parent) {
    boolean _isLeaf = parent.isLeaf();
    if (_isLeaf) {
      return parent.getText();
    }
    final StringBuilder b = new StringBuilder();
    EList<DStyledTextSpan> _subspans = parent.getSubspans();
    for (final DStyledTextSpan subspan : _subspans) {
      b.append(this.renderStyledText(parent, subspan));
    }
    return b.toString();
  }
  
  protected CharSequence renderStyledText(final DStyledTextSpan parent, final DStyledTextSpan span) {
    final DStyledTextSpan format = this.diff(span, parent);
    CharSequence _switchResult = null;
    DTextStyle _style = format.getStyle();
    if (_style != null) {
      switch (_style) {
        case EMPHASIS:
          _switchResult = this.renderStyleEmphasis(span);
          break;
        case STRONG:
          _switchResult = this.renderStyleStrong(span);
          break;
        case KEYWORD:
          _switchResult = this.renderStyleKeyword(span);
          break;
        case MONOSPACE:
          _switchResult = this.renderStyleMonospace(span);
          break;
        case EXPRESSION:
          _switchResult = this.renderExpression(span);
          break;
        case PLAIN:
          CharSequence _xifexpression = null;
          boolean _isEmpty = format.getAttributes().isEmpty();
          if (_isEmpty) {
            _xifexpression = this.renderStylePlain(span);
          } else {
            CharSequence _switchResult_1 = null;
            DTextAttribute _head = IterableExtensions.<DTextAttribute>head(format.getAttributes());
            if (_head != null) {
              switch (_head) {
                case UNDERLINE:
                  _switchResult_1 = this.renderStyleUnderline(span);
                  break;
                case STRIKETHROUGH:
                  _switchResult_1 = this.renderStyleStrikethrough(span);
                  break;
                case SUBSCRIPT:
                  _switchResult_1 = this.renderStyleSubscript(span);
                  break;
                case SUPERSCRIPT:
                  _switchResult_1 = this.renderStyleSuperscript(span);
                  break;
                default:
                  break;
              }
            }
            _xifexpression = _switchResult_1;
          }
          _switchResult = _xifexpression;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  /**
   * Returns a new span that defines only a single style or attribute.
   */
  protected DStyledTextSpan diff(final DStyledTextSpan span, final DStyledTextSpan parent) {
    if ((parent == null)) {
      return span;
    }
    final DStyledTextSpan result = StyledTextFactory.eINSTANCE.createDStyledTextSpan();
    DTextStyle _xifexpression = null;
    DTextStyle _style = span.getStyle();
    DTextStyle _style_1 = parent.getStyle();
    boolean _equals = Objects.equal(_style, _style_1);
    if (_equals) {
      _xifexpression = DTextStyle.PLAIN;
    } else {
      _xifexpression = span.getStyle();
    }
    result.setStyle(_xifexpression);
    int _length = ((Object[])Conversions.unwrapArray(span.getAttributes(), Object.class)).length;
    int _length_1 = ((Object[])Conversions.unwrapArray(parent.getAttributes(), Object.class)).length;
    boolean _greaterThan = (_length > _length_1);
    if (_greaterThan) {
      result.getAttributes().add(IterableExtensions.<DTextAttribute>last(span.getAttributes()));
    }
    result.setText(span.getText());
    return result;
  }
  
  protected CharSequence renderExpression(final DStyledTextSpan span) {
    this.currentExpressionIndex++;
    int _length = ((Object[])Conversions.unwrapArray(this.expressions, Object.class)).length;
    boolean _lessThan = (this.currentExpressionIndex < _length);
    if (_lessThan) {
      final DExpression expr = this.expressions.get(this.currentExpressionIndex);
      return this.renderStyleExpression(expr, span.getText());
    }
    throw new IllegalStateException("Number of expressions in RichText and in parsed DStyledTextSpan do not match");
  }
  
  protected abstract CharSequence renderStylePlain(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleEmphasis(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleStrong(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleKeyword(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleExpression(final DExpression expr, final String parsedText);
  
  protected abstract CharSequence renderStyleMonospace(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleUnderline(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleStrikethrough(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleSubscript(final DStyledTextSpan span);
  
  protected abstract CharSequence renderStyleSuperscript(final DStyledTextSpan span);
}
