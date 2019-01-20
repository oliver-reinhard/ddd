/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dms.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mimacom.ddd.dm.dms.DmsRuntimeModule;
import com.mimacom.ddd.dm.dms.DmsStandaloneSetup;
import com.mimacom.ddd.dm.dms.ide.DmsIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DmsIdeSetup extends DmsStandaloneSetup {
  @Override
  public Injector createInjector() {
    DmsRuntimeModule _dmsRuntimeModule = new DmsRuntimeModule();
    DmsIdeModule _dmsIdeModule = new DmsIdeModule();
    return Guice.createInjector(Modules2.mixin(_dmsRuntimeModule, _dmsIdeModule));
  }
}
