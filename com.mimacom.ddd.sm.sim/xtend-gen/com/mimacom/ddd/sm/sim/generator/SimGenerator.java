/**
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.sm.sim.generator;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.sm.sim.SDeducibleElement;
import com.mimacom.ddd.sm.sim.SFeature;
import com.mimacom.ddd.sm.sim.SLiteral;
import java.io.CharArrayWriter;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SimGenerator extends AbstractGenerator {
  @Inject
  private ISerializer serializer;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      final XtextResourceSet targetRS = new XtextResourceSet();
      EcoreUtil2.<XtextResourceSet>clone(targetRS, resource.getResourceSet());
      final Resource resourceCopy = targetRS.getResource(resource.getURI(), false);
      boolean _removeTransformationItems = this.removeTransformationItems(resourceCopy);
      if (_removeTransformationItems) {
        final CharArrayWriter writer = new CharArrayWriter(1000);
        final SaveOptions saveOptions = SaveOptions.getOptions(null);
        this.serializer.serialize(IterableExtensions.<EObject>head(resourceCopy.getContents()), writer, saveOptions);
        String _firstUpper = StringExtensions.toFirstUpper(resource.getURI().lastSegment());
        String _plus = ("Deduced" + _firstUpper);
        fsa.generateFile(_plus, writer.toString());
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean removeTransformationItems(final Resource resource) {
    boolean hadSyntheticItems = false;
    final Iterator<SDeducibleElement> elements = Iterators.<SDeducibleElement>filter(resource.getAllContents(), SDeducibleElement.class);
    final ArrayList<SDeducibleElement> elementsToRemove = Lists.<SDeducibleElement>newArrayList();
    while (elements.hasNext()) {
      {
        final SDeducibleElement e = elements.next();
        if (((e.getDeductionRule() != null) && ((e instanceof SLiteral) || (e instanceof SFeature)))) {
          elementsToRemove.add(e);
        } else {
          e.setDeductionRule(null);
          hadSyntheticItems = (hadSyntheticItems || ((e.getSynthetic() != null) && (e.getSynthetic()).booleanValue()));
          e.unsetSynthetic();
        }
      }
    }
    for (final SDeducibleElement e : elementsToRemove) {
      EcoreUtil.remove(e);
    }
    return hadSyntheticItems;
  }
}