package com.mimacom.ddd.dm.base.richText.test

import com.mimacom.ddd.dm.base.base.BaseFactory
import com.mimacom.ddd.dm.base.base.DExpression
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
		val t0 = BASE.createDTextSegment
		t0.value = "aaa **"
		rt.segments.add(t0)

		val t1 = new TestExpression("bbb")
		rt.segments.add(t1)

		val t2 = BASE.createDTextSegment
		t2.value = " __ccc__ "
		rt.segments.add(t2)

		val t3 = new TestExpression("ddd")
		rt.segments.add(t3)

		val t4 = BASE.createDTextSegment
		t4.value = "** eee"
		rt.segments.add(t4)

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
		val t0 = BASE.createDTextSegment
		t0.value = "aaa **"
		rt.segments.add(t0)

		val t1 = new TestExpression("bbb")
		rt.segments.add(t1)

		val t2 = BASE.createDTextSegment
		t2.value = " __ccc__ "
		rt.segments.add(t2)

		val t3 = new TestExpression("ddd")
		rt.segments.add(t3)

		val t4 = BASE.createDTextSegment
		t4.value = "** eee"
		rt.segments.add(t4)

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

}
