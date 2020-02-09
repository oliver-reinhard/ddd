package com.mimacom.ddd.pub.pub.tests;

import com.google.inject.Inject;
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
class PubModelTest {
  @Inject
  @Extension
  private PubNumberingUtil _pubNumberingUtil;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Test
  public void testLevelsWithPart() {
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d0 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d0);
    final Chapter d1 = PubModelTest.PUB.createChapter();
    d0.getDivisions().add(d1);
    final Section d2 = PubModelTest.PUB.createSection();
    d1.getDivisions().add(d2);
    final Subsection d3 = PubModelTest.PUB.createSubsection();
    d2.getDivisions().add(d3);
    final Subsubsection d4 = PubModelTest.PUB.createSubsubsection();
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
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d0 = PubModelTest.PUB.createChapter();
    body.getDivisions().add(d0);
    final Section d1 = PubModelTest.PUB.createSection();
    d0.getDivisions().add(d1);
    final Subsection d2 = PubModelTest.PUB.createSubsection();
    d1.getDivisions().add(d2);
    final Subsubsection d3 = PubModelTest.PUB.createSubsubsection();
    d2.getDivisions().add(d3);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d0.getLevel());
    Assertions.assertEquals(1, d1.getLevel());
    Assertions.assertEquals(2, d2.getLevel());
    Assertions.assertEquals(3, d3.getLevel());
  }
  
  @Test
  public void testSequenceNumberWithPart() {
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d00);
    final Part d01 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d01);
    final Chapter d10 = PubModelTest.PUB.createChapter();
    d00.getDivisions().add(d10);
    final Chapter d11 = PubModelTest.PUB.createChapter();
    d00.getDivisions().add(d11);
    final Section d20 = PubModelTest.PUB.createSection();
    d10.getDivisions().add(d20);
    final Section d21 = PubModelTest.PUB.createSection();
    d10.getDivisions().add(d21);
    final Subsection d30 = PubModelTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final Subsection d31 = PubModelTest.PUB.createSubsection();
    d20.getDivisions().add(d31);
    final Subsubsection d40 = PubModelTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubModelTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d00.getSequenceNumber());
    Assertions.assertEquals(1, d01.getSequenceNumber());
    Assertions.assertEquals(0, d10.getSequenceNumber());
    Assertions.assertEquals(1, d11.getSequenceNumber());
    Assertions.assertEquals(0, d20.getSequenceNumber());
    Assertions.assertEquals(1, d21.getSequenceNumber());
    Assertions.assertEquals(0, d30.getSequenceNumber());
    Assertions.assertEquals(1, d31.getSequenceNumber());
    Assertions.assertEquals(0, d40.getSequenceNumber());
    Assertions.assertEquals(1, d41.getSequenceNumber());
  }
  
  @Test
  public void testSequenceNumberWithoutPart() {
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d00 = PubModelTest.PUB.createChapter();
    body.getDivisions().add(d00);
    final Chapter d01 = PubModelTest.PUB.createChapter();
    body.getDivisions().add(d01);
    final Section d10 = PubModelTest.PUB.createSection();
    d00.getDivisions().add(d10);
    final Section d11 = PubModelTest.PUB.createSection();
    d00.getDivisions().add(d11);
    final Subsection d20 = PubModelTest.PUB.createSubsection();
    d10.getDivisions().add(d20);
    final Subsection d21 = PubModelTest.PUB.createSubsection();
    d10.getDivisions().add(d21);
    final Subsubsection d30 = PubModelTest.PUB.createSubsubsection();
    d20.getDivisions().add(d30);
    final Subsubsection d31 = PubModelTest.PUB.createSubsubsection();
    d20.getDivisions().add(d31);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals(0, d00.getSequenceNumber());
    Assertions.assertEquals(1, d01.getSequenceNumber());
    Assertions.assertEquals(0, d10.getSequenceNumber());
    Assertions.assertEquals(1, d11.getSequenceNumber());
    Assertions.assertEquals(0, d20.getSequenceNumber());
    Assertions.assertEquals(1, d21.getSequenceNumber());
    Assertions.assertEquals(0, d30.getSequenceNumber());
    Assertions.assertEquals(1, d31.getSequenceNumber());
  }
  
  @Test
  public void testDivisionIdWithPart() {
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d0 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d0);
    final Part d1 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d1);
    final Chapter d00 = PubModelTest.PUB.createChapter();
    d0.getDivisions().add(d00);
    final Chapter d01 = PubModelTest.PUB.createChapter();
    d0.getDivisions().add(d01);
    final Chapter d10 = PubModelTest.PUB.createChapter();
    d1.getDivisions().add(d10);
    final Chapter d11 = PubModelTest.PUB.createChapter();
    d1.getDivisions().add(d11);
    final Section d000 = PubModelTest.PUB.createSection();
    d00.getDivisions().add(d000);
    final Section d001 = PubModelTest.PUB.createSection();
    d00.getDivisions().add(d001);
    final Section d010 = PubModelTest.PUB.createSection();
    d01.getDivisions().add(d010);
    final Section d011 = PubModelTest.PUB.createSection();
    d01.getDivisions().add(d011);
    final Section d100 = PubModelTest.PUB.createSection();
    d10.getDivisions().add(d100);
    final Section d101 = PubModelTest.PUB.createSection();
    d10.getDivisions().add(d101);
    final Section d110 = PubModelTest.PUB.createSection();
    d11.getDivisions().add(d110);
    final Section d111 = PubModelTest.PUB.createSection();
    d11.getDivisions().add(d111);
    final Subsection d0000 = PubModelTest.PUB.createSubsection();
    d000.getDivisions().add(d0000);
    final Subsection d1110 = PubModelTest.PUB.createSubsection();
    d111.getDivisions().add(d1110);
    final Subsection d1111 = PubModelTest.PUB.createSubsection();
    d111.getDivisions().add(d1111);
    final Subsubsection d11100 = PubModelTest.PUB.createSubsubsection();
    d1110.getDivisions().add(d11100);
    final Subsubsection d11101 = PubModelTest.PUB.createSubsubsection();
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
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Chapter d0 = PubModelTest.PUB.createChapter();
    body.getDivisions().add(d0);
    final Chapter d1 = PubModelTest.PUB.createChapter();
    body.getDivisions().add(d1);
    final Section d00 = PubModelTest.PUB.createSection();
    d0.getDivisions().add(d00);
    final Section d01 = PubModelTest.PUB.createSection();
    d0.getDivisions().add(d01);
    final Section d10 = PubModelTest.PUB.createSection();
    d1.getDivisions().add(d10);
    final Section d11 = PubModelTest.PUB.createSection();
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
  public void testTitledBlockId() {
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d00);
    final TitledTable t00 = PubModelTest.PUB.createTitledTable();
    t00.setSequenceNumber(0);
    d00.getContents().add(t00);
    final Chapter d10 = PubModelTest.PUB.createChapter();
    d00.getDivisions().add(d10);
    final Chapter d11 = PubModelTest.PUB.createChapter();
    d00.getDivisions().add(d11);
    final TitledTable t11 = PubModelTest.PUB.createTitledTable();
    t11.setSequenceNumber(1);
    d11.getContents().add(t11);
    final Section d20 = PubModelTest.PUB.createSection();
    d10.getDivisions().add(d20);
    final Section d21 = PubModelTest.PUB.createSection();
    d10.getDivisions().add(d21);
    final TitledTable t21 = PubModelTest.PUB.createTitledTable();
    t21.setSequenceNumber(2);
    d21.getContents().add(t21);
    final Subsection d30 = PubModelTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final TitledTable t30 = PubModelTest.PUB.createTitledTable();
    t30.setSequenceNumber(3);
    d30.getContents().add(t30);
    final Subsubsection d40 = PubModelTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    final Subsubsection d41 = PubModelTest.PUB.createSubsubsection();
    d30.getDivisions().add(d41);
    final TitledTable t41 = PubModelTest.PUB.createTitledTable();
    t41.setSequenceNumber(4);
    d41.getContents().add(t41);
    this._pubNumberingUtil.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals("table-0", t00.getId());
    Assertions.assertEquals("table-1", t11.getId());
    Assertions.assertEquals("table-2", t21.getId());
    Assertions.assertEquals("table-3", t30.getId());
    Assertions.assertEquals("table-4", t41.getId());
    t11.setName("a");
    Assertions.assertEquals("a", t11.getId());
    final TitledTable t41a = PubModelTest.PUB.createTitledTable();
    d41.getContents().add(t41);
    int _hashCode = t41a.hashCode();
    String _plus = ("table-" + Integer.valueOf(_hashCode));
    Assertions.assertEquals(_plus, t41a.getId());
  }
}
