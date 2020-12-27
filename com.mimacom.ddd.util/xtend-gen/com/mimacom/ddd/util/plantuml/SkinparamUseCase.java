package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;

@SuppressWarnings("all")
public class SkinparamUseCase extends CommonCompositeSkinparam {
  @Inject
  private SkinparamGlobal skinparamGlobal;
  
  @Override
  protected String scopeName() {
    return "usecase";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamGlobal;
  }
}
