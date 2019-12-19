package com.mimacom.ddd.system.tests;

import com.google.inject.Injector;
import com.mimacom.ddd.dm.dim.tests.DimInjectorProvider;
import com.mimacom.ddd.dm.dmx.tests.DmxInjectorProvider;

@SuppressWarnings("all")
public class SystemTestInjectorProvider extends DimInjectorProvider {
  @Override
  protected Injector internalCreateInjector() {
    Injector _xblockexpression = null;
    {
      new DmxInjectorProvider().getInjector();
      _xblockexpression = super.internalCreateInjector();
    }
    return _xblockexpression;
  }
}
