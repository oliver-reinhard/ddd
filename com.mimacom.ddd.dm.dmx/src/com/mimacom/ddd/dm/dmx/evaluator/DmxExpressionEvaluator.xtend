package com.mimacom.ddd.dm.dmx.evaluator

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
import com.mimacom.ddd.dm.dmx.DmxCastExpression
import com.mimacom.ddd.dm.dmx.DmxDateLiteral
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
import com.mimacom.ddd.dm.dmx.DmxStringLiteral
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider
import java.math.BigDecimal
import java.util.Date
import java.util.List

@Singleton
class DmxExpressionEvaluator {

	@Inject extension DmxTypeDescriptorProvider
	@Inject extension DmxTypeComputer
//	@Inject extension DmxUtil util

	public static final String UNDEFINED_VALUE = "UNDEFINED"
	
//	def dispatch Object valueFor(DmxMemberNavigation expr) {
//		val member = expr.member
//
//		if (member instanceof DmxFilter) {
//			val returnType = member.typeDesc
//			if (returnType.isCompatible(DmxBaseType.COMPLEX /* ignore collection property */ ) || member.typeDesc.isMultiTyped) {
////				// propagate type from preceding navigation segment: (this may differ from the actually decared type of the first parameter)
////				val preceding = expr.precedingNavigationSegment
////				val precedingTypeDesc = getTypeAndCheckNotNull(preceding) // recursion
////				return getTypeDescriptor(precedingTypeDesc.type, member.typeDesc.collection)
//
//				// propagate actual type of the first COMPLEX declared parameter (if compatible) or the first multi-valued declared parameter:
//				val actualParameters = expr.nullSafeCallArguments
//				for(var i=0; i< member.parameters.size; i++ ) {
//					val paramDeclaredType = member.parameters.get(i).typeDesc
//					if (returnType.isCompatible(DmxBaseType.COMPLEX) && (paramDeclaredType).isCompatible(DmxBaseType.COMPLEX) || paramDeclaredType.isMultiTyped) {
//						var AbstractDmxTypeDescriptor<?> paramActualType
//						 if (i == 0) {
//							val preceding = expr.precedingNavigationSegment
//							paramActualType = typeForAndCheckNotNull(preceding)// recursion
//						} else if (i-1 < actualParameters.size) {  // -1 because first parameter value is implicit (navigation chain)
//							 paramActualType = typeForAndCheckNotNull(actualParameters.get(i-1))// recursion
//						} else {
//							return UNDEFINED_TYPE
//						}
//						if (paramDeclaredType.isCompatible(paramActualType.baseType,  paramActualType.collection)) {
//							return getTypeDescriptor(paramActualType.type, returnType.collection)
//						}
//						return UNDEFINED_TYPE
//					}
//				}
//
//			} else if (member.typeDesc.isCompatible(DmxBaseType.STATE)) {
//			// propagate type from preceding navigation segment: (this must be an DEntityType)
//				val preceding = expr.precedingNavigationSegment
//				val precedingTypeDesc = typeForAndCheckNotNull(preceding) // recursion
//				val precedingType = precedingTypeDesc.type
//				if (precedingType instanceof DEntityType) {
//					if (! precedingType.states.empty) {
//						// take the first state to construct a matching type descriptor:
//						return getTypeDescriptor(precedingType.states.get(0), false)
//					}
//				}
//				return UNDEFINED_TYPE
//				
//			} else {
//				return getTypeDescriptor(member.typeDesc.single, member.typeDesc.collection)
//			}
//
//		} else if (member instanceof DLiteral) {
//			// Type of a literal is always null => its type is its containing DEnumeration
//			return getTypeDescriptor(member.eContainer, member.isCollection)
//			
//		} else if (member instanceof DState) {
//			return member
//		}
//		return getTypeDescriptor(member.type, member.isCollection)
//	}

	def dispatch Object valueFor(DExpression e) {
		switch (e) {
			DmxBooleanLiteral: e.value
			DmxStringLiteral: e.value
			DmxNaturalLiteral: new BigDecimal(e.value)
			DmxDecimalLiteral: new BigDecimal(e.value)
			DmxDateLiteral: e.value
			DmxUndefinedLiteral: UNDEFINED_VALUE
		}
	}

