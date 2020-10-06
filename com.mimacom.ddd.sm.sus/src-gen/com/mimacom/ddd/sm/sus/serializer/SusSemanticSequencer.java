/*
 * generated by Xtext 2.21.0
 */
package com.mimacom.ddd.sm.sus.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.BasePackage;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DMultiplicity;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.base.base.DTextSegment;
import com.mimacom.ddd.dm.dmx.DmxArchetype;
import com.mimacom.ddd.dm.dmx.DmxAssignment;
import com.mimacom.ddd.dm.dmx.DmxBaseTypeSet;
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation;
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DmxCallArguments;
import com.mimacom.ddd.dm.dmx.DmxCastExpression;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DmxDetail;
import com.mimacom.ddd.dm.dmx.DmxEntity;
import com.mimacom.ddd.dm.dmx.DmxField;
import com.mimacom.ddd.dm.dmx.DmxFilter;
import com.mimacom.ddd.dm.dmx.DmxFilterParameter;
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor;
import com.mimacom.ddd.dm.dmx.DmxFunctionCall;
import com.mimacom.ddd.dm.dmx.DmxIfExpression;
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DmxListExpression;
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable;
import com.mimacom.ddd.dm.dmx.DmxStaticReference;
import com.mimacom.ddd.dm.dmx.DmxStringLiteral;
import com.mimacom.ddd.dm.dmx.DmxTest;
import com.mimacom.ddd.dm.dmx.DmxTestContext;
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation;
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxUrlLiteral;
import com.mimacom.ddd.pub.pub.Abbreviation;
import com.mimacom.ddd.pub.pub.Abbreviations;
import com.mimacom.ddd.pub.pub.Abstract;
import com.mimacom.ddd.pub.pub.Admonition;
import com.mimacom.ddd.pub.pub.Appendix;
import com.mimacom.ddd.pub.pub.Bibliography;
import com.mimacom.ddd.pub.pub.BibliographyEntry;
import com.mimacom.ddd.pub.pub.ChangeDescription;
import com.mimacom.ddd.pub.pub.ChangeHistory;
import com.mimacom.ddd.pub.pub.Chapter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.Epilogue;
import com.mimacom.ddd.pub.pub.Equation;
import com.mimacom.ddd.pub.pub.Footnote;
import com.mimacom.ddd.pub.pub.Glossary;
import com.mimacom.ddd.pub.pub.GlossaryEntry;
import com.mimacom.ddd.pub.pub.IncludedFigure;
import com.mimacom.ddd.pub.pub.Index;
import com.mimacom.ddd.pub.pub.IndexEntry;
import com.mimacom.ddd.pub.pub.List;
import com.mimacom.ddd.pub.pub.ListItem;
import com.mimacom.ddd.pub.pub.ListOfFigures;
import com.mimacom.ddd.pub.pub.ListOfTables;
import com.mimacom.ddd.pub.pub.Part;
import com.mimacom.ddd.pub.pub.Preface;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Publication;
import com.mimacom.ddd.pub.pub.PublicationBody;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.RichTextParagraph;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.SegmentInclude;
import com.mimacom.ddd.pub.pub.Subsection;
import com.mimacom.ddd.pub.pub.Subsubsection;
import com.mimacom.ddd.pub.pub.Symbol;
import com.mimacom.ddd.pub.pub.TOC;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TableCell;
import com.mimacom.ddd.pub.pub.TableRow;
import com.mimacom.ddd.pub.pub.TitledCodeListing;
import com.mimacom.ddd.pub.pub.TitledFigure;
import com.mimacom.ddd.pub.pub.TitledTable;
import com.mimacom.ddd.pub.pub.serializer.PubSemanticSequencer;
import com.mimacom.ddd.sm.sus.SusPackage;
import com.mimacom.ddd.sm.sus.UserStory;
import com.mimacom.ddd.sm.sus.services.SusGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;

@SuppressWarnings("all")
public class SusSemanticSequencer extends PubSemanticSequencer {

