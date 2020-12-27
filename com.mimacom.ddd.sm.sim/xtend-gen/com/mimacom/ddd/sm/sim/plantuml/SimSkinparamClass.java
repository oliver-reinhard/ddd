package com.mimacom.ddd.sm.sim.plantuml;

import com.mimacom.ddd.sm.sim.plantuml.SimSkinparamPackage;
import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.SkinparamClass;

@SuppressWarnings("all")
public class SimSkinparamClass extends SkinparamClass {
  @Override
  public Color lineColor() {
    return SimSkinparamPackage.DEFAUlT_PACKAGE_COLOR;
  }
  
  @Override
  public Color fontColor() {
    return this.lineColor();
  }
}
