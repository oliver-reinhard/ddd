/*
 * generated by Xtext 2.21.0.M1
 */
package com.mimacom.ddd.pub.proto.ui.tests;

import com.google.inject.Injector;
import com.mimacom.ddd.pub.proto.ui.internal.ProtoActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class PubProtoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ProtoActivator.getInstance().getInjector("com.mimacom.ddd.pub.proto.PubProto");
	}

}
