package com.mimacom.ddd.sm.sim.diagramProvider

import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer
import java.io.InputStream
import org.eclipse.xtext.util.StringInputStream

class SimDiagramRendererPNG implements IDiagramRenderer {
	override InputStream render(IDiagramRoot root) {
		System.err.println('''«SimDiagramRendererPNG.getName()»: EXECUTING''')
		return new StringInputStream(SimDiagramRendererPNG.getName())
	}
}
