/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dmx.ui.tests;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dmx.ui.internal.DmxActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DmxUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DmxActivator.getInstance().getInjector("com.mimacom.ddd.dm.dmx.Dmx");
	}

}
