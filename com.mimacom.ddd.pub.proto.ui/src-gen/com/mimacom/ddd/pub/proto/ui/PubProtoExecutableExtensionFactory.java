/*
 * generated by Xtext 2.21.0.M1
 */
package com.mimacom.ddd.pub.proto.ui;

import com.google.inject.Injector;
import com.mimacom.ddd.pub.proto.ui.internal.ProtoActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PubProtoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ProtoActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ProtoActivator activator = ProtoActivator.getInstance();
		return activator != null ? activator.getInjector(ProtoActivator.COM_MIMACOM_DDD_PUB_PROTO_PUBPROTO) : null;
	}

}
