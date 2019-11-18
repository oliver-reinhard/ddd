/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mimacom.ddd.dm.dom.ide.contentassist.antlr.internal.InternalDomParser;
import com.mimacom.ddd.dm.dom.services.DomGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DomParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DomGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DomGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDomNamedComplexObjectAccess().getObjectAlternatives_2_0(), "rule__DomNamedComplexObject__ObjectAlternatives_2_0");
			builder.put(grammarAccess.getDmxTestContextAccess().getAlternatives_4_1(), "rule__DmxTestContext__Alternatives_4_1");
			builder.put(grammarAccess.getDmxFilterTypeDescriptorAccess().getAlternatives_0(), "rule__DmxFilterTypeDescriptor__Alternatives_0");
			builder.put(grammarAccess.getDExpressionAccess().getAlternatives(), "rule__DExpression__Alternatives");
			builder.put(grammarAccess.getDRichTextAccess().getAlternatives(), "rule__DRichText__Alternatives");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getAlternatives_1(), "rule__DmxNavigableMemberReference__Alternatives_1");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getAlternatives_1_1_2(), "rule__DmxNavigableMemberReference__Alternatives_1_1_2");
			builder.put(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getAlternatives(), "rule__DmxPredicateWithCorrelationVariable__Alternatives");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getAlternatives_1(), "rule__DmxRelationalExpression__Alternatives_1");
			builder.put(grammarAccess.getDmxOpInstanceOfAccess().getAlternatives(), "rule__DmxOpInstanceOf__Alternatives");
			builder.put(grammarAccess.getDmxUnaryOperationAccess().getAlternatives(), "rule__DmxUnaryOperation__Alternatives");
			builder.put(grammarAccess.getDmxOpCastAccess().getAlternatives(), "rule__DmxOpCast__Alternatives");
			builder.put(grammarAccess.getDmxPrimaryExpressionAccess().getAlternatives(), "rule__DmxPrimaryExpression__Alternatives");
			builder.put(grammarAccess.getDmxLiteralExpressionAccess().getAlternatives(), "rule__DmxLiteralExpression__Alternatives");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getAlternatives_4_1(), "rule__DmxStaticReference__Alternatives_4_1");
			builder.put(grammarAccess.getDmxContextReferenceAccess().getAlternatives_2(), "rule__DmxContextReference__Alternatives_2");
			builder.put(grammarAccess.getDMultiplicityAccess().getAlternatives(), "rule__DMultiplicity__Alternatives");
			builder.put(grammarAccess.getMULTIPLICITYAccess().getAlternatives(), "rule__MULTIPLICITY__Alternatives");
			builder.put(grammarAccess.getDmxBooleanLiteralAccess().getAlternatives_1(), "rule__DmxBooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getDmxUndefinedLiteralAccess().getAlternatives_1(), "rule__DmxUndefinedLiteral__Alternatives_1");
			builder.put(grammarAccess.getDECIMALAccess().getAlternatives_3_0(), "rule__DECIMAL__Alternatives_3_0");
			builder.put(grammarAccess.getDECIMALAccess().getAlternatives_3_1(), "rule__DECIMAL__Alternatives_3_1");
			builder.put(grammarAccess.getDmxBaseTypeAccess().getAlternatives(), "rule__DmxBaseType__Alternatives");
			builder.put(grammarAccess.getDmxOpOrAccess().getAlternatives(), "rule__DmxOpOr__Alternatives");
			builder.put(grammarAccess.getDmxOpAndAccess().getAlternatives(), "rule__DmxOpAnd__Alternatives");
			builder.put(grammarAccess.getDmxOpEqualityAccess().getAlternatives(), "rule__DmxOpEquality__Alternatives");
			builder.put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
			builder.put(grammarAccess.getOpOtherAccess().getAlternatives(), "rule__OpOther__Alternatives");
			builder.put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
			builder.put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
			builder.put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
			builder.put(grammarAccess.getDMultiplicityShorthandAccess().getAlternatives(), "rule__DMultiplicityShorthand__Alternatives");
			builder.put(grammarAccess.getDomModelAccess().getGroup(), "rule__DomModel__Group__0");
			builder.put(grammarAccess.getDomSnapshotAccess().getGroup(), "rule__DomSnapshot__Group__0");
			builder.put(grammarAccess.getDomNamedComplexObjectAccess().getGroup(), "rule__DomNamedComplexObject__Group__0");
			builder.put(grammarAccess.getDmxNamespaceAccess().getGroup(), "rule__DmxNamespace__Group__0");
			builder.put(grammarAccess.getDImportAccess().getGroup(), "rule__DImport__Group__0");
			builder.put(grammarAccess.getDmxTestAccess().getGroup(), "rule__DmxTest__Group__0");
			builder.put(grammarAccess.getDmxTestAccess().getGroup_2(), "rule__DmxTest__Group_2__0");
			builder.put(grammarAccess.getDmxTestAccess().getGroup_2_2(), "rule__DmxTest__Group_2_2__0");
			builder.put(grammarAccess.getDmxTestContextAccess().getGroup(), "rule__DmxTestContext__Group__0");
			builder.put(grammarAccess.getDmxTestContextAccess().getGroup_4(), "rule__DmxTestContext__Group_4__0");
			builder.put(grammarAccess.getDmxBaseTypeSetAccess().getGroup(), "rule__DmxBaseTypeSet__Group__0");
			builder.put(grammarAccess.getDmxBaseTypeSetAccess().getGroup_4(), "rule__DmxBaseTypeSet__Group_4__0");
			builder.put(grammarAccess.getDmxArchetypeAccess().getGroup(), "rule__DmxArchetype__Group__0");
			builder.put(grammarAccess.getDmxFilterAccess().getGroup(), "rule__DmxFilter__Group__0");
			builder.put(grammarAccess.getDmxFilterAccess().getGroup_3(), "rule__DmxFilter__Group_3__0");
			builder.put(grammarAccess.getDmxFilterAccess().getGroup_3_1(), "rule__DmxFilter__Group_3_1__0");
			builder.put(grammarAccess.getDmxFilterAccess().getGroup_7(), "rule__DmxFilter__Group_7__0");
			builder.put(grammarAccess.getDmxFilterTypeDescriptorAccess().getGroup(), "rule__DmxFilterTypeDescriptor__Group__0");
			builder.put(grammarAccess.getDmxFilterParameterAccess().getGroup(), "rule__DmxFilterParameter__Group__0");
			builder.put(grammarAccess.getDRichTextAccess().getGroup_1(), "rule__DRichText__Group_1__0");
			builder.put(grammarAccess.getDRichTextAccess().getGroup_1_2(), "rule__DRichText__Group_1_2__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup(), "rule__DmxNavigableMemberReference__Group__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_0(), "rule__DmxNavigableMemberReference__Group_1_0__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_0_0(), "rule__DmxNavigableMemberReference__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_0_0_0(), "rule__DmxNavigableMemberReference__Group_1_0_0_0__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_1(), "rule__DmxNavigableMemberReference__Group_1_1__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_1_0(), "rule__DmxNavigableMemberReference__Group_1_1_0__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_1_0_0(), "rule__DmxNavigableMemberReference__Group_1_1_0_0__0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getGroup_1_1_2_0(), "rule__DmxNavigableMemberReference__Group_1_1_2_0__0");
			builder.put(grammarAccess.getDmxCallArgumentsAccess().getGroup(), "rule__DmxCallArguments__Group__0");
			builder.put(grammarAccess.getDmxCallArgumentsAccess().getGroup_1(), "rule__DmxCallArguments__Group_1__0");
			builder.put(grammarAccess.getDmxCallArgumentsAccess().getGroup_1_1(), "rule__DmxCallArguments__Group_1_1__0");
			builder.put(grammarAccess.getDmxAssignmentAccess().getGroup(), "rule__DmxAssignment__Group__0");
			builder.put(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getGroup_0(), "rule__DmxPredicateWithCorrelationVariable__Group_0__0");
			builder.put(grammarAccess.getDmxOrExpressionAccess().getGroup(), "rule__DmxOrExpression__Group__0");
			builder.put(grammarAccess.getDmxOrExpressionAccess().getGroup_1(), "rule__DmxOrExpression__Group_1__0");
			builder.put(grammarAccess.getDmxOrExpressionAccess().getGroup_1_0(), "rule__DmxOrExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxOrExpressionAccess().getGroup_1_0_0(), "rule__DmxOrExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxAndExpressionAccess().getGroup(), "rule__DmxAndExpression__Group__0");
			builder.put(grammarAccess.getDmxAndExpressionAccess().getGroup_1(), "rule__DmxAndExpression__Group_1__0");
			builder.put(grammarAccess.getDmxAndExpressionAccess().getGroup_1_0(), "rule__DmxAndExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxAndExpressionAccess().getGroup_1_0_0(), "rule__DmxAndExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxEqualityExpressionAccess().getGroup(), "rule__DmxEqualityExpression__Group__0");
			builder.put(grammarAccess.getDmxEqualityExpressionAccess().getGroup_1(), "rule__DmxEqualityExpression__Group_1__0");
			builder.put(grammarAccess.getDmxEqualityExpressionAccess().getGroup_1_0(), "rule__DmxEqualityExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxEqualityExpressionAccess().getGroup_1_0_0(), "rule__DmxEqualityExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup(), "rule__DmxRelationalExpression__Group__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup_1_0(), "rule__DmxRelationalExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup_1_0_0(), "rule__DmxRelationalExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup_1_0_0_0(), "rule__DmxRelationalExpression__Group_1_0_0_0__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup_1_1(), "rule__DmxRelationalExpression__Group_1_1__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup_1_1_0(), "rule__DmxRelationalExpression__Group_1_1_0__0");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getGroup_1_1_0_0(), "rule__DmxRelationalExpression__Group_1_1_0_0__0");
			builder.put(grammarAccess.getDmxOtherOperatorExpressionAccess().getGroup(), "rule__DmxOtherOperatorExpression__Group__0");
			builder.put(grammarAccess.getDmxOtherOperatorExpressionAccess().getGroup_1(), "rule__DmxOtherOperatorExpression__Group_1__0");
			builder.put(grammarAccess.getDmxOtherOperatorExpressionAccess().getGroup_1_0(), "rule__DmxOtherOperatorExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxOtherOperatorExpressionAccess().getGroup_1_0_0(), "rule__DmxOtherOperatorExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxAdditiveExpressionAccess().getGroup(), "rule__DmxAdditiveExpression__Group__0");
			builder.put(grammarAccess.getDmxAdditiveExpressionAccess().getGroup_1(), "rule__DmxAdditiveExpression__Group_1__0");
			builder.put(grammarAccess.getDmxAdditiveExpressionAccess().getGroup_1_0(), "rule__DmxAdditiveExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxAdditiveExpressionAccess().getGroup_1_0_0(), "rule__DmxAdditiveExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxMultiplicativeExpressionAccess().getGroup(), "rule__DmxMultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getDmxMultiplicativeExpressionAccess().getGroup_1(), "rule__DmxMultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getDmxMultiplicativeExpressionAccess().getGroup_1_0(), "rule__DmxMultiplicativeExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__DmxMultiplicativeExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxUnaryOperationAccess().getGroup_0(), "rule__DmxUnaryOperation__Group_0__0");
			builder.put(grammarAccess.getDmxCastExpressionAccess().getGroup(), "rule__DmxCastExpression__Group__0");
			builder.put(grammarAccess.getDmxCastExpressionAccess().getGroup_1(), "rule__DmxCastExpression__Group_1__0");
			builder.put(grammarAccess.getDmxCastExpressionAccess().getGroup_1_0(), "rule__DmxCastExpression__Group_1_0__0");
			builder.put(grammarAccess.getDmxCastExpressionAccess().getGroup_1_0_0(), "rule__DmxCastExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getDmxParenthesizedExpressionAccess().getGroup(), "rule__DmxParenthesizedExpression__Group__0");
			builder.put(grammarAccess.getDmxListExpressionAccess().getGroup(), "rule__DmxListExpression__Group__0");
			builder.put(grammarAccess.getDmxListExpressionAccess().getGroup_2(), "rule__DmxListExpression__Group_2__0");
			builder.put(grammarAccess.getDmxListExpressionAccess().getGroup_2_1(), "rule__DmxListExpression__Group_2_1__0");
			builder.put(grammarAccess.getDmxLiteralListExpressionAccess().getGroup(), "rule__DmxLiteralListExpression__Group__0");
			builder.put(grammarAccess.getDmxLiteralListExpressionAccess().getGroup_2(), "rule__DmxLiteralListExpression__Group_2__0");
			builder.put(grammarAccess.getDmxLiteralListExpressionAccess().getGroup_2_1(), "rule__DmxLiteralListExpression__Group_2_1__0");
			builder.put(grammarAccess.getDmxFunctionCallAccess().getGroup(), "rule__DmxFunctionCall__Group__0");
			builder.put(grammarAccess.getDmxFunctionCallArgumentsAccess().getGroup(), "rule__DmxFunctionCallArguments__Group__0");
			builder.put(grammarAccess.getDmxFunctionCallArgumentsAccess().getGroup_1(), "rule__DmxFunctionCallArguments__Group_1__0");
			builder.put(grammarAccess.getDmxFunctionCallArgumentsAccess().getGroup_1_1(), "rule__DmxFunctionCallArguments__Group_1_1__0");
			builder.put(grammarAccess.getDmxEntityAccess().getGroup(), "rule__DmxEntity__Group__0");
			builder.put(grammarAccess.getDmxDetailAccess().getGroup(), "rule__DmxDetail__Group__0");
			builder.put(grammarAccess.getDmxComplexObjectAccess().getGroup(), "rule__DmxComplexObject__Group__0");
			builder.put(grammarAccess.getDmxFieldAccess().getGroup(), "rule__DmxField__Group__0");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getGroup(), "rule__DmxStaticReference__Group__0");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getGroup_3(), "rule__DmxStaticReference__Group_3__0");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getGroup_4(), "rule__DmxStaticReference__Group_4__0");
			builder.put(grammarAccess.getDmxContextReferenceAccess().getGroup(), "rule__DmxContextReference__Group__0");
			builder.put(grammarAccess.getDmxContextReferenceAccess().getGroup_2_1(), "rule__DmxContextReference__Group_2_1__0");
			builder.put(grammarAccess.getDmxIfExpressionAccess().getGroup(), "rule__DmxIfExpression__Group__0");
			builder.put(grammarAccess.getDmxIfExpressionAccess().getGroup_5(), "rule__DmxIfExpression__Group_5__0");
			builder.put(grammarAccess.getDMultiplicityAccess().getGroup_1(), "rule__DMultiplicity__Group_1__0");
			builder.put(grammarAccess.getDmxBooleanLiteralAccess().getGroup(), "rule__DmxBooleanLiteral__Group__0");
			builder.put(grammarAccess.getDmxNaturalLiteralAccess().getGroup(), "rule__DmxNaturalLiteral__Group__0");
			builder.put(grammarAccess.getDmxDecimalLiteralAccess().getGroup(), "rule__DmxDecimalLiteral__Group__0");
			builder.put(grammarAccess.getDmxStringLiteralAccess().getGroup(), "rule__DmxStringLiteral__Group__0");
			builder.put(grammarAccess.getDmxUndefinedLiteralAccess().getGroup(), "rule__DmxUndefinedLiteral__Group__0");
			builder.put(grammarAccess.getDECIMALAccess().getGroup(), "rule__DECIMAL__Group__0");
			builder.put(grammarAccess.getDECIMALAccess().getGroup_3(), "rule__DECIMAL__Group_3__0");
			builder.put(grammarAccess.getDQualifiedNameWithWildcardAccess().getGroup(), "rule__DQualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getDQualifiedNameAccess().getGroup(), "rule__DQualifiedName__Group__0");
			builder.put(grammarAccess.getDQualifiedNameAccess().getGroup_1(), "rule__DQualifiedName__Group_1__0");
			builder.put(grammarAccess.getDomModelAccess().getImportsAssignment_0(), "rule__DomModel__ImportsAssignment_0");
			builder.put(grammarAccess.getDomModelAccess().getNameAssignment_2(), "rule__DomModel__NameAssignment_2");
			builder.put(grammarAccess.getDomModelAccess().getSnapshotsAssignment_3(), "rule__DomModel__SnapshotsAssignment_3");
			builder.put(grammarAccess.getDomSnapshotAccess().getNameAssignment_1(), "rule__DomSnapshot__NameAssignment_1");
			builder.put(grammarAccess.getDomSnapshotAccess().getObjectsAssignment_3(), "rule__DomSnapshot__ObjectsAssignment_3");
			builder.put(grammarAccess.getDomNamedComplexObjectAccess().getNameAssignment_0(), "rule__DomNamedComplexObject__NameAssignment_0");
			builder.put(grammarAccess.getDomNamedComplexObjectAccess().getObjectAssignment_2(), "rule__DomNamedComplexObject__ObjectAssignment_2");
			builder.put(grammarAccess.getDmxNamespaceAccess().getImportsAssignment_0(), "rule__DmxNamespace__ImportsAssignment_0");
			builder.put(grammarAccess.getDmxNamespaceAccess().getNameAssignment_2(), "rule__DmxNamespace__NameAssignment_2");
			builder.put(grammarAccess.getDmxNamespaceAccess().getTypesAssignment_3(), "rule__DmxNamespace__TypesAssignment_3");
			builder.put(grammarAccess.getDmxNamespaceAccess().getFiltersAssignment_4(), "rule__DmxNamespace__FiltersAssignment_4");
			builder.put(grammarAccess.getDmxNamespaceAccess().getTestsAssignment_5(), "rule__DmxNamespace__TestsAssignment_5");
			builder.put(grammarAccess.getDImportAccess().getImportedNamespaceAssignment_1(), "rule__DImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getDmxTestAccess().getNameAssignment_1(), "rule__DmxTest__NameAssignment_1");
			builder.put(grammarAccess.getDmxTestAccess().getContextAssignment_2_1(), "rule__DmxTest__ContextAssignment_2_1");
			builder.put(grammarAccess.getDmxTestAccess().getContextAssignment_2_2_1(), "rule__DmxTest__ContextAssignment_2_2_1");
			builder.put(grammarAccess.getDmxTestAccess().getExprAssignment_4(), "rule__DmxTest__ExprAssignment_4");
			builder.put(grammarAccess.getDmxTestContextAccess().getNameAssignment_0(), "rule__DmxTestContext__NameAssignment_0");
			builder.put(grammarAccess.getDmxTestContextAccess().getTypeAssignment_2(), "rule__DmxTestContext__TypeAssignment_2");
			builder.put(grammarAccess.getDmxTestContextAccess().getMultiplicityAssignment_3(), "rule__DmxTestContext__MultiplicityAssignment_3");
			builder.put(grammarAccess.getDmxTestContextAccess().getValueAssignment_4_1_0(), "rule__DmxTestContext__ValueAssignment_4_1_0");
			builder.put(grammarAccess.getDmxTestContextAccess().getValueAssignment_4_1_1(), "rule__DmxTestContext__ValueAssignment_4_1_1");
			builder.put(grammarAccess.getDmxBaseTypeSetAccess().getNameAssignment_0(), "rule__DmxBaseTypeSet__NameAssignment_0");
			builder.put(grammarAccess.getDmxBaseTypeSetAccess().getMembersAssignment_3(), "rule__DmxBaseTypeSet__MembersAssignment_3");
			builder.put(grammarAccess.getDmxBaseTypeSetAccess().getMembersAssignment_4_1(), "rule__DmxBaseTypeSet__MembersAssignment_4_1");
			builder.put(grammarAccess.getDmxArchetypeAccess().getNameAssignment_1(), "rule__DmxArchetype__NameAssignment_1");
			builder.put(grammarAccess.getDmxArchetypeAccess().getBaseTypeAssignment_3(), "rule__DmxArchetype__BaseTypeAssignment_3");
			builder.put(grammarAccess.getDmxArchetypeAccess().getDescriptionAssignment_4(), "rule__DmxArchetype__DescriptionAssignment_4");
			builder.put(grammarAccess.getDmxFilterAccess().getNameAssignment_1(), "rule__DmxFilter__NameAssignment_1");
			builder.put(grammarAccess.getDmxFilterAccess().getParametersAssignment_3_0(), "rule__DmxFilter__ParametersAssignment_3_0");
			builder.put(grammarAccess.getDmxFilterAccess().getParametersAssignment_3_1_1(), "rule__DmxFilter__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getDmxFilterAccess().getTypeDescAssignment_6(), "rule__DmxFilter__TypeDescAssignment_6");
			builder.put(grammarAccess.getDmxFilterAccess().getWithTypeSetAssignment_7_1(), "rule__DmxFilter__WithTypeSetAssignment_7_1");
			builder.put(grammarAccess.getDmxFilterTypeDescriptorAccess().getSingleAssignment_0_0(), "rule__DmxFilterTypeDescriptor__SingleAssignment_0_0");
			builder.put(grammarAccess.getDmxFilterTypeDescriptorAccess().getMultipleAssignment_0_1(), "rule__DmxFilterTypeDescriptor__MultipleAssignment_0_1");
			builder.put(grammarAccess.getDmxFilterTypeDescriptorAccess().getCollectionAssignment_1(), "rule__DmxFilterTypeDescriptor__CollectionAssignment_1");
			builder.put(grammarAccess.getDmxFilterParameterAccess().getNameAssignment_0(), "rule__DmxFilterParameter__NameAssignment_0");
			builder.put(grammarAccess.getDmxFilterParameterAccess().getTypeDescAssignment_2(), "rule__DmxFilterParameter__TypeDescAssignment_2");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_0(), "rule__DRichText__SegmentsAssignment_0");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_0(), "rule__DRichText__SegmentsAssignment_1_0");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_1(), "rule__DRichText__SegmentsAssignment_1_1");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_0(), "rule__DRichText__SegmentsAssignment_1_2_0");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_2_1(), "rule__DRichText__SegmentsAssignment_1_2_1");
			builder.put(grammarAccess.getDRichTextAccess().getSegmentsAssignment_1_3(), "rule__DRichText__SegmentsAssignment_1_3");
			builder.put(grammarAccess.getDmxTextOnlyAccess().getValueAssignment(), "rule__DmxTextOnly__ValueAssignment");
			builder.put(grammarAccess.getDmxTextStartAccess().getValueAssignment(), "rule__DmxTextStart__ValueAssignment");
			builder.put(grammarAccess.getDmxTextMiddleAccess().getValueAssignment(), "rule__DmxTextMiddle__ValueAssignment");
			builder.put(grammarAccess.getDmxTextEndAccess().getValueAssignment(), "rule__DmxTextEnd__ValueAssignment");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getAssignToMemberAssignment_1_0_0_0_2(), "rule__DmxNavigableMemberReference__AssignToMemberAssignment_1_0_0_0_2");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getValueAssignment_1_0_1(), "rule__DmxNavigableMemberReference__ValueAssignment_1_0_1");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getMemberAssignment_1_1_1(), "rule__DmxNavigableMemberReference__MemberAssignment_1_1_1");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getExplicitOperationCallAssignment_1_1_2_0_0(), "rule__DmxNavigableMemberReference__ExplicitOperationCallAssignment_1_1_2_0_0");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getCallArgumentsAssignment_1_1_2_0_1(), "rule__DmxNavigableMemberReference__CallArgumentsAssignment_1_1_2_0_1");
			builder.put(grammarAccess.getDmxNavigableMemberReferenceAccess().getBeforeAssignment_1_1_2_1(), "rule__DmxNavigableMemberReference__BeforeAssignment_1_1_2_1");
			builder.put(grammarAccess.getDmxCallArgumentsAccess().getArgumentsAssignment_1_0(), "rule__DmxCallArguments__ArgumentsAssignment_1_0");
			builder.put(grammarAccess.getDmxCallArgumentsAccess().getArgumentsAssignment_1_1_1(), "rule__DmxCallArguments__ArgumentsAssignment_1_1_1");
			builder.put(grammarAccess.getDmxAssignmentAccess().getAssignToMemberAssignment_1(), "rule__DmxAssignment__AssignToMemberAssignment_1");
			builder.put(grammarAccess.getDmxAssignmentAccess().getValueAssignment_3(), "rule__DmxAssignment__ValueAssignment_3");
			builder.put(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getCorrelationVariableAssignment_0_1(), "rule__DmxPredicateWithCorrelationVariable__CorrelationVariableAssignment_0_1");
			builder.put(grammarAccess.getDmxPredicateWithCorrelationVariableAccess().getPredicateAssignment_0_3(), "rule__DmxPredicateWithCorrelationVariable__PredicateAssignment_0_3");
			builder.put(grammarAccess.getDmxCorrelationVariableAccess().getNameAssignment(), "rule__DmxCorrelationVariable__NameAssignment");
			builder.put(grammarAccess.getDmxOrExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DmxOrExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDmxOrExpressionAccess().getRightOperandAssignment_1_1(), "rule__DmxOrExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDmxAndExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DmxAndExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDmxAndExpressionAccess().getRightOperandAssignment_1_1(), "rule__DmxAndExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDmxEqualityExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DmxEqualityExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDmxEqualityExpressionAccess().getRightOperandAssignment_1_1(), "rule__DmxEqualityExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getTypeAssignment_1_0_1(), "rule__DmxRelationalExpression__TypeAssignment_1_0_1");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getOperatorAssignment_1_1_0_0_1(), "rule__DmxRelationalExpression__OperatorAssignment_1_1_0_0_1");
			builder.put(grammarAccess.getDmxRelationalExpressionAccess().getRightOperandAssignment_1_1_1(), "rule__DmxRelationalExpression__RightOperandAssignment_1_1_1");
			builder.put(grammarAccess.getDmxOtherOperatorExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DmxOtherOperatorExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDmxOtherOperatorExpressionAccess().getRightOperandAssignment_1_1(), "rule__DmxOtherOperatorExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDmxAdditiveExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DmxAdditiveExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDmxAdditiveExpressionAccess().getRightOperandAssignment_1_1(), "rule__DmxAdditiveExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDmxMultiplicativeExpressionAccess().getOperatorAssignment_1_0_0_1(), "rule__DmxMultiplicativeExpression__OperatorAssignment_1_0_0_1");
			builder.put(grammarAccess.getDmxMultiplicativeExpressionAccess().getRightOperandAssignment_1_1(), "rule__DmxMultiplicativeExpression__RightOperandAssignment_1_1");
			builder.put(grammarAccess.getDmxUnaryOperationAccess().getOperatorAssignment_0_1(), "rule__DmxUnaryOperation__OperatorAssignment_0_1");
			builder.put(grammarAccess.getDmxUnaryOperationAccess().getOperandAssignment_0_2(), "rule__DmxUnaryOperation__OperandAssignment_0_2");
			builder.put(grammarAccess.getDmxCastExpressionAccess().getTypeAssignment_1_1(), "rule__DmxCastExpression__TypeAssignment_1_1");
			builder.put(grammarAccess.getDmxListExpressionAccess().getElementsAssignment_2_0(), "rule__DmxListExpression__ElementsAssignment_2_0");
			builder.put(grammarAccess.getDmxListExpressionAccess().getElementsAssignment_2_1_1(), "rule__DmxListExpression__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getDmxLiteralListExpressionAccess().getElementsAssignment_2_0(), "rule__DmxLiteralListExpression__ElementsAssignment_2_0");
			builder.put(grammarAccess.getDmxLiteralListExpressionAccess().getElementsAssignment_2_1_1(), "rule__DmxLiteralListExpression__ElementsAssignment_2_1_1");
			builder.put(grammarAccess.getDmxFunctionCallAccess().getFunctionAssignment_1(), "rule__DmxFunctionCall__FunctionAssignment_1");
			builder.put(grammarAccess.getDmxFunctionCallAccess().getCallArgumentsAssignment_3(), "rule__DmxFunctionCall__CallArgumentsAssignment_3");
			builder.put(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsAssignment_1_0(), "rule__DmxFunctionCallArguments__ArgumentsAssignment_1_0");
			builder.put(grammarAccess.getDmxFunctionCallArgumentsAccess().getArgumentsAssignment_1_1_1(), "rule__DmxFunctionCallArguments__ArgumentsAssignment_1_1_1");
			builder.put(grammarAccess.getDmxComplexObjectAccess().getTypeAssignment_0(), "rule__DmxComplexObject__TypeAssignment_0");
			builder.put(grammarAccess.getDmxComplexObjectAccess().getFieldsAssignment_2(), "rule__DmxComplexObject__FieldsAssignment_2");
			builder.put(grammarAccess.getDmxFieldAccess().getFeatureAssignment_0(), "rule__DmxField__FeatureAssignment_0");
			builder.put(grammarAccess.getDmxFieldAccess().getValueAssignment_2(), "rule__DmxField__ValueAssignment_2");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getTargetAssignment_2(), "rule__DmxStaticReference__TargetAssignment_2");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getMemberAssignment_3_1(), "rule__DmxStaticReference__MemberAssignment_3_1");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getDisplayNameAssignment_4_1_0(), "rule__DmxStaticReference__DisplayNameAssignment_4_1_0");
			builder.put(grammarAccess.getDmxStaticReferenceAccess().getPluralAssignment_4_1_1(), "rule__DmxStaticReference__PluralAssignment_4_1_1");
			builder.put(grammarAccess.getDmxContextReferenceAccess().getTargetAssignment_1(), "rule__DmxContextReference__TargetAssignment_1");
			builder.put(grammarAccess.getDmxContextReferenceAccess().getBeforeAssignment_2_0(), "rule__DmxContextReference__BeforeAssignment_2_0");
			builder.put(grammarAccess.getDmxContextReferenceAccess().getAllAssignment_2_1_1(), "rule__DmxContextReference__AllAssignment_2_1_1");
			builder.put(grammarAccess.getDmxIfExpressionAccess().getIfAssignment_2(), "rule__DmxIfExpression__IfAssignment_2");
			builder.put(grammarAccess.getDmxIfExpressionAccess().getThenAssignment_4(), "rule__DmxIfExpression__ThenAssignment_4");
			builder.put(grammarAccess.getDmxIfExpressionAccess().getElseAssignment_5_1(), "rule__DmxIfExpression__ElseAssignment_5_1");
			builder.put(grammarAccess.getDMultiplicityAccess().getShorthandAssignment_0(), "rule__DMultiplicity__ShorthandAssignment_0");
			builder.put(grammarAccess.getDMultiplicityAccess().getMinOccursAssignment_1_1(), "rule__DMultiplicity__MinOccursAssignment_1_1");
			builder.put(grammarAccess.getDMultiplicityAccess().getMaxOccursAssignment_1_3(), "rule__DMultiplicity__MaxOccursAssignment_1_3");
			builder.put(grammarAccess.getDmxBooleanLiteralAccess().getValueAssignment_1_0(), "rule__DmxBooleanLiteral__ValueAssignment_1_0");
			builder.put(grammarAccess.getDmxBooleanLiteralAccess().getValueAssignment_1_1(), "rule__DmxBooleanLiteral__ValueAssignment_1_1");
			builder.put(grammarAccess.getDmxNaturalLiteralAccess().getValueAssignment_1(), "rule__DmxNaturalLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getDmxDecimalLiteralAccess().getValueAssignment_1(), "rule__DmxDecimalLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getDmxStringLiteralAccess().getValueAssignment_1(), "rule__DmxStringLiteral__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DomGrammarAccess grammarAccess;

	@Override
	protected InternalDomParser createParser() {
		InternalDomParser result = new InternalDomParser(null);
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

	public DomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
