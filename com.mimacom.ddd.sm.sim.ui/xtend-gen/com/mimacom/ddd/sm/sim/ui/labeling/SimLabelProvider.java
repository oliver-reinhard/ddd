/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.ui.labeling;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.base.DAggregate;
import com.mimacom.ddd.dm.base.base.DFeature;
import com.mimacom.ddd.dm.base.base.DLiteral;
import com.mimacom.ddd.dm.base.base.DNamedPredicate;
import com.mimacom.ddd.dm.base.base.DQueryParameter;
import com.mimacom.ddd.dm.base.base.DType;
import com.mimacom.ddd.dm.base.transpose.TAggregateTransposition;
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition;
import com.mimacom.ddd.dm.base.transpose.TLiteralTransposition;
import com.mimacom.ddd.dm.base.transpose.TQueryParameterTransposition;
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition;
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
  
  public String text(final DAggregate a) {
    if ((a instanceof TAggregateTransposition)) {
      String _label = this._simUtil.label(((TAggregateTransposition)a).getTranspositionRule());
      return (">" + _label);
    }
    return this._simUtil.label(a);
  }
  
  public String text(final DType t) {
    if ((t instanceof TTypeTransposition)) {
      String _label = this._simUtil.label(((TTypeTransposition)t).getTranspositionRule());
      return (">" + _label);
    }
    return this._simUtil.label(t);
  }
  
  public String text(final DFeature f) {
    if ((f instanceof TFeatureTransposition)) {
      String _label = this._simUtil.label(((TFeatureTransposition)f).getTranspositionRule());
      return (">" + _label);
    }
    return this._simUtil.label(f);
  }
  
  public String text(final DQueryParameter p) {
    if ((p instanceof TQueryParameterTransposition)) {
      String _label = this._simUtil.label(((TQueryParameterTransposition)p).getTranspositionRule());
      return (">" + _label);
    }
    return this._simUtil.label(p);
  }
  
  public String text(final DNamedPredicate c) {
    return this._simUtil.label(c);
  }
  
  public String text(final DLiteral literal) {
    if ((literal instanceof TLiteralTransposition)) {
      String _label = this._simUtil.label(((TLiteralTransposition)literal).getTranspositionRule());
      return (">" + _label);
    }
    return literal.getName();
  }
}
