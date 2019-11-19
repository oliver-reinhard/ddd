package com.mimacom.ddd.dm.dmx.evaluator

class DmxUndefinedValue {
	
	override toString() {
		"UNDEFINED_VALUE"
	}
	
	override equals(Object obj) {
		false  // even two undefined values never match!
	}
}