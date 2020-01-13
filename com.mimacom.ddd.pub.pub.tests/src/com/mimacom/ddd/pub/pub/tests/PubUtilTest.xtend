package com.mimacom.ddd.pub.pub.tests

import com.mimacom.ddd.pub.proto.ProtoFactory
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.PubUtil
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*

package class PubUtilTest {
	
	static val UTIL = new PubUtil
	static val NUM = new PubNumberingUtil
	
	static val PROTO = ProtoFactory.eINSTANCE
	static val PUB = PubFactory.eINSTANCE

	@Test def testSegmentPrototypeMapping() {
		val pPubClass = PROTO.createPublicationClass
		val pAbstract = PROTO.createProtoAbstract
		val pTOC = PROTO.createProtoTOC
		pPubClass.segments.add(pAbstract)
		pPubClass.segments.add(pTOC)
		
		val compo = PUB.createComponent
		compo.publicationClass = pPubClass
		val toc = PUB.createTOC
		compo.segments.add(toc);
		
		assertEquals(pTOC, UTIL.prototype(toc))
	}
	
	@Test def testDivisionPrototypeMapping() {
		val pPubClass = PROTO.createPublicationClass
		val pChapter = PROTO.createProtoChapter
		val pSection = PROTO.createProtoSection
		pPubClass.divisions.add(pChapter)
		pPubClass.divisions.add(pSection)
		
		val Component compo = PUB.createComponent
		compo.publicationClass = pPubClass
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val p = PUB.createPart
		body.divisions.add(p)
		val ch = PUB.createChapter
		p.divisions.add(ch)
		val s = PUB.createSection
		ch.divisions.add(s)
		
		assertEquals(pChapter, UTIL.prototype(ch))
		assertEquals(pSection, UTIL.prototype(s))
	}
	
	@Test def testRomanNumbering() {
		assertEquals("--", NUM.toRoman(-1))
		assertEquals("--", NUM.toRoman(0))
		assertEquals("I", NUM.toRoman(1))
		assertEquals("IX", NUM.toRoman(9))
		assertEquals("X", NUM.toRoman(10))
		assertEquals("XI", NUM.toRoman(11))
		assertEquals("XLIX", NUM.toRoman(49))
		assertEquals("XCIX", NUM.toRoman(99))
		assertEquals("XXII", NUM.toRoman(122))
	}
	
	@Test def testLetterNumbering() {
		assertEquals("--", NUM.toLetter(-1))
		assertEquals("A", NUM.toLetter(1))
		assertEquals("E", NUM.toLetter(5))
		assertEquals("Z", NUM.toLetter(26))
		assertEquals("AA", NUM.toLetter(27))
		assertEquals("AE", NUM.toLetter(31))
		assertEquals("ZZ", NUM.toLetter(702))
		assertEquals("A", NUM.toLetter(703))
		assertEquals("Z", NUM.toLetter(728))
		
	}
	
	@Test def testFormattedDivisionNumberWithPart() {
		val pPubClass = PROTO.createPublicationClass
		val pPart = PROTO.createProtoPart
		pPubClass.divisions.add(pPart)
		pPart.numberingStyle = ProtoSequenceNumberStyle.CAPITAL_ROMAN
		
		val pChapter = PROTO.createProtoChapter
		pPubClass.divisions.add(pChapter)
		pChapter.numberingStyle = ProtoSequenceNumberStyle.ARABIC
		
		val pSection = PROTO.createProtoSection
		pPubClass.divisions.add(pSection)
		pSection.numberingStyle = ProtoSequenceNumberStyle.CAPITAL_LETTER
		
		val pSub = PROTO.createProtoSubsection
		pPubClass.divisions.add(pSub)
		pSub.numberingStyle = ProtoSequenceNumberStyle.SMALL_LETTER
		
		val pSubsub = PROTO.createProtoSubsubsection
		pPubClass.divisions.add(pSubsub)
		pSubsub.numberingStyle = ProtoSequenceNumberStyle.NONE
		
		val Component compo = PUB.createComponent
		compo.publicationClass = pPubClass
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d00 = PUB.createPart
		body.divisions.add(d00)
		val d10 = PUB.createChapter
		d00.divisions.add(d10)
		val d20 = PUB.createSection
		d10.divisions.add(d20)
		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)
		
		assertEquals("I", NUM.formattedSingleNumber(d00))
		assertEquals("1", NUM.formattedSingleNumber(d10))
		assertEquals("A", NUM.formattedSingleNumber(d20))
		assertEquals("a", NUM.formattedSingleNumber(d30))
		assertEquals("", NUM.formattedSingleNumber(d40))
		
		assertEquals("I", NUM.tieredNumber(d00))
		assertEquals("1", NUM.tieredNumber(d10))
		assertEquals("1.A", NUM.tieredNumber(d20))
		assertEquals("1.A.a", NUM.tieredNumber(d30))
		assertEquals("", NUM.tieredNumber(d40))
		
	}
}
