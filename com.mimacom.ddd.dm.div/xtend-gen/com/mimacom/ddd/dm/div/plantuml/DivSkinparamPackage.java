package com.mimacom.ddd.dm.div.plantuml;

import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.SkinparamPackage;

@SuppressWarnings("all")
public class DivSkinparamPackage extends SkinparamPackage {
  protected static final Color DEFAUlT_PACKAGE_COLOR = new Color(232, 162, 58);
  
  @Override
  public Color lineColor() {
    return DivSkinparamPackage.DEFAUlT_PACKAGE_COLOR;
  }
  
  @Override
  public Color fontColor() {
    return this.lineColor();
  }
}
