package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.sm.sim.SEnumerationDeduction
import com.mimacom.ddd.sm.sim.SPrimitiveDeduction
import com.mimacom.ddd.sm.sim.STypeDeduction
import java.util.Comparator

/*
 * Sorts DTypes in this order:
 * 1 – Archetypes
 * 2 – Primitives
 * 3 – Enumerations
 * 4 – ComplexTypes
 */
class TypeSorter implements Comparator<STypeDeduction> {
	
	override compare(STypeDeduction t1, STypeDeduction t2) {
		val s1 = t1.score
		val s2 = t2.score
		if (s1 == 3 && s2 == 3) { // one may redefine the other
			val p1 = t1 as DPrimitive
			val p2 = t2 as DPrimitive
			if (p1 == p2.redefines) return -1
			if (p1.redefines == p2) return 1
		}
		return s2 - s1
	}
	
	def int score(STypeDeduction t) {
		if (t instanceof SPrimitiveDeduction) {
			if (t.archetype) return 4
			return 3
		} else if (t instanceof SEnumerationDeduction) {
			return 2
		}
		return 1
	}
}