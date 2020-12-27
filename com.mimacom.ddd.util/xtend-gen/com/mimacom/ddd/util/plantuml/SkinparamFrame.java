package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamPackage;

@SuppressWarnings("all")
public class SkinparamFrame extends CommonCompositeSkinparam {
  @Inject
  private SkinparamPackage skinparamPackage;
  
  @Override
  protected String scopeName() {
    return "frame";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamPackage;
  }
  
  @Override
  public String toString() {
    String _string = super.toString();
    String _plus = (_string + "\nskinparam PackageBorderThickness ");
    float _lineThickness = this.lineThickness();
    return (_plus + Float.valueOf(_lineThickness));
  }
}
