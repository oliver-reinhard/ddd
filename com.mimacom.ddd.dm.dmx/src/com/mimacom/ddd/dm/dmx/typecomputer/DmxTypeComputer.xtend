package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DNamedElement
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DNotification
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.dmx.DmxArchetype
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxBooleanLiteral
import com.mimacom.ddd.dm.dmx.DmxCastExpression
import com.mimacom.ddd.dm.dmx.DmxConstructorCall
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxDecimalLiteral
import com.mimacom.ddd.dm.dmx.DmxFunctionCall
import com.mimacom.ddd.dm.dmx.DmxIterator
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxNaturalLiteral
import com.mimacom.ddd.dm.dmx.DmxPredicateWithCorrelationVariable
import com.mimacom.ddd.dm.dmx.DmxSelfExpression
import com.mimacom.ddd.dm.dmx.DmxStringLiteral
import com.mimacom.ddd.dm.dmx.DmxUndefinedLiteral
import com.mimacom.ddd.dm.dmx.DmxUtil
import org.eclipse.emf.ecore.EObject

@Singleton
class DmxTypeComputer {
	
	 @Inject DmxUtil util
	
	static val VOID = new DmxVoidDescriptor
	static val UNDEFINED = new DmxUndefinedDescriptor
	static val BOOLEAN = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN)
	static val NUMBER = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER)
	static val TEXT = new DmxBaseTypeDescriptor(DmxBaseType.TEXT)
	static val IDENTIFIER = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER)
	static val TIMEPOINT = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT)
	
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxMemberNavigation expr) {
		val member = expr.member
		val preceding = expr.precedingNavigationSegment
		
		if (member instanceof DmxIterator) {
			if (member.baseType == DmxBaseType.COMPLEX) {
				val precedingType = preceding.typeFor // recursion
				return createDescriptor(precedingType.type, member.baseTypeCollection)
			} else {
				return getBaseTypeDescriptor(member.baseType)
			}
		}
		return createDescriptor(member.type, member.isCollection)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxContextReference expr) {
		val target = expr.target
		
		if (target instanceof DContext) {
			if (target.type !== null) {
				return createDescriptor(target.type, target.isCollection)
			} else {
				// this only occurs when the context is accessd from within the memberCallArguments of a DmxMemberNavigation 
				// => find precedingNavigationSegment of "calling" DmxMemberNavigation that contains memberCallArguments
				var EObject prev = target
				var container = prev.eContainer
				var isCorrelationVariable = target.isCorrelationVariable(container)
				while (! (container === null || container instanceof DmxMemberNavigation && (container as DmxMemberNavigation).memberCallArguments.contains(prev)))  {
					prev = container
					container = prev.eContainer
					isCorrelationVariable = isCorrelationVariable || target.isCorrelationVariable(container)
				}
				if (container instanceof DmxMemberNavigation) {
					val desc = container.precedingNavigationSegment.typeFor
					if (isCorrelationVariable) {
						// the type derived vor correlation Varibles inside a DmxPredicateWithCorrelationVariable block is usually the type of the collection on which the
						// enclosing iterator is applied => is a collection type, but correlation variable is a single object
						desc.collection = false
					}
					return desc
				}
				return UNDEFINED
			}
			
		} else if (target instanceof DAggregate) {
			return createDescriptor(target, false)
			
		} else if (target instanceof DNotification) {
			return createDescriptor(target, false)
			
		} else if (target instanceof DNavigableMember) {
			return createDescriptor(target.type, expr.all)
			
		} else  {
			return createDescriptor(target, expr.all)
		}
	}
	
	private def boolean isCorrelationVariable(DContext target, EObject container) {
		(container instanceof DmxPredicateWithCorrelationVariable) && (container as DmxPredicateWithCorrelationVariable).correlationVariable == target
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxSelfExpression expr) {
		throw new UnsupportedOperationException  // TODO
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxCastExpression expr) {
		createDescriptor(expr.type, false)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxFunctionCall expr) {
		throw new UnsupportedOperationException // TODO
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxConstructorCall expr) {
		createDescriptor(expr.constructor, false)
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
	
	private def AbstractDmxTypeDescriptor<?> createDescriptor(DNamedElement e, boolean collection) {
		switch e {
			DmxArchetype: new DmxPrimitiveDescriptor(e, collection)
			DPrimitive: new DmxPrimitiveDescriptor(e, collection)
			DEnumeration: new DmxEnumerationDescriptor(e)
			DComplexType: new DmxComplexTypeDescriptor(e, collection, util)
			DAggregate: new DmxAggregateDescriptor(e)
			DNotification: new DmxNotificationDescriptor(e)
			default: UNDEFINED
		}
	}
	
	private def AbstractDmxTypeDescriptor<?> getBaseTypeDescriptor(DmxBaseType t) {
		switch t {
			case DmxBaseType::VOID: VOID
			case DmxBaseType::BOOLEAN: BOOLEAN
			case DmxBaseType::NUMBER: NUMBER
			case DmxBaseType::TEXT: TEXT
			case DmxBaseType::IDENTIFIER: IDENTIFIER
			case DmxBaseType::TIMEPOINT: TIMEPOINT
			default: throw new IllegalArgumentException(t.toString)
		}
	}
}