package com.mimacom.ddd.dm.dmx.ui.doubleClicking;

import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.doubleClicking.DoubleClickStrategyProvider;
import org.eclipse.xtext.ui.editor.doubleClicking.FixedCharCountPartitionDoubleClickSelector;

/**
 * By default, Xtext editors use the {@link DoubleClickStrategyProvider} which relies on the {@link LexerTokenAndCharacterPairAwareStrategy}
 * for text selection. This strategy is based on lexer tokens, however, the DMX-based language heavily relying on {@link DRichText}, this always
 * selects the entire rich text including the « and » delimiters.
 * 
 * The Strategy provider reverts to a "dumb" but more useful selection strategy.
 */
@SuppressWarnings("all")
public class DmxDoubleClickStrategyProvider extends DoubleClickStrategyProvider {
  @Override
  public ITextDoubleClickStrategy getStrategy(final ISourceViewer sourceViewer, final String contentType, final String documentPartitioning) {
    return new FixedCharCountPartitionDoubleClickSelector(documentPartitioning, 0, 0);
  }
}
