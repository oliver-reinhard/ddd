package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Sets
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DExpression
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DNotification
import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxAssignment
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
import com.mimacom.ddd.dm.dmx.DmxCastExpression
import com.mimacom.ddd.dm.dmx.DmxComplexObject
import com.mimacom.ddd.dm.dmx.DmxConstructorCall
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
import com.mimacom.ddd.dm.dmx.DmxField
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxFunctionCall
import com.mimacom.ddd.dm.dmx.DmxIfExpression
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression
import com.mimacom.ddd.dm.dmx.DmxListExpression
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.dm.dmx.DmxStringLiteral
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
import com.mimacom.ddd.dm.dmx.DmxUtil

import static com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeDescriptorProvider.*

@Singleton
class DmxTypeComputer {

	@Inject extension DmxUtil util
	@Inject extension DmxTypeDescriptorProvider

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxMemberNavigation expr) {
		val member = expr.member

		if (member instanceof DmxFilter) {
			val returnType = member.typeDesc
			if (returnType.isCompatible(DmxBaseType.COMPLEX /* ignore collection property */ ) || member.typeDesc.isMultiTyped) {
//				// propagate type from preceding navigation segment: (this may differ from the actually decared type of the first parameter)
//				val preceding = expr.precedingNavigationSegment
//				val precedingTypeDesc = getTypeAndCheckNotNull(preceding) // recursion
//				return getTypeDescriptor(precedingTypeDesc.type, member.typeDesc.collection)

				// propagate actual type of the first COMPLEX declared parameter (if compatible) or the first multi-valued declared parameter:
				val actualParameters = expr.nullSafeCallArguments
				for(var i=0; i< member.parameters.size; i++ ) {
					val paramDeclaredType = member.parameters.get(i).typeDesc
					if (returnType.isCompatible(DmxBaseType.COMPLEX) && (paramDeclaredType).isCompatible(DmxBaseType.COMPLEX) || paramDeclaredType.isMultiTyped) {
						var AbstractDmxTypeDescriptor<?> paramActualType
						 if (i == 0) {
							val preceding = expr.precedingNavigationSegment
							paramActualType = typeForAndCheckNotNull(preceding)// recursion
						} else if (i-1 < actualParameters.size) {  // -1 because first parameter value is implicit (navigation chain)
							 paramActualType = typeForAndCheckNotNull(actualParameters.get(i-1))// recursion
						} else {
							return UNDEFINED_TYPE
						}
						if (paramDeclaredType.isCompatible(paramActualType.baseType,  paramActualType.collection)) {
							return getTypeDescriptor(paramActualType.type, returnType.collection)
						}
						return UNDEFINED_TYPE
					}
				}

			} else if (member.typeDesc.isCompatible(DmxBaseType.STATE)) {
			// propagate type from preceding navigation segment: (this must be an DEntityType)
				val preceding = expr.precedingNavigationSegment
				val precedingTypeDesc = typeForAndCheckNotNull(preceding) // recursion
				val precedingType = precedingTypeDesc.type
				if (precedingType instanceof DEntityType) {
					if (! precedingType.states.empty) {
						// take the first state to construct a matching type descriptor:
						return getTypeDescriptor(precedingType.states.get(0), false)
					}
				}
				return UNDEFINED_TYPE
				
			} else {
				return getTypeDescriptor(member.typeDesc.single, member.typeDesc.collection)
			}

		} else if (member instanceof DLiteral) {
			// Type of a literal is always null => its type is its containing DEnumeration
			return getTypeDescriptor(member.eContainer, member.isCollection)
			
		} else if (member instanceof DState) {
			return getTypeDescriptor(member, false)
		}
		return getTypeDescriptor(member.type, member.isCollection)
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxContextReference expr) {
		return typeForSwitch(expr)
	}
		
	/* Non-dispatching; use to override */
	def AbstractDmxTypeDescriptor<?> typeForSwitch(DmxContextReference expr) {
		val target = expr.target

		if (target instanceof DContext) {
			return getTypeDescriptor(target.type, target.isCollection)
			
		} else if (target instanceof DmxCorrelationVariable) {
			val desc =  target.typeFor
			return desc

		} else if (target instanceof DAggregate) {
			return getTypeDescriptor(target, false)

		} else if (target instanceof DNotification) {
			return getTypeDescriptor(target, false)

		} else if (target instanceof DNavigableMember) {
			return getTypeDescriptor(target.type, expr.all)

		} else {
			return getTypeDescriptor(target, expr.all)
		}
	}

	def  dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxCorrelationVariable target) {
		// Correlation variables only occur inside DmxPredicateWithCorrelationVariable.
		// Predicates occur in
		// - filters (DFilter)
		// - constraints on DType
		// which determine the type of the correlation variable.
		var container = target.eContainer
			while (container !== null) {
				 if (container instanceof DmxMemberNavigation) {
				 	if (container.member instanceof DmxFilter) {
					 	val preceding = container.precedingNavigationSegment
						val desc = typeForAndCheckNotNull(preceding) // recursion
						// the type derived vor correlation Varibles inside a DmxPredicateWithCorrelationVariable block is usually the type of the collection on which the
						// enclosing iterator is applied => is a collection type, but correlation variable is a single object:
						return desc.toFromCollection(false)
				 	}
				 } else if (container instanceof DType) {
				 	return container.getTypeDescriptor(false)
				 }
				container = container.eContainer
			}
			return UNDEFINED_TYPE	
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxStaticReference expr) {
		VOID
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxPredicateWithCorrelationVariable expr) {
		BOOLEAN
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxBinaryOperation expr) {
		switch expr.operator {
			case OR: BOOLEAN
			case XOR: BOOLEAN
			case AND: BOOLEAN
			case EQUAL: BOOLEAN
			case NOT_EQUAL: BOOLEAN
			case LESS: BOOLEAN
			case LESS_OR_EQUAL: BOOLEAN
			case GREATER_OR_EQUAL: BOOLEAN
			case GREATER: BOOLEAN
			//
			case ADD,
			case SUBTRACT: {
				// left type determines the type of the expression and the expected type(s) of the right operand:
				val leftType = typeForAndCheckNotNull(expr.leftOperand)
				return switch leftType.baseType {
					case TIMEPOINT : TIMEPOINT
					case TEXT : TEXT
					default:  NUMBER
				} 
			}
			case MULTIPLY: NUMBER
			case DIVIDE: NUMBER
			case POWER: NUMBER
			case MODULO: NUMBER
			//
			case IN: BOOLEAN
			case UNTIL: VOID
			case SINGLE_ARROW: VOID // TODO
			case DOUBLE_ARROW: BOOLEAN // logical "implies"
			//
			default: throw new IllegalArgumentException(expr.operator.literal)
		}
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxUnaryOperation expr) {
		switch expr.operator {
			case PLUS: NUMBER
			case MINUS: NUMBER
			case NOT: BOOLEAN
			default: throw new IllegalArgumentException(expr.operator.literal)
		}
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxCastExpression expr) {
		getTypeDescriptor(expr.type, false)
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxInstanceOfExpression expr) {
		BOOLEAN
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxFunctionCall expr) { // explicit function call
		val DmxFilter filter = expr.function
		if (filter !== null) {
			val returnType = filter.typeDesc
			if (filter.parameters.size == 0) {
				// return type cannot (and does not) depend on parameters:
				return getTypeDescriptor(returnType.single, returnType.collection)
			}
			val actualParameters = expr.nullSafeCallArguments
			
			if (returnType.isCompatible(DmxBaseType.COMPLEX /* ignore collection property */) || returnType.isMultiTyped) {
				// propagate actual type of the first COMPLEX declared parameter (if compatible) or the first multi-valued declared parameter:
				for(var i=0; i< filter.parameters.size; i++ ) {
					val paramDeclaredType = filter.parameters.get(i).typeDesc
					if (returnType.isCompatible(DmxBaseType.COMPLEX) && (paramDeclaredType).isCompatible(DmxBaseType.COMPLEX) || paramDeclaredType.isMultiTyped) {
						if (i < actualParameters.size) {
							val paramActualType = typeForAndCheckNotNull(actualParameters.get(i)) // recursion
							if (paramDeclaredType.isCompatible(paramActualType.baseType,  paramActualType.collection)) {
								return getTypeDescriptor(paramActualType.type, returnType.collection)
							}
						}
						return UNDEFINED_TYPE
					}
				}
	
			} else {
				return getTypeDescriptor(returnType.single, returnType.collection)
			}
		}
		UNDEFINED_TYPE
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxAssignment expr) { 
		return VOID
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxListExpression expr) {
		if (expr.elements.empty) return UNDEFINED_TYPE
		val typeDescs = Sets.newHashSet
		for (e : expr.elements) {
			typeDescs.add(typeForAndCheckNotNull(e))
		}
		if (typeDescs.size == 1) {
			val result =  typeDescs.head.toFromCollection(true)
			return result
		}
		return AMBIGUOUS_TYPE
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxConstructorCall expr) {
		getTypeDescriptor(expr.constructor, false)
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxIfExpression expr) {
		throw new UnsupportedOperationException // TODO
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxBooleanLiteral expr) {
		BOOLEAN
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxStringLiteral expr) {
		TEXT
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxNaturalLiteral expr) {
		NUMBER
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxDecimalLiteral expr) {
		NUMBER
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxUndefinedLiteral expr) {
		UNDEFINED_TYPE
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxComplexObject expr) {
		if (expr.type === null) return UNDEFINED_TYPE
		return getTypeDescriptor(expr.type, false)
	}

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxField expr) {
		if (expr.feature === null || expr.feature.type === null) return UNDEFINED_TYPE
		return getTypeDescriptor(expr.feature.type, expr.feature.collection)
	}
	
	def AbstractDmxTypeDescriptor<?> typeForAndCheckNotNull(DExpression expr) {
		val type = expr?.typeFor
		if (type === null) {
			return UNDEFINED_TYPE
		}
		return type
	}
}
