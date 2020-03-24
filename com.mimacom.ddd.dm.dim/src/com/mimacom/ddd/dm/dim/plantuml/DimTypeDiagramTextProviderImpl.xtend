package com.mimacom.ddd.dm.dim.plantuml

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.DAggregate
import com.mimacom.ddd.dm.base.DAssociation
import com.mimacom.ddd.dm.base.DAttribute
import com.mimacom.ddd.dm.base.DComplexType
import com.mimacom.ddd.dm.base.DDetailType
import com.mimacom.ddd.dm.base.DEntityNature
import com.mimacom.ddd.dm.base.DEntityType
import com.mimacom.ddd.dm.base.DEnumeration
import com.mimacom.ddd.dm.base.DInformationModel
import com.mimacom.ddd.dm.base.DPrimitive
import com.mimacom.ddd.dm.base.DQuery
import com.mimacom.ddd.dm.base.DType
import com.mimacom.ddd.dm.dim.DimUtil
import com.mimacom.ddd.util.plantuml.IPlantUmlDiagramTextProvider
import org.eclipse.xtext.EcoreUtil2

class DimTypeDiagramTextProviderImpl implements IPlantUmlDiagramTextProvider<DInformationModel> {

	@Inject extension DimUtil
	
	override canProvide(DInformationModel model) {
		model !== null && ! (model.types.empty && model.aggregates.empty)
	}
	
	override String diagramText(DInformationModel model) {
		val allAggregates = EcoreUtil2.eAllOfType(model, DAggregate)
		val allAssociations = EcoreUtil2.eAllOfType(model, DAssociation).filter[getType instanceof DEntityType]
//		val allEntitiesReferencedWithinAggregate = allAssociations.filter[targetType.eContainer == eContainer.eContainer].map[targetType]
		val allEntitiesReferencedWithinDomain = allAssociations.filter[targetType.eContainer != eContainer.eContainer && targetType.domainName == model.name].map[targetType]
		val allAggregatesReferencedWithinDomain = allEntitiesReferencedWithinDomain.map[eContainer as DAggregate]
		val allEntitiesReferencedOutsideDomain = allAssociations.filter[targetType.eContainer != eContainer.eContainer && targetType.domainName != model.name].map[targetType]
		val allDomainsReferencedOutsideDomain = allEntitiesReferencedOutsideDomain.map[domainName]
		val allDetailAttributes = EcoreUtil2.eAllOfType(model, DAttribute).filter[getType instanceof DDetailType]
		val allSubtypes = EcoreUtil2.eAllOfType(model, DComplexType).filter[superType !== null]
        
       val result = '''
			@startuml
			
			hide empty members
			
			skinparam package {
				BorderColor FireBrick
				FontColor FireBrick
			}
			
			«IF ! model.types.empty»
				' all domain-level types
				«FOR t:model.types»
					«t.generateType»
				«ENDFOR»
			«ENDIF»
			
			' all aggregates
			«FOR a:allAggregates»package «a.aggregateName» <<Rectangle>> {
				«IF ! a.features.empty»«a.generateAggregateQueries»«ENDIF»
				«FOR t:a.types»
					«t.generateType»
				«ENDFOR»
			}
			«ENDFOR»
			
			' all aggregates referenced from within current domain
			«FOR awa:allAggregatesReferencedWithinDomain»
				package «awa.aggregateName» <<Rectangle>> {
				}
			«ENDFOR»
			
			' all entities referenced from within current domain
«««			This generates duplicate entries when a type if referenced from another aggregate:
«««			«FOR re:allEntitiesReferencedWithinDomain»
«««				«re.generateType»
«««			«ENDFOR»
			
			' all other referenced domains
			«FOR rd:allDomainsReferencedOutsideDomain»
				package «rd» <<Frame>> { 
				}
			«ENDFOR»
			
			' all associations
			«FOR a:allAssociations»
				«a.generateAssociation»
			«ENDFOR»
			
			' all detail attributes
			«FOR a:allDetailAttributes»
				«a.generateLink»
			«ENDFOR»
			
			' all subtypes
			«FOR s:allSubtypes»
				«s.aggregateName».«s.name» --|> «s.superType.aggregateName»«IF s.aggregateName === s.superType.aggregateName».«s.superType.name»«ENDIF»
			«ENDFOR»
			
			@enduml
        '''
       return result
	}
	
