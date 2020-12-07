package com.mimacom.ddd.dm.base.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.TypesUtil
import com.mimacom.ddd.dm.base.base.DAggregate
import com.mimacom.ddd.dm.base.base.DAssociation
import com.mimacom.ddd.dm.base.base.DAttribute
import com.mimacom.ddd.dm.base.base.DComplexType
import com.mimacom.ddd.dm.base.base.DDetailType
import com.mimacom.ddd.dm.base.base.DEntityNature
import com.mimacom.ddd.dm.base.base.DEntityType
import com.mimacom.ddd.dm.base.base.DEnumeration
import com.mimacom.ddd.dm.base.base.DInformationModel
import com.mimacom.ddd.dm.base.base.DPrimitive
import com.mimacom.ddd.dm.base.base.DQuery
import com.mimacom.ddd.dm.base.base.DType
import com.mimacom.ddd.dm.base.transpose.TFeatureTransposition
import com.mimacom.ddd.dm.base.transpose.TTypeTransposition
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider
import org.eclipse.xtext.EcoreUtil2

abstract class TypeDiagramTextProviderImpl<T extends DInformationModel> implements IPlantUmlDiagramTextProvider<T> {

	@Inject extension TypesUtil
	@Inject extension TypeDiagramTextProviderUtil
	
	protected static val MODEL_SHAPE = "<<Frame>>"
	protected static val AGGREGATE_SHAPE = "<<Rectangle>>"

	override String diagramText(T model) {
		val data = model.getData()
		val allSubtypes = EcoreUtil2.eAllOfType(model, DComplexType).filter[superType !== null]

		val result = '''
			@startuml
			
			hide empty members
			
			«generateSkinParameters()»
			
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
			«ENDFOR»
			
			' all aggregates referenced from within current model
			«FOR a : data.allAggregatesReferencedWithinModel»«a.generateReferencedAggregate»«ENDFOR»
			
			' all referenced models
			«FOR d : data.allReferencedModels»«d.generateReferencedModel»«ENDFOR»
			
			' all associations
			«FOR a : data.allAssociations»
				«a.generateAssociation»
			«ENDFOR»
			
			' all detail attributes (i.e. attributes with type DDetailType)
			«FOR a : data.allDetailAttributes»
				«a.generateLink»
			«ENDFOR»
			
			' all subtypes
			«FOR s : allSubtypes»
				«s.aggregateName».«s.name» --|> «s.superType.aggregateName»«IF s.aggregateName === s.superType.aggregateName».«s.superType.name»«ENDIF»
			«ENDFOR»
			
			@enduml
		    '''
		return result
	}
	
	abstract protected def TypeDiagramTextProviderData getData(T model)
	
	def generateSkinParameters() '''
		skinparam package {
		}
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
		abstract class «a.name».«a.name» «a.spot» {
			«FOR q : a.features»«(q as DQuery).generateStaticQuery»«ENDFOR»
		}
	'''

	def dispatch generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.typeName» «c.spot» {
«««			«IF c.hasStateFeature»state() : «c.statesFeatureName»«ENDIF»
			«FOR f : c.features.filter[!(it instanceof TFeatureTransposition)]»«f.generateFeature»«ENDFOR»
		}
«««		«IF c.hasStateFeature»«c.statesEnumeration.generateEnumeration»«ENDIF»
	'''

	def dispatch generateType(DPrimitive p) '''	
		class «p.typeName» «p.spot»
	'''
	
	def dispatch generateType(DEnumeration e) {
		e.generateEnumeration
	}

	def generateEnumeration(DEnumeration e) '''
		enum «e.typeName» «e.spot» {
			«FOR f : e.literals»
				«f.name»
			«ENDFOR»
		}
	'''

	def dispatch generateType(DType t) '''
	'''

	def generateStaticQuery(DQuery q) '''
		«IF q.getType !== null»
			{static} «q.name»(«q.generateQueryParameters») : «q.getType.name» «q.multiplicityText(true)»
			«ENDIF»
	'''

	def dispatch generateFeature(DAttribute a) '''
		«IF ! (a.getType === null || a.getType instanceof DDetailType)»«a.name» : «a.getType.name» «a.multiplicityText(false)»«ENDIF»
	'''

	def dispatch generateFeature(DQuery q) '''
		«IF q.getType !== null»
			«q.name»(«q.generateQueryParameters») : «q.getType.name» «q.multiplicityText(true)»
			«ENDIF»
	'''

	def dispatch generateFeature(DAssociation a) '''
	'''

	def generateQueryParameters(DQuery q) '''«FOR p : q.parameters SEPARATOR ", "»«p.name»:«p.getType.name» «p.multiplicityText(true)»«ENDFOR»'''

	def generateAssociation(DAssociation a) {
		val targetLabel = a.name + " " + a.multiplicityText(false)
		return switch a.kind {
			case REFERENCE: generateLink('', a.eContainer as DType, a.getType, targetLabel, '>')
			case COMPOSITE: generateLink('*', a.eContainer as DType, a.getType, targetLabel, '>')
			case INVERSE_COMPOSITE: generateLink('}', a.eContainer as DType, a.getType, targetLabel, '*')
		}
	}

	def generateLink(DAttribute a) {
		val label = a.name + " " + a.multiplicityText(false)
		return generateLink('+', a.eContainer as DType, a.getType, label, "")
	}

	def generateLink(String sourceArrowhead, DType source, DType target, String targetRole, String targetArrowhead) '''
		«source.typeName» «sourceArrowhead»--«targetArrowhead» «targetName(source,target)» : «targetRole»
	'''

	// 
	// Utility methods
	//

	def spot(DAggregate a) {
		"<< (Q,Gold) >>"
	}

	def spot(DType t) {
		// Returns the "Spot Letter" to use next to the class name.
		return switch t {
			DEntityType: if (t.root) "<< (R,#FB3333) >>" else if (t.nature == DEntityNature.RELATIONSHIP) "<< (R,#FA78C8) >>" else "<< (E,#F78100) >>"
			DDetailType: "<< (D,#FAE55F) >>"
			DEnumeration: "<< (e,#66B371) >>"
			DPrimitive: "<< (p,#9AF78F) >>"
			default: ""
		}
	}
}
