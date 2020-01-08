package com.mimacom.ddd.dm.base.styledText.test

import com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer
import com.mimacom.ddd.dm.styledText.parser.StyledTextTokenizer.Token
import org.junit.Test

import static org.junit.Assert.assertEquals

class StyledTextTokenizerTest {
	
	@Test def void testBasics() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc")
		assertTokenText(t, "aa ")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, "bb")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, " cc")
		assertTokenType(t, Token.EOF)
		assertTokenType(t, Token.EOF)
	}

	@Test def void testMultiple() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc ++dd++ ee")
		assertTokenText(t, "aa ")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, "bb")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, " cc ")
		assertTokenType(t, Token.STRONG)
		assertTokenText(t, "dd")
		assertTokenType(t, Token.STRONG)
		assertTokenText(t, " ee")
		assertTokenType(t, Token.EOF)
	}

	@Test def void testAtStartEnd() {
		val StyledTextTokenizer t = new StyledTextTokenizer("**bb** cc ++dd++")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, "bb")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, " cc ")
		assertTokenType(t, Token.STRONG)
		assertTokenText(t, "dd")
		assertTokenType(t, Token.STRONG)
		assertTokenType(t, Token.EOF)
	}

	@Test def void testNestedFormats() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc-- dd**")
		assertTokenText(t, "aa ")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, "bb ")
		assertTokenType(t, Token.STRIKETHROUGH)
		assertTokenText(t, "cc")
		assertTokenType(t, Token.STRIKETHROUGH)
		assertTokenText(t, " dd")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenType(t, Token.EOF)
	}

	@Test def void testOverlappingFormats() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc** dd--")
		assertTokenText(t, "aa ")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, "bb ")
		assertTokenType(t, Token.STRIKETHROUGH)
		assertTokenText(t, "cc")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, " dd")
		assertTokenType(t, Token.STRIKETHROUGH)
		assertTokenType(t, Token.EOF)
	}

	@Test def void testSkipTextWithinExpression() {
		// Expression-end symbol encountered:
		val StyledTextTokenizer t = new StyledTextTokenizer("aa[]cc")
		assertTokenText(t, "aa")
		assertTokenType(t, Token.EXPRESSION_START)
		assertTokenSkip(t, Token.EXPRESSION_END, "")
		assertTokenType(t, Token.EXPRESSION_END)
		assertTokenText(t, "cc")
		assertTokenType(t, Token.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t2 = new StyledTextTokenizer("aa[b]cc")
		assertTokenText(t2, "aa")
		assertTokenType(t2, Token.EXPRESSION_START)
		assertTokenSkip(t2, Token.EXPRESSION_END, "b")
		assertTokenType(t2, Token.EXPRESSION_END)
		assertTokenText(t2, "cc")
		assertTokenType(t2, Token.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa[bb]cc")
		assertTokenText(t3, "aa")
		assertTokenType(t3, Token.EXPRESSION_START)
		assertTokenSkip(t3, Token.EXPRESSION_END, "bb")
		assertTokenType(t3, Token.EXPRESSION_END)
		assertTokenText(t3, "cc")
		assertTokenType(t3, Token.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t4 = new StyledTextTokenizer("aa **bb [cc ** dd] ee**")
		assertTokenText(t4, "aa ")
		assertTokenType(t4, Token.EMPHASIS)
		assertTokenText(t4, "bb ")
		assertTokenType(t4, Token.EXPRESSION_START)
		assertTokenSkip(t4, Token.EXPRESSION_END, "cc ** dd")
		assertTokenType(t4, Token.EXPRESSION_END)
		assertTokenText(t4, " ee")
		assertTokenType(t4, Token.EMPHASIS)
		assertTokenType(t4, Token.EOF)
		// Expression-end symbol NOT encountered:
		val StyledTextTokenizer t5 = new StyledTextTokenizer("aa **bb [cc ** dd")
		assertTokenText(t5, "aa ")
		assertTokenType(t5, Token.EMPHASIS)
		assertTokenText(t5, "bb ")
		assertTokenType(t5, Token.EXPRESSION_START)
		assertTokenSkip(t5, Token.EXPRESSION_END, "cc ** dd")
		assertTokenType(t5, Token.EOF)
		// Expression-end symbol NOT encountered and not characters consumed:
		val StyledTextTokenizer t6 = new StyledTextTokenizer("aa **bb [")
		assertTokenText(t6, "aa ")
		assertTokenType(t6, Token.EMPHASIS)
		assertTokenText(t6, "bb ")
		assertTokenType(t6, Token.EXPRESSION_START)
		assertTokenType(t6, Token.EOF)
	}

	@Test def void testSkipTextWithinStrong() {
		// Strong symbol encountered:
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb ++cc ** dd++ ee**")
		assertTokenText(t, "aa ")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenText(t, "bb ")
		assertTokenType(t, Token.STRONG)
		assertTokenSkip(t, Token.STRONG, "cc ** dd")
		assertTokenType(t, Token.STRONG)
		assertTokenText(t, " ee")
		assertTokenType(t, Token.EMPHASIS)
		assertTokenType(t, Token.EOF)
		// Strong symbol NOT encountered:
		val StyledTextTokenizer t2 = new StyledTextTokenizer("aa **bb ++cc ** dd")
		assertTokenText(t2, "aa ")
		assertTokenType(t2, Token.EMPHASIS)
		assertTokenText(t2, "bb ")
		assertTokenType(t2, Token.STRONG)
		assertTokenSkip(t2, Token.STRONG, "cc ** dd")
		assertTokenType(t2, Token.EOF)
		// Strong symbol only encountered PARTIALLY:
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa **bb ++cc ** dd+")
		assertTokenText(t3, "aa ")
		assertTokenType(t3, Token.EMPHASIS)
		assertTokenText(t3, "bb ")
		assertTokenType(t3, Token.STRONG)
		assertTokenSkip(t3, Token.STRONG, "cc ** dd+")
		assertTokenType(t3, Token.EOF)
	}

	def private void assertTokenType(StyledTextTokenizer t, Token expected) {
		assertEquals(expected, t.readNext())
		assertEquals(null, t.getText())
	}

	def private void assertTokenText(StyledTextTokenizer t, String expected) {
		assertEquals(Token.TEXT, t.readNext())
		assertEquals(expected, t.getText())
	}

	def private void assertTokenSkip(StyledTextTokenizer t, Token next, String expected) {
		assertEquals(Token.TEXT, t.skipToNext(next))
		assertEquals(expected, t.getText())
	}
}
