package com.mimacom.ddd.dm.dom.ui.hover;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.dmx.typecomputer.AbstractDmxTypeDescriptor;
import com.mimacom.ddd.dm.dom.evaluator.DomExpressionEvaluator;
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DomEObjectHoverProvider extends DefaultEObjectHoverProvider {
  @Inject
  @Extension
  private DomTypeComputer _domTypeComputer;
  
  @Inject
  @Extension
  private DomExpressionEvaluator _domExpressionEvaluator;
  
  @Override
  public String getHoverInfoAsHtml(final EObject obj) {
    InputOutput.<String>println(("Hover for: " + obj));
    if (((obj instanceof DExpression) && this.expressionHasNoErrors(obj))) {
      final DExpression expr = ((DExpression) obj);
      final AbstractDmxTypeDescriptor<?> type = this._domTypeComputer.typeFor(expr);
      final Object value = this._domExpressionEvaluator.valueFor(expr);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("type   : <b>");
      String _displayName = type.displayName();
      _builder.append(_displayName);
      _builder.append("</b> <br>");
      _builder.newLineIfNotEmpty();
      _builder.append("value : <b>");
      String _string = value.toString();
      _builder.append(_string);
      _builder.append("</b>");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    } else {
      return super.getHoverInfoAsHtml(obj);
    }
  }
  
  public boolean expressionHasNoErrors(final EObject obj) {
    return Diagnostician.INSTANCE.validate(obj).getChildren().isEmpty();
  }
}
