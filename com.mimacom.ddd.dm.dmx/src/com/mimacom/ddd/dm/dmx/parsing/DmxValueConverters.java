package com.mimacom.ddd.dm.dmx.parsing;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.conversion.impl.INTValueConverter;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DmxValueConverters extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule = "PLAIN_TEXT_ONLY")
	public IValueConverter<String> PLAIN_TEXT_ONLY() {
		return new RichTextValueConverter('«', '»');
	}

	@ValueConverter(rule = "PLAIN_TEXT_START")
	public IValueConverter<String> PLAIN_TEXT_START() {
		return new RichTextValueConverter('«', '[');
	}

	@ValueConverter(rule = "PLAIN_TEXT_MIDDLE")
	public IValueConverter<String> PLAIN_TEXT_MIDDLE() {
		return new RichTextValueConverter(']', '[');
	}

	@ValueConverter(rule = "PLAIN_TEXT_END")
	public IValueConverter<String> PLAIN_TEXT_END() {
		return new RichTextValueConverter(']', '»');
	}

	@Inject
	private INTValueConverter terminalsIntValueConverter;

	@ValueConverter(rule = "MULTIPLICITY")
	public IValueConverter<Integer> MULTIPLICITY() {
		return new AbstractValueConverter<Integer>() {

			@Override
			public Integer toValue(String string, INode node) throws ValueConverterException {
				if (string == null) return 1;
				if (string.equals("*")) return -1;
				return terminalsIntValueConverter.toValue(string, node);
			}

			@Override
			public String toString(Integer value) throws ValueConverterException {
				if (value < 0) return "*";
				return value.toString();
			}
		};
	}

	static class RichTextValueConverter extends AbstractValueConverter<String> {
		final char prefix;
		final char postfix;

		RichTextValueConverter(final char prefix, final char postfix) {
			this.prefix = prefix;
			this.postfix = postfix;
		}

		@Override
		public String toValue(String string, INode node) throws ValueConverterException {
			if (string == null || string.length() < 2)
				return "";
			return string.substring(1, string.length() - 1).trim();
		}

		@Override
		public String toString(String value) throws ValueConverterException {
			StringBuilder b = new StringBuilder(prefix);
			b.append(value);
			b.append(postfix);
			return b.toString();
		}
	}

	/*
	 * @ValueConverter(rule = "BIG_DECIMAL") public IValueConverter<BigDecimal>
	 * BIG_DECIMAL() { return new AbstractToStringConverter<BigDecimal>() {
	 * 
	 * @Override protected BigDecimal internalToValue(String string, INode node)
	 * throws ValueConverterException { return new BigDecimal(string); } }; }
	 */
}
