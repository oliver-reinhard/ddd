/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.proto.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.pub.proto.ide.contentassist.antlr.internal.InternalPubProtoParser;
import com.mimacom.ddd.pub.proto.services.PubProtoGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PubProtoParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PubProtoGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PubProtoGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getProtoDocumentSegmentAccess().getAlternatives(), "rule__ProtoDocumentSegment__Alternatives");
			builder.put(grammarAccess.getSegmentBodyAccess().getAlternatives_1_1(), "rule__SegmentBody__Alternatives_1_1");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_3_1(), "rule__ProtoPublicationBody__Alternatives_3_1");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getAlternatives_4_1(), "rule__ProtoPublicationBody__Alternatives_4_1");
			builder.put(grammarAccess.getProtoDivisionAccess().getAlternatives(), "rule__ProtoDivision__Alternatives");
			builder.put(grammarAccess.getPublicationNatureAccess().getAlternatives(), "rule__PublicationNature__Alternatives");
			builder.put(grammarAccess.getProtoSequenceNumberStyleAccess().getAlternatives(), "rule__ProtoSequenceNumberStyle__Alternatives");
			builder.put(grammarAccess.getPublicationClassAccess().getGroup(), "rule__PublicationClass__Group__0");
			builder.put(grammarAccess.getPublicationClassAccess().getGroup_4(), "rule__PublicationClass__Group_4__0");
			builder.put(grammarAccess.getSegmentBodyAccess().getGroup(), "rule__SegmentBody__Group__0");
			builder.put(grammarAccess.getSegmentBodyAccess().getGroup_0(), "rule__SegmentBody__Group_0__0");
			builder.put(grammarAccess.getSegmentBodyAccess().getGroup_1(), "rule__SegmentBody__Group_1__0");
			builder.put(grammarAccess.getProtoAbstractAccess().getGroup(), "rule__ProtoAbstract__Group__0");
			builder.put(grammarAccess.getProtoPrefaceAccess().getGroup(), "rule__ProtoPreface__Group__0");
			builder.put(grammarAccess.getProtoEpilogueAccess().getGroup(), "rule__ProtoEpilogue__Group__0");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getGroup(), "rule__ProtoPublicationBody__Group__0");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getGroup_3(), "rule__ProtoPublicationBody__Group_3__0");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getGroup_4(), "rule__ProtoPublicationBody__Group_4__0");
			builder.put(grammarAccess.getProtoChangeHistoryAccess().getGroup(), "rule__ProtoChangeHistory__Group__0");
			builder.put(grammarAccess.getProtoTOCAccess().getGroup(), "rule__ProtoTOC__Group__0");
			builder.put(grammarAccess.getProtoTOCAccess().getGroup_4(), "rule__ProtoTOC__Group_4__0");
			builder.put(grammarAccess.getProtoAbbreviationsAccess().getGroup(), "rule__ProtoAbbreviations__Group__0");
			builder.put(grammarAccess.getProtoListOfTablesAccess().getGroup(), "rule__ProtoListOfTables__Group__0");
			builder.put(grammarAccess.getProtoListOfFiguresAccess().getGroup(), "rule__ProtoListOfFigures__Group__0");
			builder.put(grammarAccess.getProtoBibliographyAccess().getGroup(), "rule__ProtoBibliography__Group__0");
			builder.put(grammarAccess.getProtoGlossaryAccess().getGroup(), "rule__ProtoGlossary__Group__0");
			builder.put(grammarAccess.getProtoIndexAccess().getGroup(), "rule__ProtoIndex__Group__0");
			builder.put(grammarAccess.getProtoDivisionBodyAccess().getGroup(), "rule__ProtoDivisionBody__Group__0");
			builder.put(grammarAccess.getProtoPartAccess().getGroup(), "rule__ProtoPart__Group__0");
			builder.put(grammarAccess.getProtoAppendixAccess().getGroup(), "rule__ProtoAppendix__Group__0");
			builder.put(grammarAccess.getProtoChapterAccess().getGroup(), "rule__ProtoChapter__Group__0");
			builder.put(grammarAccess.getProtoSectionAccess().getGroup(), "rule__ProtoSection__Group__0");
			builder.put(grammarAccess.getProtoSubsectionAccess().getGroup(), "rule__ProtoSubsection__Group__0");
			builder.put(grammarAccess.getProtoSubsubsectionAccess().getGroup(), "rule__ProtoSubsubsection__Group__0");
			builder.put(grammarAccess.getPublicationClassAccess().getNameAssignment_3(), "rule__PublicationClass__NameAssignment_3");
			builder.put(grammarAccess.getPublicationClassAccess().getTitleAssignment_4_1(), "rule__PublicationClass__TitleAssignment_4_1");
			builder.put(grammarAccess.getPublicationClassAccess().getNatureAssignment_6(), "rule__PublicationClass__NatureAssignment_6");
			builder.put(grammarAccess.getPublicationClassAccess().getSegmentsAssignment_8(), "rule__PublicationClass__SegmentsAssignment_8");
			builder.put(grammarAccess.getPublicationClassAccess().getDivisionsAssignment_10(), "rule__PublicationClass__DivisionsAssignment_10");
			builder.put(grammarAccess.getSegmentBodyAccess().getTitleAssignment_0_1(), "rule__SegmentBody__TitleAssignment_0_1");
			builder.put(grammarAccess.getSegmentBodyAccess().getOptionalAssignment_1_1_0(), "rule__SegmentBody__OptionalAssignment_1_1_0");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getAllowPartsAssignment_3_1_0(), "rule__ProtoPublicationBody__AllowPartsAssignment_3_1_0");
			builder.put(grammarAccess.getProtoPublicationBodyAccess().getAllowAppendixAssignment_4_1_0(), "rule__ProtoPublicationBody__AllowAppendixAssignment_4_1_0");
			builder.put(grammarAccess.getProtoTOCAccess().getMaxLevelAssignment_4_1(), "rule__ProtoTOC__MaxLevelAssignment_4_1");
			builder.put(grammarAccess.getProtoDivisionBodyAccess().getNumberingStyleAssignment_1(), "rule__ProtoDivisionBody__NumberingStyleAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PubProtoGrammarAccess grammarAccess;

	@Override
	protected InternalPubProtoParser createParser() {
		InternalPubProtoParser result = new InternalPubProtoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PubProtoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PubProtoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
