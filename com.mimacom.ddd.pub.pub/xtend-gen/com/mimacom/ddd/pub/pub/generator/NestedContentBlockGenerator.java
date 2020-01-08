package com.mimacom.ddd.pub.pub.generator;

import com.mimacom.ddd.pub.pub.ContentBlock;

@SuppressWarnings("all")
public interface NestedContentBlockGenerator {
  public abstract CharSequence generate(final ContentBlock b);
}
