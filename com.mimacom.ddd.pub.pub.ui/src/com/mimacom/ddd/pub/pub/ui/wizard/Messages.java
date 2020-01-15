package com.mimacom.ddd.pub.pub.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.mimacom.ddd.pub.pub.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String HelloWorldFile_Label;
	public static String HelloWorldFile_Description;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
