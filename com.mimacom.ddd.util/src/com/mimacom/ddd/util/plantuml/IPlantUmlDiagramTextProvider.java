package com.mimacom.ddd.util.plantuml;

public interface IPlantUmlDiagramTextProvider<T> {

	/**
	 * Determines whether a meaningful diagram can be provided for {@code root}
	 * 
	 * @param root can be {@code null}
	 * @return {@code true} if the diagram-text provider can provide a non-empty,
	 *         meaningful diagram.
	 */
	boolean canProvide(T root);

	/**
	 * This method is only called after {@link #canProvide(Object)} returned
	 * {@code true}.
	 * 
	 * @param root not {@code null}
	 * @return PlantUML diagram text
	 */
	String diagramText(T root);

}
