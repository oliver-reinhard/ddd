package com.mimacom.ddd.pub.pub.generator

import com.mimacom.ddd.pub.pub.DivisionContainer

class DivisionNode {
	public int level
	public int sequenceNumber
	public DivisionContainer logicalParent

	new(int level, int sequenceNumber, DivisionContainer logicalParent) {
		this.level = level
		this.sequenceNumber = sequenceNumber
		this.logicalParent = logicalParent
	}

}
