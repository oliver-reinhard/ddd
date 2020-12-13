package com.mimacom.ddd.dm.base.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.plantuml.PlantUmlTextProviderUtil;
import com.mimacom.ddd.util.plantuml.Color;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SkinparamNote {
  @Inject
  @Extension
  private PlantUmlTextProviderUtil _plantUmlTextProviderUtil;
  
  protected final Color DEFAUlT_BORDER_COLOR = new Color(163, 163, 163);
  
  public Color backgroundColor() {
    return this._plantUmlTextProviderUtil.defaultNoteColor();
  }
  
  public Color borderColor() {
    return this.DEFAUlT_BORDER_COLOR;
  }
  
  public float borderThickness() {
    return 0.5f;
  }
  
  public int fontSize() {
    return 9;
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
    _builder.append("FontSize ");
    int _fontSize = this.fontSize();
    _builder.append(_fontSize);
    _builder.newLineIfNotEmpty();
    final String res = _builder.toString();
    sb.append(res);
  }
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("skinparam note {\n");
    this.render(sb);
    sb.append("\n}");
    return sb.toString();
  }
}
