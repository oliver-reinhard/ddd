/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.esm;

import com.mimacom.ddd.dm.esm.EsmStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class EsmStandaloneSetup extends EsmStandaloneSetupGenerated {
  public static void doSetup() {
    new EsmStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
