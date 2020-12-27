package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class SkinparamArrow extends CommonCompositeSkinparam {
  @Inject
  private SkinparamGlobal skinparamGlobal;
  
  @Override
  protected String scopeName() {
    return "arrow";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamGlobal;
  }
  
  @Override
  public Color shapeBackgroundColor() {
    try {
      throw new IllegalAccessException("Not applicable to arrows");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public float lineThickness() {
    return 0.5f;
  }
  
  @Override
  protected String scopeBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Color ");
    Color _lineColor = this.lineColor();
    _builder.append(_lineColor);
    _builder.newLineIfNotEmpty();
    _builder.append("Thickness ");
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
