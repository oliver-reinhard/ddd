package com.mimacom.ddd.dm.base.styledText.test

import com.mimacom.ddd.dm.base.styledText.DStyledTextSpan
import com.mimacom.ddd.dm.base.styledText.DTextAttribute
import com.mimacom.ddd.dm.base.styledText.DTextStyle
import com.mimacom.ddd.dm.base.styledText.parser.StyledTextParser
import com.mimacom.ddd.dm.base.styledText.parser.SystemErrorErrorMessageAcceptor
import org.junit.Test

import static com.mimacom.ddd.dm.base.styledText.DTextAttribute.*
import static com.mimacom.ddd.dm.base.styledText.DTextStyle.*
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class StyledTextParserTest {

	static boolean debug = false

	@Test def void testSimple() {
		val String text = "aaaa"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 3, 1)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 3, 0)
	}
	
	@Test def void testBasicFormat() {
		val String text = "aa **bb** cc"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 11, 3)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		val DStyledTextSpan s1 = root.subspans.get(1)
		assertSpanBaseProperties(s1, EMPHASIS, 3, 8, 1)
		assertSpanBaseProperties(s1.subspans.get(0), EMPHASIS, 5, 6, 0)
		assertSpanBaseProperties(root.subspans.get(2), PLAIN, 9, 11, 0)
	}

	@Test def void testMultipleFormats() {
		val String text = "aa **bb** cc ++dd++ ee"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 21, 5)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		val DStyledTextSpan s1 = root.subspans.get(1)
		assertSpanBaseProperties(s1, EMPHASIS, 3, 8, 1)
		assertSpanBaseProperties(s1.subspans.get(0), EMPHASIS, 5, 6, 0)
		assertSpanBaseProperties(root.subspans.get(2), PLAIN, 9, 12, 0)
		val DStyledTextSpan s3 = root.subspans.get(3)
		assertSpanBaseProperties(s3, STRONG, 13, 18, 1)
		assertSpanBaseProperties(s3.subspans.get(0), STRONG, 15, 16, 0)
		assertSpanBaseProperties(root.subspans.get(4), PLAIN, 19, 21, 0)
	}

	@Test def void testAtStartEnd() {
		val String text = "**bb** cc ++dd++"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 15, 3)
		val DStyledTextSpan s0 = root.subspans.get(0)
		assertSpanBaseProperties(s0, EMPHASIS, 0, 5, 1)
		assertSpanBaseProperties(s0.subspans.get(0), EMPHASIS, 2, 3, 0)
		assertSpanBaseProperties(root.subspans.get(1), PLAIN, 6, 9, 0)
		val DStyledTextSpan s2 = root.subspans.get(2)
		assertSpanBaseProperties(s2, STRONG, 10, 15, 1)
		assertSpanBaseProperties(s2.subspans.get(0), STRONG, 12, 13, 0)
	}

	@Test def void testNestedFormats1() {
		val String text = "aa **bb --cc-- dd**"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 18, 2)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		val DStyledTextSpan s1 = root.subspans.get(1)
		assertSpanBaseProperties(s1, EMPHASIS, 3, 18, 3)
		assertSpanBaseProperties(s1.subspans.get(0), EMPHASIS, 5, 7, 0)
		val DStyledTextSpan s11 = s1.subspans.get(1)
		assertSpanBaseProperties(s11, EMPHASIS, 8, 13, 1)
		assertAttributes(s11, #[STRIKETHROUGH])
		assertSpanBaseProperties(s11.subspans.get(0), EMPHASIS, 10, 11, 0)
		assertAttributes(s11.subspans.get(0), #[STRIKETHROUGH])
		assertSpanBaseProperties(s1.subspans.get(2), EMPHASIS, 14, 16, 0)
	}

	@Test def void testNestedFormats2() {
		val String text = "aa --bb **cc** dd--"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 18, 2)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		val DStyledTextSpan s1 = root.subspans.get(1)
		assertSpanBaseProperties(s1, PLAIN, 3, 18, 3)
		assertAttributes(s1, #[STRIKETHROUGH])
		val DStyledTextSpan s10 = s1.subspans.get(0)
		assertSpanBaseProperties(s10, PLAIN, 5, 7, 0)
		assertAttributes(s10, #[STRIKETHROUGH])
		val DStyledTextSpan s11 = s1.subspans.get(1)
		assertSpanBaseProperties(s11, EMPHASIS, 8, 13, 1)
		assertAttributes(s11, #[STRIKETHROUGH])
		assertSpanBaseProperties(s11.subspans.get(0), EMPHASIS, 10, 11, 0)
		assertAttributes(s11.subspans.get(0), #[STRIKETHROUGH])
		val DStyledTextSpan s12 = s1.subspans.get(2)
		assertSpanBaseProperties(s12, PLAIN, 14, 16, 0)
		assertAttributes(s12, #[STRIKETHROUGH])
	}

	@Test def void testConflictingStylesNok() {
		assertFalse(parse("aa **bb ++cc++ dd** ee"))
	}

	@Test def void testOverlappingFormatsNok() {
		assertFalse(parse("aa **bb --cc** dd-- ee"))
	}

	@Test def void testUnclosedStylesNok() {
		assertFalse(parse("aa **bb --cc"))
	}

	@Test def void testExpressionEmpty() {
		val String text = "aa [] cc"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 7, 3)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		assertSpanBaseProperties(root.subspans.get(1), EXPRESSION, 3, 4, 0)
		assertEquals("", root.subspans.get(1).text)
		assertSpanBaseProperties(root.subspans.get(2), PLAIN, 5, 7, 0)
		assertTrue(parse("[]"))
		assertTrue(parse("[] cc"))
		assertTrue(parse("aa []"))
	}
	
	@Test def void testExpressionNotEmpty() {
		val String text = "aa [b] cc"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 8, 3)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		assertSpanBaseProperties(root.subspans.get(1), EXPRESSION, 3, 5, 0)
		assertEquals("b", root.subspans.get(1).text)
		assertSpanBaseProperties(root.subspans.get(2), PLAIN, 6, 8, 0)
		
		assertTrue(parse("aa [bb] cc"))
		assertTrue(parse("aa **[bb]** cc"))
	}

	@Test def void testStaticReferenceEmpty() {
		val String text = "aa [[]] cc"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 9, 3)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		assertSpanBaseProperties(root.subspans.get(1), EXPRESSION, 3, 6, 0)
		assertEquals("", root.subspans.get(1).text)
		assertSpanBaseProperties(root.subspans.get(2), PLAIN, 7, 9, 0)
		
		assertTrue(parse("[[]]"))
		assertTrue(parse("[[]] cc"))
		assertTrue(parse("aa [[]]"))
	}
	
	@Test def void testStaticReferenceNotEmpty() {
		val String text = "aa [[b]] cc"
		assertTrue(parse(text))

		val StyledTextParser parser = new StyledTextParser(text)
		var DStyledTextSpan root = parser.parse()
		assertSpanBaseProperties(root, PLAIN, 0, 10, 3)
		assertSpanBaseProperties(root.subspans.get(0), PLAIN, 0, 2, 0)
		assertSpanBaseProperties(root.subspans.get(1), EXPRESSION, 3, 7, 0)
		assertEquals("b", root.subspans.get(1).text)
		assertSpanBaseProperties(root.subspans.get(2), PLAIN, 8, 10, 0)
		
		assertTrue(parse("aa [[bb]] cc"))
		assertTrue(parse("aa **[[bb]]** cc"))
	}

	@Test def void testExpressionOpenNok() {
		assertFalse(parse("aa ["))
		assertFalse(parse("aa [bb"))
		assertFalse(parse("aa [bb] cc ["))
		assertFalse(parse("aa [bb] cc [dd"))
		assertFalse(parse("aa [bb cc [dd] ee"))
	}

	@Test def void testExpressionNotOpenNok() {
		assertFalse(parse("]"))
		assertFalse(parse("aa ]"))
		assertFalse(parse("aa ]bb"))
		assertFalse(parse("aa [bb] cc ]"))
		assertFalse(parse("aa [bb] cc ]dd"))
		assertFalse(parse("aa ]bb cc [dd] ee"))
	}

	@Test def void testExpressionHangsNok() {
		assertFalse(parse("abc [55] dd]"))
	}

	def package boolean parse(String text) {
		val TestErrorMessageAcceptor acceptor = new TestErrorMessageAcceptor()
		val StyledTextParser parser = new StyledTextParser(text, acceptor)
		if (debug) {
			var DStyledTextSpan root = parser.parse()
			System.out.println(parser.toString(root))
		} else {
			parser.parse()
		}
		return acceptor.count == 0
	}

	def void assertSpanBaseProperties(DStyledTextSpan s, DTextStyle style, int start, int end, int subspans) {
		assertEquals(style, s.style)
		assertEquals(start, s.startPos)
		assertEquals(end, s.endPos)
		assertEquals(subspans, s.subspans.size)
	}

	def void assertAttributes(DStyledTextSpan s, DTextAttribute[] attr) {
		assertEquals(attr.length, s.attributes.size)
		for (a : attr) {
			assertTrue(s.attributes.contains(a))
		}
	}

	static class TestErrorMessageAcceptor extends SystemErrorErrorMessageAcceptor {
		int count = 0

		override void acceptError(String message, int offset, int length) {
			count = count + 1
			if (debug) {
				super.acceptError(message, offset, length)
			}
		}
	}
}
