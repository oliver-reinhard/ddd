/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.formatting2;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.dmx.DmxNamespace;
import com.mimacom.ddd.dm.dmx.formatting2.DmxFormatter;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.DocumentSegment;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.services.PubGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class PubFormatter extends DmxFormatter {
  @Inject
  @Extension
  private PubGrammarAccess _pubGrammarAccess;
  
  protected void _format(final PubModel pubModel, @Extension final IFormattableDocument document) {
    document.<Document>format(pubModel.getDocument());
  }
  
  protected void _format(final Component component, @Extension final IFormattableDocument document) {
    EList<DocumentSegment> _segments = component.getSegments();
    for (final DocumentSegment documentSegment : _segments) {
      document.<DocumentSegment>format(documentSegment);
    }
  }
  
  public void format(final Object component, final IFormattableDocument document) {
    if (component instanceof DRichText) {
      _format((DRichText)component, document);
      return;
    } else if (component instanceof DmxNamespace) {
      _format((DmxNamespace)component, document);
      return;
    } else if (component instanceof Component) {
      _format((Component)component, document);
      return;
    } else if (component instanceof XtextResource) {
      _format((XtextResource)component, document);
      return;
    } else if (component instanceof DExpression) {
      _format((DExpression)component, document);
      return;
    } else if (component instanceof PubModel) {
      _format((PubModel)component, document);
      return;
    } else if (component instanceof EObject) {
      _format((EObject)component, document);
      return;
    } else if (component == null) {
      _format((Void)null, document);
      return;
    } else if (component != null) {
      _format(component, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(component, document).toString());
    }
  }
}
