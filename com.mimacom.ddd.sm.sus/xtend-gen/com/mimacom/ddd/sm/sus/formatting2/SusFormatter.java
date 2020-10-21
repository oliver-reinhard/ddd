/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.sm.sus.formatting2;

import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.pub.pub.Component;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.Section;
import com.mimacom.ddd.pub.pub.formatting2.PubFormatter;
import com.mimacom.ddd.sm.sus.UserStory;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SusFormatter extends PubFormatter {
  @Override
  protected void _format(final DNamespace dNamespace, @Extension final IFormattableDocument document) {
    EList<DImport> _imports = dNamespace.getImports();
    for (final DImport dImport : _imports) {
      document.<DImport>format(dImport);
    }
    document.<DModel>format(dNamespace.getModel());
  }
  
  protected void _format(final UserStory userStory, @Extension final IFormattableDocument document) {
    document.<DRichText>format(userStory.getDescription());
    document.<DRichText>format(userStory.getGoal());
    EList<Section> _sections = userStory.getSections();
    for (final Section section : _sections) {
      document.<Section>format(section);
    }
  }
  
  @Override
  public void format(final Object userStory, final IFormattableDocument document) {
    if (userStory instanceof DRichText) {
      _format((DRichText)userStory, document);
      return;
    } else if (userStory instanceof DmxModel) {
      _format((DmxModel)userStory, document);
      return;
    } else if (userStory instanceof Component) {
      _format((Component)userStory, document);
      return;
    } else if (userStory instanceof UserStory) {
      _format((UserStory)userStory, document);
      return;
    } else if (userStory instanceof XtextResource) {
      _format((XtextResource)userStory, document);
      return;
    } else if (userStory instanceof DExpression) {
      _format((DExpression)userStory, document);
      return;
    } else if (userStory instanceof DNamespace) {
      _format((DNamespace)userStory, document);
      return;
    } else if (userStory instanceof PubModel) {
      _format((PubModel)userStory, document);
      return;
    } else if (userStory instanceof EObject) {
      _format((EObject)userStory, document);
      return;
    } else if (userStory == null) {
      _format((Void)null, document);
      return;
    } else if (userStory != null) {
      _format(userStory, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(userStory, document).toString());
    }
  }
}