package com.mimacom.ddd.pub.pub.tests;

import com.mimacom.ddd.pub.proto.ProtoAbstract;
import com.mimacom.ddd.pub.proto.ProtoChapter;
import com.mimacom.ddd.pub.proto.ProtoFactory;
import com.mimacom.ddd.pub.proto.ProtoPart;
import com.mimacom.ddd.pub.proto.ProtoSection;
import com.mimacom.ddd.pub.proto.ProtoSequenceNumberStyle;
import com.mimacom.ddd.pub.proto.ProtoSubsection;
import com.mimacom.ddd.pub.proto.ProtoSubsubsection;
import com.mimacom.ddd.pub.proto.ProtoTOC;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.PubFactory;
import com.mimacom.ddd.pub.pub.PubUtil;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.TOC;
<<<<<<< HEAD
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class PubUtilTest {
  private static final PubUtil UTIL = new PubUtil();
  
  private static final PubNumberingUtil NUM = new PubNumberingUtil();
  
  private static final ProtoFactory PROTO = ProtoFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Test
  public void testSegmentPrototypeMapping() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoAbstract pAbstract = PubUtilTest.PROTO.createProtoAbstract();
    final ProtoTOC pTOC = PubUtilTest.PROTO.createProtoTOC();
    pPubClass.getSegments().add(pAbstract);
    pPubClass.getSegments().add(pTOC);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final TOC toc = PubUtilTest.PUB.createTOC();
    compo.getSegments().add(toc);
    Assertions.assertEquals(pTOC, PubUtilTest.UTIL.prototype(toc));
  }
  
  @Test
  public void testDivisionPrototypeMapping() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoChapter pChapter = PubUtilTest.PROTO.createProtoChapter();
    final ProtoSection pSection = PubUtilTest.PROTO.createProtoSection();
    pPubClass.getDivisions().add(pChapter);
    pPubClass.getDivisions().add(pSection);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final PublicationBody body = PubUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part p = PubUtilTest.PUB.createPart();
    body.getDivisions().add(p);
    final Chapter ch = PubUtilTest.PUB.createChapter();
    p.getDivisions().add(ch);
    final Section s = PubUtilTest.PUB.createSection();
    ch.getDivisions().add(s);
    Assertions.assertEquals(pChapter, PubUtilTest.UTIL.prototype(ch));
    Assertions.assertEquals(pSection, PubUtilTest.UTIL.prototype(s));
  }
  
  @Test
  public void testRomanNumbering() {
    Assertions.assertEquals("--", PubUtilTest.NUM.toRoman((-1)));
    Assertions.assertEquals("--", PubUtilTest.NUM.toRoman(0));
    Assertions.assertEquals("I", PubUtilTest.NUM.toRoman(1));
    Assertions.assertEquals("IX", PubUtilTest.NUM.toRoman(9));
    Assertions.assertEquals("X", PubUtilTest.NUM.toRoman(10));
    Assertions.assertEquals("XI", PubUtilTest.NUM.toRoman(11));
    Assertions.assertEquals("XLIX", PubUtilTest.NUM.toRoman(49));
    Assertions.assertEquals("XCIX", PubUtilTest.NUM.toRoman(99));
    Assertions.assertEquals("XXII", PubUtilTest.NUM.toRoman(122));
  }
  
  @Test
  public void testLetterNumbering() {
    Assertions.assertEquals("--", PubUtilTest.NUM.toLetter((-1)));
    Assertions.assertEquals("A", PubUtilTest.NUM.toLetter(1));
    Assertions.assertEquals("E", PubUtilTest.NUM.toLetter(5));
    Assertions.assertEquals("Z", PubUtilTest.NUM.toLetter(26));
    Assertions.assertEquals("AA", PubUtilTest.NUM.toLetter(27));
    Assertions.assertEquals("AE", PubUtilTest.NUM.toLetter(31));
    Assertions.assertEquals("ZZ", PubUtilTest.NUM.toLetter(702));
    Assertions.assertEquals("A", PubUtilTest.NUM.toLetter(703));
    Assertions.assertEquals("Z", PubUtilTest.NUM.toLetter(728));
  }
  
  @Test
  public void testFormattedDivisionNumberWithPart() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoPart pPart = PubUtilTest.PROTO.createProtoPart();
    pPubClass.getDivisions().add(pPart);
    pPart.setNumberingStyle(ProtoSequenceNumberStyle.CAPITAL_ROMAN);
    final ProtoChapter pChapter = PubUtilTest.PROTO.createProtoChapter();
    pPubClass.getDivisions().add(pChapter);
    pChapter.setNumberingStyle(ProtoSequenceNumberStyle.ARABIC);
    final ProtoSection pSection = PubUtilTest.PROTO.createProtoSection();
    pPubClass.getDivisions().add(pSection);
    pSection.setNumberingStyle(ProtoSequenceNumberStyle.CAPITAL_LETTER);
    final ProtoSubsection pSub = PubUtilTest.PROTO.createProtoSubsection();
    pPubClass.getDivisions().add(pSub);
    pSub.setNumberingStyle(ProtoSequenceNumberStyle.SMALL_LETTER);
    final ProtoSubsubsection pSubsub = PubUtilTest.PROTO.createProtoSubsubsection();
    pPubClass.getDivisions().add(pSubsub);
    pSubsub.setNumberingStyle(ProtoSequenceNumberStyle.NONE);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final PublicationBody body = PubUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubUtilTest.PUB.createPart();
    body.getDivisions().add(d00);
    final Chapter d10 = PubUtilTest.PUB.createChapter();
    d00.getDivisions().add(d10);
    final Section d20 = PubUtilTest.PUB.createSection();
    d10.getDivisions().add(d20);
    final Subsection d30 = PubUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final Subsubsection d40 = PubUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    Assertions.assertEquals("I", PubUtilTest.NUM.formattedSingleNumber(d00));
    Assertions.assertEquals("1", PubUtilTest.NUM.formattedSingleNumber(d10));
    Assertions.assertEquals("A", PubUtilTest.NUM.formattedSingleNumber(d20));
    Assertions.assertEquals("a", PubUtilTest.NUM.formattedSingleNumber(d30));
    Assertions.assertEquals("", PubUtilTest.NUM.formattedSingleNumber(d40));
    Assertions.assertEquals("I", PubUtilTest.NUM.tieredNumber(d00));
    Assertions.assertEquals("1", PubUtilTest.NUM.tieredNumber(d10));
    Assertions.assertEquals("1.A", PubUtilTest.NUM.tieredNumber(d20));
    Assertions.assertEquals("1.A.a", PubUtilTest.NUM.tieredNumber(d30));
    Assertions.assertEquals("", PubUtilTest.NUM.tieredNumber(d40));
