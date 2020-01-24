package com.mimacom.ddd.pub.pub.tests;

import com.google.inject.Inject;
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
class PubUtilTest {
  @Inject
  @Extension
  private PubNumberingUtil NUM;
  
  @Inject
  @Extension
  private PubUtil _pubUtil;
  
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
    Assertions.assertEquals(pTOC, this._pubUtil.prototype(toc));
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
    Assertions.assertEquals(pChapter, this._pubUtil.prototype(ch));
    Assertions.assertEquals(pSection, this._pubUtil.prototype(s));
  }
  
  @Test
  public void testRomanNumbering() {
    Assertions.assertEquals("--", this.NUM.toRoman((-1)));
    Assertions.assertEquals("--", this.NUM.toRoman(0));
    Assertions.assertEquals("I", this.NUM.toRoman(1));
    Assertions.assertEquals("IX", this.NUM.toRoman(9));
    Assertions.assertEquals("X", this.NUM.toRoman(10));
    Assertions.assertEquals("XI", this.NUM.toRoman(11));
    Assertions.assertEquals("XLIX", this.NUM.toRoman(49));
    Assertions.assertEquals("XCIX", this.NUM.toRoman(99));
    Assertions.assertEquals("XXII", this.NUM.toRoman(122));
  }
  
  @Test
  public void testLetterNumbering() {
    Assertions.assertEquals("--", this.NUM.toLetter((-1)));
    Assertions.assertEquals("A", this.NUM.toLetter(1));
    Assertions.assertEquals("E", this.NUM.toLetter(5));
    Assertions.assertEquals("Z", this.NUM.toLetter(26));
    Assertions.assertEquals("AA", this.NUM.toLetter(27));
    Assertions.assertEquals("AE", this.NUM.toLetter(31));
    Assertions.assertEquals("ZZ", this.NUM.toLetter(702));
    Assertions.assertEquals("A", this.NUM.toLetter(703));
    Assertions.assertEquals("Z", this.NUM.toLetter(728));
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
    this.NUM.gatherAllDivisionsAndSetSequenceNumbers(compo);
    Assertions.assertEquals("I", this.NUM.formattedSingleNumber(d00));
    Assertions.assertEquals("1", this.NUM.formattedSingleNumber(d10));
    Assertions.assertEquals("A", this.NUM.formattedSingleNumber(d20));
    Assertions.assertEquals("a", this.NUM.formattedSingleNumber(d30));
    Assertions.assertEquals("", this.NUM.formattedSingleNumber(d40));
    Assertions.assertEquals("I", this.NUM.tieredNumber(d00));
    Assertions.assertEquals("1.", this.NUM.tieredNumber(d10));
    Assertions.assertEquals("1.A", this.NUM.tieredNumber(d20));
    Assertions.assertEquals("1.A.a", this.NUM.tieredNumber(d30));
    Assertions.assertEquals("", this.NUM.tieredNumber(d40));
  }
}
