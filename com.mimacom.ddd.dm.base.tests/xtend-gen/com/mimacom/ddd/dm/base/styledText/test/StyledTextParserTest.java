package com.mimacom.ddd.dm.base.styledText.test;

import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan;
import com.mimacom.ddd.dm.base.styledText.DTextAttribute;
import com.mimacom.ddd.dm.base.styledText.DTextStyle;
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser;
import com.mimacom.ddd.dm.base.styledText.parser.SystemErrorErrorMessageAcceptor;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class StyledTextParserTest {
  public static class TestErrorMessageAcceptor extends SystemErrorErrorMessageAcceptor {
    private int count = 0;
    
    @Override
    public void acceptError(final String message, final int offset, final int length) {
      this.count = (this.count + 1);
      if (StyledTextParserTest.debug) {
        super.acceptError(message, offset, length);
      }
    }
  }
  
  private static boolean debug = false;
  
  @Test
  public void testSimple() {
    final String text = "aaaa";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 3, 1);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 3, 0);
  }
  
  @Test
  public void testBasicFormat() {
    final String text = "aa **bb** cc";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 11, 3);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    final DStyledTextSpan s1 = root.getSubspans().get(1);
    this.assertSpanBaseProperties(s1, DTextStyle.EMPHASIS, 3, 8, 1);
    this.assertSpanBaseProperties(s1.getSubspans().get(0), DTextStyle.EMPHASIS, 5, 6, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(2), DTextStyle.PLAIN, 9, 11, 0);
  }
  
  @Test
  public void testMultipleFormats() {
    final String text = "aa **bb** cc ++dd++ ee";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 21, 5);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    final DStyledTextSpan s1 = root.getSubspans().get(1);
    this.assertSpanBaseProperties(s1, DTextStyle.EMPHASIS, 3, 8, 1);
    this.assertSpanBaseProperties(s1.getSubspans().get(0), DTextStyle.EMPHASIS, 5, 6, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(2), DTextStyle.PLAIN, 9, 12, 0);
    final DStyledTextSpan s3 = root.getSubspans().get(3);
    this.assertSpanBaseProperties(s3, DTextStyle.STRONG, 13, 18, 1);
    this.assertSpanBaseProperties(s3.getSubspans().get(0), DTextStyle.STRONG, 15, 16, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(4), DTextStyle.PLAIN, 19, 21, 0);
  }
  
  @Test
  public void testAtStartEnd() {
    final String text = "**bb** cc ++dd++";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 15, 3);
    final DStyledTextSpan s0 = root.getSubspans().get(0);
    this.assertSpanBaseProperties(s0, DTextStyle.EMPHASIS, 0, 5, 1);
    this.assertSpanBaseProperties(s0.getSubspans().get(0), DTextStyle.EMPHASIS, 2, 3, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(1), DTextStyle.PLAIN, 6, 9, 0);
    final DStyledTextSpan s2 = root.getSubspans().get(2);
    this.assertSpanBaseProperties(s2, DTextStyle.STRONG, 10, 15, 1);
    this.assertSpanBaseProperties(s2.getSubspans().get(0), DTextStyle.STRONG, 12, 13, 0);
  }
  
  @Test
  public void testNestedFormats1() {
    final String text = "aa **bb --cc-- dd**";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 18, 2);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    final DStyledTextSpan s1 = root.getSubspans().get(1);
    this.assertSpanBaseProperties(s1, DTextStyle.EMPHASIS, 3, 18, 3);
    this.assertSpanBaseProperties(s1.getSubspans().get(0), DTextStyle.EMPHASIS, 5, 7, 0);
    final DStyledTextSpan s11 = s1.getSubspans().get(1);
    this.assertSpanBaseProperties(s11, DTextStyle.EMPHASIS, 8, 13, 1);
    this.assertAttributes(s11, new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
    this.assertSpanBaseProperties(s11.getSubspans().get(0), DTextStyle.EMPHASIS, 10, 11, 0);
    this.assertAttributes(s11.getSubspans().get(0), new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
    this.assertSpanBaseProperties(s1.getSubspans().get(2), DTextStyle.EMPHASIS, 14, 16, 0);
  }
  
  @Test
  public void testNestedFormats2() {
    final String text = "aa --bb **cc** dd--";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 18, 2);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    final DStyledTextSpan s1 = root.getSubspans().get(1);
    this.assertSpanBaseProperties(s1, DTextStyle.PLAIN, 3, 18, 3);
    this.assertAttributes(s1, new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
    final DStyledTextSpan s10 = s1.getSubspans().get(0);
    this.assertSpanBaseProperties(s10, DTextStyle.PLAIN, 5, 7, 0);
    this.assertAttributes(s10, new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
    final DStyledTextSpan s11 = s1.getSubspans().get(1);
    this.assertSpanBaseProperties(s11, DTextStyle.EMPHASIS, 8, 13, 1);
    this.assertAttributes(s11, new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
    this.assertSpanBaseProperties(s11.getSubspans().get(0), DTextStyle.EMPHASIS, 10, 11, 0);
    this.assertAttributes(s11.getSubspans().get(0), new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
    final DStyledTextSpan s12 = s1.getSubspans().get(2);
    this.assertSpanBaseProperties(s12, DTextStyle.PLAIN, 14, 16, 0);
    this.assertAttributes(s12, new DTextAttribute[] { DTextAttribute.STRIKETHROUGH });
  }
  
  @Test
  public void testConflictingStylesNok() {
    Assert.assertFalse(this.parse("aa **bb ++cc++ dd** ee"));
  }
  
  @Test
  public void testOverlappingFormatsNok() {
    Assert.assertFalse(this.parse("aa **bb --cc** dd-- ee"));
  }
  
  @Test
  public void testUnclosedStylesNok() {
    Assert.assertFalse(this.parse("aa **bb --cc"));
  }
  
  @Test
  public void testExpressionEmpty() {
    final String text = "aa [] cc";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 7, 3);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(1), DTextStyle.EXPRESSION, 3, 4, 0);
    Assert.assertEquals("", root.getSubspans().get(1).getText());
    this.assertSpanBaseProperties(root.getSubspans().get(2), DTextStyle.PLAIN, 5, 7, 0);
    Assert.assertTrue(this.parse("[]"));
    Assert.assertTrue(this.parse("[] cc"));
    Assert.assertTrue(this.parse("aa []"));
  }
  
  @Test
  public void testExpressionNotEmpty() {
    final String text = "aa [b] cc";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 8, 3);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(1), DTextStyle.EXPRESSION, 3, 5, 0);
    Assert.assertEquals("b", root.getSubspans().get(1).getText());
    this.assertSpanBaseProperties(root.getSubspans().get(2), DTextStyle.PLAIN, 6, 8, 0);
    Assert.assertTrue(this.parse("aa [bb] cc"));
    Assert.assertTrue(this.parse("aa **[bb]** cc"));
  }
  
  @Test
  public void testStaticReferenceEmpty() {
    final String text = "aa [[]] cc";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 9, 3);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(1), DTextStyle.EXPRESSION, 3, 6, 0);
    Assert.assertEquals("", root.getSubspans().get(1).getText());
    this.assertSpanBaseProperties(root.getSubspans().get(2), DTextStyle.PLAIN, 7, 9, 0);
    Assert.assertTrue(this.parse("[[]]"));
    Assert.assertTrue(this.parse("[[]] cc"));
    Assert.assertTrue(this.parse("aa [[]]"));
  }
  
  @Test
  public void testStaticReferenceNotEmpty() {
    final String text = "aa [[b]] cc";
    Assert.assertTrue(this.parse(text));
    final StyledTextParser parser = new StyledTextParser(text);
    DStyledTextSpan root = parser.parse();
    this.assertSpanBaseProperties(root, DTextStyle.PLAIN, 0, 10, 3);
    this.assertSpanBaseProperties(root.getSubspans().get(0), DTextStyle.PLAIN, 0, 2, 0);
    this.assertSpanBaseProperties(root.getSubspans().get(1), DTextStyle.EXPRESSION, 3, 7, 0);
    Assert.assertEquals("b", root.getSubspans().get(1).getText());
    this.assertSpanBaseProperties(root.getSubspans().get(2), DTextStyle.PLAIN, 8, 10, 0);
    Assert.assertTrue(this.parse("aa [[bb]] cc"));
    Assert.assertTrue(this.parse("aa **[[bb]]** cc"));
  }
  
  @Test
  public void testExpressionOpenNok() {
    Assert.assertFalse(this.parse("aa ["));
    Assert.assertFalse(this.parse("aa [bb"));
    Assert.assertFalse(this.parse("aa [bb] cc ["));
    Assert.assertFalse(this.parse("aa [bb] cc [dd"));
    Assert.assertFalse(this.parse("aa [bb cc [dd] ee"));
  }
  
  @Test
  public void testExpressionNotOpenNok() {
    Assert.assertFalse(this.parse("]"));
    Assert.assertFalse(this.parse("aa ]"));
    Assert.assertFalse(this.parse("aa ]bb"));
    Assert.assertFalse(this.parse("aa [bb] cc ]"));
    Assert.assertFalse(this.parse("aa [bb] cc ]dd"));
    Assert.assertFalse(this.parse("aa ]bb cc [dd] ee"));
  }
  
  @Test
  public void testExpressionHangsNok() {
    Assert.assertFalse(this.parse("abc [55] dd]"));
  }
  
  boolean parse(final String text) {
    final StyledTextParserTest.TestErrorMessageAcceptor acceptor = new StyledTextParserTest.TestErrorMessageAcceptor();
    final StyledTextParser parser = new StyledTextParser(text, acceptor);
    if (StyledTextParserTest.debug) {
      DStyledTextSpan root = parser.parse();
      System.out.println(parser.toString(root));
    } else {
      parser.parse();
    }
    return (acceptor.count == 0);
  }
  
  public void assertSpanBaseProperties(final DStyledTextSpan s, final DTextStyle style, final int start, final int end, final int subspans) {
    Assert.assertEquals(style, s.getStyle());
    Assert.assertEquals(start, s.getStartPos());
    Assert.assertEquals(end, s.getEndPos());
    Assert.assertEquals(subspans, s.getSubspans().size());
  }
  
  public void assertAttributes(final DStyledTextSpan s, final DTextAttribute[] attr) {
    Assert.assertEquals(attr.length, s.getAttributes().size());
    for (final DTextAttribute a : attr) {
      Assert.assertTrue(s.getAttributes().contains(a));
    }
  }
}
