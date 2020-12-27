package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamPackage;

@SuppressWarnings("all")
public class SkinparamRectangle extends CommonCompositeSkinparam {
  @Inject
  private SkinparamPackage skinparamPackage;
  
  @Override
  protected String scopeName() {
    return "rectangle";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamPackage;
  }
}
