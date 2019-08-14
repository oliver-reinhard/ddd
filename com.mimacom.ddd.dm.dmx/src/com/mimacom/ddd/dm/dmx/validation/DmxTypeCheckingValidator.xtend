/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.validation

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.mimacom.ddd.dm.base.BasePackage
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DFeature
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation
import com.mimacom.ddd.dm.dmx.DmxCallArguments
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxFunctionCall
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxPackage
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation
import com.mimacom.ddd.dm.dmx.DmxUtil
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check

import static com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer.*

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DmxTypeCheckingValidator extends AbstractDmxValidator {

	@Inject extension DmxTypeComputer
	@Inject extension DmxUtil

	protected static val BASE = BasePackage.eINSTANCE
	protected static val DMX = DmxPackage.eINSTANCE

	static val TYPE_MISMATCH = "Type Mismatch"
	static val COMPARABLE_TYPES = (Lists.newArrayList(NUMBER, TEXT, TIMEPOINT) as Object) as List<AbstractDmxTypeDescriptor<?>>

	@Check
	def checkFeatureNavigationOfCollection(DmxMemberNavigation nav) {
		val member = nav.member
		if (member instanceof DFeature) {
			val preceding = nav.precedingNavigationSegment
			val type = getTypeAndCheckNotNull(preceding, DMX.dmxMemberNavigation_PrecedingNavigationSegment)
			if (type.isCollection) {
				error("Cannot navigate a feature of a collection of objects.", nav, DMX.dmxMemberNavigation_Member)
			}
		}
	}

	@Check
	def checkQueryParameters(DmxMemberNavigation actual) {
		val formal = actual.member
		if (formal instanceof DQuery) {
			val actualParameters = actual.nullSafeCallArguments
			
			for (var fIndex = 0; fIndex < formal.parameters.size; fIndex++) {
				val aIndex = fIndex
				if (aIndex < actualParameters.size) {
					val formalParamType = formal.parameters.get(fIndex).type
					val expectedType = if (formalParamType !== null) {
							formalParamType.getTypeDescriptor(formal.parameters.get(fIndex).collection)
						} else {
							UNDEFINED
						}
					expectType(actualParameters.get(aIndex), expectedType, DMX.dmxCallArguments_Arguments)

				} else if (aIndex == actualParameters.size) {
					errorParameterValuesMissing(actual, actual.callArguments, aIndex)
				}
			}
			checkTooManyActualParameters(formal.parameters.size, actual.callArguments)
		}
	}

	@Check
	def checkFilterParameters(DmxMemberNavigation actual) {
		val formal = actual.member
		if (formal instanceof DmxFilter) {
			val actualParameters = actual.nullSafeCallArguments
			// the first formal parameter (index 0) is not passed as a value but is the preceding segment in the navigation.
			// => match formal(1) with actual(0), formal(2) with actual(1), etc.
			for (var fIndex = 1; fIndex < formal.parameters.size; fIndex++) {
				val aIndex = fIndex - 1
				if (aIndex < actualParameters.size) {
					expectFilterParameterType(formal, fIndex, actualParameters, aIndex, DMX.dmxMemberNavigation_CallArguments)

				} else if (aIndex == actualParameters.size) {
					errorParameterValuesMissing(actual, actual.callArguments, aIndex)
				}
			}
			checkTooManyActualParameters(formal.parameters.size - 1, actual.callArguments)
		}
	}

	@Check
	def checkFunctionParameters(DmxFunctionCall actual) {
		val DmxFilter formal = actual.function
		if (formal !== null) {
			val actualParameters = actual.nullSafeCallArguments
			for (var fIndex = 0; fIndex < formal.parameters.size; fIndex++) {
				val aIndex = fIndex
				if (fIndex < actualParameters.size) {
					expectFilterParameterType(formal, fIndex, actualParameters, aIndex, DMX.dmxFunctionCall_CallArguments)

				} else if (fIndex == actualParameters.size) {
					errorParameterValuesMissing(actual, actual.callArguments, aIndex)
				}
			}
			checkTooManyActualParameters(formal.parameters.size, actual.callArguments)
		}
	}
	
	protected def boolean expectFilterParameterType(DmxFilter formal, int fIndex, List<DExpression> actualParameters, int aIndex, EReference ref) {
		val formalParamTypeDesc = formal.parameters.get(fIndex).typeDesc
		val actualType = getTypeAndCheckNotNull(actualParameters.get(aIndex), ref)
		expectType(actualType, formalParamTypeDesc.typeDescriptors, ref)
	}
	
	protected def void errorParameterValuesMissing(EObject context, DmxCallArguments actualParameters, int aIndex) {
		val message = "Mandatory parameter values missing."
		if (actualParameters === null || actualParameters.arguments.empty) {
			switch context {
				DmxMemberNavigation: error(message, context, DMX.dmxMemberNavigation_Member)
				DmxFunctionCall: error(message, context, DMX.dmxFunctionCall_Function)
				default: throw new IllegalArgumentException(context.eClass.name)
			}
			
		} else {
			error(message, actualParameters, DMX.dmxCallArguments_Arguments, aIndex - 1)
		} 
	}
	
	protected def void checkTooManyActualParameters(int formalParametersSize, DmxCallArguments actualParameters) {
		if (actualParameters !== null) {
			for (var aIndex = formalParametersSize; aIndex < actualParameters.arguments.size; aIndex++) {
				error("More actual parameters than formal parameters.", actualParameters, DMX.dmxCallArguments_Arguments, aIndex)
			}	
		}
	}

	def checkType(DmxPredicateWithCorrelationVariable expr) {
		expectBoolean(expr.predicate, DMX.dmxPredicateWithCorrelationVariable_Predicate)
	}

	@Check
	def checkType(DmxBinaryOperation expr) {
		val leftType = getTypeAndCheckNotNull(expr.leftOperand, DMX.dmxBinaryOperation_LeftOperand)
		switch expr.operator {
			case OR,
			case XOR,
			case AND,
			case DOUBLE_ARROW /* logical "implies" */ : {
				expectBoolean(expr.leftOperand, DMX.dmxBinaryOperation_LeftOperand)
				expectBoolean(expr.rightOperand, DMX.dmxBinaryOperation_RightOperand)
			}
			case EQUAL,
			case NOT_EQUAL: {
				// left and right types have to be compatible but no restriction on what kind of type
				expectType(expr.rightOperand, leftType, DMX.dmxBinaryOperation_RightOperand)
			}
			case LESS,
			case LESS_OR_EQUAL,
			case GREATER_OR_EQUAL,
			case GREATER: {
				if (expectType(leftType, COMPARABLE_TYPES, DMX.dmxBinaryOperation_LeftOperand)) {
					expectType(expr.rightOperand, leftType, DMX.dmxBinaryOperation_RightOperand)
				} else {
					val rightType = getTypeAndCheckNotNull(expr.rightOperand, DMX.dmxBinaryOperation_RightOperand)
					expectType(rightType, COMPARABLE_TYPES, DMX.dmxBinaryOperation_LeftOperand)
				}
			}
			case ADD: { // TODO consider STRING
				expectNumber(expr.leftOperand, DMX.dmxBinaryOperation_LeftOperand)
				expectNumber(expr.rightOperand, DMX.dmxBinaryOperation_RightOperand)
			}
			case SUBTRACT,
			case MULTIPLY,
			case DIVIDE,
			case POWER,
			case MODULO: {
				expectNumber(expr.leftOperand, DMX.dmxBinaryOperation_LeftOperand)
				expectNumber(expr.rightOperand, DMX.dmxBinaryOperation_RightOperand)
			}
			case SINGLE_ARROW: {
				throw new UnsupportedOperationException(expr.operator.literal) // TODO
			}
			case UNTIL: {
				throw new UnsupportedOperationException(expr.operator.literal) // TODO
			}
		}
	}

	@Check
	def checkType(DmxUnaryOperation expr) {
		val expectedType = getTypeAndCheckNotNull(expr, DMX.dmxUnaryOperation_Operand)
		expectType(expr.operand, expectedType, DMX.dmxUnaryOperation_Operand) // Note: unary operator: not applicable to STRING
	}

	private def expectBoolean(DExpression expr, EReference ref) {
		return expectType(expr, BOOLEAN, ref)
	}

	private def expectNumber(DExpression expr, EReference ref) {
		return expectType(expr, NUMBER, ref)
	}

	private def expectType(DExpression expr, AbstractDmxTypeDescriptor<?> expectedType, EReference ref) {
		val actualType = getTypeAndCheckNotNull(expr, ref)
		if (expectedType.isCompatibleWith(actualType)) {
			return true
		}
		error("Expected " + expectedType.displayName + " type, but was " + actualType.displayName, ref, TYPE_MISMATCH)
		return false
	}

	private def expectType(AbstractDmxTypeDescriptor<?> actualType, List<AbstractDmxTypeDescriptor<?>> expectedTypes, EReference ref) {
		for (e : expectedTypes) {
			if (e.isCompatibleWith(actualType)) {
				return true
			}
		}
		error("Expected one of " + expectedTypes.map[displayName] + " types, but was " + actualType.displayName, ref, TYPE_MISMATCH)
		return false
	}

	private def AbstractDmxTypeDescriptor<?> getTypeAndCheckNotNull(DExpression expr, EReference ref) {
		val type = expr?.typeFor
		if (type === null) {
			error("Undefined type", ref, TYPE_MISMATCH)
			return DmxTypeComputer::UNDEFINED
		}
		return type
	}
}
