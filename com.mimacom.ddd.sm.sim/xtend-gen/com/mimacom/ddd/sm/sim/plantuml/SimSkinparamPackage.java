package com.mimacom.ddd.sm.sim.plantuml;

import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.SkinparamPackage;

@SuppressWarnings("all")
public class SimSkinparamPackage extends SkinparamPackage {
  public static final Color DEFAUlT_PACKAGE_COLOR = new Color(22, 38, 195);
  
  @Override
  public Color lineColor() {
    return SimSkinparamPackage.DEFAUlT_PACKAGE_COLOR;
  }
  
  @Override
  public Color fontColor() {
    return this.lineColor();
  }
}
