package com.mimacom.ddd.dm.base.styledText.test;

import com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class StyledTextTokenizerTest {
  @Test
  public void testBasics() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, "bb");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, " cc");
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testMultiple() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc ++dd++ ee");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, "bb");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, " cc ");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRONG);
    this.assertTokenText(t, "dd");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRONG);
    this.assertTokenText(t, " ee");
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testAtStartEnd() {
    final StyledTextTokenizer t = new StyledTextTokenizer("**bb** cc ++dd++");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, "bb");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, " cc ");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRONG);
    this.assertTokenText(t, "dd");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRONG);
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testNestedFormats() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc-- dd**");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, "bb ");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRIKETHROUGH);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRIKETHROUGH);
    this.assertTokenText(t, " dd");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testOverlappingFormats() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc** dd--");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, "bb ");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRIKETHROUGH);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, " dd");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRIKETHROUGH);
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testSkipTextWithinExpression() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa[]cc");
    this.assertTokenText(t, "aa");
    this.assertTokenType(t, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t, StyledTextTokenizer.Token.EXPRESSION_END, "");
    this.assertTokenType(t, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("[]");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t2, StyledTextTokenizer.Token.EXPRESSION_END, "");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenType(t2, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa[b]");
    this.assertTokenText(t3, "aa");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t3, StyledTextTokenizer.Token.EXPRESSION_END, "b");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenType(t3, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t4 = new StyledTextTokenizer("[b]cc");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t4, StyledTextTokenizer.Token.EXPRESSION_END, "b");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t4, "cc");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t5 = new StyledTextTokenizer("aa[b]cc");
    this.assertTokenText(t5, "aa");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t5, StyledTextTokenizer.Token.EXPRESSION_END, "b");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t5, "cc");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t6 = new StyledTextTokenizer("aa[bb]cc");
    this.assertTokenText(t6, "aa");
    this.assertTokenType(t6, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t6, StyledTextTokenizer.Token.EXPRESSION_END, "bb");
    this.assertTokenType(t6, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t6, "cc");
    this.assertTokenType(t6, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t7 = new StyledTextTokenizer("aa **bb [cc ** dd] ee**");
    this.assertTokenText(t7, "aa ");
    this.assertTokenType(t7, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t7, "bb ");
    this.assertTokenType(t7, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t7, StyledTextTokenizer.Token.EXPRESSION_END, "cc ** dd");
    this.assertTokenType(t7, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t7, " ee");
    this.assertTokenType(t7, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenType(t7, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t8 = new StyledTextTokenizer("aa **bb [cc ** dd");
    this.assertTokenText(t8, "aa ");
    this.assertTokenType(t8, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t8, "bb ");
    this.assertTokenType(t8, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t8, StyledTextTokenizer.Token.EXPRESSION_END, "cc ** dd");
    this.assertTokenType(t8, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t9 = new StyledTextTokenizer("aa **bb [");
    this.assertTokenText(t9, "aa ");
    this.assertTokenType(t9, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t9, "bb ");
    this.assertTokenType(t9, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenType(t9, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testSkipTextWithinStaticReference() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa[[]]cc");
    this.assertTokenText(t, "aa");
    this.assertTokenType(t, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "");
    this.assertTokenType(t, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("[[]]");
    this.assertTokenType(t2, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t2, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "");
    this.assertTokenType(t2, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenType(t2, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa[[b]]");
    this.assertTokenText(t3, "aa");
    this.assertTokenType(t3, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t3, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "b");
    this.assertTokenType(t3, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenType(t3, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t4 = new StyledTextTokenizer("[[b]]cc");
    this.assertTokenType(t4, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t4, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "b");
    this.assertTokenType(t4, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenText(t4, "cc");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t5 = new StyledTextTokenizer("aa[[b]]cc");
    this.assertTokenText(t5, "aa");
    this.assertTokenType(t5, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t5, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "b");
    this.assertTokenType(t5, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenText(t5, "cc");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t6 = new StyledTextTokenizer("aa[[bb]]cc");
    this.assertTokenText(t6, "aa");
    this.assertTokenType(t6, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t6, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "bb");
    this.assertTokenType(t6, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenText(t6, "cc");
    this.assertTokenType(t6, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t7 = new StyledTextTokenizer("aa **bb [[cc ** dd]] ee**");
    this.assertTokenText(t7, "aa ");
    this.assertTokenType(t7, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t7, "bb ");
    this.assertTokenType(t7, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t7, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "cc ** dd");
    this.assertTokenType(t7, StyledTextTokenizer.Token.STATIC_REFERENCE_END);
    this.assertTokenText(t7, " ee");
    this.assertTokenType(t7, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenType(t7, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t8 = new StyledTextTokenizer("aa **bb [[cc ** dd");
    this.assertTokenText(t8, "aa ");
    this.assertTokenType(t8, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t8, "bb ");
    this.assertTokenType(t8, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenSkip(t8, StyledTextTokenizer.Token.STATIC_REFERENCE_END, "cc ** dd");
    this.assertTokenType(t8, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t9 = new StyledTextTokenizer("aa **bb [[");
    this.assertTokenText(t9, "aa ");
    this.assertTokenType(t9, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t9, "bb ");
    this.assertTokenType(t9, StyledTextTokenizer.Token.STATIC_REFERENCE_START);
    this.assertTokenType(t9, StyledTextTokenizer.Token.EOF);
  }
  
  @Test
  public void testSkipTextWithinStrong() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb ++cc ** dd++ ee**");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t, "bb ");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRONG);
    this.assertTokenSkip(t, StyledTextTokenizer.Token.STRONG, "cc ** dd");
    this.assertTokenType(t, StyledTextTokenizer.Token.STRONG);
    this.assertTokenText(t, " ee");
    this.assertTokenType(t, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenType(t, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("aa **bb ++cc ** dd");
    this.assertTokenText(t2, "aa ");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t2, "bb ");
    this.assertTokenType(t2, StyledTextTokenizer.Token.STRONG);
    this.assertTokenSkip(t2, StyledTextTokenizer.Token.STRONG, "cc ** dd");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa **bb ++cc ** dd+");
    this.assertTokenText(t3, "aa ");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t3, "bb ");
    this.assertTokenType(t3, StyledTextTokenizer.Token.STRONG);
    this.assertTokenSkip(t3, StyledTextTokenizer.Token.STRONG, "cc ** dd+");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EOF);
  }
  
  private void assertTokenType(final StyledTextTokenizer t, final StyledTextTokenizer.Token expected) {
    Assert.assertEquals(expected, t.readNext());
    Assert.assertEquals(null, t.getText());
  }
  
  private void assertTokenText(final StyledTextTokenizer t, final String expected) {
    Assert.assertEquals(StyledTextTokenizer.Token.TEXT, t.readNext());
    Assert.assertEquals(expected, t.getText());
  }
  
  private void assertTokenSkip(final StyledTextTokenizer t, final StyledTextTokenizer.Token next, final String expected) {
    Assert.assertEquals(StyledTextTokenizer.Token.TEXT, t.skipToNext(next));
    Assert.assertEquals(expected, t.getText());
  }
}
