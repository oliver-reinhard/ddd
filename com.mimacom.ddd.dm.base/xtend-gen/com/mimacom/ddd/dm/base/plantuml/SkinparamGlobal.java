package com.mimacom.ddd.dm.base.plantuml;

import com.mimacom.ddd.util.plantuml.Color;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SkinparamGlobal {
  protected final Color DEFAUlT_ARROW_COLOR = new Color(40, 40, 40);
  
  protected final Color DEFAUlT_FONT_COLOR = this.DEFAUlT_ARROW_COLOR;
  
  public Color arrowColor() {
    return this.DEFAUlT_ARROW_COLOR;
  }
  
  public float borderThickness() {
    return 1.0f;
  }
  
  public boolean hideEmptyMembers() {
    return true;
  }
  
  public String fontName() {
    return "Arial";
  }
  
  public String monospacedFontName() {
    return "Courier";
  }
  
  public Color fontColor() {
    return this.DEFAUlT_FONT_COLOR;
  }
  
  public int fontSize() {
    return 9;
  }
  
  public boolean shadowing() {
    return false;
  }
  
  public boolean guillemet() {
    return true;
  }
  
  protected void render(final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("skinparam ArrowColor ");
    Color _arrowColor = this.arrowColor();
    _builder.append(_arrowColor);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam BorderThickness ");
    float _borderThickness = this.borderThickness();
    _builder.append(_borderThickness);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam DefaultFontName ");
    String _fontName = this.fontName();
    _builder.append(_fontName);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam DefaultMonospacedFontName ");
    String _monospacedFontName = this.monospacedFontName();
    _builder.append(_monospacedFontName);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam DefaultFontColor ");
    Color _fontColor = this.fontColor();
    _builder.append(_fontColor);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam FontSize ");
    int _fontSize = this.fontSize();
    _builder.append(_fontSize);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam Shadowing ");
    boolean _shadowing = this.shadowing();
    _builder.append(_shadowing);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam Guillemet ");
    boolean _guillemet = this.guillemet();
    _builder.append(_guillemet);
    _builder.newLineIfNotEmpty();
    final String res = _builder.toString();
    sb.append(res);
  }
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    this.render(sb);
    return sb.toString();
  }
}