	def dispatch Object valueFor(DmxBinaryOperation expr) {
		val leftValue = valueForAndCheckNotNull(expr.leftOperand)
		val rightValue = valueForAndCheckNotNull(expr.rightOperand)

		if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
			val left = leftValue as Boolean
			val right = rightValue as Boolean

			val value = switch expr.operator {
				case OR: left || right
				case XOR: left && ! right || ! left && right
				case AND: left && right
				case EQUAL: left == right
				case NOT_EQUAL: left != right
				case LESS: left < right
				case LESS_OR_EQUAL: left <= right
				case GREATER_OR_EQUAL: left >= right
				case GREATER: left > right
				case DOUBLE_ARROW: ! left || right // logical "implies"
				//
				case IN: UNDEFINED_VALUE // TODO
				//
				default: throw new IllegalArgumentException(expr.operator.literal)
			}
			return value

		} else if (leftValue instanceof BigDecimal && rightValue instanceof BigDecimal) {
			val left = leftValue as BigDecimal
			val right = rightValue as BigDecimal

			val value = switch expr.operator {
				case ADD: left + right
				case SUBTRACT: left - right
				case MULTIPLY: left * right
				case DIVIDE: left / right
				case POWER: left.pow(right.intValue)
				case MODULO: left.remainder(right)
				//
				case UNTIL: UNDEFINED_VALUE
				case SINGLE_ARROW: UNDEFINED_VALUE
				//
				default: throw new IllegalArgumentException(expr.operator.literal)
			}
			return value

		} else if (leftValue instanceof String && rightValue instanceof String) {
			val left = leftValue as String
			val right = rightValue as String

			val value = switch expr.operator {
				case ADD: left + right
				//
				default: throw new IllegalArgumentException(expr.operator.literal)
			}
			return value

		} else if (leftValue instanceof DState && rightValue instanceof DState) {
			val left = leftValue as DState
			val right = rightValue as DState

			val value = switch expr.operator {
				case EQUAL: left == right
				//
				default: throw new IllegalArgumentException(expr.operator.literal)
			}
			return value

		} else if (leftValue instanceof Date && rightValue instanceof BigDecimal) {
			val left = leftValue as Date
			val right = rightValue as BigDecimal

			val value = switch expr.operator {
				case ADD: new Date(left.time + right.intValue)
				default: throw new IllegalArgumentException(expr.operator.literal)
			}
			return value

		} else if (! (leftValue instanceof List<?>) && rightValue instanceof List<?>) {
			val right = rightValue as List<?>

			switch expr.operator {
				case IN: {
					for (i : right) {
						if (i == leftValue) {
							return true
						}
					}
					return false
				}
				default:
					throw new IllegalArgumentException(expr.operator.literal)
			}

		} 
		return UNDEFINED_VALUE
	}

	def dispatch Object valueFor(DmxUnaryOperation expr) {
		val operandValue = valueForAndCheckNotNull(expr.operand)
		switch expr.operator {
			case PLUS: operandValue
			case MINUS: if (operandValue instanceof BigDecimal) -(operandValue as BigDecimal) else UNDEFINED_VALUE
			case NOT: if (operandValue instanceof Boolean) ! (operandValue as Boolean) else UNDEFINED_VALUE
			default: throw new IllegalArgumentException(expr.operator.literal)
		}
	}

	def dispatch Object valueFor(DmxCastExpression expr) {
		val exprTypeDesc = typeForAndCheckNotNull(expr.target)
		val castToTypeDesc = getTypeDescriptor(expr.type, false)
		if (exprTypeDesc.isCompatibleWith(castToTypeDesc)) {
			return valueForAndCheckNotNull(expr.target)
		}
		return UNDEFINED_VALUE
	}

	// Return Boolean
	def dispatch Object valueFor(DmxInstanceOfExpression expr) {
		val exprTypeDesc = typeForAndCheckNotNull(expr.expression)
		val otherTypeDesc = getTypeDescriptor(expr.type, false)
		return exprTypeDesc.isCompatibleWith(otherTypeDesc)
	}

	private def Object valueForAndCheckNotNull(DExpression expr) {
		val value = expr?.valueFor
		if (value === null) {
			return UNDEFINED_VALUE
		}
		return value
	}
}
