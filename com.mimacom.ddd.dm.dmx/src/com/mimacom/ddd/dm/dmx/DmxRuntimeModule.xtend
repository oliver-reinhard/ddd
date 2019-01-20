/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx

import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters
import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class DmxRuntimeModule extends AbstractDmxRuntimeModule {
	
	override Class<? extends IValueConverterService> bindIValueConverterService() {
		return DmxValueConverters
	}
	
//	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider()  {
//		return typeof(DmxQualifiedNameProvider)
//	}
}
