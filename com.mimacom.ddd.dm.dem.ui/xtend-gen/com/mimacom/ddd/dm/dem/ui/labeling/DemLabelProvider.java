/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.ui.labeling;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.dmx.ui.labeling.DmxLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class DemLabelProvider extends DmxLabelProvider {
  @Inject
  public DemLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final DAggregate a) {
    String _name = a.getName();
    return ("Component " + _name);
  }
}
