/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dem.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mimacom.ddd.dm.dem.DemRuntimeModule;
import com.mimacom.ddd.dm.dem.DemStandaloneSetup;
import com.mimacom.ddd.dm.dem.ide.DemIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DemIdeSetup extends DemStandaloneSetup {
  @Override
  public Injector createInjector() {
    DemRuntimeModule _demRuntimeModule = new DemRuntimeModule();
    DemIdeModule _demIdeModule = new DemIdeModule();
    return Guice.createInjector(Modules2.mixin(_demRuntimeModule, _demIdeModule));
  }
}