=======
<<<<<<< HEAD
import com.mimacom.ddd.pub.pub.generator.PubNumberingUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class PubUtilTest {
  private static final PubUtil UTIL = new PubUtil();
  
  private static final PubNumberingUtil NUM = new PubNumberingUtil();
  
  private static final ProtoFactory PROTO = ProtoFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Test
  public void testSegmentPrototypeMapping() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoAbstract pAbstract = PubUtilTest.PROTO.createProtoAbstract();
    final ProtoTOC pTOC = PubUtilTest.PROTO.createProtoTOC();
    pPubClass.getSegments().add(pAbstract);
    pPubClass.getSegments().add(pTOC);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final TOC toc = PubUtilTest.PUB.createTOC();
    compo.getSegments().add(toc);
    Assertions.assertEquals(pTOC, PubUtilTest.UTIL.prototype(toc));
  }
  
  @Test
  public void testDivisionPrototypeMapping() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoChapter pChapter = PubUtilTest.PROTO.createProtoChapter();
    final ProtoSection pSection = PubUtilTest.PROTO.createProtoSection();
    pPubClass.getDivisions().add(pChapter);
    pPubClass.getDivisions().add(pSection);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final PublicationBody body = PubUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part p = PubUtilTest.PUB.createPart();
    body.getDivisions().add(p);
    final Chapter ch = PubUtilTest.PUB.createChapter();
    p.getDivisions().add(ch);
    final Section s = PubUtilTest.PUB.createSection();
    ch.getDivisions().add(s);
    Assertions.assertEquals(pChapter, PubUtilTest.UTIL.prototype(ch));
    Assertions.assertEquals(pSection, PubUtilTest.UTIL.prototype(s));
  }
  
  @Test
  public void testRomanNumbering() {
    Assertions.assertEquals("--", PubUtilTest.NUM.toRoman((-1)));
    Assertions.assertEquals("--", PubUtilTest.NUM.toRoman(0));
    Assertions.assertEquals("I", PubUtilTest.NUM.toRoman(1));
    Assertions.assertEquals("IX", PubUtilTest.NUM.toRoman(9));
    Assertions.assertEquals("X", PubUtilTest.NUM.toRoman(10));
    Assertions.assertEquals("XI", PubUtilTest.NUM.toRoman(11));
    Assertions.assertEquals("XLIX", PubUtilTest.NUM.toRoman(49));
    Assertions.assertEquals("XCIX", PubUtilTest.NUM.toRoman(99));
    Assertions.assertEquals("XXII", PubUtilTest.NUM.toRoman(122));
  }
  
  @Test
  public void testLetterNumbering() {
    Assertions.assertEquals("--", PubUtilTest.NUM.toLetter((-1)));
    Assertions.assertEquals("A", PubUtilTest.NUM.toLetter(1));
    Assertions.assertEquals("E", PubUtilTest.NUM.toLetter(5));
    Assertions.assertEquals("Z", PubUtilTest.NUM.toLetter(26));
    Assertions.assertEquals("AA", PubUtilTest.NUM.toLetter(27));
    Assertions.assertEquals("AE", PubUtilTest.NUM.toLetter(31));
    Assertions.assertEquals("ZZ", PubUtilTest.NUM.toLetter(702));
    Assertions.assertEquals("A", PubUtilTest.NUM.toLetter(703));
    Assertions.assertEquals("Z", PubUtilTest.NUM.toLetter(728));
  }
  
  @Test
  public void testFormattedDivisionNumberWithPart() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoPart pPart = PubUtilTest.PROTO.createProtoPart();
    pPubClass.getDivisions().add(pPart);
    pPart.setNumberingStyle(ProtoSequenceNumberStyle.CAPITAL_ROMAN);
    final ProtoChapter pChapter = PubUtilTest.PROTO.createProtoChapter();
    pPubClass.getDivisions().add(pChapter);
    pChapter.setNumberingStyle(ProtoSequenceNumberStyle.ARABIC);
    final ProtoSection pSection = PubUtilTest.PROTO.createProtoSection();
    pPubClass.getDivisions().add(pSection);
    pSection.setNumberingStyle(ProtoSequenceNumberStyle.CAPITAL_LETTER);
    final ProtoSubsection pSub = PubUtilTest.PROTO.createProtoSubsection();
    pPubClass.getDivisions().add(pSub);
    pSub.setNumberingStyle(ProtoSequenceNumberStyle.SMALL_LETTER);
    final ProtoSubsubsection pSubsub = PubUtilTest.PROTO.createProtoSubsubsection();
    pPubClass.getDivisions().add(pSubsub);
    pSubsub.setNumberingStyle(ProtoSequenceNumberStyle.NONE);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final PublicationBody body = PubUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubUtilTest.PUB.createPart();
    body.getDivisions().add(d00);
    final Chapter d10 = PubUtilTest.PUB.createChapter();
    d00.getDivisions().add(d10);
    final Section d20 = PubUtilTest.PUB.createSection();
    d10.getDivisions().add(d20);
    final Subsection d30 = PubUtilTest.PUB.createSubsection();
    d20.getDivisions().add(d30);
    final Subsubsection d40 = PubUtilTest.PUB.createSubsubsection();
    d30.getDivisions().add(d40);
    Assertions.assertEquals("I", PubUtilTest.NUM.formattedSingleNumber(d00));
    Assertions.assertEquals("1", PubUtilTest.NUM.formattedSingleNumber(d10));
    Assertions.assertEquals("A", PubUtilTest.NUM.formattedSingleNumber(d20));
    Assertions.assertEquals("a", PubUtilTest.NUM.formattedSingleNumber(d30));
    Assertions.assertEquals("", PubUtilTest.NUM.formattedSingleNumber(d40));
    Assertions.assertEquals("I", PubUtilTest.NUM.tieredNumber(d00));
    Assertions.assertEquals("1", PubUtilTest.NUM.tieredNumber(d10));
    Assertions.assertEquals("1.A", PubUtilTest.NUM.tieredNumber(d20));
    Assertions.assertEquals("1.A.a", PubUtilTest.NUM.tieredNumber(d30));
    Assertions.assertEquals("", PubUtilTest.NUM.tieredNumber(d40));
