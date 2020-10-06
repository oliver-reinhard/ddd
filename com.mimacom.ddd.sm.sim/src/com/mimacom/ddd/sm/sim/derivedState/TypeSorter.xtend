package com.mimacom.ddd.sm.sim.derivedState

import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.transpose.TEnumerationTransposition
import com.mimacom.ddd.dm.base.transpose.TPrimitiveTransposition
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import java.util.Comparator

/*
 * Sorts DTypes in this order:
 * 1 – Archetypes
 * 2 – Primitives
 * 3 – Enumerations
 * 4 – ComplexTypes
 */
class TypeSorter implements Comparator<TTypeTransposition> {
	
	override compare(TTypeTransposition t1, TTypeTransposition t2) {
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
	
	def int score(TTypeTransposition t) {
		if (t instanceof TPrimitiveTransposition) {
			return 3
		} else if (t instanceof TEnumerationTransposition) {
			return 2
		}
		return 1
	}
}