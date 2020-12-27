package com.mimacom.ddd.util.plantuml;

import com.mimacom.ddd.util.plantuml.AbstractSkinparam;
import com.mimacom.ddd.util.plantuml.Color;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class CommonCompositeSkinparam extends AbstractSkinparam {
  public abstract CommonCompositeSkinparam baseSkinparam();
  
  public Color shapeBackgroundColor() {
    return this.baseSkinparam().shapeBackgroundColor();
  }
  
  public Color lineColor() {
    return this.baseSkinparam().lineColor();
  }
  
  public float lineThickness() {
    return this.baseSkinparam().lineThickness();
  }
  
  public Color fontColor() {
    return this.baseSkinparam().fontColor();
  }
  
  public int fontSize() {
    return this.baseSkinparam().fontSize();
  }
  
  public String fontStyle() {
    return this.baseSkinparam().fontStyle();
  }
  
  @Override
  protected String scopeBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BackgroundColor ");
    Color _shapeBackgroundColor = this.shapeBackgroundColor();
    _builder.append(_shapeBackgroundColor);
    _builder.newLineIfNotEmpty();
    _builder.append("BorderColor ");
    Color _lineColor = this.lineColor();
    _builder.append(_lineColor);
    _builder.newLineIfNotEmpty();
    _builder.append("BorderThickness ");
    float _lineThickness = this.lineThickness();
    _builder.append(_lineThickness);
    _builder.newLineIfNotEmpty();
    _builder.append("FontColor ");
    Color _fontColor = this.fontColor();
    _builder.append(_fontColor);
    _builder.newLineIfNotEmpty();
    _builder.append("FontSize ");
    int _fontSize = this.fontSize();
    _builder.append(_fontSize);
    _builder.newLineIfNotEmpty();
    _builder.append("FontStyle ");
    String _fontStyle = this.fontStyle();
    _builder.append(_fontStyle);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
