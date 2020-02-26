package com.mimacom.ddd.pub.pub.tests

import com.google.inject.Inject
import com.mimacom.ddd.pub.proto.ProtoFactory
import com.mimacom.ddd.pub.pub.Component
import com.mimacom.ddd.pub.pub.PubFactory
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(PubInjectorProvider)
package class PubNumberingUtilTest {

	@Inject extension PubNumberingUtil

	static val PROTO = ProtoFactory.eINSTANCE
	static val PUB = PubFactory.eINSTANCE

	@Test def testLevelsWithPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d0 = PUB.createPart
		body.divisions.add(d0)
		val d1 = PUB.createChapter
		d0.divisions.add(d1)
		val d2 = PUB.createSection
		d1.divisions.add(d2)
		val d3 = PUB.createSubsection
		d2.divisions.add(d3)
		val d4 = PUB.createSubsubsection
		d3.divisions.add(d4)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d0.level)
		assertEquals(1, d1.level)
		assertEquals(2, d2.level)
		assertEquals(3, d3.level)
		assertEquals(4, d4.level)
	}

	@Test def testLevelsWithoutPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d0 = PUB.createChapter
		body.divisions.add(d0)
		val d1 = PUB.createSection
		d0.divisions.add(d1)
		val d2 = PUB.createSubsection
		d1.divisions.add(d2)
		val d3 = PUB.createSubsubsection
		d2.divisions.add(d3)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d0.level)
		assertEquals(1, d1.level)
		assertEquals(2, d2.level)
		assertEquals(3, d3.level)
	}

	@Test def testLevelsWithoutChapter() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d0 = PUB.createSection
		body.divisions.add(d0)
		val d1 = PUB.createSubsection
		d0.divisions.add(d1)
		val d2 = PUB.createSubsubsection
		d1.divisions.add(d2)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d0.level)
		assertEquals(1, d1.level)
		assertEquals(2, d2.level)
	}

	@Test def testSequenceNumberWithPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d0 = PUB.createPart
		body.divisions.add(d0)
		val d00 = PUB.createChapter
		d0.divisions.add(d00)
		val d000 = PUB.createSection
		d00.divisions.add(d000)
		val d001 = PUB.createSection
		d00.divisions.add(d001)
		val d0000 = PUB.createSubsection
		d000.divisions.add(d0000)
		val d0001 = PUB.createSubsection
		d000.divisions.add(d0001)
		val d00000 = PUB.createSubsubsection
		d0000.divisions.add(d00000)
		val d00001 = PUB.createSubsubsection
		d0000.divisions.add(d00001)

		val d1 = PUB.createPart
		body.divisions.add(d1)
		val d10 = PUB.createChapter
		d1.divisions.add(d10)
		val d11 = PUB.createChapter
		d1.divisions.add(d11)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d0.sequenceNumber)
		assertEquals(0, d00.sequenceNumber)
		assertEquals(0, d000.sequenceNumber)
		assertEquals(1, d001.sequenceNumber)
		assertEquals(0, d0000.sequenceNumber)
		assertEquals(1, d0001.sequenceNumber)
		assertEquals(0, d00000.sequenceNumber)
		assertEquals(1, d00001.sequenceNumber)

		assertEquals(1, d1.sequenceNumber)
		assertEquals(1, d10.sequenceNumber)
		assertEquals(2, d11.sequenceNumber)
	}

	@Test def testSequenceNumberWithoutPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d00 = PUB.createChapter
		body.divisions.add(d00)
		val d000 = PUB.createSection
		d00.divisions.add(d000)
		val d001 = PUB.createSection
		d00.divisions.add(d001)
		val d0000 = PUB.createSubsection
		d000.divisions.add(d0000)
		val d0001 = PUB.createSubsection
		d000.divisions.add(d0001)
		val d00000 = PUB.createSubsubsection
		d0000.divisions.add(d00000)
		val d00001 = PUB.createSubsubsection
		d0000.divisions.add(d00001)

		val d01 = PUB.createChapter
		body.divisions.add(d01)
		val d02 = PUB.createChapter
		body.divisions.add(d02)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d00.sequenceNumber)
		assertEquals(0, d000.sequenceNumber)
		assertEquals(1, d001.sequenceNumber)
		assertEquals(0, d0000.sequenceNumber)
		assertEquals(1, d0001.sequenceNumber)
		assertEquals(0, d00000.sequenceNumber)
		assertEquals(1, d00001.sequenceNumber)

		assertEquals(1, d01.sequenceNumber)
		assertEquals(2, d02.sequenceNumber)
	}

	@Test def testSequenceNumberWithoutChapter() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d0 = PUB.createSection
		body.divisions.add(d0)
		val d1 = PUB.createSection
		body.divisions.add(d1)
		val d00 = PUB.createSubsection
		d0.divisions.add(d00)
		val d01 = PUB.createSubsection
		d0.divisions.add(d01)
		val d000 = PUB.createSubsubsection
		d00.divisions.add(d000)
		val d001 = PUB.createSubsubsection
		d00.divisions.add(d001)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d0.sequenceNumber)
		assertEquals(1, d1.sequenceNumber)
		assertEquals(0, d00.sequenceNumber)
		assertEquals(1, d01.sequenceNumber)
		assertEquals(0, d000.sequenceNumber)
		assertEquals(1, d001.sequenceNumber)
	}

	@Test def testDivisionIdWithPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d0 = PUB.createPart
		body.divisions.add(d0)
		val d1 = PUB.createPart
		body.divisions.add(d1)

		val d00 = PUB.createChapter
		d0.divisions.add(d00)
		val d01 = PUB.createChapter
		d0.divisions.add(d01)

		val d10 = PUB.createChapter
		d1.divisions.add(d10)
		val d11 = PUB.createChapter
		d1.divisions.add(d11)

		val d000 = PUB.createSection
		d00.divisions.add(d000)
		val d001 = PUB.createSection
		d00.divisions.add(d001)

		val d010 = PUB.createSection
		d01.divisions.add(d010)
		val d011 = PUB.createSection
		d01.divisions.add(d011)

		val d100 = PUB.createSection
		d10.divisions.add(d100)
		val d101 = PUB.createSection
		d10.divisions.add(d101)

		val d110 = PUB.createSection
		d11.divisions.add(d110)
		val d111 = PUB.createSection
		d11.divisions.add(d111)

		val d0000 = PUB.createSubsection
		d000.divisions.add(d0000)
		val d1110 = PUB.createSubsection
		d111.divisions.add(d1110)
		val d1111 = PUB.createSubsection
		d111.divisions.add(d1111)

		val d11100 = PUB.createSubsubsection
		d1110.divisions.add(d11100)
		val d11101 = PUB.createSubsubsection
		d1110.divisions.add(d11101)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals("0", d0.id)
		assertEquals("1", d1.id)
		assertEquals("0-0", d00.id)
		assertEquals("0-1", d01.id)
		assertEquals("1-2", d10.id)
		assertEquals("1-3", d11.id)

		assertEquals("0-0-0", d000.id)
		assertEquals("0-0-1", d001.id)
		assertEquals("0-1-0", d010.id)
		assertEquals("0-1-1", d011.id)
		assertEquals("1-2-0", d100.id)
		assertEquals("1-2-1", d101.id)
		assertEquals("1-3-0", d110.id)
		assertEquals("1-3-1", d111.id)

		assertEquals("0-0-0-0", d0000.id)
		assertEquals("1-3-1-0", d1110.id)
		assertEquals("1-3-1-1", d1111.id)

		assertEquals("1-3-1-0-0", d11100.id)
		assertEquals("1-3-1-0-1", d11101.id)

		d111.name = "a"
		assertEquals("a", d111.id)
		assertEquals("1-3-1-0", d1110.id)
	}

	@Test def testDivisionIdWithoutPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d0 = PUB.createChapter
		body.divisions.add(d0)
		val d1 = PUB.createChapter
		body.divisions.add(d1)

		val d00 = PUB.createSection
		d0.divisions.add(d00)
		val d01 = PUB.createSection
		d0.divisions.add(d01)

		val d10 = PUB.createSection
		d1.divisions.add(d10)
		val d11 = PUB.createSection
		d1.divisions.add(d11)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals("0", d0.id)
		assertEquals("1", d1.id)

		assertEquals("0-0", d00.id)
		assertEquals("0-1", d01.id)
		assertEquals("1-0", d10.id)
		assertEquals("1-1", d11.id)

		d01.name = "a"
		assertEquals("a", d01.id)
	}

	@Test def testDivisionIdWithoutChapter() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d0 = PUB.createSection
		body.divisions.add(d0)
		val d1 = PUB.createSection
		body.divisions.add(d1)

		val d00 = PUB.createSubsection
		d0.divisions.add(d00)
		val d01 = PUB.createSubsection
		d0.divisions.add(d01)

		val d10 = PUB.createSubsection
		d1.divisions.add(d10)
		val d11 = PUB.createSubsection
		d1.divisions.add(d11)

		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals("0", d0.id)
		assertEquals("1", d1.id)
		assertEquals("0-0", d00.id)
		assertEquals("0-1", d01.id)
		assertEquals("1-0", d10.id)
		assertEquals("1-1", d11.id)

		d1.name = "a"
		assertEquals("a", d1.id)
	}

	@Test def testPartInclude() {
		val Component a = PUB.createComponent
		val abody = PUB.createPublicationBody
		a.segments.add(abody);
		val a0 = PUB.createPart
		abody.divisions.add(a0)
		val a00 = PUB.createChapter
		a0.divisions.add(a00)
		val a01 = PUB.createChapter
		a0.divisions.add(a01)
		val a000 = PUB.createSection
		a00.divisions.add(a000)
		val a001 = PUB.createSection
		a00.divisions.add(a001)

		val a1 = PUB.createPart
		abody.divisions.add(a1)
		val a10 = PUB.createChapter
		a1.divisions.add(a10)
		val a11 = PUB.createChapter
		a1.divisions.add(a11)
		val a010 = PUB.createSection
		a01.divisions.add(a010)
		val a011 = PUB.createSection
		a01.divisions.add(a011)

		//
		val Component b = PUB.createComponent
		val bbody = PUB.createPublicationBody
		b.segments.add(bbody);
		val b0 = PUB.createPart
		bbody.divisions.add(b0)

		val b00 = PUB.createChapter
		b0.divisions.add(b00)
		val b01 = PUB.createChapter
		b0.divisions.add(b01)

		val b000 = PUB.createSection
		b00.divisions.add(b000)
		val b001 = PUB.createSection
		b00.divisions.add(b001)

		val b1 = PUB.createPart
		bbody.divisions.add(b1)
		b1.include = a0 // INCLUDE
		val b2 = PUB.createPart
		bbody.divisions.add(b2)

		val b20 = PUB.createChapter
		b2.divisions.add(b20)
		val b21 = PUB.createChapter
		b2.divisions.add(b21)

		val b200 = PUB.createSection
		b20.divisions.add(b200)
		val b201 = PUB.createSection
		b20.divisions.add(b201)

		b.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, b0.sequenceNumber)
		assertEquals(0, b00.sequenceNumber)
		assertEquals(1, b01.sequenceNumber)
		assertEquals(0, b000.sequenceNumber)
		assertEquals(1, b001.sequenceNumber)

		assertEquals("0", b0.id)
		assertEquals("0-0", b00.id)
		assertEquals("0-1", b01.id)
		assertEquals("0-0-0", b000.id)
		assertEquals("0-0-1", b001.id)

		assertEquals(1, b1.sequenceNumber)
		assertEquals(-1, a0.sequenceNumber) // included => skipped when assigning numbers
		assertEquals(2, a00.sequenceNumber)
		assertEquals(3, a01.sequenceNumber)
		assertEquals(0, a000.sequenceNumber)
		assertEquals(1, a001.sequenceNumber)
		assertEquals(0, a010.sequenceNumber)
		assertEquals(1, a011.sequenceNumber)

		assertEquals("1", b1.id)
		assertEquals("1-2", a00.id)
		assertEquals("1-3", a01.id)
		assertEquals("1-2-0", a000.id)
		assertEquals("1-2-1", a001.id)
		assertEquals("1-3-0", a010.id)
		assertEquals("1-3-1", a011.id)

		assertEquals(2, b2.sequenceNumber)
		assertEquals(4, b20.sequenceNumber)
		assertEquals(5, b21.sequenceNumber)
		assertEquals(0, b200.sequenceNumber)
		assertEquals(1, b201.sequenceNumber)

		assertEquals("2", b2.id)
		assertEquals("2-4", b20.id)
		assertEquals("2-5", b21.id)
		assertEquals("2-4-0", b200.id)
		assertEquals("2-4-1", b201.id)

	}

	@Test def testChapterInclude() {
		val Component a = PUB.createComponent
		val abody = PUB.createPublicationBody
		a.segments.add(abody);

		// No parts!
		val a00 = PUB.createChapter // -> level 0
		abody.divisions.add(a00)
		val a01 = PUB.createChapter
		abody.divisions.add(a01)
		val a000 = PUB.createSection
		a00.divisions.add(a000)
		val a001 = PUB.createSection
		a00.divisions.add(a001)

		val a10 = PUB.createChapter
		abody.divisions.add(a10)
		val a11 = PUB.createChapter
		abody.divisions.add(a11)
		val a010 = PUB.createSection
		a11.divisions.add(a010)
		val a011 = PUB.createSection
		a11.divisions.add(a011)

		//
		val Component b = PUB.createComponent
		val bbody = PUB.createPublicationBody
		b.segments.add(bbody);
		val b0 = PUB.createPart
		bbody.divisions.add(b0)

		val b00 = PUB.createChapter
		b0.divisions.add(b00)
		val b01 = PUB.createChapter
		b0.divisions.add(b01)

		val b000 = PUB.createSection
		b00.divisions.add(b000)
		val b010 = PUB.createSection
		b01.divisions.add(b010)

		val b1 = PUB.createPart
		bbody.divisions.add(b1)
		val b10 = PUB.createChapter
		b1.divisions.add(b10)
		val b11 = PUB.createChapter
		b1.divisions.add(b11)
		b11.include = a00 // INCLUDE at level 1
		val b2 = PUB.createPart
		bbody.divisions.add(b2)

		val b20 = PUB.createChapter
		b2.divisions.add(b20)
		val b21 = PUB.createChapter
		b2.divisions.add(b21)

		val b200 = PUB.createSection
		b20.divisions.add(b200)
		val b201 = PUB.createSection
		b20.divisions.add(b201)

		b.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, b0.sequenceNumber)
		assertEquals(0, b00.sequenceNumber)
		assertEquals(1, b01.sequenceNumber)
		assertEquals(0, b000.sequenceNumber)
		assertEquals(0, b010.sequenceNumber)

		assertEquals("0", b0.id)
		assertEquals("0-0", b00.id)
		assertEquals("0-1", b01.id)
		assertEquals("0-0-0", b000.id)
		assertEquals("0-1-0", b010.id)

		assertEquals(1, b1.sequenceNumber)
		assertEquals(2, b10.sequenceNumber)
		assertEquals(3, b11.sequenceNumber)
		assertEquals(-1, a00.sequenceNumber) // included => skipped when assigning numbers
		assertEquals(0, a000.sequenceNumber)	// included via a00
		assertEquals(1, a001.sequenceNumber)	// included via a00
		assertEquals(-1, a01.sequenceNumber) // not included
		assertEquals(-1, a010.sequenceNumber) // not included
		assertEquals(-1, a011.sequenceNumber) // not included
		assertEquals("1", b1.id)
		assertEquals("1-2", b10.id)
		assertEquals("1-3", b11.id)
		assertEquals("1-3-0", a000.id)	// included via a00
		assertEquals("1-3-1", a001.id)	// included via a00

		assertEquals(2, b2.sequenceNumber)
		assertEquals(4, b20.sequenceNumber)
		assertEquals(5, b21.sequenceNumber)
		assertEquals(0, b200.sequenceNumber)
		assertEquals(1, b201.sequenceNumber)

		assertEquals("2", b2.id)
		assertEquals("2-4", b20.id)
		assertEquals("2-5", b21.id)
		assertEquals("2-4-0", b200.id)
		assertEquals("2-4-1", b201.id)

		val pPubClass = PROTO.createPublicationClass
		a.publicationClass = pPubClass
		b.publicationClass = pPubClass

		assertEquals("1", b0.tieredNumber)
		assertEquals("1.", b00.tieredNumber)
		assertEquals("1.1", b000.tieredNumber)
		assertEquals("2.", b01.tieredNumber)
		assertEquals("2.1", b010.tieredNumber)

		assertEquals("2", b1.tieredNumber)
		assertEquals("3.", b10.tieredNumber)
		assertEquals("4.", b11.tieredNumber)
		assertEquals("4.1", a000.tieredNumber) // included via a00
		assertEquals("4.2", a001.tieredNumber) // included via a00

		assertEquals("3", b2.tieredNumber)
		assertEquals("5.", b20.tieredNumber)
		assertEquals("6.", b21.tieredNumber)
		assertEquals("5.1", b200.tieredNumber)
		assertEquals("5.2", b201.tieredNumber)

	}

	@Test def testTitledBlockId() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d00 = PUB.createPart
		body.divisions.add(d00)
		val t00 = PUB.createTitledTable
		t00.sequenceNumber = 0
		d00.contents.add(t00)

		val d10 = PUB.createChapter
		d00.divisions.add(d10)
		val d11 = PUB.createChapter
		d00.divisions.add(d11)
		val t11 = PUB.createTitledTable
		t11.sequenceNumber = 1
		d11.contents.add(t11)

		val d20 = PUB.createSection
		d10.divisions.add(d20)
		val d21 = PUB.createSection
		d10.divisions.add(d21)
		val t21 = PUB.createTitledTable
		t21.sequenceNumber = 2
		d21.contents.add(t21)

		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val t30 = PUB.createTitledTable
		t30.sequenceNumber = 3
		d30.contents.add(t30)

		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)
		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		val t41 = PUB.createTitledTable
		t41.sequenceNumber = 4
		d41.contents.add(t41)

		assertEquals("table-0", t00.id)
		assertEquals("table-1", t11.id)
		assertEquals("table-2", t21.id)
		assertEquals("table-3", t30.id)
		assertEquals("table-4", t41.id)

		t11.name = "a"
		assertEquals("a", t11.id)

		val t41a = PUB.createTitledTable
		d41.contents.add(t41)
		assertEquals("table-" + t41a.hashCode, t41a.id)
	}

	@Test def testTitledBlockIdWithoutPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d10 = PUB.createChapter
		body.divisions.add(d10)
		val d11 = PUB.createChapter
		body.divisions.add(d11)
		val t11 = PUB.createTitledTable
		t11.sequenceNumber = 1
		d11.contents.add(t11)

		val d20 = PUB.createSection
		d10.divisions.add(d20)
		val d21 = PUB.createSection
		d10.divisions.add(d21)
		val t21 = PUB.createTitledTable
		t21.sequenceNumber = 2
		d21.contents.add(t21)

		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val t30 = PUB.createTitledTable
		t30.sequenceNumber = 3
		d30.contents.add(t30)

		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)
		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		val t41 = PUB.createTitledTable
		t41.sequenceNumber = 4
		d41.contents.add(t41)

		assertEquals("table-1", t11.id)
		assertEquals("table-2", t21.id)
		assertEquals("table-3", t30.id)
		assertEquals("table-4", t41.id)

		t11.name = "a"
		assertEquals("a", t11.id)

		val t41a = PUB.createTitledTable
		d41.contents.add(t41)
		assertEquals("table-" + t41a.hashCode, t41a.id)
	}

	@Test def testTitledBlockIdWithoutChapter() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d20 = PUB.createSection
		body.divisions.add(d20)
		val d21 = PUB.createSection
		body.divisions.add(d21)
		val t21 = PUB.createTitledTable
		t21.sequenceNumber = 2
		d21.contents.add(t21)

		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val t30 = PUB.createTitledTable
		t30.sequenceNumber = 3
		d30.contents.add(t30)

		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)
		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		val t41 = PUB.createTitledTable
		t41.sequenceNumber = 4
		d41.contents.add(t41)

		assertEquals("table-2", t21.id)
		assertEquals("table-3", t30.id)
		assertEquals("table-4", t41.id)

		t21.name = "a"
		assertEquals("a", t21.id)

		val t41a = PUB.createTitledTable
		d41.contents.add(t41)
		assertEquals("table-" + t41a.hashCode, t41a.id)
	}

	@Test def testTitledBlockSequenceNumber() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d00 = PUB.createPart
		body.divisions.add(d00)
		val t00 = PUB.createTitledTable
		d00.contents.add(t00)

		val d10 = PUB.createChapter // CHAPTER
		d00.divisions.add(d10)
		val t10 = PUB.createTitledTable
		d10.contents.add(t10)

		val d11 = PUB.createChapter // CHAPTER
		d00.divisions.add(d11)
		val t11 = PUB.createTitledTable
		d11.contents.add(t11)

		val d20 = PUB.createSection
		d11.divisions.add(d20)

		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val t30 = PUB.createTitledTable
		d30.contents.add(t30)

		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)

		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		val t41 = PUB.createTitledTable
		d41.contents.add(t41)

		val d21 = PUB.createSection
		d11.divisions.add(d21)
		val t21 = PUB.createTitledTable
		d21.contents.add(t21)

		compo.gatherAllDivisionsAndSetSequenceNumbers
		compo.gatherAllTablesInSequenceAndSetSequenceNumbers

		assertEquals(0, t00.sequenceNumber)
		assertEquals(-1, t00.sequenceNumberInChapter)
		assertEquals(1, t10.sequenceNumber)
		assertEquals(0, t10.sequenceNumberInChapter)
		assertEquals(2, t11.sequenceNumber)
		assertEquals(0, t11.sequenceNumberInChapter)
		assertEquals(3, t30.sequenceNumber)
		assertEquals(1, t30.sequenceNumberInChapter)
		assertEquals(4, t41.sequenceNumber)
		assertEquals(2, t41.sequenceNumberInChapter)
		assertEquals(5, t21.sequenceNumber)
		assertEquals(3, t21.sequenceNumberInChapter)

		val pPubClass = PROTO.createPublicationClass
		compo.publicationClass = pPubClass

		assertEquals("1", t00.tieredNumber)
		assertEquals("1.1", t10.tieredNumber)
		assertEquals("2.1", t11.tieredNumber)
		assertEquals("2.2", t30.tieredNumber)
		assertEquals("2.3", t41.tieredNumber)
		assertEquals("2.4", t21.tieredNumber)
	}

	@Test def testTitledBlockSequenceNumberWithoutPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d10 = PUB.createChapter // CHAPTER
		body.divisions.add(d10)
		val t10 = PUB.createTitledTable
		d10.contents.add(t10)

		val d11 = PUB.createChapter // CHAPTER
		body.divisions.add(d11)
		val t11 = PUB.createTitledTable
		d11.contents.add(t11)

		val d20 = PUB.createSection
		d11.divisions.add(d20)

		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val t30 = PUB.createTitledTable
		d30.contents.add(t30)

		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)

		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		val t41 = PUB.createTitledTable
		d41.contents.add(t41)

		val d21 = PUB.createSection
		d11.divisions.add(d21)
		val t21 = PUB.createTitledTable
		d21.contents.add(t21)

		compo.gatherAllDivisionsAndSetSequenceNumbers
		compo.gatherAllTablesInSequenceAndSetSequenceNumbers

		assertEquals(0, t10.sequenceNumber)
		assertEquals(0, t10.sequenceNumberInChapter)
		assertEquals(1, t11.sequenceNumber)
		assertEquals(0, t11.sequenceNumberInChapter)
		assertEquals(2, t30.sequenceNumber)
		assertEquals(1, t30.sequenceNumberInChapter)
		assertEquals(3, t41.sequenceNumber)
		assertEquals(2, t41.sequenceNumberInChapter)
		assertEquals(4, t21.sequenceNumber)
		assertEquals(3, t21.sequenceNumberInChapter)

		val pPubClass = PROTO.createPublicationClass
		compo.publicationClass = pPubClass

		assertEquals("1.1", t10.tieredNumber)
		assertEquals("2.1", t11.tieredNumber)
		assertEquals("2.2", t30.tieredNumber)
		assertEquals("2.3", t41.tieredNumber)
		assertEquals("2.4", t21.tieredNumber)
	}

	@Test def testTitledBlockSequenceNumberWithoutChapter() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);

		val d20 = PUB.createSection
		body.divisions.add(d20)

		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val t30 = PUB.createTitledTable
		d30.contents.add(t30)

		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)

		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		val t41 = PUB.createTitledTable
		d41.contents.add(t41)

		val d21 = PUB.createSection
		body.divisions.add(d21)
		val t21 = PUB.createTitledTable
		d21.contents.add(t21)

		compo.gatherAllDivisionsAndSetSequenceNumbers
		compo.gatherAllTablesInSequenceAndSetSequenceNumbers

		assertEquals(0, t30.sequenceNumber)
		assertEquals(-1, t30.sequenceNumberInChapter)
		assertEquals(1, t41.sequenceNumber)
		assertEquals(-1, t41.sequenceNumberInChapter)
		assertEquals(2, t21.sequenceNumber)
		assertEquals(-1, t21.sequenceNumberInChapter)

		val pPubClass = PROTO.createPublicationClass
		compo.publicationClass = pPubClass

		assertEquals("1", t30.tieredNumber)
		assertEquals("2", t41.tieredNumber)
		assertEquals("3", t21.tieredNumber)
	}

	@Test def testTitledBlockSequenceNumberWithInclude() {
		val Component a = PUB.createComponent
		val abody = PUB.createPublicationBody
		a.segments.add(abody);

		// No parts!
		val a00 = PUB.createChapter // -> level 0
		abody.divisions.add(a00)
		val ta00 = PUB.createTitledTable
		a00.contents.add(ta00)

		val a000 = PUB.createSection
		a00.divisions.add(a000)
		val ta000 = PUB.createTitledTable
		a000.contents.add(ta000)

		val Component b = PUB.createComponent
		val bbody = PUB.createPublicationBody
		b.segments.add(bbody);

		val b00 = PUB.createPart
		bbody.divisions.add(b00)
		val tb00 = PUB.createTitledTable
		b00.contents.add(tb00)

		val b10 = PUB.createChapter // CHAPTER -> level 1
		b00.divisions.add(b10)
		val tb10 = PUB.createTitledTable
		b10.contents.add(tb10)

		val b20 = PUB.createSection
		b10.divisions.add(b20)
		val tb20 = PUB.createTitledTable
		b10.contents.add(tb20)

		val b11 = PUB.createChapter // CHAPTER
		b00.divisions.add(b11)
		val tb11 = PUB.createTitledTable
		b11.contents.add(tb11)

		val b21 = PUB.createSection
		b11.divisions.add(b21)
		b21.include = a000 // INCLUDE
		b.gatherAllDivisionsAndSetSequenceNumbers
		b.gatherAllTablesInSequenceAndSetSequenceNumbers

		assertEquals(0, tb00.sequenceNumber)
		assertEquals(-1, tb00.sequenceNumberInChapter)
		assertEquals(1, tb10.sequenceNumber)
		assertEquals(0, tb10.sequenceNumberInChapter)
		assertEquals(2, tb20.sequenceNumber)
		assertEquals(1, tb20.sequenceNumberInChapter)
		assertEquals(3, tb11.sequenceNumber)
		assertEquals(0, tb11.sequenceNumberInChapter)
		assertEquals(4, ta000.sequenceNumber)
		assertEquals(1, ta000.sequenceNumberInChapter)

		assertEquals(-1, ta00.sequenceNumber)
		assertEquals(-1, ta00.sequenceNumberInChapter)

		val pPubClass = PROTO.createPublicationClass
		b.publicationClass = pPubClass

		assertEquals("1", tb00.tieredNumber)
		assertEquals("1.1", tb10.tieredNumber)
		assertEquals("1.2", tb20.tieredNumber)
		assertEquals("2.1", tb11.tieredNumber)
		assertEquals("2.2", ta000.tieredNumber)
	}
}
