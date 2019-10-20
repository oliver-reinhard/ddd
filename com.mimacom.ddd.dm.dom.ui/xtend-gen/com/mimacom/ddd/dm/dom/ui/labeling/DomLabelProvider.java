/**
 * generated by Xtext 2.17.1
 */
package com.mimacom.ddd.dm.dom.ui.labeling;

import com.google.inject.Inject;
import com.mimacom.ddd.dm.dom.DomField;
import com.mimacom.ddd.dm.dom.DomNamedComplexObject;
import com.mimacom.ddd.dm.dom.DomUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class DomLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  @Extension
  private DomUtil _domUtil;
  
  @Inject
  public DomLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final DomNamedComplexObject o) {
    return this._domUtil.label(o);
  }
  
  public String text(final DomField f) {
    return this._domUtil.label(f);
  }
}
