/*
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.ui.tests;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dom.ui.internal.DomActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DomUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DomActivator.getInstance().getInjector("com.mimacom.ddd.dm.dom.Dom");
	}

}
