package com.mimacom.ddd.util.plantuml;

import org.eclipse.swt.SWT;

public enum PlantUmlFileFormat {
	PNG(SWT.IMAGE_PNG), JPG(SWT.IMAGE_JPEG), SVG(100), EPS(101);

	final int value;

	PlantUmlFileFormat(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}
}
