package com.mimacom.ddd.dm.dom.evaluator;

import com.google.inject.Singleton;
import com.mimacom.ddd.dm.base.DNamedElement;
import com.mimacom.ddd.dm.dmx.DmxContextReference;
import com.mimacom.ddd.dm.dmx.evaluator.DmxExpressionEvaluator;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;

@Singleton
@SuppressWarnings("all")
public class DomExpressionEvaluator extends DmxExpressionEvaluator {
  /**
   * Non-dispatching; use to override
   */
  @Override
  public Object valueForContextReferenceSwitch(final DmxContextReference expr) {
    final DNamedElement target = expr.getTarget();
    if ((target instanceof DomNamedComplexObject)) {
      return ((DomNamedComplexObject)target).getObject();
    }
    return super.valueForContextReferenceSwitch(expr);
  }
}