=======
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class PubUtilTest {
  private static final PubUtil UTIL = new PubUtil();
  
  private static final ProtoFactory PROTO = ProtoFactory.eINSTANCE;
  
  private static final PubFactory PUB = PubFactory.eINSTANCE;
  
  @Test
  public void testSegmentPrototypeMapping() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoAbstract pAbstract = PubUtilTest.PROTO.createProtoAbstract();
    final ProtoTOC pTOC = PubUtilTest.PROTO.createProtoTOC();
    pPubClass.getSegments().add(pAbstract);
    pPubClass.getSegments().add(pTOC);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final TOC toc = PubUtilTest.PUB.createTOC();
    compo.getSegments().add(toc);
    Assertions.assertEquals(pTOC, PubUtilTest.UTIL.prototype(toc));
  }
  
  @Test
  public void testDivisionPrototypeMapping() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoChapter pChapter = PubUtilTest.PROTO.createProtoChapter();
    final ProtoSection pSection = PubUtilTest.PROTO.createProtoSection();
    pPubClass.getDivisions().add(pChapter);
    pPubClass.getDivisions().add(pSection);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final PublicationBody body = PubUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part p = PubUtilTest.PUB.createPart();
    body.getDivisions().add(p);
    final Chapter ch = PubUtilTest.PUB.createChapter();
    p.getSubdivisions().add(ch);
    final Section s = PubUtilTest.PUB.createSection();
    ch.getSubdivisions().add(s);
    Assertions.assertEquals(pChapter, PubUtilTest.UTIL.prototype(ch));
    Assertions.assertEquals(pSection, PubUtilTest.UTIL.prototype(s));
  }
  
  @Test
  public void testRomanNumbering() {
    Assertions.assertEquals("--", PubUtilTest.UTIL.toRoman((-1)));
    Assertions.assertEquals("--", PubUtilTest.UTIL.toRoman(0));
    Assertions.assertEquals("I", PubUtilTest.UTIL.toRoman(1));
    Assertions.assertEquals("IX", PubUtilTest.UTIL.toRoman(9));
    Assertions.assertEquals("X", PubUtilTest.UTIL.toRoman(10));
    Assertions.assertEquals("XI", PubUtilTest.UTIL.toRoman(11));
    Assertions.assertEquals("XLIX", PubUtilTest.UTIL.toRoman(49));
    Assertions.assertEquals("XCIX", PubUtilTest.UTIL.toRoman(99));
    Assertions.assertEquals("XXII", PubUtilTest.UTIL.toRoman(122));
  }
  
  @Test
  public void testLetterNumbering() {
    Assertions.assertEquals("--", PubUtilTest.UTIL.toLetter((-1)));
    Assertions.assertEquals("A", PubUtilTest.UTIL.toLetter(1));
    Assertions.assertEquals("E", PubUtilTest.UTIL.toLetter(5));
    Assertions.assertEquals("Z", PubUtilTest.UTIL.toLetter(26));
    Assertions.assertEquals("AA", PubUtilTest.UTIL.toLetter(27));
    Assertions.assertEquals("AE", PubUtilTest.UTIL.toLetter(31));
    Assertions.assertEquals("ZZ", PubUtilTest.UTIL.toLetter(702));
    Assertions.assertEquals("A", PubUtilTest.UTIL.toLetter(703));
    Assertions.assertEquals("Z", PubUtilTest.UTIL.toLetter(728));
  }
  
  @Test
  public void testFormattedDivisionNumberWithPart() {
    final PublicationClass pPubClass = PubUtilTest.PROTO.createPublicationClass();
    final ProtoPart pPart = PubUtilTest.PROTO.createProtoPart();
    pPubClass.getDivisions().add(pPart);
    pPart.setNumberingStyle(ProtoSequenceNumberStyle.CAPITAL_ROMAN);
    final ProtoChapter pChapter = PubUtilTest.PROTO.createProtoChapter();
    pPubClass.getDivisions().add(pChapter);
    pChapter.setNumberingStyle(ProtoSequenceNumberStyle.ARABIC);
    final ProtoSection pSection = PubUtilTest.PROTO.createProtoSection();
    pPubClass.getDivisions().add(pSection);
    pSection.setNumberingStyle(ProtoSequenceNumberStyle.CAPITAL_LETTER);
    final ProtoSubsection pSub = PubUtilTest.PROTO.createProtoSubsection();
    pPubClass.getDivisions().add(pSub);
    pSub.setNumberingStyle(ProtoSequenceNumberStyle.SMALL_LETTER);
    final ProtoSubsubsection pSubsub = PubUtilTest.PROTO.createProtoSubsubsection();
    pPubClass.getDivisions().add(pSubsub);
    pSubsub.setNumberingStyle(ProtoSequenceNumberStyle.NONE);
    final Component compo = PubUtilTest.PUB.createComponent();
    compo.setPublicationClass(pPubClass);
    final PublicationBody body = PubUtilTest.PUB.createPublicationBody();
    compo.getSegments().add(body);
    final Part d00 = PubUtilTest.PUB.createPart();
    body.getDivisions().add(d00);
    final Chapter d10 = PubUtilTest.PUB.createChapter();
    d00.getSubdivisions().add(d10);
    final Section d20 = PubUtilTest.PUB.createSection();
    d10.getSubdivisions().add(d20);
    final Subsection d30 = PubUtilTest.PUB.createSubsection();
    d20.getSubdivisions().add(d30);
    final Subsubsection d40 = PubUtilTest.PUB.createSubsubsection();
    d30.getSubdivisions().add(d40);
    Assertions.assertEquals("I", PubUtilTest.UTIL.formattedSingleNumber(d00));
    Assertions.assertEquals("1", PubUtilTest.UTIL.formattedSingleNumber(d10));
    Assertions.assertEquals("A", PubUtilTest.UTIL.formattedSingleNumber(d20));
    Assertions.assertEquals("a", PubUtilTest.UTIL.formattedSingleNumber(d30));
    Assertions.assertEquals("", PubUtilTest.UTIL.formattedSingleNumber(d40));
    Assertions.assertEquals("I", PubUtilTest.UTIL.tieredNumber(d00));
    Assertions.assertEquals("1", PubUtilTest.UTIL.tieredNumber(d10));
    Assertions.assertEquals("1.A", PubUtilTest.UTIL.tieredNumber(d20));
    Assertions.assertEquals("1.A.a", PubUtilTest.UTIL.tieredNumber(d30));
    Assertions.assertEquals("", PubUtilTest.UTIL.tieredNumber(d40));
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/heads/master
  }
}
