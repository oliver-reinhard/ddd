package com.mimacom.ddd.dm.base.styledText.test

import com.mimacom.ddd.dm.base.styledText.parser.IncompleteEscapeSequenceException
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextTokenizer
import org.junit.Test

import static org.junit.Assert.assertEquals
import static org.junit.Assert.fail
import com.mimacom.ddd.dm.base.styledText.parser.Symbol

class StyledTextTokenizerTest {

	@Test def void testNoStyleElements() {
		val text = "aa bb cc "
		val StyledTextTokenizer t = new StyledTextTokenizer(text)
		assertTokenText(t, text)
		assertTokenType(t, Symbol.EOF)
		assertTokenType(t, Symbol.EOF)
	}

	@Test def void testSingleEscape() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa\\cc")
		assertTokenText(t, "aacc")
		assertTokenType(t, Symbol.EOF)
		val StyledTextTokenizer t2 = new StyledTextTokenizer("\\aa")
		assertTokenText(t2, "aa")
		assertTokenType(t2, Symbol.EOF)
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa\\")
		try {
			assertTokenText(t3, "aa")
			fail("IncompleteEscapeSequenceException expected")
		} catch (IncompleteEscapeSequenceException e) {
		}
	}

	@Test def void testSingleBackslash() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa\\\\cc")
		assertTokenText(t, "aa\\cc")
		assertTokenType(t, Symbol.EOF)
		val StyledTextTokenizer t2 = new StyledTextTokenizer("\\\\aa")
		assertTokenText(t2, "\\aa")
		assertTokenType(t2, Symbol.EOF)
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa\\\\")
		assertTokenText(t3, "aa\\")
		assertTokenType(t3, Symbol.EOF)
	}

	@Test def void testSingleStyleElement() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc")
		assertTokenText(t, "aa ")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, "bb")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, " cc")
		assertTokenType(t, Symbol.EOF)
	}

	@Test def void testMultipleStyleElement() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb** cc ++dd++ ee")
		assertTokenText(t, "aa ")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, "bb")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, " cc ")
		assertTokenType(t, Symbol.STRONG)
		assertTokenText(t, "dd")
		assertTokenType(t, Symbol.STRONG)
		assertTokenText(t, " ee")
		assertTokenType(t, Symbol.EOF)
	}

	@Test def void testAtStartAndEnd() {
		val StyledTextTokenizer t = new StyledTextTokenizer("**bb** cc ++dd++")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, "bb")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, " cc ")
		assertTokenType(t, Symbol.STRONG)
		assertTokenText(t, "dd")
		assertTokenType(t, Symbol.STRONG)
		assertTokenType(t, Symbol.EOF)
	}

	@Test def void testNestedFormats() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc-- dd**")
		assertTokenText(t, "aa ")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, "bb ")
		assertTokenType(t, Symbol.STRIKETHROUGH)
		assertTokenText(t, "cc")
		assertTokenType(t, Symbol.STRIKETHROUGH)
		assertTokenText(t, " dd")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenType(t, Symbol.EOF)
	}

	@Test def void testOverlappingFormats() {
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb --cc** dd--")
		assertTokenText(t, "aa ")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, "bb ")
		assertTokenType(t, Symbol.STRIKETHROUGH)
		assertTokenText(t, "cc")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, " dd")
		assertTokenType(t, Symbol.STRIKETHROUGH)
		assertTokenType(t, Symbol.EOF)
	}

	@Test def void testSkipTextWithinExpression() {
		// Expression-end symbol encountered:
		val StyledTextTokenizer t = new StyledTextTokenizer("aa[]cc")
		assertTokenText(t, "aa")
		assertTokenType(t, Symbol.EXPRESSION_START)
		assertTokenSkipText(t, Symbol.EXPRESSION_END, "")
		assertTokenType(t, Symbol.EXPRESSION_END)
		assertTokenText(t, "cc")
		assertTokenType(t, Symbol.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t2 = new StyledTextTokenizer("[]")
		assertTokenType(t2, Symbol.EXPRESSION_START)
		assertTokenSkipText(t2, Symbol.EXPRESSION_END, "")
		assertTokenType(t2, Symbol.EXPRESSION_END)
		assertTokenType(t2, Symbol.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa[b]")
		assertTokenText(t3, "aa")
		assertTokenType(t3, Symbol.EXPRESSION_START)
		assertTokenSkipText(t3, Symbol.EXPRESSION_END, "b")
		assertTokenType(t3, Symbol.EXPRESSION_END)
		assertTokenType(t3, Symbol.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t4 = new StyledTextTokenizer("[b]cc")
		assertTokenType(t4, Symbol.EXPRESSION_START)
		assertTokenSkipText(t4, Symbol.EXPRESSION_END, "b")
		assertTokenType(t4, Symbol.EXPRESSION_END)
		assertTokenText(t4, "cc")
		assertTokenType(t4, Symbol.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t5 = new StyledTextTokenizer("aa[b]cc")
		assertTokenText(t5, "aa")
		assertTokenType(t5, Symbol.EXPRESSION_START)
		assertTokenSkipText(t5, Symbol.EXPRESSION_END, "b")
		assertTokenType(t5, Symbol.EXPRESSION_END)
		assertTokenText(t5, "cc")
		assertTokenType(t5, Symbol.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t6 = new StyledTextTokenizer("aa[bb]cc")
		assertTokenText(t6, "aa")
		assertTokenType(t6, Symbol.EXPRESSION_START)
		assertTokenSkipText(t6, Symbol.EXPRESSION_END, "bb")
		assertTokenType(t6, Symbol.EXPRESSION_END)
		assertTokenText(t6, "cc")
		assertTokenType(t6, Symbol.EOF)
		// Expression-end symbol encountered:
		val StyledTextTokenizer t7 = new StyledTextTokenizer("aa **bb [cc ** dd] ee**")
		assertTokenText(t7, "aa ")
		assertTokenType(t7, Symbol.EMPHASIS)
		assertTokenText(t7, "bb ")
		assertTokenType(t7, Symbol.EXPRESSION_START)
		assertTokenSkipText(t7, Symbol.EXPRESSION_END, "cc ** dd")
		assertTokenType(t7, Symbol.EXPRESSION_END)
		assertTokenText(t7, " ee")
		assertTokenType(t7, Symbol.EMPHASIS)
		assertTokenType(t7, Symbol.EOF)
		// Expression-end symbol NOT encountered:
		val StyledTextTokenizer t8 = new StyledTextTokenizer("aa **bb [cc ** dd")
		assertTokenText(t8, "aa ")
		assertTokenType(t8, Symbol.EMPHASIS)
		assertTokenText(t8, "bb ")
		assertTokenType(t8, Symbol.EXPRESSION_START)
		assertTokenSkipEOF(t8, Symbol.EXPRESSION_END)
		assertTokenType(t8, Symbol.EOF)
		// Expression-end symbol NOT encountered and not characters consumed:
		val StyledTextTokenizer t9 = new StyledTextTokenizer("aa **bb [")
		assertTokenText(t9, "aa ")
		assertTokenType(t9, Symbol.EMPHASIS)
		assertTokenText(t9, "bb ")
		assertTokenType(t9, Symbol.EXPRESSION_START)
		assertTokenType(t9, Symbol.EOF)
	}

	@Test def void testSkipTextWithinStaticReference() {
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t = new StyledTextTokenizer("aa[[]]cc")
		assertTokenText(t, "aa")
		assertTokenType(t, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t, Symbol.STATIC_REFERENCE_END, "")
		assertTokenType(t, Symbol.STATIC_REFERENCE_END)
		assertTokenText(t, "cc")
		assertTokenType(t, Symbol.EOF)
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t2 = new StyledTextTokenizer("[[]]")
		assertTokenType(t2, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t2, Symbol.STATIC_REFERENCE_END, "")
		assertTokenType(t2, Symbol.STATIC_REFERENCE_END)
		assertTokenType(t2, Symbol.EOF)
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa[[b]]")
		assertTokenText(t3, "aa")
		assertTokenType(t3, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t3, Symbol.STATIC_REFERENCE_END, "b")
		assertTokenType(t3, Symbol.STATIC_REFERENCE_END)
		assertTokenType(t3, Symbol.EOF)
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t4 = new StyledTextTokenizer("[[b]]cc")
		assertTokenType(t4, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t4, Symbol.STATIC_REFERENCE_END, "b")
		assertTokenType(t4, Symbol.STATIC_REFERENCE_END)
		assertTokenText(t4, "cc")
		assertTokenType(t4, Symbol.EOF)
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t5 = new StyledTextTokenizer("aa[[b]]cc")
		assertTokenText(t5, "aa")
		assertTokenType(t5, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t5, Symbol.STATIC_REFERENCE_END, "b")
		assertTokenType(t5, Symbol.STATIC_REFERENCE_END)
		assertTokenText(t5, "cc")
		assertTokenType(t5, Symbol.EOF)
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t6 = new StyledTextTokenizer("aa[[bb]]cc")
		assertTokenText(t6, "aa")
		assertTokenType(t6, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t6, Symbol.STATIC_REFERENCE_END, "bb")
		assertTokenType(t6, Symbol.STATIC_REFERENCE_END)
		assertTokenText(t6, "cc")
		assertTokenType(t6, Symbol.EOF)
		// Static-reference-end symbol encountered:
		val StyledTextTokenizer t7 = new StyledTextTokenizer("aa **bb [[cc ** dd]] ee**")
		assertTokenText(t7, "aa ")
		assertTokenType(t7, Symbol.EMPHASIS)
		assertTokenText(t7, "bb ")
		assertTokenType(t7, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipText(t7, Symbol.STATIC_REFERENCE_END, "cc ** dd")
		assertTokenType(t7, Symbol.STATIC_REFERENCE_END)
		assertTokenText(t7, " ee")
		assertTokenType(t7, Symbol.EMPHASIS)
		assertTokenType(t7, Symbol.EOF)
		// Static-reference-end symbol NOT encountered:
		val StyledTextTokenizer t8 = new StyledTextTokenizer("aa **bb [[cc ** dd")
		assertTokenText(t8, "aa ")
		assertTokenType(t8, Symbol.EMPHASIS)
		assertTokenText(t8, "bb ")
		assertTokenType(t8, Symbol.STATIC_REFERENCE_START)
		assertTokenSkipEOF(t8, Symbol.STATIC_REFERENCE_END)
		assertTokenType(t8, Symbol.EOF)
		// Static-reference-end symbol NOT encountered and not characters consumed:
		val StyledTextTokenizer t9 = new StyledTextTokenizer("aa **bb [[")
		assertTokenText(t9, "aa ")
		assertTokenType(t9, Symbol.EMPHASIS)
		assertTokenText(t9, "bb ")
		assertTokenType(t9, Symbol.STATIC_REFERENCE_START)
		assertTokenType(t9, Symbol.EOF)
	}

	@Test def void testSkipTextWithinStrong() {
		// Strong symbol encountered:
		val StyledTextTokenizer t = new StyledTextTokenizer("aa **bb ++cc ** dd++ ee**")
		assertTokenText(t, "aa ")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenText(t, "bb ")
		assertTokenType(t, Symbol.STRONG)
		assertTokenSkipText(t, Symbol.STRONG, "cc ** dd")
		assertTokenType(t, Symbol.STRONG)
		assertTokenText(t, " ee")
		assertTokenType(t, Symbol.EMPHASIS)
		assertTokenType(t, Symbol.EOF)
		// Strong symbol NOT encountered:
		val StyledTextTokenizer t2 = new StyledTextTokenizer("aa **bb ++cc ** dd")
		assertTokenText(t2, "aa ")
		assertTokenType(t2, Symbol.EMPHASIS)
		assertTokenText(t2, "bb ")
		assertTokenType(t2, Symbol.STRONG)
		assertTokenSkipEOF(t2, Symbol.STRONG)
		assertTokenType(t2, Symbol.EOF)
		// Strong symbol only encountered PARTIALLY:
		val StyledTextTokenizer t3 = new StyledTextTokenizer("aa **bb ++cc ** dd+")
		assertTokenText(t3, "aa ")
		assertTokenType(t3, Symbol.EMPHASIS)
		assertTokenText(t3, "bb ")
		assertTokenType(t3, Symbol.STRONG)
		assertTokenSkipEOF(t3, Symbol.STRONG)
		assertTokenType(t3, Symbol.EOF)
	}

	def private void assertTokenType(StyledTextTokenizer t, Symbol expected) {
		assertEquals(expected, t.readNext())
		assertEquals(null, t.getText())
	}

	def private void assertTokenText(StyledTextTokenizer t, String expected) {
		assertEquals(Symbol.TEXT, t.readNext())
		assertEquals(expected, t.getText())
	}

	def private void assertTokenSkipText(StyledTextTokenizer t, Symbol next, String expected) {
		assertEquals(Symbol.TEXT, t.skipToNext(next))
		assertEquals(expected, t.getText())
	}

	def private void assertTokenSkipEOF(StyledTextTokenizer t, Symbol next) {
		assertEquals(Symbol.EOF, t.skipToNext(next))
		assertEquals(null, t.getText())
	}
}
