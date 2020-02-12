package com.mimacom.ddd.sm.sim.generator;

import com.google.inject.Inject;
import com.mimacom.ddd.sm.sim.generator.SimDefaultGenerator;
import com.mimacom.ddd.sm.sim.generator.SimJavaGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class SimCompositeGenerator extends AbstractGenerator {
  @Inject
  private SimDefaultGenerator defaultGenerator;
  
  @Inject
  private SimJavaGenerator javaGenerator;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.defaultGenerator.doGenerate(input, fsa, context);
    this.javaGenerator.doGenerate(input, fsa, context);
  }
}
