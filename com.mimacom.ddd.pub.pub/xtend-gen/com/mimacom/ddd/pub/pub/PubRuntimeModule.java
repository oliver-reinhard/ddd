/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub;

import com.mimacom.ddd.dm.dmx.parsing.DmxValueConverters;
import com.mimacom.ddd.pub.pub.AbstractPubRuntimeModule;
import com.mimacom.ddd.pub.pub.indexing.PubQualifiedNameProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class PubRuntimeModule extends AbstractPubRuntimeModule {
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return PubQualifiedNameProvider.class;
  }
  
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return DmxValueConverters.class;
  }
}