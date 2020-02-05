package com.mimacom.ddd.sm.sim.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class SimCompositeGenerator extends AbstractGenerator {
  
  @Inject SimDefaultGenerator defaultGenerator
  @Inject SimJavaGenerator javaGenerator
  
  override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
    defaultGenerator.doGenerate(input, fsa, context)
    javaGenerator.doGenerate(input, fsa, context)
  }
  
}