	def  generateAggregateQueries(DAggregate a) '''	
		' aggregate «a.name» static queries
		abstract class «a.name».«a.name» «a.getSpot» {
			«FOR q : a.features»«(q as DQuery).generateStaticQuery»«ENDFOR»
		}
	'''
	
	def dispatch  generateType(DComplexType c) '''	
		«IF c.abstract»abstract «ENDIF»class «c.aggregateName».«c.name» «c.getSpot» {
			«FOR f:c.features»«f.generateFeature»«ENDFOR»
		}
	'''
	
	def dispatch  generateType(DPrimitive p) '''	
		class «p.aggregateName».«p.name» «p.getSpot»
	'''
	
	def dispatch  generateType(DEnumeration e)  '''
		enum «e.aggregateName».«e.name» «e.getSpot» {
			«FOR f:e.literals»
				«f.name»
			«ENDFOR»
		}
	'''
	
	def dispatch generateType(DType t) '''
	'''
	
	def getSpot(DAggregate a) {
		"<< (Q,Gold) >>"
	}
	
	def getSpot(DType t) {
		// Returns the "Spot Letter" to use next to the class name.
		return switch t {
		DEntityType : if (t.root) "<< (R,#FB3333) >>" else if (t.nature == DEntityNature.RELATIONSHIP) "<< (R,#FA78C8) >>" else "<< (E,#F78100) >>"
		DDetailType : "<< (D,#FAE55F) >>"
		DEnumeration: "<< (e,#66B371) >>"
		DPrimitive:  "<< (p,#9AF78F) >>"
		default:""
		}
	}
	
	def generateStaticQuery(DQuery q) '''
	   «IF q.getType !== null»
	   		{static} «q.name»(«q.generateQueryParameters») : «q.getType.name» «q.multiplicityText»
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(DAttribute a) '''
		«IF ! (a.getType === null || a.getType instanceof DDetailType)»«a.name» : «a.getType.name» «a.multiplicityText»«ENDIF»
	  '''

	def dispatch generateFeature(DQuery q) '''
	   «IF q.getType !== null»
	   		«q.name»(«q.generateQueryParameters») : «q.getType.name» «q.multiplicityText»
	   	«ENDIF»
	 '''
	
	def dispatch generateFeature(DAssociation a)  '''
	'''
	
	def generateQueryParameters(DQuery q) '''«FOR p:q.parameters SEPARATOR ", "»«p.name»:«p.getType.name» «p.multiplicityText»«ENDFOR»'''
	
	def generateAssociation(DAssociation a ) {
		val targetLabel = a.name + " " + a.multiplicityText
		return switch a.kind {
			case REFERENCE: generateLink('', a.eContainer as DType, a.getType, targetLabel, '>')
			case COMPOSITE:  generateLink('*', a.eContainer as DType, a.getType, targetLabel, '>')
			case INVERSE_COMPOSITE: generateLink('}', a.eContainer as DType, a.getType, targetLabel, '*')
		}
	}
	
	def generateLink(DAttribute a) {
		val label = a.name + " " + a.multiplicityText
		return generateLink('+', a.eContainer as DType, a.getType, label, "")
	}
	
	def generateLink(String sourceArrowhead, DType source, DType target, String targetRole, String targetArrowhead) '''
		«source.aggregateName».«source.name» «sourceArrowhead»--«targetArrowhead» «getTargetName(source,target)» : «targetRole»
	'''
	
	def String getTargetName(DType source, DType target) {
		if (source.domainName == target.domainName) {
			if (source.aggregateName == target.aggregateName) return target.aggregateName + "." + target.name
			return  target.aggregateName
		}
		return target.domainName
	}

}