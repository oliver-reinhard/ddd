package com.mimacom.ddd.util.plantuml;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.AbstractSkinparam;
import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SkinparamNote extends AbstractSkinparam {
  @Inject
  protected SkinparamGlobal skinparamGlobal;
  
  protected static final Color DEFAUlT_NOTE_COLOR = new Color(255, 246, 196);
  
  protected static final Color DEFAUlT_KEYWORD_COLOR = new Color(64, 94, 122);
  
  @Override
  protected String scopeName() {
    return "note";
  }
  
  public Color shapeBackgroundColor() {
    return SkinparamNote.DEFAUlT_NOTE_COLOR;
  }
  
  public Color borderColor() {
    Color _xifexpression = null;
    Color _canvasBackgroundColor = this.skinparamGlobal.canvasBackgroundColor();
    boolean _equals = Objects.equal(_canvasBackgroundColor, Color.TRANSPARENT);
    if (_equals) {
      _xifexpression = Color.WHITE;
    } else {
      _xifexpression = this.skinparamGlobal.canvasBackgroundColor();
    }
    return _xifexpression;
  }
  
  public float borderThickness() {
    return 1.0f;
  }
  
  public Color fontColor() {
    return Color.BLACK;
  }
  
  public Color keywordFontColor() {
    return SkinparamNote.DEFAUlT_KEYWORD_COLOR;
  }
  
  public int fontSize() {
    int _fontSize = this.skinparamGlobal.fontSize();
    return (_fontSize - 1);
  }
  
  @Override
  protected String scopeBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("BackgroundColor ");
    Color _shapeBackgroundColor = this.shapeBackgroundColor();
    _builder.append(_shapeBackgroundColor);
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
    return _builder.toString();
  }
}
