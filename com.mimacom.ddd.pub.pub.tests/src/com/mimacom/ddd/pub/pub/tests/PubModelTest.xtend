package com.mimacom.ddd.pub.pub.tests

import com.google.inject.Inject
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
package class PubModelTest {
	
	@Inject extension PubNumberingUtil

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

	@Test def testSequenceNumberWithPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d00 = PUB.createPart
		body.divisions.add(d00)
		val d01 = PUB.createPart
		body.divisions.add(d01)
		val d10 = PUB.createChapter
		d00.divisions.add(d10)
		val d11 = PUB.createChapter
		d00.divisions.add(d11)
		val d20 = PUB.createSection
		d10.divisions.add(d20)
		val d21 = PUB.createSection
		d10.divisions.add(d21)
		val d30 = PUB.createSubsection
		d20.divisions.add(d30)
		val d31 = PUB.createSubsection
		d20.divisions.add(d31)
		val d40 = PUB.createSubsubsection
		d30.divisions.add(d40)
		val d41 = PUB.createSubsubsection
		d30.divisions.add(d41)
		
		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d00.sequenceNumber)
		assertEquals(1, d01.sequenceNumber)
		assertEquals(0, d10.sequenceNumber)
		assertEquals(1, d11.sequenceNumber)
		assertEquals(0, d20.sequenceNumber)
		assertEquals(1, d21.sequenceNumber)
		assertEquals(0, d30.sequenceNumber)
		assertEquals(1, d31.sequenceNumber)
		assertEquals(0, d40.sequenceNumber)
		assertEquals(1, d41.sequenceNumber)
	}

	@Test def testSequenceNumberWithoutPart() {
		val Component compo = PUB.createComponent
		val body = PUB.createPublicationBody
		compo.segments.add(body);
		val d00 = PUB.createChapter
		body.divisions.add(d00)
		val d01 = PUB.createChapter
		body.divisions.add(d01)
		val d10 = PUB.createSection
		d00.divisions.add(d10)
		val d11 = PUB.createSection
		d00.divisions.add(d11)
		val d20 = PUB.createSubsection
		d10.divisions.add(d20)
		val d21 = PUB.createSubsection
		d10.divisions.add(d21)
		val d30 = PUB.createSubsubsection
		d20.divisions.add(d30)
		val d31 = PUB.createSubsubsection
		d20.divisions.add(d31)
		
		compo.gatherAllDivisionsAndSetSequenceNumbers

		assertEquals(0, d00.sequenceNumber)
		assertEquals(1, d01.sequenceNumber)
		assertEquals(0, d10.sequenceNumber)
		assertEquals(1, d11.sequenceNumber)
		assertEquals(0, d20.sequenceNumber)
		assertEquals(1, d21.sequenceNumber)
		assertEquals(0, d30.sequenceNumber)
		assertEquals(1, d31.sequenceNumber)
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
		
		compo.gatherAllDivisionsAndSetSequenceNumbers

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
}
