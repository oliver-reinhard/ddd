package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamClass;

@SuppressWarnings("all")
public class SkinparamObject extends SkinparamClass {
  @Inject
  private SkinparamClass skinparamClass;
  
  @Override
  protected String scopeName() {
    return "object";
  }
  
  @Override
  public int attributeFontSize() {
    return this.skinparamClass.attributeFontSize();
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamClass;
  }
}
