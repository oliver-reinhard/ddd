package com.mimacom.ddd.dm.dim.diagramProvider

import java.io.InputStream
import org.eclipse.xtext.util.StringInputStream
import com.mimacom.ddd.dm.base.IDiagramRoot
import com.mimacom.ddd.pub.pub.diagramProvider.IDiagramRenderer

class DimDiagramRendererPNG implements IDiagramRenderer {
	override InputStream render(IDiagramRoot root) {
		System.err.println('''«DimDiagramRendererPNG.getName()»: EXECUTING''')
		return new StringInputStream(DimDiagramRendererPNG.getName())
	}
}
