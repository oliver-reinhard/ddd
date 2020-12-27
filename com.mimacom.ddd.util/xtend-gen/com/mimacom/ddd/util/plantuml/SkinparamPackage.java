package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;

@SuppressWarnings("all")
public class SkinparamPackage extends CommonCompositeSkinparam {
  @Inject
  private SkinparamGlobal skinparamGlobal;
  
  @Override
  protected String scopeName() {
    return "package";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamGlobal;
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
