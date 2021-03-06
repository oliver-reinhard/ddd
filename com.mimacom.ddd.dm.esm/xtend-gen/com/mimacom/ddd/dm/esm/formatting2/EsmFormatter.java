/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.esm.formatting2;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DExpression;
import com.mimacom.ddd.dm.base.base.DImport;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DRichText;
import com.mimacom.ddd.dm.dmx.DmxModel;
import com.mimacom.ddd.dm.dmx.formatting2.DmxFormatter;
import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmTransition;
import com.mimacom.ddd.dm.esm.IEsmState;
import com.mimacom.ddd.dm.esm.services.EsmGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class EsmFormatter extends DmxFormatter {
  @Inject
  @Extension
  private EsmGrammarAccess _esmGrammarAccess;
  
  @Override
  protected void _format(final DNamespace dNamespace, @Extension final IFormattableDocument document) {
    EList<DImport> _imports = dNamespace.getImports();
    for (final DImport dImport : _imports) {
      document.<DImport>format(dImport);
    }
    document.<DModel>format(dNamespace.getModel());
  }
  
  protected void _format(final EsmEntityStateModel esmEntityStateModel, @Extension final IFormattableDocument document) {
    document.<DRichText>format(esmEntityStateModel.getDescription());
    EList<IEsmState> _states = esmEntityStateModel.getStates();
    for (final IEsmState iEsmState : _states) {
      document.<IEsmState>format(iEsmState);
    }
    EList<EsmTransition> _transitions = esmEntityStateModel.getTransitions();
    for (final EsmTransition esmTransition : _transitions) {
      document.<EsmTransition>format(esmTransition);
    }
  }
  
  @Override
  public void format(final Object esmEntityStateModel, final IFormattableDocument document) {
    if (esmEntityStateModel instanceof DRichText) {
      _format((DRichText)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel instanceof DmxModel) {
      _format((DmxModel)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel instanceof EsmEntityStateModel) {
      _format((EsmEntityStateModel)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel instanceof XtextResource) {
      _format((XtextResource)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel instanceof DExpression) {
      _format((DExpression)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel instanceof DNamespace) {
      _format((DNamespace)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel instanceof EObject) {
      _format((EObject)esmEntityStateModel, document);
      return;
    } else if (esmEntityStateModel == null) {
      _format((Void)null, document);
      return;
    } else if (esmEntityStateModel != null) {
      _format(esmEntityStateModel, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(esmEntityStateModel, document).toString());
    }
  }
}
