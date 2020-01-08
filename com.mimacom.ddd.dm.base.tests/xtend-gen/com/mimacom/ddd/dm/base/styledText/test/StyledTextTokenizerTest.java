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
    final StyledTextTokenizer t2 = new StyledTextTokenizer("aa[b]cc");
    this.assertTokenText(t2, "aa");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t2, StyledTextTokenizer.Token.EXPRESSION_END, "b");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t2, "cc");
    this.assertTokenType(t2, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa[bb]cc");
    this.assertTokenText(t3, "aa");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t3, StyledTextTokenizer.Token.EXPRESSION_END, "bb");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t3, "cc");
    this.assertTokenType(t3, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t4 = new StyledTextTokenizer("aa **bb [cc ** dd] ee**");
    this.assertTokenText(t4, "aa ");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t4, "bb ");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t4, StyledTextTokenizer.Token.EXPRESSION_END, "cc ** dd");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EXPRESSION_END);
    this.assertTokenText(t4, " ee");
    this.assertTokenType(t4, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenType(t4, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t5 = new StyledTextTokenizer("aa **bb [cc ** dd");
    this.assertTokenText(t5, "aa ");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t5, "bb ");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenSkip(t5, StyledTextTokenizer.Token.EXPRESSION_END, "cc ** dd");
    this.assertTokenType(t5, StyledTextTokenizer.Token.EOF);
    final StyledTextTokenizer t6 = new StyledTextTokenizer("aa **bb [");
    this.assertTokenText(t6, "aa ");
    this.assertTokenType(t6, StyledTextTokenizer.Token.EMPHASIS);
    this.assertTokenText(t6, "bb ");
    this.assertTokenType(t6, StyledTextTokenizer.Token.EXPRESSION_START);
    this.assertTokenType(t6, StyledTextTokenizer.Token.EOF);
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
