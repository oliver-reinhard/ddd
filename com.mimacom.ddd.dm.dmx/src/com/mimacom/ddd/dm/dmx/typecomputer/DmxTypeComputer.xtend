package com.mimacom.ddd.dm.dmx.typecomputer

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DActor
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DContext
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DMultiplicity
import com.mimacom.ddd.dm.base.DNamedElement
import com.mimacom.ddd.dm.base.DNavigableMember
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DService
import com.mimacom.ddd.dm.dmx.DBooleanLiteral
import com.mimacom.ddd.dm.dmx.DCastExpression
import com.mimacom.ddd.dm.dmx.DConstructorCall
import com.mimacom.ddd.dm.dmx.DDecimalLiteral
import com.mimacom.ddd.dm.dmx.DFunctionCall
import com.mimacom.ddd.dm.dmx.DNaturalLiteral
import com.mimacom.ddd.dm.dmx.DSelfExpression
import com.mimacom.ddd.dm.dmx.DStringLiteral
import com.mimacom.ddd.dm.dmx.DUndefinedLiteral
import com.mimacom.ddd.dm.dmx.DmxBaseType
import com.mimacom.ddd.dm.dmx.DmxContextReference
import com.mimacom.ddd.dm.dmx.DmxIterator
import com.mimacom.ddd.dm.dmx.DmxMemberNavigation
import com.mimacom.ddd.dm.dmx.DmxUtil
import org.eclipse.emf.ecore.EObject

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
		return createDescriptor(member.type, member.collection)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DmxContextReference expr) {
		val target = expr.target
		
		if (target instanceof DContext) {
			if (target.type !== null) {
				return createDescriptor(target.type, target.multiplicity.isCollection)
			} else {
				// this only occurs when the context is accessd from within the memberCallArguments of a DmxMemberNavigation 
				// => find member of "calling" DmxMemberNavigation that contains memberCallArguments
				var EObject prev = target
				var container = prev.eContainer
				while (! (container === null || container instanceof DmxMemberNavigation && (container as DmxMemberNavigation).memberCallArguments.contains(prev)))  {
					prev = container
					container = prev.eContainer
				}
				if (container instanceof DmxMemberNavigation) {
					return container.precedingNavigationSegment.typeFor
				}
			}
			
		} else if (target instanceof DNavigableMember) {
			return createDescriptor(target.type, expr.all)
			
		} else  {
			return createDescriptor(target, expr.all)
		}
		return UNDEFINED
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DSelfExpression expr) {
		throw new UnsupportedOperationException  // TODO
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DCastExpression expr) {
		createDescriptor(expr.type, false)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DFunctionCall expr) {
		throw new UnsupportedOperationException // TODO
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DConstructorCall expr) {
		createDescriptor(expr.constructor, false)
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DBooleanLiteral expr) {
		BOOLEAN
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DStringLiteral expr) {
		TEXT
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DNaturalLiteral expr) {
		NUMBER
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DDecimalLiteral expr) {
		NUMBER
	}
	
	def dispatch AbstractDmxTypeDescriptor<?> typeFor(DUndefinedLiteral expr) {
		UNDEFINED
	}
	
	private def AbstractDmxTypeDescriptor<?> createDescriptor(DNamedElement e, boolean collection) {
		switch e {
			DPrimitive: new DmxPrimitiveDescriptor(e, collection)
			DEnumeration: new DmxEnumerationDescriptor(e)
			DComplexType: new DmxComplexTypeDescriptor(e, collection, util)
			DService: new DmxServiceDescriptor(e)
			DActor: new DmxActorDescriptor(e)
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
	
	private def boolean isCollection(DMultiplicity m) {
		if (m === null) false else m.maxOccurs > 1
	}
}