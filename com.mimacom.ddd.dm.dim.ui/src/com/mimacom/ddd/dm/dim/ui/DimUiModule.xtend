/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.ui

import com.mimacom.ddd.dm.dmx.ui.autoedit.DmxAutoEditStrategyProvider
import com.mimacom.ddd.dm.dmx.ui.doubleClicking.DmxDoubleClickStrategyProvider
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxHighlightingConfiguration
import com.mimacom.ddd.dm.dmx.ui.highlight.DmxSemanticHighlightingCalculator
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider
import org.eclipse.xtext.ui.editor.doubleClicking.DoubleClickStrategyProvider
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class DimUiModule extends AbstractDimUiModule {
	
	static public val FILE_EXTENSION = "dim"

	def Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		return DmxSemanticHighlightingCalculator
	}

	def Class<? extends IHighlightingConfiguration> bindHighlightingConfiguration() {
		return DmxHighlightingConfiguration
	}

	override Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return DmxAutoEditStrategyProvider
	}
	
	def Class<? extends DoubleClickStrategyProvider> bindDoubleClickStrategyProvider() {
		return DmxDoubleClickStrategyProvider
	}
}
