/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.sus.serializer;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.BasePackage;
import com.mimacom.ddd.dm.base.DImport;
import com.mimacom.ddd.dm.base.DMultiplicity;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.DTextSegment;
import com.mimacom.ddd.dm.dmx.DArchetype;
import com.mimacom.ddd.dm.dmx.DAssignment;
import com.mimacom.ddd.dm.dmx.DBinaryOperation;
import com.mimacom.ddd.dm.dmx.DBooleanLiteral;
import com.mimacom.ddd.dm.dmx.DCastExpression;
import com.mimacom.ddd.dm.dmx.DConstructorCall;
import com.mimacom.ddd.dm.dmx.DContextReference;
import com.mimacom.ddd.dm.dmx.DDecimalLiteral;
import com.mimacom.ddd.dm.dmx.DForLoopExpression;
import com.mimacom.ddd.dm.dmx.DFunction;
import com.mimacom.ddd.dm.dmx.DFunctionCall;
import com.mimacom.ddd.dm.dmx.DFunctionParameter;
import com.mimacom.ddd.dm.dmx.DIfExpression;
import com.mimacom.ddd.dm.dmx.DInstanceOfExpression;
import com.mimacom.ddd.dm.dmx.DIterator;
import com.mimacom.ddd.dm.dmx.DNaturalLiteral;
import com.mimacom.ddd.dm.dmx.DNavigableMemberReference;
import com.mimacom.ddd.dm.dmx.DRaiseExpression;
import com.mimacom.ddd.dm.dmx.DReturnExpression;
import com.mimacom.ddd.dm.dmx.DSelfExpression;
import com.mimacom.ddd.dm.dmx.DStringLiteral;
import com.mimacom.ddd.dm.dmx.DUnaryOperation;
import com.mimacom.ddd.dm.dmx.DUndefinedLiteral;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.serializer.DmxSemanticSequencer;
import com.mimacom.ddd.sm.sus.Paragraph;
import com.mimacom.ddd.sm.sus.Section;
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
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SusSemanticSequencer extends DmxSemanticSequencer {

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
			case BasePackage.DRICH_TEXT:
				sequence_DRichText(context, (DRichText) semanticObject); 
				return; 
			case BasePackage.DTEXT_SEGMENT:
				if (rule == grammarAccess.getDTextEndRule()) {
					sequence_DTextEnd(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextMiddleRule()) {
					sequence_DTextMiddle(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextOnlyRule()) {
					sequence_DTextOnly(context, (DTextSegment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getDTextStartRule()) {
					sequence_DTextStart(context, (DTextSegment) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == DmxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DmxPackage.DARCHETYPE:
				sequence_DArchetype(context, (DArchetype) semanticObject); 
				return; 
			case DmxPackage.DASSIGNMENT:
				sequence_DAssignment_DNavigableMemberReference(context, (DAssignment) semanticObject); 
				return; 
			case DmxPackage.DBINARY_OPERATION:
				sequence_DAdditiveExpression_DAndExpression_DEqualityExpression_DMultiplicativeExpression_DOrExpression_DOtherOperatorExpression_DRelationalExpression(context, (DBinaryOperation) semanticObject); 
				return; 
			case DmxPackage.DBOOLEAN_LITERAL:
				sequence_DBooleanLiteral(context, (DBooleanLiteral) semanticObject); 
				return; 
			case DmxPackage.DCAST_EXPRESSION:
				sequence_DCastExpression(context, (DCastExpression) semanticObject); 
				return; 
			case DmxPackage.DCONSTRUCTOR_CALL:
				sequence_DConstructorCall(context, (DConstructorCall) semanticObject); 
				return; 
			case DmxPackage.DCONTEXT_REFERENCE:
				sequence_DContextReference(context, (DContextReference) semanticObject); 
				return; 
			case DmxPackage.DDECIMAL_LITERAL:
				sequence_DDecimalLiteral(context, (DDecimalLiteral) semanticObject); 
				return; 
			case DmxPackage.DFOR_LOOP_EXPRESSION:
				sequence_DForLoopExpression(context, (DForLoopExpression) semanticObject); 
				return; 
			case DmxPackage.DFUNCTION:
				sequence_DFunction(context, (DFunction) semanticObject); 
				return; 
			case DmxPackage.DFUNCTION_CALL:
				sequence_DFunctionCall(context, (DFunctionCall) semanticObject); 
				return; 
			case DmxPackage.DFUNCTION_PARAMETER:
				sequence_DFunctionParameter(context, (DFunctionParameter) semanticObject); 
				return; 
			case DmxPackage.DIF_EXPRESSION:
				sequence_DIfExpression(context, (DIfExpression) semanticObject); 
				return; 
			case DmxPackage.DINSTANCE_OF_EXPRESSION:
				sequence_DRelationalExpression(context, (DInstanceOfExpression) semanticObject); 
				return; 
			case DmxPackage.DITERATOR:
				sequence_DIterator(context, (DIterator) semanticObject); 
				return; 
			case DmxPackage.DNATURAL_LITERAL:
				sequence_DNaturalLiteral(context, (DNaturalLiteral) semanticObject); 
				return; 
			case DmxPackage.DNAVIGABLE_MEMBER_REFERENCE:
				sequence_DNavigableMemberReference(context, (DNavigableMemberReference) semanticObject); 
				return; 
			case DmxPackage.DRAISE_EXPRESSION:
				sequence_DRaiseExpression(context, (DRaiseExpression) semanticObject); 
				return; 
			case DmxPackage.DRETURN_EXPRESSION:
				sequence_DReturnExpression(context, (DReturnExpression) semanticObject); 
				return; 
			case DmxPackage.DSELF_EXPRESSION:
				sequence_DSelfExpression(context, (DSelfExpression) semanticObject); 
				return; 
			case DmxPackage.DSTRING_LITERAL:
				sequence_DStringLiteral(context, (DStringLiteral) semanticObject); 
				return; 
			case DmxPackage.DUNARY_OPERATION:
				sequence_DUnaryOperation(context, (DUnaryOperation) semanticObject); 
				return; 
			case DmxPackage.DUNDEFINED_LITERAL:
				sequence_DNilLiteral(context, (DUndefinedLiteral) semanticObject); 
				return; 
			case DmxPackage.DMX_NAMESPACE:
				sequence_DmxNamespace(context, (DmxNamespace) semanticObject); 
				return; 
			}
		else if (epackage == SusPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SusPackage.PARAGRAPH:
				sequence_Paragraph(context, (Paragraph) semanticObject); 
				return; 
			case SusPackage.SECTION:
				sequence_Section(context, (Section) semanticObject); 
				return; 
			case SusPackage.USER_STORY:
				sequence_UserStory(context, (UserStory) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DImport returns DImport
	 *
	 * Constraint:
	 *     importedNamespace=DQualifiedNameWithWildcard
	 */
	protected void sequence_DImport(ISerializationContext context, DImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BasePackage.Literals.DIMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BasePackage.Literals.DIMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDImportAccess().getImportedNamespaceDQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Paragraph returns Paragraph
	 *
	 * Constraint:
	 *     text=DRichText
	 */
	protected void sequence_Paragraph(ISerializationContext context, Paragraph semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SusPackage.Literals.PARAGRAPH__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SusPackage.Literals.PARAGRAPH__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParagraphAccess().getTextDRichTextParserRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Section returns Section
	 *
	 * Constraint:
	 *     (name=ID paragraphs+=Paragraph*)
	 */
	protected void sequence_Section(ISerializationContext context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserStory returns UserStory
	 *
	 * Constraint:
	 *     (imports+=DImport* name=DQualifiedName event=[DDomainEvent|DQualifiedName]? description=DRichText? sections+=Section*)
	 */
	protected void sequence_UserStory(ISerializationContext context, UserStory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}