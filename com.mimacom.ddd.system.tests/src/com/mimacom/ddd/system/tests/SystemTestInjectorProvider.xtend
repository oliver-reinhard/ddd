package com.mimacom.ddd.system.tests

import com.mimacom.ddd.dm.dim.tests.DimInjectorProvider
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider

class SystemTestInjectorProvider extends DimInjectorProvider {

  override protected internalCreateInjector() {
    // do EMF registration and create injector for any referenced languages
    new DmxInjectorProvider().injector
    
    super.internalCreateInjector()
  }

}
