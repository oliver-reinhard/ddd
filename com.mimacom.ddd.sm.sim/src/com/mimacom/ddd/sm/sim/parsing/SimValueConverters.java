package com.mimacom.ddd.sm.sim.parsing;

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
public class SimValueConverters extends Ecore2XtextTerminalConverters {

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

	/*
	 * @ValueConverter(rule = "BIG_DECIMAL") public IValueConverter<BigDecimal>
	 * BIG_DECIMAL() { return new AbstractToStringConverter<BigDecimal>() {
	 * 
	 * @Override protected BigDecimal internalToValue(String string, INode node)
	 * throws ValueConverterException { return new BigDecimal(string); } }; }
	 */
}
