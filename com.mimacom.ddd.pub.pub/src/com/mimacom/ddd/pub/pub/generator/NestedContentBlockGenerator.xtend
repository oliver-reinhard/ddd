package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.ContentBlock

interface NestedContentBlockGenerator {
	def CharSequence generate(ContentBlock b)
}
