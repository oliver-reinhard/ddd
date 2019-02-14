/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.ui.labeling;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.sim.SAggregate;
import com.mimacom.ddd.sm.sim.SCondition;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SLiteral;
import com.mimacom.ddd.sm.sim.SType;
import com.mimacom.ddd.sm.sim.SimUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class SimLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  @Extension
  private SimUtil _simUtil;
  
  @Inject
  public SimLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final SAggregate a) {
    if (((a.getDeductionRule() != null) && (!a.isSynthetic()))) {
      String _label = this._simUtil.label(a.getDeductionRule());
      return (">" + _label);
    }
    return this._simUtil.label(a);
  }
  
  public String text(final SType t) {
    if (((t.getDeductionRule() != null) && (!t.isSynthetic()))) {
      String _label = this._simUtil.label(t.getDeductionRule());
      return (">" + _label);
    }
    return this._simUtil.label(t);
  }
  
  public String text(final SFeature f) {
    if (((f.getDeductionRule() != null) && (!f.isSynthetic()))) {
      String _label = this._simUtil.label(f.getDeductionRule());
      return (">" + _label);
    }
    return this._simUtil.label(f);
  }
  
  public String text(final SCondition c) {
    return this._simUtil.label(c);
  }
  
  public String text(final SLiteral literal) {
    if (((literal.getDeductionRule() != null) && (!literal.isSynthetic()))) {
      String _label = this._simUtil.label(literal.getDeductionRule());
      return (">" + _label);
    }
    return literal.getName();
  }
}
