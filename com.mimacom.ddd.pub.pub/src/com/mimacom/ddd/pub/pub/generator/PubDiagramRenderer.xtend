package com.mimacom.ddd.pub.pub.generator

import com.google.inject.Inject
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry

class PubDiagramRenderer {
	
	@Inject
	val DiagramProviderRegistry renderers = null
	
	def void render() {
		renderers.allDiagramRenderers
	}
}