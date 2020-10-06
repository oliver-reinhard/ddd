package com.mimacom.ddd.pub.pub.diagramProvider;

import java.io.InputStream;

import com.mimacom.ddd.dm.base.base.IDiagramRoot;

public interface IDiagramRenderer {

	/**
	 * Determines whether a meaningful diagram can be rendered for {@code root}.<p>
	 * 
	 * <b>Note</b>: this must not be a long-running action and it must not have side-effects.
	 * 
	 * @param root can be {@code null}
	 * @return {@code true} if this renderer can provide a non-empty, meaningful diagram.
	 */
	boolean canRender(IDiagramRoot root);
	
	/**
	 * Create and render the diagram for the given root object
	 * <p>
	 * <b>Precondition:</b> this method must only be called when
	 * {@link #canRender(IDiagramRoot)} returns {@code true}
	 * 
	 * @param root cannot be {@code null}
	 * @return a non-{@code null} input stream from which the serialized diagram can be read.
	 */
	InputStream render(IDiagramRoot root);

}
