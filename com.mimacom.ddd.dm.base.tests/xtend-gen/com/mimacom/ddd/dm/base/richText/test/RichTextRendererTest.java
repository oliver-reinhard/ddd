package com.mimacom.ddd.dm.base.richText.test;

import com.mimacom.ddd.dm.base.BaseFactory;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.base.impl.DExpressionImpl;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToHtmlRenderer;
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer;
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
    final DTextSegment t0 = this.BASE.createDTextSegment();
    t0.setValue("aaa **");
    rt.getSegments().add(t0);
    final RichTextRendererTest.TestExpression t1 = new RichTextRendererTest.TestExpression("bbb");
    rt.getSegments().add(t1);
    final DTextSegment t2 = this.BASE.createDTextSegment();
    t2.setValue(" __ccc__ ");
    rt.getSegments().add(t2);
    final RichTextRendererTest.TestExpression t3 = new RichTextRendererTest.TestExpression("ddd");
    rt.getSegments().add(t3);
    final DTextSegment t4 = this.BASE.createDTextSegment();
    t4.setValue("** eee");
    rt.getSegments().add(t4);
    final AbstractRichTextToPlainTextRenderer renderer = new AbstractRichTextToPlainTextRenderer() {
      @Override
      protected String getSourceText(final DExpression expr) {
        return ((RichTextRendererTest.TestExpression) expr).text;
      }
    };
    Assert.assertEquals("aaa bbb ccc ddd eee", renderer.render(rt));
  }
  
  @Test
  public void htmlTextRenderer() {
    final DRichText rt = this.BASE.createDRichText();
    final DTextSegment t0 = this.BASE.createDTextSegment();
    t0.setValue("aaa **");
    rt.getSegments().add(t0);
    final RichTextRendererTest.TestExpression t1 = new RichTextRendererTest.TestExpression("bbb");
    rt.getSegments().add(t1);
    final DTextSegment t2 = this.BASE.createDTextSegment();
    t2.setValue(" __ccc__ ");
    rt.getSegments().add(t2);
    final RichTextRendererTest.TestExpression t3 = new RichTextRendererTest.TestExpression("ddd");
    rt.getSegments().add(t3);
    final DTextSegment t4 = this.BASE.createDTextSegment();
    t4.setValue("** eee");
    rt.getSegments().add(t4);
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
}
