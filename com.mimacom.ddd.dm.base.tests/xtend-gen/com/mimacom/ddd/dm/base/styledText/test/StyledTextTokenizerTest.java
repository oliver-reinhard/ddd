package com.mimacom.ddd.dm.base.styledText.test;

import com.mimacom.ddd.dm.base.styledText.parser.IncompleteEscapeSequenceException;
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextTokenizer;
import com.mimacom.ddd.dm.base.styledText.parser.Symbol;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class StyledTextTokenizerTest {
  @Test
  public void testNoStyleElements() {
    final String text = "aa bb cc ";
    final StyledTextTokenizer t = new StyledTextTokenizer(text);
    this.assertTokenText(t, text);
    this.assertTokenType(t, Symbol.EOF);
    this.assertTokenType(t, Symbol.EOF);
  }
  
  @Test
  public void testSingleEscape() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa\\cc");
    this.assertTokenText(t, "aacc");
    this.assertTokenType(t, Symbol.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("\\aa");
    this.assertTokenText(t2, "aa");
    this.assertTokenType(t2, Symbol.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa\\");
    try {
      this.assertTokenText(t3, "aa");
      Assert.fail("IncompleteEscapeSequenceException expected");
    } catch (final Throwable _t) {
      if (_t instanceof IncompleteEscapeSequenceException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Test
  public void testSingleBackslash() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa\\\\cc");
    this.assertTokenText(t, "aa\\cc");
    this.assertTokenType(t, Symbol.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("\\\\aa");
    this.assertTokenText(t2, "\\aa");
    this.assertTokenType(t2, Symbol.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa\\\\");
    this.assertTokenText(t3, "aa\\");
    this.assertTokenType(t3, Symbol.EOF);
  }
  
  @Test
  public void testSingleStyleElement() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, "bb");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, " cc");
    this.assertTokenType(t, Symbol.EOF);
  }
  
  @Test
  public void testMultipleStyleElement() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc ++dd++ ee");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, "bb");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, " cc ");
    this.assertTokenType(t, Symbol.STRONG);
    this.assertTokenText(t, "dd");
    this.assertTokenType(t, Symbol.STRONG);
    this.assertTokenText(t, " ee");
    this.assertTokenType(t, Symbol.EOF);
  }
  
  @Test
  public void testAtStartAndEnd() {
    final StyledTextTokenizer t = new StyledTextTokenizer("**bb** cc ++dd++");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, "bb");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, " cc ");
    this.assertTokenType(t, Symbol.STRONG);
    this.assertTokenText(t, "dd");
    this.assertTokenType(t, Symbol.STRONG);
    this.assertTokenType(t, Symbol.EOF);
  }
  
  @Test
  public void testNestedFormats() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc-- dd**");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, "bb ");
    this.assertTokenType(t, Symbol.STRIKETHROUGH);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, Symbol.STRIKETHROUGH);
    this.assertTokenText(t, " dd");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenType(t, Symbol.EOF);
  }
  
  @Test
  public void testOverlappingFormats() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc** dd--");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, "bb ");
    this.assertTokenType(t, Symbol.STRIKETHROUGH);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, " dd");
    this.assertTokenType(t, Symbol.STRIKETHROUGH);
    this.assertTokenType(t, Symbol.EOF);
  }
  
  @Test
  public void testSkipTextWithinExpression() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa[]cc");
    this.assertTokenText(t, "aa");
    this.assertTokenType(t, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t, Symbol.EXPRESSION_END, "");
    this.assertTokenType(t, Symbol.EXPRESSION_END);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, Symbol.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("[]");
    this.assertTokenType(t2, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t2, Symbol.EXPRESSION_END, "");
    this.assertTokenType(t2, Symbol.EXPRESSION_END);
    this.assertTokenType(t2, Symbol.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa[b]");
    this.assertTokenText(t3, "aa");
    this.assertTokenType(t3, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t3, Symbol.EXPRESSION_END, "b");
    this.assertTokenType(t3, Symbol.EXPRESSION_END);
    this.assertTokenType(t3, Symbol.EOF);
    final StyledTextTokenizer t4 = new StyledTextTokenizer("[b]cc");
    this.assertTokenType(t4, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t4, Symbol.EXPRESSION_END, "b");
    this.assertTokenType(t4, Symbol.EXPRESSION_END);
    this.assertTokenText(t4, "cc");
    this.assertTokenType(t4, Symbol.EOF);
    final StyledTextTokenizer t5 = new StyledTextTokenizer("aa[b]cc");
    this.assertTokenText(t5, "aa");
    this.assertTokenType(t5, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t5, Symbol.EXPRESSION_END, "b");
    this.assertTokenType(t5, Symbol.EXPRESSION_END);
    this.assertTokenText(t5, "cc");
    this.assertTokenType(t5, Symbol.EOF);
    final StyledTextTokenizer t6 = new StyledTextTokenizer("aa[bb]cc");
    this.assertTokenText(t6, "aa");
    this.assertTokenType(t6, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t6, Symbol.EXPRESSION_END, "bb");
    this.assertTokenType(t6, Symbol.EXPRESSION_END);
    this.assertTokenText(t6, "cc");
    this.assertTokenType(t6, Symbol.EOF);
    final StyledTextTokenizer t7 = new StyledTextTokenizer("aa **bb [cc ** dd] ee**");
    this.assertTokenText(t7, "aa ");
    this.assertTokenType(t7, Symbol.EMPHASIS);
    this.assertTokenText(t7, "bb ");
    this.assertTokenType(t7, Symbol.EXPRESSION_START);
    this.assertTokenSkipText(t7, Symbol.EXPRESSION_END, "cc ** dd");
    this.assertTokenType(t7, Symbol.EXPRESSION_END);
    this.assertTokenText(t7, " ee");
    this.assertTokenType(t7, Symbol.EMPHASIS);
    this.assertTokenType(t7, Symbol.EOF);
    final StyledTextTokenizer t8 = new StyledTextTokenizer("aa **bb [cc ** dd");
    this.assertTokenText(t8, "aa ");
    this.assertTokenType(t8, Symbol.EMPHASIS);
    this.assertTokenText(t8, "bb ");
    this.assertTokenType(t8, Symbol.EXPRESSION_START);
    this.assertTokenSkipEOF(t8, Symbol.EXPRESSION_END);
    this.assertTokenType(t8, Symbol.EOF);
    final StyledTextTokenizer t9 = new StyledTextTokenizer("aa **bb [");
    this.assertTokenText(t9, "aa ");
    this.assertTokenType(t9, Symbol.EMPHASIS);
    this.assertTokenText(t9, "bb ");
    this.assertTokenType(t9, Symbol.EXPRESSION_START);
    this.assertTokenType(t9, Symbol.EOF);
  }
  
  @Test
  public void testSkipTextWithinStaticReference() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa[[]]cc");
    this.assertTokenText(t, "aa");
    this.assertTokenType(t, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t, Symbol.STATIC_REFERENCE_END, "");
    this.assertTokenType(t, Symbol.STATIC_REFERENCE_END);
    this.assertTokenText(t, "cc");
    this.assertTokenType(t, Symbol.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("[[]]");
    this.assertTokenType(t2, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t2, Symbol.STATIC_REFERENCE_END, "");
    this.assertTokenType(t2, Symbol.STATIC_REFERENCE_END);
    this.assertTokenType(t2, Symbol.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa[[b]]");
    this.assertTokenText(t3, "aa");
    this.assertTokenType(t3, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t3, Symbol.STATIC_REFERENCE_END, "b");
    this.assertTokenType(t3, Symbol.STATIC_REFERENCE_END);
    this.assertTokenType(t3, Symbol.EOF);
    final StyledTextTokenizer t4 = new StyledTextTokenizer("[[b]]cc");
    this.assertTokenType(t4, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t4, Symbol.STATIC_REFERENCE_END, "b");
    this.assertTokenType(t4, Symbol.STATIC_REFERENCE_END);
    this.assertTokenText(t4, "cc");
    this.assertTokenType(t4, Symbol.EOF);
    final StyledTextTokenizer t5 = new StyledTextTokenizer("aa[[b]]cc");
    this.assertTokenText(t5, "aa");
    this.assertTokenType(t5, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t5, Symbol.STATIC_REFERENCE_END, "b");
    this.assertTokenType(t5, Symbol.STATIC_REFERENCE_END);
    this.assertTokenText(t5, "cc");
    this.assertTokenType(t5, Symbol.EOF);
    final StyledTextTokenizer t6 = new StyledTextTokenizer("aa[[bb]]cc");
    this.assertTokenText(t6, "aa");
    this.assertTokenType(t6, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t6, Symbol.STATIC_REFERENCE_END, "bb");
    this.assertTokenType(t6, Symbol.STATIC_REFERENCE_END);
    this.assertTokenText(t6, "cc");
    this.assertTokenType(t6, Symbol.EOF);
    final StyledTextTokenizer t7 = new StyledTextTokenizer("aa **bb [[cc ** dd]] ee**");
    this.assertTokenText(t7, "aa ");
    this.assertTokenType(t7, Symbol.EMPHASIS);
    this.assertTokenText(t7, "bb ");
    this.assertTokenType(t7, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipText(t7, Symbol.STATIC_REFERENCE_END, "cc ** dd");
    this.assertTokenType(t7, Symbol.STATIC_REFERENCE_END);
    this.assertTokenText(t7, " ee");
    this.assertTokenType(t7, Symbol.EMPHASIS);
    this.assertTokenType(t7, Symbol.EOF);
    final StyledTextTokenizer t8 = new StyledTextTokenizer("aa **bb [[cc ** dd");
    this.assertTokenText(t8, "aa ");
    this.assertTokenType(t8, Symbol.EMPHASIS);
    this.assertTokenText(t8, "bb ");
    this.assertTokenType(t8, Symbol.STATIC_REFERENCE_START);
    this.assertTokenSkipEOF(t8, Symbol.STATIC_REFERENCE_END);
    this.assertTokenType(t8, Symbol.EOF);
    final StyledTextTokenizer t9 = new StyledTextTokenizer("aa **bb [[");
    this.assertTokenText(t9, "aa ");
    this.assertTokenType(t9, Symbol.EMPHASIS);
    this.assertTokenText(t9, "bb ");
    this.assertTokenType(t9, Symbol.STATIC_REFERENCE_START);
    this.assertTokenType(t9, Symbol.EOF);
  }
  
  @Test
  public void testSkipTextWithinStrong() {
    final StyledTextTokenizer t = new StyledTextTokenizer("aa **bb ++cc ** dd++ ee**");
    this.assertTokenText(t, "aa ");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenText(t, "bb ");
    this.assertTokenType(t, Symbol.STRONG);
    this.assertTokenSkipText(t, Symbol.STRONG, "cc ** dd");
    this.assertTokenType(t, Symbol.STRONG);
    this.assertTokenText(t, " ee");
    this.assertTokenType(t, Symbol.EMPHASIS);
    this.assertTokenType(t, Symbol.EOF);
    final StyledTextTokenizer t2 = new StyledTextTokenizer("aa **bb ++cc ** dd");
    this.assertTokenText(t2, "aa ");
    this.assertTokenType(t2, Symbol.EMPHASIS);
    this.assertTokenText(t2, "bb ");
    this.assertTokenType(t2, Symbol.STRONG);
    this.assertTokenSkipEOF(t2, Symbol.STRONG);
    this.assertTokenType(t2, Symbol.EOF);
    final StyledTextTokenizer t3 = new StyledTextTokenizer("aa **bb ++cc ** dd+");
    this.assertTokenText(t3, "aa ");
    this.assertTokenType(t3, Symbol.EMPHASIS);
    this.assertTokenText(t3, "bb ");
    this.assertTokenType(t3, Symbol.STRONG);
    this.assertTokenSkipEOF(t3, Symbol.STRONG);
    this.assertTokenType(t3, Symbol.EOF);
  }
  
  private void assertTokenType(final StyledTextTokenizer t, final Symbol expected) {
    try {
      Assert.assertEquals(expected, t.readNext());
      Assert.assertEquals(null, t.getText());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertTokenText(final StyledTextTokenizer t, final String expected) {
    try {
      Assert.assertEquals(Symbol.TEXT, t.readNext());
      Assert.assertEquals(expected, t.getText());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertTokenSkipText(final StyledTextTokenizer t, final Symbol next, final String expected) {
    try {
      Assert.assertEquals(Symbol.TEXT, t.skipToNext(next));
      Assert.assertEquals(expected, t.getText());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertTokenSkipEOF(final StyledTextTokenizer t, final Symbol next) {
    try {
      Assert.assertEquals(Symbol.EOF, t.skipToNext(next));
      Assert.assertEquals(null, t.getText());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
