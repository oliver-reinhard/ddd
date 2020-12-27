package com.mimacom.ddd.dm.base.plantuml;

import com.mimacom.ddd.util.plantuml.Color;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class Spot {
  public final EClass eClass;
  
  public final Color color;
  
  public final char letter;
  
  public Spot(final EClass eClass, final Color color, final char letter) {
    this.eClass = eClass;
    this.color = color;
    this.letter = letter;
  }
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("<< (");
    sb.append(this.letter);
    sb.append(",");
    sb.append(this.color.toString());
    sb.append(") >>");
    return sb.toString();
  }
}
