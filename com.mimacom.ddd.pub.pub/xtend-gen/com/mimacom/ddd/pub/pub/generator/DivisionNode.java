package com.mimacom.ddd.pub.pub.generator;

import com.mimacom.ddd.pub.pub.DivisionContainer;

@SuppressWarnings("all")
public class DivisionNode {
  public int level;
  
  public int sequenceNumber;
  
  public DivisionContainer logicalParent;
  
  public DivisionNode(final int level, final int sequenceNumber, final DivisionContainer logicalParent) {
    this.level = level;
    this.sequenceNumber = sequenceNumber;
    this.logicalParent = logicalParent;
  }
}
