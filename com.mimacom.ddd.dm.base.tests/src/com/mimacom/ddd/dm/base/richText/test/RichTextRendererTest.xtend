package com.mimacom.ddd.dm.base.richText.test

import com.mimacom.ddd.dm.base.base.BaseFactory
import com.mimacom.ddd.dm.base.base.DExpression
import com.mimacom.ddd.dm.base.base.DRichText
import com.mimacom.ddd.dm.base.base.impl.DExpressionImpl
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToHtmlRenderer
import com.mimacom.ddd.dm.base.richText.AbstractRichTextToPlainTextRenderer
import org.junit.Test

import static org.junit.Assert.assertEquals

class RichTextRendererTest {

	static class TestExpression extends DExpressionImpl {
		val String text

		new(String text) {
			this.text = text
		}
	}

	val BASE = BaseFactory.eINSTANCE

	@Test def void plainTextRenderer() {
		val rt = BASE.createDRichText
		rt.addTextSegment("aaa **")
		rt.addExpressionSegment("bbb")
		rt.addTextSegment(" __ccc__ ")
		rt.addExpressionSegment("ddd")
		rt.addTextSegment("** eee")

		val renderer = new AbstractRichTextToPlainTextRenderer() {

			override protected getSourceText(DExpression expr) {
				(expr as TestExpression).text
			}

			override protected encode(String plainText) {
				return plainText
			}

		}
		assertEquals("aaa bbb ccc ddd eee", renderer.render(rt))
	}

	@Test def void htmlTextRenderer() {
		val rt = BASE.createDRichText
		rt.addTextSegment("aaa **")
		rt.addExpressionSegment("bbb")
		rt.addTextSegment(" __ccc__ ")
		rt.addExpressionSegment("ddd")
		rt.addTextSegment("** eee")

		val renderer = new AbstractRichTextToHtmlRenderer() {

			override protected getSourceText(DExpression expr) {
				(expr as TestExpression).text
			}

			override protected renderStyleExpression(DExpression expr, String parsedText) {
				"<xx>" + (expr as TestExpression).text + "</xx>"
			}
		}
		assertEquals("aaa <em><xx>bbb</xx> <u>ccc</u> <xx>ddd</xx></em> eee", renderer.render(rt))
	}

	protected def addTextSegment(DRichText t, String text) {
		val s = BASE.createDTextSegment
		s.value = text
		t.segments.add(s)
		return s
	}

	protected def addExpressionSegment(DRichText t, String expr) {
		t.segments.add(new TestExpression(expr))
		return t
	}
}
