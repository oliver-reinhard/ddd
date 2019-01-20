/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dmx;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dmx.DmxPackage;
import com.mimacom.ddd.dm.dmx.DmxStandaloneSetupGenerated;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DmxStandaloneSetup extends DmxStandaloneSetupGenerated {
  public static void doSetup() {
    new DmxStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public void register(final Injector injector) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(DmxPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(DmxPackage.eNS_URI, DmxPackage.eINSTANCE);
    }
    super.register(injector);
  }
}
