package com.mimacom.ddd.util.plantuml;

import com.google.inject.Inject;
import com.mimacom.ddd.util.plantuml.CommonCompositeSkinparam;
import com.mimacom.ddd.util.plantuml.SkinparamGlobal;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SkinparamClass extends CommonCompositeSkinparam {
  @Inject
  private SkinparamGlobal skinparamGlobal;
  
  @Override
  protected String scopeName() {
    return "class";
  }
  
  @Override
  public CommonCompositeSkinparam baseSkinparam() {
    return this.skinparamGlobal;
  }
  
  @Override
  public int fontSize() {
    int _fontSize = this.baseSkinparam().fontSize();
    return (_fontSize + 2);
  }
  
  @Override
  public String fontStyle() {
    return "bold";
  }
  
  public int attributeFontSize() {
    return this.baseSkinparam().fontSize();
  }
  
  @Override
  protected String scopeBody() {
    StringConcatenation _builder = new StringConcatenation();
    String _scopeBody = super.scopeBody();
    _builder.append(_scopeBody);
    _builder.newLineIfNotEmpty();
    _builder.append("AttributeFontSize ");
    int _attributeFontSize = this.attributeFontSize();
    _builder.append(_attributeFontSize);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
