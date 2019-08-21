package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DLiteral
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DNotification
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DState
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.DmxArchetype
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxBinaryOperation
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
import com.mimacom.ddd.dm.dmx.DmxCastExpression
import com.mimacom.ddd.dm.dmx.DmxConstructorCall
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxCorrelationVariable
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxFilterTypeDescriptor
import com.mimacom.ddd.dm.dmx.DmxFunctionCall
import com.mimacom.ddd.dm.dmx.DmxIfExpression
import com.mimacom.ddd.dm.dmx.DmxInstanceOfExpression
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
import com.mimacom.ddd.dm.dmx.DmxStaticReference
import com.mimacom.ddd.dm.dmx.DmxStringLiteral
import com.mimacom.ddd.dm.dmx.DmxUnaryOperation
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
import com.mimacom.ddd.dm.dmx.DmxUtil
import java.util.List

@Singleton
class DmxTypeComputer {

	@Inject extension DmxUtil util

	public static val VOID = new DmxVoidDescriptor
	public static val UNDEFINED = new DmxUndefinedDescriptor
	public static val BOOLEAN = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, false)
	public static val BOOLEAN_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, true)
	public static val NUMBER = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, false)
	public static val NUMBER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, true)
	public static val TEXT = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, false)
	public static val TEXT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, true)
	public static val IDENTIFIER = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, false)
	public static val IDENTIFIER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, true)
	public static val TIMEPOINT = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, false)
	public static val TIMEPOINT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, true)

	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxMemberNavigation expr) {
		val member = expr.member

		if (member instanceof DmxFilter) {
			val returnType = member.typeDesc
			if (returnType.isCompatible(DmxBaseType.COMPLEX /* ignore collection property */ ) || member.typeDesc.isMultiTyped) {
//				// propagate type from preceding navigation segment: (this may differ from the actually decared type of the first parameter)
//				val preceding = expr.precedingNavigationSegment
//				val precedingTypeDesc = preceding.typeFor // recursion
//				return getTypeDescriptor(precedingTypeDesc.type, member.typeDesc.collection)

				// propagate actual type of the first COMPLEX declared parameter (if compatible) or the first multi-valued declared parameter:
				val actualParameters = expr.nullSafeCallArguments
				for(var i=0; i< member.parameters.size; i++ ) {
					val paramDeclaredType = member.parameters.get(i).typeDesc
					if (returnType.isCompatible(DmxBaseType.COMPLEX) && (paramDeclaredType).isCompatible(DmxBaseType.COMPLEX) || paramDeclaredType.isMultiTyped) {
						var AbstractDmxTypeDescriptor<?> paramActualType
						 if (i == 0) {
							val preceding = expr.precedingNavigationSegment
							paramActualType = preceding.typeFor // recursion
						} else if (i-1 < actualParameters.size) {  // -1 because first parameter value is implicit (navigation chain)
							 paramActualType = actualParameters.get(i-1).typeFor // recursion
						} else {
							return UNDEFINED
						}
						if (paramDeclaredType.isCompatible(paramActualType.baseType,  paramActualType.collection)) {
							return getTypeDescriptor(paramActualType.type, returnType.collection)
						}
						return UNDEFINED
					}
				}

			} else if (member.typeDesc.isCompatible(DmxBaseType.STATE)) {
			// propagate type from preceding navigation segment: (this must be an DEntityType)
				val preceding = expr.precedingNavigationSegment
				val precedingTypeDesc = preceding.typeFor // recursion
				val precedingType = precedingTypeDesc.type
				if (precedingType instanceof DEntityType) {
					if (! precedingType.states.empty) {
						// take the first state to construct a matching type descriptor:
						return getTypeDescriptor(precedingType.states.get(0), false)
					}
				}
				return UNDEFINED
				
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
						val desc = preceding.typeFor // recursion
						// the type derived vor correlation Varibles inside a DmxPredicateWithCorrelationVariable block is usually the type of the collection on which the
						// enclosing iterator is applied => is a collection type, but correlation variable is a single object:
						desc.collection = false
						return desc
				 	}
				 } else if (container instanceof DType) {
				 	return container.getTypeDescriptor(false)
				 }
				container = container.eContainer
			}
			return UNDEFINED	
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
			case UNTIL: BOOLEAN // TODO
			case SINGLE_ARROW: BOOLEAN // TODO
			case DOUBLE_ARROW: BOOLEAN // logical "implies"
			case ADD: NUMBER // TODO consider STRING
			case SUBTRACT: NUMBER
			case MULTIPLY: NUMBER
			case DIVIDE: NUMBER
			case POWER: NUMBER
			case MODULO: NUMBER
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
							val paramActualType = actualParameters.get(i).typeFor // recursion
							if (paramDeclaredType.isCompatible(paramActualType.baseType,  paramActualType.collection)) {
								return getTypeDescriptor(paramActualType.type, returnType.collection)
							}
						}
						return UNDEFINED
					}
				}
	
			} else {
				return getTypeDescriptor(returnType.single, returnType.collection)
			}
		}
		UNDEFINED
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
		UNDEFINED
	}
	
	
	def List<AbstractDmxTypeDescriptor<?>> getTypeDescriptors(DmxFilterTypeDescriptor desc) {
		val result = Lists.newArrayList
		if (desc.multiTyped) {
			for(d : desc.multiple.members) {
				result.add(getBaseTypeDescriptor(d, desc.collection))
			}
		} else {
			result.add(getBaseTypeDescriptor(desc.single, desc.collection))
		}
		return result
	}

	def AbstractDmxTypeDescriptor<?> getTypeDescriptor(Object obj, boolean collection) {
		switch obj {
			DmxBaseType: getBaseTypeDescriptor(obj, collection)
			DmxArchetype: new DmxPrimitiveDescriptor(obj, collection)
			DPrimitive: new DmxPrimitiveDescriptor(obj, collection)
			DEnumeration: new DmxEnumerationDescriptor(obj)
			DComplexType: new DmxComplexTypeDescriptor(obj, collection, util)
			DState: new DmxStateDescriptor(obj)
			DAggregate: new DmxAggregateDescriptor(obj)
			DNotification: new DmxNotificationDescriptor(obj)
			default: UNDEFINED
		}
	}

	private def AbstractDmxTypeDescriptor<?> getBaseTypeDescriptor(DmxBaseType t, boolean collection) {
		switch t {
			case DmxBaseType::VOID: VOID
			case DmxBaseType::BOOLEAN: if (collection) BOOLEAN_COLLECTION else BOOLEAN
			case DmxBaseType::NUMBER: if (collection) NUMBER_COLLECTION else NUMBER
			case DmxBaseType::TEXT: if (collection) TEXT_COLLECTION else TEXT
			case DmxBaseType::IDENTIFIER: if (collection) IDENTIFIER_COLLECTION else IDENTIFIER
			case DmxBaseType::TIMEPOINT: if (collection) TIMEPOINT_COLLECTION else TIMEPOINT
			case DmxBaseType::STATE:  throw new IllegalArgumentException("State type descriptors must be created based on a DState object")
			default: throw new IllegalArgumentException(t.toString)
		}
	}
}
