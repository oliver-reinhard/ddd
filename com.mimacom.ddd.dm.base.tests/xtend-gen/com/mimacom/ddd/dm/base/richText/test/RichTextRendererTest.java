package com.mimacom.ddd.dm.base.richText.test;

import com.mimacom.ddd.dm.base.base.BaseFactory;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DTextSegment;
import com.mimacom.ddd.dm.base.base.IRichTextSegment;
import com.mimacom.ddd.dm.base.base.impl.DExpressionImpl;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToHtmlRenderer;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer;
import org.eclipse.emf.common.util.EList;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class RichTextRendererTest {
  public static class TestExpression extends DExpressionImpl {
    private final String text;
    
    public TestExpression(final String text) {
      this.text = text;
    }
  }
  
  private final BaseFactory BASE = BaseFactory.eINSTANCE;
  
  @Test
  public void plainTextRenderer() {
    final DRichText rt = this.BASE.createDRichText();
    this.addTextSegment(rt, "aaa **");
    this.addExpressionSegment(rt, "bbb");
    this.addTextSegment(rt, " __ccc__ ");
    this.addExpressionSegment(rt, "ddd");
    this.addTextSegment(rt, "** eee");
    final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
      @Override
      protected String getSourceText(final DExpression expr) {
        return ((RichTextRendererTest.TestExpression) expr).text;
      }
      
      @Override
      protected String encode(final String plainText) {
        return plainText;
      }
    };
    Assert.assertEquals("aaa bbb ccc ddd eee", renderer.render(rt));
  }
  
  @Test
  public void htmlTextRenderer() {
    final DRichText rt = this.BASE.createDRichText();
    this.addTextSegment(rt, "aaa **");
    this.addExpressionSegment(rt, "bbb");
    this.addTextSegment(rt, " __ccc__ ");
    this.addExpressionSegment(rt, "ddd");
    this.addTextSegment(rt, "** eee");
    final AbstractRichTextToHtmlRenderer renderer = new AbstractRichTextToHtmlRenderer() {
      @Override
      protected String getSourceText(final DExpression expr) {
        return ((RichTextRendererTest.TestExpression) expr).text;
      }
      
      @Override
      protected CharSequence renderStyleExpression(final DExpression expr, final String parsedText) {
        return (("<xx>" + ((RichTextRendererTest.TestExpression) expr).text) + "</xx>");
      }
    };
    Assert.assertEquals("aaa <em><xx>bbb</xx> <u>ccc</u> <xx>ddd</xx></em> eee", renderer.render(rt));
  }
  
  protected DTextSegment addTextSegment(final DRichText t, final String text) {
    final DTextSegment s = this.BASE.createDTextSegment();
    s.setValue(text);
    t.getSegments().add(s);
    return s;
  }
  
  protected DRichText addExpressionSegment(final DRichText t, final String expr) {
    EList<IRichTextSegment> _segments = t.getSegments();
    RichTextRendererTest.TestExpression _testExpression = new RichTextRendererTest.TestExpression(expr);
    _segments.add(_testExpression);
    return t;
  }
}
