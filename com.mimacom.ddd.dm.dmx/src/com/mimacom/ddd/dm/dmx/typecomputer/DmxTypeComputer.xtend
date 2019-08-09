package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.inject.Inject
import com.google.inject.Singleton
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DEnumeration
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
import com.mimacom.ddd.dm.dmx.DmxFilter
import com.mimacom.ddd.dm.dmx.DmxFunctionCall
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
	static val BOOLEAN = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, false)
	static val BOOLEAN_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.BOOLEAN, true)
	static val NUMBER = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, false)
	static val NUMBER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.NUMBER, true)
	static val TEXT = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, false)
	static val TEXT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TEXT, true)
	static val IDENTIFIER = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, false)
	static val IDENTIFIER_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.IDENTIFIER, true)
	static val TIMEPOINT = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, false)
	static val TIMEPOINT_COLLECTION = new DmxBaseTypeDescriptor(DmxBaseType.TIMEPOINT, true)
	
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxMemberNavigation expr) {
		val member = expr.member
		val preceding = expr.precedingNavigationSegment
		
		if (member instanceof DmxFilter) {
			if (member.typeDesc.isCompatible(DmxBaseType.COMPLEX /* ignore collection property */) || member.typeDesc.isMultiTyped) {
				// propagte type from preceding navigation segment: (this may differ from the actually decared type of the first parameter
				val precedingType = preceding.typeFor // recursion
				return getTypeDescriptor(precedingType.type, member.typeDesc.collection)
				
			} else {
				return getTypeDescriptor(member.typeDesc.single, member.typeDesc.collection)
			}
		}
		return getTypeDescriptor(member.type, member.isCollection)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxContextReference expr) {
		val target = expr.target
		
		if (target instanceof DContext) {
			if (target.type !== null) {
				return getTypeDescriptor(target.type, target.isCollection)
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
			return getTypeDescriptor(target, false)
			
		} else if (target instanceof DNotification) {
			return getTypeDescriptor(target, false)
			
		} else if (target instanceof DNavigableMember) {
			return getTypeDescriptor(target.type, expr.all)
			
		} else  {
			return getTypeDescriptor(target, expr.all)
		}
	}
	
	private def boolean isCorrelationVariable(DContext target, EObject container) {
		(container instanceof DmxPredicateWithCorrelationVariable) && (container as DmxPredicateWithCorrelationVariable).correlationVariable == target
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxSelfExpression expr) {
		throw new UnsupportedOperationException  // TODO
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxCastExpression expr) {
		getTypeDescriptor(expr.type, false)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxFunctionCall expr) {
		throw new UnsupportedOperationException // TODO
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxConstructorCall expr) {
		getTypeDescriptor(expr.constructor, false)
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
	
	private def AbstractDmxTypeDescriptor<?> getTypeDescriptor(Object obj, boolean collection) {
		switch obj {
			DmxBaseType: getBaseTypeDescriptor(obj, collection)
			DmxArchetype: new DmxPrimitiveDescriptor(obj, collection)
			DPrimitive: new DmxPrimitiveDescriptor(obj, collection)
			DEnumeration: new DmxEnumerationDescriptor(obj)
			DComplexType: new DmxComplexTypeDescriptor(obj, collection, util)
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
			default: throw new IllegalArgumentException(t.toString)
		}
	}
}