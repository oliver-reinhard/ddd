package com.mimacom.ddd.pub.pub.diagramProvider;

import java.io.InputStream;

import com.mimacom.ddd.dm.base.IDiagramRoot;

public interface IDiagramRenderer {

	/**
	 * Determines whether a meaningful diagram can be rendered for {@code root}
	 * 
	 * @param root can be {@code null}
	 * @return {@code true} if the diagram-text provider can provide a non-empty,
	 *         meaningful diagram.
	 */
	boolean canRender(IDiagramRoot root);
	
	InputStream render(IDiagramRoot root);

}
