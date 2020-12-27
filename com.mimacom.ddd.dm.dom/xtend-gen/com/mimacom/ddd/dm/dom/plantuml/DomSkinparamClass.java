package com.mimacom.ddd.dm.dom.plantuml;

import com.mimacom.ddd.util.plantuml.SkinparamClass;

@SuppressWarnings("all")
public class DomSkinparamClass extends SkinparamClass {
  @Override
  public int fontSize() {
    return this.baseSkinparam().fontSize();
  }
}
