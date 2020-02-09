package com.mimacom.ddd.pub.pub.tableProvider;

import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.Table;
import com.mimacom.ddd.pub.pub.TitledTable;

public interface ITableRenderer {

	/**
	 * Determines whether a meaningful table can be rendered for {@code root}.
	 * <p>
	 * 
	 * <b>Note</b>: this must not be a long-running action and it must not have
	 * side-effects.
	 * 
	 * @param root can be {@code null}
	 * @return {@code true} if this renderer can provide a table with at least one
	 *         table cell that has content.
	 */
	boolean canRender(IDiagramRoot root);

	/**
	 * Create and render the table for the given root object
	 * <p>
	 * <b>Precondition:</b> this method must only be called when
	 * {@link #canRender(IDiagramRoot)} returns {@code true}
	 * <p>
	 * <b>Postcondition:</b> in the case of exceptions, this method still returns a
	 * {@link TitledTable} object, however, with no columns or rows.
	 * 
	 * @param root cannot be {@code null}
	 * @return an non-{@code null} table with at least one table cell.
	 */
	Table render(IDiagramRoot root);

}
