package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamUseCase;

@SuppressWarnings("all")
public class SkinparamActor extends CommonCompositeSkinparam {
  @Inject
  private SkinparamUseCase skinparamUseCase;
  
  @Override
  protected String scopeName() {
    return "actor";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamUseCase;
  }
  
  @Override
  public int fontSize() {
    int _fontSize = this.baseSkinparam().fontSize();
    return (_fontSize + 2);
  }
  
  @Override
  public String fontStyle() {
    return "bold";
  }
}
