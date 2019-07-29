/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.esm.ide.contentassist.antlr.internal.InternalEsmParser;
import com.mimacom.ddd.dm.esm.services.EsmGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EsmParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EsmGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EsmGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDExpressionAccess().getAlternatives(), "rule__DExpression__Alternatives");
			builder.put(grammarAccess.getDPrimaryExpressionAccess().getAlternatives(), "rule__DPrimaryExpression__Alternatives");
			builder.put(grammarAccess.getDFilterAccess().getAlternatives(), "rule__DFilter__Alternatives");
			builder.put(grammarAccess.getDRichTextAccess().getAlternatives(), "rule__DRichText__Alternatives");
			builder.put(grammarAccess.getDAssignmentAccess().getAlternatives(), "rule__DAssignment__Alternatives");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getAlternatives_1(), "rule__DRelationalExpression__Alternatives_1");
			builder.put(grammarAccess.getOpInstanceOfAccess().getAlternatives(), "rule__OpInstanceOf__Alternatives");
			builder.put(grammarAccess.getDUnaryOperationAccess().getAlternatives(), "rule__DUnaryOperation__Alternatives");
			builder.put(grammarAccess.getOpCastAccess().getAlternatives(), "rule__OpCast__Alternatives");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getAlternatives_1(), "rule__DNavigableMemberReference__Alternatives_1");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getAlternatives_1_1_2(), "rule__DNavigableMemberReference__Alternatives_1_1_2");
			builder.put(grammarAccess.getDLiteralExpressionAccess().getAlternatives(), "rule__DLiteralExpression__Alternatives");
			builder.put(grammarAccess.getDSelfExpressionAccess().getAlternatives_1(), "rule__DSelfExpression__Alternatives_1");
			builder.put(grammarAccess.getDReturnExpressionAccess().getAlternatives_1(), "rule__DReturnExpression__Alternatives_1");
			builder.put(grammarAccess.getDRaiseExpressionAccess().getAlternatives_1(), "rule__DRaiseExpression__Alternatives_1");
			builder.put(grammarAccess.getOpConstructorAccess().getAlternatives(), "rule__OpConstructor__Alternatives");
			builder.put(grammarAccess.getDContextReferenceAccess().getAlternatives_1(), "rule__DContextReference__Alternatives_1");
			builder.put(grammarAccess.getDContextReferenceAccess().getAlternatives_1_1_3_1(), "rule__DContextReference__Alternatives_1_1_3_1");
			builder.put(grammarAccess.getMULTIPLICITYAccess().getAlternatives(), "rule__MULTIPLICITY__Alternatives");
			builder.put(grammarAccess.getDBooleanLiteralAccess().getAlternatives_1(), "rule__DBooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getDNilLiteralAccess().getAlternatives_1(), "rule__DNilLiteral__Alternatives_1");
			builder.put(grammarAccess.getDECIMALAccess().getAlternatives_3_0(), "rule__DECIMAL__Alternatives_3_0");
			builder.put(grammarAccess.getDECIMALAccess().getAlternatives_3_1(), "rule__DECIMAL__Alternatives_3_1");
			builder.put(grammarAccess.getDSystemTypeAccess().getAlternatives(), "rule__DSystemType__Alternatives");
			builder.put(grammarAccess.getOpOrAccess().getAlternatives(), "rule__OpOr__Alternatives");
			builder.put(grammarAccess.getOpAndAccess().getAlternatives(), "rule__OpAnd__Alternatives");
			builder.put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
			builder.put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
			builder.put(grammarAccess.getOpOtherAccess().getAlternatives(), "rule__OpOther__Alternatives");
			builder.put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
			builder.put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
			builder.put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
			builder.put(grammarAccess.getDDomainAccess().getGroup(), "rule__DDomain__Group__0");
			builder.put(grammarAccess.getDDomainAccess().getGroup_3(), "rule__DDomain__Group_3__0");
			builder.put(grammarAccess.getDEntityStateModelAccess().getGroup(), "rule__DEntityStateModel__Group__0");
			builder.put(grammarAccess.getDImportAccess().getGroup(), "rule__DImport__Group__0");
			builder.put(grammarAccess.getDStateAccess().getGroup(), "rule__DState__Group__0");
			builder.put(grammarAccess.getDStateAccess().getGroup_1(), "rule__DState__Group_1__0");
			builder.put(grammarAccess.getDTransitionAccess().getGroup(), "rule__DTransition__Group__0");
			builder.put(grammarAccess.getDTransitionAccess().getGroup_5(), "rule__DTransition__Group_5__0");
			builder.put(grammarAccess.getDmxNamespaceAccess().getGroup(), "rule__DmxNamespace__Group__0");
			builder.put(grammarAccess.getDmxNamespaceAccess().getGroup_5(), "rule__DmxNamespace__Group_5__0");
			builder.put(grammarAccess.getDmxNamespaceAccess().getGroup_6(), "rule__DmxNamespace__Group_6__0");
			builder.put(grammarAccess.getDArchetypeAccess().getGroup(), "rule__DArchetype__Group__0");
			builder.put(grammarAccess.getDFunctionAccess().getGroup(), "rule__DFunction__Group__0");
			builder.put(grammarAccess.getDFunctionAccess().getGroup_3(), "rule__DFunction__Group_3__0");
			builder.put(grammarAccess.getDFunctionAccess().getGroup_3_1(), "rule__DFunction__Group_3_1__0");
			builder.put(grammarAccess.getDFunctionParameterAccess().getGroup(), "rule__DFunctionParameter__Group__0");
			builder.put(grammarAccess.getDIteratorAccess().getGroup(), "rule__DIterator__Group__0");
			builder.put(grammarAccess.getDRichTextAccess().getGroup_1(), "rule__DRichText__Group_1__0");
			builder.put(grammarAccess.getDRichTextAccess().getGroup_1_2(), "rule__DRichText__Group_1_2__0");
			builder.put(grammarAccess.getDAssignmentAccess().getGroup_0(), "rule__DAssignment__Group_0__0");
			builder.put(grammarAccess.getDOrExpressionAccess().getGroup(), "rule__DOrExpression__Group__0");
			builder.put(grammarAccess.getDOrExpressionAccess().getGroup_1(), "rule__DOrExpression__Group_1__0");
			builder.put(grammarAccess.getDOrExpressionAccess().getGroup_1_0(), "rule__DOrExpression__Group_1_0__0");
			builder.put(grammarAccess.getDOrExpressionAccess().getGroup_1_0_0(), "rule__DOrExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDAndExpressionAccess().getGroup(), "rule__DAndExpression__Group__0");
			builder.put(grammarAccess.getDAndExpressionAccess().getGroup_1(), "rule__DAndExpression__Group_1__0");
			builder.put(grammarAccess.getDAndExpressionAccess().getGroup_1_0(), "rule__DAndExpression__Group_1_0__0");
			builder.put(grammarAccess.getDAndExpressionAccess().getGroup_1_0_0(), "rule__DAndExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDEqualityExpressionAccess().getGroup(), "rule__DEqualityExpression__Group__0");
			builder.put(grammarAccess.getDEqualityExpressionAccess().getGroup_1(), "rule__DEqualityExpression__Group_1__0");
			builder.put(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0(), "rule__DEqualityExpression__Group_1_0__0");
			builder.put(grammarAccess.getDEqualityExpressionAccess().getGroup_1_0_0(), "rule__DEqualityExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup(), "rule__DRelationalExpression__Group__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0(), "rule__DRelationalExpression__Group_1_0__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0(), "rule__DRelationalExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup_1_0_0_0(), "rule__DRelationalExpression__Group_1_0_0_0__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1(), "rule__DRelationalExpression__Group_1_1__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0(), "rule__DRelationalExpression__Group_1_1_0__0");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getGroup_1_1_0_0(), "rule__DRelationalExpression__Group_1_1_0_0__0");
			builder.put(grammarAccess.getDOtherOperatorExpressionAccess().getGroup(), "rule__DOtherOperatorExpression__Group__0");
			builder.put(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1(), "rule__DOtherOperatorExpression__Group_1__0");
			builder.put(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0(), "rule__DOtherOperatorExpression__Group_1_0__0");
			builder.put(grammarAccess.getDOtherOperatorExpressionAccess().getGroup_1_0_0(), "rule__DOtherOperatorExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDAdditiveExpressionAccess().getGroup(), "rule__DAdditiveExpression__Group__0");
			builder.put(grammarAccess.getDAdditiveExpressionAccess().getGroup_1(), "rule__DAdditiveExpression__Group_1__0");
			builder.put(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0(), "rule__DAdditiveExpression__Group_1_0__0");
			builder.put(grammarAccess.getDAdditiveExpressionAccess().getGroup_1_0_0(), "rule__DAdditiveExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDMultiplicativeExpressionAccess().getGroup(), "rule__DMultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1(), "rule__DMultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0(), "rule__DMultiplicativeExpression__Group_1_0__0");
			builder.put(grammarAccess.getDMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__DMultiplicativeExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDUnaryOperationAccess().getGroup_0(), "rule__DUnaryOperation__Group_0__0");
			builder.put(grammarAccess.getDCastExpressionAccess().getGroup(), "rule__DCastExpression__Group__0");
			builder.put(grammarAccess.getDCastExpressionAccess().getGroup_1(), "rule__DCastExpression__Group_1__0");
			builder.put(grammarAccess.getDCastExpressionAccess().getGroup_1_0(), "rule__DCastExpression__Group_1_0__0");
			builder.put(grammarAccess.getDCastExpressionAccess().getGroup_1_0_0(), "rule__DCastExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup(), "rule__DNavigableMemberReference__Group__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_0(), "rule__DNavigableMemberReference__Group_1_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_0_0(), "rule__DNavigableMemberReference__Group_1_0_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_0_0_0(), "rule__DNavigableMemberReference__Group_1_0_0_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_1(), "rule__DNavigableMemberReference__Group_1_1__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_1_0(), "rule__DNavigableMemberReference__Group_1_1_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_1_0_0(), "rule__DNavigableMemberReference__Group_1_1_0_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_1_2_0(), "rule__DNavigableMemberReference__Group_1_1_2_0__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_1_2_0_1(), "rule__DNavigableMemberReference__Group_1_1_2_0_1__0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getGroup_1_1_2_0_1_1(), "rule__DNavigableMemberReference__Group_1_1_2_0_1_1__0");
			builder.put(grammarAccess.getDSelfExpressionAccess().getGroup(), "rule__DSelfExpression__Group__0");
			builder.put(grammarAccess.getDReturnExpressionAccess().getGroup(), "rule__DReturnExpression__Group__0");
			builder.put(grammarAccess.getDRaiseExpressionAccess().getGroup(), "rule__DRaiseExpression__Group__0");
			builder.put(grammarAccess.getDParenthesizedExpressionAccess().getGroup(), "rule__DParenthesizedExpression__Group__0");
			builder.put(grammarAccess.getDFunctionCallAccess().getGroup(), "rule__DFunctionCall__Group__0");
			builder.put(grammarAccess.getDFunctionCallAccess().getGroup_3(), "rule__DFunctionCall__Group_3__0");
			builder.put(grammarAccess.getDFunctionCallAccess().getGroup_3_1(), "rule__DFunctionCall__Group_3_1__0");
			builder.put(grammarAccess.getDConstructorCallAccess().getGroup(), "rule__DConstructorCall__Group__0");
			builder.put(grammarAccess.getDConstructorCallAccess().getGroup_3(), "rule__DConstructorCall__Group_3__0");
			builder.put(grammarAccess.getDConstructorCallAccess().getGroup_3_1(), "rule__DConstructorCall__Group_3_1__0");
			builder.put(grammarAccess.getDConstructorCallAccess().getGroup_3_1_1(), "rule__DConstructorCall__Group_3_1_1__0");
			builder.put(grammarAccess.getDContextReferenceAccess().getGroup(), "rule__DContextReference__Group__0");
			builder.put(grammarAccess.getDContextReferenceAccess().getGroup_1_0(), "rule__DContextReference__Group_1_0__0");
			builder.put(grammarAccess.getDContextReferenceAccess().getGroup_1_1(), "rule__DContextReference__Group_1_1__0");
			builder.put(grammarAccess.getDContextReferenceAccess().getGroup_1_1_2(), "rule__DContextReference__Group_1_1_2__0");
			builder.put(grammarAccess.getDContextReferenceAccess().getGroup_1_1_3(), "rule__DContextReference__Group_1_1_3__0");
			builder.put(grammarAccess.getDIfExpressionAccess().getGroup(), "rule__DIfExpression__Group__0");
			builder.put(grammarAccess.getDIfExpressionAccess().getGroup_5(), "rule__DIfExpression__Group_5__0");
			builder.put(grammarAccess.getDForLoopExpressionAccess().getGroup(), "rule__DForLoopExpression__Group__0");
			builder.put(grammarAccess.getDForLoopExpressionAccess().getGroup_0(), "rule__DForLoopExpression__Group_0__0");
			builder.put(grammarAccess.getDForLoopExpressionAccess().getGroup_0_0(), "rule__DForLoopExpression__Group_0_0__0");
			builder.put(grammarAccess.getDMultiplicityAccess().getGroup(), "rule__DMultiplicity__Group__0");
			builder.put(grammarAccess.getDBooleanLiteralAccess().getGroup(), "rule__DBooleanLiteral__Group__0");
			builder.put(grammarAccess.getDStringLiteralAccess().getGroup(), "rule__DStringLiteral__Group__0");
			builder.put(grammarAccess.getDNaturalLiteralAccess().getGroup(), "rule__DNaturalLiteral__Group__0");
			builder.put(grammarAccess.getDDecimalLiteralAccess().getGroup(), "rule__DDecimalLiteral__Group__0");
			builder.put(grammarAccess.getDNilLiteralAccess().getGroup(), "rule__DNilLiteral__Group__0");
			builder.put(grammarAccess.getDECIMALAccess().getGroup(), "rule__DECIMAL__Group__0");
			builder.put(grammarAccess.getDECIMALAccess().getGroup_3(), "rule__DECIMAL__Group_3__0");
			builder.put(grammarAccess.getDQualifiedNameWithWildcardAccess().getGroup(), "rule__DQualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getDQualifiedNameAccess().getGroup(), "rule__DQualifiedName__Group__0");
			builder.put(grammarAccess.getDQualifiedNameAccess().getGroup_1(), "rule__DQualifiedName__Group_1__0");
			builder.put(grammarAccess.getDDomainAccess().getImportsAssignment_0(), "rule__DDomain__ImportsAssignment_0");
			builder.put(grammarAccess.getDDomainAccess().getNameAssignment_2(), "rule__DDomain__NameAssignment_2");
			builder.put(grammarAccess.getDDomainAccess().getAliasesAssignment_3_1(), "rule__DDomain__AliasesAssignment_3_1");
			builder.put(grammarAccess.getDDomainAccess().getDescriptionAssignment_4(), "rule__DDomain__DescriptionAssignment_4");
			builder.put(grammarAccess.getDDomainAccess().getStateModelsAssignment_5(), "rule__DDomain__StateModelsAssignment_5");
			builder.put(grammarAccess.getDEntityStateModelAccess().getNameAssignment_2(), "rule__DEntityStateModel__NameAssignment_2");
			builder.put(grammarAccess.getDEntityStateModelAccess().getForTypeAssignment_4(), "rule__DEntityStateModel__ForTypeAssignment_4");
			builder.put(grammarAccess.getDEntityStateModelAccess().getDescriptionAssignment_5(), "rule__DEntityStateModel__DescriptionAssignment_5");
			builder.put(grammarAccess.getDEntityStateModelAccess().getStatesAssignment_7(), "rule__DEntityStateModel__StatesAssignment_7");
			builder.put(grammarAccess.getDEntityStateModelAccess().getEventsAssignment_9(), "rule__DEntityStateModel__EventsAssignment_9");
			builder.put(grammarAccess.getDEntityStateModelAccess().getTransitionAssignment_11(), "rule__DEntityStateModel__TransitionAssignment_11");
			builder.put(grammarAccess.getDImportAccess().getImportedNamespaceAssignment_1(), "rule__DImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getDStateAccess().getNameAssignment_0(), "rule__DState__NameAssignment_0");
			builder.put(grammarAccess.getDStateAccess().getExpressionAssignment_1_1(), "rule__DState__ExpressionAssignment_1_1");
			builder.put(grammarAccess.getDEventAccess().getNameAssignment(), "rule__DEvent__NameAssignment");
			builder.put(grammarAccess.getDTransitionAccess().getFromAssignment_0(), "rule__DTransition__FromAssignment_0");
			builder.put(grammarAccess.getDTransitionAccess().getToAssignment_2(), "rule__DTransition__ToAssignment_2");
			builder.put(grammarAccess.getDTransitionAccess().getEventAssignment_4(), "rule__DTransition__EventAssignment_4");
			builder.put(grammarAccess.getDTransitionAccess().getGuardAssignment_5_1(), "rule__DTransition__GuardAssignment_5_1");
			builder.put(grammarAccess.getDmxNamespaceAccess().getImportsAssignment_0(), "rule__DmxNamespace__ImportsAssignment_0");
			builder.put(grammarAccess.getDmxNamespaceAccess().getNameAssignment_2(), "rule__DmxNamespace__NameAssignment_2");
			builder.put(grammarAccess.getDmxNamespaceAccess().getTypesAssignment_3(), "rule__DmxNamespace__TypesAssignment_3");
			builder.put(grammarAccess.getDmxNamespaceAccess().getFiltersAssignment_4(), "rule__DmxNamespace__FiltersAssignment_4");
			builder.put(grammarAccess.getDmxNamespaceAccess().getTextsAssignment_5_3(), "rule__DmxNamespace__TextsAssignment_5_3");
			builder.put(grammarAccess.getDmxNamespaceAccess().getExpressionsAssignment_6_3(), "rule__DmxNamespace__ExpressionsAssignment_6_3");
			builder.put(grammarAccess.getDArchetypeAccess().getNameAssignment_1(), "rule__DArchetype__NameAssignment_1");
			builder.put(grammarAccess.getDArchetypeAccess().getSystemTypeAssignment_3(), "rule__DArchetype__SystemTypeAssignment_3");
			builder.put(grammarAccess.getDArchetypeAccess().getDescriptionAssignment_4(), "rule__DArchetype__DescriptionAssignment_4");
			builder.put(grammarAccess.getDFunctionAccess().getNameAssignment_1(), "rule__DFunction__NameAssignment_1");
			builder.put(grammarAccess.getDFunctionAccess().getParametersAssignment_3_0(), "rule__DFunction__ParametersAssignment_3_0");
			builder.put(grammarAccess.getDFunctionAccess().getParametersAssignment_3_1_1(), "rule__DFunction__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getDFunctionAccess().getSystemTypeAssignment_6(), "rule__DFunction__SystemTypeAssignment_6");
			builder.put(grammarAccess.getDFunctionAccess().getSystemTypeManyAssignment_7(), "rule__DFunction__SystemTypeManyAssignment_7");
			builder.put(grammarAccess.getDFunctionParameterAccess().getNameAssignment_0(), "rule__DFunctionParameter__NameAssignment_0");
			builder.put(grammarAccess.getDFunctionParameterAccess().getSystemTypeAssignment_2(), "rule__DFunctionParameter__SystemTypeAssignment_2");
			builder.put(grammarAccess.getDFunctionParameterAccess().getSystemTypeManyAssignment_3(), "rule__DFunctionParameter__SystemTypeManyAssignment_3");
			builder.put(grammarAccess.getDIteratorAccess().getNameAssignment_1(), "rule__DIterator__NameAssignment_1");
			builder.put(grammarAccess.getDIteratorAccess().getSystemTypeAssignment_3(), "rule__DIterator__SystemTypeAssignment_3");
			builder.put(grammarAccess.getDIteratorAccess().getSystemTypeManyAssignment_4(), "rule__DIterator__SystemTypeManyAssignment_4");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_0(), "rule__DRichText__SegmentsAssignment_0");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_0(), "rule__DRichText__SegmentsAssignment_1_0");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_1(), "rule__DRichText__SegmentsAssignment_1_1");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_0(), "rule__DRichText__SegmentsAssignment_1_2_0");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_1(), "rule__DRichText__SegmentsAssignment_1_2_1");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_3(), "rule__DRichText__SegmentsAssignment_1_3");
			builder.put(grammarAccess.getDTextOnlyAccess().getValueAssignment(), "rule__DTextOnly__ValueAssignment");
			builder.put(grammarAccess.getDTextStartAccess().getValueAssignment(), "rule__DTextStart__ValueAssignment");
			builder.put(grammarAccess.getDTextMiddleAccess().getValueAssignment(), "rule__DTextMiddle__ValueAssignment");
			builder.put(grammarAccess.getDTextEndAccess().getValueAssignment(), "rule__DTextEnd__ValueAssignment");
			builder.put(grammarAccess.getDAssignmentAccess().getAssignToMemberAssignment_0_1(), "rule__DAssignment__AssignToMemberAssignment_0_1");
			builder.put(grammarAccess.getDAssignmentAccess().getValueAssignment_0_3(), "rule__DAssignment__ValueAssignment_0_3");
			builder.put(grammarAccess.getDOrExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DOrExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDOrExpressionAccess().getRightOperandAssignment_1_1(), "rule__DOrExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDAndExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DAndExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDAndExpressionAccess().getRightOperandAssignment_1_1(), "rule__DAndExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDEqualityExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DEqualityExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDEqualityExpressionAccess().getRightOperandAssignment_1_1(), "rule__DEqualityExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getTypeAssignment_1_0_1(), "rule__DRelationalExpression__TypeAssignment_1_0_1");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1(), "rule__DRelationalExpression__OperatorAssignment_1_1_0_0_1");
			builder.put(grammarAccess.getDRelationalExpressionAccess().getRightOperandAssignment_1_1_1(), "rule__DRelationalExpression__RightOperandAssignment_1_1_1");
			builder.put(grammarAccess.getDOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DOtherOperatorExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDOtherOperatorExpressionAccess().getRightOperandAssignment_1_1(), "rule__DOtherOperatorExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DAdditiveExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDAdditiveExpressionAccess().getRightOperandAssignment_1_1(), "rule__DAdditiveExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DMultiplicativeExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDMultiplicativeExpressionAccess().getRightOperandAssignment_1_1(), "rule__DMultiplicativeExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDUnaryOperationAccess().getOperatorAssignment_0_1(), "rule__DUnaryOperation__OperatorAssignment_0_1");
			builder.put(grammarAccess.getDUnaryOperationAccess().getOperandAssignment_0_2(), "rule__DUnaryOperation__OperandAssignment_0_2");
			builder.put(grammarAccess.getDCastExpressionAccess().getTypeAssignment_1_1(), "rule__DCastExpression__TypeAssignment_1_1");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getAssignToMemberAssignment_1_0_0_0_2(), "rule__DNavigableMemberReference__AssignToMemberAssignment_1_0_0_0_2");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getValueAssignment_1_0_1(), "rule__DNavigableMemberReference__ValueAssignment_1_0_1");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getMemberAssignment_1_1_1(), "rule__DNavigableMemberReference__MemberAssignment_1_1_1");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0_0(), "rule__DNavigableMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_0(), "rule__DNavigableMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_0");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getMemberCallArgumentsAssignment_1_1_2_0_1_1_1(), "rule__DNavigableMemberReference__MemberCallArgumentsAssignment_1_1_2_0_1_1_1");
			builder.put(grammarAccess.getDNavigableMemberReferenceAccess().getBeforeAssignment_1_1_2_1(), "rule__DNavigableMemberReference__BeforeAssignment_1_1_2_1");
			builder.put(grammarAccess.getDReturnExpressionAccess().getExpressionAssignment_2(), "rule__DReturnExpression__ExpressionAssignment_2");
			builder.put(grammarAccess.getDRaiseExpressionAccess().getExpressionAssignment_2(), "rule__DRaiseExpression__ExpressionAssignment_2");
			builder.put(grammarAccess.getDFunctionCallAccess().getFunctionAssignment_1(), "rule__DFunctionCall__FunctionAssignment_1");
			builder.put(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_0(), "rule__DFunctionCall__FunctionCallArgumentsAssignment_3_0");
			builder.put(grammarAccess.getDFunctionCallAccess().getFunctionCallArgumentsAssignment_3_1_1(), "rule__DFunctionCall__FunctionCallArgumentsAssignment_3_1_1");
			builder.put(grammarAccess.getDConstructorCallAccess().getConstructorAssignment_2(), "rule__DConstructorCall__ConstructorAssignment_2");
			builder.put(grammarAccess.getDConstructorCallAccess().getExplicitConstructorCallAssignment_3_0(), "rule__DConstructorCall__ExplicitConstructorCallAssignment_3_0");
			builder.put(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_0(), "rule__DConstructorCall__ArgumentsAssignment_3_1_0");
			builder.put(grammarAccess.getDConstructorCallAccess().getArgumentsAssignment_3_1_1_1(), "rule__DConstructorCall__ArgumentsAssignment_3_1_1_1");
			builder.put(grammarAccess.getDContextReferenceAccess().getTargetAssignment_1_0_0(), "rule__DContextReference__TargetAssignment_1_0_0");
			builder.put(grammarAccess.getDContextReferenceAccess().getBeforeAssignment_1_0_1(), "rule__DContextReference__BeforeAssignment_1_0_1");
			builder.put(grammarAccess.getDContextReferenceAccess().getTargetAssignment_1_1_1(), "rule__DContextReference__TargetAssignment_1_1_1");
			builder.put(grammarAccess.getDContextReferenceAccess().getMemberAssignment_1_1_2_1(), "rule__DContextReference__MemberAssignment_1_1_2_1");
			builder.put(grammarAccess.getDContextReferenceAccess().getDisplayNameAssignment_1_1_3_1_0(), "rule__DContextReference__DisplayNameAssignment_1_1_3_1_0");
			builder.put(grammarAccess.getDContextReferenceAccess().getPluralAssignment_1_1_3_1_1(), "rule__DContextReference__PluralAssignment_1_1_3_1_1");
			builder.put(grammarAccess.getDIfExpressionAccess().getIfAssignment_2(), "rule__DIfExpression__IfAssignment_2");
			builder.put(grammarAccess.getDIfExpressionAccess().getThenAssignment_4(), "rule__DIfExpression__ThenAssignment_4");
			builder.put(grammarAccess.getDIfExpressionAccess().getElseAssignment_5_1(), "rule__DIfExpression__ElseAssignment_5_1");
			builder.put(grammarAccess.getDForLoopExpressionAccess().getDeclaredParamAssignment_0_0_2(), "rule__DForLoopExpression__DeclaredParamAssignment_0_0_2");
			builder.put(grammarAccess.getDForLoopExpressionAccess().getForExpressionAssignment_1(), "rule__DForLoopExpression__ForExpressionAssignment_1");
			builder.put(grammarAccess.getDForLoopExpressionAccess().getEachExpressionAssignment_3(), "rule__DForLoopExpression__EachExpressionAssignment_3");
			builder.put(grammarAccess.getDMultiplicityAccess().getMinOccursAssignment_1(), "rule__DMultiplicity__MinOccursAssignment_1");
			builder.put(grammarAccess.getDMultiplicityAccess().getMaxOccursAssignment_3(), "rule__DMultiplicity__MaxOccursAssignment_3");
			builder.put(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_0(), "rule__DBooleanLiteral__ValueAssignment_1_0");
			builder.put(grammarAccess.getDBooleanLiteralAccess().getValueAssignment_1_1(), "rule__DBooleanLiteral__ValueAssignment_1_1");
			builder.put(grammarAccess.getDStringLiteralAccess().getValueAssignment_1(), "rule__DStringLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getDNaturalLiteralAccess().getValueAssignment_1(), "rule__DNaturalLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getDDecimalLiteralAccess().getValueAssignment_1(), "rule__DDecimalLiteral__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EsmGrammarAccess grammarAccess;

	@Override
	protected InternalEsmParser createParser() {
		InternalEsmParser result = new InternalEsmParser(null);
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

	public EsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
