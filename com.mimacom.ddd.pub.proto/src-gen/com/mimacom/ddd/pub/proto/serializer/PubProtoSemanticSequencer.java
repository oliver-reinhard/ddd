/*
 * generated by Xtext 2.21.0.M1
 */
package com.mimacom.ddd.pub.proto.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.pub.proto.ProtoAbbreviations;
import com.mimacom.ddd.pub.proto.ProtoAbstract;
import com.mimacom.ddd.pub.proto.ProtoAppendix;
import com.mimacom.ddd.pub.proto.ProtoBibliography;
import com.mimacom.ddd.pub.proto.ProtoChangeHistory;
import com.mimacom.ddd.pub.proto.ProtoChapter;
import com.mimacom.ddd.pub.proto.ProtoEpilogue;
import com.mimacom.ddd.pub.proto.ProtoGlossary;
import com.mimacom.ddd.pub.proto.ProtoIndex;
import com.mimacom.ddd.pub.proto.ProtoListOfFigures;
import com.mimacom.ddd.pub.proto.ProtoListOfTables;
import com.mimacom.ddd.pub.proto.ProtoPackage;
import com.mimacom.ddd.pub.proto.ProtoPart;
import com.mimacom.ddd.pub.proto.ProtoPreface;
import com.mimacom.ddd.pub.proto.ProtoPublicationBody;
import com.mimacom.ddd.pub.proto.ProtoSection;
import com.mimacom.ddd.pub.proto.ProtoSubsection;
import com.mimacom.ddd.pub.proto.ProtoSubsubsection;
import com.mimacom.ddd.pub.proto.ProtoTOC;
import com.mimacom.ddd.pub.proto.PublicationClass;
import com.mimacom.ddd.pub.proto.services.PubProtoGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class PubProtoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PubProtoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProtoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProtoPackage.PROTO_ABBREVIATIONS:
				sequence_ProtoAbbreviations_SegmentBody(context, (ProtoAbbreviations) semanticObject); 
				return; 
			case ProtoPackage.PROTO_ABSTRACT:
				sequence_ProtoAbstract_SegmentBody(context, (ProtoAbstract) semanticObject); 
				return; 
			case ProtoPackage.PROTO_APPENDIX:
				sequence_ProtoAppendix_ProtoDivisionBody(context, (ProtoAppendix) semanticObject); 
				return; 
			case ProtoPackage.PROTO_BIBLIOGRAPHY:
				sequence_ProtoBibliography_SegmentBody(context, (ProtoBibliography) semanticObject); 
				return; 
			case ProtoPackage.PROTO_CHANGE_HISTORY:
				sequence_ProtoChangeHistory_SegmentBody(context, (ProtoChangeHistory) semanticObject); 
				return; 
			case ProtoPackage.PROTO_CHAPTER:
				sequence_ProtoChapter_ProtoDivisionBody(context, (ProtoChapter) semanticObject); 
				return; 
			case ProtoPackage.PROTO_EPILOGUE:
				sequence_ProtoEpilogue_SegmentBody(context, (ProtoEpilogue) semanticObject); 
				return; 
			case ProtoPackage.PROTO_GLOSSARY:
				sequence_ProtoGlossary_SegmentBody(context, (ProtoGlossary) semanticObject); 
				return; 
			case ProtoPackage.PROTO_INDEX:
				sequence_ProtoIndex_SegmentBody(context, (ProtoIndex) semanticObject); 
				return; 
			case ProtoPackage.PROTO_LIST_OF_FIGURES:
				sequence_ProtoListOfFigures_SegmentBody(context, (ProtoListOfFigures) semanticObject); 
				return; 
			case ProtoPackage.PROTO_LIST_OF_TABLES:
				sequence_ProtoListOfTables_SegmentBody(context, (ProtoListOfTables) semanticObject); 
				return; 
			case ProtoPackage.PROTO_PART:
				sequence_ProtoDivisionBody_ProtoPart(context, (ProtoPart) semanticObject); 
				return; 
			case ProtoPackage.PROTO_PREFACE:
				sequence_ProtoPreface_SegmentBody(context, (ProtoPreface) semanticObject); 
				return; 
			case ProtoPackage.PROTO_PUBLICATION_BODY:
				sequence_ProtoPublicationBody(context, (ProtoPublicationBody) semanticObject); 
				return; 
			case ProtoPackage.PROTO_SECTION:
				sequence_ProtoDivisionBody_ProtoSection(context, (ProtoSection) semanticObject); 
				return; 
			case ProtoPackage.PROTO_SUBSECTION:
				sequence_ProtoDivisionBody_ProtoSubsection(context, (ProtoSubsection) semanticObject); 
				return; 
			case ProtoPackage.PROTO_SUBSUBSECTION:
				sequence_ProtoDivisionBody_ProtoSubsubsection(context, (ProtoSubsubsection) semanticObject); 
				return; 
			case ProtoPackage.PROTO_TOC:
				sequence_ProtoTOC_SegmentBody(context, (ProtoTOC) semanticObject); 
				return; 
			case ProtoPackage.PUBLICATION_CLASS:
				sequence_PublicationClass(context, (PublicationClass) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoAbbreviations
	 *     ProtoAbbreviations returns ProtoAbbreviations
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoAbbreviations_SegmentBody(ISerializationContext context, ProtoAbbreviations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoAbstract
	 *     ProtoAbstract returns ProtoAbstract
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoAbstract_SegmentBody(ISerializationContext context, ProtoAbstract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDivision returns ProtoAppendix
	 *     ProtoAppendix returns ProtoAppendix
	 *
	 * Constraint:
	 *     numberingStyle=ProtoSequenceNumberStyle?
	 */
	protected void sequence_ProtoAppendix_ProtoDivisionBody(ISerializationContext context, ProtoAppendix semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoBibliography
	 *     ProtoBibliography returns ProtoBibliography
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoBibliography_SegmentBody(ISerializationContext context, ProtoBibliography semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoChangeHistory
	 *     ProtoChangeHistory returns ProtoChangeHistory
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoChangeHistory_SegmentBody(ISerializationContext context, ProtoChangeHistory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDivision returns ProtoChapter
	 *     ProtoChapter returns ProtoChapter
	 *
	 * Constraint:
	 *     numberingStyle=ProtoSequenceNumberStyle?
	 */
	protected void sequence_ProtoChapter_ProtoDivisionBody(ISerializationContext context, ProtoChapter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDivision returns ProtoPart
	 *     ProtoPart returns ProtoPart
	 *
	 * Constraint:
	 *     numberingStyle=ProtoSequenceNumberStyle?
	 */
	protected void sequence_ProtoDivisionBody_ProtoPart(ISerializationContext context, ProtoPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDivision returns ProtoSection
	 *     ProtoSection returns ProtoSection
	 *
	 * Constraint:
	 *     numberingStyle=ProtoSequenceNumberStyle?
	 */
	protected void sequence_ProtoDivisionBody_ProtoSection(ISerializationContext context, ProtoSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDivision returns ProtoSubsection
	 *     ProtoSubsection returns ProtoSubsection
	 *
	 * Constraint:
	 *     numberingStyle=ProtoSequenceNumberStyle?
	 */
	protected void sequence_ProtoDivisionBody_ProtoSubsection(ISerializationContext context, ProtoSubsection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDivision returns ProtoSubsubsection
	 *     ProtoSubsubsection returns ProtoSubsubsection
	 *
	 * Constraint:
	 *     numberingStyle=ProtoSequenceNumberStyle?
	 */
	protected void sequence_ProtoDivisionBody_ProtoSubsubsection(ISerializationContext context, ProtoSubsubsection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoEpilogue
	 *     ProtoEpilogue returns ProtoEpilogue
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoEpilogue_SegmentBody(ISerializationContext context, ProtoEpilogue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoGlossary
	 *     ProtoGlossary returns ProtoGlossary
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoGlossary_SegmentBody(ISerializationContext context, ProtoGlossary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoIndex
	 *     ProtoIndex returns ProtoIndex
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoIndex_SegmentBody(ISerializationContext context, ProtoIndex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoListOfFigures
	 *     ProtoListOfFigures returns ProtoListOfFigures
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoListOfFigures_SegmentBody(ISerializationContext context, ProtoListOfFigures semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoListOfTables
	 *     ProtoListOfTables returns ProtoListOfTables
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoListOfTables_SegmentBody(ISerializationContext context, ProtoListOfTables semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoPreface
	 *     ProtoPreface returns ProtoPreface
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'?)
	 */
	protected void sequence_ProtoPreface_SegmentBody(ISerializationContext context, ProtoPreface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoPublicationBody
	 *     ProtoPublicationBody returns ProtoPublicationBody
	 *
	 * Constraint:
	 *     (allowParts?='true'? allowAppendix?='true'?)
	 */
	protected void sequence_ProtoPublicationBody(ISerializationContext context, ProtoPublicationBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProtoDocumentSegment returns ProtoTOC
	 *     ProtoTOC returns ProtoTOC
	 *
	 * Constraint:
	 *     (title=STRING? optional?='true'? maxLevel=INT?)
	 */
	protected void sequence_ProtoTOC_SegmentBody(ISerializationContext context, ProtoTOC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PublicationClass returns PublicationClass
	 *
	 * Constraint:
	 *     (name=ID title=STRING? nature=PublicationNature segments+=ProtoDocumentSegment* divisions+=ProtoDivision*)
	 */
	protected void sequence_PublicationClass(ISerializationContext context, PublicationClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
