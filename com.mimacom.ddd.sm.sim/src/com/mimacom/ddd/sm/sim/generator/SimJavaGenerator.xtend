package com.mimacom.ddd.sm.sim.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.mimacom.ddd.sm.sim.SInformationModel
import org.eclipse.xtext.EcoreUtil2
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.sm.sim.SAggregateDeduction

class SimJavaGenerator extends AbstractGenerator {

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.filter(SInformationModel).head;
		if (model !== null) {
		  val aggregates = EcoreUtil2.getAllContentsOfType(model, DAggregate)
		  	.filter[!(it instanceof SAggregateDeduction)]
		  	.toList
		  
			aggregates.forEach[generateForAggregate(fsa)]
		}
	}
	
	def private void generateForAggregate(DAggregate aggregate, IFileSystemAccess2 fsa) {
		fsa.generateFile(aggregate.name + '.java', aggregate.name)
	}

}
