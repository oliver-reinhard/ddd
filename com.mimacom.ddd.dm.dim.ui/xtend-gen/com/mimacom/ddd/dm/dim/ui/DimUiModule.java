/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.ui;

import com.mimacom.ddd.dm.dim.ui.AbstractDimUiModule;
import com.mimacom.ddd.dm.dmx.ui.autoedit.DmxAutoEditStrategyProvider;
import com.mimacom.ddd.dm.dmx.ui.doubleClicking.DmxDoubleClickStrategyProvider;
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxHighlightingConfiguration;
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxSemanticHighlightingCalculator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.doubleClicking.DoubleClickStrategyProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class DimUiModule extends AbstractDimUiModule {
  public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
    return DmxSemanticHighlightingCalculator.class;
  }
  
  public Class<? extends IHighlightingConfiguration> bindHighlightingConfiguration() {
    return DmxHighlightingConfiguration.class;
  }
  
  @Override
  public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
    return DmxAutoEditStrategyProvider.class;
  }
  
  public Class<? extends DoubleClickStrategyProvider> bindDoubleClickStrategyProvider() {
    return DmxDoubleClickStrategyProvider.class;
  }
  
  public DimUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
