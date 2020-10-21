/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.esm.EsmPackage;
import com.mimacom.ddd.dm.esm.EsmStandaloneSetupGenerated;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EsmStandaloneSetup extends EsmStandaloneSetupGenerated {
  public static void doSetup() {
    new EsmStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public void register(final Injector injector) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(EsmPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(EsmPackage.eNS_URI, EsmPackage.eINSTANCE);
    }
    super.register(injector);
  }
}
