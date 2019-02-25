/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx.formatting2;

import com.mimacom.ddd.dm.base.DExpression;
import com.mimacom.ddd.dm.base.DRichText;
import com.mimacom.ddd.dm.base.IRichTextSegment;
import com.mimacom.ddd.dm.dmx.DmxModel;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class DmxFormatter extends AbstractFormatter2 {
  protected void _format(final DmxModel dmxModel, @Extension final IFormattableDocument document) {
    EList<DRichText> _texts = dmxModel.getTexts();
    for (final DRichText dRichText : _texts) {
      document.<DRichText>format(dRichText);
    }
    EList<DExpression> _expressions = dmxModel.getExpressions();
    for (final DExpression dExpression : _expressions) {
      document.<DExpression>format(dExpression);
    }
  }
  
  protected void _format(final DRichText dRichText, @Extension final IFormattableDocument document) {
    EList<IRichTextSegment> _segments = dRichText.getSegments();
    for (final IRichTextSegment iRichTextElement : _segments) {
      document.<IRichTextSegment>format(iRichTextElement);
    }
  }
  
  public void format(final Object dRichText, final IFormattableDocument document) {
    if (dRichText instanceof DRichText) {
      _format((DRichText)dRichText, document);
      return;
    } else if (dRichText instanceof XtextResource) {
      _format((XtextResource)dRichText, document);
      return;
    } else if (dRichText instanceof DmxModel) {
      _format((DmxModel)dRichText, document);
      return;
    } else if (dRichText instanceof EObject) {
      _format((EObject)dRichText, document);
      return;
    } else if (dRichText == null) {
      _format((Void)null, document);
      return;
    } else if (dRichText != null) {
      _format(dRichText, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dRichText, document).toString());
    }
  }
}