	@Inject
	private SusGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BasePackage.DIMPORT:
				sequence_DImport(context, (DImport) semanticObject); 
				return; 
			case BasePackage.DMULTIPLICITY:
				sequence_DMultiplicity(context, (DMultiplicity) semanticObject); 
				return; 
			case BasePackage.DNAMESPACE:
				sequence_DNamespace(context, (DNamespace) semanticObject); 
				return; 
			case BasePackage.DRICH_TEXT:
				sequence_DRichText(context, (DRichText) semanticObject); 
				return; 
			case BasePackage.DTEXT_SEGMENT:
				if (rule == grammarAccess.getDmxTextEndRule()) {
					sequence_DmxTextEnd(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTextMiddleRule()) {
					sequence_DmxTextMiddle(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTextOnlyRule()) {
					sequence_DmxTextOnly(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxTextStartRule()) {
					sequence_DmxTextStart(context, (DTextSegment) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == DmxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DmxPackage.DMX_ARCHETYPE:
				sequence_DmxArchetype(context, (DmxArchetype) semanticObject); 
				return; 
			case DmxPackage.DMX_ASSIGNMENT:
				if (rule == grammarAccess.getDmxAssignmentRule()) {
					sequence_DmxAssignment(context, (DmxAssignment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxPrimaryExpressionRule()
						|| rule == grammarAccess.getDExpressionRule()
						|| rule == grammarAccess.getDmxNavigableMemberReferenceRule()
						|| action == grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0()
						|| action == grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0()
						|| rule == grammarAccess.getDmxPredicateWithCorrelationVariableRule()
						|| rule == grammarAccess.getDmxOrExpressionRule()
						|| action == grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxAndExpressionRule()
						|| action == grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxEqualityExpressionRule()
						|| action == grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxRelationalExpressionRule()
						|| action == grammarAccess.getDmxRelationalExpressionAccess().getDmxInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getDmxOtherOperatorExpressionRule()
						|| action == grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxAdditiveExpressionRule()
						|| action == grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxMultiplicativeExpressionRule()
						|| action == grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxUnaryOperationRule()
						|| rule == grammarAccess.getDmxCastExpressionRule()
						|| action == grammarAccess.getDmxCastExpressionAccess().getDmxCastExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getDmxParenthesizedExpressionRule()) {
					sequence_DmxAssignment_DmxNavigableMemberReference(context, (DmxAssignment) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DMX_BASE_TYPE_SET:
				sequence_DmxBaseTypeSet(context, (DmxBaseTypeSet) semanticObject); 
				return; 
			case DmxPackage.DMX_BINARY_OPERATION:
				sequence_DmxAdditiveExpression_DmxAndExpression_DmxEqualityExpression_DmxMultiplicativeExpression_DmxOrExpression_DmxOtherOperatorExpression_DmxRelationalExpression(context, (DmxBinaryOperation) semanticObject); 
				return; 
			case DmxPackage.DMX_BOOLEAN_LITERAL:
				sequence_DmxBooleanLiteral(context, (DmxBooleanLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_CALL_ARGUMENTS:
				if (rule == grammarAccess.getDmxCallArgumentsRule()) {
					sequence_DmxCallArguments(context, (DmxCallArguments) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxFunctionCallArgumentsRule()) {
					sequence_DmxFunctionCallArguments(context, (DmxCallArguments) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DMX_CAST_EXPRESSION:
				sequence_DmxCastExpression(context, (DmxCastExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_CONTEXT_REFERENCE:
				sequence_DmxContextReference(context, (DmxContextReference) semanticObject); 
				return; 
			case DmxPackage.DMX_CORRELATION_VARIABLE:
				sequence_DmxCorrelationVariable(context, (DmxCorrelationVariable) semanticObject); 
				return; 
			case DmxPackage.DMX_DECIMAL_LITERAL:
				sequence_DmxDecimalLiteral(context, (DmxDecimalLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_DETAIL:
				sequence_DmxComplexObject(context, (DmxDetail) semanticObject); 
				return; 
			case DmxPackage.DMX_ENTITY:
				sequence_DmxComplexObject(context, (DmxEntity) semanticObject); 
				return; 
			case DmxPackage.DMX_FIELD:
				sequence_DmxField(context, (DmxField) semanticObject); 
				return; 
			case DmxPackage.DMX_FILTER:
				sequence_DmxFilter(context, (DmxFilter) semanticObject); 
				return; 
			case DmxPackage.DMX_FILTER_PARAMETER:
				sequence_DmxFilterParameter(context, (DmxFilterParameter) semanticObject); 
				return; 
			case DmxPackage.DMX_FILTER_TYPE_DESCRIPTOR:
				sequence_DmxFilterTypeDescriptor(context, (DmxFilterTypeDescriptor) semanticObject); 
				return; 
			case DmxPackage.DMX_FUNCTION_CALL:
				sequence_DmxFunctionCall(context, (DmxFunctionCall) semanticObject); 
				return; 
			case DmxPackage.DMX_IF_EXPRESSION:
				sequence_DmxIfExpression(context, (DmxIfExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_INSTANCE_OF_EXPRESSION:
				sequence_DmxRelationalExpression(context, (DmxInstanceOfExpression) semanticObject); 
				return; 
			case DmxPackage.DMX_LIST_EXPRESSION:
				if (rule == grammarAccess.getDmxPrimaryExpressionRule()
						|| rule == grammarAccess.getDExpressionRule()
						|| rule == grammarAccess.getDmxNavigableMemberReferenceRule()
						|| action == grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxAssignmentPrecedingNavigationSegmentAction_1_0_0_0_0()
						|| action == grammarAccess.getDmxNavigableMemberReferenceAccess().getDmxMemberNavigationPrecedingNavigationSegmentAction_1_1_0_0_0()
						|| rule == grammarAccess.getDmxPredicateWithCorrelationVariableRule()
						|| rule == grammarAccess.getDmxOrExpressionRule()
						|| action == grammarAccess.getDmxOrExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxAndExpressionRule()
						|| action == grammarAccess.getDmxAndExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxEqualityExpressionRule()
						|| action == grammarAccess.getDmxEqualityExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxRelationalExpressionRule()
						|| action == grammarAccess.getDmxRelationalExpressionAccess().getDmxInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getDmxRelationalExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getDmxOtherOperatorExpressionRule()
						|| action == grammarAccess.getDmxOtherOperatorExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxAdditiveExpressionRule()
						|| action == grammarAccess.getDmxAdditiveExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxMultiplicativeExpressionRule()
						|| action == grammarAccess.getDmxMultiplicativeExpressionAccess().getDmxBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getDmxUnaryOperationRule()
						|| rule == grammarAccess.getDmxCastExpressionRule()
						|| action == grammarAccess.getDmxCastExpressionAccess().getDmxCastExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getDmxParenthesizedExpressionRule()
						|| rule == grammarAccess.getDmxListExpressionRule()) {
					sequence_DmxListExpression(context, (DmxListExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDmxLiteralListExpressionRule()) {
					sequence_DmxLiteralListExpression(context, (DmxListExpression) semanticObject); 
					return; 
				}
				else break;
			case DmxPackage.DMX_MEMBER_NAVIGATION:
				sequence_DmxNavigableMemberReference(context, (DmxMemberNavigation) semanticObject); 
				return; 
			case DmxPackage.DMX_MODEL:
				sequence_DmxModel(context, (DmxModel) semanticObject); 
				return; 
			case DmxPackage.DMX_NATURAL_LITERAL:
				sequence_DmxNaturalLiteral(context, (DmxNaturalLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_PREDICATE_WITH_CORRELATION_VARIABLE:
				sequence_DmxPredicateWithCorrelationVariable(context, (DmxPredicateWithCorrelationVariable) semanticObject); 
				return; 
			case DmxPackage.DMX_STATIC_REFERENCE:
				sequence_DmxStaticReference(context, (DmxStaticReference) semanticObject); 
				return; 
			case DmxPackage.DMX_STRING_LITERAL:
				sequence_DmxStringLiteral(context, (DmxStringLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_TEST:
				sequence_DmxTest(context, (DmxTest) semanticObject); 
				return; 
			case DmxPackage.DMX_TEST_CONTEXT:
				sequence_DmxTestContext(context, (DmxTestContext) semanticObject); 
				return; 
			case DmxPackage.DMX_UNARY_OPERATION:
				sequence_DmxUnaryOperation(context, (DmxUnaryOperation) semanticObject); 
				return; 
			case DmxPackage.DMX_UNDEFINED_LITERAL:
				sequence_DmxUndefinedLiteral(context, (DmxUndefinedLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_URL_LITERAL:
				sequence_DmxUrlLiteral(context, (DmxUrlLiteral) semanticObject); 
				return; 
			}
		else if (epackage == PubPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PubPackage.ABBREVIATION:
				sequence_PubAbbreviation(context, (Abbreviation) semanticObject); 
				return; 
			case PubPackage.ABBREVIATIONS:
				sequence_PubAbbreviations(context, (Abbreviations) semanticObject); 
				return; 
			case PubPackage.ABSTRACT:
				sequence_PubAbstract(context, (Abstract) semanticObject); 
				return; 
			case PubPackage.ADMONITION:
				sequence_PubAdmonition_PubReferenceTargetName(context, (Admonition) semanticObject); 
				return; 
			case PubPackage.APPENDIX:
				sequence_PubAppendix_PubDivisionHeader_PubReferenceTargetName(context, (Appendix) semanticObject); 
				return; 
			case PubPackage.BIBLIOGRAPHY:
				sequence_PubBibliography(context, (Bibliography) semanticObject); 
				return; 
			case PubPackage.BIBLIOGRAPHY_ENTRY:
				sequence_PubBibliographyEntry(context, (BibliographyEntry) semanticObject); 
				return; 
			case PubPackage.CHANGE_DESCRIPTION:
				sequence_PubChangeDescription(context, (ChangeDescription) semanticObject); 
				return; 
			case PubPackage.CHANGE_HISTORY:
				sequence_PubChangeHistory(context, (ChangeHistory) semanticObject); 
				return; 
			case PubPackage.CHAPTER:
				sequence_PubChapter_PubDivisionHeader_PubReferenceTargetName(context, (Chapter) semanticObject); 
				return; 
			case PubPackage.COMPONENT:
				sequence_PubComponent_PubGenerate_PubReferenceTargetName(context, (Component) semanticObject); 
				return; 
			case PubPackage.EPILOGUE:
				sequence_PubEpilogue(context, (Epilogue) semanticObject); 
				return; 
			case PubPackage.EQUATION:
				sequence_PubEquation_PubReferenceTargetName_PubTitledBlockHeader(context, (Equation) semanticObject); 
				return; 
			case PubPackage.FOOTNOTE:
				sequence_PubFootnote(context, (Footnote) semanticObject); 
				return; 
			case PubPackage.GLOSSARY:
				sequence_PubGlossary(context, (Glossary) semanticObject); 
				return; 
			case PubPackage.GLOSSARY_ENTRY:
				sequence_PubGlossaryEntry(context, (GlossaryEntry) semanticObject); 
				return; 
			case PubPackage.INCLUDED_FIGURE:
				sequence_IncludedFigure(context, (IncludedFigure) semanticObject); 
				return; 
			case PubPackage.INDEX:
				sequence_PubIndex(context, (Index) semanticObject); 
				return; 
			case PubPackage.INDEX_ENTRY:
				sequence_PubIndexEntry(context, (IndexEntry) semanticObject); 
				return; 
			case PubPackage.LIST:
				sequence_PubList(context, (List) semanticObject); 
				return; 
			case PubPackage.LIST_ITEM:
				sequence_PubListItem_PubReferenceTargetName(context, (ListItem) semanticObject); 
				return; 
			case PubPackage.LIST_OF_FIGURES:
				sequence_PubListOfFigures(context, (ListOfFigures) semanticObject); 
				return; 
			case PubPackage.LIST_OF_TABLES:
				sequence_PubListOfTables(context, (ListOfTables) semanticObject); 
				return; 
			case PubPackage.PART:
				sequence_PubDivisionHeader_PubPart_PubReferenceTargetName(context, (Part) semanticObject); 
				return; 
			case PubPackage.PREFACE:
				sequence_PubPreface(context, (Preface) semanticObject); 
				return; 
			case PubPackage.PROVIDED_FIGURE:
				sequence_ProvidedFigure(context, (ProvidedFigure) semanticObject); 
				return; 
			case PubPackage.PROVIDED_TABLE:
				sequence_ProvidedTable(context, (ProvidedTable) semanticObject); 
				return; 
			case PubPackage.PUB_MODEL:
				sequence_PubModel(context, (PubModel) semanticObject); 
				return; 
			case PubPackage.PUBLICATION:
				sequence_PubGenerate_PubPublication_PubReferenceTargetName(context, (Publication) semanticObject); 
				return; 
			case PubPackage.PUBLICATION_BODY:
				sequence_PubPublicationBody(context, (PublicationBody) semanticObject); 
				return; 
			case PubPackage.REFERENCE:
				sequence_PubReference(context, (Reference) semanticObject); 
				return; 
			case PubPackage.RICH_TEXT_PARAGRAPH:
				if (rule == grammarAccess.getPubParagraphTextOnlyRule()) {
					sequence_PubParagraphTextOnly(context, (RichTextParagraph) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPubContentBlockRule()
						|| rule == grammarAccess.getPubRichTextParagraphRule()) {
					sequence_PubRichTextParagraph(context, (RichTextParagraph) semanticObject); 
					return; 
				}
				else break;
			case PubPackage.SECTION:
				sequence_PubDivisionHeader_PubReferenceTargetName_PubSection(context, (Section) semanticObject); 
				return; 
			case PubPackage.SEGMENT_INCLUDE:
				sequence_PubSegmentInclude(context, (SegmentInclude) semanticObject); 
				return; 
			case PubPackage.SUBSECTION:
				sequence_PubDivisionHeader_PubReferenceTargetName_PubSubsection(context, (Subsection) semanticObject); 
				return; 
			case PubPackage.SUBSUBSECTION:
				sequence_PubDivisionHeader_PubReferenceTargetName_PubSubsubsection(context, (Subsubsection) semanticObject); 
				return; 
			case PubPackage.SYMBOL:
				sequence_PubSymbol(context, (Symbol) semanticObject); 
				return; 
			case PubPackage.TOC:
				sequence_PubTOC(context, (TOC) semanticObject); 
				return; 
			case PubPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			case PubPackage.TABLE_CELL:
				if (rule == grammarAccess.getPubTableCellRule()) {
					sequence_PubTableCell(context, (TableCell) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPubTableSimpleCellRule()) {
					sequence_PubTableSimpleCell(context, (TableCell) semanticObject); 
					return; 
				}
				else break;
			case PubPackage.TABLE_ROW:
				sequence_PubTableRow(context, (TableRow) semanticObject); 
				return; 
			case PubPackage.TITLED_CODE_LISTING:
				sequence_PubCodeListing_PubReferenceTargetName(context, (TitledCodeListing) semanticObject); 
				return; 
			case PubPackage.TITLED_FIGURE:
				sequence_PubFigure_PubReferenceTargetName_PubTitledBlockHeader(context, (TitledFigure) semanticObject); 
				return; 
			case PubPackage.TITLED_TABLE:
				sequence_PubReferenceTargetName_PubTable_PubTitledBlockHeader(context, (TitledTable) semanticObject); 
				return; 
			}
		else if (epackage == SusPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SusPackage.USER_STORY:
				sequence_UserStory(context, (UserStory) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DNamespace returns DNamespace
	 *
	 * Constraint:
	 *     (name=DQualifiedName imports+=DImport* model=UserStory)
	 */
	protected void sequence_DNamespace(ISerializationContext context, DNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserStory returns UserStory
	 *
	 * Constraint:
	 *     (name=DQualifiedName event=[DemDomainEvent|DQualifiedName]? description=DRichText? goal=DRichText sections+=PubSection*)
	 */
	protected void sequence_UserStory(ISerializationContext context, UserStory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
