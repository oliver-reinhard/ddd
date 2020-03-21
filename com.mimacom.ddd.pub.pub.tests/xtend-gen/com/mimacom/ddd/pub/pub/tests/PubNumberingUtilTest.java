package com.mimacom.ddd.pub.pub.tests;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.richText.RichTextUtil;
import com.mimacom.ddd.pub.proto.ProtoFactory;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import com.mimacom.ddd.pub.pub.tests.PubInjectorProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(PubInjectorProvider.class)
@SuppressWarnings("all")
class PubNumberingUtilTest {
  @Inject
  @Extension
  private RichTextUtil _richTextUtil;
  
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  private static final ProtoFactory PROTO = ProtoFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Test
  public void testLevelsWithPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d0 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d0);
    final Chapter d1 = PubNumberingUtilTest.PUB.createChapter();
    d0.getDivisions().add(d1);
    final Section d2 = PubNumberingUtilTest.PUB.createSection();
    d1.getDivisions().add(d2);
    final Subsection d3 = PubNumberingUtilTest.PUB.createSubsection();
    d2.getDivisions().add(d3);
    final Subsubsection d4 = PubNumberingUtilTest.PUB.createSubsubsection();
    d3.getDivisions().add(d4);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d0.getLevel());
    Assertions.assertEquals(1, d1.getLevel());
    Assertions.assertEquals(2, d2.getLevel());
    Assertions.assertEquals(3, d3.getLevel());
    Assertions.assertEquals(4, d4.getLevel());
  }
  
  @Test
  public void testLevelsWithoutPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d0 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d0);
    final Section d1 = PubNumberingUtilTest.PUB.createSection();
    d0.getDivisions().add(d1);
    final Subsection d2 = PubNumberingUtilTest.PUB.createSubsection();
    d1.getDivisions().add(d2);
    final Subsubsection d3 = PubNumberingUtilTest.PUB.createSubsubsection();
    d2.getDivisions().add(d3);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d0.getLevel());
    Assertions.assertEquals(1, d1.getLevel());
    Assertions.assertEquals(2, d2.getLevel());
    Assertions.assertEquals(3, d3.getLevel());
  }
  
  @Test
  public void testLevelsWithoutChapter() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Section d0 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d0);
    final Subsection d1 = PubNumberingUtilTest.PUB.createSubsection();
    d0.getDivisions().add(d1);
    final Subsubsection d2 = PubNumberingUtilTest.PUB.createSubsubsection();
    d1.getDivisions().add(d2);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d0.getLevel());
    Assertions.assertEquals(1, d1.getLevel());
    Assertions.assertEquals(2, d2.getLevel());
  }
  
  @Test
  public void testSequenceNumberWithPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d0 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d0);
    final Chapter d00 = PubNumberingUtilTest.PUB.createChapter();
    d0.getDivisions().add(d00);
    final Section d000 = PubNumberingUtilTest.PUB.createSection();
    d00.getDivisions().add(d000);
    final Section d001 = PubNumberingUtilTest.PUB.createSection();
    d00.getDivisions().add(d001);
    final Subsection d0000 = PubNumberingUtilTest.PUB.createSubsection();
    d000.getDivisions().add(d0000);
    final Subsection d0001 = PubNumberingUtilTest.PUB.createSubsection();
    d000.getDivisions().add(d0001);
    final Subsubsection d00000 = PubNumberingUtilTest.PUB.createSubsubsection();
    d0000.getDivisions().add(d00000);
    final Subsubsection d00001 = PubNumberingUtilTest.PUB.createSubsubsection();
    d0000.getDivisions().add(d00001);
    final Part d1 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d1);
    final Chapter d10 = PubNumberingUtilTest.PUB.createChapter();
    d1.getDivisions().add(d10);
    final Chapter d11 = PubNumberingUtilTest.PUB.createChapter();
    d1.getDivisions().add(d11);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d0.getSequenceNumber());
    Assertions.assertEquals(0, d00.getSequenceNumber());
    Assertions.assertEquals(0, d000.getSequenceNumber());
    Assertions.assertEquals(1, d001.getSequenceNumber());
    Assertions.assertEquals(0, d0000.getSequenceNumber());
    Assertions.assertEquals(1, d0001.getSequenceNumber());
    Assertions.assertEquals(0, d00000.getSequenceNumber());
    Assertions.assertEquals(1, d00001.getSequenceNumber());
    Assertions.assertEquals(1, d1.getSequenceNumber());
    Assertions.assertEquals(1, d10.getSequenceNumber());
    Assertions.assertEquals(2, d11.getSequenceNumber());
  }
  
  @Test
  public void testSequenceNumberWithoutPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d00 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d00);
    final Section d000 = PubNumberingUtilTest.PUB.createSection();
    d00.getDivisions().add(d000);
    final Section d001 = PubNumberingUtilTest.PUB.createSection();
    d00.getDivisions().add(d001);
    final Subsection d0000 = PubNumberingUtilTest.PUB.createSubsection();
    d000.getDivisions().add(d0000);
    final Subsection d0001 = PubNumberingUtilTest.PUB.createSubsection();
    d000.getDivisions().add(d0001);
    final Subsubsection d00000 = PubNumberingUtilTest.PUB.createSubsubsection();
    d0000.getDivisions().add(d00000);
    final Subsubsection d00001 = PubNumberingUtilTest.PUB.createSubsubsection();
    d0000.getDivisions().add(d00001);
    final Chapter d01 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d01);
    final Chapter d02 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d02);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d00.getSequenceNumber());
    Assertions.assertEquals(0, d000.getSequenceNumber());
    Assertions.assertEquals(1, d001.getSequenceNumber());
    Assertions.assertEquals(0, d0000.getSequenceNumber());
    Assertions.assertEquals(1, d0001.getSequenceNumber());
    Assertions.assertEquals(0, d00000.getSequenceNumber());
    Assertions.assertEquals(1, d00001.getSequenceNumber());
    Assertions.assertEquals(1, d01.getSequenceNumber());
    Assertions.assertEquals(2, d02.getSequenceNumber());
  }
  
  @Test
  public void testSequenceNumberWithoutChapter() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Section d0 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d0);
    final Section d1 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d1);
    final Subsection d00 = PubNumberingUtilTest.PUB.createSubsection();
    d0.getDivisions().add(d00);
    final Subsection d01 = PubNumberingUtilTest.PUB.createSubsection();
    d0.getDivisions().add(d01);
    final Subsubsection d000 = PubNumberingUtilTest.PUB.createSubsubsection();
    d00.getDivisions().add(d000);
    final Subsubsection d001 = PubNumberingUtilTest.PUB.createSubsubsection();
    d00.getDivisions().add(d001);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d0.getSequenceNumber());
    Assertions.assertEquals(1, d1.getSequenceNumber());
    Assertions.assertEquals(0, d00.getSequenceNumber());
    Assertions.assertEquals(1, d01.getSequenceNumber());
    Assertions.assertEquals(0, d000.getSequenceNumber());
    Assertions.assertEquals(1, d001.getSequenceNumber());
  }
  
  @Test
  public void testDivisionIdWithPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d0 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d0);
    final Part d1 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d1);
    final Chapter d00 = PubNumberingUtilTest.PUB.createChapter();
    d0.getDivisions().add(d00);
    final Chapter d01 = PubNumberingUtilTest.PUB.createChapter();
    d0.getDivisions().add(d01);
    final Chapter d10 = PubNumberingUtilTest.PUB.createChapter();
    d1.getDivisions().add(d10);
    final Chapter d11 = PubNumberingUtilTest.PUB.createChapter();
    d1.getDivisions().add(d11);
    final Section d000 = PubNumberingUtilTest.PUB.createSection();
    d00.getDivisions().add(d000);
    final Section d001 = PubNumberingUtilTest.PUB.createSection();
    d00.getDivisions().add(d001);
    final Section d010 = PubNumberingUtilTest.PUB.createSection();
    d01.getDivisions().add(d010);
    final Section d011 = PubNumberingUtilTest.PUB.createSection();
    d01.getDivisions().add(d011);
    final Section d100 = PubNumberingUtilTest.PUB.createSection();
    d10.getDivisions().add(d100);
    final Section d101 = PubNumberingUtilTest.PUB.createSection();
    d10.getDivisions().add(d101);
    final Section d110 = PubNumberingUtilTest.PUB.createSection();
    d11.getDivisions().add(d110);
    final Section d111 = PubNumberingUtilTest.PUB.createSection();
    d11.getDivisions().add(d111);
    final Subsection d0000 = PubNumberingUtilTest.PUB.createSubsection();
    d000.getDivisions().add(d0000);
    final Subsection d1110 = PubNumberingUtilTest.PUB.createSubsection();
    d111.getDivisions().add(d1110);
    final Subsection d1111 = PubNumberingUtilTest.PUB.createSubsection();
    d111.getDivisions().add(d1111);
    final Subsubsection d11100 = PubNumberingUtilTest.PUB.createSubsubsection();
    d1110.getDivisions().add(d11100);
    final Subsubsection d11101 = PubNumberingUtilTest.PUB.createSubsubsection();
    d1110.getDivisions().add(d11101);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals("0", d0.getId());
    Assertions.assertEquals("1", d1.getId());
    Assertions.assertEquals("0-0", d00.getId());
    Assertions.assertEquals("0-1", d01.getId());
    Assertions.assertEquals("1-2", d10.getId());
    Assertions.assertEquals("1-3", d11.getId());
    Assertions.assertEquals("0-0-0", d000.getId());
    Assertions.assertEquals("0-0-1", d001.getId());
    Assertions.assertEquals("0-1-0", d010.getId());
    Assertions.assertEquals("0-1-1", d011.getId());
    Assertions.assertEquals("1-2-0", d100.getId());
    Assertions.assertEquals("1-2-1", d101.getId());
    Assertions.assertEquals("1-3-0", d110.getId());
    Assertions.assertEquals("1-3-1", d111.getId());
    Assertions.assertEquals("0-0-0-0", d0000.getId());
    Assertions.assertEquals("1-3-1-0", d1110.getId());
    Assertions.assertEquals("1-3-1-1", d1111.getId());
    Assertions.assertEquals("1-3-1-0-0", d11100.getId());
    Assertions.assertEquals("1-3-1-0-1", d11101.getId());
    d111.setName("a");
    Assertions.assertEquals("a", d111.getId());
    Assertions.assertEquals("1-3-1-0", d1110.getId());
  }
  
  @Test
  public void testDivisionIdWithoutPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d0 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d0);
    final Chapter d1 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d1);
    final Section d00 = PubNumberingUtilTest.PUB.createSection();
    d0.getDivisions().add(d00);
    final Section d01 = PubNumberingUtilTest.PUB.createSection();
    d0.getDivisions().add(d01);
    final Section d10 = PubNumberingUtilTest.PUB.createSection();
    d1.getDivisions().add(d10);
    final Section d11 = PubNumberingUtilTest.PUB.createSection();
    d1.getDivisions().add(d11);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals("0", d0.getId());
    Assertions.assertEquals("1", d1.getId());
    Assertions.assertEquals("0-0", d00.getId());
    Assertions.assertEquals("0-1", d01.getId());
    Assertions.assertEquals("1-0", d10.getId());
    Assertions.assertEquals("1-1", d11.getId());
    d01.setName("a");
    Assertions.assertEquals("a", d01.getId());
  }
  
  @Test
  public void testDivisionIdWithoutChapter() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Section d0 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d0);
    final Section d1 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d1);
    final Subsection d00 = PubNumberingUtilTest.PUB.createSubsection();
    d0.getDivisions().add(d00);
    final Subsection d01 = PubNumberingUtilTest.PUB.createSubsection();
    d0.getDivisions().add(d01);
    final Subsection d10 = PubNumberingUtilTest.PUB.createSubsection();
    d1.getDivisions().add(d10);
    final Subsection d11 = PubNumberingUtilTest.PUB.createSubsection();
    d1.getDivisions().add(d11);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals("0", d0.getId());
    Assertions.assertEquals("1", d1.getId());
    Assertions.assertEquals("0-0", d00.getId());
    Assertions.assertEquals("0-1", d01.getId());
    Assertions.assertEquals("1-0", d10.getId());
    Assertions.assertEquals("1-1", d11.getId());
    d1.setName("a");
    Assertions.assertEquals("a", d1.getId());
  }
  
  @Test
  public void testPartInclude() {
    final Component a = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody abody = PubNumberingUtilTest.PUB.createPublicationBody();
    a.getSegments().add(abody);
    final Part a0 = PubNumberingUtilTest.PUB.createPart();
    abody.getDivisions().add(a0);
    final Chapter a00 = PubNumberingUtilTest.PUB.createChapter();
    a0.getDivisions().add(a00);
    final Chapter a01 = PubNumberingUtilTest.PUB.createChapter();
    a0.getDivisions().add(a01);
    final Section a000 = PubNumberingUtilTest.PUB.createSection();
    a00.getDivisions().add(a000);
    final Section a001 = PubNumberingUtilTest.PUB.createSection();
    a00.getDivisions().add(a001);
    final Part a1 = PubNumberingUtilTest.PUB.createPart();
    abody.getDivisions().add(a1);
    final Chapter a10 = PubNumberingUtilTest.PUB.createChapter();
    a1.getDivisions().add(a10);
    final Chapter a11 = PubNumberingUtilTest.PUB.createChapter();
    a1.getDivisions().add(a11);
    final Section a010 = PubNumberingUtilTest.PUB.createSection();
    a01.getDivisions().add(a010);
    final Section a011 = PubNumberingUtilTest.PUB.createSection();
    a01.getDivisions().add(a011);
    final Component b = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody bbody = PubNumberingUtilTest.PUB.createPublicationBody();
    b.getSegments().add(bbody);
    final Part b0 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b0);
    final Chapter b00 = PubNumberingUtilTest.PUB.createChapter();
    b0.getDivisions().add(b00);
    final Chapter b01 = PubNumberingUtilTest.PUB.createChapter();
    b0.getDivisions().add(b01);
    final Section b000 = PubNumberingUtilTest.PUB.createSection();
    b00.getDivisions().add(b000);
    final Section b001 = PubNumberingUtilTest.PUB.createSection();
    b00.getDivisions().add(b001);
    final Part b1 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b1);
    b1.setInclude(a0);
    final Part b2 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b2);
    final Chapter b20 = PubNumberingUtilTest.PUB.createChapter();
    b2.getDivisions().add(b20);
    final Chapter b21 = PubNumberingUtilTest.PUB.createChapter();
    b2.getDivisions().add(b21);
    final Section b200 = PubNumberingUtilTest.PUB.createSection();
    b20.getDivisions().add(b200);
    final Section b201 = PubNumberingUtilTest.PUB.createSection();
    b20.getDivisions().add(b201);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(b);
    Assertions.assertEquals(0, b0.getSequenceNumber());
    Assertions.assertEquals(0, b00.getSequenceNumber());
    Assertions.assertEquals(1, b01.getSequenceNumber());
    Assertions.assertEquals(0, b000.getSequenceNumber());
    Assertions.assertEquals(1, b001.getSequenceNumber());
    Assertions.assertEquals("0", b0.getId());
    Assertions.assertEquals("0-0", b00.getId());
    Assertions.assertEquals("0-1", b01.getId());
    Assertions.assertEquals("0-0-0", b000.getId());
    Assertions.assertEquals("0-0-1", b001.getId());
    Assertions.assertEquals(1, b1.getSequenceNumber());
    Assertions.assertEquals((-1), a0.getSequenceNumber());
    Assertions.assertEquals(2, a00.getSequenceNumber());
    Assertions.assertEquals(3, a01.getSequenceNumber());
    Assertions.assertEquals(0, a000.getSequenceNumber());
    Assertions.assertEquals(1, a001.getSequenceNumber());
    Assertions.assertEquals(0, a010.getSequenceNumber());
    Assertions.assertEquals(1, a011.getSequenceNumber());
    Assertions.assertEquals("1", b1.getId());
    Assertions.assertEquals("1-2", a00.getId());
    Assertions.assertEquals("1-3", a01.getId());
    Assertions.assertEquals("1-2-0", a000.getId());
    Assertions.assertEquals("1-2-1", a001.getId());
    Assertions.assertEquals("1-3-0", a010.getId());
    Assertions.assertEquals("1-3-1", a011.getId());
    Assertions.assertEquals(2, b2.getSequenceNumber());
    Assertions.assertEquals(4, b20.getSequenceNumber());
    Assertions.assertEquals(5, b21.getSequenceNumber());
    Assertions.assertEquals(0, b200.getSequenceNumber());
    Assertions.assertEquals(1, b201.getSequenceNumber());
    Assertions.assertEquals("2", b2.getId());
    Assertions.assertEquals("2-4", b20.getId());
    Assertions.assertEquals("2-5", b21.getId());
    Assertions.assertEquals("2-4-0", b200.getId());
    Assertions.assertEquals("2-4-1", b201.getId());
  }
  
  @Test
  public void testChapterInclude() {
    final Component a = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody abody = PubNumberingUtilTest.PUB.createPublicationBody();
    a.getSegments().add(abody);
    final Chapter a00 = PubNumberingUtilTest.PUB.createChapter();
    abody.getDivisions().add(a00);
    final Chapter a01 = PubNumberingUtilTest.PUB.createChapter();
    abody.getDivisions().add(a01);
    final Section a000 = PubNumberingUtilTest.PUB.createSection();
    a00.getDivisions().add(a000);
    final Section a001 = PubNumberingUtilTest.PUB.createSection();
    a00.getDivisions().add(a001);
    final Chapter a10 = PubNumberingUtilTest.PUB.createChapter();
    abody.getDivisions().add(a10);
    final Chapter a11 = PubNumberingUtilTest.PUB.createChapter();
    abody.getDivisions().add(a11);
    final Section a010 = PubNumberingUtilTest.PUB.createSection();
    a11.getDivisions().add(a010);
    final Section a011 = PubNumberingUtilTest.PUB.createSection();
    a11.getDivisions().add(a011);
    final Component b = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody bbody = PubNumberingUtilTest.PUB.createPublicationBody();
    b.getSegments().add(bbody);
    final Part b0 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b0);
    final Chapter b00 = PubNumberingUtilTest.PUB.createChapter();
    b0.getDivisions().add(b00);
    final Chapter b01 = PubNumberingUtilTest.PUB.createChapter();
    b0.getDivisions().add(b01);
    final Section b000 = PubNumberingUtilTest.PUB.createSection();
    b00.getDivisions().add(b000);
    final Section b010 = PubNumberingUtilTest.PUB.createSection();
    b01.getDivisions().add(b010);
    final Part b1 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b1);
    final Chapter b10 = PubNumberingUtilTest.PUB.createChapter();
    b1.getDivisions().add(b10);
    final Chapter b11 = PubNumberingUtilTest.PUB.createChapter();
    b1.getDivisions().add(b11);
    b11.setInclude(a00);
    final Part b2 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b2);
    final Chapter b20 = PubNumberingUtilTest.PUB.createChapter();
    b2.getDivisions().add(b20);
    final Chapter b21 = PubNumberingUtilTest.PUB.createChapter();
    b2.getDivisions().add(b21);
    final Section b200 = PubNumberingUtilTest.PUB.createSection();
    b20.getDivisions().add(b200);
    final Section b201 = PubNumberingUtilTest.PUB.createSection();
    b20.getDivisions().add(b201);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(b);
    Assertions.assertEquals(0, b0.getSequenceNumber());
    Assertions.assertEquals(0, b00.getSequenceNumber());
    Assertions.assertEquals(1, b01.getSequenceNumber());
    Assertions.assertEquals(0, b000.getSequenceNumber());
    Assertions.assertEquals(0, b010.getSequenceNumber());
    Assertions.assertEquals("0", b0.getId());
    Assertions.assertEquals("0-0", b00.getId());
    Assertions.assertEquals("0-1", b01.getId());
    Assertions.assertEquals("0-0-0", b000.getId());
    Assertions.assertEquals("0-1-0", b010.getId());
    Assertions.assertEquals(1, b1.getSequenceNumber());
    Assertions.assertEquals(2, b10.getSequenceNumber());
    Assertions.assertEquals(3, b11.getSequenceNumber());
    Assertions.assertEquals((-1), a00.getSequenceNumber());
    Assertions.assertEquals(0, a000.getSequenceNumber());
    Assertions.assertEquals(1, a001.getSequenceNumber());
    Assertions.assertEquals((-1), a01.getSequenceNumber());
    Assertions.assertEquals((-1), a010.getSequenceNumber());
    Assertions.assertEquals((-1), a011.getSequenceNumber());
    Assertions.assertEquals("1", b1.getId());
    Assertions.assertEquals("1-2", b10.getId());
    Assertions.assertEquals("1-3", b11.getId());
    Assertions.assertEquals("1-3-0", a000.getId());
    Assertions.assertEquals("1-3-1", a001.getId());
    Assertions.assertEquals(2, b2.getSequenceNumber());
    Assertions.assertEquals(4, b20.getSequenceNumber());
    Assertions.assertEquals(5, b21.getSequenceNumber());
    Assertions.assertEquals(0, b200.getSequenceNumber());
    Assertions.assertEquals(1, b201.getSequenceNumber());
    Assertions.assertEquals("2", b2.getId());
    Assertions.assertEquals("2-4", b20.getId());
    Assertions.assertEquals("2-5", b21.getId());
    Assertions.assertEquals("2-4-0", b200.getId());
    Assertions.assertEquals("2-4-1", b201.getId());
    final PublicationClass pPubClass = PubNumberingUtilTest.PROTO.createPublicationClass();
    a.setPublicationClass(pPubClass);
    b.setPublicationClass(pPubClass);
    Assertions.assertEquals("1", this._pubNumberingUtil.tieredNumber(b0));
    Assertions.assertEquals("1.", this._pubNumberingUtil.tieredNumber(b00));
    Assertions.assertEquals("1.1", this._pubNumberingUtil.tieredNumber(b000));
    Assertions.assertEquals("2.", this._pubNumberingUtil.tieredNumber(b01));
    Assertions.assertEquals("2.1", this._pubNumberingUtil.tieredNumber(b010));
    Assertions.assertEquals("2", this._pubNumberingUtil.tieredNumber(b1));
    Assertions.assertEquals("3.", this._pubNumberingUtil.tieredNumber(b10));
    Assertions.assertEquals("4.", this._pubNumberingUtil.tieredNumber(b11));
    Assertions.assertEquals("4.1", this._pubNumberingUtil.tieredNumber(a000));
    Assertions.assertEquals("4.2", this._pubNumberingUtil.tieredNumber(a001));
    Assertions.assertEquals("3", this._pubNumberingUtil.tieredNumber(b2));
    Assertions.assertEquals("5.", this._pubNumberingUtil.tieredNumber(b20));
    Assertions.assertEquals("6.", this._pubNumberingUtil.tieredNumber(b21));
    Assertions.assertEquals("5.1", this._pubNumberingUtil.tieredNumber(b200));
    Assertions.assertEquals("5.2", this._pubNumberingUtil.tieredNumber(b201));
  }
  
  @Test
  public void testTitledBlockId() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d00);
    final TitledTable t00 = this.createTitledTable("t00");
    t00.setSequenceNumber(0);
    d00.getContents().add(t00);
    final Chapter d10 = PubNumberingUtilTest.PUB.createChapter();
    d00.getDivisions().add(d10);
    final Chapter d11 = PubNumberingUtilTest.PUB.createChapter();
    d00.getDivisions().add(d11);
    final TitledTable t11 = this.createTitledTable("t11");
    t11.setSequenceNumber(1);
    d11.getContents().add(t11);
    final Section d20 = PubNumberingUtilTest.PUB.createSection();
    d10.getDivisions().add(d20);
    final Section d21 = PubNumberingUtilTest.PUB.createSection();
    d10.getDivisions().add(d21);
    final TitledTable t21 = this.createTitledTable("t21");
    t21.setSequenceNumber(2);
    d21.getContents().add(t21);
    final Subsection d30 = PubNumberingUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = this.createTitledTable("t30");
    t30.setSequenceNumber(3);
    d30.getContents().add(t30);
    final Subsubsection d40 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = this.createTitledTable("t41");
    t41.setSequenceNumber(4);
    d41.getContents().add(t41);
    Assertions.assertEquals("table-0", t00.getId());
    Assertions.assertEquals("table-1", t11.getId());
    Assertions.assertEquals("table-2", t21.getId());
    Assertions.assertEquals("table-3", t30.getId());
    Assertions.assertEquals("table-4", t41.getId());
    t11.setName("a");
    Assertions.assertEquals("a", t11.getId());
    final TitledTable t41a = PubNumberingUtilTest.PUB.createTitledTable();
    d41.getContents().add(t41);
    int _hashCode = t41a.hashCode();
    String _plus = ("table-" + Integer.valueOf(_hashCode));
    Assertions.assertEquals(_plus, t41a.getId());
  }
  
  @Test
  public void testTitledBlockIdWithoutPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d10 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d10);
    final Chapter d11 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d11);
    final TitledTable t11 = this.createTitledTable("t11");
    t11.setSequenceNumber(1);
    d11.getContents().add(t11);
    final Section d20 = PubNumberingUtilTest.PUB.createSection();
    d10.getDivisions().add(d20);
    final Section d21 = PubNumberingUtilTest.PUB.createSection();
    d10.getDivisions().add(d21);
    final TitledTable t21 = this.createTitledTable("t21");
    t21.setSequenceNumber(2);
    d21.getContents().add(t21);
    final Subsection d30 = PubNumberingUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = this.createTitledTable("t30");
    t30.setSequenceNumber(3);
    d30.getContents().add(t30);
    final Subsubsection d40 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = this.createTitledTable("t41");
    t41.setSequenceNumber(4);
    d41.getContents().add(t41);
    Assertions.assertEquals("table-1", t11.getId());
    Assertions.assertEquals("table-2", t21.getId());
    Assertions.assertEquals("table-3", t30.getId());
    Assertions.assertEquals("table-4", t41.getId());
    t11.setName("a");
    Assertions.assertEquals("a", t11.getId());
    final TitledTable t41a = PubNumberingUtilTest.PUB.createTitledTable();
    d41.getContents().add(t41);
    int _hashCode = t41a.hashCode();
    String _plus = ("table-" + Integer.valueOf(_hashCode));
    Assertions.assertEquals(_plus, t41a.getId());
  }
  
  @Test
  public void testTitledBlockIdWithoutChapter() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Section d20 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d20);
    final Section d21 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d21);
    final TitledTable t21 = this.createTitledTable("t21");
    t21.setSequenceNumber(2);
    d21.getContents().add(t21);
    final Subsection d30 = PubNumberingUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = this.createTitledTable("t30");
    t30.setSequenceNumber(3);
    d30.getContents().add(t30);
    final Subsubsection d40 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = this.createTitledTable("t41");
    t41.setSequenceNumber(4);
    d41.getContents().add(t41);
    Assertions.assertEquals("table-2", t21.getId());
    Assertions.assertEquals("table-3", t30.getId());
    Assertions.assertEquals("table-4", t41.getId());
    t21.setName("a");
    Assertions.assertEquals("a", t21.getId());
    final TitledTable t41a = PubNumberingUtilTest.PUB.createTitledTable();
    d41.getContents().add(t41);
    int _hashCode = t41a.hashCode();
    String _plus = ("table-" + Integer.valueOf(_hashCode));
    Assertions.assertEquals(_plus, t41a.getId());
  }
  
  @Test
  public void testTitledBlockSequenceNumber() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubNumberingUtilTest.PUB.createPart();
    body.getDivisions().add(d00);
    final TitledTable t00 = this.createTitledTable("t00");
    d00.getContents().add(t00);
    final Chapter d10 = PubNumberingUtilTest.PUB.createChapter();
    d00.getDivisions().add(d10);
    final TitledTable t10 = this.createTitledTable("t10");
    d10.getContents().add(t10);
    final Chapter d11 = PubNumberingUtilTest.PUB.createChapter();
    d00.getDivisions().add(d11);
    final TitledTable t11 = this.createTitledTable("t11");
    d11.getContents().add(t11);
    final Section d20 = PubNumberingUtilTest.PUB.createSection();
    d11.getDivisions().add(d20);
    final Subsection d30 = PubNumberingUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = this.createTitledTable("t30");
    d30.getContents().add(t30);
    final Subsubsection d40 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = this.createTitledTable("t41");
    d41.getContents().add(t41);
    final Section d21 = PubNumberingUtilTest.PUB.createSection();
    d11.getDivisions().add(d21);
    final TitledTable t21 = this.createTitledTable("t21");
    d21.getContents().add(t21);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    this._pubNumberingUtil.gatherAllTablesInSequenceAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, t00.getSequenceNumber());
    Assertions.assertEquals((-1), t00.getSequenceNumberInChapter());
    Assertions.assertEquals(1, t10.getSequenceNumber());
    Assertions.assertEquals(0, t10.getSequenceNumberInChapter());
    Assertions.assertEquals(2, t11.getSequenceNumber());
    Assertions.assertEquals(0, t11.getSequenceNumberInChapter());
    Assertions.assertEquals(3, t30.getSequenceNumber());
    Assertions.assertEquals(1, t30.getSequenceNumberInChapter());
    Assertions.assertEquals(4, t41.getSequenceNumber());
    Assertions.assertEquals(2, t41.getSequenceNumberInChapter());
    Assertions.assertEquals(5, t21.getSequenceNumber());
    Assertions.assertEquals(3, t21.getSequenceNumberInChapter());
    final PublicationClass pPubClass = PubNumberingUtilTest.PROTO.createPublicationClass();
    compo.setPublicationClass(pPubClass);
    Assertions.assertEquals("1", this._pubNumberingUtil.tieredNumber(t00));
    Assertions.assertEquals("1.1", this._pubNumberingUtil.tieredNumber(t10));
    Assertions.assertEquals("2.1", this._pubNumberingUtil.tieredNumber(t11));
    Assertions.assertEquals("2.2", this._pubNumberingUtil.tieredNumber(t30));
    Assertions.assertEquals("2.3", this._pubNumberingUtil.tieredNumber(t41));
    Assertions.assertEquals("2.4", this._pubNumberingUtil.tieredNumber(t21));
  }
  
  @Test
  public void testTitledBlockSequenceNumberWithoutPart() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d10 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d10);
    final TitledTable t10 = this.createTitledTable("t10");
    d10.getContents().add(t10);
    final Chapter d11 = PubNumberingUtilTest.PUB.createChapter();
    body.getDivisions().add(d11);
    final TitledTable t11 = this.createTitledTable("t11");
    d11.getContents().add(t11);
    final Section d20 = PubNumberingUtilTest.PUB.createSection();
    d11.getDivisions().add(d20);
    final Subsection d30 = PubNumberingUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = this.createTitledTable("t30");
    d30.getContents().add(t30);
    final Subsubsection d40 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = this.createTitledTable("t41");
    d41.getContents().add(t41);
    final Section d21 = PubNumberingUtilTest.PUB.createSection();
    d11.getDivisions().add(d21);
    final TitledTable t21 = this.createTitledTable("t21");
    d21.getContents().add(t21);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    this._pubNumberingUtil.gatherAllTablesInSequenceAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, t10.getSequenceNumber());
    Assertions.assertEquals(0, t10.getSequenceNumberInChapter());
    Assertions.assertEquals(1, t11.getSequenceNumber());
    Assertions.assertEquals(0, t11.getSequenceNumberInChapter());
    Assertions.assertEquals(2, t30.getSequenceNumber());
    Assertions.assertEquals(1, t30.getSequenceNumberInChapter());
    Assertions.assertEquals(3, t41.getSequenceNumber());
    Assertions.assertEquals(2, t41.getSequenceNumberInChapter());
    Assertions.assertEquals(4, t21.getSequenceNumber());
    Assertions.assertEquals(3, t21.getSequenceNumberInChapter());
    final PublicationClass pPubClass = PubNumberingUtilTest.PROTO.createPublicationClass();
    compo.setPublicationClass(pPubClass);
    Assertions.assertEquals("1.1", this._pubNumberingUtil.tieredNumber(t10));
    Assertions.assertEquals("2.1", this._pubNumberingUtil.tieredNumber(t11));
    Assertions.assertEquals("2.2", this._pubNumberingUtil.tieredNumber(t30));
    Assertions.assertEquals("2.3", this._pubNumberingUtil.tieredNumber(t41));
    Assertions.assertEquals("2.4", this._pubNumberingUtil.tieredNumber(t21));
  }
  
  @Test
  public void testTitledBlockSequenceNumberWithoutChapter() {
    final Component compo = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody body = PubNumberingUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Section d20 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d20);
    final Subsection d30 = PubNumberingUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = this.createTitledTable("t30");
    d30.getContents().add(t30);
    final Subsubsection d40 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubNumberingUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = this.createTitledTable("t41");
    d41.getContents().add(t41);
    final Section d21 = PubNumberingUtilTest.PUB.createSection();
    body.getDivisions().add(d21);
    final TitledTable t21 = this.createTitledTable("t21");
    d21.getContents().add(t21);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    this._pubNumberingUtil.gatherAllTablesInSequenceAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, t30.getSequenceNumber());
    Assertions.assertEquals((-1), t30.getSequenceNumberInChapter());
    Assertions.assertEquals(1, t41.getSequenceNumber());
    Assertions.assertEquals((-1), t41.getSequenceNumberInChapter());
    Assertions.assertEquals(2, t21.getSequenceNumber());
    Assertions.assertEquals((-1), t21.getSequenceNumberInChapter());
    final PublicationClass pPubClass = PubNumberingUtilTest.PROTO.createPublicationClass();
    compo.setPublicationClass(pPubClass);
    Assertions.assertEquals("1", this._pubNumberingUtil.tieredNumber(t30));
    Assertions.assertEquals("2", this._pubNumberingUtil.tieredNumber(t41));
    Assertions.assertEquals("3", this._pubNumberingUtil.tieredNumber(t21));
  }
  
  @Test
  public void testTitledBlockSequenceNumberWithInclude() {
    final Component a = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody abody = PubNumberingUtilTest.PUB.createPublicationBody();
    a.getSegments().add(abody);
    final Chapter a00 = PubNumberingUtilTest.PUB.createChapter();
    abody.getDivisions().add(a00);
    final TitledTable ta00 = this.createTitledTable("ta00");
    a00.getContents().add(ta00);
    final Section a000 = PubNumberingUtilTest.PUB.createSection();
    a00.getDivisions().add(a000);
    final TitledTable ta000 = this.createTitledTable("ta000");
    a000.getContents().add(ta000);
    final Component b = PubNumberingUtilTest.PUB.createComponent();
    final PublicationBody bbody = PubNumberingUtilTest.PUB.createPublicationBody();
    b.getSegments().add(bbody);
    final Part b00 = PubNumberingUtilTest.PUB.createPart();
    bbody.getDivisions().add(b00);
    final TitledTable tb00 = this.createTitledTable("tb00");
    b00.getContents().add(tb00);
    final Chapter b10 = PubNumberingUtilTest.PUB.createChapter();
    b00.getDivisions().add(b10);
    final TitledTable tb10 = this.createTitledTable("tb10");
    b10.getContents().add(tb10);
    final Section b20 = PubNumberingUtilTest.PUB.createSection();
    b10.getDivisions().add(b20);
    final TitledTable tb20 = this.createTitledTable("tb20");
    b10.getContents().add(tb20);
    final Chapter b11 = PubNumberingUtilTest.PUB.createChapter();
    b00.getDivisions().add(b11);
    final TitledTable tb11 = this.createTitledTable("tb11");
    b11.getContents().add(tb11);
    final Section b21 = PubNumberingUtilTest.PUB.createSection();
    b11.getDivisions().add(b21);
    b21.setInclude(a000);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(b);
    this._pubNumberingUtil.gatherAllTablesInSequenceAndSetSequenceNumbers(b);
    Assertions.assertEquals(0, tb00.getSequenceNumber());
    Assertions.assertEquals((-1), tb00.getSequenceNumberInChapter());
    Assertions.assertEquals(1, tb10.getSequenceNumber());
    Assertions.assertEquals(0, tb10.getSequenceNumberInChapter());
    Assertions.assertEquals(2, tb20.getSequenceNumber());
    Assertions.assertEquals(1, tb20.getSequenceNumberInChapter());
    Assertions.assertEquals(3, tb11.getSequenceNumber());
    Assertions.assertEquals(0, tb11.getSequenceNumberInChapter());
    Assertions.assertEquals(4, ta000.getSequenceNumber());
    Assertions.assertEquals(1, ta000.getSequenceNumberInChapter());
    Assertions.assertEquals((-1), ta00.getSequenceNumber());
    Assertions.assertEquals((-1), ta00.getSequenceNumberInChapter());
    final PublicationClass pPubClass = PubNumberingUtilTest.PROTO.createPublicationClass();
    b.setPublicationClass(pPubClass);
    Assertions.assertEquals("1", this._pubNumberingUtil.tieredNumber(tb00));
    Assertions.assertEquals("1.1", this._pubNumberingUtil.tieredNumber(tb10));
    Assertions.assertEquals("1.2", this._pubNumberingUtil.tieredNumber(tb20));
    Assertions.assertEquals("2.1", this._pubNumberingUtil.tieredNumber(tb11));
    Assertions.assertEquals("2.2", this._pubNumberingUtil.tieredNumber(ta000));
  }
  
  protected TitledTable createTitledTable(final String title) {
    final TitledTable t = PubNumberingUtilTest.PUB.createTitledTable();
    t.setTitle(this._richTextUtil.toRichText(title));
    return t;
  }
}
