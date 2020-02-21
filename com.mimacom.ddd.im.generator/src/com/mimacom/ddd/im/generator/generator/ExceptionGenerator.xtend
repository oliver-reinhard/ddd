package com.mimacom.ddd.im.generator.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import com.mimacom.ddd.dm.dmx.scoping.DmxQualifiedNameProvider
import com.mimacom.ddd.sm.asm.SException
import com.mimacom.ddd.dm.base.DTextSegment

/**
 * Generator for mapped exceptions.
 */
class ExceptionGenerator implements IGenerator {
	
	@Inject DmxQualifiedNameProvider dmxQualifiedNameProvider
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.contents.head
		if (model instanceof Model && (model as Model).exceptionMappings !== null) {
			(model as Model).exceptionMappings.forEach[generateExceptionMapping(fsa)]
		}
	}
	
	private def generateExceptionMapping(ExceptionMapping mapping, IFileSystemAccess fsa) {
		val mappedException = mapping.name as SException
		if (mappedException === null) {
			return;
		}
		
		val qualifiedExceptionName = dmxQualifiedNameProvider.getFullyQualifiedName(mappedException)
		val superClass = mapping.extends !== null ? mapping.extends.qualifiedName : 'Exception'
		val className = qualifiedExceptionName.lastSegment
		val packageName = mapping.getPackageName
		val fileNamePrefix = packageName.empty ? '' : packageName.replaceAll('\\.', '/') + '/'
		
		// TODO [gh-19] is there a way to get the DRichText as a formatted string? 
		val description = if (mappedException.description !== null) mappedException.description.segments
			.filter(DTextSegment)
			.map[value]
			.join
		
		fsa.generateFile(fileNamePrefix + className + '.java', '''
			«IF !packageName.empty»
				package «packageName»;
			«ENDIF»
			
			«IF description !== null»
			/**
			 * «description»
			 */«ENDIF»
			@SuppressWarnings("serial")
			public class «className» extends «superClass» {
				public «className»() {
					super(«IF mapping.message !== null»"«mapping.message»"«ENDIF»);
				}
			}
		''')
	}
	
	private def getPackageName(ExceptionMapping mapping) {
		if (mapping.package !== null) {
			return mapping.package.toLowerCase
		}
		val mappedException = mapping.name as SException
		if (mappedException === null) {
			return "";
		}
		val qualifiedExceptionName = dmxQualifiedNameProvider.getFullyQualifiedName(mappedException)
		return qualifiedExceptionName.segments.take(qualifiedExceptionName.segmentCount-1).join('.').toLowerCase
	}
	
}