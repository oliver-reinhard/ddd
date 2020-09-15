/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm.ui;

import com.mimacom.ddd.dm.dmx.ui.autoedit.DmxAutoEditStrategyProvider;
import com.mimacom.ddd.dm.dmx.ui.doubleClicking.DmxDoubleClickStrategyProvider;
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxHighlightingConfiguration;
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxSemanticHighlightingCalculator;
import com.mimacom.ddd.sm.asm.ui.AbstractAsmUiModule;
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
public class AsmUiModule extends AbstractAsmUiModule {
  public static final String FILE_EXTENSION = "asm";
  
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
  
  public AsmUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
