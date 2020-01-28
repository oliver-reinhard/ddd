/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom;

import com.mimacom.ddd.dm.dmx.indexing.DmxResourceDescriptionStrategy;
import com.mimacom.ddd.dm.dmx.typecomputer.DmxTypeComputer;
import com.mimacom.ddd.dm.dom.AbstractDomRuntimeModule;
import com.mimacom.ddd.dm.dom.typecomputer.DomTypeComputer;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class DomRuntimeModule extends AbstractDomRuntimeModule {
  public Class<? extends DmxTypeComputer> bindITypeComputer() {
    return DomTypeComputer.class;
  }
  
  public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
    return DmxResourceDescriptionStrategy.class;
  }
}
