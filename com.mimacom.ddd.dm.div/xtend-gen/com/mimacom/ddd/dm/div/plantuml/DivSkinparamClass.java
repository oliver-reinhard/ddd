package com.mimacom.ddd.dm.div.plantuml;

import com.mimacom.ddd.dm.div.plantuml.DivSkinparamPackage;
import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.SkinparamClass;

@SuppressWarnings("all")
public class DivSkinparamClass extends SkinparamClass {
  @Override
  public Color lineColor() {
    return DivSkinparamPackage.DEFAUlT_PACKAGE_COLOR;
  }
  
  @Override
  public Color fontColor() {
    return this.lineColor();
  }
}
