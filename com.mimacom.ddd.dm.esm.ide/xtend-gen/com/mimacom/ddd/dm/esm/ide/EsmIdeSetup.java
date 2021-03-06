/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mimacom.ddd.dm.esm.EsmRuntimeModule;
import com.mimacom.ddd.dm.esm.EsmStandaloneSetup;
import com.mimacom.ddd.dm.esm.ide.EsmIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EsmIdeSetup extends EsmStandaloneSetup {
  @Override
  public Injector createInjector() {
    EsmRuntimeModule _esmRuntimeModule = new EsmRuntimeModule();
    EsmIdeModule _esmIdeModule = new EsmIdeModule();
    return Guice.createInjector(Modules2.mixin(_esmRuntimeModule, _esmIdeModule));
  }
}
