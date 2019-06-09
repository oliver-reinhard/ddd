package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.sm.sim.SPrimitive
import com.mimacom.ddd.sm.sim.SType
import java.util.Comparator
import com.mimacom.ddd.sm.sim.SEnumeration

/*
 * Sorts STypes in this order:
 * 1 – Archetypes
 * 2 – SPrimitives
 * 3 – SEnumerations
 * 4 – SComplexTypes
 */
class STypeSorter implements Comparator<SType> {
	
	override compare(SType t1, SType t2) {
		val s1 = t1.score
		val s2 = t2.score
		if (s1 == 3 && s2 == 3) { // one may redefine the other
			val p1 = t1 as SPrimitive
			val p2 = t2 as SPrimitive
			if (p1 == p2.redefines) return -1
			if (p1.redefines == p2) return 1
		}
		return s2 - s1
	}
	
	def int score(SType t) {
		if (t instanceof SPrimitive) {
			if (t.archetype) return 4
			return 3
		} else if (t instanceof SEnumeration) {
			return 2
		}
		return 1
	}
}