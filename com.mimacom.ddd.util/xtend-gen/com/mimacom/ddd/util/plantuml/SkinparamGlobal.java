package com.mimacom.ddd.util.plantuml;

import com.google.inject.Singleton;
import com.mimacom.ddd.util.plantuml.Color;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import org.eclipse.xtend2.lib.StringConcatenation;

@Singleton
@SuppressWarnings("all")
public class SkinparamGlobal extends CommonCompositeSkinparam {
  protected static final Color DEFAUlT_BACKGROUND_COLOR = new Color(255, 255, 255);
  
  protected static final Color DEFAUlT_LINE_COLOR = new Color(40, 40, 40);
  
  protected static final Color DEFAUlT_FONT_COLOR = SkinparamGlobal.DEFAUlT_LINE_COLOR;
  
  public boolean hideEmptyMembers() {
    return true;
  }
  
  public String fontName() {
    return "Helvetica";
  }
  
  public String monospacedFontName() {
    return "Courier New";
  }
  
  public boolean shadowing() {
    return false;
  }
  
  /**
   * This — and only this method — may return Color.TRANSPARENT.
   */
  public Color canvasBackgroundColor() {
    return SkinparamGlobal.DEFAUlT_BACKGROUND_COLOR;
  }
  
  /**
   * Use guillemet for stereotypes
   */
  public boolean guillemet() {
    return true;
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return null;
  }
  
  @Override
  public Color shapeBackgroundColor() {
    return SkinparamGlobal.DEFAUlT_BACKGROUND_COLOR;
  }
  
  @Override
  public Color lineColor() {
    return SkinparamGlobal.DEFAUlT_LINE_COLOR;
  }
  
  @Override
  public float lineThickness() {
    return 1.0f;
  }
  
  @Override
  public Color fontColor() {
    return SkinparamGlobal.DEFAUlT_FONT_COLOR;
  }
  
  @Override
  public int fontSize() {
    return 14;
  }
  
  @Override
  public String fontStyle() {
    return "normal";
  }
  
  @Override
  protected String scopeName() {
    return "default";
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("skinparam ArrowColor ");
    Color _lineColor = this.lineColor();
    _builder.append(_lineColor);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam BackgroundColor ");
    Color _canvasBackgroundColor = this.canvasBackgroundColor();
    _builder.append(_canvasBackgroundColor);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam BorderThickness ");
    float _lineThickness = this.lineThickness();
    _builder.append(_lineThickness);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam Shadowing ");
    boolean _shadowing = this.shadowing();
    _builder.append(_shadowing);
    _builder.newLineIfNotEmpty();
    _builder.append("skinparam Guillemet ");
    boolean _guillemet = this.guillemet();
    _builder.append(_guillemet);
    _builder.newLineIfNotEmpty();
    {
      boolean _hideEmptyMembers = this.hideEmptyMembers();
      if (_hideEmptyMembers) {
        _builder.append("hide empty members");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("skinparam ");
    String _scopeName = this.scopeName();
    _builder.append(_scopeName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("FontName ");
    String _fontName = this.fontName();
    _builder.append(_fontName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("MonospacedFontName ");
    String _monospacedFontName = this.monospacedFontName();
    _builder.append(_monospacedFontName, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("FontColor ");
    Color _fontColor = this.fontColor();
    _builder.append(_fontColor, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("FontSize ");
    int _fontSize = this.fontSize();
    _builder.append(_fontSize, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
