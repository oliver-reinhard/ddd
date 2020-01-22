package com.mimacom.ddd.pub.pub.tests;

import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class PubModelTest {
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Test
  public void testLevelsWithPart() {
    final Component compo = PubModelTest.PUB.createComponent();
    final PublicationBody body = PubModelTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d0 = PubModelTest.PUB.createPart();
    body.getDivisions().add(d0);
    final Chapter d1 = PubModelTest.PUB.createChapter();
    d0.getSubdivisions().add(d1);
    final Section d2 = PubModelTest.PUB.createSection();
    d1.getSubdivisions().add(d2);
    final Subsection d3 = PubModelTest.PUB.createSubsection();
    d2.getSubdivisions().add(d3);
    final Subsubsection d4 = PubModelTest.PUB.createSubsubsection();
    d3.getSubdivisions().add(d4);
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
    d0.getSubdivisions().add(d1);
    final Subsection d2 = PubModelTest.PUB.createSubsection();
    d1.getSubdivisions().add(d2);
    final Subsubsection d3 = PubModelTest.PUB.createSubsubsection();
    d2.getSubdivisions().add(d3);
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
    d00.getSubdivisions().add(d10);
    final Chapter d11 = PubModelTest.PUB.createChapter();
    d00.getSubdivisions().add(d11);
    final Section d20 = PubModelTest.PUB.createSection();
    d10.getSubdivisions().add(d20);
    final Section d21 = PubModelTest.PUB.createSection();
    d10.getSubdivisions().add(d21);
    final Subsection d30 = PubModelTest.PUB.createSubsection();
    d20.getSubdivisions().add(d30);
    final Subsection d31 = PubModelTest.PUB.createSubsection();
    d20.getSubdivisions().add(d31);
    final Subsubsection d40 = PubModelTest.PUB.createSubsubsection();
    d30.getSubdivisions().add(d40);
    final Subsubsection d41 = PubModelTest.PUB.createSubsubsection();
    d30.getSubdivisions().add(d41);
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
    d00.getSubdivisions().add(d10);
    final Section d11 = PubModelTest.PUB.createSection();
    d00.getSubdivisions().add(d11);
    final Subsection d20 = PubModelTest.PUB.createSubsection();
    d10.getSubdivisions().add(d20);
    final Subsection d21 = PubModelTest.PUB.createSubsection();
    d10.getSubdivisions().add(d21);
    final Subsubsection d30 = PubModelTest.PUB.createSubsubsection();
    d20.getSubdivisions().add(d30);
    final Subsubsection d31 = PubModelTest.PUB.createSubsubsection();
    d20.getSubdivisions().add(d31);
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
    d0.getSubdivisions().add(d00);
    final Chapter d01 = PubModelTest.PUB.createChapter();
    d0.getSubdivisions().add(d01);
    final Chapter d10 = PubModelTest.PUB.createChapter();
    d1.getSubdivisions().add(d10);
    final Chapter d11 = PubModelTest.PUB.createChapter();
    d1.getSubdivisions().add(d11);
    final Section d000 = PubModelTest.PUB.createSection();
    d00.getSubdivisions().add(d000);
    final Section d001 = PubModelTest.PUB.createSection();
    d00.getSubdivisions().add(d001);
    final Section d010 = PubModelTest.PUB.createSection();
    d01.getSubdivisions().add(d010);
    final Section d011 = PubModelTest.PUB.createSection();
    d01.getSubdivisions().add(d011);
    final Section d100 = PubModelTest.PUB.createSection();
    d10.getSubdivisions().add(d100);
    final Section d101 = PubModelTest.PUB.createSection();
    d10.getSubdivisions().add(d101);
    final Section d110 = PubModelTest.PUB.createSection();
    d11.getSubdivisions().add(d110);
    final Section d111 = PubModelTest.PUB.createSection();
    d11.getSubdivisions().add(d111);
    final Subsection d0000 = PubModelTest.PUB.createSubsection();
    d000.getSubdivisions().add(d0000);
    final Subsection d1110 = PubModelTest.PUB.createSubsection();
    d111.getSubdivisions().add(d1110);
    final Subsection d1111 = PubModelTest.PUB.createSubsection();
    d111.getSubdivisions().add(d1111);
    final Subsubsection d11100 = PubModelTest.PUB.createSubsubsection();
    d1110.getSubdivisions().add(d11100);
    final Subsubsection d11101 = PubModelTest.PUB.createSubsubsection();
    d1110.getSubdivisions().add(d11101);
    Assertions.assertEquals("0", d0.getId());
    Assertions.assertEquals("1", d1.getId());
    Assertions.assertEquals("0-0", d00.getId());
    Assertions.assertEquals("0-1", d01.getId());
    Assertions.assertEquals("1-0", d10.getId());
    Assertions.assertEquals("1-1", d11.getId());
    Assertions.assertEquals("0-0-0", d000.getId());
    Assertions.assertEquals("0-0-1", d001.getId());
    Assertions.assertEquals("0-1-0", d010.getId());
    Assertions.assertEquals("0-1-1", d011.getId());
    Assertions.assertEquals("1-0-0", d100.getId());
    Assertions.assertEquals("1-0-1", d101.getId());
    Assertions.assertEquals("1-1-0", d110.getId());
    Assertions.assertEquals("1-1-1", d111.getId());
    Assertions.assertEquals("0-0-0-0", d0000.getId());
    Assertions.assertEquals("1-1-1-0", d1110.getId());
    Assertions.assertEquals("1-1-1-1", d1111.getId());
    Assertions.assertEquals("1-1-1-0-0", d11100.getId());
    Assertions.assertEquals("1-1-1-0-1", d11101.getId());
    d111.setName("a");
    Assertions.assertEquals("a", d111.getId());
    Assertions.assertEquals("1-1-1-1", d1110.getId());
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
    d0.getSubdivisions().add(d00);
    final Section d01 = PubModelTest.PUB.createSection();
    d0.getSubdivisions().add(d01);
    final Section d10 = PubModelTest.PUB.createSection();
    d1.getSubdivisions().add(d10);
    final Section d11 = PubModelTest.PUB.createSection();
    d1.getSubdivisions().add(d11);
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
    final Table t00 = PubModelTest.PUB.createTable();
    t00.setSequenceNumber(0);
    d00.getContents().add(t00);
    final Chapter d10 = PubModelTest.PUB.createChapter();
    d00.getSubdivisions().add(d10);
    final Chapter d11 = PubModelTest.PUB.createChapter();
    d00.getSubdivisions().add(d11);
    final Table t11 = PubModelTest.PUB.createTable();
    t11.setSequenceNumber(1);
    d11.getContents().add(t11);
    final Section d20 = PubModelTest.PUB.createSection();
    d10.getSubdivisions().add(d20);
    final Section d21 = PubModelTest.PUB.createSection();
    d10.getSubdivisions().add(d21);
    final Table t21 = PubModelTest.PUB.createTable();
    t21.setSequenceNumber(2);
    d21.getContents().add(t21);
    final Subsection d30 = PubModelTest.PUB.createSubsection();
    d20.getSubdivisions().add(d30);
    final Table t30 = PubModelTest.PUB.createTable();
    t30.setSequenceNumber(3);
    d30.getContents().add(t30);
    final Subsubsection d40 = PubModelTest.PUB.createSubsubsection();
    d30.getSubdivisions().add(d40);
    final Subsubsection d41 = PubModelTest.PUB.createSubsubsection();
    d30.getSubdivisions().add(d41);
    final Table t41 = PubModelTest.PUB.createTable();
    t41.setSequenceNumber(4);
    d41.getContents().add(t41);
    Assertions.assertEquals("table-0", t00.getId());
    Assertions.assertEquals("table-1", t11.getId());
    Assertions.assertEquals("table-2", t21.getId());
    Assertions.assertEquals("table-3", t30.getId());
    Assertions.assertEquals("table-4", t41.getId());
    t11.setName("a");
    Assertions.assertEquals("a", t11.getId());
    final Table t41a = PubModelTest.PUB.createTable();
    d41.getContents().add(t41);
    int _hashCode = t41a.hashCode();
    String _plus = ("table-" + Integer.valueOf(_hashCode));
    Assertions.assertEquals(_plus, t41a.getId());
  }
}
