package com.mimacom.ddd.pub.pub.diagramProvider;

import java.io.InputStream;

import com.mimacom.ddd.dm.base.IDiagramRoot;

public interface IDiagramRenderer {

	/**
	 * Determines whether a meaningful diagram can be rendered for {@code root}.<p>
	 * 
	 * <b>Note</b>: this must not be a long-running action and it must not have side-effects.
	 * 
	 * @param root can be {@code null}
	 * @return {@code true} if the diagram-text provider can provide a non-empty,
	 *         meaningful diagram.
	 */
	boolean canRender(IDiagramRoot root);
	
	/**
	 * Create and render the diagram for the given root object
	 * @param root cannot be {@code null}
	 * @return an input stream from which the serialized diagram can be read.
	 */
	InputStream render(IDiagramRoot root);

}
