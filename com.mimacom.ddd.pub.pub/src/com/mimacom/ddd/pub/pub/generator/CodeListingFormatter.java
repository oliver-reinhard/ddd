package com.mimacom.ddd.pub.pub.generator;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeListingFormatter {

	/**
	 * Remove blank lines at the beginning and the end of the listing.
	 * 
	 * Do not append '\n' to last line.
	 */
	public String trimBlankLines(String listing) {
		return trimBlankLines(listing.split("\n"));
	}

	/**
	 * Do not append '\n' to last line.
	 */
	public String trimBlankLines(String[] lines) {
		final Pattern blankLine = Pattern.compile("^\\s*$");
		int start = 0;
		int end = lines.length - 1;
		while (start <= end) {
			final Matcher matcher = blankLine.matcher(lines[start]);
			if (!matcher.matches()) {
				break;
			}
			start++;
		}
		while (start < end) {
			final Matcher matcher = blankLine.matcher(lines[end]);
			if (!matcher.matches()) {
				break;
			}
			end--;
		}
		final StringBuilder b = new StringBuilder();
		for (int i = start; i <= end; i++) {
			if (i > start) {
				b.append("\n");
			}
			b.append(lines[i]);
		}
		return b.toString();
	}

	/**
	 * Outdent the listing's lines by the leading indentation common to each line.
	 * 
	 * Do not append '\n' to last line.
	 */
	public String outdent(String listing, int tabSize) {
		final String[] lines = listing.split("\n");
		int minIndent = Integer.MAX_VALUE;
		for (String line : lines) {
			final int indentCount = indentationSize(line, tabSize);
			minIndent = Math.min(minIndent, indentCount);
		}
		if (minIndent == Integer.MAX_VALUE) {
			// only blank lines
			return listing;
		}
		final StringBuilder b = new StringBuilder();
		for (int i = 0; i < lines.length; i++) {
			if (i > 0) {
				b.append("\n");
			}
			appendOutdentedLine(b, lines[i], tabSize, minIndent);
		}
		return b.toString();
	}

	protected int indentationSize(String line, int tabSize) {
		char[] chars = line.toCharArray();
		int size = 0;
		int i = 0;
		while (i < chars.length) {
			final char c = chars[i];
			if (c == '\t') {
				size += tabSize;
			} else if (c == ' ') {
				size++;
			} else {
				return size;
			}
			i++;
		}
		// line is empty or contains whitespace only => ignore this line's indentation
		// size:
		return Integer.MAX_VALUE;
	}

	/**
	 * Do not append to line.
	 */
	protected void appendOutdentedLine(StringBuilder b, String line, int tabSize, int outdentSize) {
		final char[] chars = line.toCharArray();
		int outdentedSize = 0;
		int i = 0;
		while (i < chars.length) {
			final char c = chars[i];
			if (c == '\t') {
				if (outdentedSize < outdentSize) {
					outdentedSize += tabSize;
				} else {
					for (int j = 0; j < tabSize; j++) {
						b.append(' ');
					}
				}
			} else if (c == ' ') {
				if (outdentedSize < outdentSize) {
					outdentedSize++;
				} else {
					b.append(' ');
				}
			} else {
				b.append(chars, i, chars.length - i);
				break;
			}
			i++;
		}
	}

	/**
	 * Do not append '\n' to last line.
	 */
	public String numberLines(String listing) {
		final String[] lines = listing.split("\n");
		final int numLines = lines.length;
		final int digits = (int) Math.min(Math.log10(numLines) + 1, 2); // min 2 digits
		final StringBuilder decimalPattern = new StringBuilder();
		for (int d = 0; d < digits; d++) {
			decimalPattern.append('0');
		}
		final DecimalFormat format = new DecimalFormat(decimalPattern.toString());

		final StringBuilder b = new StringBuilder();
		for (int i = 0; i < lines.length; i++) {
			if (i > 0) {
				b.append("\n");
			}
			b.append(format.format(i + 1));
			b.append("\t");
			b.append(lines[i]);
		}
		return b.toString();
	}
}
