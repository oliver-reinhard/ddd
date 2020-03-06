package com.mimacom.ddd.pub.pub.diagramProvider;

public enum DiagramFileFormat {

	PNG(false), JPG(false), SVG(true), EPS(true);

	private DiagramFileFormat(boolean vectorDiagram) {
		this.vectorDiagram = vectorDiagram;
	}

	private boolean vectorDiagram;

	boolean isVectorDiagram() {
		return vectorDiagram;
	}
}
