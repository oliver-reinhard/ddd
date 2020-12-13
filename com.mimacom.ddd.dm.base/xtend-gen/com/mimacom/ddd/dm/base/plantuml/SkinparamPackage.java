package com.mimacom.ddd.dm.base.plantuml;

import com.mimacom.ddd.util.plantuml.Color;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SkinparamPackage {
  protected final Color DEFAUlT_BORDER_COLOR = new Color(40, 40, 40);
  
  protected final Color DEFAUlT_BACKGROUND_COLOR = new Color(255, 255, 255);
  
  protected final Color DEFAUlT_FONT_COLOR = this.DEFAUlT_BORDER_COLOR;
  
  public Color backgroundColor() {
    return this.DEFAUlT_BACKGROUND_COLOR;
  }
  
  public Color borderColor() {
    return this.DEFAUlT_BORDER_COLOR;
  }
  
  public float borderThickness() {
    return 1.0f;
  }
  
  public Color fontColor() {
    return this.DEFAUlT_FONT_COLOR;
  }
  
  public int fontSize() {
    return 11;
  }
  
  protected void render(final StringBuilder sb) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BackgroundColor ");
    Color _backgroundColor = this.backgroundColor();
    _builder.append(_backgroundColor);
    _builder.newLineIfNotEmpty();
    _builder.append("BorderColor ");
    Color _borderColor = this.borderColor();
    _builder.append(_borderColor);
    _builder.newLineIfNotEmpty();
    _builder.append("BorderThickness ");
    float _borderThickness = this.borderThickness();
    _builder.append(_borderThickness);
    _builder.newLineIfNotEmpty();
    _builder.append("FontColor ");
    Color _fontColor = this.fontColor();
    _builder.append(_fontColor);
    _builder.newLineIfNotEmpty();
    _builder.append("FontSize ");
    int _fontSize = this.fontSize();
    _builder.append(_fontSize);
    _builder.newLineIfNotEmpty();
    final String res = _builder.toString();
    sb.append(res);
  }
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("skinparam package {\n");
    this.render(sb);
    sb.append("\n}");
    return sb.toString();
  }
}
