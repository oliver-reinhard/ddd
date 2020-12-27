package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DInformationModel
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider
import com.mimacom.ddd.util.plantuml.SkinparamArrow
import com.mimacom.ddd.util.plantuml.SkinparamClass
import com.mimacom.ddd.util.plantuml.SkinparamFrame
import com.mimacom.ddd.util.plantuml.SkinparamGlobal
import com.mimacom.ddd.util.plantuml.SkinparamNote
import com.mimacom.ddd.util.plantuml.SkinparamRectangle
import org.eclipse.xtext.EcoreUtil2

abstract class AbstractTypeDiagramTextProviderImpl<T extends DInformationModel> implements IPlantUmlDiagramTextProvider<T> {

	@Inject extension TypesUtil
	@Inject extension PlantUmlTextProviderUtil
	
	@Inject SkinparamGlobal skinparamGlobal
	@Inject SkinparamClass skinparamClass
	@Inject SkinparamArrow skinparamArrow
	@Inject SkinparamRectangle skinparamRectangle
	@Inject SkinparamFrame skinparamFrame
	@Inject SkinparamNote skinparamNote
	
	protected static val MODEL_SHAPE = "<<Frame>>"
	protected static val AGGREGATE_SHAPE = "<<Rectangle>>"
	

	override String diagramText(T model) {
		val data = model.getData()
		val allSubtypes = EcoreUtil2.eAllOfType(model, DComplexType).filter[superType !== null]

		val result = '''
			@startuml
			
			«generateSkinParameters()»
			
			«IF ! model.notes.empty»
				' all model notes
				«model.generateNotes»
			«ENDIF»
			
			«IF ! model.types.empty»
				' all domain-level types
				«FOR t:model.types.filter[!(it instanceof TTypeTransposition)]»
					«t.generateType»
				«ENDFOR»
			«ENDIF»
			
			' all aggregates
			«FOR a : data.allAggregates»
				package «a.aggregateName» «AGGREGATE_SHAPE» {
					«IF ! a.features.empty»«a.generateAggregateQueries»«ENDIF»
					«FOR t:a.types.filter[!(it instanceof TTypeTransposition)]»
						«t.generateType»
					«ENDFOR»
				}
				«a.generateNotes»
			«ENDFOR»
			
			' all aggregates referenced from within current model
			«FOR a : data.allAggregatesReferencedWithinModel»«a.generateReferencedAggregate»«ENDFOR»
			
			' all referenced models
			«FOR d : data.allReferencedModels»«d.generateReferencedModel»«ENDFOR»
			
			' all associations
			«FOR a : data.allAssociations»
				«a.generateEntityAssociation»
			«ENDFOR»
			
			' all detail attributes (i.e. attributes with type DDetailType)
			«FOR a : data.allDetailAttributes»
				«a.generateDetailAssociation»
			«ENDFOR»
			
			' all subtypes
			«FOR s : allSubtypes»
				«s.typeQN» --|> «IF s.aggregateName === s.superType.aggregateName»«s.superType.typeQN»«ELSE»«s.superType.aggregateQN»«ENDIF»
			«ENDFOR»
			
			@enduml
		    '''
		return result
	}
	
	abstract protected def TypeDiagramTextProviderData getData(T model)
	
	def generateSkinParameters() '''
		«skinparamGlobal»
		
		«skinparamClass»
		
		«skinparamArrow»
		
		«skinparamRectangle»
				
		«skinparamFrame»
		
		«skinparamNote»
		
		set NamespaceSeparator .
	'''
	
	def generateReferencedModel(String domain) '''
		package «domain» «MODEL_SHAPE» { 
		}'''

	def generateReferencedAggregate(DAggregate a) '''
		package «a.aggregateName» «AGGREGATE_SHAPE» {
		}
	'''
		
	def generateAggregateQueries(DAggregate a) '''	
		' aggregate «a.name» static queries
		abstract class «a.aggregateQueriesClassName» «a.spot» {
			«FOR q : a.features»«(q as DQuery).generateAggregateQuery»«ENDFOR»
		}
		«FOR q : a.features»
			«q.generateNotes»
		«ENDFOR»
	'''

	def dispatch generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.typeQN» «c.spot» {
«««			«IF c.hasStateFeature»state() : «c.statesFeatureName»«ENDIF»
			«FOR f : c.features.filter[!(it instanceof TFeatureTransposition)]»«f.generateFeature»«ENDFOR»
		}
«««		«IF c.hasStateFeature»«c.statesEnumeration.generateEnumeration»«ENDIF»
		«c.generateNotes»
		«FOR f : c.features.filter[! renderAsLink]»
			«f.generateNotes»
		«ENDFOR»
	'''

	def dispatch generateType(DPrimitive p) '''	
		class «p.typeQN» «p.spot»
		«p.generateNotes»
	'''
	
	def dispatch generateType(DEnumeration e) {
		e.generateEnumeration
	}

	def generateEnumeration(DEnumeration e) '''
		enum «e.typeQN» «e.spot» {
			«FOR f : e.literals»
				«f.name»
			«ENDFOR»
		}
		«e.generateNotes»
		«FOR lit : e.literals»
			«lit.generateNotes»
		«ENDFOR»
	'''

	def dispatch generateType(DType t) '''
		UNKNOWN META TYPE: «t.class.name»
	'''

	def generateAggregateQuery(DQuery q) '''
		«IF q.getType !== null»
			{static} «q.name»(«q.generateQueryParameters») : «q.getType.name» «q.multiplicityText(true)»
			«ENDIF»
	'''

	def dispatch generateFeature(DAttribute a) '''
		«IF ! (a.getType === null || a.renderAsLink)»«a.name» : «a.getType.name» «a.multiplicityText(false)»«ENDIF»
	'''

	def dispatch generateFeature(DQuery q) '''
		«IF q.getType !== null»
			«q.name»(«q.generateQueryParameters») : «q.getType.name» «q.multiplicityText(true)»
		«ENDIF»
	'''

	def dispatch generateFeature(DAssociation a) '''
	'''

	def generateQueryParameters(DQuery q) '''«FOR p : q.parameters SEPARATOR ", "»«p.name»:«p.getType.name» «p.multiplicityText(true)»«ENDFOR»'''

	def generateEntityAssociation(DAssociation a) {
		val targetLabel = a.name + " " + a.multiplicityText(false)
		val text = switch a.kind {
			case REFERENCE: generateLink('', a.eContainer as DType, a.getType, targetLabel, '>')
			case COMPOSITE: generateLink('*', a.eContainer as DType, a.getType, targetLabel, '>')
			case INVERSE_COMPOSITE: generateLink('}', a.eContainer as DType, a.getType, targetLabel, '*')
		}
		'''
		«text»
		«a.generateNotes»
		'''
	}

	def generateDetailAssociation(DAttribute a) {
		val label = a.name + " " + a.multiplicityText(false)
		'''
		«generateLink('+', a.eContainer as DType, a.getType, label, "")»
		«a.generateNotes»
		'''
	}

	def generateLink(String sourceArrowhead, DType source, DType target, String targetRole, String targetArrowhead) '''
		«source.typeQN» «sourceArrowhead»--«targetArrowhead» «associationTargetQN(source,target)» : «targetRole»
	'''
}
