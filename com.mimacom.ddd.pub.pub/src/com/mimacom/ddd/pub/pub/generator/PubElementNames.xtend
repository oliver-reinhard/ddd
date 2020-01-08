package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.Division
import com.mimacom.ddd.pub.pub.DocumentSegment
import com.mimacom.ddd.pub.pub.TitledBlock

class PubElementNames {
	
	def dispatch String displayName(TitledBlock b) {
		b.class.simpleName.replace("Impl", "")
	}
	
	def dispatch String displayName(Division div) {
		div.class.simpleName.replace("Impl", "")
	}
	
	def dispatch String displayName(DocumentSegment seg) {
		seg.class.simpleName.replace("Impl", "")
	}
	
	def dispatch String displayName(Object obj) {
		throw new IllegalArgumentException("Unsupported object type: " + obj.class.name)
	}
}