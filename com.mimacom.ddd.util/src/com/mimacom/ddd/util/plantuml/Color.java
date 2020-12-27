package com.mimacom.ddd.util.plantuml;

public class Color {
	
	static public final Color TRANSPARENT = new Color();
	static public final Color WHITE = new Color(255, 255, 255);
	static public final Color BLACK = new Color(0, 0, 0);

	final byte r;
	final byte g;
	final byte b;
	boolean transparent;

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
		transparent = false;
	}
	
	private Color() {
		r = g = b = 0;
		transparent = true;
	}
	
	public boolean isTransparent() {
		return transparent;
	}
	
	/**
	 * @param other if {@code null} result will always be {@code false}
	 * @param tolerance max. value delta between red, green or blue component of the two colors, must be in range 0..255
	 * @return true if any value delta is greater than {@code tolerance}
	 */
	public boolean similar(Color other, int tolerance) {
		if (other == null) return false;
		final int tol = tolerance < 0 ? 0 : (tolerance > 255 ? 255 : tolerance);
		final int rDiff = Math.abs(this.r - other.r);
		final int bDiff = Math.abs(this.b - other.b);
		final int gDiff = Math.abs(this.g - other.g);
		return rDiff > tol || bDiff > tol || gDiff > tol;
	}

	public String toString() {
		if (transparent) {
			return "transparent";
		}
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
