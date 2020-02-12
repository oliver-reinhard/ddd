package com.mimacom.ddd.sm.sim.generator

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider
import com.mimacom.ddd.sm.sim.SInformationModel
import com.mimacom.ddd.sm.sim.SInformationModelKind
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.mimacom.ddd.sm.sim.generator.dto.EntityDtoGenerator

class SimJavaGenerator extends AbstractGenerator {

	@Inject DmxQualifiedNameProvider qualifiedNameProvider
	@Inject EntityDtoGenerator entityDtoGenerator

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.filter(SInformationModel).head;
		if (model !== null) {
		  model.generateForCoreInformationModel(fsa)
		}
	}
	
	def private void generateForCoreInformationModel(SInformationModel model, IFileSystemAccess2 fsa) {
		if (!( model !== null && model.kind === SInformationModelKind.CORE)) {
			return
		}
		
		model.types.forEach[generateDtoForType(fsa)]
//		fsa.generateFile(aggregate.name + '.java', aggregate.name)
	}

	def dispatch private void generateDtoForType(DEntityType entity, IFileSystemAccess2 fsa) {
		val packageName = entity.getPackageName.toLowerCase
		val className = (packageName.contains('.') ? packageName + '.' : '') + entity.name.toFirstUpper + 'Dto'
		val fileName = '''«className.replaceAll('\\.', '/')».java'''
		val content = entityDtoGenerator.generateBody(entity, className)
		fsa.generateFile(fileName, content)
	}

	def dispatch private void generateDtoForType(DType entity, IFileSystemAccess2 fsa) {
		// do nothing
	}
	
	def private <T extends EObject> getPackageName(T object) {
		val segments = qualifiedNameProvider.getFullyQualifiedName(object).segments
		if (segments.empty || segments.size == 1) {
			return ''
		}
		val result = segments.subList(0, segments.size - 1).join('.')
		return result
	}
}
