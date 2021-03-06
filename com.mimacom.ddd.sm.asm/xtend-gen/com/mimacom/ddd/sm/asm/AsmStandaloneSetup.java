/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.sm.asm;

import com.google.inject.Injector;
import com.mimacom.ddd.sm.asm.AsmPackage;
import com.mimacom.ddd.sm.asm.AsmStandaloneSetupGenerated;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AsmStandaloneSetup extends AsmStandaloneSetupGenerated {
  public static void doSetup() {
    new AsmStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public void register(final Injector injector) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(AsmPackage.eNS_URI);
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put(AsmPackage.eNS_URI, AsmPackage.eINSTANCE);
    }
    super.register(injector);
  }
}
