package com.mimacom.ddd.util.plantuml;

public class Color {

	final byte r;
	final byte g;
	final byte b;

	public Color(int r, int g, int b) {
		if (r < 0 || r > 255) {
			throw new IllegalArgumentException(Integer.toString(r));
		}
		if (g < 0 || g > 255) {
			throw new IllegalArgumentException(Integer.toString(g));
		}
		if (b < 0 || b > 255) {
			throw new IllegalArgumentException(Integer.toString(b));
		}
		this.r = (byte) r;
		this.g = (byte) g;
		this.b = (byte) b;
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder("#");
		sb.append(String.format("%02X", r));
		sb.append(String.format("%02X", g));
		sb.append(String.format("%02X", b));
		return sb.toString();
	}

	static public String asHexCode(int r, int g, int b) {
		return new Color(r, g, b).toString();
	}
}
